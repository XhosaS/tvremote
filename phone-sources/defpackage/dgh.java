package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgh extends dgg {
    @Override // defpackage.dgg
    public final int a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (cCharAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i4 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new dgi(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char cCharAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i9 = i7 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new dgi(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    @Override // defpackage.dgg
    public final String b(byte[] bArr, int i, int i2) throws der {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!dhf.d(b)) {
                break;
            }
            i++;
            dhf.b(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (dhf.d(b2)) {
                dhf.b(b2, cArr, i4);
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (dhf.d(b3)) {
                        i++;
                        dhf.b(b3, cArr, i4);
                        i4++;
                    }
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw new der("Protocol message had invalid UTF-8.");
                }
                int i6 = i4 + 1;
                i += 2;
                byte b4 = bArr[i5];
                if (b2 < -62 || dhf.c(b4)) {
                    throw new der("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) (dhf.a(b4) | ((b2 & 31) << 6));
                i4 = i6;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw new der("Protocol message had invalid UTF-8.");
                    }
                    int i7 = i4 + 1;
                    int i8 = i + 2;
                    byte b5 = bArr[i5];
                    i += 3;
                    byte b6 = bArr[i8];
                    if (!dhf.c(b5)) {
                        if (b2 == -32) {
                            if (b5 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b5 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!dhf.c(b6)) {
                            cArr[i4] = (char) ((dhf.a(b5) << 6) | ((b2 & 15) << 12) | dhf.a(b6));
                            i4 = i7;
                        }
                    }
                    throw new der("Protocol message had invalid UTF-8.");
                }
                if (i5 >= i3 - 2) {
                    throw new der("Protocol message had invalid UTF-8.");
                }
                byte b7 = bArr[i5];
                int i9 = i + 3;
                byte b8 = bArr[i + 2];
                i += 4;
                byte b9 = bArr[i9];
                if (dhf.c(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || dhf.c(b8) || dhf.c(b9)) {
                    throw new der("Protocol message had invalid UTF-8.");
                }
                int iA = (dhf.a(b7) << 12) | ((b2 & 7) << 18) | (dhf.a(b8) << 6) | dhf.a(b9);
                cArr[i4] = (char) ((iA >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((iA & 1023) + 56320);
                i4 += 2;
            }
        }
        return new String(cArr, 0, i4);
    }
}

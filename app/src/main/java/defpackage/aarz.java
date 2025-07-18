package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarz extends aarx {
    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new aary(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    private static void f(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i2, (byte) cCharAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                int iPosition2 = byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1);
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + iPosition2);
            }
        }
        if (i2 == length) {
            byteBuffer.position(iPosition + i2);
            return;
        }
        iPosition += i2;
        while (i2 < length) {
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i3 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i3;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i3;
                    int iPosition22 = byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1);
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + iPosition22);
                }
            } else {
                if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                    int i4 = i2 + 1;
                    if (i4 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i5 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    i = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i5;
                                    i2 = i4;
                                    int iPosition222 = byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1);
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + iPosition222);
                                }
                                try {
                                    byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i2 = i4;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i2 = i4;
                                    iPosition = i;
                                    int iPosition2222 = byteBuffer.position() + Math.max(i2, (iPosition - byteBuffer.position()) + 1);
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + iPosition2222);
                                }
                            } else {
                                i2 = i4;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new aary(i2, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            iPosition++;
            i2++;
        }
        byteBuffer.position(iPosition);
    }

    @Override // defpackage.aarx
    public final int a(CharSequence charSequence) {
        return e(charSequence);
    }

    @Override // defpackage.aarx
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        char[] cArr;
        int i3;
        int i4;
        int i5;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + i;
            int length = bArrArray.length;
            if ((iArrayOffset | i2 | ((length - iArrayOffset) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iArrayOffset), Integer.valueOf(i2)));
            }
            int i6 = iArrayOffset + i2;
            cArr = new char[i2];
            int i7 = 0;
            while (iArrayOffset < i6) {
                byte b = bArrArray[iArrayOffset];
                if (!aarw.d(b)) {
                    break;
                }
                iArrayOffset++;
                cArr[i7] = (char) b;
                i7++;
            }
            i3 = i7;
            while (iArrayOffset < i6) {
                int i8 = iArrayOffset + 1;
                byte b2 = bArrArray[iArrayOffset];
                if (aarw.d(b2)) {
                    cArr[i3] = (char) b2;
                    i3++;
                    iArrayOffset = i8;
                    while (iArrayOffset < i6) {
                        byte b3 = bArrArray[iArrayOffset];
                        if (aarw.d(b3)) {
                            iArrayOffset++;
                            cArr[i3] = (char) b3;
                            i3++;
                        }
                    }
                } else {
                    if (aarw.f(b2)) {
                        if (i8 >= i6) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i5 = i3 + 1;
                        iArrayOffset += 2;
                        aarw.c(b2, bArrArray[i8], cArr, i3);
                    } else if (aarw.e(b2)) {
                        if (i8 >= i6 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i5 = i3 + 1;
                        int i9 = iArrayOffset + 2;
                        iArrayOffset += 3;
                        aarw.b(b2, bArrArray[i8], bArrArray[i9], cArr, i3);
                    } else {
                        if (i8 >= i6 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b4 = bArrArray[i8];
                        int i10 = iArrayOffset + 3;
                        byte b5 = bArrArray[iArrayOffset + 2];
                        iArrayOffset += 4;
                        aarw.a(b2, b4, b5, bArrArray[i10], cArr, i3);
                        i3 += 2;
                    }
                    i3 = i5;
                }
            }
        } else {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i11 = i + i2;
            cArr = new char[i2];
            int i12 = 0;
            while (i < i11) {
                byte b6 = byteBuffer.get(i);
                if (!aarw.d(b6)) {
                    break;
                }
                i++;
                cArr[i12] = (char) b6;
                i12++;
            }
            i3 = i12;
            while (i < i11) {
                int i13 = i + 1;
                byte b7 = byteBuffer.get(i);
                if (aarw.d(b7)) {
                    cArr[i3] = (char) b7;
                    i3++;
                    i = i13;
                    while (i < i11) {
                        byte b8 = byteBuffer.get(i);
                        if (aarw.d(b8)) {
                            i++;
                            cArr[i3] = (char) b8;
                            i3++;
                        }
                    }
                } else {
                    if (aarw.f(b7)) {
                        if (i13 >= i11) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i3 + 1;
                        i += 2;
                        aarw.c(b7, byteBuffer.get(i13), cArr, i3);
                    } else if (aarw.e(b7)) {
                        if (i13 >= i11 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i3 + 1;
                        int i14 = i + 2;
                        i += 3;
                        aarw.b(b7, byteBuffer.get(i13), byteBuffer.get(i14), cArr, i3);
                    } else {
                        if (i13 >= i11 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b9 = byteBuffer.get(i13);
                        int i15 = i + 3;
                        byte b10 = byteBuffer.get(i + 2);
                        i += 4;
                        aarw.a(b7, b9, b10, byteBuffer.get(i15), cArr, i3);
                        i3 += 2;
                    }
                    i3 = i4;
                }
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // defpackage.aarx
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char cCharAt;
        if (!byteBuffer.hasArray()) {
            f(charSequence, byteBuffer);
            return;
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iRemaining = byteBuffer.remaining();
        int length = charSequence.length();
        int i4 = iRemaining + iPosition;
        int i5 = 0;
        while (i5 < length && (i3 = i5 + iPosition) < i4 && (cCharAt = charSequence.charAt(i5)) < 128) {
            bArrArray[i3] = (byte) cCharAt;
            i5++;
        }
        if (i5 == length) {
            i = iPosition + length;
        } else {
            i = iPosition + i5;
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 < 128 && i < i4) {
                    bArrArray[i] = (byte) cCharAt2;
                    i++;
                } else if (cCharAt2 < 2048 && i <= i4 - 2) {
                    bArrArray[i] = (byte) ((cCharAt2 >>> 6) | 960);
                    bArrArray[i + 1] = (byte) ((cCharAt2 & '?') | 128);
                    i += 2;
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i > i4 - 3) {
                        if (i > i4 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i2 = i5 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i2)))) {
                                throw new aary(i5, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i);
                        }
                        int i6 = i5 + 1;
                        if (i6 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i7 = i + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArrArray[i] = (byte) ((codePoint >>> 18) | 240);
                                bArrArray[i + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArrArray[i + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i += 4;
                                bArrArray[i7] = (byte) ((codePoint & 63) | 128);
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new aary(i5 - 1, length);
                    }
                    bArrArray[i] = (byte) ((cCharAt2 >>> '\f') | 480);
                    bArrArray[i + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    bArrArray[i + 2] = (byte) ((cCharAt2 & '?') | 128);
                    i += 3;
                }
                i5++;
            }
        }
        byteBuffer.position(i - iArrayOffset);
    }
}

package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zju extends zjh implements zjp {
    final byte[] a;

    public zju(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjp
    public final String b() {
        int i;
        String str = zxr.a;
        byte[] bArr = this.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = zxz.a;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                short s = zxz.a[b & Byte.MAX_VALUE];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 >= length) {
                            break loop0;
                        }
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        b2 = zxz.b[b2 + ((b3 & 255) >>> 4)];
                        i5 = (i5 << 6) | (b3 & 63);
                        i4 = i6;
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i3 < length) {
                                i = i3 + 1;
                                cArr[i3] = (char) i5;
                            }
                        } else if (i3 < length - 1) {
                            int i7 = i3 + 1;
                            cArr[i3] = (char) ((i5 >>> 10) + 55232);
                            i3 += 2;
                            cArr[i7] = (char) ((i5 & 1023) | 56320);
                            i2 = i4;
                        }
                    }
                }
                i3 = -1;
                break;
            }
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            i = i3 + 1;
            cArr[i3] = (char) b;
            i2 = i4;
            i3 = i;
        }
        if (i3 >= 0) {
            return new String(cArr, 0, i3);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 12, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zju) {
            return Arrays.equals(this.a, ((zju) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.a);
    }

    public final String toString() {
        return b();
    }

    public zju(String str) throws IOException {
        String str2 = zxr.a;
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            try {
                int length = charArray.length;
                if (i >= length) {
                    this(byteArrayOutputStream.toByteArray());
                    return;
                }
                char c = charArray[i];
                if (c < 128) {
                    byteArrayOutputStream.write(c);
                } else if (c < 2048) {
                    byteArrayOutputStream.write((c >> 6) | 192);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    byteArrayOutputStream.write((c >> '\f') | 224);
                    byteArrayOutputStream.write(((c >> 6) & 63) | 128);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else {
                    i++;
                    if (i >= length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c2 = charArray[i];
                    if (c > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i2 = ((c2 & 1023) | ((c & 1023) << 10)) + 65536;
                    byteArrayOutputStream.write((i2 >> 18) | 240);
                    byteArrayOutputStream.write(((i2 >> 12) & 63) | 128);
                    byteArrayOutputStream.write(((i2 >> 6) & 63) | 128);
                    byteArrayOutputStream.write((i2 & 63) | 128);
                }
                i++;
            } catch (IOException unused) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
    }
}

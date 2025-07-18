package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zkk extends zkl {
    private volatile zkl a;
    final zkg b;
    final Character c;

    public zkk(zkg zkgVar, Character ch) {
        this.b = zkgVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = zkgVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        yqw.F(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.zkl
    public int a(byte[] bArr, CharSequence charSequence) throws zkj {
        int i;
        CharSequence charSequenceH = h(charSequence);
        int length = charSequenceH.length();
        zkg zkgVar = this.b;
        if (!zkgVar.b(length)) {
            throw new zkj("Invalid input length " + charSequenceH.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceH.length()) {
            long jA = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zkgVar.e;
                if (i4 >= i) {
                    break;
                }
                jA <<= zkgVar.d;
                if (i2 + i4 < charSequenceH.length()) {
                    jA |= zkgVar.a(charSequenceH.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zkgVar.f;
            int i7 = i5 * zkgVar.d;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jA >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    public zkl b(zkg zkgVar, Character ch) {
        return new zkk(zkgVar, ch);
    }

    @Override // defpackage.zkl
    public void c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        yqw.K(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.f;
            i(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.zkl
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.zkl
    public final int e(int i) {
        zkg zkgVar = this.b;
        return zkgVar.e * zsz.a(i, zkgVar.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zkk) {
            zkk zkkVar = (zkk) obj;
            if (this.b.equals(zkkVar.b) && Objects.equals(this.c, zkkVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zkl
    public final zkl f() {
        zkg zkgVar;
        int length;
        boolean z;
        zkl zklVarB = this.a;
        if (zklVarB == null) {
            zkg zkgVar2 = this.b;
            int i = 0;
            while (true) {
                char[] cArr = zkgVar2.b;
                if (i >= cArr.length) {
                    zkgVar = zkgVar2;
                    break;
                }
                if (ypx.e(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        length = cArr.length;
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    yqw.M(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        cArr2[i3] = ypx.a(cArr[i3]);
                    }
                    zkgVar = new zkg(zkgVar2.a.concat(".lowerCase()"), cArr2);
                    if (zkgVar2.h && !zkgVar.h) {
                        byte[] bArr = zkgVar.g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i4] = b2;
                            } else {
                                yqw.T(b2 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i4, (char) i5);
                                bArrCopyOf[i5] = b;
                            }
                        }
                        zkgVar = new zkg(zkgVar.a.concat(".ignoreCase()"), zkgVar.b, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            zklVarB = zkgVar == zkgVar2 ? this : b(zkgVar, this.c);
            this.a = zklVarB;
        }
        return zklVarB;
    }

    @Override // defpackage.zkl
    public final zkl g() {
        return this.c == null ? this : b(this.b, null);
    }

    @Override // defpackage.zkl
    public final CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    final void i(Appendable appendable, byte[] bArr, int i, int i2) {
        yqw.K(i, i + i2, bArr.length);
        zkg zkgVar = this.b;
        int i3 = zkgVar.f;
        int i4 = 0;
        yqw.A(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zkgVar.d;
        while (i4 < i2 * 8) {
            appendable.append(zkgVar.b[zkgVar.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zkg zkgVar = this.b;
        sb.append(zkgVar);
        if (8 % zkgVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zkk(String str, String str2, Character ch) {
        this(new zkg(str, str2.toCharArray()), ch);
    }
}

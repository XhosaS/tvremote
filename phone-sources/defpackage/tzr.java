package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tzr extends tzs {
    final tzn b;
    final Character c;

    public tzr(tzn tznVar, Character ch) {
        this.b = tznVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (tznVar.f[61] != -1) {
                z = false;
            }
        }
        sij.s(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.tzs
    public int a(byte[] bArr, CharSequence charSequence) throws tzq {
        int i;
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        tzn tznVar = this.b;
        if (!tznVar.c(length)) {
            throw new tzq("Invalid input length " + charSequenceG.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceG.length()) {
            long jB = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = tznVar.d;
                if (i4 >= i) {
                    break;
                }
                jB <<= tznVar.c;
                if (i2 + i4 < charSequenceG.length()) {
                    jB |= tznVar.b(charSequenceG.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = tznVar.e;
            int i7 = i5 * tznVar.c;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jB >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // defpackage.tzs
    public void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        sij.w(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.e;
            h(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    public tzs c(tzn tznVar) {
        return new tzr(tznVar, null);
    }

    @Override // defpackage.tzs
    public final int d(int i) {
        return (int) (((this.b.c * i) + 7) / 8);
    }

    @Override // defpackage.tzs
    public final int e(int i) {
        tzn tznVar = this.b;
        return tznVar.d * udo.d(i, tznVar.e, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tzr) {
            tzr tzrVar = (tzr) obj;
            if (this.b.equals(tzrVar.b) && Objects.equals(this.c, tzrVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tzs
    public final tzs f() {
        return this.c == null ? this : c(this.b);
    }

    @Override // defpackage.tzs
    public final CharSequence g(CharSequence charSequence) {
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

    final void h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        sij.w(i, i + i2, bArr.length);
        tzn tznVar = this.b;
        int i3 = tznVar.e;
        int i4 = 0;
        a.H(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = tznVar.c;
        while (i4 < i2 * 8) {
            appendable.append(tznVar.a(tznVar.b & ((int) (j >>> ((i6 - i7) - i4)))));
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

    public final int hashCode() {
        Character ch = this.c;
        return Objects.hashCode(ch) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        tzn tznVar = this.b;
        sb.append(tznVar);
        if (8 % tznVar.c != 0) {
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

    public tzr(String str, String str2, Character ch) {
        this(new tzn(str, str2.toCharArray()), ch);
    }
}

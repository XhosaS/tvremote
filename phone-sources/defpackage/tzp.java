package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzp extends tzr {
    private tzp(tzn tznVar, Character ch) {
        super(tznVar, ch);
        a.H(tznVar.a.length == 64);
    }

    @Override // defpackage.tzr, defpackage.tzs
    public final int a(byte[] bArr, CharSequence charSequence) throws tzq {
        CharSequence charSequenceG = g(charSequence);
        int length = charSequenceG.length();
        tzn tznVar = this.b;
        if (!tznVar.c(length)) {
            throw new tzq("Invalid input length " + charSequenceG.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceG.length()) {
            int i3 = i2 + 1;
            int iB = (tznVar.b(charSequenceG.charAt(i + 1)) << 12) | (tznVar.b(charSequenceG.charAt(i)) << 18);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceG.length()) {
                int i5 = i + 3;
                int iB2 = iB | (tznVar.b(charSequenceG.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & 255);
                if (i5 < charSequenceG.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | tznVar.b(charSequenceG.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.tzr, defpackage.tzs
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        sij.w(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            tzn tznVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(tznVar.a(i7 >>> 18));
            appendable.append(tznVar.a((i7 >>> 12) & 63));
            appendable.append(tznVar.a((i7 >>> 6) & 63));
            appendable.append(tznVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            h(appendable, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.tzr
    public final tzs c(tzn tznVar) {
        return new tzp(tznVar, null);
    }

    public tzp(String str, String str2, Character ch) {
        this(new tzn(str, str2.toCharArray()), ch);
    }
}

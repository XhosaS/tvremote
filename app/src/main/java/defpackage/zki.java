package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zki extends zkk {
    private zki(zkg zkgVar, Character ch) {
        super(zkgVar, ch);
        yqw.A(zkgVar.b.length == 64);
    }

    @Override // defpackage.zkk, defpackage.zkl
    public final int a(byte[] bArr, CharSequence charSequence) throws zkj {
        CharSequence charSequenceH = h(charSequence);
        int length = charSequenceH.length();
        zkg zkgVar = this.b;
        if (!zkgVar.b(length)) {
            throw new zkj("Invalid input length " + charSequenceH.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceH.length()) {
            int i3 = i2 + 1;
            int iA = (zkgVar.a(charSequenceH.charAt(i + 1)) << 12) | (zkgVar.a(charSequenceH.charAt(i)) << 18);
            bArr[i2] = (byte) (iA >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceH.length()) {
                int i5 = i + 3;
                int iA2 = iA | (zkgVar.a(charSequenceH.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceH.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | zkgVar.a(charSequenceH.charAt(i5))) & 255);
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

    @Override // defpackage.zkk
    public final zkl b(zkg zkgVar, Character ch) {
        return new zki(zkgVar, ch);
    }

    @Override // defpackage.zkk, defpackage.zkl
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        yqw.K(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | (i4 << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.b.b;
            appendable.append(cArr[i5 >>> 18]);
            appendable.append(cArr[(i5 >>> 12) & 63]);
            appendable.append(cArr[(i5 >>> 6) & 63]);
            appendable.append(cArr[i5 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            i(appendable, bArr, i2, i - i2);
        }
    }

    public zki(String str, String str2, Character ch) {
        this(new zkg(str, str2.toCharArray()), ch);
    }
}

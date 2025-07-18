package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkh extends zkk {
    final char[] a;

    public zkh(zkg zkgVar) {
        super(zkgVar, null);
        this.a = new char[512];
        yqw.A(zkgVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.a;
            char[] cArr2 = zkgVar.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // defpackage.zkk, defpackage.zkl
    public final int a(byte[] bArr, CharSequence charSequence) throws zkj {
        if (charSequence.length() % 2 == 1) {
            throw new zkj("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zkg zkgVar = this.b;
            bArr[i2] = (byte) (zkgVar.a(charSequence.charAt(i + 1)) | (zkgVar.a(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.zkk
    public final zkl b(zkg zkgVar, Character ch) {
        return new zkh(zkgVar);
    }

    @Override // defpackage.zkk, defpackage.zkl
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        yqw.K(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }
}

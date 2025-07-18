package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzo extends tzr {
    final char[] a;

    public tzo(tzn tznVar) {
        super(tznVar, null);
        this.a = new char[512];
        a.H(tznVar.a.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = tznVar.a(i >>> 4);
            this.a[i | 256] = tznVar.a(i & 15);
        }
    }

    @Override // defpackage.tzr, defpackage.tzs
    public final int a(byte[] bArr, CharSequence charSequence) throws tzq {
        if (charSequence.length() % 2 == 1) {
            throw new tzq("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            tzn tznVar = this.b;
            bArr[i2] = (byte) (tznVar.b(charSequence.charAt(i + 1)) | (tznVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.tzr, defpackage.tzs
    public final void b(Appendable appendable, byte[] bArr, int i) throws IOException {
        sij.w(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.tzr
    public final tzs c(tzn tznVar) {
        return new tzo(tznVar);
    }
}

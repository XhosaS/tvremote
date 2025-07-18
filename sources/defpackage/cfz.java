package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfz extends cga {
    public cfz(String str, String str2, Character ch) {
        cfx cfxVar = new cfx(str, str2.toCharArray());
        super(cfxVar, ch);
        bdq.e(cfxVar.a.length == 64);
    }

    @Override // defpackage.cga
    public final void a(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        bdq.i(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            cfx cfxVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(cfxVar.a(i7 >>> 18));
            appendable.append(cfxVar.a((i7 >>> 12) & 63));
            appendable.append(cfxVar.a((i7 >>> 6) & 63));
            appendable.append(cfxVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            c(appendable, bArr, i2, i - i2);
        }
    }
}

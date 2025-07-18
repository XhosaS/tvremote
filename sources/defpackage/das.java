package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class das extends cyw {
    private final cyw[] c;

    public das(byte[] bArr, int i) {
        super(bArr, i);
        this.c = null;
    }

    static byte[] q(cyw[] cywVarArr) {
        int length = cywVarArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return cywVarArr[0].a;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if (cywVarArr[i2].a[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += r6.length - 1;
        }
        byte[] bArr = cywVarArr[i].a;
        byte b = bArr[0];
        byte[] bArr2 = new byte[length2 + bArr.length];
        bArr2[0] = b;
        int i3 = 1;
        for (cyw cywVar : cywVarArr) {
            byte[] bArr3 = cywVar.a;
            int length3 = bArr3.length - 1;
            System.arraycopy(bArr3, 1, bArr2, i3, length3);
            i3 += length3;
        }
        return bArr2;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        if (!e()) {
            int length = this.a.length;
            int i = dbn.c;
            return czz.b(z, length);
        }
        int iA = true != z ? 3 : 4;
        cyw[] cywVarArr = this.c;
        if (cywVarArr != null) {
            for (cyw cywVar : cywVarArr) {
                iA += cywVar.a(true);
            }
            return iA;
        }
        int length2 = this.a.length;
        if (length2 < 2) {
            return iA;
        }
        int i2 = dbn.c;
        int i3 = (length2 - 2) / 999;
        return iA + (czz.b(true, 1000) * i3) + czz.b(true, length2 - (i3 * 999));
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        if (!e()) {
            byte[] bArr = this.a;
            int length = bArr.length;
            int i = dbn.c;
            czzVar.k(z, 3, bArr, 0, length);
            return;
        }
        czzVar.m(z, 35);
        czzVar.f(128);
        cyw[] cywVarArr = this.c;
        if (cywVarArr != null) {
            czzVar.n(cywVarArr);
        } else {
            byte[] bArr2 = this.a;
            int length2 = bArr2.length;
            if (length2 >= 2) {
                byte b = bArr2[0];
                int i2 = length2 - 1;
                while (i2 > 999) {
                    dbn.q(czzVar, (byte) 0, bArr2, length2 - i2, 999);
                    i2 -= 999;
                }
                dbn.q(czzVar, b, bArr2, length2 - i2, i2);
            }
        }
        czzVar.f(0);
        czzVar.f(0);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return this.c != null || this.a.length > 1000;
    }

    public das(cyw[] cywVarArr) {
        super(q(cywVarArr));
        this.c = cywVarArr;
    }
}

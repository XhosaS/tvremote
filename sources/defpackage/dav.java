package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dav extends czx {
    private final czx[] d;

    public dav(byte[] bArr, czx[] czxVarArr) {
        super(bArr);
        this.d = czxVarArr;
    }

    static byte[] h(czx[] czxVarArr) {
        int length = czxVarArr.length;
        if (length == 0) {
            return a;
        }
        if (length == 1) {
            return czxVarArr[0].b;
        }
        int length2 = 0;
        for (czx czxVar : czxVarArr) {
            length2 += czxVar.b.length;
        }
        byte[] bArr = new byte[length2];
        int i = 0;
        for (czx czxVar2 : czxVarArr) {
            byte[] bArr2 = czxVar2.b;
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length3);
            i += length3;
        }
        return bArr;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        czx[] czxVarArr = this.d;
        if (czxVarArr != null) {
            for (czx czxVar : czxVarArr) {
                iA += czxVar.a(true);
            }
            return iA;
        }
        int length = this.b.length;
        int i = length / 1000;
        int iH = iA + (dbh.h(1000) * i);
        int i2 = length - (i * 1000);
        return i2 > 0 ? iH + dbh.h(i2) : iH;
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 36);
        czzVar.f(128);
        czx[] czxVarArr = this.d;
        if (czxVarArr == null) {
            int i = 0;
            while (true) {
                int length = this.b.length;
                if (i >= length) {
                    break;
                }
                int iMin = Math.min(length - i, 1000);
                czzVar.k(true, 4, this.b, i, iMin);
                i += iMin;
            }
        } else {
            czzVar.n(czxVarArr);
        }
        czzVar.f(0);
        czzVar.f(0);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return true;
    }

    public dav(czx[] czxVarArr) {
        this(h(czxVarArr), czxVarArr);
    }
}

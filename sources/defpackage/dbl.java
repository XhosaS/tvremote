package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbl extends dai {
    private int d;

    public dbl() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (czb czbVar : this.a) {
            iA += czbVar.p().k().a(true);
        }
        this.d = iA;
        return iA;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, i());
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 49);
        dbj dbjVarD = czzVar.d();
        czb[] czbVarArr = this.a;
        int length = czbVarArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            czzVar.h(i());
            while (i < length) {
                czbVarArr[i].p().k().c(dbjVarD, true);
                i++;
            }
            return;
        }
        dab[] dabVarArr = new dab[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            dab dabVarK = czbVarArr[i2].p().k();
            dabVarArr[i2] = dabVarK;
            iA += dabVarK.a(true);
        }
        this.d = iA;
        czzVar.h(iA);
        while (i < length) {
            dabVarArr[i].c(dbjVarD, true);
            i++;
        }
    }

    @Override // defpackage.dai, defpackage.dab
    public final dab k() {
        return this.b != null ? this : super.k();
    }

    public dbl(czb czbVar) {
        super(czbVar);
        this.d = -1;
    }

    public dbl(czc czcVar) {
        super(czcVar, true);
        this.d = -1;
    }

    public dbl(czb[] czbVarArr, byte[] bArr) {
        super(true, czbVarArr);
        this.d = -1;
    }

    public dbl(czb[] czbVarArr) {
        super(czbVarArr);
        this.d = -1;
    }

    @Override // defpackage.dai, defpackage.dab
    public final dab l() {
        return this;
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbt extends dai {
    private int d;

    public dbt() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (czb czbVar : this.a) {
            iA += czbVar.p().l().a(true);
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
        czb[] czbVarArr = this.a;
        dbr dbrVarE = czzVar.e();
        int length = czbVarArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            czzVar.h(i());
            while (i < length) {
                dbrVarE.p(czbVarArr[i].p());
                i++;
            }
            return;
        }
        dab[] dabVarArr = new dab[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            dab dabVarL = czbVarArr[i2].p().l();
            dabVarArr[i2] = dabVarL;
            iA += dabVarL.a(true);
        }
        this.d = iA;
        czzVar.h(iA);
        while (i < length) {
            dbrVarE.p(dabVarArr[i]);
            i++;
        }
    }

    public dbt(czc czcVar) {
        super(czcVar, false);
        this.d = -1;
    }

    public dbt(czb[] czbVarArr) {
        super(false, czbVarArr);
        this.d = -1;
    }

    public dbt(czb[] czbVarArr, czb[] czbVarArr2) {
        super(czbVarArr, czbVarArr2);
        this.d = -1;
    }

    @Override // defpackage.dai, defpackage.dab
    public final dab l() {
        return this;
    }
}

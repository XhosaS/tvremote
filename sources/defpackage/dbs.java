package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbs extends dag {
    private int c;

    public dbs() {
        this.c = -1;
    }

    private final int r() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int length = this.a.length;
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iA += this.a[i2].p().l().a(true);
        }
        this.c = iA;
        return iA;
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        return czz.b(z, r());
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.m(z, 48);
        dbr dbrVarE = czzVar.e();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            czzVar.h(r());
            while (i < length) {
                dbrVarE.p(this.a[i].p());
                i++;
            }
            return;
        }
        dab[] dabVarArr = new dab[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            dab dabVarL = this.a[i2].p().l();
            dabVarArr[i2] = dabVarL;
            iA += dabVarL.a(true);
        }
        this.c = iA;
        czzVar.h(iA);
        while (i < length) {
            dbrVarE.p(dabVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.dag
    public final cyw g() {
        return new dbn(das.q(o()));
    }

    @Override // defpackage.dag
    public final czx i() {
        return new dbh(dav.h(q()));
    }

    @Override // defpackage.dag
    public final dai n() {
        return new dbt(this.a);
    }

    public dbs(czb czbVar) {
        super(czbVar);
        this.c = -1;
    }

    public dbs(czc czcVar) {
        super(czcVar);
        this.c = -1;
    }

    public dbs(czb[] czbVarArr) {
        super(czbVarArr, null);
        this.c = -1;
    }

    @Override // defpackage.dag, defpackage.dab
    public final dab l() {
        return this;
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbk extends dag {
    private int c;

    public dbk() {
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
            iA += this.a[i2].p().k().a(true);
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
        dbj dbjVarD = czzVar.d();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            czzVar.h(r());
            while (i < length) {
                this.a[i].p().k().c(dbjVarD, true);
                i++;
            }
            return;
        }
        dab[] dabVarArr = new dab[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            dab dabVarK = this.a[i2].p().k();
            dabVarArr[i2] = dabVarK;
            iA += dabVarK.a(true);
        }
        this.c = iA;
        czzVar.h(iA);
        while (i < length) {
            dabVarArr[i].c(dbjVarD, true);
            i++;
        }
    }

    @Override // defpackage.dag
    public final cyw g() {
        return new dbd(das.q(o()), (byte[]) null);
    }

    @Override // defpackage.dag
    public final czx i() {
        return new dbh(dav.h(q()));
    }

    @Override // defpackage.dag
    public final dai n() {
        return new dbt(this.a);
    }

    public dbk(czb czbVar) {
        super(czbVar);
        this.c = -1;
    }

    public dbk(czc czcVar) {
        super(czcVar);
        this.c = -1;
    }

    public dbk(czb[] czbVarArr) {
        super(czbVarArr);
        this.c = -1;
    }

    public dbk(czb[] czbVarArr, byte[] bArr) {
        super(czbVarArr, null);
        this.c = -1;
    }

    @Override // defpackage.dag, defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.dag, defpackage.dab
    public final dab l() {
        return this;
    }
}

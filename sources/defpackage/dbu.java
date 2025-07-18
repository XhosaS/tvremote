package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbu extends dal {
    public dbu(int i, int i2, int i3, czb czbVar) {
        super(i, i2, i3, czbVar);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        dab dabVarL = this.d.p().l();
        boolean zN = n();
        int iA = dabVarL.a(zN);
        if (zN) {
            iA += czz.a(iA);
        }
        return iA + (z ? czz.c(this.c) : 0);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        dab dabVarL = this.d.p().l();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || dabVarL.e()) {
                i |= 32;
            }
            czzVar.o(i, this.c);
        }
        if (zN) {
            czzVar.h(dabVarL.a(true));
        }
        dabVarL.c(czzVar.e(), zN);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return n() || this.d.p().l().e();
    }

    @Override // defpackage.dal
    public final dag i(dab dabVar) {
        return new dbs(dabVar);
    }

    public dbu(boolean z, int i, czb czbVar) {
        super(z, i, czbVar);
    }

    @Override // defpackage.dal, defpackage.dab
    public final dab l() {
        return this;
    }
}

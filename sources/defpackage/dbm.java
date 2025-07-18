package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbm extends dal {
    public dbm(int i, int i2, int i3, czb czbVar) {
        super(i, i2, i3, czbVar);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        dab dabVarK = this.d.p().k();
        boolean zN = n();
        int iA = dabVarK.a(zN);
        if (zN) {
            iA += czz.a(iA);
        }
        return iA + (z ? czz.c(this.c) : 0);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        dab dabVarK = this.d.p().k();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || dabVarK.e()) {
                i |= 32;
            }
            czzVar.o(i, this.c);
        }
        if (zN) {
            czzVar.h(dabVarK.a(true));
        }
        dabVarK.c(czzVar.d(), zN);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return n() || this.d.p().k().e();
    }

    @Override // defpackage.dal
    public final dag i(dab dabVar) {
        return new dbk(dabVar);
    }

    public dbm(czb czbVar) {
        super(true, 0, czbVar);
    }

    public dbm(boolean z, int i, czb czbVar) {
        super(z, i, czbVar);
    }

    @Override // defpackage.dal, defpackage.dab
    public final dab k() {
        return this;
    }

    @Override // defpackage.dal, defpackage.dab
    public final dab l() {
        return this;
    }
}

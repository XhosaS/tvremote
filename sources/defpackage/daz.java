package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daz extends dal {
    public daz(int i, int i2, int i3, czb czbVar) {
        super(i, i2, i3, czbVar);
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        dab dabVarP = this.d.p();
        boolean zN = n();
        int iA = dabVarP.a(zN);
        if (zN) {
            iA += 3;
        }
        return iA + (z ? czz.c(this.c) : 0);
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        dab dabVarP = this.d.p();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || dabVarP.e()) {
                i |= 32;
            }
            czzVar.o(i, this.c);
        }
        if (!zN) {
            dabVarP.c(czzVar, false);
            return;
        }
        czzVar.f(128);
        dabVarP.c(czzVar, true);
        czzVar.f(0);
        czzVar.f(0);
    }

    @Override // defpackage.dab
    public final boolean e() {
        return n() || this.d.p().e();
    }

    @Override // defpackage.dal
    public final dag i(dab dabVar) {
        return new daw(dabVar);
    }

    public daz(czb czbVar) {
        super(true, 0, czbVar);
    }
}

package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbj extends dbr {
    public dbj(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.dbr, defpackage.czz
    public final void i(czb[] czbVarArr) {
        for (czb czbVar : czbVarArr) {
            czbVar.p().k().c(this, true);
        }
    }

    @Override // defpackage.dbr, defpackage.czz
    public final void n(dab[] dabVarArr) {
        for (dab dabVar : dabVarArr) {
            dabVar.k().c(this, true);
        }
    }

    @Override // defpackage.dbr, defpackage.czz
    public final void p(dab dabVar) {
        dabVar.k().c(this, true);
    }

    @Override // defpackage.czz
    public final dbj d() {
        return this;
    }
}

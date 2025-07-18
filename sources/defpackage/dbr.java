package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class dbr extends czz {
    public dbr(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.czz
    public void i(czb[] czbVarArr) {
        for (czb czbVar : czbVarArr) {
            czbVar.p().l().c(this, true);
        }
    }

    @Override // defpackage.czz
    public void n(dab[] dabVarArr) {
        for (dab dabVar : dabVarArr) {
            dabVar.l().c(this, true);
        }
    }

    @Override // defpackage.czz
    public void p(dab dabVar) {
        dabVar.l().c(this, true);
    }

    @Override // defpackage.czz
    public final dbr e() {
        return this;
    }
}

package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dax extends dai {
    public dax() {
    }

    @Override // defpackage.dab
    public final int a(boolean z) {
        int iA = true != z ? 3 : 4;
        for (czb czbVar : this.a) {
            iA += czbVar.p().a(true);
        }
        return iA;
    }

    @Override // defpackage.dab
    public final void c(czz czzVar, boolean z) throws IOException {
        czzVar.l(z, 49, this.a);
    }

    public dax(czc czcVar) {
        super(czcVar, false);
    }

    public dax(czb[] czbVarArr) {
        super(false, czbVarArr);
    }
}

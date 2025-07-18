package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftr implements fuj {
    final /* synthetic */ ftw a;

    public ftr(ftw ftwVar) {
        this.a = ftwVar;
    }

    @Override // defpackage.fuj
    public final void a(fuk fukVar, fug fugVar, Collection collection) {
        ftw ftwVar = this.a;
        if (fukVar != ftwVar.t || fugVar == null) {
            if (fukVar == ftwVar.e) {
                if (fugVar != null) {
                    ftwVar.a(ftwVar.d, fugVar);
                }
                fuu fuuVarJ = ftwVar.d.j();
                if (fuuVarJ != null) {
                    fuuVarJ.a(collection);
                    return;
                }
                return;
            }
            return;
        }
        fuw fuwVar = ftwVar.s.b;
        String strN = fugVar.n();
        fuu fuuVar = new fuu(fuwVar, strN, ftwVar.g(fuwVar, strN));
        fuuVar.g(fugVar);
        if (ftwVar.d == fuuVar) {
            return;
        }
        ftwVar.j(ftwVar, fuuVar, ftwVar.t, 3, true, ftwVar.s, collection);
        ftwVar.s = null;
        ftwVar.t = null;
    }
}

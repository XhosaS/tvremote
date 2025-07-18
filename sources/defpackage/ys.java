package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ys implements zh {
    final /* synthetic */ yv a;

    public ys(yv yvVar) {
        this.a = yvVar;
    }

    @Override // defpackage.zh
    public final void a(zi ziVar, zf zfVar, Collection collection) {
        yv yvVar = this.a;
        if (ziVar != yvVar.p || zfVar == null) {
            if (ziVar == yvVar.e) {
                if (zfVar != null) {
                    yvVar.a(yvVar.d, zfVar);
                }
                zr zrVarE = yvVar.d.e();
                if (zrVarE != null) {
                    zrVarE.a(collection);
                    return;
                }
                return;
            }
            return;
        }
        zt ztVar = yvVar.o.a;
        String strN = zfVar.n();
        zr zrVar = new zr(ztVar, strN, yvVar.f(ztVar, strN));
        zrVar.c(zfVar);
        if (yvVar.d == zrVar) {
            return;
        }
        yvVar.i(yvVar, zrVar, yvVar.p, 3, true, yvVar.o, collection);
        yvVar.o = null;
        yvVar.p = null;
    }
}

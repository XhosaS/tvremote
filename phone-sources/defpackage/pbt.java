package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pbt implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vtw vtwVarM = uyn.b.m();
        Iterator<T> it = new vul(((vnv) obj).c, vnv.a).iterator();
        while (it.hasNext()) {
            Object objApply = pda.a.apply((voc) it.next());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyn uynVar = (uyn) vtwVarM.b;
            objApply.getClass();
            vuj vujVar = uynVar.c;
            if (!vujVar.c()) {
                uynVar.c = vuc.q(vujVar);
            }
            uynVar.c.g(((uvu) objApply).a());
        }
        return (uyn) vtwVarM.r();
    }
}

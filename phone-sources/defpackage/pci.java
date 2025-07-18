package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pci implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vtw vtwVarM = uxm.a.m();
        Iterator<E> it = ((vlg) obj).b.iterator();
        while (it.hasNext()) {
            Object objApply = pdm.a.apply((vlh) it.next());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxm uxmVar = (uxm) vtwVarM.b;
            objApply.getClass();
            vun vunVar = uxmVar.b;
            if (!vunVar.c()) {
                uxmVar.b = vuc.s(vunVar);
            }
            uxmVar.b.add(objApply);
        }
        return (uxm) vtwVarM.r();
    }
}

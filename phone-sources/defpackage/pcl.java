package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pcl implements tsl {
    public abstract void a(vmu vmuVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vmu vmuVar = (vmu) obj;
        vtw vtwVarM = uzd.a.m();
        b(vmuVar, vtwVarM);
        if ((vmuVar.b & 4) != 0) {
            int i = vmuVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzd uzdVar = (uzd) vtwVarM.b;
            uzdVar.b |= 2;
            uzdVar.d = i;
        }
        if ((vmuVar.b & 2) != 0) {
            boolean z = vmuVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzd uzdVar2 = (uzd) vtwVarM.b;
            uzdVar2.b |= 4;
            uzdVar2.e = z;
        }
        a(vmuVar, vtwVarM);
        Iterator<E> it = vmuVar.g.iterator();
        while (it.hasNext()) {
            Object objApply = pdp.a.apply((vmt) it.next());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzd uzdVar3 = (uzd) vtwVarM.b;
            objApply.getClass();
            vun vunVar = uzdVar3.h;
            if (!vunVar.c()) {
                uzdVar3.h = vuc.s(vunVar);
            }
            uzdVar3.h.add(objApply);
        }
        if ((vmuVar.b & 16) != 0) {
            tsg tsgVar = pdp.c;
            vmq vmqVarB = vmq.b(vmuVar.h);
            if (vmqVarB == null) {
                vmqVarB = vmq.DASHER_DEVICE_FILTER_UNSPECIFIED;
            }
            uzc uzcVar = (uzc) tsgVar.convert(vmqVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzd uzdVar4 = (uzd) vtwVarM.b;
            uzdVar4.i = uzcVar.c;
            uzdVar4.b |= 64;
        }
        return (uzd) vtwVarM.r();
    }

    public abstract void b(vmu vmuVar, vtw vtwVar);
}

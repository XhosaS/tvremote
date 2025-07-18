package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lss implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vdb vdbVar = (vdb) obj;
        vtw vtwVarM = lcc.a.m();
        if ((vdbVar.b & 1) != 0) {
            tsl tslVar = lth.a;
            vcw vcwVar = vdbVar.c;
            if (vcwVar == null) {
                vcwVar = vcw.a;
            }
            Object objApply = tslVar.apply(vcwVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lcc lccVar = (lcc) vtwVarM.b;
            objApply.getClass();
            lccVar.c = (lbx) objApply;
            lccVar.b |= 1;
        }
        if ((vdbVar.b & 2) != 0) {
            tsl tslVar2 = lth.a;
            vcw vcwVar2 = vdbVar.d;
            if (vcwVar2 == null) {
                vcwVar2 = vcw.a;
            }
            Object objApply2 = tslVar2.apply(vcwVar2);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            lcc lccVar2 = (lcc) vtwVarM.b;
            objApply2.getClass();
            lccVar2.d = (lbx) objApply2;
            lccVar2.b |= 2;
        }
        return (lcc) vtwVarM.r();
    }
}

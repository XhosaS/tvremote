package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class lsu implements tsl {
    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vcy vcyVar = (vcy) obj;
        vtw vtwVarM = lbz.a.m();
        tsl tslVar = ltd.a;
        vcx vcxVarB = vcx.b(vcyVar.b);
        if (vcxVarB == null) {
            vcxVarB = vcx.UNRECOGNIZED;
        }
        Object objApply = tslVar.apply(vcxVarB);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ((lbz) vtwVarM.b).b = ((lby) objApply).a();
        int i = vcyVar.c;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((lbz) vucVar).c = i;
        int i2 = vcyVar.d;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        ((lbz) vtwVarM.b).d = i2;
        return (lbz) vtwVarM.r();
    }
}

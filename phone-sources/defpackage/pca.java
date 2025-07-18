package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pca implements tsl {
    public abstract void a(vln vlnVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vln vlnVar = (vln) obj;
        vtw vtwVarM = uxt.a.m();
        a(vlnVar, vtwVarM);
        if ((vlnVar.b & 1) != 0) {
            int i = vlnVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxt uxtVar = (uxt) vtwVarM.b;
            uxtVar.b |= 1;
            uxtVar.d = i;
        }
        if ((vlnVar.b & 2) != 0) {
            int i2 = vlnVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxt uxtVar2 = (uxt) vtwVarM.b;
            uxtVar2.b |= 2;
            uxtVar2.e = i2;
        }
        return (uxt) vtwVarM.r();
    }
}

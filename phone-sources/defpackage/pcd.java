package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pcd implements tsl {
    @Override // defpackage.tsl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uyr apply(vns vnsVar) {
        vtw vtwVarM = uyr.a.m();
        d(vnsVar, vtwVarM);
        if ((vnsVar.b & 1) != 0) {
            boolean z = vnsVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyr uyrVar = (uyr) vtwVarM.b;
            uyrVar.b |= 4;
            uyrVar.f = z;
        }
        f(vnsVar, vtwVarM);
        g(vnsVar, vtwVarM);
        h(vnsVar, vtwVarM);
        e(vnsVar, vtwVarM);
        c(vnsVar, vtwVarM);
        if ((vnsVar.b & 2) != 0) {
            tsl tslVar = pdj.a;
            vnr vnrVarB = vnr.b(vnsVar.f);
            if (vnrVarB == null) {
                vnrVarB = vnr.UI_THEME_UNSPECIFIED;
            }
            Object objApply = tslVar.apply(vnrVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyr uyrVar2 = (uyr) vtwVarM.b;
            uyrVar2.g = ((uyp) objApply).c;
            uyrVar2.b |= 8;
        }
        b(vnsVar, vtwVarM);
        return (uyr) vtwVarM.r();
    }

    public abstract void b(vns vnsVar, vtw vtwVar);

    public abstract void c(vns vnsVar, vtw vtwVar);

    public abstract void d(vns vnsVar, vtw vtwVar);

    public abstract void e(vns vnsVar, vtw vtwVar);

    public abstract void f(vns vnsVar, vtw vtwVar);

    public abstract void g(vns vnsVar, vtw vtwVar);

    public abstract void h(vns vnsVar, vtw vtwVar);
}

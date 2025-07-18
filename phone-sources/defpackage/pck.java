package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pck implements tsl {
    public abstract void a(vny vnyVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vny vnyVar = (vny) obj;
        vtw vtwVarM = uzb.a.m();
        d(vnyVar, vtwVarM);
        e(vnyVar, vtwVarM);
        k(vnyVar, vtwVarM);
        b(vnyVar, vtwVarM);
        j(vnyVar, vtwVarM);
        f(vnyVar, vtwVarM);
        c(vnyVar, vtwVarM);
        if ((vnyVar.b & 4) != 0) {
            g(vnyVar, vtwVarM);
        }
        h(vnyVar, vtwVarM);
        a(vnyVar, vtwVarM);
        if ((vnyVar.b & 2) != 0) {
            tsg tsgVar = pdo.b;
            vnx vnxVarB = vnx.b(vnyVar.d);
            if (vnxVarB == null) {
                vnxVarB = vnx.PLACEMENT_UNSPECIFIED;
            }
            uza uzaVar = (uza) tsgVar.convert(vnxVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uzb uzbVar = (uzb) vtwVarM.b;
            uzbVar.l = uzaVar.d;
            uzbVar.b |= 64;
        }
        i(vnyVar, vtwVarM);
        return (uzb) vtwVarM.r();
    }

    public abstract void b(vny vnyVar, vtw vtwVar);

    public abstract void c(vny vnyVar, vtw vtwVar);

    public abstract void d(vny vnyVar, vtw vtwVar);

    public abstract void e(vny vnyVar, vtw vtwVar);

    public abstract void f(vny vnyVar, vtw vtwVar);

    public void g(vny vnyVar, vtw vtwVar) {
        throw null;
    }

    public abstract void h(vny vnyVar, vtw vtwVar);

    public abstract void i(vny vnyVar, vtw vtwVar);

    public abstract void j(vny vnyVar, vtw vtwVar);

    public abstract void k(vny vnyVar, vtw vtwVar);
}

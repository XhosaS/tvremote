package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pcc implements tsl {
    public abstract void a(vnq vnqVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vnq vnqVar = (vnq) obj;
        vtw vtwVarM = uyy.a.m();
        e(vnqVar, vtwVarM);
        g(vnqVar, vtwVarM);
        o(vnqVar, vtwVarM);
        b(vnqVar, vtwVarM);
        i(vnqVar, vtwVarM);
        j(vnqVar, vtwVarM);
        n(vnqVar, vtwVarM);
        m(vnqVar, vtwVarM);
        d(vnqVar, vtwVarM);
        k(vnqVar, vtwVarM);
        l(vnqVar, vtwVarM);
        f(vnqVar, vtwVarM);
        h(vnqVar, vtwVarM);
        c(vnqVar, vtwVarM);
        a(vnqVar, vtwVarM);
        if ((vnqVar.b & 8) != 0) {
            tsg tsgVar = pdi.b;
            vnp vnpVarB = vnp.b(vnqVar.f);
            if (vnpVarB == null) {
                vnpVarB = vnp.PULSE_ANIMATION_TYPE_UNSPECIFIED;
            }
            uyx uyxVar = (uyx) tsgVar.convert(vnpVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyy uyyVar = (uyy) vtwVarM.b;
            uyyVar.q = uyxVar.c;
            uyyVar.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if ((vnqVar.b & 32) != 0) {
            float f = vnqVar.g;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyy uyyVar2 = (uyy) vtwVarM.b;
            uyyVar2.b |= 8192;
            uyyVar2.r = f;
        }
        if ((vnqVar.b & 64) != 0) {
            boolean z = vnqVar.h;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyy uyyVar3 = (uyy) vtwVarM.b;
            uyyVar3.b |= 16384;
            uyyVar3.s = z;
        }
        return (uyy) vtwVarM.r();
    }

    public abstract void b(vnq vnqVar, vtw vtwVar);

    public abstract void c(vnq vnqVar, vtw vtwVar);

    public abstract void d(vnq vnqVar, vtw vtwVar);

    public abstract void e(vnq vnqVar, vtw vtwVar);

    public abstract void f(vnq vnqVar, vtw vtwVar);

    public abstract void g(vnq vnqVar, vtw vtwVar);

    public abstract void h(vnq vnqVar, vtw vtwVar);

    public abstract void i(vnq vnqVar, vtw vtwVar);

    public abstract void j(vnq vnqVar, vtw vtwVar);

    public abstract void k(vnq vnqVar, vtw vtwVar);

    public abstract void l(vnq vnqVar, vtw vtwVar);

    public abstract void m(vnq vnqVar, vtw vtwVar);

    public abstract void n(vnq vnqVar, vtw vtwVar);

    public abstract void o(vnq vnqVar, vtw vtwVar);
}

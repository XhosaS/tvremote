package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjr {
    public final tsl a;
    public final pkg c;
    private final pke f;
    private final vtw g;
    private pjz d = pju.a;
    private pju e = null;
    public final vty b = (vty) pka.a.m();

    public pjr(ntp ntpVar, tsl tslVar, pkg pkgVar, pke pkeVar) {
        this.g = (vtw) ntpVar.a;
        h(((ucy) ((vtw) ntpVar.a).b).d);
        this.a = tslVar;
        this.c = pkgVar;
        this.f = pkeVar;
    }

    private final void h(int i) {
        vty vtyVar = this.b;
        long j = ((pka) vtyVar.b).g + i;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        pka pkaVar = (pka) vtyVar.b;
        pkaVar.b |= 8;
        pkaVar.g = j;
    }

    private final void i(int i) {
        vty vtyVar = this.b;
        long j = ((pka) vtyVar.b).h + i;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        pka pkaVar = (pka) vtyVar.b;
        pkaVar.b |= 16;
        pkaVar.h = j;
    }

    @Deprecated
    public final void a(View view) {
        pke pkeVar = this.f;
        pkeVar.getClass();
        pkeVar.e(view, this);
    }

    @Deprecated
    public final void b(View view) {
        pke pkeVar = this.f;
        pkeVar.getClass();
        pkeVar.c(view, this);
    }

    @Deprecated
    public final void c(Activity activity) {
        pke pkeVar = this.f;
        pkeVar.getClass();
        pkeVar.d(activity, this);
    }

    public final void d(pjs pjsVar) {
        pju pjuVar = this.e;
        sij.z(pjuVar == null, "CVE %s has already been built.", pjuVar);
        vty vtyVar = this.b;
        ucy ucyVar = ((pka) vtyVar.b).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        a.ab(!((ucyVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0));
        vvd vvdVar = pjsVar.b;
        if (!vtyVar.bJ(vvdVar)) {
            int iA = vvdVar.a();
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            pka pkaVar = (pka) vtyVar.b;
            vuj vujVar = pkaVar.c;
            if (!vujVar.c()) {
                pkaVar.c = vuc.q(vujVar);
            }
            pkaVar.c.g(iA);
        }
        Object obj = pjsVar.a;
        vtyVar.bL(vvdVar, obj);
        h(vvdVar.a());
        h(vvdVar.hashCode());
        h(obj.hashCode());
    }

    public final void e(pjt pjtVar) {
        pju pjuVar = this.e;
        sij.z(pjuVar == null, "CVE %s has already been built.", pjuVar);
        vvd vvdVar = pjtVar.b;
        Object obj = pjtVar.a;
        this.b.bL(vvdVar, obj);
        i(vvdVar.a());
        i(vvdVar.hashCode());
        i(obj.hashCode());
    }

    public final void f(pjz pjzVar) {
        pju pjuVar = this.e;
        sij.z(pjuVar == null, "CVE %s has already been built.", pjuVar);
        this.d = pjzVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    public final pju g(pkg pkgVar) {
        sij.x(this.e == null, "Cannot create CVE twice.");
        vty vtyVar = this.b;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        vtw vtwVar = this.g;
        pka pkaVar = (pka) vtyVar.b;
        ucy ucyVar = (ucy) vtwVar.r();
        pka pkaVar2 = pka.a;
        ucyVar.getClass();
        pkaVar.d = ucyVar;
        pkaVar.b = 1 | pkaVar.b;
        pka pkaVar3 = (pka) vtyVar.r();
        vtw vtwVar2 = (vtw) pkaVar3.a(5, null);
        vtwVar2.x(pkaVar3);
        pju pjuVar = new pju((vty) vtwVar2, this.d, pkgVar);
        this.e = pjuVar;
        ?? r6 = pjuVar.f.a;
        if (!r6.isEmpty()) {
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                if (!((pkv) ((pku) it.next()).a).d) {
                    sjl.c();
                }
            }
        }
        return this.e;
    }
}

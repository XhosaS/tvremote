package defpackage;

import android.app.Activity;
import android.view.View;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jag implements jaf {
    private final pkg a;
    private final pke b;
    private final pjx c;
    private final ieh d;
    private final nqq e;

    public jag(pkg pkgVar, pke pkeVar, pjx pjxVar, nqq nqqVar, ieh iehVar) {
        pkgVar.getClass();
        pkeVar.getClass();
        nqqVar.getClass();
        this.a = pkgVar;
        this.b = pkeVar;
        this.c = pjxVar;
        this.e = nqqVar;
        this.d = iehVar;
    }

    public static final vsz j(wmc wmcVar) {
        wmcVar.getClass();
        if (kys.b(wmcVar.b)) {
            return vsz.q(kys.a(wmcVar.b).b);
        }
        return null;
    }

    private final void k(View view, jad jadVar) {
        pjr pjrVarA = this.a.a(jadVar.a);
        long j = jadVar.b;
        if (j != -1) {
            pjrVarA.d(qtl.ai(j));
        }
        int i = jadVar.c;
        if (i != -1) {
            pjrVarA.d(rdd.ac(i));
        }
        pjs pjsVarA = jadVar.a();
        if (pjsVarA != null) {
            pjrVarA.d(pjsVarA);
        }
        this.b.e(view, pjrVarA);
    }

    @Override // defpackage.jaf
    public final void a(View view, jad jadVar, Map map) {
        view.getClass();
        map.getClass();
        k(view, jadVar);
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            jad jadVar2 = (jad) entry.getValue();
            View viewFindViewById = view.findViewById(iIntValue);
            if (viewFindViewById != null) {
                View viewFindViewById2 = viewFindViewById.findViewById(iIntValue);
                viewFindViewById2.getClass();
                k(viewFindViewById2, jadVar2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jaf
    public final void b(View view, ixh ixhVar, scf scfVar, Map map) throws vuq {
        if (ixhVar.b().c <= 0) {
            return;
        }
        pke pkeVar = this.b;
        pjr pjrVarA = this.a.a(ixhVar.b().c);
        pjrVarA.d(qtl.ai(Objects.hash(ixhVar.d())));
        scl sclVar = scfVar instanceof scl ? (scl) scfVar : null;
        if (sclVar != null) {
            pjrVarA.d(rdd.ac(sclVar.b()));
        }
        vvd vvdVar = nbu.b;
        vtw vtwVarM = nbs.a.m();
        vtwVarM.getClass();
        vsz vszVarJ = j(ixhVar.b());
        if (vszVarJ != null) {
            jys.Z(vszVarJ, vtwVarM);
        }
        vtw vtwVarM2 = ubz.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = uca.a.m();
        vtwVarM3.getClass();
        ubt ubtVar = ixhVar.b().d;
        if (ubtVar == null) {
            ubtVar = ubt.a;
        }
        ubtVar.getClass();
        tyq.f(ubtVar, vtwVarM3);
        if (vszVarJ != null) {
            wjc wjcVar = wjc.a;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vte vteVarK = vszVarJ.k();
            vuc vucVarO = wjcVar.o();
            try {
                vvy vvyVarB = vvs.a.b(vucVarO);
                vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVar2);
                vvyVarB.g(vucVarO);
                vteVarK.z(0);
                vuc.B(vucVarO);
                vuc.B(vucVarO);
                wjc wjcVar2 = (wjc) vucVarO;
                wjcVar2.getClass();
                tyq.e(wjcVar2, vtwVarM3);
            } catch (vwf e) {
                throw e.a();
            } catch (RuntimeException e2) {
                if (!(e2.getCause() instanceof vuq)) {
                    throw e2;
                }
                throw ((vuq) e2.getCause());
            } catch (vuq e3) {
                if (!e3.a) {
                    throw e3;
                }
                throw new vuq(e3);
            } catch (IOException e4) {
                if (!(e4.getCause() instanceof vuq)) {
                    throw new vuq(e4);
                }
                throw ((vuq) e4.getCause());
            }
        }
        tyq.i(tyq.d(vtwVarM3), vtwVarM2);
        jys.Y(tyq.g(vtwVarM2), vtwVarM);
        pjrVarA.d(new pjs(vvdVar, jys.X(vtwVarM)));
        pkeVar.e(view, pjrVarA);
        for (Map.Entry entry : map.entrySet()) {
            this.b.e(view.findViewById(((Number) entry.getKey()).intValue()), this.a.a(((Number) entry.getValue()).intValue()));
        }
    }

    @Override // defpackage.jaf
    public final void c(View view) {
        view.getClass();
        this.c.a(pjw.b(), view);
    }

    @Override // defpackage.jaf
    public final void d(View view, pjw pjwVar) {
        this.c.a(pjwVar, view);
    }

    @Override // defpackage.jaf
    public final void e(Activity activity, jad jadVar) {
        ieg iegVarA = ((ldy) this.d).a();
        iegVarA.getClass();
        pjt pjtVarZ = iegVarA.m() ? rdd.Z(((ksn) iegVarA.g()).a) : rdd.ab();
        pke pkeVar = this.b;
        pjr pjrVarA = this.a.a(jadVar.a);
        pjrVarA.f(pju.b);
        pjrVarA.e(pjtVarZ);
        vtw vtwVarM = nbt.a.m();
        long jB = this.e.b();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        nbt nbtVar = (nbt) vtwVarM.b;
        nbtVar.b |= 1;
        nbtVar.c = jB;
        pjrVarA.e(qtl.ag((nbt) vtwVarM.r()));
        pjs pjsVarA = jadVar.a();
        if (pjsVarA != null) {
            pjrVarA.d(pjsVarA);
        }
        pkeVar.d(activity, pjrVarA);
    }

    @Override // defpackage.jaf
    public final void f(View view, boolean z) {
        ntp ntpVar = new ntp(4);
        ntpVar.v(pjw.a(z));
        this.c.a(ntpVar.u(), view);
    }

    @Override // defpackage.jaf
    public final void g(View view, List list) {
        view.getClass();
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                this.b.a(view.findViewById(((Number) it.next()).intValue()));
            } catch (Exception e) {
                krd.c("Unable unbind Component View. ".concat(String.valueOf(e.getMessage())));
            }
        }
        try {
            this.b.a(view);
        } catch (Exception e2) {
            krd.c("Unable unbind Component View. ".concat(String.valueOf(e2.getMessage())));
        }
    }

    @Override // defpackage.jaf
    public final void h(View view, ixh ixhVar, List list) {
        if (ixhVar.b().c <= 0) {
            return;
        }
        g(view, list);
    }

    @Override // defpackage.jaf
    public final void i(View view, wmc wmcVar) throws vuq {
        wmcVar.getClass();
        int i = wmcVar.c;
        if (i <= 0) {
            return;
        }
        pke pkeVar = this.b;
        pjr pjrVarA = this.a.a(i);
        vvd vvdVar = nbu.b;
        vtw vtwVarM = nbs.a.m();
        vtwVarM.getClass();
        vsz vszVarJ = j(wmcVar);
        if (vszVarJ != null) {
            jys.Z(vszVarJ, vtwVarM);
        }
        vtw vtwVarM2 = ubz.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = uca.a.m();
        vtwVarM3.getClass();
        ubt ubtVar = wmcVar.d;
        if (ubtVar == null) {
            ubtVar = ubt.a;
        }
        ubtVar.getClass();
        tyq.f(ubtVar, vtwVarM3);
        if (vszVarJ != null) {
            wjc wjcVar = wjc.a;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vte vteVarK = vszVarJ.k();
            vuc vucVarO = wjcVar.o();
            try {
                vvy vvyVarB = vvs.a.b(vucVarO);
                vvyVarB.l(vucVarO, vtf.p(vteVarK), vtpVar2);
                vvyVarB.g(vucVarO);
                vteVarK.z(0);
                vuc.B(vucVarO);
                vuc.B(vucVarO);
                wjc wjcVar2 = (wjc) vucVarO;
                wjcVar2.getClass();
                tyq.e(wjcVar2, vtwVarM3);
            } catch (vuq e) {
                if (!e.a) {
                    throw e;
                }
                throw new vuq(e);
            } catch (IOException e2) {
                if (!(e2.getCause() instanceof vuq)) {
                    throw new vuq(e2);
                }
                throw ((vuq) e2.getCause());
            } catch (vwf e3) {
                throw e3.a();
            } catch (RuntimeException e4) {
                if (!(e4.getCause() instanceof vuq)) {
                    throw e4;
                }
                throw ((vuq) e4.getCause());
            }
        }
        tyq.i(tyq.d(vtwVarM3), vtwVarM2);
        jys.Y(tyq.g(vtwVarM2), vtwVarM);
        pjrVarA.d(new pjs(vvdVar, jys.X(vtwVarM)));
        pkeVar.e(view, pjrVarA);
    }
}

package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjh implements rjg {
    private final pnl a;
    private final tst b;
    private final ttm c;
    private final vvd d;

    public rjh(qth qthVar, qvh qvhVar, pnl pnlVar, tst tstVar, ttm ttmVar) {
        this.a = pnlVar;
        this.b = tstVar;
        this.c = ttmVar;
        this.d = new vvd(this, new tko(this, pnlVar, null), qthVar, qvhVar);
    }

    private final pjr h(int i) {
        return g(i, trk.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qvh] */
    @Override // defpackage.rjg
    public final void a(View view, int i) {
        sjl.c();
        vvd vvdVar = this.d;
        riy riyVar = new riy(vvdVar, view, i);
        view.addOnAttachStateChangeListener(riyVar);
        vvdVar.g(view, i, vvdVar.d.a());
        int[] iArr = cww.a;
        if (view.isAttachedToWindow()) {
            riyVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.rjg
    public final void b(View view, int i) {
        sjl.c();
        this.a.b().e(view, h(i));
    }

    @Override // defpackage.rjg
    public final void c(View view, int i) {
        sjl.c();
        this.a.b().c(view, h(i));
    }

    @Override // defpackage.rjg
    public final void d(View view, int i, pjs pjsVar) {
        sjl.c();
        pke pkeVarB = this.a.b();
        pjr pjrVarH = h(i);
        pjrVarH.d(pjsVar);
        pkeVarB.e(view, pjrVarH);
    }

    @Override // defpackage.rjg
    public final void e(View view) {
        sjl.c();
        this.a.b().a(view);
    }

    @Override // defpackage.rjg
    public final void f(ntp ntpVar, View view) {
        tst tstVar = this.b;
        if (tstVar.g()) {
            ntpVar.v(((rjj) tstVar.c()).b());
        }
        pjx pjxVarA = this.a.a();
        pjv pjvVar = (pjv) view.getTag(R.id.interaction_info_tag);
        if (pjvVar != null) {
            ntpVar.v(pjvVar);
            view.setTag(R.id.interaction_info_tag, null);
        }
        pjxVarA.a(ntpVar.u(), view);
    }

    public final pjr g(int i, tst tstVar) {
        pjt pjtVarZ;
        pjr pjrVarA = this.a.c().a(i);
        tst tstVar2 = this.b;
        if (tstVar2.g()) {
            pjrVarA.d(((rjj) tstVar2.c()).a());
        }
        pjt pjtVar = (pjt) this.c.get();
        if (pjtVar != null) {
            pjrVarA.e(pjtVar);
            return pjrVarA;
        }
        if (tstVar.g()) {
            riw riwVar = (riw) tstVar.c();
            if (riwVar.b - 1 != 0) {
                pjtVarZ = rdd.Y();
            } else {
                String str = riwVar.a;
                str.getClass();
                pjtVarZ = rdd.Z(str);
            }
            pjrVarA.e(pjtVarZ);
        }
        return pjrVarA;
    }
}

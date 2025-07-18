package defpackage;

import android.view.View;
import com.google.android.apps.play.movies.mobileux.screen.details.actionpanel.ActionPanelView;
import com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorsView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mxj implements icv {
    public final /* synthetic */ pkg a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mxj(Object obj, pkg pkgVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = pkgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ieh, java.lang.Object] */
    @Override // defpackage.icv
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            mxo mxoVar = (mxo) obj;
            View view = (View) obj2;
            ((DistributorsView) view).a(mxoVar);
            lif lifVar = new lif(403, (lio) this.b.a());
            if (mxoVar.e.m()) {
                lifVar.a.d(lifVar.b);
                return;
            }
            if (mxoVar.d) {
                lifVar.d(liq.e(514));
            }
            pkg pkgVar = this.a;
            kuf kufVar = mxoVar.c.a;
            wji wjiVarM = liq.m(kufVar);
            pke pkeVar = (pke) pkgVar.b;
            pjr pjrVarB = pkeVar.b(109942);
            pjrVarB.d(qtl.af(wjiVarM, vsz.b));
            pjrVarB.a(view.findViewById(R.id.current_distributor_container));
            lifVar.d(liq.g(609, kufVar));
            pkeVar.b(109945).a(view.findViewById(R.id.current_distributor));
            return;
        }
        if (i != 1) {
            if (i == 2) {
                View view2 = (View) obj2;
                ((nbo) view2).a((myz) obj);
                this.b.d(liq.e(523));
                ((pke) this.a.b).b(114338).a(view2);
                return;
            }
            mzl mzlVar = (mzl) obj;
            View view3 = (View) obj2;
            ((nbo) view3).a(mzlVar);
            kwl kwlVar = mzlVar.c.a;
            pkg pkgVar2 = this.a;
            wji wjiVarP = liq.p(kwlVar.d);
            pjr pjrVarB2 = ((pke) pkgVar2.b).b(109946);
            pjrVarB2.d(qtl.af(wjiVarP, vsz.b));
            pjrVarB2.a(view3);
            this.b.d(liq.i(608, kwlVar));
            return;
        }
        mwu mwuVar = (mwu) obj;
        nbo nboVar = (nbo) ((View) obj2);
        mwv mwvVar = mwuVar.a;
        ActionPanelView actionPanelView = (ActionPanelView) nboVar;
        View viewFindViewById = actionPanelView.findViewById(R.id.primary_action);
        pkg pkgVar3 = this.a;
        mnu.A(mwvVar, pkgVar3, viewFindViewById);
        nboVar.a(mwuVar);
        ?? r7 = this.b;
        ((lio) r7.a()).d(mwvVar.c.c());
        tst tstVar = mwuVar.b;
        if (tstVar.g()) {
            mnu.A((mwv) tstVar.c(), pkgVar3, actionPanelView.findViewById(R.id.secondary_action));
            ((lio) r7.a()).d(((mwv) tstVar.c()).c.c());
        }
    }

    public /* synthetic */ mxj(pkg pkgVar, lio lioVar, int i) {
        this.c = i;
        this.a = pkgVar;
        this.b = lioVar;
    }
}

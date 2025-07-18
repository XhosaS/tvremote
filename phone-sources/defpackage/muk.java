package defpackage;

import android.view.View;
import com.google.android.apps.play.movies.mobileux.component.assetcard.AssetCardView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class muk implements icv {
    private final lis a;

    public muk(lis lisVar) {
        this.a = lisVar;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        muj mujVar = (muj) obj;
        View view = (View) obj2;
        a.H(view instanceof AssetCardView);
        ((AssetCardView) view).a(mujVar);
        lio lioVar = mujVar.a;
        lif lifVar = (lif) lioVar;
        lifVar.a.d(lifVar.b);
        Optional optional = mujVar.k;
        if (optional.isPresent()) {
            wji wjiVarP = liq.p(mujVar.c);
            pjr pjrVarB = ((pke) ((pkg) optional.get()).b).b(107517);
            pjrVarB.d(qtl.af(wjiVarP, vsz.q(mujVar.b.b)));
            pjrVarB.b(view);
        }
        view.setOnClickListener(new kaj((Object) this.a, (Object) mujVar, (Object) lioVar, 2, (byte[]) null));
    }
}

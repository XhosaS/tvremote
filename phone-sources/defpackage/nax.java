package defpackage;

import android.view.View;
import com.google.android.apps.play.movies.mobileux.screen.details.header.HeaderView;
import com.google.android.apps.play.movies.mobileux.screen.player.infocards.actors.filmography.ActorFilmographyView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nax implements icv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nax(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, lio] */
    @Override // defpackage.icv
    public final void a(Object obj, Object obj2) {
        int i = 4;
        if (this.d != 0) {
            myr myrVar = (myr) obj;
            HeaderView headerView = (HeaderView) ((View) obj2);
            headerView.a(myrVar);
            tst tstVar = myrVar.b;
            if (tstVar.g()) {
                Object obj3 = this.c;
                Object obj4 = this.b;
                ?? r4 = this.a;
                lif lifVar = new lif(liq.r((ksy) tstVar.c()), (lio) r4);
                r4.d(lifVar.b);
                ((pke) ((pkg) obj4).b).b(109826).a(headerView.findViewById(R.id.trailer_button));
                headerView.a.setOnClickListener(new kaj((pjx) obj3, myrVar, (lio) lifVar, i));
                return;
            }
            return;
        }
        nba nbaVar = (nba) obj;
        View view = (View) obj2;
        if (view instanceof ActorFilmographyView) {
            Object obj5 = this.c;
            ?? r2 = this.b;
            ActorFilmographyView actorFilmographyView = (ActorFilmographyView) view;
            saf safVar = (saf) r2.h((rzy) obj5).a(wgi.FILMOGRAPHY_CARD);
            vtw vtwVarM = wge.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wge wgeVar = (wge) vucVar;
            wgeVar.e = 4;
            wgeVar.b = 4 | wgeVar.b;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wge wgeVar2 = (wge) vucVar2;
            wgeVar2.d = 6;
            wgeVar2.b |= 2;
            String str = nbaVar.b.b;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            Object obj6 = this.a;
            wge wgeVar3 = (wge) vtwVarM.b;
            wgeVar3.b |= 1;
            wgeVar3.c = str;
            safVar.a = (wge) vtwVarM.r();
            rzy rzyVar = (rzy) safVar.e();
            sal salVar = (sal) r2.k(rzyVar).a(wgi.WATCHLIST_BUTTON);
            salVar.d(nbaVar.e);
            rzy rzyVar2 = (rzy) salVar.e();
            actorFilmographyView.b = rzyVar;
            actorFilmographyView.c = rzyVar2;
            actorFilmographyView.d = (jys) obj6;
            actorFilmographyView.a(nbaVar);
        }
    }
}

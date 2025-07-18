package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.details.MovieExtraClusterItemView;
import com.google.android.apps.play.movies.mobileux.screen.details.episodes.EpisodeView;
import com.google.android.apps.play.movies.mobileux.screen.details.similarassets.AssetCardRowView;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mnn implements icv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mnn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [icv, java.lang.Object] */
    @Override // defpackage.icv
    public final void a(Object obj, Object obj2) throws Resources.NotFoundException {
        int i = this.b;
        if (i == 0) {
            ((mip) this.a).a((kum) obj, (View) obj2);
            return;
        }
        if (i == 1) {
            this.a.a((kvf) obj, (MovieExtraClusterItemView) ((View) obj2));
            return;
        }
        if (i == 2) {
            ((Runnable) ((ieg) ((mwo) this.a).a.a()).g()).run();
            return;
        }
        if (i == 3) {
            mxs mxsVar = (mxs) obj;
            View view = (View) obj2;
            EpisodeView episodeView = (EpisodeView) view;
            episodeView.a(mxsVar);
            wji wjiVarP = liq.p(mxsVar.k.c);
            pke pkeVar = (pke) ((pkg) ((paq) this.a).d).b;
            pjr pjrVarB = pkeVar.b(107517);
            pjrVarB.d(qtl.af(wjiVarP, vsz.b));
            pjrVarB.d(qtl.ai(r12.c.hashCode()));
            pjrVarB.b(view);
            pkeVar.b(109920).a(episodeView.findViewById(R.id.episode_play_button));
            return;
        }
        mzp mzpVar = (mzp) obj;
        AssetCardRowView assetCardRowView = (AssetCardRowView) ((View) obj2);
        assetCardRowView.a(mzpVar);
        UnmodifiableIterator it = mzpVar.c.iterator();
        while (it.hasNext()) {
            Object obj3 = this.a;
            lif lifVar = (lif) ((muj) it.next()).a;
            lifVar.a.d(lifVar.b);
            if (obj3 != null) {
                String str = mzpVar.b;
                kys kysVar = mzpVar.e;
                vtw vtwVarM = wji.a.m();
                vtw vtwVarM2 = wik.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                wik wikVar = (wik) vucVar;
                str.getClass();
                wikVar.b |= 4;
                wikVar.e = str;
                wij wijVar = wij.CONTAINER;
                if (!vucVar.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar2 = vtwVarM2.b;
                wik wikVar2 = (wik) vucVar2;
                wikVar2.c = wijVar.q;
                wikVar2.b |= 1;
                wii wiiVar = wii.YOUTUBE_ID;
                if (!vucVar2.A()) {
                    vtwVarM2.u();
                }
                wik wikVar3 = (wik) vtwVarM2.b;
                wikVar3.d = wiiVar.h;
                wikVar3.b |= 2;
                wik wikVar4 = (wik) vtwVarM2.r();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wji wjiVar = (wji) vtwVarM.b;
                wikVar4.getClass();
                wjiVar.c = wikVar4;
                wjiVar.b |= 1;
                wji wjiVar2 = (wji) vtwVarM.r();
                pjr pjrVarB2 = ((pke) ((pkg) obj3).b).b(108469);
                pjrVarB2.d(qtl.af(wjiVar2, vsz.q(kysVar.b)));
                pjrVarB2.b(assetCardRowView);
            }
        }
    }
}

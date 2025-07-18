package defpackage;

import android.view.Window;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcf implements eam {
    final /* synthetic */ jcm a;

    public jcf(jcm jcmVar) {
        this.a = jcmVar;
    }

    @Override // defpackage.eam
    public final void dd(boolean z) {
        Window window;
        Window window2;
        if (z) {
            by activity = this.a.getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                window2.addFlags(128);
            }
        } else {
            by activity2 = this.a.getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.clearFlags(128);
            }
        }
        this.a.i();
    }

    @Override // defpackage.eam
    public final void n(int i) {
        if (i == 1) {
            ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 213, "TrailerPlayerFragment.kt")).s("Playback state: Idle");
        } else if (i == 2) {
            jcm jcmVar = this.a;
            jbr.e(true, jcmVar.u);
            jbr.e(true, jcmVar.p);
            ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 205, "TrailerPlayerFragment.kt")).s("Playback state: Buffering...");
        } else if (i != 3) {
            ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 216, "TrailerPlayerFragment.kt")).s("Playback state: Ended");
            jcm jcmVar2 = this.a;
            if (jcmVar2.n != 4) {
                jcmVar2.q().v(jcmVar2.a(null));
                by activity = jcmVar2.getActivity();
                if (activity != null) {
                    activity.finishAndRemoveTask();
                }
            }
        } else {
            jcm jcmVar3 = this.a;
            jbr.e(false, jcmVar3.u);
            jbr.e(false, jcmVar3.p);
            ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 210, "TrailerPlayerFragment.kt")).s("Playback state: Ready");
        }
        this.a.n = i;
    }

    @Override // defpackage.eam
    public final void p(eah eahVar) {
        String string;
        eahVar.getClass();
        ((tug) ((tug) jcm.a.f().h(tvo.a, "[GTVM-Kinetoscope]")).i(eahVar).j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$playerEventListener$1", "onPlayerError", 171, "TrailerPlayerFragment.kt")).s("Playback Error");
        otv otvVarC = jbr.c(eahVar);
        if (otvVarC != null) {
            jcm jcmVar = this.a;
            oty otyVar = otvVarC.a;
            jcmVar.q().w(jcmVar.a((wdq) PlayerActivity.r.get(otyVar.a)));
            string = jbr.b(otyVar, jcmVar.requireContext());
        } else if (eahVar.g == 2001) {
            string = this.a.getString(R.string.no_network);
            string.getClass();
        } else {
            string = this.a.getString(R.string.error_generic);
            string.getClass();
        }
        pku pkuVar = this.a.C;
        if (pkuVar != null) {
            int i = eahVar.g;
            pkuVar.f(string, i == 2001, i != 2001);
        }
    }

    @Override // defpackage.eam
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void A(ebf ebfVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void B(ebh ebhVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void C(ebo eboVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void D(float f) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void E(eal ealVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void c(eak eakVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void d(ecb ecbVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dc(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void de(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dg(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dh(ead eadVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void el(dyo dyoVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void m(eai eaiVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void q(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void s(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void df(dzy dzyVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}

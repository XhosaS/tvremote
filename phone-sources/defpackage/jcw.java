package defpackage;

import android.view.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcw implements eam {
    final /* synthetic */ jdd a;

    public jcw(jdd jddVar) {
        this.a = jddVar;
    }

    @Override // defpackage.eam
    public final void dd(boolean z) {
        Window window;
        Window window2;
        if (z) {
            jdd jddVar = this.a;
            by activity = jddVar.getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null) {
                window2.addFlags(128);
            }
            if (jddVar.U) {
                jddVar.I();
            }
        } else {
            by activity2 = this.a.getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.clearFlags(128);
            }
        }
        this.a.C();
    }

    @Override // defpackage.eam
    public final void n(int i) {
        if (i == 1) {
            ((tug) jdd.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 407, "TvodPlayerFragment.kt")).s("Playback state: Idle");
        } else if (i == 2) {
            jdd jddVar = this.a;
            jbr.e(true, jddVar.ac);
            jbr.e(true, jddVar.R);
            ((tug) jdd.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 396, "TvodPlayerFragment.kt")).s("Playback state: Buffering...");
        } else if (i != 3) {
            tui tuiVar = jdd.a;
            tuv tuvVarB = tuiVar.b();
            tuy tuyVar = tvo.a;
            ((tug) tuvVarB.h(tuyVar, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 410, "TvodPlayerFragment.kt")).s("Playback state: Ended");
            jdd jddVar2 = this.a;
            if (jddVar2.S != 4) {
                ((tug) ((tug) tuiVar.g().h(tuyVar, "[GTVM-Kinetoscope]")).g(4, TimeUnit.HOURS).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 420, "TvodPlayerFragment.kt")).s("[Kinetoscope] Playback state: Ended");
                jddVar2.T().v(jddVar2.h(null));
                by activity = jddVar2.getActivity();
                if (activity != null) {
                    activity.finishAndRemoveTask();
                }
            }
        } else {
            jdd jddVar3 = this.a;
            jbr.e(false, jddVar3.ac);
            jbr.e(false, jddVar3.R);
            ((tug) ((tug) jdd.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).g(4, TimeUnit.HOURS).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerEventListener$1", "onPlaybackStateChanged", 404, "TvodPlayerFragment.kt")).s("[Kinetoscope] Playback state: Ready");
        }
        this.a.S = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    @Override // defpackage.eam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(defpackage.eah r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcw.p(eah):void");
    }

    @Override // defpackage.eam
    public final void t(ean eanVar, ean eanVar2, int i) {
        if (i == 1) {
            jdd jddVar = this.a;
            if (a.s(jddVar.T, ynm.a) || ynm.k(jddVar.T) > eanVar2.j) {
                jddVar.T = ylh.p(eanVar2.j, yno.c);
            }
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
}

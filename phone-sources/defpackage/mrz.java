package defpackage;

import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrz implements iej {
    public final /* synthetic */ WatchActivity a;

    public mrz(WatchActivity watchActivity) {
        this.a = watchActivity;
    }

    @Override // defpackage.iej
    public final void dM() {
        WatchActivity watchActivity = this.a;
        if (watchActivity.w.e() == null || ((iua) watchActivity.w.e()).d || watchActivity.A == null) {
            return;
        }
        wni wniVar = wni.a;
        vtw vtwVarM = wniVar.m();
        String str = watchActivity.A.b;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        ((wni) vucVar).b = str;
        if (watchActivity.D) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            ((wni) vtwVarM.b).c = a.aJ(7);
        } else {
            int i = watchActivity.A.a;
            if (i == 6) {
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((wni) vtwVarM.b).c = a.aJ(3);
            } else if (i == 20) {
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((wni) vtwVarM.b).c = a.aJ(6);
            } else if (i != 5001) {
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((wni) vtwVarM.b).c = a.aJ(2);
            } else {
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                ((wni) vtwVarM.b).c = a.aJ(7);
            }
        }
        wpl wplVar = wpl.a;
        vtw vtwVarM2 = wplVar.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpl wplVar2 = (wpl) vtwVarM2.b;
        wni wniVar2 = (wni) vtwVarM.r();
        wniVar2.getClass();
        wplVar2.c = wniVar2;
        wplVar2.b |= 1;
        if (!sij.F(watchActivity.B)) {
            vtw vtwVarM3 = wniVar.m();
            String str2 = watchActivity.B;
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vuc vucVar2 = vtwVarM3.b;
            str2.getClass();
            ((wni) vucVar2).b = str2;
            if (!vucVar2.A()) {
                vtwVarM3.u();
            }
            ((wni) vtwVarM3.b).c = a.aJ(5);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wpl wplVar3 = (wpl) vtwVarM2.b;
            wni wniVar3 = (wni) vtwVarM3.r();
            wniVar3.getClass();
            wplVar3.e = wniVar3;
            wplVar3.b |= 4;
        }
        if (!sij.F(watchActivity.C)) {
            vtw vtwVarM4 = wniVar.m();
            String str3 = watchActivity.C;
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vuc vucVar3 = vtwVarM4.b;
            str3.getClass();
            ((wni) vucVar3).b = str3;
            if (!vucVar3.A()) {
                vtwVarM4.u();
            }
            ((wni) vtwVarM4.b).c = a.aJ(4);
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wpl wplVar4 = (wpl) vtwVarM2.b;
            wni wniVar4 = (wni) vtwVarM4.r();
            wniVar4.getClass();
            wplVar4.d = wniVar4;
            wplVar4.b |= 2;
        }
        vtw vtwVarM5 = wpm.a.m();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        wpm wpmVar = (wpm) vtwVarM5.b;
        wpl wplVar5 = (wpl) vtwVarM2.r();
        wplVar5.getClass();
        wpmVar.g = wplVar5;
        wpmVar.b |= 4;
        wpm wpmVar2 = (wpm) vtwVarM5.r();
        tug tugVar = (tug) ((tug) WatchActivity.c.g()).j("com/google/android/apps/play/movies/mobile/usecase/watch/WatchActivity$1", "update", 294, "WatchActivity.java");
        wpl wplVar6 = wpmVar2.g;
        if (wplVar6 != null) {
            wplVar = wplVar6;
        }
        wni wniVar5 = wplVar.c;
        if (wniVar5 != null) {
            wniVar = wniVar5;
        }
        tugVar.v("[Playback] WatchActivity.onCreate: watchAction.getPlayMoviesDetails()=%s", wniVar.b);
        idr idrVar = ((iua) watchActivity.w.e()).m;
        idrVar.ea(new kde(this, (iea) idrVar, 7));
        if (watchActivity.w.m(wpmVar2)) {
            krd.f("Successfully handled watchaction");
        } else {
            krd.f("Failed to initiate remote playback for WatchAction: ".concat(String.valueOf(String.valueOf(wpmVar2))));
        }
    }
}

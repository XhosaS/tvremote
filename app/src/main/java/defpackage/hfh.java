package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaPlayer;
import com.google.android.apps.tvsearch.results.activity.SearchResultActivity;
import com.google.android.katniss.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
class hfh implements uo {
    final /* synthetic */ hfi a;

    public hfh(hfi hfiVar) {
        this.a = hfiVar;
    }

    @Override // defpackage.uo
    public final void a() {
        hfi hfiVar = this.a;
        if (hfiVar.l) {
            return;
        }
        hfiVar.l = true;
        Object objDN = hfiVar.cO().dN();
        SearchResultActivity searchResultActivity = (SearchResultActivity) hfiVar;
        etb etbVar = (etb) objDN;
        eup eupVar = etbVar.c;
        searchResultActivity.n = eupVar.u();
        searchResultActivity.o = eupVar.gJ();
        searchResultActivity.p = (Context) eupVar.n.a();
        searchResultActivity.q = (ahbt) eupVar.q.a();
        searchResultActivity.r = (ahbt) eupVar.bX.a();
        searchResultActivity.s = (DisplayManager) eupVar.cl.a();
        searchResultActivity.t = eupVar.ck;
        searchResultActivity.u = eupVar.fA;
        searchResultActivity.v = eupVar.bj();
        searchResultActivity.aa = eupVar.aK();
        searchResultActivity.w = (fgt) eupVar.nW.a();
        searchResultActivity.ab = new ewo();
        searchResultActivity.x = eupVar.cB();
        searchResultActivity.y = eupVar.C();
        searchResultActivity.z = eupVar.gq;
        searchResultActivity.A = (ffp) eupVar.by.a();
        searchResultActivity.B = eupVar.cp;
        searchResultActivity.C = (gfr) eupVar.cu.a();
        searchResultActivity.X = (eyy) eupVar.hl.a();
        searchResultActivity.D = (gmd) eupVar.eV.a();
        searchResultActivity.E = (zyg) eupVar.m.a();
        final Context context = (Context) eupVar.n.a();
        context.getClass();
        searchResultActivity.F = new Supplier() { // from class: gxp
            @Override // java.util.function.Supplier
            public final Object get() {
                MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, R.raw.err_no_internet);
                if (mediaPlayerCreate == null) {
                    ((zdv) gxs.a.d().q("com/google/android/apps/tvsearch/platform/audio/SingletonModule", "provideMediaPlayerErrNoInternet$lambda$1", 30, "SingletonModule.kt")).u("Failed to create MediaPlayer for R.raw.err_no_internet");
                }
                return mediaPlayerCreate;
            }
        };
        searchResultActivity.G = eupVar.fM;
        searchResultActivity.H = (hcc) eupVar.nV.a();
        searchResultActivity.I = (fex) eupVar.cr.a();
        searchResultActivity.J = eupVar.fj;
        searchResultActivity.Y = eupVar.bW();
        searchResultActivity.K = eupVar.gd;
        searchResultActivity.L = (iwk) eupVar.nY.a();
        searchResultActivity.Z = eupVar.bS();
        searchResultActivity.M = (ghr) eupVar.fg.a();
        searchResultActivity.N = (ffn) etbVar.f.a();
        searchResultActivity.O = eupVar.fi;
        searchResultActivity.P = (gnj) eupVar.fo.a();
        searchResultActivity.Q = (jca) eupVar.ft.a();
    }
}

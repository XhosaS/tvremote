package defpackage;

import android.os.Trace;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class llh implements lks, llk {
    private static final tui c = tui.l("com/google/android/apps/play/movies/common/service/player/PlaybackSessionDirector");
    public final lkr a;
    private final llq d;
    private final lie e;
    private final ksy f;
    private final String g;
    private final String h;
    private final boolean i;
    private final lnu j;
    private final llw k;
    private final kwx l;
    private final lld m;
    private llr n;
    private final lku s;
    private final lkp t;
    private final jzs u;
    private int o = 1;
    private int p = 0;
    private boolean q = false;
    private boolean r = false;
    public int b = -1;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, llq] */
    public llh(lku lkuVar, lkr lkrVar, lie lieVar, llw llwVar, lld lldVar, ksy ksyVar, String str, String str2, boolean z, lnu lnuVar, kwx kwxVar, jzs jzsVar, idf idfVar, idf idfVar2) {
        boolean z2 = true;
        this.s = lkuVar;
        this.a = lkrVar;
        this.j = lnuVar;
        this.k = llwVar;
        this.f = ksyVar;
        this.e = lieVar;
        if (str2 == null && str != null) {
            z2 = false;
        }
        a.ah(z2, "ShowId cannot be null when seasonId is not null");
        this.g = str;
        this.h = str2;
        this.i = z;
        this.m = lldVar;
        this.l = kwxVar;
        this.u = jzsVar;
        this.d = idfVar.b(this);
        Trace.beginSection("LocalPlaybackHelper");
        this.t = (lkp) idfVar2.b(this);
        Trace.endSection();
    }

    private final int E() {
        kuz kuzVar;
        llw llwVar = this.k;
        if (llwVar.j()) {
            return llwVar.k();
        }
        llr llrVar = this.n;
        if (llrVar == null || (kuzVar = llrVar.e) == null) {
            return 0;
        }
        int iA = llx.a(kuzVar, llrVar.f);
        llr llrVar2 = this.n;
        if (mjo.i(iA, llrVar2.d.a, llrVar2.g)) {
            return 0;
        }
        return iA;
    }

    private final void F(int i) throws IOException {
        G();
        if (i >= 0) {
            this.k.e(i);
        }
        lku lkuVar = this.s;
        lkuVar.w();
        lkuVar.p();
    }

    private final void G() throws IOException {
        this.o = 1;
        this.b = -1;
        B(0, null);
        this.r = false;
        this.n = null;
        this.d.f();
        lkp lkpVar = this.t;
        lkpVar.q.ee(lkpVar.s);
        lkpVar.c.ee(lkpVar.d);
        lnr lnrVar = lkpVar.o;
        lnrVar.h.unregisterReceiver(lnrVar.i);
        lkpVar.u.abandonAudioFocus(lkpVar);
        lkpVar.v.c(false);
        lkpVar.F = null;
        lmi lmiVar = lkpVar.V;
        if (lmiVar != null && lkpVar.H != 0) {
            int i = lkpVar.N.d.b;
            lkpVar.n.e(lmiVar.a() + i);
            lmy lmyVar = lkpVar.m;
            int iA = lkpVar.V.a() + i;
            ieg iegVar = lmyVar.a;
            if (!iegVar.k() && lmyVar.g != 0) {
                if (lmyVar.h == 0) {
                    lmyVar.h = System.currentTimeMillis();
                }
                long j = iA;
                if (lmyVar.b) {
                    lmyVar.c.execute(new lik(lmyVar, luj.a((ksn) iegVar.g(), lmyVar.i, lmyVar.g, System.currentTimeMillis(), new lui(true, j)), 10));
                    lmyVar.d.c(Long.valueOf(System.currentTimeMillis()));
                } else {
                    lmyVar.a(j, true);
                    lmyVar.f.e(uof.j((ksn) iegVar.g(), lmyVar.i), icz.a, new mfm());
                }
            }
        }
        lkpVar.e.removeCallbacks(lkpVar.f);
        lmi lmiVar2 = lkpVar.V;
        if (lmiVar2 != null) {
            lme lmeVar = lmiVar2.n;
            if (lmeVar.c != null) {
                File file = new File(lmeVar.a.getFilesDir(), "bandwidth_bucket_history");
                vtw vtwVarM = ldq.a.m();
                ArrayList arrayListB = lmeVar.c.b();
                int size = arrayListB.size();
                for (int i2 = 0; i2 < size; i2++) {
                    vtw vtwVar = (vtw) arrayListB.get(i2);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    ldq ldqVar = (ldq) vtwVarM.b;
                    ldr ldrVar = (ldr) vtwVar.r();
                    ldrVar.getClass();
                    vun vunVar = ldqVar.b;
                    if (!vunVar.c()) {
                        ldqVar.b = vuc.s(vunVar);
                    }
                    ldqVar.b.add(ldrVar);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            ((ldq) vtwVarM.r()).g(fileOutputStream);
                        } catch (IOException e) {
                            krd.d("error saving histories to representation_selection_history", e);
                        }
                    } finally {
                        ksk.f(fileOutputStream);
                    }
                } catch (FileNotFoundException e2) {
                    krd.d("representation_selection_history file not found", e2);
                }
            }
            lmiVar2.c.ee(lmiVar2.p);
            lmiVar2.C = false;
            mfy mfyVar = lmiVar2.t;
            if (mfyVar != null) {
                mfyVar.b();
                lmiVar2.t.l(null);
            }
            lmiVar2.c();
            ExoPlayer exoPlayer = lmiVar2.f;
            exoPlayer.ar();
            lmiVar2.y = new ekc[0];
            lmiVar2.z = null;
            lmiVar2.removeCallbacksAndMessages(null);
            lmiVar2.obtainMessage(2, (int) exoPlayer.D(), 0).sendToTarget();
            lkpVar.V = null;
        }
        lkpVar.H = 0;
        this.j.a(this.e);
        this.m.c(ieg.a);
    }

    public final void A() {
        long j;
        int iO;
        int iW = w();
        llr llrVar = this.n;
        int iMax = 0;
        if (llrVar != null) {
            lvi lviVar = llrVar.d;
            if (lviVar.a != 0) {
                int i = lviVar.b;
                int iA = lviVar.a();
                lmi lmiVar = this.t.V;
                if (lmiVar != null) {
                    lml lmlVar = lmiVar.m;
                    ExoPlayer exoPlayer = lmlVar.a;
                    int iA2 = exoPlayer.a();
                    if (lmlVar.d == null) {
                        iO = -1;
                    } else {
                        long jD = exoPlayer.D();
                        fdg fdgVar = lmlVar.c;
                        if (fdgVar != null) {
                            j = lmlVar.c.c[fdgVar.d(jD)];
                        } else {
                            j = 0;
                        }
                        iO = lmlVar.d.O(j);
                    }
                    if (iO == -2) {
                        iMax = 100;
                    } else if (iO != -1) {
                        iMax = Math.max(iA2, (int) ((iO * 100) / exoPlayer.E()));
                    } else {
                        iMax = iA2;
                    }
                }
                iMax = ((i * 100) + (iA * iMax)) / this.n.d.a;
            }
        }
        int i2 = this.b;
        if ((i2 == -1 || i2 > iW) && i()) {
            this.b = iW;
            i2 = iW;
        }
        this.a.onPlayerProgress(iW, iMax, i2);
    }

    public final void B(int i, llt lltVar) {
        ieg iegVarF;
        if (i == 5) {
            lvi lviVar = this.n.d;
            if (lviVar.a > lviVar.c) {
                F(-1);
                return;
            }
        }
        this.p = i;
        this.a.onPlayerStateChanged(i, lltVar, w());
        lld lldVar = this.m;
        int i2 = this.p;
        if (i2 == 2 || i2 == 3) {
            iegVarF = ieg.f(ktc.d(ktc.b(this.h == null ? xay.MOVIE : xay.EPISODE), this.f.b));
        } else {
            iegVarF = ieg.a;
        }
        lldVar.c(iegVarF);
        if (lltVar != null) {
            this.j.f();
        }
    }

    public final void C(List list, kwx kwxVar) {
        this.a.onPlayerSubtitleTracks(krh.u(list, this.l), kwxVar);
    }

    public final void D(boolean z) {
        if (z) {
            this.j.f();
        }
        this.a.onStreamingWarningRequired(z);
    }

    @Override // defpackage.lks
    public final void a(mfy mfyVar, SubtitlesOverlay subtitlesOverlay, fbt fbtVar) {
        mfyVar.getClass();
        lkp lkpVar = this.t;
        lkpVar.A = mfyVar;
        lkpVar.B = subtitlesOverlay;
        lkpVar.C = fbtVar;
        CaptioningManager captioningManager = (CaptioningManager) lkpVar.X.a;
        subtitlesOverlay.setFontScale(captioningManager.getFontScale());
        subtitlesOverlay.setCaptionStyle(fsp.a(captioningManager.getUserStyle()));
        lkpVar.m();
        b();
    }

    @Override // defpackage.lks
    public final void b() {
        if (this.o != 1) {
            return;
        }
        if (this.n != null) {
            Trace.beginSection("finishInit");
            int iE = E();
            llr llrVar = this.n;
            lvi lviVar = llrVar.d;
            int i = lviVar.b;
            if (iE < i || iE > lviVar.c) {
                iE = i;
            }
            lkp lkpVar = this.t;
            lkpVar.N = llrVar;
            lkpVar.O = iE - i;
            lvh lvhVar = llrVar.h;
            List list = lvhVar.a;
            lvd lvdVar = (lvd) list.get(0);
            boolean z = lvdVar.d;
            int i2 = lvdVar.c.f;
            boolean z2 = llrVar.b && z;
            boolean z3 = i2 != 0;
            lkpVar.L = z2;
            boolean zB = lvhVar.b();
            lkpVar.P = lnz.a();
            if (z) {
                byte[] bArr = llrVar.i;
                tst tstVarI = bArr == null ? trk.a : tst.i(new mee(bArr));
                lmc lmcVarA = lmd.a();
                lmcVarA.b(lkpVar.l);
                lmcVarA.o(lkpVar.i);
                lmcVarA.h(lkpVar.j != null);
                lmcVarA.g(z3);
                lmcVarA.m(llrVar.a);
                lmcVarA.j(true);
                lmcVarA.a = tstVarI;
                lmcVarA.e(llrVar.j);
                lmcVarA.k(ImmutableList.copyOf((Collection) list));
                lmcVarA.f(llrVar.o);
                lmcVarA.i(zB);
                lmcVarA.c(llrVar.p);
                lmcVarA.d(llrVar.q);
                lmcVarA.n(lkpVar.P);
                lkpVar.I = lmcVarA.a();
            } else {
                List arrayList = new ArrayList(list.size());
                for (int i3 = 0; i3 < list.size(); i3++) {
                    lvd lvdVar2 = (lvd) list.get(i3);
                    arrayList.add(new lvd(lvdVar2.a.buildUpon().appendPath("cpn").appendPath(lkpVar.P).build(), lvdVar2.c, lvdVar2.b));
                }
                lmc lmcVarA2 = lmd.a();
                lmcVarA2.b(lkpVar.l);
                lmcVarA2.o(lkpVar.i);
                lmcVarA2.h(lkpVar.j != null);
                lmcVarA2.g(z3);
                lmcVarA2.m(llrVar.a);
                lmcVarA2.j(false);
                lmcVarA2.l(ImmutableList.copyOf((Collection) arrayList));
                lmcVarA2.i(zB);
                lmcVarA2.c(llrVar.p);
                lmcVarA2.d(llrVar.q);
                lmcVarA2.n(lkpVar.P);
                lkpVar.I = lmcVarA2.a();
                list = arrayList;
            }
            int iA = lkpVar.y.a(list);
            ieg iegVar = lkpVar.l;
            String str = lkpVar.i;
            String str2 = lkpVar.j;
            kzo kzoVar = ((lvd) list.get(iA)).b.l;
            if (kzoVar == null) {
                kzoVar = kzo.a;
            }
            krf.n(iegVar, str, str2, kzoVar, lkpVar.h);
            if (lkpVar.Q && lkpVar.H != 1) {
                lkpVar.j();
            }
            this.b = this.k.a(iE);
            A();
            this.e.J(this.f.b, 1);
            this.o = 2;
            if (this.r) {
                lkpVar.e();
            }
            Trace.endSection();
        } else if (this.d.i()) {
            return;
        }
        tui tuiVar = c;
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/common/service/player/PlaybackSessionDirector", "maybeDoFullLoad", 285, "PlaybackSessionDirector.java")).s("[Playback] PlaybackSessionDirector.maybeDoFullLoad");
        lkp lkpVar2 = this.t;
        lkpVar2.Q = true;
        if (lkpVar2.N != null && lkpVar2.H != 1) {
            lkpVar2.j();
        }
        if (this.q) {
            return;
        }
        lgo lgoVarA = this.d.a();
        ((tug) ((tug) tuiVar.g()).j("com/google/android/apps/play/movies/common/service/player/PlaybackSessionDirector", "maybeDoFullLoad", 289, "PlaybackSessionDirector.java")).E("[Playback] PlaybackSessionDirector.maybeDoFullLoad: doneDrmPreempt: %b, cencSecurityLevel: %d, mimeType: %s", Boolean.valueOf(this.q), Integer.valueOf(lgoVarA != null ? lgoVarA.f : -1000), lgoVarA != null ? lgoVarA.c : "");
        if (lgoVarA != null) {
            this.q = true;
            tug tugVar = (tug) ((tug) lkp.a.g()).j("com/google/android/apps/play/movies/common/service/player/DefaultLocalPlaybackHelper", "preOpenDrm", 354, "DefaultLocalPlaybackHelper.java");
            int i4 = lgoVarA.f;
            tugVar.t("[Playback] DefaultLocalPlaybackHelper.preOpenDrm: cencSecurityLevel=%d", i4);
            lmi lmiVarN = lkpVar2.n();
            String str3 = lkpVar2.P;
            mff mffVar = lmiVarN.v;
            ieg iegVar2 = lkpVar2.l;
            String str4 = lkpVar2.i;
            ksy ksyVar = lkpVar2.k;
            if (mffVar == null && lmiVarN.x == null) {
                try {
                    ((tug) ((tug) lmi.a.g()).j("com/google/android/apps/play/movies/common/service/player/exov2/ExoVideosPlayerV2", "preOpenDrm", 407, "ExoVideosPlayerV2.java")).t("[Playback] ExoVideosPlayerV2.preOpenDrm: cencSecurityLevel=%d", i4);
                    lmiVarN.f(iegVar2, str4, ksyVar, lgoVarA.a, lgoVarA.d, lgoVarA.e, i4, lgoVarA.g, str3);
                    dza dzaVar = new dza(new dyz(dys.d, lgoVarA.c, lgoVarA.b));
                    dzd dzdVar = new dzd();
                    dzdVar.q = dzaVar;
                    dze dzeVar = new dze(dzdVar);
                    lha lhaVar = lmiVarN.o;
                    ExoPlayer exoPlayer = lmiVarN.f;
                    mff mffVar2 = new mff(new soh(lhaVar, dzeVar, lmiVarN.w, 1));
                    eka ekaVarAp = exoPlayer.ap(lhaVar);
                    ekaVarAp.e(0);
                    ekaVarAp.d(mffVar2);
                    ekaVarAp.c();
                    lmiVarN.v = mffVar2;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.lks
    public final void c(boolean z) {
        if (z) {
            p();
            return;
        }
        lnu lnuVar = this.j;
        if (lnuVar.g()) {
            return;
        }
        lnuVar.f();
    }

    @Override // defpackage.lks
    public final void d() {
        p();
    }

    @Override // defpackage.lks
    public final void e(boolean z) {
        this.t.R = z;
    }

    @Override // defpackage.lks
    public final void f() throws IOException {
        this.k.d(this.b);
        G();
    }

    @Override // defpackage.lks
    public final void g() throws IOException {
        G();
        this.a.onPlaybackTerminated();
    }

    @Override // defpackage.lks
    public final boolean h() {
        lmi lmiVar = this.t.V;
        return lmiVar != null && lmiVar.s();
    }

    @Override // defpackage.lks
    public final boolean i() {
        return this.p == 2;
    }

    @Override // defpackage.lwl
    public final int j() {
        int i = this.p;
        if (i == 3 || i == 2) {
            return w();
        }
        return -1;
    }

    @Override // defpackage.llf
    public final void k() {
        lkp lkpVar = this.t;
        kwx kwxVar = lkpVar.F;
        lkpVar.G = kwxVar;
        if (kwxVar == null) {
            lkpVar.n.g(null);
        } else {
            lkpVar.n.g(kwxVar.languageCode());
        }
        lkpVar.k(null, false);
    }

    @Override // defpackage.llf
    public final void l() {
        lkp lkpVar = this.t;
        lkpVar.k(lkpVar.G, false);
    }

    @Override // defpackage.llg
    public final void m() throws IOException {
        t(3, Math.min(w() + 30000, this.n.d.a), true);
    }

    @Override // defpackage.loa
    public final void n() {
        this.r = false;
        int i = this.o;
        if (i != 1) {
            if (i != 2) {
                krd.c(a.cf(i, "onPause called in unexpected state "));
            } else {
                this.t.h();
            }
        }
    }

    @Override // defpackage.llf
    public final void o(boolean z) {
        lkp lkpVar = this.t;
        llw llwVar = lkpVar.n;
        llwVar.a.putBoolean("in_pip_mode", z);
        lnr lnrVar = lkpVar.o;
        int iO = lnrVar.O();
        lnf lnfVar = lnrVar.l;
        if (lnfVar.o != z) {
            lnfVar.o = z;
            if (z) {
                lnfVar.d = iO;
            } else {
                lnfVar.e(iO);
                if (lnfVar.c == 1) {
                    lnfVar.d(iO, true);
                }
                lnfVar.d = -1;
                lnfVar.f = -1;
            }
        }
        Iterator it = lnrVar.o.iterator();
        while (it.hasNext()) {
            ((lnn) it.next()).j(z);
        }
        kdh kdhVar = lkpVar.Y;
        List list = lkpVar.E;
        llwVar.b();
        lkpVar.k(kdhVar.l(list, true, llwVar), false);
        lmi lmiVar = lkpVar.V;
        if (lmiVar != null) {
            lmiVar.n(true != z ? 2 : 1);
        }
    }

    @Override // defpackage.loa
    public final void p() {
        this.r = true;
        int i = this.o;
        if (i != 1) {
            if (i != 2) {
                krd.c(a.cf(i, "onPlay called in unexpected state "));
            } else {
                this.t.e();
            }
        }
    }

    @Override // defpackage.llg
    public final void q() throws IOException {
        t(3, Math.max(w() - 30000, 0), true);
    }

    @Override // defpackage.loc
    public final void r() {
        if (this.o == 2) {
            lkp lkpVar = this.t;
            lkpVar.J = false;
            if (lkpVar.H == 1) {
                if (lkpVar.K) {
                    lkpVar.i();
                } else {
                    lkpVar.d(lkpVar.V.a());
                }
            }
        }
    }

    @Override // defpackage.loc
    public final void s(int i) {
        if (this.o == 2) {
            lkp lkpVar = this.t;
            lkpVar.J = true;
            lkpVar.o.S(lkpVar.V.a(), true, i);
            lkpVar.K = lkpVar.V.s();
            lkpVar.V.k(false);
        }
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) throws IOException {
        if (this.o != 2) {
            llw llwVar = this.k;
            llwVar.e(i2);
            llwVar.d(-1);
            return;
        }
        if (i2 < 0 || i2 >= this.n.d.b) {
            lvi lviVar = this.n.d;
            if (i2 < lviVar.c || i2 >= lviVar.a) {
                this.b = -1;
                lkp lkpVar = this.t;
                int i3 = i2 - lviVar.b;
                if (!z) {
                    lkpVar.V.m(true);
                    lkpVar.V.i(i3);
                    return;
                }
                lkpVar.V.m(false);
                int i4 = lkpVar.H;
                if (i4 == 1) {
                    if (lkpVar.K) {
                        lkpVar.V.i(i3);
                        lkpVar.i();
                    } else {
                        lkpVar.V.i(i3);
                    }
                } else if (i4 == 0) {
                    lkpVar.O = i3;
                }
                lkpVar.o.S(i3, false, i);
                lkpVar.J = false;
                return;
            }
        }
        F(i2);
    }

    @Override // defpackage.lod
    public final void u(int i) throws IOException {
        if (this.o == 2) {
            lkp lkpVar = this.t;
            List listA = lkpVar.a();
            if (i < 0 || i >= listA.size()) {
                return;
            }
            llw llwVar = this.k;
            if (llwVar.l() != i) {
                llwVar.h(((kzo) listA.get(i)).c);
                lmi lmiVar = lkpVar.V;
                if (lmiVar.A != i) {
                    lmiVar.A = i;
                    kzo kzoVar = lmiVar.z[i];
                    ezd ezdVar = lmiVar.l;
                    eyu eyuVarE = ezdVar.e();
                    if ((kzoVar.b & 1) != 0) {
                        eyuVarE.v(kzoVar.c);
                    }
                    if ((kzoVar.b & 4) == 0 || !kzoVar.e) {
                        eyuVarE.r = 2;
                    }
                    eyuVarE.q = kfw.A(kzoVar);
                    ezdVar.k(new eyv(eyuVarE));
                }
                kzo kzoVar2 = lkpVar.V.z[i];
                krf.n(lkpVar.l, lkpVar.i, lkpVar.j, kzoVar2, lkpVar.h);
                lkpVar.D = kzoVar2.c;
                lkpVar.o.Q(lkpVar.V.a(), kzoVar2, true);
                kwx kwxVar = lkpVar.F;
                if (kwxVar == null || kwxVar.isForced()) {
                    kdh kdhVar = lkpVar.Y;
                    lkpVar.k(kdh.m(lkpVar.E, lkpVar.D), true);
                }
                lkpVar.n.f(i);
                lkpVar.U.z(lkpVar.a(), i);
                if (llwVar.i()) {
                    F(-1);
                }
            }
        }
    }

    @Override // defpackage.lod
    public final void v(kwx kwxVar) {
        String strLanguageCode;
        if (this.o == 2) {
            llr llrVar = this.n;
            if (llrVar != null && !llrVar.k) {
                this.u.o(kwxVar);
            }
            lkp lkpVar = this.t;
            lkpVar.W.n(kwxVar);
            if (kwxVar == null) {
                kdh kdhVar = lkpVar.Y;
                kwxVar = kdh.m(lkpVar.E, lkpVar.D);
                strLanguageCode = null;
            } else {
                strLanguageCode = kwxVar.languageCode();
            }
            lkpVar.n.g(strLanguageCode);
            lkpVar.k(kwxVar, true);
        }
    }

    public final int w() {
        if (this.o != 2) {
            return E();
        }
        lkp lkpVar = this.t;
        return (lkpVar.H == 1 ? lkpVar.V.a() : lkpVar.O) + this.n.d.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(llr llrVar) {
        ieg<lvd> iegVarF;
        ImmutableList immutableList;
        lvh lvhVar;
        this.n = llrVar;
        kwy kwyVar = llrVar.l;
        int i = llrVar.d.a;
        int i2 = llrVar.g * 1000;
        kuw kuwVar = llrVar.m;
        llr llrVar2 = this.n;
        if (llrVar2 == null || (lvhVar = llrVar2.h) == null || lvhVar.a.isEmpty()) {
            iegVarF = ieg.a;
        } else {
            lvd lvdVar = (lvd) this.n.h.a.get(0);
            iegVarF = lvdVar.c.d ? ieg.f(lvdVar) : ieg.a;
        }
        ieg<lvd> iegVar = iegVarF;
        lkr lkrVar = this.a;
        lkrVar.onVideoInfo(kwyVar, i, i2, kuwVar, iegVar, llrVar.n);
        lvh lvhVar2 = llrVar.h;
        if (lvhVar2 != null && (immutableList = lvhVar2.c) != null && !immutableList.isEmpty()) {
            lkrVar.onStoryboards(immutableList);
        }
        b();
    }

    public final void y(llt lltVar) {
        this.e.K(this.f.b, this.h, this.g, this.i, this.r, lltVar.c(), lltVar.a(), lltVar.getCause());
        boolean z = this.r;
        G();
        if (z) {
            B(4, lltVar);
        }
        this.s.w();
    }

    public final void z(List list, int i) {
        this.a.onPlayerAudioTracks(list, i);
    }
}

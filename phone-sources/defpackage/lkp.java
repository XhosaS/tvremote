package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import com.google.android.gms.auth.TokenData;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkp implements AudioManager.OnAudioFocusChangeListener, llk {
    public static final tui a = tui.l("com/google/android/apps/play/movies/common/service/player/DefaultLocalPlaybackHelper");
    public mfy A;
    public SubtitlesOverlay B;
    public fbt C;
    public String D;
    public List E;
    public kwx F;
    public kwx G;
    public int H;
    public lmd I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public llr N;
    public int O;
    public String P;
    public boolean Q;
    public boolean R;
    public volatile boolean S;
    public final lyz T;
    public final llh U;
    public lmi V;
    public final jzs W;
    public final hfx X;
    public final kdh Y;
    private final WindowManager Z;
    private final Executor aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final String ae;
    private final idb af;
    private final idy ag;
    private final boolean ah;
    private final idr ai;
    private final boolean aj;
    private final TokenData ak;
    private final tst al;
    private boolean am;
    private int an;
    private llt ao;
    private int ap;
    private boolean aq;
    private final man ar;
    private final kdj as;
    public final lfn b;
    public final ids c;
    public final iej d;
    public final Handler e;
    public final Runnable f;
    public final Executor g;
    public final SharedPreferences h;
    public final String i;
    public final String j;
    public final ksy k;
    public final ieg l;
    public final lmy m;
    public final llw n;
    public final lnr o;
    public final lnu p;
    public final ids q;
    public final idb r;
    public final iej s;
    public final krl t;
    public final AudioManager u;
    public final idy v;
    public final idy w;
    public final Runnable x;
    public final lux y;
    public final lnc z;

    public lkp(lfn lfnVar, man manVar, mem memVar, SharedPreferences sharedPreferences, lyz lyzVar, ExecutorService executorService, Executor executor, hfx hfxVar, kdj kdjVar, Context context, idr idrVar, idr idrVar2, llh llhVar, llw llwVar, String str, String str2, String str3, boolean z, ieg iegVar, lnu lnuVar, idy idyVar, boolean z2, idr idrVar3, idb idbVar, lnr lnrVar, lmy lmyVar, Runnable runnable, TokenData tokenData, lux luxVar, jzs jzsVar, kdh kdhVar, tst tstVar, lnc lncVar, boolean z3) {
        itm itmVar = new itm(this, 19, null);
        this.d = itmVar;
        this.f = new ljl(this, 3);
        this.t = new krl(false);
        this.E = Collections.EMPTY_LIST;
        this.P = "";
        this.U = llhVar;
        this.v = idrVar;
        this.w = idrVar2;
        this.aa = executor;
        this.n = llwVar;
        this.i = str;
        this.j = str3;
        this.ae = str2;
        if (str3 == null && str2 == null) {
            this.k = ksy.i(str);
        } else {
            this.k = ksy.h(str);
        }
        this.ab = z;
        this.ac = z3;
        a.H(z || iegVar.m());
        this.l = iegVar;
        this.ar = manVar;
        this.b = lfnVar;
        this.h = sharedPreferences;
        this.T = lyzVar;
        this.g = executorService;
        this.X = hfxVar;
        this.p = lnuVar;
        this.ah = z2;
        this.ai = idrVar3;
        this.ag = idyVar;
        this.ad = true;
        this.as = kdjVar;
        this.o = lnrVar;
        this.m = lmyVar;
        this.x = runnable;
        this.ak = tokenData;
        this.y = luxVar;
        this.W = jzsVar;
        this.Y = kdhVar;
        this.al = tstVar;
        this.z = lncVar;
        this.u = (AudioManager) context.getSystemService("audio");
        this.Z = (WindowManager) context.getSystemService("window");
        idb idbVarG = hjt.g(new krk(this, 4, null), new krk(sharedPreferences, 2), hjt.j(!z), hjt.i(new krk(this, 3, null)));
        idb idbVarG2 = hjt.g(memVar.a(), memVar.b());
        this.r = idbVarG2;
        this.af = hjt.g(idbVarG2, idbVarG, hjt.i(idbVar));
        ids idsVarF = hjt.f(idbVarG, memVar);
        this.q = idsVarF;
        krj krjVar = new krj(new itm(this, 20, null), memVar.a());
        this.s = krjVar;
        this.e = new Handler(Looper.getMainLooper());
        this.aj = ksk.s(context.getPackageManager());
        iem iemVar = new iem(context, "android.media.AUDIO_BECOMING_NOISY", "android.intent.action.SCREEN_OFF");
        this.c = iemVar;
        this.H = 0;
        this.an = 0;
        idsVarF.ea(krjVar);
        iemVar.ea(itmVar);
        czi.f(lnrVar.h, lnrVar.i, lnr.g, 4);
    }

    private final void o() {
        a.ab(this.V != null);
        if (this.aj) {
            this.V.j(true);
        }
    }

    public final List a() {
        lmi lmiVar = this.V;
        kzo[] kzoVarArr = lmiVar != null ? lmiVar.z : null;
        return kzoVarArr != null ? Arrays.asList(kzoVarArr) : Collections.EMPTY_LIST;
    }

    public final void b() {
        idf idfVarA;
        if (this.F == null || !this.am) {
            return;
        }
        lmi lmiVar = this.V;
        if ((lmiVar == null || lmiVar.b() != 4) && this.N.n == -1) {
            return;
        }
        int i = this.N.n;
        if (i == -1) {
            i = 0;
        }
        this.am = false;
        if (TextUtils.isEmpty(this.F.url())) {
            f(this.F, new RuntimeException("No track url"));
            return;
        }
        idy idyVarB = krh.b(new mbr(this, this.F, 1));
        if (this.N.n == -1) {
            man manVar = this.ar;
            idfVarA = krf.d(new lbj(manVar.b, 12), manVar.c);
        } else {
            idfVarA = this.ar.a();
        }
        mjo.e(idyVarB, new iei(idfVarA, Pair.create(this.F, Integer.valueOf(i))), this.aa);
    }

    public final void c(int i) {
        Handler handler = this.e;
        Runnable runnable = this.f;
        handler.removeCallbacks(runnable);
        lmi lmiVar = this.V;
        int iB = lmiVar != null ? lmiVar.b() : 1;
        if (iB == 3 || iB == 4) {
            handler.postDelayed(runnable, i);
        }
    }

    public final void d(int i) {
        if (this.J) {
            return;
        }
        llh llhVar = this.U;
        llhVar.a.maybeShowKnowledge(i, llhVar.b);
    }

    public final void e() {
        if (this.af.a()) {
            this.U.D(true);
        } else {
            i();
        }
    }

    public final void f(kwx kwxVar, Throwable th) {
        if (a.Q(kwxVar, this.F)) {
            k(null, false);
            lnr lnrVar = this.o;
            a.ab(lnrVar.q);
            int iO = lnrVar.O();
            Iterator it = lnrVar.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).m(iO, kwxVar, th);
            }
        }
    }

    public final void g(llt lltVar) {
        lmi lmiVar = this.V;
        if (lmiVar != null) {
            lnr lnrVar = this.o;
            int iA = lmiVar.a();
            lnrVar.R(iA);
            this.O = iA;
        } else {
            this.o.R(0);
        }
        this.H = 2;
        l(4, lltVar);
        this.v.c(false);
    }

    public final void h() {
        lmi lmiVar;
        if (this.I == null || this.N == null || (lmiVar = this.V) == null) {
            return;
        }
        lmiVar.k(false);
        this.v.c(false);
        this.t.c(true);
    }

    public final void i() {
        if (this.I == null || this.N == null || this.V == null) {
            return;
        }
        a.ab(true);
        if (ksk.b >= 26) {
            this.u.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this, this.e).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build());
        } else {
            this.u.requestAudioFocus(this, 3, 1);
        }
        o();
        if (!this.I.d) {
            this.v.c(true);
        }
        if (this.H != 1) {
            j();
        }
        this.V.k(true);
        this.t.c(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v13, types: [lnn] */
    public final void j() {
        String str;
        boolean z;
        int i;
        boolean z2;
        int i2;
        lnu lnuVar;
        lnr lnrVar;
        boolean z3;
        ?? r10;
        lnu lnuVar2 = this.p;
        lnuVar2.e(6);
        this.w.c(true);
        ImmutableList immutableList = this.N.h.a;
        n();
        String str2 = ((lvd) immutableList.get(0)).b.n;
        String str3 = this.i;
        if (true == TextUtils.equals(str2, str3)) {
            str2 = "";
        }
        String str4 = ((lvd) immutableList.get(0)).b.p;
        String str5 = ((lvd) immutableList.get(0)).b.o;
        int i3 = this.N.h.d;
        String str6 = i3 != 1 ? i3 != 2 ? i3 != 3 ? "UNKNOWN" : "POST_ROLL" : "MAIN_FEATURE" : "PRE_ROLL";
        boolean z4 = this.n.a.getBoolean("in_pip_mode", false);
        lnr lnrVar2 = this.o;
        if (lnrVar2.q) {
            str = str3;
            z = z4;
            i = 1;
            z2 = false;
            i2 = -1;
            lnuVar = lnuVar2;
        } else {
            String str7 = this.P;
            String str8 = this.j;
            String str9 = this.ae;
            boolean z5 = this.ab;
            lmd lmdVar = this.I;
            boolean z6 = lmdVar.d;
            int i4 = lmdVar.k;
            llr llrVar = this.N;
            String str10 = str8;
            int iA = llrVar.d.a();
            String str11 = str9;
            TokenData tokenData = this.ak;
            boolean zB = llrVar.h.b();
            boolean z7 = this.ac;
            a.ab(!lnrVar2.q);
            lnrVar2.o = z6 ? lnrVar2.k : lnrVar2.j;
            lnrVar2.q = true;
            mes mesVar = lnrVar2.s;
            lnuVar = lnuVar2;
            lnrVar2.r = SystemClock.elapsedRealtime();
            lnf lnfVar = lnrVar2.l;
            lnfVar.n = iA;
            lnfVar.b = new lne();
            lnfVar.c = 0;
            lnfVar.e = 0;
            lnfVar.g = -1;
            lnfVar.h = 0;
            lnfVar.i = false;
            lnfVar.j = false;
            lnfVar.k = false;
            lnfVar.l = 1;
            lnfVar.m = 0;
            lnfVar.o = z4;
            if (z4) {
                lnfVar.d = 0;
            }
            SparseArray sparseArray = lnfVar.a;
            sparseArray.clear();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                lvd lvdVar = (lvd) it.next();
                Iterator it2 = it;
                if (lvdVar.c.b > 0) {
                    sparseArray.put(lvdVar.b.c, lvdVar);
                }
                it = it2;
            }
            lny lnyVar = lnrVar2.m;
            lnyVar.d = str2;
            lnyVar.e = str4;
            lnyVar.f = str5;
            final lnk lnkVar = lnrVar2.n;
            lnkVar.h = z5;
            lnkVar.j = zB;
            lnkVar.i = z7;
            int i5 = 1;
            lnrVar2.p = new nex(lnkVar.a, lnkVar.d, new nfd() { // from class: lng
                @Override // defpackage.nfd
                public final void a(Uri uri, String str12, boolean z8) {
                    lnk lnkVar2 = lnkVar;
                    if (lnkVar2.j || lnkVar2.f) {
                        lnkVar2.b.execute(new lke(lnkVar2, str12, uri, 5));
                    }
                }
            }, new owf(lnkVar, str3, z6, i5), new owh(lnkVar, i5), new elg(new lni(str7)));
            lnrVar2.L(lnrVar2.p);
            for (lnn lnnVar : lnrVar2.o) {
                krf.c(str7);
                String str12 = str10;
                String str13 = str11;
                boolean z8 = z5;
                String str14 = str7;
                lnnVar.w(str6, str14, str3, str12, str13, z8, z6, i4, z4, tokenData, zB);
                str7 = str14;
                z5 = z8;
                str11 = str13;
                str10 = str12;
            }
            str = str3;
            z = z4;
            i = 1;
            i2 = -1;
            z2 = false;
            lnrVar2.P(0, true);
        }
        if (this.A != null) {
            m();
        }
        if (z) {
            this.V.n(i);
        }
        lnu lnuVar3 = lnuVar;
        lnuVar3.c(6);
        String str15 = this.P;
        String str16 = this.j;
        String str17 = this.ae;
        boolean z9 = this.ab;
        lmd lmdVar2 = this.I;
        boolean z10 = lmdVar2.d;
        int i6 = lmdVar2.k;
        if (this.O == 0) {
            lnrVar = lnrVar2;
            z3 = true;
        } else {
            lnrVar = lnrVar2;
            z3 = z2;
        }
        lnuVar3.h(str15, str, str16, str17, z9, z10, i6, z3);
        lnuVar3.e(10);
        lmi lmiVar = this.V;
        if (lmiVar != null) {
            lmiVar.i(this.O);
            lmi lmiVar2 = this.V;
            lmd lmdVar3 = this.I;
            ((tug) ((tug) lmi.a.g()).j("com/google/android/apps/play/movies/common/service/player/exov2/ExoVideosPlayerV2", "prepare", 446, "ExoVideosPlayerV2.java")).s("[Playback] ExoVideosPlayerV2.prepare");
            lmiVar2.E = lmdVar3;
            lmiVar2.F = i2;
            lmiVar2.G = i2;
            lmiVar2.g(1);
            boolean z11 = this.I.h;
            int iB = this.V.o.b();
            boolean z12 = this.ah;
            if (!z11) {
                r10 = 1;
            } else if (z12) {
                r10 = 7;
            } else if (iB == 1) {
                r10 = 5;
            } else if (iB != 3) {
                krd.f(a.cf(iB, "Unknown Exo DRM level: "));
                r10 = z2;
            } else {
                r10 = 6;
            }
            Iterator it3 = lnrVar.o.iterator();
            while (it3.hasNext()) {
                ((lnn) it3.next()).p(r10);
            }
            this.H = 1;
        }
    }

    public final void k(kwx kwxVar, boolean z) {
        if (a.Q(this.F, kwxVar)) {
            return;
        }
        this.F = kwxVar;
        this.U.C(this.E, kwxVar);
        if (z) {
            lnr lnrVar = this.o;
            a.ab(lnrVar.q);
            int iO = lnrVar.O();
            Iterator it = lnrVar.o.iterator();
            while (it.hasNext()) {
                ((lnn) it.next()).n(iO, kwxVar);
            }
        }
        this.V.l(null);
        this.am = kwxVar != null;
        b();
    }

    public final void l(int i, llt lltVar) {
        if (i == this.an && a.Q(lltVar, this.ao)) {
            return;
        }
        this.an = i;
        this.ao = lltVar;
        if (i == 4 && lltVar == null) {
            return;
        }
        this.U.B(i, lltVar);
    }

    public final void m() {
        lmi lmiVar = this.V;
        if (lmiVar != null) {
            mfy mfyVar = this.A;
            SubtitlesOverlay subtitlesOverlay = this.B;
            fbt fbtVar = this.C;
            lmiVar.t = mfyVar;
            lmiVar.u = fbtVar;
            a.H(fbtVar == null || lmiVar.i);
            mfyVar.l(lmiVar);
            mfyVar.i(true);
            int i = lmiVar.M;
            if (i != -1) {
                lmiVar.t.f(i, lmiVar.N);
            } else if (lmiVar.N != -1) {
                i = -1;
                lmiVar.t.f(i, lmiVar.N);
            }
            lmiVar.h();
            if (lmiVar.b.cw() && fbtVar == null) {
                ezd ezdVar = lmiVar.l;
                eyu eyuVarE = ezdVar.e();
                eyuVarE.M = true;
                ezdVar.k(new eyv(eyuVarE));
                lmiVar.I = true;
            }
            lmiVar.r(ieg.a);
            if (subtitlesOverlay != null) {
                eka ekaVarAp = lmiVar.f.ap(lmiVar.y[2]);
                ekaVarAp.e(WVMediaCrypto.TYPE);
                ekaVarAp.d(subtitlesOverlay);
                ekaVarAp.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, xlr] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, yfo] */
    public final lmi n() {
        if (this.V == null) {
            kdj kdjVar = this.as;
            llw llwVar = this.n;
            lnu lnuVar = this.p;
            idy idyVar = this.ag;
            boolean z = this.ah;
            idr idrVar = this.ai;
            lnr lnrVar = this.o;
            lux luxVar = this.y;
            boolean z2 = this.ad;
            WindowManager windowManager = this.Z;
            tst tstVar = this.al;
            ?? r12 = kdjVar.a;
            boolean z3 = r12.getBoolean(krh.ADAPTIVE_DISABLE_HD_ON_MOBILE_NETWORK, false);
            boolean z4 = r12.getBoolean(krh.ENABLE_SURROUND_SOUND, true);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            lkt lktVar = (lkt) kdjVar.b;
            lfn lfnVar = (lfn) lktVar.b.b();
            lfnVar.getClass();
            String str = (String) lktVar.a.b();
            str.getClass();
            Object obj = lktVar.e;
            ?? r1 = lktVar.d;
            Context contextA = ((rgq) obj).a();
            idf idfVar = (idf) r1.b();
            idfVar.getClass();
            ?? r13 = lktVar.f;
            ?? r9 = lktVar.c;
            Object objB = r13.b();
            Object objB2 = r9.b();
            defaultDisplay.getClass();
            llwVar.getClass();
            luxVar.getClass();
            idrVar.getClass();
            wfn wfnVar = new wfn(lfnVar, str, contextA, idfVar, (kuw) objB, (kwy) objB2, defaultDisplay, llwVar, luxVar, idrVar, z4);
            mdw mdwVar = (mdw) kdjVar.c;
            lfn lfnVar2 = (lfn) mdwVar.c.b();
            lfnVar2.getClass();
            Object obj2 = mdwVar.i;
            ?? r122 = mdwVar.e;
            kwy kwyVarA = ((kqn) obj2).b();
            mem memVar = (mem) r122.b();
            memVar.getClass();
            ?? r132 = mdwVar.d;
            ?? r14 = mdwVar.a;
            Object objB3 = r132.b();
            nuh nuhVar = (nuh) r14.b();
            nuhVar.getClass();
            ?? r15 = mdwVar.f;
            Object obj3 = mdwVar.b;
            ?? r16 = mdwVar.h;
            ?? r0 = mdwVar.g;
            Object objB4 = r15.b();
            Context contextA2 = ((rgq) obj3).a();
            ?? B = r16.b();
            lie lieVar = (lie) r0.b();
            lieVar.getClass();
            lnuVar.getClass();
            lnrVar.getClass();
            idyVar.getClass();
            tstVar.getClass();
            this.V = new lmi(lfnVar2, kwyVarA, memVar, (kwy) objB3, nuhVar, (lme) objB4, contextA2, B, lieVar, this, lnuVar, lnrVar, idyVar, wfnVar, z3, z, z2, this);
        }
        lmi lmiVar = this.V;
        lmiVar.D = this.R;
        return lmiVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        a.ab(this.V != null);
        if (i == -3) {
            this.V.o(0.1f);
        } else if (i == -2) {
            this.aq = this.V.s();
            h();
        } else if (i == -1) {
            h();
            a.ab(this.V != null);
            if (this.aj) {
                this.V.j(false);
            }
        } else if (i == 1) {
            o();
            this.V.o(1.0f);
            if (this.ap == -2 && this.aq && this.V.b() == 4) {
                this.V.k(true);
            }
        }
        this.ap = i;
    }
}

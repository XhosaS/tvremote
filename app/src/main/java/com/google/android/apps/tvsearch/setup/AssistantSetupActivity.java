package com.google.android.apps.tvsearch.setup;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.job.JobScheduler;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import com.google.android.katniss.R;
import defpackage.ab;
import defpackage.abvo;
import defpackage.adzd;
import defpackage.adzf;
import defpackage.adzh;
import defpackage.adzk;
import defpackage.agow;
import defpackage.agqq;
import defpackage.agte;
import defpackage.agum;
import defpackage.agvb;
import defpackage.ahal;
import defpackage.ahbt;
import defpackage.ahkr;
import defpackage.bq;
import defpackage.bw;
import defpackage.ewm;
import defpackage.ewo;
import defpackage.eyp;
import defpackage.ezc;
import defpackage.fcu;
import defpackage.fda;
import defpackage.fdc;
import defpackage.fdd;
import defpackage.feq;
import defpackage.ffo;
import defpackage.ffp;
import defpackage.fro;
import defpackage.fsb;
import defpackage.ftw;
import defpackage.fvd;
import defpackage.fws;
import defpackage.fwx;
import defpackage.ghp;
import defpackage.ghr;
import defpackage.gph;
import defpackage.gta;
import defpackage.gte;
import defpackage.gtu;
import defpackage.gtw;
import defpackage.gvi;
import defpackage.gvn;
import defpackage.gvw;
import defpackage.gyx;
import defpackage.gzb;
import defpackage.iaw;
import defpackage.iax;
import defpackage.iay;
import defpackage.iba;
import defpackage.icz;
import defpackage.idj;
import defpackage.idl;
import defpackage.idu;
import defpackage.ifk;
import defpackage.ifl;
import defpackage.ifm;
import defpackage.ifo;
import defpackage.ifr;
import defpackage.ifs;
import defpackage.ift;
import defpackage.ige;
import defpackage.iow;
import defpackage.iox;
import defpackage.ioy;
import defpackage.ipa;
import defpackage.ipb;
import defpackage.ipc;
import defpackage.ipd;
import defpackage.ipe;
import defpackage.ipx;
import defpackage.ire;
import defpackage.irh;
import defpackage.irk;
import defpackage.jrs;
import defpackage.jru;
import defpackage.uq;
import defpackage.ur;
import defpackage.vd;
import defpackage.vtm;
import defpackage.wyo;
import defpackage.ycg;
import defpackage.ycm;
import defpackage.ylx;
import defpackage.yni;
import defpackage.yrn;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zfc;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;
import defpackage.zyh;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AssistantSetupActivity extends ige implements ioy, ipa, iaw, ezc {
    public agow A;
    public agow B;
    public agow C;
    public fsb D;
    public Supplier E;
    public gph F;
    public jrs G;
    public gzb H;
    public ffp I;
    public JobScheduler J;
    public gtu K;
    public gtw L;
    public zyh M;
    public zyh N;
    public agte O;
    public agow P;
    public ftw Q;
    public agow R;
    public agow S;
    public PackageManager T;
    public gte U;
    public agow V;
    public agow W;
    public agow X;
    public agow Y;
    public icz Z;
    public zyd aB;
    public zyd aC;
    public yni aD;
    public ylx aE;
    public boolean aG;
    public ycg aH;
    Optional aI;
    public Optional aJ;
    public Optional aK;
    ycg aL;
    boolean aM;
    public boolean aN;
    public Account aO;
    boolean aP;
    public boolean aQ;
    boolean aR;
    boolean aS;
    public boolean aT;
    public boolean aU;
    final ewm aV;

    @Deprecated
    final List aW;
    public final List aX;
    public final Runnable aY;
    public eyp aZ;
    public idl aa;
    public idu ab;
    public Supplier ac;
    public ipe ad;
    public iow ae;
    public irh af;
    public agow ag;
    public agow ah;
    public agow ai;
    public gta aj;
    public vtm ak;
    public ghp al;
    public ghr am;
    public fvd an;
    public ffo ao;
    public Executor ap;
    public agow aq;
    public ift ar;
    public fcu ba;
    public int bb;
    int bd;
    int be;
    public gvn bf;
    public ewo bg;
    private final Runnable bk;
    protected ur p;
    public Supplier q;
    public iax r;
    public iba s;
    public fro t;
    public ipx u;
    public Supplier v;
    public fda w;
    public fdd x;
    public agte y;
    public ahbt z;
    public static final zdy l = zdy.h("com/google/android/apps/tvsearch/setup/AssistantSetupActivity");
    private static final Duration bh = Duration.ofSeconds(3);
    private static final Duration bi = Duration.ofSeconds(20);
    public static final Duration m = Duration.ofMillis(300);
    static final Duration n = Duration.ofSeconds(10);
    public final Handler o = new Handler(Looper.getMainLooper());
    public abvo as = abvo.b;
    public String at = "en-US";
    public boolean au = false;
    public boolean av = false;
    public boolean aw = false;
    public boolean ax = false;
    public boolean ay = false;
    public boolean az = false;
    boolean aA = false;
    public boolean aF = false;
    protected int bc = 1;
    private Optional bj = Optional.empty();
    private int bl = 1;

    public AssistantSetupActivity() {
        ycg ycgVar = ycg.DATA_SHARING_CONSENT_UNKNOWN;
        this.aH = ycgVar;
        this.aI = Optional.empty();
        this.aJ = Optional.empty();
        this.aK = Optional.empty();
        this.bd = 1;
        this.be = 1;
        this.aL = ycgVar;
        this.aM = false;
        this.aN = false;
        this.aO = null;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        this.aS = false;
        this.aT = false;
        this.aU = false;
        this.aV = new ewm() { // from class: ieu
            @Override // defpackage.ewm
            public final void a() {
                AssistantSetupActivity assistantSetupActivity = this.a;
                assistantSetupActivity.f(adzd.HOME_BUTTON);
                if (assistantSetupActivity.al()) {
                    ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "<init>", 475, "AssistantSetupActivity.java")).u("Do not allow to exit by HOME button for OOBE started by device setup.");
                } else {
                    ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "<init>", 478, "AssistantSetupActivity.java")).u("Exits OOBE by HOME button.");
                    assistantSetupActivity.finish();
                }
            }
        };
        this.aW = new ArrayList();
        this.aX = new ArrayList();
        this.bk = new Runnable() { // from class: ifb
            @Override // java.lang.Runnable
            public final void run() {
                AssistantSetupActivity assistantSetupActivity = this.a;
                zyd zydVar = assistantSetupActivity.aC;
                if (zydVar == null || zydVar.isDone()) {
                    return;
                }
                ((zdv) ((zdv) ((zdv) AssistantSetupActivity.l.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "<init>", 531, "AssistantSetupActivity.java")).u("Cast Service info taking too long to load.");
                assistantSetupActivity.aC.cancel(false);
            }
        };
        this.aY = new Runnable() { // from class: ifc
            @Override // java.lang.Runnable
            public final void run() {
                AssistantSetupActivity assistantSetupActivity = this.a;
                zyd zydVar = assistantSetupActivity.aB;
                if (zydVar == null || zydVar.isDone()) {
                    return;
                }
                assistantSetupActivity.ad.e(ipd.b, null);
                zyd zydVar2 = assistantSetupActivity.aB;
                if (zydVar2 != null) {
                    zydVar2.cancel(false);
                }
            }
        };
    }

    private final void ar() {
        zxn.p(this.aC, wyo.f(new ifr(this)), zwk.a);
    }

    private final void au(final int i, final boolean z) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.ap.execute(wyo.h(new Runnable() { // from class: ifj
                @Override // java.lang.Runnable
                public final void run() {
                    AssistantSetupActivity assistantSetupActivity = this.a;
                    int i2 = i;
                    boolean z2 = z;
                    jrs jrsVar = assistantSetupActivity.G;
                    if (z2) {
                        jrsVar.a(i2);
                    } else {
                        jrsVar.c(i2);
                    }
                }
            }));
        } else if (z) {
            this.G.a(i);
        } else {
            this.G.c(i);
        }
    }

    private final void av(final String str) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.ap.execute(wyo.h(new Runnable() { // from class: iex
                @Override // java.lang.Runnable
                public final void run() {
                    ((jru) this.a.G).d(str, jru.a);
                }
            }));
            return;
        }
        ((jru) this.G).d(str, jru.a);
    }

    public int C() {
        return R.raw.setup_vp_animation_watson;
    }

    public final int D() {
        zyd zydVar = this.aB;
        if (zydVar == null) {
            return 2;
        }
        if (zydVar.isCancelled()) {
            return 3;
        }
        if (!this.aB.isDone()) {
            return 2;
        }
        try {
            return ((Boolean) this.aB.get()).booleanValue() ? 0 : 1;
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) l.d()).p(e)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "getVoiceMatchAvailabilityState", (char) 2140, "AssistantSetupActivity.java")).u("Unexpected status for voice match info.");
            return 1;
        }
    }

    public Bundle F() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("suppress_assistant_setup", true);
        bundle.putBoolean("commit_hotword_permission", false);
        bundle.putBoolean("caller_log_client_setup_event", true);
        bundle.putBoolean("start_from_setup_wraith", al());
        return bundle;
    }

    public Duration L() {
        Duration duration = gvi.a;
        return gvi.a;
    }

    public final String M(Account account) {
        return account == null ? "" : account.name;
    }

    public final String N(Account account) {
        return account == null ? "" : account.name;
    }

    public void O() {
        ap(0);
        finish();
    }

    public final void P() {
        if (this.aR) {
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "checkSettingsDone", 1724, "AssistantSetupActivity.java")).x("%s", "ASSISTANT_SETTINGS_MISSING_CREDENTIAL: See go/katniss-testing or contact Google");
            if (this.bb == 1 && this.aS) {
                av("ASSISTANT_SETTINGS_MISSING_CREDENTIAL: See go/katniss-testing or contact Google");
            } else {
                this.ad.e(ipd.j, null);
                if (!((Boolean) this.ag.a()).booleanValue() || this.ar.h != 1 || !al()) {
                    au(R.string.try_again_later, false);
                }
            }
            this.ad.c(adzk.ERROR);
            U(false);
            return;
        }
        if (this.aQ) {
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "checkSettingsDone", 1744, "AssistantSetupActivity.java")).x("%s", "ASSISTANT_SETTINGS_MISSING_CREDENTIAL: See go/katniss-testing or contact Google");
            if (this.bb == 1 && this.aS) {
                av("ASSISTANT_SETTINGS_MISSING_CREDENTIAL: See go/katniss-testing or contact Google");
            } else {
                this.ad.e(ipd.j, null);
                au(R.string.try_again_later, false);
            }
            this.ad.c(adzk.ERROR);
            U(false);
            return;
        }
        if (this.av && this.au && ((this.ax || this.aI.isEmpty()) && this.aw && this.ay && this.az)) {
            this.ar.b(ire.a);
        } else {
            ((zdv) ((zdv) ((zdv) l.b()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "checkSettingsDone", 1765, "AssistantSetupActivity.java")).u("Not all the Settings are done.");
        }
    }

    public void Q() {
        gph gphVar;
        if (isFinishing()) {
            return;
        }
        this.af.e(getIntent());
        if (this.F == gph.a) {
            if (this.af.g()) {
                setTheme(R.style.Theme_KatnissSetupAmati_M3);
            } else {
                setTheme(R.style.Theme_KatnissSetup_AmatiBlack);
            }
        }
        Intent intent = getIntent();
        if (this.af.f(intent, "START_VIA_MIC_PRESS") && this.aZ.b()) {
            if (!this.aZ.d.equals("assistantSetupActivityKey")) {
                ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 713, "AssistantSetupActivity.java")).u("Do not begin an AssistantSetupActivity instance if another setup activity is visible");
                this.ad.c(adzk.SETUP_BLOCKED_BY_EXISTING_INSTANCE);
                finish();
                return;
            }
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 711, "AssistantSetupActivity.java")).u("This is the visible activity, so proceeding with setup.");
        }
        if (this.af.f(intent, "START_POST_SETUP_OOBE_VIA_MIC_PRESS")) {
            this.bc = 13;
            if (this.K.n().size() > 1 && this.aa.ad((Account) this.K.n().get(0))) {
                this.bc = 15;
            }
        } else if (this.af.f(intent, "START_POST_SETUP_OOBE_VIA_AUTO_LOGOUT_REENTER_PASSWORD")) {
            this.bc = 14;
        }
        this.J.cancel(16);
        this.aO = this.af.a(getIntent());
        zdy zdyVar = l;
        zdv zdvVar = (zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 745, "AssistantSetupActivity.java");
        Account account = this.aO;
        zdvVar.x("Account type used for setup is %s", account != null ? account.type : null);
        boolean z = this.aO != null;
        this.aG = z;
        this.bj = Optional.of(Boolean.valueOf(z));
        if (!this.aM) {
            ae(this.aa);
        }
        if (this.aG) {
            this.ae.b();
        }
        if (this.bc == 1) {
            this.bc = 2;
            Intent intent2 = getIntent();
            if (intent2 != null && !intent2.getBooleanExtra("intent_started_by_katniss", false) && Objects.equals(intent2.getAction(), "com.google.assistant.GOOGLE_SETUP")) {
                this.bc = 6;
                if (this.aa.ad(this.aO)) {
                    ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 770, "AssistantSetupActivity.java")).u("Setup flow is invoked but skipped as it's been done before.");
                    S(false, adzk.SETUP_ALREADY_DONE);
                    return;
                }
            } else if (getIntent().hasExtra("is_intent_from_setting") && getIntent().getBooleanExtra("is_intent_from_setting", false)) {
                this.bc = 3;
                this.aA = true;
                this.aF = true;
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 781, "AssistantSetupActivity.java")).u("Assistant setup invoked from Settings");
            } else if (getIntent().getBooleanExtra("assistant_row", false)) {
                this.bc = 8;
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 784, "AssistantSetupActivity.java")).u("Assistant setup invoked by Assistant Row");
            } else if (getIntent().hasExtra("assistant_enabled")) {
                this.aA = getIntent().getBooleanExtra("assistant_enabled", false);
                this.bc = 4;
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 791, "AssistantSetupActivity.java")).x("Assistant setup invoked by intent with extra assistant_enabled = %s", Boolean.valueOf(this.aA));
                if (!this.aA) {
                    ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 795, "AssistantSetupActivity.java")).u("Setup flow is skipped due to extra assistant_enabled being false.");
                    S(false, adzk.UNSUPPORTED_LOCALE);
                    return;
                }
            } else if (getIntent().getBooleanExtra("start_from_dsc", false)) {
                this.bc = 9;
            }
        }
        iow iowVar = this.ae;
        ((zdv) iox.a.b().q("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl", "markStartSyncExperiments", 99, "SetupLoadingTrackerImpl.kt")).u("Starting sync experiments stopwatch");
        iox ioxVar = (iox) iowVar;
        yrn yrnVar = ioxVar.g;
        yrnVar.d();
        yrnVar.e();
        yrn yrnVar2 = ioxVar.h;
        if (!yrnVar2.a) {
            yrnVar2.e();
        }
        zxn.p(zxn.n(this.aj.a(this.aO), bi.toSeconds(), TimeUnit.SECONDS, this.M), wyo.f(new ifk(this)), this.N);
        setContentView(R.layout.setup_assistant_container);
        setTitle("");
        if ((!((Boolean) this.X.a()).booleanValue() && !al()) || (gphVar = this.F) == gph.b || gphVar == gph.c) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "doSetup", 835, "AssistantSetupActivity.java")).u("Start loading cast info.");
            if (((Boolean) this.ai.a()).booleanValue()) {
                this.aC = this.x.a();
            } else {
                this.aC = this.w.b();
            }
            ar();
        }
        this.H.a(this.y, new gyx[]{gyx.k}, new agum() { // from class: iez
            @Override // defpackage.agum
            public final Object a() {
                gph gphVar2;
                final AssistantSetupActivity assistantSetupActivity = this.a;
                assistantSetupActivity.aT = true;
                ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "startSetupFlow", 1779, "AssistantSetupActivity.java")).x("start setup flow. Activity running: %s", Boolean.valueOf(assistantSetupActivity.aT));
                if (assistantSetupActivity.aT) {
                    assistantSetupActivity.ar = new ift(assistantSetupActivity.q, assistantSetupActivity, assistantSetupActivity.v, assistantSetupActivity.E, assistantSetupActivity.bb, assistantSetupActivity.F, assistantSetupActivity.K, assistantSetupActivity.aa, assistantSetupActivity.ab, assistantSetupActivity.ad);
                    ift iftVar = assistantSetupActivity.ar;
                    iox ioxVar2 = (iox) assistantSetupActivity.ae;
                    boolean z2 = ioxVar2.i || ioxVar2.j;
                    irf irfVar = assistantSetupActivity.getIntent().getBooleanExtra("start_from_dsc", false) ? irf.b : irf.a;
                    ((zdv) ((zdv) ift.a.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupFlow", "start", 146, "AssistantSetupFlow.java")).x("The current Assistant setup flow is: %s", irfVar);
                    iftVar.g = irfVar;
                    iftVar.d = null;
                    iftVar.c = (z2 && iftVar.e.aO == null && ((gphVar2 = iftVar.f) == gph.b || gphVar2 == gph.c)) ? irg.a : irg.k;
                    bq bqVarA = iftVar.a(iftVar.c);
                    if (iftVar.c == irg.a) {
                        int iE = iftVar.e(bqVarA);
                        int i = iftVar.h;
                        if (i == 1) {
                            i = iE;
                        }
                        iftVar.h = i;
                        iftVar.i = iE;
                    }
                    AssistantSetupActivity assistantSetupActivity2 = iftVar.e;
                    iftVar.d(bqVarA);
                    assistantSetupActivity2.ai(bqVarA, false);
                }
                if (assistantSetupActivity.aO != null) {
                    if (((Boolean) assistantSetupActivity.V.a()).booleanValue() && assistantSetupActivity.al()) {
                        assistantSetupActivity.u.b(assistantSetupActivity.M(assistantSetupActivity.aO), new agum() { // from class: ifd
                            @Override // defpackage.agum
                            public final Object a() {
                                assistantSetupActivity.T();
                                return agpu.a;
                            }
                        });
                    } else {
                        assistantSetupActivity.T();
                    }
                }
                return agpu.a;
            }
        });
    }

    public void R() {
        zyd zydVar = this.aC;
        if (zydVar == null || !zydVar.isDone()) {
            this.aP = true;
            feq.e(this.o, bh, this.bk);
            return;
        }
        this.aP = false;
        this.av = false;
        this.au = false;
        final ifo ifoVar = new ifo(this);
        if (this.bl != 2 && ((Boolean) this.A.a()).booleanValue()) {
            this.as = abvo.b;
        }
        this.w.h(new agvb() { // from class: iev
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                AssistantSetupActivity assistantSetupActivity = this.a;
                assistantSetupActivity.r.o(assistantSetupActivity.aO, irk.a.e(assistantSetupActivity.as, (String) obj, (String) obj2, (String) assistantSetupActivity.C.a(), assistantSetupActivity.aJ, assistantSetupActivity.at, assistantSetupActivity.aK, 3, assistantSetupActivity.F, assistantSetupActivity.aU), ifoVar, "AssistantSetupActivity");
                return agpu.a;
            }
        });
    }

    public void S(boolean z, adzk adzkVar) {
        this.ad.c(adzkVar);
        Set<adzf> setB = this.ad.b();
        if (z && !this.aa.ad(this.aO)) {
            this.aa.J(this.aO, idj.a, ak());
            this.an.a(N(this.aO), 5);
        }
        boolean z2 = true;
        ap(1);
        if (this.bc == 6) {
            finish();
            return;
        }
        if (this.bb == 1 || Objects.equals(this.af.d(this.T, getPackageName()), "61892cbb58e0bac6d6517a906a020fce25a9fa03")) {
            StringBuilder sb = new StringBuilder("Error with the following types: ");
            for (adzf adzfVar : setB) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(adzfVar.name());
                z2 = false;
            }
            sb.append(". ");
            if (setB.contains(adzf.ERROR_CHECK_AUTH_STATUS)) {
                sb.append("ERROR_CHECK_AUTH_STATUS: See go/katniss-testing or contact Google");
            }
            av(sb.toString());
        } else {
            this.ad.e(ipd.j, null);
            if (!((Boolean) this.ag.a()).booleanValue() || this.ar.h != 1 || !al()) {
                au(R.string.try_again_later, false);
            }
        }
        finish();
    }

    public final void T() {
        if (this.r.q()) {
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "fetchExistingSettings", 914, "AssistantSetupActivity.java")).u("Fetching of existing user settings already underway. Attaching a listener for the response.");
            this.r.k(this);
            this.ae.a();
            return;
        }
        Account accountB = this.aO;
        if (accountB != null && this.K.r(accountB)) {
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "fetchExistingSettings", 925, "AssistantSetupActivity.java")).u("It's kids mode, so check auth status of parent account instead.");
            accountB = this.K.b(this.aO);
        }
        ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "fetchExistingSettings", 928, "AssistantSetupActivity.java")).u("Checking auth status.");
        if (accountB == null) {
            aa(gvw.c);
        } else {
            this.bf.a(accountB, new ifl(this), "AssistantSetupActivity", L());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U(boolean r17) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.setup.AssistantSetupActivity.U(boolean):void");
    }

    public final /* synthetic */ void V(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult(5L, TimeUnit.SECONDS)).getParcelable("intent");
            if (intent != null) {
                startActivityForResult(intent, 1);
                return;
            }
            this.ad.e(ipd.m, null);
            this.ad.c(adzk.ERROR);
            aq(1);
            U(false);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.ad.e(ipd.n, e);
            this.ad.c(adzk.ERROR);
            aq(1);
            U(false);
        }
    }

    public void W() {
        this.am.R(2, 3);
    }

    public void X() {
        this.am.R(3, 3);
    }

    public final void Y() {
        iox ioxVar = (iox) this.ae;
        yrn yrnVar = ioxVar.f;
        Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
        durationOfNanos.getClass();
        ioxVar.b = durationOfNanos;
        ioxVar.d(adzh.FETCH_EXISTING_SETTINGS, ioxVar.b);
        yrnVar.d();
        yrnVar.e();
        this.w.h(new agvb() { // from class: iey
            /* JADX WARN: Removed duplicated region for block: B:100:0x0322  */
            @Override // defpackage.agvb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r17, java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 888
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iey.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
    }

    public final void Z(String str, String str2) {
        ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onCastServiceInfoReadyOrFailed", 1893, "AssistantSetupActivity.java")).u("Cast service info is ready.");
        if (str.isEmpty() || str2.isEmpty()) {
            this.ad.e(ipd.o, null);
        }
        this.o.removeCallbacks(this.bk);
        if (this.aP) {
            R();
        }
    }

    @Override // defpackage.iaw
    public final void a(Throwable th) {
        this.ad.e(ipd.a, null);
        if (this.bb == 1 && th.getMessage().contains("83905")) {
            this.aS = true;
            ((zdv) ((zdv) ((zdv) l.b()).p(th)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onFetchSettingsFailure", (char) 516, "AssistantSetupActivity.java")).u("ASSISTANT_SETTINGS_MISSING_CREDENTIAL: See go/katniss-testing or contact Google");
        }
        this.aw = true;
        this.ax = true;
        this.ay = true;
        this.aR = true;
        P();
    }

    public final void aa(gvw gvwVar) {
        ipb ipbVar;
        ipe ipeVar = this.ad;
        Account account = this.aO;
        if (account == null) {
            ipbVar = ipb.a;
        } else {
            String str = account.name;
            str.getClass();
            ipbVar = str.endsWith("@gmail.com") ? ipb.b : ipb.c;
        }
        ipeVar.d(new ipc(ipbVar, gvwVar));
        this.ad.e(ipd.e, null);
        S(false, adzk.ERROR);
    }

    public final void ab(boolean z) {
        this.al.f((String) this.B.a());
        this.al.m(((Boolean) this.S.a()).booleanValue());
        gph gphVar = this.F;
        gph gphVar2 = gph.a;
        if (gphVar == gphVar2) {
            if ((((Boolean) this.Y.a()).booleanValue() && al()) || ((Boolean) this.X.a()).booleanValue()) {
                ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onSyncComplete", 878, "AssistantSetupActivity.java")).u("Start loading latest cast info.");
                fdd fddVar = this.x;
                this.aC = ahkr.c(fddVar.b, 0, new fdc(fddVar, null), 3);
            } else {
                ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onSyncComplete", 881, "AssistantSetupActivity.java")).u("Start loading cast info.");
                if (((Boolean) this.ai.a()).booleanValue()) {
                    this.aC = this.x.a();
                } else {
                    this.aC = this.w.b();
                }
            }
            ar();
        }
        zdy zdyVar = l;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onSyncComplete", 890, "AssistantSetupActivity.java")).x("OOBE flags synced successfully: %b", this.S.a());
        if (z) {
            iox ioxVar = (iox) this.ae;
            ioxVar.i = true;
            yrn yrnVar = ioxVar.g;
            Duration durationOfNanos = Duration.ofNanos(yrnVar.b());
            durationOfNanos.getClass();
            ioxVar.d = durationOfNanos;
            ioxVar.d(adzh.LOAD_EXPERIMENTS_CONFIG, ioxVar.d);
            yrnVar.d();
            yrnVar.e();
        } else {
            this.ad.f();
            this.ad.e(ipd.d, null);
            iox ioxVar2 = (iox) this.ae;
            ioxVar2.j = true;
            yrn yrnVar2 = ioxVar2.g;
            Duration durationOfNanos2 = Duration.ofNanos(yrnVar2.b());
            durationOfNanos2.getClass();
            ioxVar2.d = durationOfNanos2;
            ioxVar2.d(adzh.LOAD_EXPERIMENTS_CONFIG_TIMEOUT, ioxVar2.d);
            yrnVar2.d();
            yrnVar2.e();
        }
        if (!this.aA) {
            this.aA = ((Boolean) this.v.get()).booleanValue();
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "processAssistantSupportedBit", 554, "AssistantSetupActivity.java")).x("Assistant supported bit from SearchSettings = %s", Boolean.valueOf(this.aA));
        }
        if (this.aA) {
            if (this.aa.ad(this.aO)) {
                this.aa.J(this.aO, idj.a, ak());
                this.an.a(N(this.aO), 5);
            }
            if (((Boolean) this.ah.a()).booleanValue() && this.F == gphVar2 && this.K.n().size() == 1) {
                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "processAssistantSupportedBit", 571, "AssistantSetupActivity.java")).u("Skipping legacy linking.");
                this.aU = true;
            }
            iox ioxVar3 = (iox) this.ae;
            yrn yrnVar3 = ioxVar3.g;
            Duration durationOfNanos3 = Duration.ofNanos(yrnVar3.b());
            durationOfNanos3.getClass();
            ioxVar3.e = durationOfNanos3;
            ioxVar3.d(adzh.PROCESS_ASSISTANT_SUPPORTED_BIT, ioxVar3.e);
            yrnVar3.f();
            ioxVar3.e();
            if (this.ae.c()) {
                ag();
            }
        } else {
            ((zdv) ((zdv) ((zdv) zdyVar.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "processAssistantSupportedBit", 580, "AssistantSetupActivity.java")).u("Assistant is not supported, skipping setup, unbranded UI will be shown.");
            S(false, adzk.UNSUPPORTED_LOCALE);
        }
        if (this.aA) {
            h(ire.f);
        }
    }

    public final void ac(final boolean z) {
        Account account;
        this.aI = Optional.of(Boolean.valueOf(z));
        if (this.r != null && (account = this.aO) != null) {
            this.aa.C(account, z);
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "setEnablePersonalResults", 1130, "AssistantSetupActivity.java")).x("%s personal results for user", true != z ? "Disabled" : "Enabled");
        }
        this.ax = false;
        final ifm ifmVar = new ifm(this);
        final boolean z2 = this.F == gph.a;
        this.w.h(new agvb() { // from class: ifi
            @Override // defpackage.agvb
            public final Object a(Object obj, Object obj2) {
                ymg ymgVarB;
                String str = (String) obj;
                AssistantSetupActivity assistantSetupActivity = this.a;
                boolean z3 = z;
                if (z2) {
                    ymgVarB = ird.b(z3, ((Boolean) assistantSetupActivity.ac.get()).booleanValue() ? Optional.of(Boolean.valueOf(z3)) : Optional.empty(), true, str, 3);
                } else {
                    ymgVarB = ird.b(z3, Optional.empty(), false, null, 3);
                }
                assistantSetupActivity.r.o(assistantSetupActivity.aO, ymgVarB, ifmVar, "AssistantSetupActivity");
                return agpu.a;
            }
        });
    }

    public final void ad(boolean z) {
        this.aJ = Optional.of(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ae(defpackage.idl r5) {
        /*
            r4 = this;
            android.accounts.Account r0 = r4.aO
            idj r0 = r5.e(r0)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L17
            if (r0 == r3) goto L14
            goto L1c
        L14:
            r4.bd = r1
            goto L1c
        L17:
            r4.bd = r3
            goto L1c
        L1a:
            r4.bd = r2
        L1c:
            android.accounts.Account r0 = r4.aO
            idh r0 = r5.d(r0)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L38
            if (r0 == r2) goto L35
            if (r0 == r3) goto L32
            if (r0 == r1) goto L2f
            goto L3c
        L2f:
            ycg r0 = defpackage.ycg.DATA_SHARING_CONSENT_DENIED_FROM_OOBE
            goto L3a
        L32:
            ycg r0 = defpackage.ycg.DATA_SHARING_CONSENT_DENIED
            goto L3a
        L35:
            ycg r0 = defpackage.ycg.DATA_SHARING_CONSENT_GRANTED
            goto L3a
        L38:
            ycg r0 = defpackage.ycg.DATA_SHARING_CONSENT_UNKNOWN
        L3a:
            r4.aL = r0
        L3c:
            java.util.function.Supplier r0 = r4.v
            java.lang.Object r0 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L87
            java.util.function.Supplier r0 = r4.E
            java.lang.Object r0 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L87
            android.accounts.Account r0 = r4.aO
            boolean r0 = r5.T(r0)
            if (r0 == 0) goto L87
            java.util.function.Supplier r0 = r4.v
            java.lang.Object r0 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L84
            java.util.function.Supplier r0 = r4.E
            java.lang.Object r0 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L84
            android.accounts.Account r0 = r4.aO
            boolean r5 = r5.R(r0)
            if (r5 == 0) goto L85
        L84:
            r1 = r3
        L85:
            r4.be = r1
        L87:
            r4.aM = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tvsearch.setup.AssistantSetupActivity.ae(idl):void");
    }

    public final void af(AccountManager accountManager) {
        accountManager.addAccount("com.google", null, null, null, null, new AccountManagerCallback() { // from class: iff
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                this.a.V(accountManagerFuture);
            }
        }, null);
    }

    public final void ag() {
        h(ire.e);
        if (this.r.q()) {
            return;
        }
        ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "startSetupFlowWithAllLoadingDone", 2111, "AssistantSetupActivity.java")).u("Removing fetch settings listeners as all settings has been loaded.");
        this.r.n(this);
    }

    public final void ah(zyd zydVar, Account account, boolean z) {
        ifs ifsVar = new ifs(this, account, z);
        zxn.p(zydVar, wyo.f(ifsVar), zwk.a);
    }

    public final void ai(bq bqVar, boolean z) {
        if (bqVar != null) {
            ab abVar = new ab(((bw) this).a.a.e);
            if (z) {
                abVar.r(R.animator.setup_open_enter, R.animator.setup_open_exit, 0, 0);
            } else {
                abVar.r(R.animator.setup_close_enter, R.animator.setup_close_exit, 0, 0);
            }
            abVar.q(R.id.assistant_container, bqVar, "AssistantSetupActivity");
            if (isFinishing() || isDestroyed()) {
                return;
            }
            abVar.i();
        }
    }

    public boolean aj() {
        return true;
    }

    public final boolean ak() {
        return this.ba.c(((Boolean) this.R.a()).booleanValue());
    }

    public boolean al() {
        return false;
    }

    public boolean am() {
        if (this.aa.ag() == 2) {
            return true;
        }
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("disable_play_marketing_video", false);
    }

    public boolean an(boolean z) {
        return !z;
    }

    public boolean ao() {
        return this.F == gph.b || this.F == gph.c;
    }

    public void ap(int i) {
        setResult(i);
    }

    public final void aq(int i) {
        this.bl = i;
        iba ibaVar = this.s;
        if (ibaVar != null) {
            boolean z = i == 2 || i == 4;
            ahal.e(ibaVar.b, null, 0, new iay(ibaVar, this.aO, z, irk.a.a(), null), 3);
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "setUdcPermissionOptState", 1196, "AssistantSetupActivity.java")).x("%s full assistant experience for user", true != z ? "Disabled" : "Enabled");
        }
    }

    @Override // defpackage.iaw
    public final void b() {
        this.u.b(M(this.aO), new agum() { // from class: ife
            @Override // defpackage.agum
            public final Object a() {
                this.a.Y();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ezc
    public final String c() {
        return "assistantSetupActivityKey";
    }

    @Override // defpackage.ipa
    public final void f(adzd adzdVar) {
        this.aW.add(adzdVar);
    }

    @Override // defpackage.ipa
    public final void g(ycm ycmVar) {
        this.aX.add(ycmVar);
    }

    @Override // defpackage.ioy
    public final void h(ire ireVar) {
        ift iftVar = this.ar;
        if (iftVar == null || !iftVar.c()) {
            return;
        }
        iftVar.b(ireVar);
    }

    @Override // defpackage.bw, defpackage.tt, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == 0) {
                ift iftVar = this.ar;
                if (iftVar == null || !iftVar.c()) {
                    return;
                }
                iftVar.b(ire.d);
                return;
            }
            if (this.K.n().size() != 1) {
                ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1386, "AssistantSetupActivity.java")).v("%d accounts retrieved. Going back to entry screen.", this.K.n().size());
                au(R.string.sign_in_with_google, true);
                this.ar.b(ire.d);
                return;
            }
            String str = ((Account) this.K.n().get(0)).name;
            this.L.a(str, fwx.PROFILE_LOCK_UNSPECIFIED);
            if (((Boolean) this.aq.a()).booleanValue()) {
                this.Q.a(str, fws.NETWORK_STATE_UNSPECIFIED);
            }
            this.aO = new Account(str, "com.google");
            ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1382, "AssistantSetupActivity.java")).u("New account added for setup");
            this.ae.b();
            T();
            return;
        }
        if (i != 5959) {
            if (i != 2) {
                ((zdv) ((zdv) ((zdv) l.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1453, "AssistantSetupActivity.java")).v("Unexpected requestCode: [%s], discarding results.", i);
                return;
            }
            if (i2 != -1) {
                if (i2 == 0) {
                    h(ire.d);
                    return;
                }
                return;
            } else {
                intent.getClass();
                if (intent.getIntExtra("dsc_setup_result", 3) == 1) {
                    h(ire.b);
                    return;
                } else {
                    h(ire.c);
                    return;
                }
            }
        }
        if (i2 == -1) {
            ift iftVar2 = this.ar;
            if (iftVar2 != null && iftVar2.c()) {
                int intExtra = intent.getIntExtra("HOTWORD_SETUP_RESULT", 8);
                Account accountC = this.K.c();
                String str2 = accountC != null ? accountC.name : "";
                if (intExtra == 2) {
                    ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1402, "AssistantSetupActivity.java")).u("Hotword setup completed and user accepted.");
                    this.Z.a(true, str2);
                    this.I.j();
                    h(ire.b);
                    return;
                }
                if (intExtra == 3) {
                    ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1408, "AssistantSetupActivity.java")).u("Hotword setup completed but user rejected.");
                    this.Z.a(false, str2);
                    h(ire.c);
                    return;
                }
                if (intExtra == 4) {
                    ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1414, "AssistantSetupActivity.java")).u("User cancelled OEM Hotword setup.");
                    this.Z.a(false, "");
                    h(ire.d);
                    return;
                } else if (intExtra == 6) {
                    ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1419, "AssistantSetupActivity.java")).u("Hotword is unavailable on this device. Continuing setup.");
                    h(ire.a);
                    return;
                } else if (intExtra != 7) {
                    ((zdv) ((zdv) ((zdv) l.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1429, "AssistantSetupActivity.java")).v("Unexpected result code received from OEM Hotword setup: [%s], continuing.", intExtra);
                    h(ire.a);
                    return;
                } else {
                    ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1423, "AssistantSetupActivity.java")).u("Hotword setup was not started because it was already granted. Continuing setup.");
                    this.Z.a(true, str2);
                    h(ire.a);
                    return;
                }
            }
            i2 = -1;
        }
        ((zdv) ((zdv) ((zdv) l.d()).r(zfc.MEDIUM)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onActivityResult", 1435, "AssistantSetupActivity.java")).I("Failed to finish OEM Hotword setup with resultCode: [%s], AssistantSetupFlow not null: [%s], AssistantSetupFlow started: [%s], continuing.", Integer.valueOf(i2), Boolean.valueOf(this.ar != null), Boolean.valueOf(this.ar.c()));
        h(ire.a);
    }

    @Override // defpackage.tt, android.app.Activity
    public final void onBackPressed() {
        f(adzd.BACK_BUTTON);
        ift iftVar = this.ar;
        if (iftVar == null || !iftVar.c()) {
            O();
        } else {
            iftVar.b(ire.d);
        }
    }

    @Override // defpackage.ige, defpackage.bw, defpackage.tt, defpackage.eq, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = dd(new vd(), this.h, new uq() { // from class: ifg
            @Override // defpackage.uq
            public final void a(Object obj) {
                AssistantSetupActivity assistantSetupActivity = this.a;
                assistantSetupActivity.ap(-1);
                assistantSetupActivity.finish();
            }
        });
        W();
        ((zdv) ((zdv) l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onCreate", 593, "AssistantSetupActivity.java")).u("Waiting for KatnissAccountManager to be ready before moving forward.");
        this.H.a(this.O, new gyx[]{gyx.r}, new agum() { // from class: ifh
            @Override // defpackage.agum
            public final Object a() {
                ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onCreate", 598, "AssistantSetupActivity.java")).u("KatnissAccountManager is ready. Moving forward.");
                this.a.Q();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.ige, defpackage.gf, defpackage.bw, android.app.Activity
    public void onDestroy() {
        int i;
        int i2;
        Optional optional;
        List list;
        ArrayList arrayList;
        ghr ghrVar;
        int i3;
        this.bg.b(this);
        this.bg = null;
        Optional optionalEmpty = Optional.empty();
        if (this.aa != null) {
            optionalEmpty = Optional.of(Boolean.valueOf(this.aO != null));
            this.aa.B("");
        }
        Optional optional2 = optionalEmpty;
        ift iftVar = this.ar;
        if (iftVar != null) {
            int i4 = iftVar.h;
            i2 = iftVar.i;
            i = i4;
        } else {
            i = 1;
            i2 = 1;
        }
        X();
        ghr ghrVar2 = this.am;
        int i5 = this.bc;
        Optional optional3 = this.bj;
        int i6 = this.bd;
        int i7 = this.bl;
        ycg ycgVar = this.aL;
        ycg ycgVar2 = this.aH;
        int i8 = this.be;
        Optional optional4 = this.aK;
        Optional optional5 = this.aI;
        Optional optional6 = this.aJ;
        adzk adzkVarA = this.ad.a();
        List list2 = this.aW;
        ArrayList arrayList2 = new ArrayList(this.ad.b());
        iox ioxVar = (iox) this.ae;
        if (ioxVar.c()) {
            optional = optional6;
            list = list2;
            arrayList = arrayList2;
            ghrVar = ghrVar2;
            i3 = i5;
        } else {
            optional = optional6;
            list = list2;
            arrayList = arrayList2;
            ghrVar = ghrVar2;
            i3 = i5;
            ((zdv) iox.a.d().q("com/google/android/apps/tvsearch/setup/initialloading/SetupLoadingTrackerImpl", "getSetupLoadingInfos", 66, "SetupLoadingTrackerImpl.kt")).u("Assistant setup finishing early when loading not done.");
        }
        List listX = agqq.x(ioxVar.k);
        List list3 = this.aX;
        ghrVar.J(i3, optional3, optional2, i6, i7, ycgVar, ycgVar2, i8, optional4, optional5, optional, adzkVarA, i, i2, list, arrayList, listX, list3, Optional.of(Boolean.valueOf(this.aN)));
        if (list3.size() > new HashSet(list3).size()) {
            ((zdv) ((zdv) l.d()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "onDestroy", 672, "AssistantSetupActivity.java")).u("Duplicate set up screen shown during OOBE.");
        }
        super.onDestroy();
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onPause() {
        this.aT = false;
        super.onPause();
    }

    @Override // defpackage.gf, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.bg.a(this, this.aV);
    }

    @Override // defpackage.bw, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.aT = true;
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.ao.w();
    }

    @Override // defpackage.gf, defpackage.bw, android.app.Activity
    public final void onStop() {
        this.ao.x();
        super.onStop();
    }
}

package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.assistant.audio.LibAAudioManager;
import com.google.assistant.sdk.libassistant.ActionExecutor;
import com.google.assistant.sdk.libassistant.AssistantEventListener;
import com.google.assistant.sdk.libassistant.AssistantManagerNative;
import com.google.assistant.sdk.libassistant.AudioInputEventListener;
import com.google.assistant.sdk.libassistant.AudioInputUtils;
import com.google.assistant.sdk.libassistant.DeviceStateListener;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhh implements jdt, jmt, gvx {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl");
    private static final icg[] ak = {icg.q, icg.r};
    private static final Duration al;
    public static final Duration b;
    public final gmd A;
    public final LibAAudioManager B;
    public final agow C;
    public final jma D;
    public final fki E;
    public final agow F;
    public final agow G;
    public final jia H;
    public final lzb I;
    public final agow J;
    public final agow K;
    public final iyj L;
    public final jml M;
    public final gvy N;
    public final ghr O;
    public final agow P;
    public final fbn Q;
    public boolean R;
    public boolean S;
    public Integer T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final Handler Z;
    private final agow aA;
    private final agow aB;
    private final gph aC;
    private final agow aD;
    private final jhv aE;
    private final agow aF;
    private final gtu aG;
    private final icj aH;
    private final agow aI;
    private final agow aJ;
    private final fxu aK;
    private final agow aL;
    private final agow aM;
    private final boolean aN;
    private final agow aO;
    private final gtg aP;
    private final agow aQ;
    private final agow aR;
    private final agow aS;
    private final agow aT;
    private final fmg aU;
    private final ztw aV;
    private final Supplier aW;
    private final gxt aX;
    private final agow aY;
    private final WindowManager aZ;
    public volatile boolean aa;
    public boolean ab;
    public final Runnable ac;
    public final Runnable ad;
    public final agxf ae;
    public AssistantManagerNative af;
    public ahdl ag;
    public final ahdb ah;
    public volatile jid ai;
    public final DeviceStateListener aj;
    private final ActivityManager am;
    private final jlr an;
    private final zyg ao;
    private final hxu ap;
    private final AudioManager aq;
    private final jmu ar;
    private final agte as;
    private final gpb at;
    private final boolean au;
    private final agow av;
    private final agow aw;
    private final agow ax;
    private final agow ay;
    private final agow az;
    private Bundle ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private Instant be;
    private Intent bf;
    private String bg;
    private List bh;
    private boolean bi;
    private boolean bj;
    private boolean bk;
    private int bl;
    private String bm;
    private final ahni bn;
    private boolean bo;
    private final BroadcastReceiver bp;
    private final ahni bq;
    private final ahni br;
    private final boolean bs;
    private final ahni bt;
    private final BroadcastReceiver bu;
    private final gyh bv;
    private final exz bw;
    public final AccessibilityManager c;
    public final fbj d;
    public final jmi e;
    public final agow f;
    public final Supplier g;
    public final agow h;
    public final Context i;
    public final ahbt j;
    public final agow k;
    public final jhr l;
    public final jcv m;
    public final agow n;
    public final agow o;
    public final agow p;
    public final boolean q;
    public final fjx r;
    public final Supplier s;
    public final jcy t;
    public final jrs u;
    public final gyy v;
    public final glk w;
    public final agow x;
    public final gfr y;
    public final aehf z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        durationOfMinutes.getClass();
        al = durationOfMinutes;
    }

    public jhh(AccessibilityManager accessibilityManager, ActivityManager activityManager, fbj fbjVar, jmi jmiVar, jlr jlrVar, agow agowVar, Supplier supplier, zyg zygVar, hxu hxuVar, AudioManager audioManager, agow agowVar2, jmu jmuVar, Context context, agte agteVar, ahbt ahbtVar, agow agowVar3, jhr jhrVar, gpb gpbVar, jcv jcvVar, boolean z, agow agowVar4, agow agowVar5, agow agowVar6, agow agowVar7, agow agowVar8, agow agowVar9, agow agowVar10, agow agowVar11, agow agowVar12, gph gphVar, agow agowVar13, agow agowVar14, jhv jhvVar, agow agowVar15, gyh gyhVar, boolean z2, fjx fjxVar, Supplier supplier2, jcy jcyVar, jrs jrsVar, gyy gyyVar, glk glkVar, gtu gtuVar, agow agowVar16, gfr gfrVar, exz exzVar, aehf aehfVar, ick ickVar, icj icjVar, gmd gmdVar, agow agowVar17, LibAAudioManager libAAudioManager, agow agowVar18, jma jmaVar, agow agowVar19, fxu fxuVar, agow agowVar20, agow agowVar21, fki fkiVar, agow agowVar22, boolean z3, agow agowVar23, agow agowVar24, gtg gtgVar, agow agowVar25, fex fexVar, agow agowVar26, jia jiaVar, lzb lzbVar, agow agowVar27, agow agowVar28, agow agowVar29, agow agowVar30, iyj iyjVar, fmg fmgVar, jml jmlVar, ztw ztwVar, gvy gvyVar, ghr ghrVar, Supplier supplier3, agow agowVar31, gxt gxtVar, agow agowVar32, WindowManager windowManager, fbn fbnVar) {
        activityManager.getClass();
        fbjVar.getClass();
        jmiVar.getClass();
        jlrVar.getClass();
        agowVar.getClass();
        zygVar.getClass();
        hxuVar.getClass();
        agowVar2.getClass();
        jmuVar.getClass();
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        agowVar3.getClass();
        jhrVar.getClass();
        gpbVar.getClass();
        jcvVar.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        agowVar9.getClass();
        agowVar10.getClass();
        agowVar11.getClass();
        agowVar12.getClass();
        agowVar13.getClass();
        jhvVar.getClass();
        agowVar15.getClass();
        fjxVar.getClass();
        jcyVar.getClass();
        gyyVar.getClass();
        glkVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        exzVar.getClass();
        aehfVar.getClass();
        ickVar.getClass();
        gmdVar.getClass();
        agowVar17.getClass();
        libAAudioManager.getClass();
        agowVar18.getClass();
        jmaVar.getClass();
        agowVar19.getClass();
        fxuVar.getClass();
        agowVar20.getClass();
        agowVar21.getClass();
        fkiVar.getClass();
        agowVar22.getClass();
        agowVar23.getClass();
        agowVar24.getClass();
        agowVar25.getClass();
        fexVar.getClass();
        agowVar26.getClass();
        lzbVar.getClass();
        agowVar27.getClass();
        agowVar28.getClass();
        agowVar29.getClass();
        agowVar30.getClass();
        iyjVar.getClass();
        jmlVar.getClass();
        ztwVar.getClass();
        gvyVar.getClass();
        ghrVar.getClass();
        agowVar31.getClass();
        agowVar32.getClass();
        windowManager.getClass();
        fbnVar.getClass();
        this.c = accessibilityManager;
        this.am = activityManager;
        this.d = fbjVar;
        this.e = jmiVar;
        this.an = jlrVar;
        this.f = agowVar;
        this.g = supplier;
        this.ao = zygVar;
        this.ap = hxuVar;
        this.aq = audioManager;
        this.h = agowVar2;
        this.ar = jmuVar;
        this.i = context;
        this.as = agteVar;
        this.j = ahbtVar;
        this.k = agowVar3;
        this.l = jhrVar;
        this.at = gpbVar;
        this.m = jcvVar;
        this.au = z;
        this.av = agowVar4;
        this.n = agowVar5;
        this.aw = agowVar6;
        this.ax = agowVar7;
        this.ay = agowVar8;
        this.az = agowVar9;
        this.aA = agowVar10;
        this.aB = agowVar11;
        this.o = agowVar12;
        this.aC = gphVar;
        this.aD = agowVar13;
        this.p = agowVar14;
        this.aE = jhvVar;
        this.aF = agowVar15;
        this.bv = gyhVar;
        this.q = z2;
        this.r = fjxVar;
        this.s = supplier2;
        this.t = jcyVar;
        this.u = jrsVar;
        this.v = gyyVar;
        this.w = glkVar;
        this.aG = gtuVar;
        this.x = agowVar16;
        this.y = gfrVar;
        this.bw = exzVar;
        this.z = aehfVar;
        this.aH = icjVar;
        this.A = gmdVar;
        this.aI = agowVar17;
        this.B = libAAudioManager;
        this.C = agowVar18;
        this.D = jmaVar;
        this.aJ = agowVar19;
        this.aK = fxuVar;
        this.aL = agowVar20;
        this.aM = agowVar21;
        this.E = fkiVar;
        this.F = agowVar22;
        this.aN = z3;
        this.G = agowVar23;
        this.aO = agowVar24;
        this.aP = gtgVar;
        this.aQ = agowVar25;
        this.aR = agowVar26;
        this.H = jiaVar;
        this.I = lzbVar;
        this.aS = agowVar27;
        this.J = agowVar28;
        this.aT = agowVar29;
        this.K = agowVar30;
        this.L = iyjVar;
        this.aU = fmgVar;
        this.M = jmlVar;
        this.aV = ztwVar;
        this.N = gvyVar;
        this.O = ghrVar;
        this.aW = supplier3;
        this.P = agowVar31;
        this.aX = gxtVar;
        this.aY = agowVar32;
        this.aZ = windowManager;
        this.Q = fbnVar;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.be = instant;
        this.bg = "";
        boolean z4 = true;
        this.bj = true;
        this.bk = true;
        gph gphVar2 = gph.a;
        this.bl = gphVar == gphVar2 ? 2 : 1;
        this.Z = new Handler(Looper.getMainLooper());
        this.ac = new Runnable() { // from class: jff
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F(false);
            }
        };
        this.ad = new Runnable() { // from class: jfg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F(true);
            }
        };
        this.ae = new jhf(this);
        this.bn = new ahnm(false);
        this.bp = new jfr(this);
        this.bq = new ahnm(false);
        this.br = new ahnm(false);
        this.ah = new ahdc(zygVar);
        if ((!((Boolean) agowVar20.a()).booleanValue() || !activityManager.isLowRamDevice() || gphVar != gphVar2 || Build.VERSION.SDK_INT < 34) && !((Boolean) agowVar21.a()).booleanValue()) {
            z4 = false;
        }
        this.bs = z4;
        this.ai = jid.a;
        this.bt = new ahnm(false);
        new ahnm(false);
        this.aj = new jhc(this);
        this.bu = new jgi(this);
        if (fexVar instanceof jlt) {
            at((jlt) fexVar);
        }
        icg[] icgVarArr = ak;
        int length = icgVarArr.length;
        ickVar.d(this, (icg[]) Arrays.copyOf(icgVarArr, 2));
        fxuVar.d(new fxk(fki.a, new jfn(this)));
        gtuVar.q(new jfo(this));
        fxuVar.d(new fxk(fjr.a, new jfq(this)));
        jmuVar.d(this);
        gvyVar.d(this);
    }

    private final Object aD(agsw agswVar) throws Throwable {
        Object objA = ahal.a(((Boolean) this.P.a()).booleanValue() ? this.ah : this.as, new jfu(this, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    private final void aE() {
        Intent intentD = d();
        if (intentD == null) {
            return;
        }
        String stringExtra = intentD.getStringExtra("query");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            try {
                A(stringExtra, true, intentD.getBooleanExtra("use_invocation_type_intent", false) ? jlv.INVOCATION_TYPE_INTENT : jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT);
                ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "processSavedIntent", 1674, "AssistantWrapperImpl.kt")).u("#sendTextQuery in #startAssistantTextQueryInteraction succeeded");
            } catch (CancellationException unused) {
            } catch (Exception e) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "processSavedIntent", 1683, "AssistantWrapperImpl.kt")).u("#sendTextQuery in #startAssistantTextQueryInteraction failed");
            }
        } else {
            try {
                H(intentD.getIntExtra("EXTRA_AUDIO_FD", -1));
                ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "processSavedIntent", 1692, "AssistantWrapperImpl.kt")).x("#startAssistantInteraction succeeded with intent: %s", intentD.getAction());
            } catch (CancellationException unused2) {
                intentD.getAction();
            } catch (Exception e2) {
                ((zdv) ((zdv) a.d()).p(e2).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "processSavedIntent", 1705, "AssistantWrapperImpl.kt")).x("#startAssistantInteraction failed with intent: %s", intentD);
            }
            this.ap.b();
        }
        D(null);
    }

    private final void aF(final AudioInputEventListener audioInputEventListener, final AudioInputUtils.MicType micType) {
        ax("registerAudioInputEventListener", new agux() { // from class: jeg
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((AssistantManagerNative) obj).getClass();
                AssistantManagerNative assistantManagerNative = this.a.af;
                if (assistantManagerNative != null) {
                    assistantManagerNative.registerAudioInputEventListener(micType, audioInputEventListener);
                }
                return agpu.a;
            }
        });
    }

    private final void aG(String str, final agux aguxVar) {
        if (R()) {
            ax(str, new agux() { // from class: jdv
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                    zdy zdyVar = jhh.a;
                    assistantManagerNative.getClass();
                    aguxVar.a(assistantManagerNative);
                    return agpu.a;
                }
            });
        } else {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "runIfAssistantRunning", 1986, "AssistantWrapperImpl.kt")).x("Method[%s] called while Assistant is not running.", str);
        }
    }

    private final void aH(final Bundle bundle) {
        ax("sendFcmMessage", new agux() { // from class: jfk
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Bundle bundle2 = bundle;
                Iterator<String> it = bundle2.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (bundle2.getString(next) != null) {
                        String string = bundle2.getString(next);
                        linkedHashMap.put(next, string != null ? string : "");
                    } else if (bundle2.getInt(next) != 0) {
                        linkedHashMap.put(next, String.valueOf(bundle2.getInt(next)));
                    } else if (bundle2.getLong(next) != 0) {
                        linkedHashMap.put(next, String.valueOf(bundle2.getLong(next)));
                    }
                }
                byte[] byteArray = bundle2.getByteArray("rawData");
                String string2 = bundle2.getString("google.c.sender.id");
                if (string2 == null) {
                    string2 = "749708704966";
                }
                assistantManagerNative.onFcmMessage("com.google.assistant.gcm", string2, linkedHashMap, byteArray != null ? new String(byteArray, agyo.a) : "");
                return agpu.a;
            }
        });
    }

    private final void aI(jid jidVar) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "setState", 451, "AssistantWrapperImpl.kt")).x("Setting state to [%s]", new qsk(jidVar));
        this.ai = jidVar;
    }

    @Override // defpackage.jdt
    public final void A(final String str, final boolean z, final jlv jlvVar) {
        str.getClass();
        jlvVar.getClass();
        if (str.length() == 0) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "sendTextQuery", 1253, "AssistantWrapperImpl.kt")).u("Sending empty text query.");
        }
        Runnable runnable = new Runnable() { // from class: jeh
            @Override // java.lang.Runnable
            public final void run() {
                final jhh jhhVar = this.a;
                final String str2 = str;
                final jlv jlvVar2 = jlvVar;
                final boolean z2 = z;
                jhhVar.ax("sendTextQuery", new agux() { // from class: jei
                    @Override // defpackage.agux
                    public final Object a(Object obj) {
                        AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                        assistantManagerNative.getClass();
                        jhh jhhVar2 = jhhVar;
                        lzb lzbVar = jhhVar2.I;
                        String str3 = str2;
                        lzbVar.D(str3);
                        jhhVar2.az(jlvVar2);
                        if (((Boolean) jhhVar2.G.a()).booleanValue()) {
                            ((gfn) jhhVar2.x.a()).a(rpm.bZ()).b().c();
                        } else {
                            gfq.b(jhhVar2.y, rpm.bZ(), null, null, 14);
                        }
                        boolean z3 = z2;
                        gmd gmdVar = jhhVar2.A;
                        gmdVar.b(gmc.f);
                        gmdVar.b(gmc.g);
                        if (z3) {
                            lzbVar.n();
                        }
                        assistantManagerNative.sendTextQuery(str3);
                        return agpu.a;
                    }
                });
            }
        };
        if (Z() == jlv.INVOCATION_TYPE_NOT_INVOKED) {
            runnable.run();
        } else {
            at(new jgy(this, runnable));
        }
    }

    @Override // defpackage.jdt
    public final void B(int i) {
        this.bl = i;
    }

    @Override // defpackage.jdt
    public final void C(final String str) {
        ax("setLocaleOverride", new agux() { // from class: jet
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                zdv zdvVar = (zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "setLocaleOverride$lambda$12", 1056, "AssistantWrapperImpl.kt");
                String str2 = str;
                zdvVar.x("Override locale to be %s", str2);
                assistantManagerNative.setLocaleOverride(str2);
                this.L.a();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void D(Intent intent) {
        Instant instantA = this.aV.a();
        instantA.getClass();
        this.be = instantA;
        this.bf = intent;
    }

    @Override // defpackage.jdt
    public final void E(final xdo xdoVar) {
        aG("screenProperties", new agux() { // from class: jee
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int iA;
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                xdo xdoVar2 = xdoVar;
                try {
                    int i = xdoVar2.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(xdoVar2.getClass()).a(xdoVar2);
                        if (iA < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(xdoVar2.getClass()).a(xdoVar2);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                            xdoVar2.memoizedSerializedSize = (Integer.MIN_VALUE & xdoVar2.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(xdoVar2.getClass()).m(xdoVar2, abwa.a(abvwVar));
                    abvwVar.K();
                    assistantManagerNative.setScreenProperties(bArr);
                    return agpu.a;
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + xdoVar2.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        });
    }

    @Override // defpackage.jdt
    public final void F(final boolean z) {
        ax("startAssistantHotword", new agux() { // from class: jdx
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                jhh jhhVar = this.a;
                if (!jhhVar.V()) {
                    ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "startAssistantHotword$lambda$13", 1065, "AssistantWrapperImpl.kt")).u("Hotword not started based on #shouldTurnOnHotword");
                    return agpu.a;
                }
                boolean z2 = z;
                jhhVar.aa = true;
                assistantManagerNative.startAudioInput(AudioInputUtils.MicType.FAR_FIELD, -1, -1);
                if (z2 && jhhVar.X) {
                    assistantManagerNative.startReferenceAudio();
                }
                jhhVar.V = false;
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void G(final int i) {
        ax("startAssistantHotwordWithDspStream", new agux() { // from class: jey
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                jhh jhhVar = this.a;
                jcy jcyVar = jhhVar.t;
                if (jcyVar.b() && !jcyVar.d()) {
                    ((zdv) jhh.a.d().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "startAssistantHotwordWithDspStream$lambda$14", 1087, "AssistantWrapperImpl.kt")).u("Hotword after DSP trigger not started due to physical hotword mic toggle off.");
                    return agpu.a;
                }
                int i2 = i;
                jhhVar.aa = false;
                assistantManagerNative.startAudioInput(AudioInputUtils.MicType.FAR_FIELD, i2, -1);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void H(final int i) {
        aG("startAssistantInteraction", new agux() { // from class: jel
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                jhh jhhVar = this.a;
                jhhVar.Z.removeCallbacks(jhhVar.ac);
                jhhVar.I.n();
                if (jhhVar.q && ((Boolean) jhhVar.s.get()).booleanValue() && jhhVar.T()) {
                    jhhVar.aa = false;
                    assistantManagerNative.stopAudioInput(AudioInputUtils.MicType.FAR_FIELD);
                }
                int i2 = i;
                if (((Boolean) jhhVar.n.a()).booleanValue()) {
                    ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "startAssistantInteraction$lambda$15", 1113, "AssistantWrapperImpl.kt")).u("Near field FD invoke.");
                    assistantManagerNative.invokeAssistantWithAudioFd(i2);
                } else {
                    jhhVar.T = Integer.valueOf(i2);
                    jhhVar.K(AudioInputUtils.MicType.NEAR_FIELD);
                    assistantManagerNative.startAssistantInteractionWithMicType(AudioInputUtils.MicType.NEAR_FIELD);
                    agow agowVar = jhhVar.k;
                    if (!((Boolean) agowVar.a()).booleanValue() || (((Boolean) agowVar.a()).booleanValue() && jhhVar.U)) {
                        if (!jhhVar.U) {
                            jhhVar.O.G(1);
                        }
                        jhhVar.I();
                    }
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void I() {
        if (this.T != null) {
            this.A.m(gmc.a);
            if (((Boolean) this.G.a()).booleanValue()) {
                ((gfn) this.x.a()).a(rpm.bs()).b().c();
            } else {
                gfq.b(this.y, rpm.bs(), null, null, 14);
            }
            ax("startAudioInput", new agux() { // from class: jfl
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                    assistantManagerNative.getClass();
                    jhh jhhVar = this.a;
                    AudioInputUtils.MicType micType = AudioInputUtils.MicType.NEAR_FIELD;
                    Integer num = jhhVar.T;
                    if (num == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    assistantManagerNative.startAudioInput(micType, -1, num.intValue());
                    jhhVar.T = null;
                    return agpu.a;
                }
            });
        }
    }

    @Override // defpackage.jdt
    public final void J() {
        aG("stopAllTts", new agux() { // from class: jea
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "stopAllTts$lambda$17", 1166, "AssistantWrapperImpl.kt")).u("Stopping all TTS");
                assistantManagerNative.stopAllTts();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void K(final AudioInputUtils.MicType micType) {
        micType.getClass();
        ax("stopAssistantAudioInput", new agux() { // from class: jfj
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                assistantManagerNative.stopAudioInput(micType);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void L(final boolean z) {
        ax("stopAssistantHotword", new agux() { // from class: jfb
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                this.a.aa = false;
                assistantManagerNative.stopAudioInput(AudioInputUtils.MicType.FAR_FIELD);
                if (z) {
                    assistantManagerNative.stopReferenceAudio();
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void M() {
        K(AudioInputUtils.MicType.NEAR_FIELD);
        aG("stopTopInteraction", new agux() { // from class: jev
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                ((zdv) ((zdv) jhh.a.b()).r(zfc.SMALL).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "stopTopInteraction$lambda$20", 1186, "AssistantWrapperImpl.kt")).u("Stopping Top Interaction");
                assistantManagerNative.stopTopInteraction();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void N(String str) {
        this.bg = str;
    }

    @Override // defpackage.jdt
    public final void O(List list) {
        this.bh = list;
    }

    @Override // defpackage.jdt
    public final boolean P() {
        return this.U;
    }

    @Override // defpackage.jdt
    public final boolean Q() {
        return this.S;
    }

    @Override // defpackage.jdt
    public final boolean R() {
        return this.ai == jid.d;
    }

    @Override // defpackage.jdt
    public final boolean S() {
        return this.R;
    }

    @Override // defpackage.jdt
    public final boolean T() {
        return this.aH.i(icg.c, false) && this.r.b == foc.TOGGLE_ON;
    }

    @Override // defpackage.jdt
    public final boolean U() {
        return this.bl == 2;
    }

    @Override // defpackage.jdt
    public final boolean V() {
        jcy jcyVar = this.t;
        boolean zE = jcyVar.e();
        zdy zdyVar = a;
        zdv zdvVar = (zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "shouldTurnOnHotword", 1412, "AssistantWrapperImpl.kt");
        boolean z = this.q;
        qsh qshVar = new qsh(z);
        Supplier supplier = this.s;
        Object obj = supplier.get();
        obj.getClass();
        qsh qshVar2 = new qsh(((Boolean) obj).booleanValue());
        qsh qshVar3 = new qsh(T());
        qsh qshVar4 = new qsh(this.bj);
        qsh qshVar5 = new qsh(zE);
        gpb gpbVar = this.at;
        zdvVar.L("hotword=%s, hotwordSupported=%s, isHotwordAcceptedAndToggled=%s, isScreenOn=%s, isScreenlessSupported=%s, isDeviceProvisioned=%s, hardwareHotwordMicOn=%s", qshVar, qshVar2, qshVar3, qshVar4, qshVar5, new qsh(gpbVar.a()), new qsh(this.bk));
        if (!((Boolean) this.o.a()).booleanValue()) {
            return z && ((Boolean) supplier.get()).booleanValue() && T() && (this.bj || zE) && gpbVar.a() && this.bk;
        }
        boolean zF = jcyVar.f(true);
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "shouldTurnOnHotword", 1429, "AssistantWrapperImpl.kt")).x("allowedInEnergyMode=%s", new qsh(zF));
        return z && ((Boolean) supplier.get()).booleanValue() && T() && (this.bj || (zE && zF)) && gpbVar.a() && this.bk;
    }

    @Override // defpackage.jdt
    public final void W() {
        ap("device provision");
    }

    @Override // defpackage.jdt
    public final void X(final byte[] bArr, final AssistantManagerNative.VoicelessOptions voicelessOptions) {
        voicelessOptions.getClass();
        aG("sendVoicelessInteraction", new agux() { // from class: jdw
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                jhh jhhVar = this.a;
                if (((Boolean) jhhVar.G.a()).booleanValue()) {
                    ((gfn) jhhVar.x.a()).a(rpm.bZ()).b().c();
                } else {
                    gfq.b(jhhVar.y, rpm.bZ(), null, null, 14);
                }
                AssistantManagerNative.VoicelessOptions voicelessOptions2 = voicelessOptions;
                byte[] bArr2 = bArr;
                gmd gmdVar = jhhVar.A;
                gmdVar.b(gmc.f);
                gmdVar.b(gmc.g);
                assistantManagerNative.sendVoicelessInteraction(bArr2, "KatnissVoicelessInteraction", voicelessOptions2);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void Y() {
        this.U = true;
    }

    @Override // defpackage.jlr
    public final jlv Z() {
        return this.an.Z();
    }

    @Override // defpackage.gvx
    public final Object a(agsw agswVar) {
        this.bi = true;
        Object objAl = al(jib.f, agswVar);
        return objAl == agtg.a ? objAl : agpu.a;
    }

    public final void aA(final boolean z) {
        ax("setTalkBackEnabled", new agux() { // from class: jfd
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                assistantManagerNative.setTalkbackEnabled(z);
                return agpu.a;
            }
        });
    }

    public final void aB(final Map map) {
        ax("updateToken", new agux() { // from class: jen
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                assistantManagerNative.setAuthTokens(map);
                return agpu.a;
            }
        });
    }

    public final void aC() {
        ax("enableLocalGrpcMediaExecution", new agux() { // from class: jfe
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((AssistantManagerNative) obj).getClass();
                AssistantManagerNative assistantManagerNative = this.a.af;
                if (assistantManagerNative != null) {
                    assistantManagerNative.enableLocalGrpcExecution(true);
                }
                return agpu.a;
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(2:14|(38:16|75|76|(1:79)(1:80)|(1:82)(1:83)|(1:85)(1:86)|(1:88)(1:89)|90|300|91|(1:93)|94|(1:96)|97|98|(5:295|100|101|298|102)(1:105)|106|(4:108|(2:110|(5:112|(1:118)(1:117)|119|(3:121|(1:123)(1:124)|125)|126))(0)|291|292)|127|(1:132)(1:131)|133|297|(5:137|309|(4:139|202|(1:204)|205)(16:314|140|317|141|318|142|312|(3:144|145|146)(3:147|148|(1:150))|151|194|(1:196)|197|(1:201)(0)|202|(0)|205)|291|292)|206|(9:212|(1:214)|215|(13:304|218|(1:220)(1:221)|222|223|307|(1:228)(1:229)|306|310|(1:236)|237|(2:238|(2:240|(3:320|242|(1:244)(1:245))(1:322))(1:321))|(1:247)(1:248))|249|(1:251)|252|(1:254)|255)|256|(1:258)|259|(2:261|(1:263))|264|(1:266)|267|(1:269)|270|(1:277)(3:274|275|276)|278|291|292)(2:17|18))(16:19|36|37|(1:39)|40|(1:46)(1:45)|47|(1:52)(1:51)|53|(1:59)(1:58)|60|(1:62)(1:63)|64|(1:69)(1:68)|70|(2:72|(22:74|75|76|(0)(0)|(0)(0)|(0)(0)|(0)(0)|90|300|91|(0)|94|(0)|97|98|(0)(0)|106|(0)|127|(5:129|132|133|297|(4:135|137|309|(0)(0))(0))(0)|291|292)(1:323))(21:77|76|(0)(0)|(0)(0)|(0)(0)|(0)(0)|90|300|91|(0)|94|(0)|97|98|(0)(0)|106|(0)|127|(0)(0)|291|292)))(29:20|28|(1:30)|31|(1:33)(1:36)|37|(0)|40|(4:42|46|47|(4:49|52|53|(6:55|59|60|(0)(0)|64|(4:66|69|70|(0)(0))(0))(0))(0))(0)|76|(0)(0)|(0)(0)|(0)(0)|(0)(0)|90|300|91|(0)|94|(0)|97|98|(0)(0)|106|(0)|127|(0)(0)|291|292))(1:21))(4:22|(0)|293|294)|24|(1:26)|30|31|(0)(0)|37|(0)|40|(0)(0)|76|(0)(0)|(0)(0)|(0)(0)|(0)(0)|90|300|91|(0)|94|(0)|97|98|(0)(0)|106|(0)|127|(0)(0)|291|292|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:16|75|76|(1:79)(1:80)|(1:82)(1:83)|(1:85)(1:86)|(1:88)(1:89)|90|300|91|(1:93)|94|(1:96)|97|98|(5:295|100|101|298|102)(1:105)|106|(4:108|(2:110|(5:112|(1:118)(1:117)|119|(3:121|(1:123)(1:124)|125)|126))(0)|291|292)|127|(1:132)(1:131)|133|297|(5:137|309|(4:139|202|(1:204)|205)(16:314|140|317|141|318|142|312|(3:144|145|146)(3:147|148|(1:150))|151|194|(1:196)|197|(1:201)(0)|202|(0)|205)|291|292)|206|(9:212|(1:214)|215|(13:304|218|(1:220)(1:221)|222|223|307|(1:228)(1:229)|306|310|(1:236)|237|(2:238|(2:240|(3:320|242|(1:244)(1:245))(1:322))(1:321))|(1:247)(1:248))|249|(1:251)|252|(1:254)|255)|256|(1:258)|259|(2:261|(1:263))|264|(1:266)|267|(1:269)|270|(1:277)(3:274|275|276)|278|291|292) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0129, code lost:
    
        if (r0 != r14) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x091a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0920, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0921, code lost:
    
        r5 = "toConfigString";
        r1 = r25;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0153, code lost:
    
        if (r7.g(r9, r13) != r14) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04b8 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c0 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0509 A[Catch: JSONException -> 0x091c, TRY_LEAVE, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x051a A[Catch: JSONException -> 0x091c, TRY_LEAVE, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05d5 A[Catch: JSONException -> 0x091c, PHI: r10 r13
  0x05d5: PHI (r10v15 android.media.AudioRecord) = (r10v13 android.media.AudioRecord), (r10v14 android.media.AudioRecord), (r10v16 android.media.AudioRecord) binds: [B:183:0x05f6, B:176:0x05d3, B:191:0x0619] A[DONT_GENERATE, DONT_INLINE]
  0x05d5: PHI (r13v16 java.lang.String) = (r13v14 java.lang.String), (r13v15 java.lang.String), (r13v18 java.lang.String) binds: [B:183:0x05f6, B:176:0x05d3, B:191:0x0619] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0632 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x063b A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0649 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0684 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06ac A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07b4 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07be A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x07e2 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x080c A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x082f A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0867 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08e0 A[Catch: JSONException -> 0x091c, TryCatch #8 {JSONException -> 0x091c, blocks: (B:102:0x0495, B:106:0x04b1, B:108:0x04b8, B:110:0x04bc, B:112:0x04c0, B:114:0x04cf, B:119:0x04da, B:121:0x04de, B:125:0x04e5, B:126:0x04fb, B:118:0x04d6, B:127:0x04fe, B:129:0x0509, B:135:0x0516, B:206:0x0651, B:208:0x0684, B:210:0x0688, B:212:0x068c, B:214:0x06ac, B:215:0x06b1, B:218:0x06c5, B:222:0x06cf, B:228:0x06ff, B:236:0x0746, B:237:0x0749, B:238:0x0750, B:240:0x0756, B:242:0x0766, B:244:0x0775, B:247:0x078c, B:248:0x079b, B:229:0x0704, B:232:0x070c, B:234:0x0729, B:249:0x07b0, B:251:0x07b4, B:252:0x07ba, B:254:0x07be, B:255:0x07d5, B:225:0x06e0, B:256:0x07d8, B:258:0x07e2, B:259:0x07f0, B:261:0x080c, B:263:0x081b, B:264:0x0824, B:266:0x082f, B:267:0x083d, B:269:0x0867, B:270:0x0888, B:272:0x08e0, B:274:0x08e4, B:137:0x051a, B:202:0x0645, B:204:0x0649, B:205:0x064e, B:151:0x0589, B:194:0x061d, B:196:0x0632, B:197:0x0637, B:199:0x063b, B:201:0x063f, B:177:0x05d5), top: B:298:0x0495, inners: #14, #15, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0916 A[Catch: JSONException -> 0x091a, TryCatch #5 {JSONException -> 0x091a, blocks: (B:276:0x08ee, B:278:0x090b, B:282:0x0916, B:283:0x0919), top: B:297:0x0514 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0524 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156 A[PHI: r0
  0x0156: PHI (r0v28 java.lang.String) = (r0v8 java.lang.String), (r0v160 java.lang.String) binds: [B:32:0x013d, B:19:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041b A[Catch: JSONException -> 0x0920, TryCatch #11 {JSONException -> 0x0920, blocks: (B:91:0x03e1, B:93:0x041b, B:94:0x0422, B:96:0x0477, B:97:0x047c), top: B:300:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0477 A[Catch: JSONException -> 0x0920, TryCatch #11 {JSONException -> 0x0920, blocks: (B:91:0x03e1, B:93:0x041b, B:94:0x0422, B:96:0x0477, B:97:0x047c), top: B:300:0x03e1 }] */
    /* JADX WARN: Type inference failed for: r0v34, types: [zeo] */
    /* JADX WARN: Type inference failed for: r10v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v37, types: [zdv] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.media.AudioRecord] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, org.json.JSONArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aa(defpackage.agsw r77) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.aa(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (aD(r2) != r4) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [jhh] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ab(defpackage.agsw r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "cancelInitialization"
            java.lang.String r1 = "com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl"
            boolean r2 = r12 instanceof defpackage.jft
            java.lang.String r3 = "AssistantWrapperImpl.kt"
            if (r2 == 0) goto L19
            r2 = r12
            jft r2 = (defpackage.jft) r2
            int r4 = r2.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r2.d = r4
            goto L1e
        L19:
            jft r2 = new jft
            r2.<init>(r11, r12)
        L1e:
            java.lang.Object r12 = r2.b
            agtg r4 = defpackage.agtg.a
            int r5 = r2.d
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L4d
            if (r5 == r8) goto L46
            if (r5 == r7) goto L3e
            if (r5 != r6) goto L36
            java.lang.Object r0 = r2.a
            defpackage.agpl.b(r12)     // Catch: java.lang.Throwable -> L44
            goto La3
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3e:
            java.lang.Object r0 = r2.a
            defpackage.agpl.b(r12)     // Catch: java.lang.Throwable -> L44
            goto L95
        L44:
            r12 = move-exception
            goto Lad
        L46:
            java.lang.Object r5 = r2.a
            defpackage.agpl.b(r12)
            r12 = r5
            goto L5c
        L4d:
            defpackage.agpl.b(r12)
            ahni r12 = r11.bq
            r2.a = r12
            r2.d = r8
            java.lang.Object r5 = r12.b(r2)
            if (r5 == r4) goto Lb1
        L5c:
            zdy r5 = defpackage.jhh.a     // Catch: java.lang.Throwable -> La9
            zeo r8 = r5.b()     // Catch: java.lang.Throwable -> La9
            r9 = 949(0x3b5, float:1.33E-42)
            zeo r8 = r8.q(r1, r0, r9, r3)     // Catch: java.lang.Throwable -> La9
            zdv r8 = (defpackage.zdv) r8     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "Cancelling initialization."
            r8.u(r9)     // Catch: java.lang.Throwable -> La9
            ahdl r8 = r11.ag     // Catch: java.lang.Throwable -> La9
            if (r8 != 0) goto L8a
            zeo r2 = r5.d()     // Catch: java.lang.Throwable -> La9
            r4 = 953(0x3b9, float:1.335E-42)
            zeo r0 = r2.q(r1, r0, r4, r3)     // Catch: java.lang.Throwable -> La9
            zdv r0 = (defpackage.zdv) r0     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = "Initialization not in progress. Ignoring call to cancelInitialization."
            r0.u(r1)     // Catch: java.lang.Throwable -> La9
            agpu r0 = defpackage.agpu.a     // Catch: java.lang.Throwable -> La9
            r12.d()
            return r0
        L8a:
            r2.a = r12     // Catch: java.lang.Throwable -> La9
            r2.d = r7     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = defpackage.ahdp.a(r8, r2)     // Catch: java.lang.Throwable -> La9
            if (r0 == r4) goto Lb1
            r0 = r12
        L95:
            r12 = 0
            r11.ag = r12     // Catch: java.lang.Throwable -> L44
            r2.a = r0     // Catch: java.lang.Throwable -> L44
            r2.d = r6     // Catch: java.lang.Throwable -> L44
            java.lang.Object r12 = r11.aD(r2)     // Catch: java.lang.Throwable -> L44
            if (r12 != r4) goto La3
            goto Lb1
        La3:
            r0.d()
            agpu r12 = defpackage.agpu.a
            return r12
        La9:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        Lad:
            r0.d()
            throw r12
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ab(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0369, code lost:
    
        if (ab(r0) == r2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0293, code lost:
    
        if (r12.a(3, r0) == r2) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ac(defpackage.jib r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ac(jib, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        if (an(r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (aD(r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ad(defpackage.jib r9, defpackage.agsw r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.jfz
            if (r0 == 0) goto L13
            r0 = r10
            jfz r0 = (defpackage.jfz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jfz r0 = new jfz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 4
            r4 = 2
            r5 = 5
            r6 = 3
            r7 = 1
            if (r2 == 0) goto L4a
            if (r2 == r7) goto L46
            if (r2 == r4) goto L42
            if (r2 == r6) goto L3d
            if (r2 == r3) goto L38
            if (r2 != r5) goto L30
            goto L3d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.agpl.b(r10)
            goto Lb5
        L3d:
            defpackage.agpl.b(r10)
            goto Lbe
        L42:
            defpackage.agpl.b(r10)
            goto L9d
        L46:
            defpackage.agpl.b(r10)
            goto L95
        L4a:
            defpackage.agpl.b(r10)
            int r9 = r9.ordinal()
            if (r9 == r7) goto La6
            if (r9 == r6) goto L62
            if (r9 == r5) goto L58
            goto Lbe
        L58:
            gvy r9 = r8.N
            java.util.Map r9 = r9.c()
            r8.aB(r9)
            goto Lbe
        L62:
            java.lang.String r9 = r8.bm
            jmu r10 = r8.ar
            java.lang.String r2 = r10.c()
            boolean r9 = defpackage.agvy.c(r9, r2)
            if (r9 != 0) goto Lbe
            jid r9 = defpackage.jid.c
            r8.aI(r9)
            java.lang.String r9 = r8.bm
            if (r9 == 0) goto L87
            int r9 = r9.length()
            if (r9 != 0) goto L87
            boolean r9 = r10.f()
            if (r9 == 0) goto L87
            r8.ab = r7
        L87:
            java.lang.String r9 = r10.c()
            r8.bm = r9
            r0.c = r7
            java.lang.Object r9 = r10.b(r0)
            if (r9 == r1) goto Lc1
        L95:
            r0.c = r4
            java.lang.Object r9 = r8.aD(r0)
            if (r9 == r1) goto Lc1
        L9d:
            r0.c = r6
            java.lang.Object r9 = r8.an(r0)
            if (r9 != r1) goto Lbe
            goto Lc1
        La6:
            jid r9 = defpackage.jid.a
            r8.aI(r9)
            jmu r9 = r8.ar
            r0.c = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto Lc1
        Lb5:
            r0.c = r5
            java.lang.Object r9 = r8.aD(r0)
            if (r9 != r1) goto Lbe
            goto Lc1
        Lbe:
            agpu r9 = defpackage.agpu.a
            return r9
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ad(jib, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (an(r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r8.a(3, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ae(defpackage.jib r8, defpackage.agsw r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.jga
            if (r0 == 0) goto L13
            r0 = r9
            jga r0 = (defpackage.jga) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jga r0 = new jga
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            goto L39
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.agpl.b(r9)
            goto L84
        L39:
            defpackage.agpl.b(r9)
            goto L8f
        L3d:
            defpackage.agpl.b(r9)
            goto L53
        L41:
            defpackage.agpl.b(r9)
            int r8 = r8.ordinal()
            if (r8 == 0) goto L4b
            goto L8f
        L4b:
            r0.c = r6
            java.lang.Object r9 = r7.ah(r0)
            if (r9 == r1) goto L92
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 != 0) goto L8f
            jmu r8 = r7.ar
            boolean r9 = r8.f()
            if (r9 == 0) goto L77
            jid r9 = defpackage.jid.c
            r7.aI(r9)
            java.lang.String r8 = r8.c()
            r7.bm = r8
            r0.c = r5
            java.lang.Object r8 = r7.an(r0)
            if (r8 != r1) goto L8f
            goto L92
        L77:
            jid r9 = defpackage.jid.b
            r7.aI(r9)
            r0.c = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 == r1) goto L92
        L84:
            jmu r8 = r7.ar
            r0.c = r3
            java.lang.Object r8 = defpackage.jms.a(r8, r0)
            if (r8 != r1) goto L8f
            goto L92
        L8f:
            agpu r8 = defpackage.agpu.a
            return r8
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ae(jib, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02a8, code lost:
    
        if (defpackage.ahew.a(r0) != r1) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[PHI: r2
  0x00aa: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v6 java.lang.String) binds: [B:30:0x00a8, B:25:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[PHI: r2
  0x00bd: PHI (r2v7 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:32:0x00bb, B:24:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[PHI: r2 r12
  0x00c8: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:34:0x00c6, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x00c8: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v1 java.lang.Object) binds: [B:34:0x00c6, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object af(defpackage.agsw r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.af(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ag(defpackage.agsw r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.jgh
            if (r0 == 0) goto L13
            r0 = r11
            jgh r0 = (defpackage.jgh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jgh r0 = new jgh
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "loadLibAssistantLibrary"
            java.lang.String r4 = "com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl"
            r5 = 2
            r6 = 1
            java.lang.String r7 = "AssistantWrapperImpl.kt"
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r11)     // Catch: java.lang.Throwable -> L32
            goto L89
        L32:
            r11 = move-exception
            goto Lb3
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3d:
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r11)
            r11 = r2
            goto L53
        L44:
            defpackage.agpl.b(r11)
            ahni r11 = r10.br
            r0.a = r11
            r0.d = r6
            java.lang.Object r2 = r11.b(r0)
            if (r2 == r1) goto Lb7
        L53:
            boolean r2 = r10.bb     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto La6
            zdy r2 = defpackage.jhh.a     // Catch: java.lang.Throwable -> Laf
            zeo r2 = r2.b()     // Catch: java.lang.Throwable -> Laf
            r8 = 800(0x320, float:1.121E-42)
            zeo r2 = r2.q(r4, r3, r8, r7)     // Catch: java.lang.Throwable -> Laf
            zdv r2 = (defpackage.zdv) r2     // Catch: java.lang.Throwable -> Laf
            java.lang.String r8 = "Libassistant load started"
            r2.u(r8)     // Catch: java.lang.Throwable -> Laf
            agow r2 = r10.aJ     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> Laf
            got r2 = (defpackage.got) r2     // Catch: java.lang.Throwable -> Laf
            r0.a = r11     // Catch: java.lang.Throwable -> Laf
            r0.d = r5     // Catch: java.lang.Throwable -> Laf
            agte r2 = r2.a     // Catch: java.lang.Throwable -> Laf
            gos r5 = new gos     // Catch: java.lang.Throwable -> Laf
            r8 = 0
            r5.<init>(r8)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = defpackage.ahal.a(r2, r5, r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == r1) goto L86
            agpu r0 = defpackage.agpu.a     // Catch: java.lang.Throwable -> Laf
        L86:
            if (r0 == r1) goto Lb7
            r0 = r11
        L89:
            zdy r11 = defpackage.jhh.a     // Catch: java.lang.Throwable -> L32
            zeo r11 = r11.b()     // Catch: java.lang.Throwable -> L32
            r1 = 802(0x322, float:1.124E-42)
            zeo r11 = r11.q(r4, r3, r1, r7)     // Catch: java.lang.Throwable -> L32
            zdv r11 = (defpackage.zdv) r11     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Libassistant load finished"
            r11.u(r1)     // Catch: java.lang.Throwable -> L32
            r10.bb = r6     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            r0.d()
            return r11
        La6:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Laf
            r11.d()
            return r0
        Laf:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        Lb3:
            r0.d()
            throw r11
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ag(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ah(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.jgj
            if (r0 == 0) goto L13
            r0 = r6
            jgj r0 = (defpackage.jgj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jgj r0 = new jgj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.agpl.b(r6)
            boolean r6 = r5.S
            if (r6 == 0) goto L6b
            gtu r6 = r5.aG
            r0.c = r3
            java.lang.Object r6 = r6.j(r0)
            if (r6 == r1) goto L6a
        L40:
            if (r6 != 0) goto L6b
            zdy r6 = defpackage.jhh.a
            zeo r6 = r6.c()
            r0 = 2032(0x7f0, float:2.847E-42)
            java.lang.String r1 = "AssistantWrapperImpl.kt"
            java.lang.String r2 = "com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl"
            java.lang.String r4 = "maybeDisableLibAssistantInArt"
            zeo r6 = r6.q(r2, r4, r0, r1)
            zdv r6 = (defpackage.zdv) r6
            java.lang.String r0 = "Cannot proceed with ART in sign-out mode, please sign in and restart Google app."
            r6.u(r0)
            android.os.Handler r6 = r5.Z
            jeu r0 = new jeu
            r0.<init>()
            r6.post(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L6a:
            return r1
        L6b:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ah(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ai(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jgl
            if (r0 == 0) goto L13
            r0 = r8
            jgl r0 = (defpackage.jgl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jgl r0 = new jgl
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            int r0 = r0.a
            defpackage.agpl.b(r8)
            goto L66
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.agpl.b(r8)
            goto L46
        L39:
            defpackage.agpl.b(r8)
            fmg r8 = r7.aU
            r0.d = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto L9f
        L46:
            ztw r2 = r7.aV
            j$.time.Instant r8 = (j$.time.Instant) r8
            j$.time.Instant r2 = r2.a()
            int r8 = r8.compareTo(r2)
            if (r8 < 0) goto L56
            r8 = r5
            goto L57
        L56:
            r8 = r4
        L57:
            fmg r2 = r7.aU
            r0.a = r8
            r0.d = r3
            java.lang.Object r0 = r2.c(r0)
            if (r0 == r1) goto L9f
            r6 = r0
            r0 = r8
            r8 = r6
        L66:
            ztw r1 = r7.aV
            j$.time.Instant r8 = (j$.time.Instant) r8
            j$.time.Instant r1 = r1.a()
            int r8 = r8.compareTo(r1)
            if (r8 < 0) goto L76
            r8 = r5
            goto L77
        L76:
            r8 = r4
        L77:
            boolean r1 = r7.S
            if (r0 != r1) goto L85
            boolean r1 = r7.bc
            if (r8 == r1) goto L80
            goto L85
        L80:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L85:
            if (r5 == r0) goto L89
            r0 = r4
            goto L8a
        L89:
            r0 = r5
        L8a:
            r7.S = r0
            r7.bc = r8
            ahbt r8 = r7.j
            jgm r0 = new jgm
            r1 = 0
            r0.<init>(r7, r1)
            r2 = 3
            defpackage.ahal.e(r8, r1, r4, r0, r2)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ai(agsw):java.lang.Object");
    }

    @Override // defpackage.jmt
    public final Object aj(agsw agswVar) {
        Object objAl = al(jib.e, agswVar);
        return objAl == agtg.a ? objAl : agpu.a;
    }

    @Override // defpackage.jmt
    public final Object ak(agsw agswVar) {
        Object objAl = al(jib.d, agswVar);
        return objAl == agtg.a ? objAl : agpu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        if (ae(r2, r0) == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object al(defpackage.jib r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.al(jib, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object am(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.jgp
            if (r0 == 0) goto L13
            r0 = r7
            jgp r0 = (defpackage.jgp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jgp r0 = new jgp
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.agpl.b(r7)
            ahni r7 = r6.bn
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = r7.b(r0)
            if (r0 == r1) goto L65
            r0 = r7
        L41:
            boolean r7 = r6.bo     // Catch: java.lang.Throwable -> L60
            if (r7 != 0) goto L5a
            android.content.IntentFilter r7 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L60
            r7.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "com.google.android.apps.tv.testing.assistantfftestapp.aec_probe"
            r7.addAction(r1)     // Catch: java.lang.Throwable -> L60
            android.content.Context r1 = r6.i     // Catch: java.lang.Throwable -> L60
            android.content.BroadcastReceiver r2 = r6.bp     // Catch: java.lang.Throwable -> L60
            r4 = 0
            r5 = 2
            defpackage.abs.c(r1, r2, r7, r4, r5)     // Catch: java.lang.Throwable -> L60
            r6.bo = r3     // Catch: java.lang.Throwable -> L60
        L5a:
            r0.d()
            agpu r7 = defpackage.agpu.a
            return r7
        L60:
            r7 = move-exception
            r0.d()
            throw r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.am(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object an(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jhd
            if (r0 == 0) goto L13
            r0 = r8
            jhd r0 = (defpackage.jhd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jhd r0 = new jhd
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            java.lang.String r3 = "startInitializing"
            java.lang.String r4 = "com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl"
            r5 = 1
            java.lang.String r6 = "AssistantWrapperImpl.kt"
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r8)
            goto L5a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            defpackage.agpl.b(r8)
            zdy r8 = defpackage.jhh.a
            zeo r8 = r8.b()
            r2 = 595(0x253, float:8.34E-43)
            zeo r8 = r8.q(r4, r3, r2, r6)
            zdv r8 = (defpackage.zdv) r8
            java.lang.String r2 = "Starting initialization."
            r8.u(r2)
            ahni r8 = r7.bq
            r0.a = r8
            r0.d = r5
            java.lang.Object r0 = r8.b(r0)
            if (r0 == r1) goto L92
            r0 = r8
        L5a:
            ahdl r8 = r7.ag     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L77
            zdy r8 = defpackage.jhh.a     // Catch: java.lang.Throwable -> L8d
            zeo r8 = r8.d()     // Catch: java.lang.Throwable -> L8d
            r1 = 600(0x258, float:8.41E-43)
            zeo r8 = r8.q(r4, r3, r1, r6)     // Catch: java.lang.Throwable -> L8d
            zdv r8 = (defpackage.zdv) r8     // Catch: java.lang.Throwable -> L8d
            java.lang.String r1 = "Initialization already in progress. Ignoring call to startInitializing."
            r8.u(r1)     // Catch: java.lang.Throwable -> L8d
            agpu r8 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L8d
            r0.d()
            return r8
        L77:
            ahbt r8 = r7.j     // Catch: java.lang.Throwable -> L8d
            jhe r1 = new jhe     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L8d
            r3 = 0
            r4 = 3
            ahdl r8 = defpackage.ahal.e(r8, r2, r3, r1, r4)     // Catch: java.lang.Throwable -> L8d
            r7.ag = r8     // Catch: java.lang.Throwable -> L8d
            r0.d()
            agpu r8 = defpackage.agpu.a
            return r8
        L8d:
            r8 = move-exception
            r0.d()
            throw r8
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.an(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ao(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jhg
            if (r0 == 0) goto L13
            r0 = r5
            jhg r0 = (defpackage.jhg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jhg r0 = new jhg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.agpl.b(r5)
            ahni r5 = r4.bn
            r0.a = r5
            r0.d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 == r1) goto L5a
            r0 = r5
        L41:
            boolean r5 = r4.bo     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L4f
            android.content.Context r5 = r4.i     // Catch: java.lang.Throwable -> L55
            android.content.BroadcastReceiver r1 = r4.bp     // Catch: java.lang.Throwable -> L55
            r5.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L55
            r5 = 0
            r4.bo = r5     // Catch: java.lang.Throwable -> L55
        L4f:
            r0.d()
            agpu r5 = defpackage.agpu.a
            return r5
        L55:
            r5 = move-exception
            r0.d()
            throw r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.ao(agsw):java.lang.Object");
    }

    public final void ap(final String str) {
        aG("maybeToggleHotwordStateWithReason", new agux() { // from class: jeq
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((AssistantManagerNative) obj).getClass();
                jhh jhhVar = this.a;
                if (!jhhVar.R) {
                    String str2 = str;
                    if (jhhVar.V()) {
                        ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "maybeToggleHotwordStateWithReason$lambda$67", 1960, "AssistantWrapperImpl.kt")).x("Start hotword detection due to %s.", str2);
                        jhhVar.F(true);
                    } else {
                        ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "maybeToggleHotwordStateWithReason$lambda$67", 1963, "AssistantWrapperImpl.kt")).x("Stop hotword detection due to %s.", str2);
                        jhhVar.L(true);
                    }
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jlr
    public final void aq(jlt jltVar) {
        this.an.aq(jltVar);
    }

    @Override // defpackage.jme
    public final void ar(final List list) {
        aG("onAppCapabilitiesChanged", new agux() { // from class: jec
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int iA;
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                List<xfb> list2 = list;
                ArrayList arrayList = new ArrayList(agqq.i(list2, 10));
                for (xfb xfbVar : list2) {
                    try {
                        int i = xfbVar.memoizedSerializedSize;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(xfbVar.getClass()).a(xfbVar);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                        } else {
                            iA = i & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(xfbVar.getClass()).a(xfbVar);
                                if (iA < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                                }
                                xfbVar.memoizedSerializedSize = (Integer.MIN_VALUE & xfbVar.memoizedSerializedSize) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(xfbVar.getClass()).m(xfbVar, abwa.a(abvwVar));
                        abvwVar.K();
                        arrayList.add(bArr);
                    } catch (IOException e) {
                        throw new RuntimeException("Serializing " + xfbVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                    }
                }
                assistantManagerNative.setAppCapabilities(arrayList);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jlq
    public final void as(final xgt xgtVar) {
        aG("onThirdPartyCapabilitiesChanged", new agux() { // from class: jed
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int iA;
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                xgt xgtVar2 = xgtVar;
                try {
                    int i = xgtVar2.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(xgtVar2.getClass()).a(xgtVar2);
                        if (iA < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(xgtVar2.getClass()).a(xgtVar2);
                            if (iA < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iA);
                            }
                            xgtVar2.memoizedSerializedSize = (Integer.MIN_VALUE & xgtVar2.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(xgtVar2.getClass()).m(xgtVar2, abwa.a(abvwVar));
                    abvwVar.K();
                    assistantManagerNative.setThirdPartyCapabilities(bArr);
                    return agpu.a;
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + xgtVar2.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        });
    }

    @Override // defpackage.jlr
    public final void at(jlt jltVar) {
        this.an.at(jltVar);
    }

    public final void au() {
        AssistantManagerNative assistantManagerNative = this.af;
        if (assistantManagerNative == null) {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "registerActionExecutors", 1768, "AssistantWrapperImpl.kt")).u("Called registerActionExecutors with null AssistantManagerNative.");
        } else {
            jhr jhrVar = this.l;
            assistantManagerNative.registerActionExecutor("DelegatingActionExecutor", (ActionExecutor.SupportedAction[]) jhrVar.q.toArray(new ActionExecutor.SupportedAction[0]), jhrVar);
        }
    }

    public final void av() {
        aF(this.ap, AudioInputUtils.MicType.NEAR_FIELD);
        aF(new jgs(this), AudioInputUtils.MicType.FAR_FIELD);
    }

    public final void aw() {
        if (R()) {
            ahal.e(this.j, null, 0, new jgx(this, null), 3).w(new agux() { // from class: jfc
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "restartTokenUpdater$lambda$56", 1760, "AssistantWrapperImpl.kt")).u("Restarted TokenUpdater.");
                    return agpu.a;
                }
            });
        }
    }

    public final void ax(String str, agux aguxVar) {
        AssistantManagerNative assistantManagerNative = this.af;
        if (assistantManagerNative != null) {
            aguxVar.a(assistantManagerNative);
        } else {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "runWithAssistantManagerNative", 1974, "AssistantWrapperImpl.kt")).x("Method[%s] called while AssistantManagerNative is null.", str);
        }
    }

    public final void ay() {
        ax("setAssistantLocation", new agux() { // from class: jdz
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                jhh jhhVar = this.a;
                ahal.e(jhhVar.j, null, 0, new jgz(jhhVar, assistantManagerNative, null), 3).w(new agux() { // from class: jef
                    @Override // defpackage.agux
                    public final Object a(Object obj2) {
                        Throwable th = (Throwable) obj2;
                        zdy zdyVar = jhh.a;
                        if (th != null) {
                            ((zdv) ((zdv) jhh.a.d()).p(th).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "setAssistantLocation$lambda$64$lambda$63", 1917, "AssistantWrapperImpl.kt")).u("setAssistantLocation failed.");
                        }
                        return agpu.a;
                    }
                });
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jlr
    public final void az(jlv jlvVar) {
        jlvVar.getClass();
        this.an.az(jlvVar);
    }

    @Override // defpackage.ich
    public final void b(icg icgVar) {
        ahal.e(this.j, null, 0, new jgn(icgVar, this, null), 3);
    }

    @Override // defpackage.jdt
    public final int c() {
        return this.bl;
    }

    @Override // defpackage.jdt
    public final Intent d() {
        if (this.bf != null && this.aV.a().compareTo(this.be.plus(al)) <= 0) {
            return this.bf;
        }
        return null;
    }

    @Override // defpackage.jdt
    public final zyd e(boolean z, boolean z2) {
        return ahkr.c(this.j, 0, new jgc(this, z, z2, null), 3);
    }

    @Override // defpackage.jdt
    public final Object f(agsw agswVar) {
        Object objAl = al(jib.b, agswVar);
        return objAl == agtg.a ? objAl : agpu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (al(r7, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r7, boolean r8, defpackage.agsw r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.jgb
            if (r0 == 0) goto L13
            r0 = r9
            jgb r0 = (defpackage.jgb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jgb r0 = new jgb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.agpl.b(r9)
            goto La7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            boolean r7 = r0.a
            defpackage.agpl.b(r9)
            r8 = r7
            goto L6b
        L3b:
            defpackage.agpl.b(r9)
            r6.R = r7
            if (r7 != 0) goto L91
            boolean r9 = r6.bb
            if (r9 != 0) goto L91
            boolean r9 = r6.bs
            if (r9 == 0) goto L91
            agow r7 = r6.aO
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L75
            agow r7 = r6.p
            java.lang.Object r7 = r7.a()
            fjn r7 = (defpackage.fjn) r7
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r1) goto L6b
            goto La6
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 != 0) goto L75
            r7 = r4
            goto L91
        L75:
            zdy r7 = defpackage.jhh.a
            zeo r7 = r7.b()
            r8 = 576(0x240, float:8.07E-43)
            java.lang.String r9 = "AssistantWrapperImpl.kt"
            java.lang.String r0 = "com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl"
            java.lang.String r1 = "initialize"
            zeo r7 = r7.q(r0, r1, r8, r9)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "LibAssistant initialization deferred on lowRamDevice since libraries are not loaded yet."
            r7.u(r8)
            agpu r7 = defpackage.agpu.a
            return r7
        L91:
            if (r7 == 0) goto L95
            if (r8 == 0) goto L9a
        L95:
            boolean r7 = r6.au
            if (r7 == 0) goto L9a
            r4 = r5
        L9a:
            r6.X = r4
            jib r7 = defpackage.jib.a
            r0.d = r3
            java.lang.Object r7 = r6.al(r7, r0)
            if (r7 != r1) goto La7
        La6:
            return r1
        La7:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.g(boolean, boolean, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (al(r8, r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jgt
            if (r0 == 0) goto L13
            r0 = r8
            jgt r0 = (defpackage.jgt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jgt r0 = new jgt
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.agpl.b(r8)
            goto L79
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.agpl.b(r8)
            goto L6e
        L39:
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r8)
            goto L4e
        L3f:
            defpackage.agpl.b(r8)
            ahni r2 = r7.bt
            r0.a = r2
            r0.d = r5
            java.lang.Object r8 = r2.b(r0)
            if (r8 == r1) goto L81
        L4e:
            jid r8 = r7.ai     // Catch: java.lang.Throwable -> L7c
            jid r6 = defpackage.jid.c     // Catch: java.lang.Throwable -> L7c
            if (r8 == r6) goto L5c
            jid r8 = r7.ai     // Catch: java.lang.Throwable -> L7c
            jid r6 = defpackage.jid.d     // Catch: java.lang.Throwable -> L7c
            if (r8 != r6) goto L5b
            goto L5c
        L5b:
            r5 = 0
        L5c:
            r2.d()
            if (r5 == 0) goto L79
            jib r8 = defpackage.jib.b
            r2 = 0
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r7.al(r8, r0)
            if (r8 == r1) goto L81
        L6e:
            jib r8 = defpackage.jib.a
            r0.d = r3
            java.lang.Object r8 = r7.al(r8, r0)
            if (r8 != r1) goto L79
            goto L81
        L79:
            agpu r8 = defpackage.agpu.a
            return r8
        L7c:
            r8 = move-exception
            r2.d()
            throw r8
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.h(agsw):java.lang.Object");
    }

    @Override // defpackage.jdt
    public final String i() {
        return this.bg;
    }

    @Override // defpackage.jdt
    public final String j() {
        int iOrdinal = this.ai.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return "InfoRetrievalState";
        }
        if (iOrdinal == 2) {
            return "InitializingState";
        }
        if (iOrdinal == 3) {
            return "RunningState";
        }
        throw new agpg();
    }

    @Override // defpackage.jdt
    public final List k() {
        return this.bh;
    }

    @Override // defpackage.jdt
    public final void l(final AssistantEventListener assistantEventListener) {
        ax("addAssistantEventListener", new agux() { // from class: jeo
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                AssistantEventListener assistantEventListener2 = assistantEventListener;
                assistantManagerNative.removeAssistantEventListener(assistantEventListener2);
                assistantManagerNative.addAssistantEventListener(assistantEventListener2);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void m() {
        if (this.bb || !this.bs) {
            return;
        }
        ahal.e(this.j, null, 0, new jfv(this, null), 3);
    }

    @Override // defpackage.jdt
    public final void n() {
        ahal.e(this.j, null, 0, new jfw(this, null), 3);
    }

    @Override // defpackage.jdt
    public final void o() {
        ahal.e(this.j, null, 0, new jfx(this, null), 3).w(new agux() { // from class: jeb
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                zdy zdyVar = jhh.a;
                if (th != null && !(th instanceof CancellationException)) {
                    ((zdv) ((zdv) jhh.a.d()).p(th).q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "handleLocaleChange$lambda$65", 1941, "AssistantWrapperImpl.kt")).u("Failed to handle locale change.");
                }
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void p(boolean z) {
        this.bk = z;
        ap("hardware mic toggle");
    }

    @Override // defpackage.jdt
    public final void q(boolean z) {
        this.bj = z;
        if (z) {
            aw();
        }
        ap("screen state change");
    }

    @Override // defpackage.jdt
    public final void r(final String str) {
        str.getClass();
        ax("registerFcmToken", new agux() { // from class: jej
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                assistantManagerNative.onFcmToken(str);
                jhh jhhVar = this;
                ahal.e(jhhVar.j, null, 0, new jgq(jhhVar, null), 3);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void s(final AssistantEventListener assistantEventListener) {
        ax("removeAssistantEventListener", new agux() { // from class: jes
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                assistantManagerNative.removeAssistantEventListener(assistantEventListener);
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void t() {
        if (!this.bs || this.af != null) {
            aG("requestForDeviceLinkToken", new agux() { // from class: jfm
                @Override // defpackage.agux
                public final Object a(Object obj) {
                    int iA;
                    AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                    assistantManagerNative.getClass();
                    jhh jhhVar = this.a;
                    if (((Boolean) jhhVar.J.a()).booleanValue()) {
                        jhhVar.az(jlv.INVOCATION_TYPE_DEVICE_LINK_TOKEN_REQUEST);
                    } else {
                        jhhVar.az(jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT);
                    }
                    ((gfn) jhhVar.x.a()).a(rpm.cz()).b().c();
                    xht xhtVar = xht.a;
                    xhs xhsVar = new xhs();
                    xho xhoVar = xho.a;
                    xhn xhnVar = new xhn();
                    xgw xgwVar = xgw.a;
                    xgu xguVar = new xgu();
                    if ((xguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xguVar.y();
                    }
                    xgw xgwVar2 = (xgw) xguVar.b;
                    xgwVar2.b |= 1;
                    xgwVar2.c = "device.REQUEST_LINK_TOKEN";
                    xgw xgwVarA = xki.a(xguVar);
                    if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xhnVar.y();
                    }
                    xho xhoVar2 = (xho) xhnVar.b;
                    xhoVar2.c = xgwVarA;
                    xhoVar2.b = 5;
                    xho xhoVarA = xkj.a(xhnVar);
                    if ((xhsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xhsVar.y();
                    }
                    xht xhtVar2 = (xht) xhsVar.b;
                    xhtVar2.c = xhoVarA;
                    xhtVar2.b = 3;
                    xht xhtVarA = xlq.a(xhsVar);
                    try {
                        int i = xhtVarA.memoizedSerializedSize;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            iA = abza.a.a(xhtVarA.getClass()).a(xhtVarA);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA = i & Integer.MAX_VALUE;
                            if (iA == Integer.MAX_VALUE) {
                                iA = abza.a.a(xhtVarA.getClass()).a(xhtVarA);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                                xhtVarA.memoizedSerializedSize = (xhtVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                            }
                        }
                        byte[] bArr = new byte[iA];
                        boolean z = abvz.e;
                        abvw abvwVar = new abvw(bArr, 0, iA);
                        abza.a.a(xhtVarA.getClass()).m(xhtVarA, abwa.a(abvwVar));
                        abvwVar.K();
                        assistantManagerNative.sendVoicelessInteraction(bArr, "KatnissVoicelessInteraction", new AssistantManagerNative.VoicelessOptions(AssistantManagerNative.RequestSource.OTHER, true));
                        return agpu.a;
                    } catch (IOException e) {
                        throw new RuntimeException(a.x(xhtVarA, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
                    }
                }
            });
        } else if (this.bd) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "requestForDeviceLinkToken", 1322, "AssistantWrapperImpl.kt")).u("Skipping duplicate request for device link token.");
        } else {
            this.bd = true;
            m();
        }
    }

    @Override // defpackage.jdt
    public final void u() {
        ax("resetAllDataAndShutdown", new agux() { // from class: jex
            @Override // defpackage.agux
            public final Object a(Object obj) {
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                zdy zdyVar = jhh.a;
                assistantManagerNative.getClass();
                assistantManagerNative.resetAllDataAndShutdown();
                return agpu.a;
            }
        });
    }

    @Override // defpackage.jdt
    public final void v() {
        feq.e(this.Z, b, this.ac);
    }

    @Override // defpackage.jdt
    public final void w(boolean z) {
        ahal.e(this.j, null, 0, new jgv(this, z, null), 3);
    }

    @Override // defpackage.jdt
    public final void x() {
        ahal.e(this.j, null, 0, new jgw(this, null), 3);
    }

    @Override // defpackage.jdt
    public final void y(final String str) {
        str.getClass();
        aG("sendAppSearchInteraction", new agux() { // from class: jer
            @Override // defpackage.agux
            public final Object a(Object obj) {
                int iA;
                int iA2;
                int iA3;
                AssistantManagerNative assistantManagerNative = (AssistantManagerNative) obj;
                assistantManagerNative.getClass();
                String str2 = str;
                if (str2.length() == 0) {
                    ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl", "sendAppSearchInteraction$lambda$33", 1209, "AssistantWrapperImpl.kt")).u("Sending app search interaction with empty query.");
                }
                this.az(jlv.INVOCATION_TYPE_CLIENT_INPUT_INTENT);
                xht xhtVar = xht.a;
                xhs xhsVar = new xhs();
                xho xhoVar = xho.a;
                xhn xhnVar = new xhn();
                xgw xgwVar = xgw.a;
                xgu xguVar = new xgu();
                if ((xguVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xguVar.y();
                }
                xgw xgwVar2 = (xgw) xguVar.b;
                xgwVar2.b |= 1;
                xgwVar2.c = "asst_input.INTENT";
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((xgw) xguVar.b).d)).getClass();
                xjp xjpVar = xjp.a;
                xnu xnuVar = new xnu(new xjo());
                xjo xjoVar = xnuVar.a;
                if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    xjoVar.y();
                }
                xjp xjpVar2 = (xjp) xjoVar.b;
                xjpVar2.b |= 1;
                xjpVar2.c = "assistant.api.client_input.IntentInput";
                xix xixVar = xix.a;
                xiw xiwVar = new xiw();
                ablt abltVar = ablt.a;
                abls ablsVar = new abls();
                if ((ablsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ablsVar.y();
                }
                ablt abltVar2 = (ablt) ablsVar.b;
                abltVar2.b |= 4;
                abltVar2.c = "FindApp";
                DesugarCollections.unmodifiableList(((ablt) ablsVar.b).d).getClass();
                abln ablnVar = abln.a;
                ablm ablmVar = new ablm();
                if ((ablmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ablmVar.y();
                }
                abln ablnVar2 = (abln) ablmVar.b;
                ablnVar2.b |= 2;
                ablnVar2.c = "generic_app_description";
                ablp ablpVar = ablp.a;
                ablo abloVar = new ablo();
                ablz ablzVar = ablz.a;
                ably ablyVar = new ably();
                abmc.b(str2, ablyVar);
                ablz ablzVarA = abmc.a(ablyVar);
                if ((abloVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    abloVar.y();
                }
                ablp ablpVar2 = (ablp) abloVar.b;
                ablpVar2.c = ablzVarA;
                ablpVar2.b = 3;
                ablp ablpVarA = ablk.a(abloVar);
                if ((ablmVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    ablmVar.y();
                }
                abln ablnVar3 = (abln) ablmVar.b;
                ablnVar3.d = ablpVarA;
                ablnVar3.b |= 4;
                ablsVar.a(ablj.a(ablmVar));
                ablt abltVarA = abll.a(ablsVar);
                try {
                    int i = abltVarA.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(abltVarA.getClass()).a(abltVarA);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(abltVarA.getClass()).a(abltVarA);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            abltVarA.memoizedSerializedSize = (abltVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    abvo abvoVar = abvo.b;
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(abltVarA.getClass()).m(abltVarA, abwa.a(abvwVar));
                    abvo abvoVarA = abvk.a(abvwVar, bArr);
                    if ((xiwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        xiwVar.y();
                    }
                    xix xixVar2 = (xix) xiwVar.b;
                    xixVar2.b |= 1;
                    xixVar2.c = abvoVarA;
                    xix xixVarA = xlp.a(xiwVar);
                    try {
                        int i2 = xixVarA.memoizedSerializedSize;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            iA2 = abza.a.a(xixVarA.getClass()).a(xixVarA);
                            if (iA2 < 0) {
                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                            }
                        } else {
                            iA2 = i2 & Integer.MAX_VALUE;
                            if (iA2 == Integer.MAX_VALUE) {
                                iA2 = abza.a.a(xixVarA.getClass()).a(xixVarA);
                                if (iA2 < 0) {
                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                }
                                xixVarA.memoizedSerializedSize = (xixVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                            }
                        }
                        byte[] bArr2 = new byte[iA2];
                        abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                        abza.a.a(xixVarA.getClass()).m(xixVarA, abwa.a(abvwVar2));
                        xnuVar.b(abvk.a(abvwVar2, bArr2));
                        xguVar.a("intent_input", xnuVar.a());
                        xgw xgwVarA = xki.a(xguVar);
                        if ((xhnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xhnVar.y();
                        }
                        xho xhoVar2 = (xho) xhnVar.b;
                        xhoVar2.c = xgwVarA;
                        xhoVar2.b = 5;
                        xho xhoVarA = xkj.a(xhnVar);
                        if ((xhsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            xhsVar.y();
                        }
                        xht xhtVar2 = (xht) xhsVar.b;
                        xhtVar2.c = xhoVarA;
                        xhtVar2.b = 3;
                        xht xhtVarA = xlq.a(xhsVar);
                        try {
                            int i3 = xhtVarA.memoizedSerializedSize;
                            if ((i3 & Integer.MIN_VALUE) != 0) {
                                iA3 = abza.a.a(xhtVarA.getClass()).a(xhtVarA);
                                if (iA3 < 0) {
                                    throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA3 = i3 & Integer.MAX_VALUE;
                                if (iA3 == Integer.MAX_VALUE) {
                                    iA3 = abza.a.a(xhtVarA.getClass()).a(xhtVarA);
                                    if (iA3 < 0) {
                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                    }
                                    xhtVarA.memoizedSerializedSize = (xhtVarA.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                }
                            }
                            byte[] bArr3 = new byte[iA3];
                            abvw abvwVar3 = new abvw(bArr3, 0, iA3);
                            abza.a.a(xhtVarA.getClass()).m(xhtVarA, abwa.a(abvwVar3));
                            abvwVar3.K();
                            assistantManagerNative.sendVoicelessInteraction(bArr3, "KatnissVoicelessInteraction", new AssistantManagerNative.VoicelessOptions(AssistantManagerNative.RequestSource.OTHER, true));
                            return agpu.a;
                        } catch (IOException e) {
                            throw new RuntimeException(a.x(xhtVarA, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(a.z(" to a ByteString threw an IOException (should never happen).", xixVarA), e2);
                    }
                } catch (IOException e3) {
                    throw new RuntimeException(a.z(" to a ByteString threw an IOException (should never happen).", abltVarA), e3);
                }
            }
        });
    }

    @Override // defpackage.jdt
    public final void z(Bundle bundle) {
        bundle.getClass();
        if (R()) {
            aH(bundle);
        } else {
            this.ba = bundle;
            m();
        }
    }
}

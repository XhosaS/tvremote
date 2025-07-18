package defpackage;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.katniss.search.serviceapi.KatnissVoiceInteractionService;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyp extends lyq implements fcg {
    public static final zdy a = zdy.h("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer");
    public static final Duration b;
    public final lyd A;
    private final AccessibilityManager C;
    private final fby D;
    private final agte E;
    private final ahbt F;
    private final gou G;
    private final gpb H;
    private final ewc I;
    private final agow J;
    private final gph K;
    private final jbu L;
    private final agow M;
    private final gpc N;
    private final jcy O;
    private final gyy P;
    private final gtu Q;
    private final lyu R;
    private final gxj S;
    private final gpe T;
    private final boolean U;
    private final agow V;
    private final fkt W;
    private final jbx X;
    private final gly Y;
    private final agow Z;
    private final agow aa;
    private final WindowManager ab;
    private final gtt ac;
    private final ewa ad;
    private final ewb ae;
    private final gaa af;
    private final AtomicBoolean ag;
    private final AccessibilityManager.TouchExplorationStateChangeListener ah;
    private final agpc ai;
    private final gxn aj;
    private final fcu ak;
    private final lxv al;
    private final lxx am;
    public final ActivityManager c;
    public final eyw d;
    public final gkz e;
    public final jdt f;
    public final vxe g;
    public final agow h;
    public final Context i;
    public final vrs j;
    public final ahbt k;
    public final jcv l;
    public final jcc m;
    public final jhs n;
    public final gzu o;
    public final boolean p;
    public final glk q;
    public final KatnissVoiceInteractionService r;
    public final agow s;
    public final gpd t;
    public final agow u;
    public final icl v;
    public final abm w;
    public final lzb x;
    public final evt y;
    public String z;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(30L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
    }

    public lyp(AccessibilityManager accessibilityManager, ActivityManager activityManager, eyw eywVar, fby fbyVar, gkz gkzVar, jdt jdtVar, vxe vxeVar, agow agowVar, Context context, vrs vrsVar, agte agteVar, ahbt ahbtVar, ahbt ahbtVar2, gou gouVar, gpb gpbVar, ewc ewcVar, jcv jcvVar, jcc jccVar, gxn gxnVar, agow agowVar2, jhs jhsVar, gph gphVar, jbu jbuVar, agow agowVar3, gzu gzuVar, gpc gpcVar, boolean z, jcy jcyVar, gyy gyyVar, glk glkVar, gtu gtuVar, KatnissVoiceInteractionService katnissVoiceInteractionService, agow agowVar4, lyu lyuVar, gpd gpdVar, gxj gxjVar, gpe gpeVar, agow agowVar5, boolean z2, icl iclVar, abm abmVar, agow agowVar6, fkt fktVar, fcu fcuVar, jbx jbxVar, lzb lzbVar, evt evtVar, gly glyVar, agow agowVar7, agow agowVar8, WindowManager windowManager) {
        activityManager.getClass();
        eywVar.getClass();
        fbyVar.getClass();
        gkzVar.getClass();
        jdtVar.getClass();
        agowVar.getClass();
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        ahbtVar2.getClass();
        gouVar.getClass();
        gpbVar.getClass();
        ewcVar.getClass();
        jcvVar.getClass();
        gxnVar.getClass();
        agowVar2.getClass();
        jhsVar.getClass();
        jbuVar.getClass();
        agowVar3.getClass();
        gzuVar.getClass();
        gpcVar.getClass();
        jcyVar.getClass();
        gyyVar.getClass();
        glkVar.getClass();
        gtuVar.getClass();
        agowVar4.getClass();
        gpdVar.getClass();
        gxjVar.getClass();
        gpeVar.getClass();
        iclVar.getClass();
        agowVar6.getClass();
        fcuVar.getClass();
        lzbVar.getClass();
        evtVar.getClass();
        glyVar.getClass();
        agowVar7.getClass();
        agowVar8.getClass();
        windowManager.getClass();
        this.C = accessibilityManager;
        this.c = activityManager;
        this.d = eywVar;
        this.D = fbyVar;
        this.e = gkzVar;
        this.f = jdtVar;
        this.g = vxeVar;
        this.h = agowVar;
        this.i = context;
        this.j = vrsVar;
        this.E = agteVar;
        this.F = ahbtVar;
        this.k = ahbtVar2;
        this.G = gouVar;
        this.H = gpbVar;
        this.I = ewcVar;
        this.l = jcvVar;
        this.m = jccVar;
        this.aj = gxnVar;
        this.J = agowVar2;
        this.n = jhsVar;
        this.K = gphVar;
        this.L = jbuVar;
        this.M = agowVar3;
        this.o = gzuVar;
        this.N = gpcVar;
        this.p = z;
        this.O = jcyVar;
        this.P = gyyVar;
        this.q = glkVar;
        this.Q = gtuVar;
        this.r = katnissVoiceInteractionService;
        this.s = agowVar4;
        this.R = lyuVar;
        this.t = gpdVar;
        this.S = gxjVar;
        this.T = gpeVar;
        this.u = agowVar5;
        this.U = z2;
        this.v = iclVar;
        this.w = abmVar;
        this.V = agowVar6;
        this.W = fktVar;
        this.ak = fcuVar;
        this.X = jbxVar;
        this.x = lzbVar;
        this.y = evtVar;
        this.Y = glyVar;
        this.Z = agowVar7;
        this.aa = agowVar8;
        this.ab = windowManager;
        this.ac = new lyb(this);
        this.z = "";
        this.al = new lxv(this);
        this.ad = new ewa();
        this.ae = new ewb() { // from class: lxw
            @Override // defpackage.ewb
            public final void a(Intent intent) {
                intent.getAction();
                String action = intent.getAction();
                if (action != null) {
                    lyp lypVar = this.a;
                    int iHashCode = action.hashCode();
                    if (iHashCode == -2128145023) {
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            jdt jdtVar2 = lypVar.f;
                            xdo xdoVar = xdo.a;
                            xdm xdmVar = new xdm();
                            xek.b(3, xdmVar);
                            jdtVar2.E(xek.a(xdmVar));
                            jdtVar2.q(false);
                            lypVar.l.j(false);
                            return;
                        }
                        return;
                    }
                    if (iHashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                        jdt jdtVar3 = lypVar.f;
                        xdo xdoVar2 = xdo.a;
                        xdm xdmVar2 = new xdm();
                        xek.b(2, xdmVar2);
                        jdtVar3.E(xek.a(xdmVar2));
                        jdtVar3.q(true);
                        lypVar.l.j(true);
                    }
                }
            }
        };
        this.af = new gaa();
        this.am = new lxx(this);
        this.A = new lyd(this);
        this.ag = new AtomicBoolean(false);
        this.ah = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: lxy
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) throws IllegalStateException {
                this.a.g();
            }
        };
        this.ai = new agpn(new agum() { // from class: lxz
            @Override // defpackage.agum
            public final Object a() {
                zdy zdyVar = lyp.a;
                return new jbi();
            }
        });
    }

    private final jbi h() {
        return (jbi) this.ai.a();
    }

    private final void i(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) a.d()).p(e).q("com/google/android/katniss/search/serviceapi/KatnissVoiceInteractionServicePeer", "tryUnregisterReceiver", 459, "KatnissVoiceInteractionServicePeer.kt")).u("Failed to unregister receiver.");
        }
    }

    private final boolean j() {
        jod jodVar = (jod) this.s.a();
        ComponentName componentName = irm.a;
        return jodVar.g(irm.p);
    }

    public final int a(int i) {
        if (((Boolean) this.h.a()).booleanValue()) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f4, code lost:
    
        if (e(r2) != r3) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyp.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lye
            if (r0 == 0) goto L13
            r0 = r7
            lye r0 = (defpackage.lye) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lye r0 = new lye
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.agpl.b(r7)
            gph r7 = r6.K
            gph r2 = defpackage.gph.a
            if (r7 != r2) goto L67
            fby r7 = r6.D
            boolean r2 = r7.x()
            if (r2 == 0) goto L49
            vxe r2 = r6.g
            gxj r4 = r6.S
            android.net.Uri r5 = defpackage.urr.a
            r2.a(r5, r3, r4)
        L49:
            r0.c = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 == r1) goto L66
        L51:
            fby r7 = r6.D
            boolean r0 = r7.w()
            if (r0 == 0) goto L62
            vxe r0 = r6.g
            gpe r1 = r6.T
            android.net.Uri r2 = defpackage.fcd.b
            r0.a(r2, r3, r1)
        L62:
            r7.s()
            goto L67
        L66:
            return r1
        L67:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyp.c(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.lyf
            if (r0 == 0) goto L13
            r0 = r7
            lyf r0 = (defpackage.lyf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lyf r0 = new lyf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r7)
            goto L80
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.agpl.b(r7)
            goto L5b
        L36:
            defpackage.agpl.b(r7)
            agow r7 = r6.u
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L93
            vrs r7 = r6.j
            android.net.Uri r2 = defpackage.esy.a
            r2.getClass()
            yyk r5 = defpackage.esy.c
            r5.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.gbv.c(r7, r2, r5, r0)
            if (r7 == r1) goto L92
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6c
            vxe r7 = r6.g
            gpd r2 = r6.t
            android.net.Uri r5 = defpackage.esy.a
            r7.a(r5, r4, r2)
        L6c:
            vrs r7 = r6.j
            android.net.Uri r2 = defpackage.esy.b
            r2.getClass()
            yyk r5 = defpackage.esy.d
            r5.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.gbv.c(r7, r2, r5, r0)
            if (r7 == r1) goto L92
        L80:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L93
            vxe r7 = r6.g
            gpd r0 = r6.t
            android.net.Uri r1 = defpackage.esy.b
            r7.a(r1, r4, r0)
            goto L93
        L92:
            return r1
        L93:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyp.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        if (defpackage.ahal.a(r11, r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyp.e(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r8) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyp.f(agsw):java.lang.Object");
    }

    public final void g() throws IllegalStateException {
        if (this.C.isTouchExplorationEnabled()) {
            this.aj.a(1);
        } else {
            this.aj.close();
        }
    }
}

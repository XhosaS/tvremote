package defpackage;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.service.voice.VoiceInteractionService;
import android.view.Display;
import com.google.android.katniss.R;
import com.google.android.tv.remote.service.AudioStream;
import j$.time.Duration;
import java.io.IOException;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jot implements jod {
    public static final joi a = new joi();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl");
    private static final Duration t;
    private final Supplier A;
    private final hxu B;
    private final agow C;
    private final ConnectivityManager D;
    private final ahbt E;
    private final Display F;
    private final Supplier G;
    private final agow H;
    private final agow I;
    private final agow J;
    private final jhs K;
    private final Executor L;
    private final jbu M;
    private final hxv N;
    private final boolean O;
    private final Supplier P;
    private final jcy Q;
    private final exl R;
    private final agow S;
    private final gfr T;
    private final glq U;
    private final icj V;
    private final gmd W;
    private final agow X;
    private final fxu Y;
    private final agow Z;
    private final icl aa;
    private final NotificationManager ab;
    private final agow ac;
    private final gof ad;
    private final agow ae;
    private final iyh af;
    private final gmu ag;
    private final agow ah;
    private final agow ai;
    private final jnr aj;
    private final ghr ak;
    private volatile boolean al;
    private boolean am;
    private volatile boolean an;
    private boolean ao;
    private final gxn ap;
    private final exz aq;
    private final fcu ar;
    private final igs as;
    private final gnv at;
    private int au;
    public final ActivityManager c;
    public final jdt d;
    public final frr e;
    public final Context f;
    public final gph g;
    public final gzu h;
    public final ftc i;
    public final gtu j;
    public final agow k;
    public final lzb l;
    public final fmg m;
    public final ztw n;
    public final fad o;
    public boolean p;
    public int q;
    public String r;
    public final hxs s;
    private final eyw u;
    private final fby v;
    private final AppOpsManager w;
    private final agow x;
    private final gkz y;
    private final agow z;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        durationOfSeconds.getClass();
        t = durationOfSeconds;
    }

    public jot(ActivityManager activityManager, eyw eywVar, fby fbyVar, AppOpsManager appOpsManager, agow agowVar, gkz gkzVar, agow agowVar2, Supplier supplier, jdt jdtVar, hxu hxuVar, agow agowVar3, frr frrVar, ConnectivityManager connectivityManager, Context context, ahbt ahbtVar, Display display, Supplier supplier2, gxn gxnVar, agow agowVar4, agow agowVar5, agow agowVar6, jhs jhsVar, Executor executor, gph gphVar, jbu jbuVar, gzu gzuVar, hxv hxvVar, ftc ftcVar, boolean z, Supplier supplier3, jcy jcyVar, exl exlVar, gtu gtuVar, agow agowVar7, gfr gfrVar, exz exzVar, glq glqVar, icj icjVar, gmd gmdVar, agow agowVar8, fxu fxuVar, agow agowVar9, icl iclVar, NotificationManager notificationManager, agow agowVar10, gof gofVar, agow agowVar11, fcu fcuVar, iyh iyhVar, agow agowVar12, lzb lzbVar, gmu gmuVar, igs igsVar, agow agowVar13, agow agowVar14, jnr jnrVar, fmg fmgVar, ztw ztwVar, ghp ghpVar, ghr ghrVar, fad fadVar, hxs hxsVar, gnv gnvVar) {
        activityManager.getClass();
        eywVar.getClass();
        fbyVar.getClass();
        agowVar.getClass();
        gkzVar.getClass();
        agowVar2.getClass();
        jdtVar.getClass();
        hxuVar.getClass();
        agowVar3.getClass();
        context.getClass();
        ahbtVar.getClass();
        display.getClass();
        gxnVar.getClass();
        agowVar4.getClass();
        agowVar5.getClass();
        agowVar6.getClass();
        jhsVar.getClass();
        executor.getClass();
        jbuVar.getClass();
        gzuVar.getClass();
        hxvVar.getClass();
        jcyVar.getClass();
        gtuVar.getClass();
        gfrVar.getClass();
        exzVar.getClass();
        gmdVar.getClass();
        agowVar8.getClass();
        fxuVar.getClass();
        agowVar9.getClass();
        iclVar.getClass();
        agowVar10.getClass();
        gofVar.getClass();
        agowVar11.getClass();
        fcuVar.getClass();
        iyhVar.getClass();
        agowVar12.getClass();
        lzbVar.getClass();
        gmuVar.getClass();
        igsVar.getClass();
        agowVar13.getClass();
        agowVar14.getClass();
        jnrVar.getClass();
        ztwVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        fadVar.getClass();
        hxsVar.getClass();
        gnvVar.getClass();
        this.c = activityManager;
        this.u = eywVar;
        this.v = fbyVar;
        this.w = appOpsManager;
        this.x = agowVar;
        this.y = gkzVar;
        this.z = agowVar2;
        this.A = supplier;
        this.d = jdtVar;
        this.B = hxuVar;
        this.C = agowVar3;
        this.e = frrVar;
        this.D = connectivityManager;
        this.f = context;
        this.E = ahbtVar;
        this.F = display;
        this.G = supplier2;
        this.ap = gxnVar;
        this.H = agowVar4;
        this.I = agowVar5;
        this.J = agowVar6;
        this.K = jhsVar;
        this.L = executor;
        this.g = gphVar;
        this.M = jbuVar;
        this.h = gzuVar;
        this.N = hxvVar;
        this.i = ftcVar;
        this.O = z;
        this.P = supplier3;
        this.Q = jcyVar;
        this.R = exlVar;
        this.j = gtuVar;
        this.S = agowVar7;
        this.T = gfrVar;
        this.aq = exzVar;
        this.U = glqVar;
        this.V = icjVar;
        this.W = gmdVar;
        this.X = agowVar8;
        this.Y = fxuVar;
        this.Z = agowVar9;
        this.aa = iclVar;
        this.ab = notificationManager;
        this.ac = agowVar10;
        this.ad = gofVar;
        this.ae = agowVar11;
        this.ar = fcuVar;
        this.af = iyhVar;
        this.k = agowVar12;
        this.l = lzbVar;
        this.ag = gmuVar;
        this.as = igsVar;
        this.ah = agowVar13;
        this.ai = agowVar14;
        this.aj = jnrVar;
        this.m = fmgVar;
        this.n = ztwVar;
        this.ak = ghrVar;
        this.o = fadVar;
        this.s = hxsVar;
        this.at = gnvVar;
        this.r = "";
        this.au = 1;
    }

    private final void r(int i) {
        lzb lzbVar = this.l;
        lzbVar.t();
        Bundle bundle = new Bundle();
        bundle.putInt("punt_type_argument", i);
        lzbVar.k();
        Message messageObtain = Message.obtain((Handler) null, 41);
        messageObtain.setData(bundle);
        lzbVar.j(messageObtain);
    }

    private final void s(final Intent intent, AudioStream audioStream) {
        this.at.b(intent);
        joi joiVar = a;
        gmd gmdVar = this.W;
        joiVar.a(gmdVar);
        if (this.N.b()) {
            gmdVar.b(gmc.az);
            gmdVar.b(gmc.aB);
        } else {
            gmdVar.b(gmc.c);
            gmdVar.b(gmc.aa);
        }
        gmdVar.b(gmc.d);
        gmdVar.b(gmc.X);
        gmdVar.b(gmc.a);
        if (this.l.q) {
            gmdVar.b(gmc.ab);
        }
        gfr gfrVar = this.T;
        gfrVar.b(rpm.dy(), null, null);
        if (((Boolean) this.Z.a()).booleanValue()) {
            agow agowVar = this.S;
            ((gfn) agowVar.a()).a(rpm.g()).b().c();
            ((gfn) agowVar.a()).a(rpm.j()).b().c();
            ((gfn) agowVar.a()).a(rpm.m()).b().c();
        } else {
            gfq.b(gfrVar, rpm.g(), null, null, 14);
            gfq.b(gfrVar, rpm.j(), null, null, 14);
            gfq.b(gfrVar, rpm.m(), null, null, 14);
        }
        this.ag.B();
        this.U.x();
        jdt jdtVar = this.d;
        jdtVar.az(jlv.INVOCATION_TYPE_INTENT);
        if (!((Boolean) this.k.a()).booleanValue() || jdtVar.d() == null) {
            ahal.e(this.E, null, 0, new jor(this, audioStream, intent, null), 3).w(new agux() { // from class: joh
                public final /* synthetic */ String a = "#startAssistantInteraction";

                @Override // defpackage.agux
                public final Object a(Object obj) {
                    String str = this.a;
                    Intent intent2 = intent;
                    Throwable th = (Throwable) obj;
                    if (th == null) {
                        ((zdv) jot.b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl$Companion", "completionHandlerFor$lambda$1", 1455, "KatnissVoiceInteractionUtilsImpl.kt")).F("%s succeeded with intent: %s", str, intent2.getAction());
                    } else if (th instanceof CancellationException) {
                        joi joiVar2 = jot.a;
                        intent2.getAction();
                    } else {
                        ((zdv) ((zdv) jot.b.d()).p(th).q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl$Companion", "completionHandlerFor$lambda$1", 1460, "KatnissVoiceInteractionUtilsImpl.kt")).F("%s failed with intent: %s", str, intent2);
                    }
                    return agpu.a;
                }
            });
            this.B.b();
        }
    }

    private final boolean t(Intent intent, AudioStream audioStream) {
        jnr jnrVar = this.aj;
        if (!jnrVar.l()) {
            return false;
        }
        if (((Boolean) this.J.a()).booleanValue() && jnrVar.n()) {
            Intent intentPutExtras = new Intent("android.intent.action.ASSIST").putExtra("isMicOpen", true).putExtras(intent);
            intentPutExtras.getClass();
            c(intentPutExtras);
        }
        return jnrVar.j(audioStream);
    }

    private final boolean u(Intent intent, boolean z) {
        if (k(z) || j() || i(intent, z)) {
            return true;
        }
        eyw eywVar = this.u;
        if (eywVar.d()) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldBlockAssistantInteraction", 1270, "KatnissVoiceInteractionUtilsImpl.kt")).u("Trying to start Assistant Interaction when AssistantSetupActivity is visible, abort.");
            lzb lzbVar = this.l;
            lzbVar.k();
            lzbVar.j(Message.obtain((Handler) null, 44));
            return true;
        }
        if (agvy.c("com.nvidia.hotwordsetup", this.h.a)) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldBlockAssistantInteraction", 1279, "KatnissVoiceInteractionUtilsImpl.kt")).u("Trying to start Assistant Interaction when Shield hotword setup screen is visible, abort.");
            return true;
        }
        if (!eywVar.j) {
            return false;
        }
        ((zdv) b.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldBlockAssistantInteraction", 1288, "KatnissVoiceInteractionUtilsImpl.kt")).u("Trying to start Assistant Interaction when KeyboardSearchActivity is visible, abort.");
        return true;
    }

    private final boolean v() {
        return this.g == gph.a && this.V.c(icg.t).contains(this.r);
    }

    private final void w() {
        this.u.c(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.jom
            if (r0 == 0) goto L13
            r0 = r7
            jom r0 = (defpackage.jom) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jom r0 = new jom
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            jot r0 = r0.d
            defpackage.agpl.b(r7)
            goto La0
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            jot r2 = r0.d
            defpackage.agpl.b(r7)
            goto L79
        L3e:
            jot r2 = r0.d
            defpackage.agpl.b(r7)
            goto L5c
        L44:
            defpackage.agpl.b(r7)
            gtu r7 = r6.j
            joo r2 = new joo
            r2.<init>(r6)
            r7.q(r2)
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = r7.j(r0)
            if (r7 == r1) goto Lab
            r2 = r6
        L5c:
            android.accounts.Account r7 = (android.accounts.Account) r7
            if (r7 == 0) goto L63
            java.lang.String r7 = r7.name
            goto L64
        L63:
            r7 = 0
        L64:
            if (r7 != 0) goto L68
            java.lang.String r7 = ""
        L68:
            r2.r = r7
            frr r7 = r6.e
            java.lang.String r2 = r6.r
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 == r1) goto Lab
            r2 = r6
        L79:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2.q = r7
            fxu r7 = r6.Y
            fxk r2 = new fxk
            fxr r4 = defpackage.ftc.a
            joq r5 = new joq
            r5.<init>(r6)
            r2.<init>(r4, r5)
            r7.d(r2)
            ftc r7 = r6.i
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L9f
            goto Lab
        L9f:
            r0 = r6
        La0:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0.p = r7
            agpu r7 = defpackage.agpu.a
            return r7
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jot.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // defpackage.jod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Intent r24) throws java.lang.IllegalStateException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jot.b(android.content.Intent):void");
    }

    @Override // defpackage.jod
    public final void c(final Intent intent) {
        if (!h() && !((Boolean) this.x.a()).booleanValue()) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "launchVoicePlate", 569, "KatnissVoiceInteractionUtilsImpl.kt")).v("#launchVoicePlate returning on display state is %s.", this.F.getState());
            return;
        }
        intent.setComponent(null);
        if (agvy.c(Looper.myLooper(), Looper.getMainLooper())) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "launchVoicePlate", 575, "KatnissVoiceInteractionUtilsImpl.kt")).u("#launchVoicePlate in UI thread.");
            this.s.a.n(intent);
        } else {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "launchVoicePlate", 580, "KatnissVoiceInteractionUtilsImpl.kt")).u("#launchVoicePlate in background thread.");
            this.L.execute(wyo.h(new Runnable() { // from class: jof
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s.a.n(intent);
                }
            }));
        }
    }

    @Override // defpackage.jod
    public final void d(Intent intent, AudioStream audioStream) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorE;
        jol jolVar = new jol(this, null);
        ahbt ahbtVar = this.E;
        ahal.e(ahbtVar, null, 0, jolVar, 3);
        this.d.N("");
        if (this.O && !this.aa.i(icg.d, true)) {
            this.q++;
            ahal.e(ahbtVar, null, 0, new joj(this, null), 3);
        }
        if (t(intent, audioStream)) {
            return;
        }
        jnr jnrVar = this.aj;
        if (jnrVar.m()) {
            jnrVar.d();
            s(intent, audioStream);
        } else {
            if (u(intent, true)) {
                if (audioStream == null || (parcelFileDescriptorE = audioStream.e()) == null) {
                    return;
                }
                parcelFileDescriptorE.closeWithError("Assistant launch stopped.");
                return;
            }
            s(intent, audioStream);
            Intent intentPutExtras = new Intent("android.intent.action.ASSIST").putExtra("isMicOpen", true).putExtras(intent);
            intentPutExtras.getClass();
            c(intentPutExtras);
        }
    }

    @Override // defpackage.jod
    public final void e(boolean z) {
        this.an = z;
    }

    @Override // defpackage.jod
    public final boolean f() {
        ConnectivityManager connectivityManager = this.D;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return (activeNetwork == null || connectivityManager.getNetworkCapabilities(activeNetwork) == null) ? false : true;
    }

    @Override // defpackage.jod
    public final boolean g(ComponentName componentName) {
        componentName.getClass();
        return VoiceInteractionService.isActiveService(this.f, componentName);
    }

    @Override // defpackage.jod
    public final boolean h() {
        return this.F.getState() == 2;
    }

    @Override // defpackage.jod
    public final boolean i(Intent intent, boolean z) {
        if (this.u.d()) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeBringUpSetupScreens", 630, "KatnissVoiceInteractionUtilsImpl.kt")).u("Trying to start Assistant setup when AssistantSetupActivity is visible, abort.");
            return false;
        }
        hxv hxvVar = this.N;
        if (hxvVar.c() && hxvVar.a().length() > 0) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeBringUpSetupScreens", 636, "KatnissVoiceInteractionUtilsImpl.kt")).u("Gemini setup is required. Launching Gemini setup.");
            p();
            igs igsVar = this.as;
            Intent intent2 = new Intent();
            ComponentName componentName = irm.a;
            igsVar.a(intent2, irm.l);
            return true;
        }
        if (q()) {
            ((zdv) b.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeBringUpSetupScreens", 642, "KatnissVoiceInteractionUtilsImpl.kt")).u("Launching full oobe setup, stopping Assistant interaction.");
            p();
            w();
            ComponentName componentName2 = irm.a;
            Intent component = intent.setComponent(irm.p);
            igs igsVar2 = this.as;
            Intent intentPutExtra = new Intent().putExtra("android.intent.extra.INTENT", component).putExtra("START_VIA_MIC_PRESS", true).putExtra("START_POST_SETUP_OOBE_VIA_MIC_PRESS", true);
            intentPutExtra.getClass();
            igsVar2.a(intentPutExtra, irm.e);
            return true;
        }
        if (((Boolean) this.A.get()).booleanValue() && ((Boolean) this.G.get()).booleanValue()) {
            fcu fcuVar = this.ar;
            agow agowVar = this.ae;
            Object objA = agowVar.a();
            objA.getClass();
            if (fcuVar.c(((Boolean) objA).booleanValue()) && !this.V.c(icg.p).contains(this.r)) {
                ((zdv) b.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeBringUpSetupScreens", 649, "KatnissVoiceInteractionUtilsImpl.kt")).u("Launching dsc oobe setup, stopping Assistant interaction.");
                p();
                w();
                Object objA2 = agowVar.a();
                objA2.getClass();
                if (fcuVar.c(((Boolean) objA2).booleanValue())) {
                    ComponentName componentName3 = irm.a;
                    Intent component2 = intent.setComponent(irm.p);
                    igs igsVar3 = this.as;
                    Intent intentPutExtra2 = new Intent().putExtra("android.intent.extra.INTENT", component2).putExtra("START_VIA_MIC_PRESS", true).putExtra("start_from_dsc", true);
                    intentPutExtra2.getClass();
                    igsVar3.a(intentPutExtra2, irm.e);
                } else {
                    Intent intent3 = new Intent();
                    intent3.putExtra("dsc_entry_point", "FROM_ASSISTANT_BUTTON");
                    igs igsVar4 = this.as;
                    ComponentName componentName4 = irm.a;
                    igsVar4.a(intent3, irm.a);
                }
                return true;
            }
        }
        boolean z2 = this.O && ((Boolean) this.P.get()).booleanValue() && !this.V.i(icg.d, false) && z;
        zdy zdyVar = b;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldStartHotwordSetup", 853, "KatnissVoiceInteractionUtilsImpl.kt")).v("Mic button press count: %d", this.q);
        if (!z2 || (!(this.p && this.g == gph.a) && this.q < this.Q.a())) {
            return false;
        }
        ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeBringUpSetupScreens", 662, "KatnissVoiceInteractionUtilsImpl.kt")).u("Launching farfield oobe setup, stopping Assistant interaction.");
        p();
        w();
        if (this.g == gph.a) {
            lzb lzbVar = this.l;
            lzbVar.t();
            lzbVar.k();
            lzbVar.j(Message.obtain((Handler) null, 30));
        } else {
            Intent intent4 = new Intent();
            intent4.putExtra("start_stop_hotword", true);
            intent4.putExtra("START_VIA_MIC_PRESS", true);
            igs igsVar5 = this.as;
            ComponentName componentName5 = irm.a;
            igsVar5.a(intent4, irm.b);
        }
        return true;
    }

    @Override // defpackage.jod
    public final boolean j() {
        fby fbyVar = this.v;
        if (!fbyVar.t() && !fbyVar.u() && !fbyVar.v()) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybePuntForLauncherxKidsModeOrPrivacyModeOrBasicMode", 684, "KatnissVoiceInteractionUtilsImpl.kt")).u("Not in LauncherX kids mode or privacy mode.");
            return false;
        }
        if (this.g == gph.a && ((Boolean) this.H.a()).booleanValue() && fbyVar.u()) {
            if (q()) {
                p();
                r(1);
                return true;
            }
            if (!v()) {
                return false;
            }
            p();
            r(2);
            return true;
        }
        ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybePuntForLauncherxKidsModeOrPrivacyModeOrBasicMode", 705, "KatnissVoiceInteractionUtilsImpl.kt")).u("Assistant is not enabled in LauncherX kids mode or privacy mode. Will punt.");
        p();
        if (this.u.l) {
            return true;
        }
        lzb lzbVar = this.l;
        lzbVar.t();
        lzbVar.w(this.f.getString(R.string.kids_mode_punt));
        feq.e(new Handler(Looper.getMainLooper()), t, new Runnable() { // from class: joe
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l.q(false);
            }
        });
        this.ak.Q(2, 1);
        return true;
    }

    @Override // defpackage.jod
    public final boolean k(boolean z) {
        if (!v() || !z) {
            return false;
        }
        ((zdv) b.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "maybeShowVoiceInputDisabledNotification", 742, "KatnissVoiceInteractionUtilsImpl.kt")).u("Voice input disabled, stopping Assistant interaction.");
        p();
        a.b(this.f, this.ab, this.ak);
        return true;
    }

    @Override // defpackage.jod
    public final void l() {
        this.al = true;
    }

    @Override // defpackage.jod
    public final int m() {
        return this.au;
    }

    public final int n(AudioStream audioStream) {
        int i;
        ParcelFileDescriptor parcelFileDescriptorE;
        int i2 = 2;
        if (audioStream != null) {
            this.d.B(audioStream.c());
            int iC = audioStream.c();
            if (iC != 0) {
                i = 1;
                if (iC == 1) {
                    i = 4;
                } else if (iC == 2) {
                    i = 5;
                }
            } else {
                i = 3;
            }
        } else {
            this.d.B(0);
            i = 2;
        }
        int i3 = -1;
        int iDetachFd = (audioStream == null || (parcelFileDescriptorE = audioStream.e()) == null) ? -1 : parcelFileDescriptorE.detachFd();
        if (iDetachFd == -1) {
            this.ak.G(8);
            if (i != 3) {
            }
            this.ak.F(i2);
            return i3;
        }
        i3 = iDetachFd;
        i2 = i;
        this.ak.F(i2);
        return i3;
    }

    public final void o(String str) {
        gph gphVar;
        if (((Boolean) this.C.a()).booleanValue() && ((gphVar = this.g) == gph.b || gphVar == gph.c || !this.u.l)) {
            this.l.y(this.ad.d(str));
        } else {
            this.l.y(this.ad.c(str));
        }
    }

    public final void p() {
        jdt jdtVar = this.d;
        if (jdtVar.R()) {
            jdtVar.M();
        }
    }

    public final boolean q() {
        boolean z = false;
        if (!gts.a(this.r)) {
            zdy zdyVar = b;
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldStartFullSetup", 778, "KatnissVoiceInteractionUtilsImpl.kt")).u("CurrentAccountName is invalid when trying to launching full setup.");
            if (this.g == gph.a) {
                ((zdv) zdyVar.d().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldStartFullSetup", 781, "KatnissVoiceInteractionUtilsImpl.kt")).u("Skipping setup on Amati when currentAccountName is invalid.");
                return false;
            }
        }
        Object obj = this.A.get();
        obj.getClass();
        if (((Boolean) obj).booleanValue()) {
            icj icjVar = this.V;
            Collection collectionC = icjVar.c(icg.r);
            Collection collectionC2 = icjVar.c(icg.q);
            Collection collectionC3 = icjVar.c(icg.s);
            if (!collectionC.contains(this.r) && !collectionC2.contains(this.r) && !collectionC3.contains(this.r) && (this.r.length() != 0 || (!collectionC.contains("key_no_account") && !collectionC2.contains("key_no_account") && !collectionC3.contains("key_no_account")))) {
                ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "isUdcPermissionStateKeyMissing", 819, "KatnissVoiceInteractionUtilsImpl.kt")).u("UDC permission is missing for current search account.");
                z = true;
            }
        }
        if (z) {
            ((zdv) b.b().q("com/google/android/apps/tvsearch/voice/shared/KatnissVoiceInteractionUtilsImpl", "shouldStartFullSetup", 791, "KatnissVoiceInteractionUtilsImpl.kt")).x("UDC record is missing and Assistant is enabled in: [%s]", Locale.getDefault().toLanguageTag());
        }
        return z;
    }
}

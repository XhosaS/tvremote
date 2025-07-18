package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.service.voice.AlwaysOnHotwordDetector;
import j$.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jcv {
    private static final Duration I;
    private static final Duration J;
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/dsp/DspManager");
    public static final Duration b = Duration.ofSeconds(2);
    static final Duration c = Duration.ofSeconds(2);
    public static final long d;
    final PowerManager.WakeLock F;
    private final agow K;
    private final agow L;
    private final fjt M;
    public final Context e;
    public final AudioManager f;
    public final jcy g;
    public final icj h;
    public final Executor i;
    public final fxu j;
    public final gpb k;
    public final boolean l;
    public final PowerManager m;
    public boolean n;
    public jcs o;
    volatile AlwaysOnHotwordDetector q;
    volatile int r;
    public String v;
    public String w;
    public boolean s = false;
    volatile boolean t = false;
    public int u = 0;
    public boolean x = true;
    public boolean y = true;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    boolean C = false;
    public boolean D = true;
    public long E = 0;
    public final BroadcastReceiver G = new jcj(this);
    final AlwaysOnHotwordDetector.Callback H = new jck(this);
    public final jct p = new jct(this, Looper.getMainLooper());

    static {
        Duration durationOfMillis = Duration.ofMillis(200L);
        I = durationOfMillis;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        J = durationOfMinutes;
        d = durationOfMinutes.dividedBy(durationOfMillis);
    }

    public jcv(Context context, AudioManager audioManager, agow agowVar, agow agowVar2, fjt fjtVar, jcy jcyVar, icj icjVar, Executor executor, fxu fxuVar, gpb gpbVar, boolean z, PowerManager powerManager) {
        this.e = context;
        this.f = audioManager;
        this.K = agowVar;
        this.L = agowVar2;
        this.M = fjtVar;
        this.g = jcyVar;
        this.h = icjVar;
        this.i = executor;
        this.j = fxuVar;
        this.k = gpbVar;
        this.l = z;
        this.m = powerManager;
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "Katniss:DSP_TRIGGERED_WAKELOCK");
        this.F = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean l(List list) {
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AudioPlaybackConfiguration audioPlaybackConfigurationM = al$$ExternalSyntheticApiModelOutline0.m(it.next());
                int playerState = audioPlaybackConfigurationM.getPlayerState();
                audioPlaybackConfigurationM.getPlayerInterfaceId();
                if (playerState == 2) {
                    z = true;
                    break;
                }
            }
        }
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "isPlayingMedia", 388, "DspManager.java")).x("Playback state is: %b", Boolean.valueOf(z));
        return z;
    }

    private final zyd o() {
        return zuz.g(this.M.a(), wyo.a(new yqi() { // from class: jch
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                boolean z = false;
                if (((foc) obj).equals(foc.TOGGLE_ON) && this.a.h.i(icg.c, false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), this.i);
    }

    private final void p() {
        try {
            Intent intentCreateUnEnrollIntent = this.q.createUnEnrollIntent();
            if (intentCreateUnEnrollIntent == null) {
                return;
            }
            intentCreateUnEnrollIntent.addFlags(268435456);
            this.o.d(intentCreateUnEnrollIntent);
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "fireUnenrollIntent", (char) 1138, "DspManager.java")).u("Error calling #createUnEnrollIntent.");
        }
    }

    public final zyd a() {
        if (!this.l) {
            return zxn.h(false);
        }
        zyd zydVarO = o();
        yqi yqiVar = new yqi() { // from class: jcf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                jcv jcvVar = this.a;
                Boolean bool = (Boolean) obj;
                boolean zF = jcvVar.g.f(jcvVar.s);
                zdv zdvVar = (zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "calculateShouldRunSoftwareHotwordForDspDeviceFuture", 666, "DspManager.java");
                Boolean boolValueOf = Boolean.valueOf(jcvVar.y);
                Boolean boolValueOf2 = Boolean.valueOf(jcvVar.D);
                Boolean boolValueOf3 = Boolean.valueOf(jcvVar.z);
                Boolean boolValueOf4 = Boolean.valueOf(zF);
                gpb gpbVar = jcvVar.k;
                zdvVar.L("#calculateShouldRunSoftwareHotwordForDspDevice hotwordEnabled: %b, isScreenOn: %b, enableScreenless: %b, isPlayingMedia: %b, isAllowedInEnergyMode: %b, isDeviceProvisioned: %b, hardwareHotwordMicOn: %b", bool, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, Boolean.valueOf(gpbVar.a()), Boolean.valueOf(jcvVar.x));
                if (Build.VERSION.SDK_INT >= 34) {
                    return Boolean.valueOf(bool.booleanValue() && (jcvVar.y || jcvVar.z || (jcvVar.D && zF)) && gpbVar.a() && jcvVar.x);
                }
                return Boolean.valueOf(bool.booleanValue() && (jcvVar.y || (jcvVar.D && jcvVar.z && zF)) && gpbVar.a() && jcvVar.x);
            }
        };
        return zuz.g(zydVarO, wyo.a(yqiVar), this.i);
    }

    public final zyd b() {
        return zuz.g(o(), wyo.a(new yqi() { // from class: jci
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                jcv jcvVar = this.a;
                boolean zC = jcvVar.g.c();
                gpb gpbVar = jcvVar.k;
                gpbVar.a();
                boolean z = false;
                if (((Boolean) obj).booleanValue() && ((jcvVar.y || (jcvVar.D && zC)) && gpbVar.a() && jcvVar.x)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), this.i);
    }

    public final String c() {
        return Build.VERSION.SDK_INT > 34 ? "X Google" : "Ok Google";
    }

    public final /* synthetic */ agpu d() {
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "initialize", 433, "DspManager.java")).u("Hotword toggled.");
        zxn.p(o(), wyo.f(new jcr(this)), this.i);
        return agpu.a;
    }

    public final void e() {
        jct jctVar = this.p;
        jctVar.removeMessages(1);
        jctVar.removeMessages(2);
        jctVar.removeMessages(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcv.f(java.lang.String, java.lang.String):void");
    }

    public final void g(String str) {
        if (this.o == null) {
            ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "maybeChangeHotwordState", 549, "DspManager.java")).u("DspManager not initialized yet.");
        } else if (this.s) {
            zyd zydVarB = b();
            jcn jcnVar = new jcn(this, str);
            zxn.p(zydVarB, wyo.f(jcnVar), this.i);
        }
    }

    public final void h() {
        if (this.l && this.s && this.o != null) {
            zyd zydVarA = a();
            jco jcoVar = new jco(this);
            zxn.p(zydVarA, wyo.f(jcoVar), this.i);
        }
    }

    public final void i(boolean z) {
        ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "onHardwareMicToggleChange", 542, "DspManager.java")).x("Hardware mic toggled to state: %b", Boolean.valueOf(z));
        this.x = z;
        g("hardware mic toggle");
    }

    public final void j(boolean z) {
        zdy zdyVar = a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "onScreenStateChange", 520, "DspManager.java")).x("Screen state changed to: %b", Boolean.valueOf(z));
        this.y = z;
        if (this.o == null) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager", "onScreenStateChange", 523, "DspManager.java")).u("DspManager not initialized yet.");
            return;
        }
        if (!z) {
            jcy jcyVar = this.g;
            boolean z2 = false;
            if (jcyVar.e() && jcyVar.c()) {
                z2 = true;
            }
            this.D = z2;
        }
        g("screen state change");
    }

    final void k() {
        zxn.p(b(), wyo.f(new jcq(this)), this.i);
    }

    public final boolean m() {
        if (this.l) {
            return this.C;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r11 = this;
            boolean r0 = r11.t
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r11.r
            r1 = 2
            java.lang.String r2 = "stopDspRecognition"
            java.lang.String r3 = "com/google/android/apps/tvsearch/voice/dsp/DspManager"
            java.lang.String r9 = "DspManager.java"
            if (r0 != r1) goto L72
            r1 = 0
            android.service.voice.AlwaysOnHotwordDetector r0 = r11.q     // Catch: java.lang.IllegalStateException -> L18 java.lang.UnsupportedOperationException -> L2c
            boolean r0 = r0.stopRecognition()     // Catch: java.lang.IllegalStateException -> L18 java.lang.UnsupportedOperationException -> L2c
            goto L40
        L18:
            r0 = move-exception
            r10 = r0
            zdy r0 = defpackage.jcv.a
            zeo r4 = r0.d()
            java.lang.String r7 = "stopDspRecognition"
            r8 = 826(0x33a, float:1.157E-42)
            java.lang.String r5 = "Error calling #stopRecognition."
            java.lang.String r6 = "com/google/android/apps/tvsearch/voice/dsp/DspManager"
            defpackage.a.v(r4, r5, r6, r7, r8, r9, r10)
            goto L3f
        L2c:
            r0 = move-exception
            r10 = r0
            zdy r0 = defpackage.jcv.a
            zeo r4 = r0.c()
            java.lang.String r7 = "stopDspRecognition"
            r8 = 824(0x338, float:1.155E-42)
            java.lang.String r5 = "stopDspRecognition"
            java.lang.String r6 = "com/google/android/apps/tvsearch/voice/dsp/DspManager"
            defpackage.a.v(r4, r5, r6, r7, r8, r9, r10)
        L3f:
            r0 = r1
        L40:
            zdy r4 = defpackage.jcv.a
            zeo r5 = r4.b()
            zdv r5 = (defpackage.zdv) r5
            r6 = 828(0x33c, float:1.16E-42)
            zeo r5 = r5.q(r3, r2, r6, r9)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r6 = "Stop Dsp Hotword Recognition status %b"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r5.x(r6, r7)
            if (r0 == 0) goto L5e
            r11.t = r1
            return
        L5e:
            zeo r0 = r4.d()
            zdv r0 = (defpackage.zdv) r0
            r1 = 832(0x340, float:1.166E-42)
            zeo r0 = r0.q(r3, r2, r1, r9)
            zdv r0 = (defpackage.zdv) r0
            java.lang.String r1 = "Failed to stop DSP hotword recognition"
            r0.u(r1)
            return
        L72:
            zdy r0 = defpackage.jcv.a
            zeo r0 = r0.b()
            zdv r0 = (defpackage.zdv) r0
            r1 = 835(0x343, float:1.17E-42)
            zeo r0 = r0.q(r3, r2, r1, r9)
            zdv r0 = (defpackage.zdv) r0
            int r1 = r11.r
            java.lang.String r2 = "Not calling stopDspRecognition. Availability %d"
            r0.v(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcv.n():void");
    }
}

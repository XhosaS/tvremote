package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emm {
    public static final Object a = new Object();
    public static ScheduledExecutorService b;
    public static int c;
    private final int A;
    private emg B;
    private ebr C;
    private emi D;
    private dyo E;
    private boolean F;
    private ByteBuffer G;
    private int H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private boolean N;
    private boolean O;
    private long P;
    private float Q;
    private ByteBuffer R;
    private int S;
    private ByteBuffer T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private dyp Y;
    private boolean Z;
    private long aa;
    private boolean ab;
    private boolean ac;
    private long ad;
    private Handler ae;
    private Context af;
    private final boolean ag;
    private xwq ah;
    private xwq ai;
    private hnj aj;
    private dxc ak;
    private final ghc al;
    private final cvi am;
    public elk d;
    public elw e;
    public emg f;
    public AudioTrack g;
    public elm h;
    public elq i;
    public eai j;
    public boolean k;
    public boolean l;
    public long m;
    public Looper n;
    public long o;
    private final Context p;
    private final emc q;
    private final emt r;
    private final eby s;
    private final ems t;
    private final ImmutableList u;
    private final emb v;
    private final ArrayDeque w;
    private int x;
    private final emj y;
    private final emj z;

    public emm(slp slpVar) {
        Context context;
        int deviceId;
        Context context2 = slpVar.a;
        Context applicationContext = context2 == null ? null : context2.getApplicationContext();
        this.p = applicationContext;
        this.E = dyo.a;
        this.h = (elm) (applicationContext == null ? slpVar.e : null);
        this.am = (cvi) slpVar.d;
        this.x = 0;
        Object obj = slpVar.f;
        obj.getClass();
        this.al = (ghc) obj;
        this.v = new emb(new pku(this));
        emc emcVar = new emc();
        this.q = emcVar;
        emt emtVar = new emt();
        this.r = emtVar;
        this.s = new eby();
        this.t = new ems();
        this.u = ImmutableList.of((emc) emtVar, emcVar);
        this.Q = 1.0f;
        this.X = 0;
        this.Y = new dyp();
        eai eaiVar = eai.a;
        this.ai = new xwq(eaiVar, 0L, 0L);
        this.j = eaiVar;
        this.F = false;
        this.w = new ArrayDeque();
        this.y = new emj();
        this.z = new emj();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && (context = slpVar.a) != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.A = i;
        this.ag = true;
    }

    public static boolean A(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static int E(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private final AudioTrack F(emg emgVar) throws elv {
        Context context;
        try {
            int i = this.X;
            int i2 = this.A;
            Context context2 = null;
            if (i2 != -1 && (context = this.p) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.af == null) {
                    this.af = context.createDeviceContext(i2);
                }
                context2 = this.af;
                i = 0;
            }
            return V(emgVar.b(), this.E, i, emgVar.a, context2);
        } catch (elv e) {
            elw elwVar = this.e;
            if (elwVar != null) {
                elwVar.c(e);
            }
            throw e;
        }
    }

    private final void G(long j) {
        eai eaiVar;
        boolean z = false;
        if (U()) {
            eaiVar = eai.a;
        } else {
            if (T()) {
                cvi cviVar = this.am;
                eaiVar = this.j;
                float f = eaiVar.d;
                a.H(f > 0.0f);
                ebx ebxVar = (ebx) cviVar.c;
                if (ebxVar.b != f) {
                    ebxVar.b = f;
                    ebxVar.f = true;
                }
                float f2 = eaiVar.e;
                a.H(f2 > 0.0f);
                if (ebxVar.c != f2) {
                    ebxVar.c = f2;
                    ebxVar.f = true;
                }
            } else {
                eaiVar = eai.a;
            }
            this.j = eaiVar;
        }
        eai eaiVar2 = eaiVar;
        if (T()) {
            cvi cviVar2 = this.am;
            z = this.F;
            ((emr) cviVar2.a).e = z;
        }
        this.F = z;
        this.w.add(new xwq(eaiVar2, Math.max(0L, j), this.f.a(d())));
        Q();
        elw elwVar = this.e;
        if (elwVar != null) {
            elwVar.k(this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H(long r11) throws defpackage.ely {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emm.H(long):void");
    }

    private final void I() {
        if (this.f.c == 1) {
            this.ab = true;
        }
    }

    private final void J() {
        Context context;
        elm elmVar;
        if (this.i == null && (context = this.p) != null) {
            this.n = Looper.myLooper();
            elq elqVar = new elq(context, new pku(this, null), this.E, this.ak);
            this.i = elqVar;
            if (elqVar.h) {
                elmVar = elqVar.f;
                elmVar.getClass();
            } else {
                elqVar.h = true;
                elo eloVar = elqVar.e;
                if (eloVar != null) {
                    eloVar.a.registerContentObserver(eloVar.b, false, eloVar);
                }
                eln elnVar = elqVar.c;
                if (elnVar != null) {
                    dvb.i(elqVar.a).registerAudioDeviceCallback(elnVar, elqVar.b);
                }
                Context context2 = elqVar.a;
                elqVar.f = elm.g(context2, context2.registerReceiver(elqVar.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, elqVar.b), elqVar.g, elqVar.i);
                elmVar = elqVar.f;
            }
            this.h = elmVar;
        }
        this.h.getClass();
    }

    private final void K() throws IllegalStateException {
        if (this.V) {
            return;
        }
        this.V = true;
        emb embVar = this.v;
        long jD = d();
        embVar.r = embVar.b();
        ecn ecnVar = embVar.w;
        embVar.p = edt.y(SystemClock.elapsedRealtime());
        embVar.s = jD;
        if (A(this.g)) {
            this.k = false;
        }
        this.g.stop();
        this.H = 0;
    }

    private final void L(long j) throws ely {
        ByteBuffer byteBuffer;
        H(j);
        if (this.T != null) {
            return;
        }
        if (!this.C.d()) {
            ByteBuffer byteBuffer2 = this.R;
            if (byteBuffer2 != null) {
                O(byteBuffer2);
                H(j);
                return;
            }
            return;
        }
        while (!this.C.c()) {
            do {
                ebr ebrVar = this.C;
                if (ebrVar.d()) {
                    ByteBuffer byteBuffer3 = ebrVar.c[ebrVar.a()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        ebrVar.b(ebu.a);
                        byteBuffer = ebrVar.c[ebrVar.a()];
                    }
                } else {
                    byteBuffer = ebu.a;
                }
                if (byteBuffer.hasRemaining()) {
                    O(byteBuffer);
                    H(j);
                } else {
                    ByteBuffer byteBuffer4 = this.R;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    ebr ebrVar2 = this.C;
                    ByteBuffer byteBuffer5 = this.R;
                    if (ebrVar2.d() && !ebrVar2.e) {
                        ebrVar2.b(byteBuffer5);
                    }
                }
            } while (this.T == null);
            return;
        }
    }

    private final void M(eai eaiVar) {
        xwq xwqVar = new xwq(eaiVar, -9223372036854775807L, -9223372036854775807L);
        if (S()) {
            this.ah = xwqVar;
        } else {
            this.ai = xwqVar;
        }
    }

    private final void N() {
        if (S()) {
            try {
                this.g.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.j.d).setPitch(this.j.e).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                edb.f("DefaultAudioSink", "Failed to set playback params", e);
            }
            eai eaiVar = new eai(this.g.getPlaybackParams().getSpeed(), this.g.getPlaybackParams().getPitch());
            this.j = eaiVar;
            emb embVar = this.v;
            embVar.g = eaiVar.d;
            ema emaVar = embVar.c;
            if (emaVar != null) {
                emaVar.c();
            }
            embVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void O(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emm.O(java.nio.ByteBuffer):void");
    }

    private final void P() {
        if (S()) {
            this.g.setVolume(this.Q);
        }
    }

    private final void Q() {
        ebr ebrVar = this.f.i;
        this.C = ebrVar;
        List list = ebrVar.b;
        list.clear();
        ebrVar.e = false;
        int i = 0;
        while (true) {
            ImmutableList immutableList = ebrVar.a;
            if (i >= immutableList.size()) {
                break;
            }
            ebu ebuVar = (ebu) immutableList.get(i);
            ebuVar.c();
            if (ebuVar.g()) {
                list.add(ebuVar);
            }
            i++;
        }
        ebrVar.c = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= ebrVar.a(); i2++) {
            ebrVar.c[i2] = ((ebu) list.get(i2)).b();
        }
    }

    private final boolean R() throws ely {
        if (!this.C.d()) {
            H(Long.MIN_VALUE);
            return this.T == null;
        }
        ebr ebrVar = this.C;
        if (ebrVar.d() && !ebrVar.e) {
            ebrVar.e = true;
            ((ebu) ebrVar.b.get(0)).d();
        }
        L(Long.MIN_VALUE);
        if (!this.C.c()) {
            return false;
        }
        ByteBuffer byteBuffer = this.T;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private final boolean S() {
        return this.g != null;
    }

    private final boolean T() {
        if (this.Z) {
            return false;
        }
        emg emgVar = this.f;
        if (emgVar.c != 0) {
            return false;
        }
        int i = emgVar.a.as;
        return true;
    }

    private final boolean U() {
        emg emgVar = this.f;
        return emgVar != null && emgVar.j;
    }

    private static final AudioTrack V(elt eltVar, dyo dyoVar, int i, dze dzeVar, Context context) throws UnsupportedOperationException, IllegalArgumentException, elv {
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes((AudioAttributes) (eltVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dyoVar.a().a)).setAudioFormat(edt.I(eltVar.b, eltVar.c, eltVar.a)).setTransferMode(1).setBufferSizeInBytes(eltVar.f).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(eltVar.e);
            }
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new elv(state, eltVar.b, eltVar.c, eltVar.a, eltVar.f, dzeVar, eltVar.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new elv(0, eltVar.b, eltVar.c, eltVar.a, eltVar.f, dzeVar, eltVar.e, e);
        }
    }

    public static boolean x() {
        boolean z;
        synchronized (a) {
            z = c > 0;
        }
        return z;
    }

    public final boolean B(dze dzeVar) {
        return a(dzeVar) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(defpackage.dze r25, int[] r26) throws defpackage.ebt, defpackage.elu {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emm.C(dze, int[]):void");
    }

    public final long D() {
        ArrayDeque arrayDeque;
        long j;
        long jB;
        if (!S() || this.O) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.v.a(), this.f.a(d()));
        while (true) {
            arrayDeque = this.w;
            if (arrayDeque.isEmpty() || jMin < ((xwq) arrayDeque.getFirst()).a) {
                break;
            }
            this.ai = (xwq) arrayDeque.remove();
        }
        xwq xwqVar = this.ai;
        long j2 = jMin - xwqVar.a;
        long jV = edt.v(j2, ((eai) xwqVar.d).d);
        if (arrayDeque.isEmpty()) {
            ebx ebxVar = (ebx) this.am.c;
            if (ebxVar.g()) {
                if (ebxVar.i >= 1024) {
                    long j3 = ebxVar.h;
                    ebw ebwVar = ebxVar.g;
                    ebwVar.getClass();
                    int i = ebwVar.g * ebwVar.a;
                    long j4 = j3 - (i + i);
                    int i2 = ebxVar.e.b;
                    int i3 = ebxVar.d.b;
                    jB = i2 == i3 ? edt.B(j2, j4, ebxVar.i) : edt.B(j2, j4 * i2, ebxVar.i * i3);
                } else {
                    jB = (long) (ebxVar.b * j2);
                }
                j2 = jB;
            }
            xwq xwqVar2 = this.ai;
            j = xwqVar2.b + j2;
            xwqVar2.c = j2 - jV;
        } else {
            xwq xwqVar3 = this.ai;
            j = xwqVar3.b + jV + xwqVar3.c;
        }
        long j5 = ((emr) this.am.a).f;
        long jA = j + this.f.a(j5);
        long j6 = this.ad;
        if (j5 > j6) {
            long jA2 = this.f.a(j5 - j6);
            this.ad = j5;
            this.o += jA2;
            if (this.ae == null) {
                this.ae = new Handler(Looper.myLooper());
            }
            this.ae.removeCallbacksAndMessages(null);
            this.ae.postDelayed(new caw(this, 20), 100L);
        }
        return jA;
    }

    public final int a(dze dzeVar) {
        J();
        if (!"audio/raw".equals(dzeVar.Y)) {
            return this.h.a(dzeVar, this.E) != null ? 2 : 0;
        }
        int i = dzeVar.as;
        if (edt.ak(i)) {
            return i != 2 ? 1 : 2;
        }
        edb.e("DefaultAudioSink", a.cf(i, "Invalid PCM encoding: "));
        return 0;
    }

    public final long b() {
        if (!S()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.g;
        emg emgVar = this.f;
        if (emgVar.c == 0) {
            return emgVar.a(audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int iU = fki.U(emgVar.g);
        a.ab(iU != -2147483647);
        return edt.C(bufferSizeInFrames, 1000000L, iU, RoundingMode.DOWN);
    }

    public final long c() {
        return this.f.c == 0 ? this.I / r0.b : this.J;
    }

    public final long d() {
        return this.f.c == 0 ? edt.s(this.K, r0.d) : this.L;
    }

    public final elr e(dze dzeVar) {
        int i;
        boolean zBooleanValue;
        if (this.ab) {
            return elr.a;
        }
        ghc ghcVar = this.al;
        dyo dyoVar = this.E;
        dzeVar.getClass();
        dyoVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = dzeVar.ar) == -1) {
            return elr.a;
        }
        Object obj = ghcVar.a;
        Object obj2 = ghcVar.b;
        if (obj2 != null) {
            zBooleanValue = ((Boolean) obj2).booleanValue();
        } else {
            if (obj != null) {
                String parameters = dvb.i((Context) obj).getParameters("offloadVariableRateSupported");
                ghcVar.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                ghcVar.b = false;
            }
            zBooleanValue = ((Boolean) ghcVar.b).booleanValue();
        }
        String str = dzeVar.Y;
        str.getClass();
        int iA = eae.a(str, dzeVar.U);
        if (iA == 0 || Build.VERSION.SDK_INT < edt.g(iA)) {
            return elr.a;
        }
        int iH = edt.h(dzeVar.aq);
        if (iH == 0) {
            return elr.a;
        }
        try {
            AudioFormat audioFormatI = edt.I(i, iH, iA);
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatI, (AudioAttributes) dyoVar.a().a)) {
                    return elr.a;
                }
                hmy hmyVar = new hmy();
                hmyVar.f();
                hmyVar.a = zBooleanValue;
                return hmyVar.e();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatI, (AudioAttributes) dyoVar.a().a);
            if (playbackOffloadSupport == 0) {
                return elr.a;
            }
            hmy hmyVar2 = new hmy();
            boolean z = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            hmyVar2.f();
            hmyVar2.c = z;
            hmyVar2.a = zBooleanValue;
            return hmyVar2.e();
        } catch (IllegalArgumentException unused) {
            return elr.a;
        }
    }

    public final void f() throws IllegalStateException {
        if (this.Z) {
            this.Z = false;
            h();
        }
    }

    public final void g() throws IllegalStateException {
        a.ab(this.W);
        if (this.Z) {
            return;
        }
        this.Z = true;
        h();
    }

    public final void h() throws IllegalStateException {
        if (S()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.ac = false;
            this.M = 0;
            this.ai = new xwq(this.j, 0L, 0L);
            this.P = 0L;
            this.ah = null;
            this.w.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.k = false;
            this.G = null;
            this.H = 0;
            this.r.g = 0L;
            Q();
            emb embVar = this.v;
            AudioTrack audioTrack = embVar.a;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.g.pause();
            }
            if (A(this.g)) {
                hnj hnjVar = this.aj;
                hnjVar.getClass();
                this.g.unregisterStreamEventCallback(fr$$ExternalSyntheticApiModelOutline0.m(hnjVar.a));
                ((Handler) hnjVar.b).removeCallbacksAndMessages(null);
            }
            elt eltVarB = this.f.b();
            emg emgVar = this.B;
            if (emgVar != null) {
                this.f = emgVar;
                this.B = null;
            }
            embVar.d();
            embVar.a = null;
            embVar.c = null;
            emi emiVar = this.D;
            if (emiVar != null) {
                AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = emiVar.c;
                audioRouting$OnRoutingChangedListener.getClass();
                emiVar.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
                emiVar.c = null;
                this.D = null;
            }
            AudioTrack audioTrack2 = this.g;
            elw elwVar = this.e;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (a) {
                if (b == null) {
                    String str = edt.a;
                    b = Executors.newSingleThreadScheduledExecutor(new eds(0));
                }
                c++;
                b.schedule(new ejr((Object) audioTrack2, (Object) elwVar, (Object) handler, (Object) eltVarB, 3, (byte[]) null), 20L, TimeUnit.MILLISECONDS);
            }
            this.g = null;
        }
        this.z.a();
        this.y.a();
        this.ad = 0L;
        this.o = 0L;
        Handler handler2 = this.ae;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void i() {
        this.N = true;
    }

    public final void j() throws IllegalStateException {
        this.l = false;
        if (S()) {
            emb embVar = this.v;
            embVar.d();
            if (embVar.p == -9223372036854775807L) {
                ema emaVar = embVar.c;
                emaVar.getClass();
                emaVar.c();
            } else {
                embVar.r = embVar.b();
                if (!A(this.g)) {
                    return;
                }
            }
            this.g.pause();
        }
    }

    public final void k() throws IllegalStateException {
        this.l = true;
        if (S()) {
            emb embVar = this.v;
            if (embVar.p != -9223372036854775807L) {
                ecn ecnVar = embVar.w;
                embVar.p = edt.y(SystemClock.elapsedRealtime());
            }
            embVar.h = embVar.c();
            ema emaVar = embVar.c;
            emaVar.getClass();
            emaVar.c();
            this.g.play();
        }
    }

    public final void l() throws IllegalStateException {
        if (!this.U && S() && R()) {
            K();
            this.U = true;
        }
    }

    public final void m() throws IllegalStateException {
        h();
        UnmodifiableIterator it = this.u.iterator();
        while (it.hasNext()) {
            ((ebu) it.next()).f();
        }
        this.s.f();
        this.t.f();
        ebr ebrVar = this.C;
        if (ebrVar != null) {
            int i = 0;
            while (true) {
                ImmutableList immutableList = ebrVar.a;
                if (i >= immutableList.size()) {
                    break;
                }
                ebu ebuVar = (ebu) immutableList.get(i);
                ebuVar.c();
                ebuVar.f();
                i++;
            }
            ebrVar.c = new ByteBuffer[0];
            ebs ebsVar = ebs.a;
            ebrVar.d = ebs.a;
            ebrVar.e = false;
        }
        this.l = false;
        this.ab = false;
    }

    public final void n(dyo dyoVar) throws IllegalStateException {
        if (this.E.equals(dyoVar)) {
            return;
        }
        this.E = dyoVar;
        if (this.Z) {
            return;
        }
        elq elqVar = this.i;
        if (elqVar != null) {
            elqVar.g = dyoVar;
            elqVar.a(elm.f(elqVar.a, dyoVar, elqVar.i));
        }
        h();
    }

    public final void o(int i) throws IllegalStateException {
        if (this.X != i) {
            this.X = i;
            this.W = i != 0;
            h();
            elw elwVar = this.e;
            if (elwVar != null) {
                elwVar.b(i);
            }
        }
    }

    public final void p(dyp dypVar) {
        if (this.Y.equals(dypVar)) {
            return;
        }
        int i = dypVar.a;
        float f = dypVar.b;
        if (this.g != null) {
            int i2 = this.Y.a;
        }
        this.Y = dypVar;
    }

    public final void q(ecn ecnVar) {
        this.v.w = ecnVar;
    }

    public final void r(int i) {
        a.ab(Build.VERSION.SDK_INT >= 29);
        this.x = i;
    }

    public final void s(eai eaiVar) {
        this.j = new eai(edt.a(eaiVar.d, 0.1f, 8.0f), edt.a(eaiVar.e, 0.1f, 8.0f));
        if (U()) {
            N();
        } else {
            M(eaiVar);
        }
    }

    public final void t(AudioDeviceInfo audioDeviceInfo) {
        this.ak = audioDeviceInfo != null ? new dxc(audioDeviceInfo, (byte[]) null) : null;
        elq elqVar = this.i;
        if (elqVar != null) {
            elqVar.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.g;
        if (audioTrack != null) {
            clw.Y(audioTrack, this.ak);
        }
    }

    public final void u(boolean z) {
        this.F = z;
        M(U() ? eai.a : this.j);
    }

    public final void v(float f) {
        if (this.Q != f) {
            this.Q = f;
            P();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.nio.ByteBuffer r37, long r38, int r40) throws java.lang.IllegalStateException, defpackage.ely, defpackage.elv {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emm.w(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean y() {
        if (!S()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.g.isOffloadedPlayback() && this.k) {
            return false;
        }
        emb embVar = this.v;
        if (d() > edt.u(embVar.a(), embVar.d)) {
            return true;
        }
        boolean z = embVar.e;
        return false;
    }

    public final boolean z() {
        if (S()) {
            return this.U && !y();
        }
        return true;
    }
}

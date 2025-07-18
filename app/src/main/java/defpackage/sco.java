package defpackage;

import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sco implements sch {
    public static final zdy a = zdy.h("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor");
    public static final Duration b;
    public static final Duration c;
    public static final Duration d;
    public static final scn e;
    public final ruo f;
    public final String g;
    public final AtomicBoolean h;
    public int i;
    public long j;
    public long k;
    public final mcw l;
    public final ahaz m;
    private final Executor n;
    private final wzw o;
    private final scn p;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        Duration durationOfMillis = Duration.ofMillis(500L);
        durationOfMillis.getClass();
        c = durationOfMillis;
        Duration durationOfMillis2 = Duration.ofMillis(10L);
        durationOfMillis2.getClass();
        d = durationOfMillis2;
        e = new scn() { // from class: scl
            @Override // defpackage.scg
            public final Object a() {
                zdy zdyVar = sco.a;
                rur rurVar = rur.a;
                return zxn.h(rxo.a(new ruq()));
            }
        };
    }

    public sco(ruo ruoVar, mcw mcwVar, Executor executor) {
        this.f = ruoVar;
        this.l = mcwVar;
        this.n = executor;
        String strA = szx.a(this);
        this.g = strA;
        ((zdv) a.b().q("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "<init>", 49, "AudioStartTimeProcessor.kt")).x("#audio# loading processor(%s)", strA);
        this.o = new wzw();
        this.h = new AtomicBoolean(false);
        this.m = new ahaz();
        this.p = new scn() { // from class: sck
            @Override // defpackage.scg
            public final Object a() {
                return ahkr.a(this.a.m);
            }
        };
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
    }

    @Override // defpackage.sch
    public final /* synthetic */ scg a() {
        return this.p;
    }

    @Override // defpackage.sch
    public final void b() {
        this.o.a(new Callable() { // from class: scm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sco scoVar = this.a;
                if (scoVar.h.getAndSet(true)) {
                    return agpu.a;
                }
                ((zdv) sco.a.b().o(zfi.a, "ALT.ProcStartTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "close$lambda$3", 93, "AudioStartTimeProcessor.kt")).x("#audio# close processor(%s)", scoVar.g);
                scoVar.f(6);
                return agpu.a;
            }
        }, this.n).getClass();
    }

    @Override // defpackage.sch
    public final int c(byte[] bArr, final int i) {
        if (i > bArr.length) {
            throw new IllegalStateException("Incorrect processing range");
        }
        if (this.h.get() || this.m.v()) {
            return 2;
        }
        mcw mcwVar = this.l;
        wzw wzwVar = this.o;
        final long jA = mcwVar.a();
        wzwVar.a(new Callable() { // from class: scj
            /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    r14 = this;
                    sco r0 = r14.a
                    java.util.concurrent.atomic.AtomicBoolean r1 = r0.h
                    boolean r1 = r1.get()
                    if (r1 != 0) goto Ld2
                    ahaz r1 = r0.m
                    boolean r1 = r1.v()
                    if (r1 == 0) goto L14
                    goto Ld2
                L14:
                    long r1 = r2
                    long r3 = r0.j
                    boolean r3 = r0.e(r3)
                    if (r3 == 0) goto L22
                    r0.j = r1
                    zer r3 = defpackage.zfi.a
                L22:
                    int r3 = r4
                    r4 = 2
                    if (r3 > 0) goto L28
                    goto L5b
                L28:
                    long r5 = r0.k
                    boolean r7 = r0.e(r5)
                    if (r7 == 0) goto L32
                    long r5 = r0.j
                L32:
                    long r5 = r1 - r5
                    ruo r7 = r0.f
                    long r7 = defpackage.sjx.b(r3, r7)
                    j$.time.Duration r9 = defpackage.sco.d
                    long r9 = r9.toNanos()
                    long r9 = r7 - r9
                    r11 = 2
                    long r7 = r7 / r11
                    int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                    if (r11 >= 0) goto L4a
                    r9 = r7
                L4a:
                    int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                    if (r5 < 0) goto L5b
                    long r5 = r0.k
                    boolean r5 = r0.e(r5)
                    r6 = 1
                    if (r6 == r5) goto L59
                    r5 = r4
                    goto Lc4
                L59:
                    r5 = 3
                    goto Lc4
                L5b:
                    int r5 = r0.i
                    int r5 = r5 + r3
                    ruo r6 = r0.f
                    long r5 = defpackage.sjx.b(r5, r6)
                    j$.time.Duration r7 = defpackage.sco.b
                    long r7 = r7.toNanos()
                    int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    java.lang.String r6 = "maybeEnoughProcessedForCompletion"
                    java.lang.String r7 = "com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor"
                    java.lang.String r8 = "ALT.ProcStartTime"
                    java.lang.String r9 = "AudioStartTimeProcessor.kt"
                    if (r5 < 0) goto L93
                    zdy r5 = defpackage.sco.a
                    zeo r5 = r5.d()
                    zer r10 = defpackage.zfi.a
                    zeo r5 = r5.o(r10, r8)
                    r8 = 147(0x93, float:2.06E-43)
                    zeo r5 = r5.q(r7, r6, r8, r9)
                    zdv r5 = (defpackage.zdv) r5
                    java.lang.String r6 = r0.g
                    java.lang.String r7 = "#audio# processor(%s) reached maximum received audio"
                    r5.x(r7, r6)
                    r5 = 4
                    goto Lc4
                L93:
                    mcw r5 = r0.l
                    long r10 = r5.a()
                    long r12 = r0.j
                    long r10 = r10 - r12
                    j$.time.Duration r5 = defpackage.sco.c
                    long r12 = r5.toNanos()
                    int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r5 < 0) goto Lc3
                    zdy r5 = defpackage.sco.a
                    zeo r5 = r5.d()
                    zer r10 = defpackage.zfi.a
                    zeo r5 = r5.o(r10, r8)
                    r8 = 153(0x99, float:2.14E-43)
                    zeo r5 = r5.q(r7, r6, r8, r9)
                    zdv r5 = (defpackage.zdv) r5
                    java.lang.String r6 = r0.g
                    java.lang.String r7 = "#audio# processor(%s) reached maximum computation time"
                    r5.x(r7, r6)
                    r5 = 5
                    goto Lc4
                Lc3:
                    r5 = 0
                Lc4:
                    if (r5 == 0) goto Lcf
                    if (r5 == r4) goto Lcb
                    r0.d(r1, r3)
                Lcb:
                    r0.f(r5)
                    goto Ld2
                Lcf:
                    r0.d(r1, r3)
                Ld2:
                    agpu r0 = defpackage.agpu.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.scj.call():java.lang.Object");
            }
        }, this.n).getClass();
        return 1;
    }

    public final void d(long j, int i) {
        if (i <= 0) {
            return;
        }
        this.k = j;
        this.i += i;
    }

    public final boolean e(long j) {
        return j == Long.MIN_VALUE;
    }

    public final void f(int i) {
        int i2;
        long j;
        rur rurVarA;
        ahaz ahazVar = this.m;
        if (ahazVar.v()) {
            return;
        }
        zdy zdyVar = a;
        zeo zeoVarB = zdyVar.b();
        zer zerVar = zfi.a;
        zdv zdvVar = (zdv) zeoVarB.o(zerVar, "ALT.ProcStartTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 184, "AudioStartTimeProcessor.kt");
        String str = this.g;
        zdvVar.F("#audio# processor(%s) is being completed(%s)", str, tai.a(i));
        long jA = !e(this.j) ? this.l.a() - this.j : 0L;
        if (e(this.k)) {
            ((zdv) zdyVar.d().o(zerVar, "ALT.ProcStartTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 193, "AudioStartTimeProcessor.kt")).x("#audio# processor(%s) mark audio start time empty", str);
            rur rurVar = rur.a;
            rurVarA = rxo.a(new ruq());
            j = jA;
            i2 = Integer.MIN_VALUE;
        } else {
            long jB = sjx.b(this.i, this.f);
            i2 = Integer.MIN_VALUE;
            long j2 = this.k - jB;
            j = jA;
            ((zdv) zdyVar.b().o(zerVar, "ALT.ProcStartTime").q("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 200, "AudioStartTimeProcessor.kt")).J("#audio# processor(%s) done, processed(%dns), spent(%dns), deviation(%dns)", str, Long.valueOf(jB), Long.valueOf(jA), Long.valueOf(j2 - this.j));
            rur rurVar2 = rur.a;
            ruq ruqVar = new ruq();
            if ((ruqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                ruqVar.y();
            }
            rur rurVar3 = (rur) ruqVar.b;
            rurVar3.b |= 1;
            rurVar3.c = j2;
            rurVarA = rxo.a(ruqVar);
        }
        ruq ruqVar2 = new ruq();
        ruqVar2.B(rurVarA);
        abxc abxcVar = taj.a;
        abxcVar.getClass();
        tag tagVar = tag.a;
        taf tafVar = new taf();
        if ((tafVar.b.memoizedSerializedSize & i2) == 0) {
            tafVar.y();
        }
        tag tagVar2 = (tag) tafVar.b;
        tagVar2.c = i - 1;
        tagVar2.b |= 1;
        if ((i2 & tafVar.b.memoizedSerializedSize) == 0) {
            tafVar.y();
        }
        tag tagVar3 = (tag) tafVar.b;
        tagVar3.b |= 2;
        tagVar3.d = j;
        abxd abxdVarV = tafVar.v();
        abxdVarV.getClass();
        ruqVar2.f(abxcVar, (tag) abxdVarV);
        ahazVar.N(rxo.a(ruqVar2));
    }
}

package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emb {
    private long A;
    private long B;
    private Method C;
    private long D;
    private int E;
    private int F;
    private long G;
    private long H;
    public AudioTrack a;
    public int b;
    public ema c;
    public int d;
    public boolean e;
    public long f;
    public float g;
    public long h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    boolean t;
    public boolean u;
    public long v;
    public ecn w;
    public final pku x;
    private final long[] y;
    private boolean z;

    public emb(pku pkuVar) {
        this.x = pkuVar;
        try {
            this.C = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.y = new long[10];
        this.H = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.w = ecn.a;
    }

    private final long e(long j) {
        long jMax = Math.max(0L, (this.F == 0 ? this.p != -9223372036854775807L ? edt.A(f(), this.d) : c() : edt.v(j + this.A, this.g)) - this.j);
        return this.p != -9223372036854775807L ? Math.min(edt.A(this.s, this.d), jMax) : jMax;
    }

    private final long f() {
        AudioTrack audioTrack = this.a;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.r;
        }
        return this.r + edt.u(edt.v(edt.y(SystemClock.elapsedRealtime()) - this.p, this.g), this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emb.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r10 = this;
            long r0 = r10.p
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7c
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.D
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L70
            android.media.AudioTrack r4 = r10.a
            defpackage.a.aq(r4)
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L26
            goto L6e
        L26:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            r8 = 29
            if (r4 > r8) goto L52
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L50
            long r6 = r10.m
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L4f
            r4 = 3
            if (r5 != r4) goto L4f
            long r4 = r10.q
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L6e
            r10.q = r0
            goto L6e
        L4f:
            r6 = r8
        L50:
            r10.q = r2
        L52:
            long r2 = r10.m
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L6c
            boolean r4 = r10.u
            if (r4 == 0) goto L65
            long r4 = r10.v
            long r4 = r4 + r2
            r10.v = r4
            r2 = 0
            r10.u = r2
            goto L6c
        L65:
            long r2 = r10.n
            r4 = 1
            long r2 = r2 + r4
            r10.n = r2
        L6c:
            r10.m = r6
        L6e:
            r10.D = r0
        L70:
            long r0 = r10.m
            long r2 = r10.v
            long r0 = r0 + r2
            long r2 = r10.n
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        L7c:
            long r0 = r10.f()
            long r2 = r10.s
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emb.b():long");
    }

    public final long c() {
        return edt.A(b(), this.d);
    }

    public final void d() {
        this.A = 0L;
        this.F = 0;
        this.E = 0;
        this.B = 0L;
        this.G = -9223372036854775807L;
        this.H = -9223372036854775807L;
        this.z = false;
    }
}

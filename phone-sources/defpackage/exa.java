package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exa extends eay {
    private static final Object e = new Object();
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Object o;
    private final dzy p;
    private final dzs q;

    static {
        dzl dzlVar = new dzl();
        dzlVar.b("SinglePeriodTimeline");
        dzlVar.a = Uri.EMPTY;
        dzlVar.a();
    }

    public exa(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, Object obj, dzy dzyVar, dzs dzsVar) {
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = obj;
        dzyVar.getClass();
        this.p = dzyVar;
        this.q = dzsVar;
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        return e.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.eay
    public final int b() {
        return 1;
    }

    @Override // defpackage.eay
    public final int c() {
        return 1;
    }

    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        eci.c(i, 1);
        eavVar.m(null, z ? e : null, this.h, -this.j);
        return eavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.eay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eax e(int r24, defpackage.eax r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            defpackage.eci.c(r2, r1)
            boolean r13 = r0.m
            long r1 = r0.k
            if (r13 == 0) goto L2c
            boolean r3 = r0.n
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r26
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            dzy r4 = r0.p
            java.lang.Object r5 = r0.o
            long r6 = r0.f
            long r8 = r0.g
            boolean r12 = r0.l
            dzs r14 = r0.q
            long r1 = r0.i
            long r10 = r0.j
            java.lang.Object r3 = defpackage.eax.a
            r19 = 0
            r20 = 0
            r21 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r1
            r2 = r25
            r2.e(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.e(int, eax, long):eax");
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        eci.c(i, 1);
        return e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public exa(long j, boolean z, boolean z2, dzy dzyVar) {
        dzy dzyVar2;
        dzs dzsVar;
        if (z2) {
            dzyVar2 = dzyVar;
            dzsVar = dzyVar2.d;
        } else {
            dzyVar2 = dzyVar;
            dzsVar = null;
        }
        this(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, dzyVar2, dzsVar);
    }
}

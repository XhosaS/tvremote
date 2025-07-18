package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emz extends eay {
    private final long e;
    private final long f;
    private final long g;
    private final int h;
    private final long i;
    private final long j;
    private final long k;
    private final enr l;
    private final dzy m;
    private final dzs n;

    public emz(long j, long j2, long j3, int i, long j4, long j5, long j6, enr enrVar, dzy dzyVar, dzs dzsVar) {
        a.ab(enrVar.d == (dzsVar != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = enrVar;
        this.m = dzyVar;
        this.n = dzsVar;
    }

    private static boolean r(enr enrVar) {
        return enrVar.d && enrVar.e != -9223372036854775807L && enrVar.b == -9223372036854775807L;
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < b()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int b() {
        return this.l.a();
    }

    @Override // defpackage.eay
    public final int c() {
        return 1;
    }

    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        eci.c(i, b());
        Object obj = z ? this.l.f(i).e : null;
        Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
        enr enrVar = this.l;
        eavVar.m(obj, numValueOf, enrVar.c(i), edt.y(enrVar.f(i).a - enrVar.f(0).a) - this.i);
        return eavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[PHI: r1
  0x002a: PHI (r1v2 long) = (r1v1 long), (r1v5 long) binds: [B:6:0x001a, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
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
            enr r5 = r0.l
            long r1 = r0.k
            boolean r3 = r(r5)
            r4 = -1
            if (r3 != 0) goto L16
        L13:
            r15 = r1
            r1 = r4
            goto L7d
        L16:
            r6 = 0
            int r3 = (r26 > r6 ? 1 : (r26 == r6 ? 0 : -1))
            if (r3 <= 0) goto L2a
            long r1 = r1 + r26
            long r8 = r0.j
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L2a
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L13
        L2a:
            long r8 = r0.i
            r3 = 0
            long r10 = r5.c(r3)
            long r8 = r8 + r1
            r12 = r3
        L33:
            int r13 = r5.a()
            int r13 = r13 + r4
            if (r12 >= r13) goto L47
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto L47
            int r12 = r12 + 1
            long r13 = r5.c(r12)
            long r8 = r8 - r10
            r10 = r13
            goto L33
        L47:
            gsf r12 = r5.f(r12)
            r13 = 2
            int r13 = r12.a(r13)
            if (r13 != r4) goto L53
            goto L13
        L53:
            java.lang.Object r12 = r12.b
            java.lang.Object r12 = r12.get(r13)
            enp r12 = (defpackage.enp) r12
            java.util.List r12 = r12.c
            java.lang.Object r3 = r12.get(r3)
            enz r3 = (defpackage.enz) r3
            eng r3 = r3.k()
            if (r3 == 0) goto L13
            long r12 = r3.f(r10)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 != 0) goto L72
            goto L13
        L72:
            long r6 = r3.g(r8, r10)
            long r6 = r3.h(r6)
            long r1 = r1 + r6
            long r1 = r1 - r8
            goto L13
        L7d:
            dzy r4 = r0.m
            long r6 = r0.e
            long r8 = r0.f
            long r10 = r0.g
            dzs r14 = r0.n
            long r2 = r0.j
            r17 = r2
            java.lang.Object r3 = defpackage.eax.a
            boolean r13 = r(r5)
            int r2 = r0.b()
            int r20 = r2 + (-1)
            long r1 = r0.i
            r12 = 1
            r19 = 0
            r21 = r1
            r2 = r25
            r2.e(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emz.e(int, eax, long):eax");
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        eci.c(i, b());
        return Integer.valueOf(this.h + i);
    }
}

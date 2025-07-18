package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adt implements adl {
    public bwv a;
    public boolean b;
    final /* synthetic */ mma c;
    private final int d;
    private final yjv e;
    private clv f;
    private boolean g;
    private boolean h;
    private Object i;
    private boolean j;
    private ads k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private final eux p;

    public adt(mma mmaVar, int i, long j, eux euxVar, yjv yjvVar) {
        this(mmaVar, i, euxVar, yjvVar);
        this.f = new clv(j);
    }

    private final void e() {
        bwv bwvVar = this.a;
        if (bwvVar != null) {
            bwvVar.b();
        }
        this.a = null;
        this.k = null;
    }

    private final void f() {
        long jP;
        long jA = ynq.a();
        long j = this.o;
        long j2 = ynp.a;
        yno ynoVar = yno.a;
        ynoVar.getClass();
        long jY = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (jA == j) {
                long j3 = ynm.a;
            } else {
                jY = ynm.q(ykn.y(j));
            }
        } else if ((((-1) + jA) | 1) == Long.MAX_VALUE) {
            jY = ykn.y(jA);
        } else {
            long j4 = jA - j;
            if (((j4 ^ jA) & (~(j4 ^ j))) < 0) {
                yno ynoVar2 = yno.c;
                if (ynoVar.compareTo(ynoVar2) < 0) {
                    long jA2 = ykn.A(1L, ynoVar2, ynoVar);
                    long j5 = (jA / jA2) - (j / jA2);
                    long j6 = (jA % jA2) - (j % jA2);
                    long j7 = ynm.a;
                    jP = ynm.o(ylh.p(j5, ynoVar2), ylh.p(j6, ynoVar));
                } else {
                    jP = ynm.q(ykn.y(j4));
                }
            } else {
                jP = ylh.p(j4, ynoVar);
            }
            jY = jP;
        }
        long jM = ynm.m(jY);
        long jL = ynm.u(jY) ? jM : jM > 9223372036854L ? Long.MAX_VALUE : jM < -9223372036854L ? Long.MIN_VALUE : ylh.l(jM);
        this.n = jL;
        long j8 = this.m - jL;
        this.m = j8;
        this.o = jA;
        cmq.h("compose:lazy:prefetch:available_time_nanos", j8);
    }

    private final boolean g() {
        return this.h;
    }

    private final boolean h(long j, long j2) {
        if (true == this.l) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6 A[Catch: all -> 0x01de, TryCatch #4 {all -> 0x01de, blocks: (B:73:0x015a, B:75:0x0162, B:77:0x016a, B:80:0x0173, B:82:0x017f, B:84:0x0195, B:83:0x0182, B:85:0x0197, B:86:0x019e, B:88:0x01a6, B:90:0x01b0, B:95:0x01b9, B:96:0x01bc, B:98:0x01c6, B:103:0x01d2), top: B:176:0x015a }] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r5v3, types: [acy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean i(defpackage.aca r19) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adt.i(aca):boolean");
    }

    @Override // defpackage.adl
    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        e();
    }

    @Override // defpackage.adl
    public final void b() {
        this.l = true;
    }

    public final boolean c(aca acaVar) {
        boolean zI;
        if (!this.c.a) {
            return false;
        }
        if (this.l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zI = i(acaVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zI = i(acaVar);
        }
        cmq.h("compose:lazy:prefetch:execute:item", -1L);
        return zI;
    }

    public final void d(int i) {
        bwv bwvVar = this.a;
        if (bwvVar != null) {
            bwvVar.e(i);
        }
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.d + ", constraints = " + this.f + ", isComposed = " + g() + ", isMeasured = " + this.g + ", isCanceled = " + this.b + " }";
    }

    public adt(mma mmaVar, int i, eux euxVar, yjv yjvVar) {
        this.c = mmaVar;
        this.d = i;
        this.p = euxVar;
        this.e = yjvVar;
        this.o = ynq.a();
    }
}

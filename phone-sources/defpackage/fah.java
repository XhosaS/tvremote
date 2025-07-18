package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fah implements ezm, efy {
    public static final ImmutableList a = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList b = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList c = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList d = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList e = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList f = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private final Context g;
    private final ImmutableMap h;
    private final fad i;
    private final fae j;
    private int k;
    private long l;
    private String m;

    public fah(Context context, Map map, fad fadVar, fae faeVar) {
        this.g = context == null ? null : context.getApplicationContext();
        this.h = ImmutableMap.copyOf(map);
        this.i = fadVar;
        this.j = faeVar;
        nxo nxoVarL = nxo.l(context);
        int iB = nxoVarL.b();
        this.k = iB;
        this.l = g(iB);
        nxoVarL.c(new fag(this, 0), clw.X());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long g(int r10) {
        /*
            r9 = this;
            com.google.common.collect.ImmutableMap r0 = r9.h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r4 = 0
            if (r1 != 0) goto L1f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object r10 = r0.get(r10)
            r1 = r10
            java.lang.Long r1 = (java.lang.Long) r1
            goto Lad
        L1f:
            long r5 = r1.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto Lad
            java.lang.String r0 = r9.m
            java.lang.String r0 = defpackage.sij.E(r0)
            int[] r0 = defpackage.a.ad(r0)
            r1 = 2
            if (r10 == r1) goto L9b
            r5 = 3
            if (r10 == r5) goto L8b
            r6 = 4
            if (r10 == r6) goto L7c
            r1 = 5
            if (r10 == r1) goto L6d
            r5 = 7
            if (r10 == r5) goto L9b
            r4 = 9
            if (r10 == r4) goto L5e
            r1 = 10
            if (r10 == r1) goto L4f
            r0 = r2
            goto La9
        L4f:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.e
            r0 = r0[r6]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L5e:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.f
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L6d:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.d
            r0 = r0[r5]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L7c:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.c
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L8b:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.b
            r1 = 1
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L9b:
            com.google.common.collect.ImmutableList r10 = defpackage.fah.a
            r0 = r0[r4]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
        La9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        Lad:
            if (r1 != 0) goto Lb3
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        Lb3:
            long r0 = r1.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fah.g(int):long");
    }

    private static boolean h(eey eeyVar, boolean z) {
        return z && !eeyVar.f(8);
    }

    @Override // defpackage.ezm
    public final synchronized long a() {
        long jA = this.j.a();
        if (jA != Long.MIN_VALUE) {
            return jA;
        }
        return this.l;
    }

    @Override // defpackage.ezm
    public final synchronized long b() {
        return this.i.a();
    }

    @Override // defpackage.ezm
    public final synchronized void d(Handler handler, ele eleVar) {
        eleVar.getClass();
        this.j.c(handler, eleVar);
    }

    @Override // defpackage.ezm
    public final synchronized void e(ele eleVar) {
        this.j.d(eleVar);
    }

    public final synchronized void f(int i) {
        if (this.k != i || this.m == null) {
            this.k = i;
            if (i != 1 && i != 0 && i != 8) {
                if (this.m == null) {
                    this.m = edt.V(this.g);
                }
                long jG = g(i);
                this.l = jG;
                this.j.b(jG);
                this.i.d();
            }
        }
    }

    @Override // defpackage.efy
    public final synchronized void k(eey eeyVar, boolean z, int i) {
        if (h(eeyVar, z)) {
            this.j.e(i);
        }
    }

    @Override // defpackage.efy
    public final synchronized void l(eey eeyVar, boolean z) {
        if (h(eeyVar, z)) {
            this.j.f();
        }
    }

    @Override // defpackage.efy
    public final synchronized void m(eey eeyVar, boolean z) {
        if (h(eeyVar, z)) {
            this.i.b(eeyVar);
        }
    }

    @Override // defpackage.efy
    public final synchronized void n(eey eeyVar, boolean z) {
        if (h(eeyVar, z)) {
            this.i.c(eeyVar);
            this.j.g();
        }
    }

    @Override // defpackage.ezm
    public final efy c() {
        return this;
    }
}

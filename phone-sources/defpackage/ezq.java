package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezq implements ezm, efy {
    public static final ImmutableList a = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList b = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList c = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList d = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList e = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList f = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static ezq g;
    private final Context h;
    private final ImmutableMap i;
    private final fac j;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;
    private String s;
    private final dhq t;

    public ezq(Context context, Map map) {
        this.h = context == null ? null : context.getApplicationContext();
        this.i = ImmutableMap.copyOf(map);
        this.t = new dhq((byte[]) null, (byte[]) null, (byte[]) null);
        this.j = new fac(2000);
        if (context == null) {
            this.r = 0;
            this.p = 1000000L;
            return;
        }
        nxo nxoVarL = nxo.l(context);
        int iB = nxoVarL.b();
        this.r = iB;
        this.p = h(iB);
        nxoVarL.c(new fag(this, 1), clw.X());
    }

    public static synchronized ezq f(Context context) {
        if (g == null) {
            Context applicationContext = context.getApplicationContext();
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
            g = new ezq(applicationContext, map);
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long h(int r10) {
        /*
            r9 = this;
            com.google.common.collect.ImmutableMap r0 = r9.i
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
            java.lang.String r0 = r9.s
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
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.e
            r0 = r0[r6]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L5e:
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.f
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L6d:
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.d
            r0 = r0[r5]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L7c:
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.c
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L8b:
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.b
            r1 = 1
            r0 = r0[r1]
            java.lang.Object r10 = r10.get(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            goto La9
        L9b:
            com.google.common.collect.ImmutableList r10 = defpackage.ezq.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezq.h(int):long");
    }

    private final void i(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.q) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.q = j2;
        this.t.y(i2, j3, j2);
    }

    private static boolean j(eey eeyVar, boolean z) {
        return z && !eeyVar.f(8);
    }

    @Override // defpackage.ezm
    public final synchronized long a() {
        return this.p;
    }

    @Override // defpackage.ezm
    public final /* synthetic */ long b() {
        return -9223372036854775807L;
    }

    @Override // defpackage.ezm
    public final void d(Handler handler, ele eleVar) {
        eleVar.getClass();
        this.t.z(handler, eleVar);
    }

    @Override // defpackage.ezm
    public final void e(ele eleVar) {
        this.t.A(eleVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:3:0x0001, B:10:0x000e, B:16:0x001a, B:19:0x0026, B:25:0x003c), top: B:40:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.r     // Catch: java.lang.Throwable -> L58
            if (r0 != r9) goto Le
            java.lang.String r0 = r8.s     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L55
            goto Le
        La:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L5b
        Le:
            r8.r = r9     // Catch: java.lang.Throwable -> L58
            r0 = 1
            if (r9 == r0) goto L55
            if (r9 == 0) goto L55
            r0 = 8
            if (r9 != r0) goto L1a
            goto L55
        L1a:
            java.lang.String r0 = r8.s     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L26
            android.content.Context r0 = r8.h     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = defpackage.edt.V(r0)     // Catch: java.lang.Throwable -> La
            r8.s = r0     // Catch: java.lang.Throwable -> La
        L26:
            long r0 = r8.h(r9)     // Catch: java.lang.Throwable -> L58
            r8.p = r0     // Catch: java.lang.Throwable -> L58
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L58
            int r9 = r8.k     // Catch: java.lang.Throwable -> L58
            if (r9 <= 0) goto L3a
            long r2 = r8.l     // Catch: java.lang.Throwable -> La
            long r2 = r0 - r2
            int r9 = (int) r2
            goto L3b
        L3a:
            r9 = 0
        L3b:
            r3 = r9
            long r4 = r8.m     // Catch: java.lang.Throwable -> L58
            long r6 = r8.p     // Catch: java.lang.Throwable -> L58
            r2 = r8
            r2.i(r3, r4, r6)     // Catch: java.lang.Throwable -> L5d
            r2.l = r0     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            r2.m = r0     // Catch: java.lang.Throwable -> L5d
            r2.o = r0     // Catch: java.lang.Throwable -> L5d
            r2.n = r0     // Catch: java.lang.Throwable -> L5d
            fac r9 = r2.j     // Catch: java.lang.Throwable -> L5d
            r9.c()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r8)
            return
        L55:
            r2 = r8
            monitor-exit(r8)
            return
        L58:
            r0 = move-exception
            r2 = r8
        L5a:
            r9 = r0
        L5b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5d
            throw r9
        L5d:
            r0 = move-exception
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezq.g(int):void");
    }

    @Override // defpackage.efy
    public final synchronized void k(eey eeyVar, boolean z, int i) {
        if (j(eeyVar, z)) {
            this.m += i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // defpackage.efy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void l(defpackage.eey r11, boolean r12) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = j(r11, r12)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.k     // Catch: java.lang.Throwable -> L73
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            defpackage.a.ab(r11)     // Catch: java.lang.Throwable -> L73
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L73
            long r0 = r10.l     // Catch: java.lang.Throwable -> L73
            long r0 = r11 - r0
            long r2 = r10.n     // Catch: java.lang.Throwable -> L73
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L73
            long r2 = r2 + r0
            r10.n = r2     // Catch: java.lang.Throwable -> L73
            long r0 = r10.o     // Catch: java.lang.Throwable -> L73
            long r2 = r10.m     // Catch: java.lang.Throwable -> L73
            long r0 = r0 + r2
            r10.o = r0     // Catch: java.lang.Throwable -> L73
            if (r5 <= 0) goto L6a
            float r0 = (float) r2     // Catch: java.lang.Throwable -> L73
            fac r1 = r10.j     // Catch: java.lang.Throwable -> L73
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L73
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L73
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L73
            r3 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r3
            float r3 = (float) r5     // Catch: java.lang.Throwable -> L73
            float r0 = r0 / r3
            r1.b(r2, r0)     // Catch: java.lang.Throwable -> L73
            long r2 = r10.n     // Catch: java.lang.Throwable -> L73
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L52
            long r2 = r10.o     // Catch: java.lang.Throwable -> L4e
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L5b
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L76
        L52:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L73
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L73
            r10.p = r0     // Catch: java.lang.Throwable -> L73
        L5b:
            long r6 = r10.m     // Catch: java.lang.Throwable -> L73
            long r8 = r10.p     // Catch: java.lang.Throwable -> L73
            r4 = r10
            r4.i(r5, r6, r8)     // Catch: java.lang.Throwable -> L78
            r4.l = r11     // Catch: java.lang.Throwable -> L78
            r11 = 0
            r4.m = r11     // Catch: java.lang.Throwable -> L78
            goto L6b
        L6a:
            r4 = r10
        L6b:
            int r11 = r4.k     // Catch: java.lang.Throwable -> L78
            int r11 = r11 + (-1)
            r4.k = r11     // Catch: java.lang.Throwable -> L78
            monitor-exit(r10)
            return
        L73:
            r0 = move-exception
            r4 = r10
        L75:
            r11 = r0
        L76:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r11
        L78:
            r0 = move-exception
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezq.l(eey, boolean):void");
    }

    @Override // defpackage.efy
    public final synchronized void n(eey eeyVar, boolean z) {
        if (j(eeyVar, z)) {
            if (this.k == 0) {
                this.l = SystemClock.elapsedRealtime();
            }
            this.k++;
        }
    }

    @Override // defpackage.ezm
    public final efy c() {
        return this;
    }

    @Override // defpackage.efy
    public final void m(eey eeyVar, boolean z) {
    }
}

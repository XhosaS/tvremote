package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dot implements don, dpe, dos {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private RuntimeException A;
    private int B;
    private final String b;
    private final dqw c;
    private final Object d;
    private final dop e;
    private final Context f;
    private final cyk g;
    private final Object h;
    private final Class i;
    private final dok j;
    private final int k;
    private final int l;
    private final cyn m;
    private final dpf n;
    private final List o;
    private final dpn p;
    private final Executor q;
    private ddp r;
    private dcx s;
    private long t;
    private volatile dcy u;
    private Drawable v;
    private Drawable w;
    private int x;
    private int y;
    private boolean z;

    public dot(Context context, cyk cykVar, Object obj, Object obj2, Class cls, dok dokVar, int i, int i2, cyn cynVar, dpf dpfVar, List list, dop dopVar, dcy dcyVar, dpn dpnVar, Executor executor) {
        this.b = a ? String.valueOf(super.hashCode()) : null;
        this.c = new dqv();
        this.d = obj;
        this.f = context;
        this.g = cykVar;
        this.h = obj2;
        this.i = cls;
        this.j = dokVar;
        this.k = i;
        this.l = i2;
        this.m = cynVar;
        this.n = dpfVar;
        this.o = list;
        this.e = dopVar;
        this.u = dcyVar;
        this.p = dpnVar;
        this.q = executor;
        this.B = 1;
        if (this.A == null && cykVar.f.a(cyi.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        int i;
        if (this.w == null) {
            dok dokVar = this.j;
            Drawable drawable = dokVar.h;
            this.w = drawable;
            if (drawable == null && (i = dokVar.i) > 0) {
                this.w = o(i);
            }
        }
        return this.w;
    }

    private final Drawable o(int i) {
        Resources.Theme theme = this.j.s;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        Context context = this.f;
        return dlo.a(context, context, i, theme);
    }

    private final void p() {
        if (this.z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void q(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    private final boolean r() {
        dop dopVar = this.e;
        return dopVar == null || dopVar.h(this);
    }

    private final boolean s() {
        dop dopVar = this.e;
        return dopVar == null || !dopVar.a().j();
    }

    @Override // defpackage.dos
    public final Object a() {
        this.c.a();
        return this.d;
    }

    @Override // defpackage.don
    public final void b() {
        synchronized (this.d) {
            p();
            this.c.a();
            int i = dqf.a;
            this.t = SystemClock.elapsedRealtimeNanos();
            if (this.h == null) {
                int i2 = this.k;
                int i3 = this.l;
                if (dqm.k(i2, i3)) {
                    this.x = i2;
                    this.y = i3;
                }
                g(new ddj("Received null model", Collections.EMPTY_LIST));
                return;
            }
            int i4 = this.B;
            if (i4 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i4 == 4) {
                d(this.r, 5);
                return;
            }
            List<doq> list = this.o;
            if (list != null) {
                for (doq doqVar : list) {
                    if (doqVar instanceof dom) {
                        throw null;
                    }
                }
            }
            this.B = 3;
            int i5 = this.k;
            int i6 = this.l;
            if (dqm.k(i5, i6)) {
                e(i5, i6);
            } else {
                this.n.g(this);
            }
            int i7 = this.B;
            if ((i7 == 2 || i7 == 3) && r()) {
                this.n.e(i());
            }
            if (a) {
                q("finished run method in " + dqf.a(this.t));
            }
        }
    }

    @Override // defpackage.don
    public final void c() {
        synchronized (this.d) {
            p();
            dqw dqwVar = this.c;
            dqwVar.a();
            if (this.B == 6) {
                return;
            }
            p();
            dqwVar.a();
            this.n.h(this);
            dcx dcxVar = this.s;
            ddp ddpVar = null;
            if (dcxVar != null) {
                synchronized (dcxVar.c) {
                    dcxVar.a.g(dcxVar.b);
                }
                this.s = null;
            }
            ddp ddpVar2 = this.r;
            if (ddpVar2 != null) {
                this.r = null;
                ddpVar = ddpVar2;
            }
            dop dopVar = this.e;
            if (dopVar == null || dopVar.g(this)) {
                this.n.c(i());
            }
            this.B = 6;
            if (ddpVar != null) {
                ((ddh) ddpVar).f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd A[Catch: all -> 0x010c, TRY_LEAVE, TryCatch #4 {all -> 0x010c, blocks: (B:31:0x00d5, B:33:0x00d9, B:34:0x00de, B:36:0x00e4, B:38:0x00f3, B:40:0x00fd), top: B:82:0x00d5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: all -> 0x017e, TryCatch #5 {all -> 0x017e, blocks: (B:21:0x005c, B:22:0x0060, B:65:0x0179, B:50:0x0114, B:52:0x0120, B:54:0x0127, B:58:0x013a, B:59:0x016e), top: B:84:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    @Override // defpackage.dos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.ddp r17, int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dot.d(ddp, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: all -> 0x01f1, TryCatch #0 {all -> 0x01f1, blocks: (B:46:0x0112, B:48:0x011e, B:50:0x0123, B:51:0x0128, B:60:0x01c0, B:52:0x012f, B:56:0x01ac, B:58:0x01b4, B:59:0x01bb, B:75:0x01f2, B:64:0x01c6, B:26:0x00be, B:28:0x00c6, B:31:0x00cd, B:33:0x00db, B:41:0x0101, B:44:0x010b, B:36:0x00eb, B:38:0x00f1, B:39:0x00f7), top: B:83:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6 A[Catch: all -> 0x01f1, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x01f1, blocks: (B:46:0x0112, B:48:0x011e, B:50:0x0123, B:51:0x0128, B:60:0x01c0, B:52:0x012f, B:56:0x01ac, B:58:0x01b4, B:59:0x01bb, B:75:0x01f2, B:64:0x01c6, B:26:0x00be, B:28:0x00c6, B:31:0x00cd, B:33:0x00db, B:41:0x0101, B:44:0x010b, B:36:0x00eb, B:38:0x00f1, B:39:0x00f7), top: B:83:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3 A[Catch: all -> 0x01f9, TryCatch #3 {all -> 0x01f9, blocks: (B:20:0x00a1, B:21:0x00b1, B:67:0x01cc, B:69:0x01d3, B:71:0x01d8, B:72:0x01ef, B:76:0x01f3, B:66:0x01c8, B:79:0x01f7), top: B:87:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8 A[Catch: all -> 0x01f9, TryCatch #3 {all -> 0x01f9, blocks: (B:20:0x00a1, B:21:0x00b1, B:67:0x01cc, B:69:0x01d3, B:71:0x01d8, B:72:0x01ef, B:76:0x01f3, B:66:0x01c8, B:79:0x01f7), top: B:87:0x0010 }] */
    @Override // defpackage.dpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dot.e(int, int):void");
    }

    @Override // defpackage.don
    public final void f() {
        synchronized (this.d) {
            if (n()) {
                c();
            }
        }
    }

    public final void g(ddj ddjVar) {
        int i;
        this.c.a();
        synchronized (this.d) {
            int i2 = this.g.g;
            Log.w("Glide", "Load failed for [" + String.valueOf(this.h) + "] with dimensions [" + this.x + "x" + this.y + "]", ddjVar);
            List listA = ddjVar.a();
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                Log.i("Glide", a.m(size, i4, "Root cause (", " of ", ")"), (Throwable) listA.get(i3));
                i3 = i4;
            }
            this.s = null;
            this.B = 5;
            dop dopVar = this.e;
            if (dopVar != null) {
                dopVar.d(this);
            }
            this.z = true;
            try {
                List<doq> list = this.o;
                if (list != null) {
                    for (doq doqVar : list) {
                        dpf dpfVar = this.n;
                        s();
                        doqVar.b(ddjVar, dpfVar);
                    }
                }
                if (r()) {
                    if (this.v == null) {
                        dok dokVar = this.j;
                        Drawable drawable = dokVar.f;
                        this.v = drawable;
                        if (drawable == null && (i = dokVar.g) > 0) {
                            this.v = o(i);
                        }
                    }
                    Drawable drawableI = this.v;
                    if (drawableI == null) {
                        drawableI = i();
                    }
                    this.n.a(drawableI);
                }
            } finally {
                this.z = false;
            }
        }
    }

    @Override // defpackage.don
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.don
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // defpackage.don
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.don r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.dot
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            int r4 = r1.k     // Catch: java.lang.Throwable -> L7b
            int r5 = r1.l     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r1.h     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r7 = r1.i     // Catch: java.lang.Throwable -> L7b
            dok r8 = r1.j     // Catch: java.lang.Throwable -> L7b
            cyn r9 = r1.m     // Catch: java.lang.Throwable -> L7b
            java.util.List r10 = r1.o     // Catch: java.lang.Throwable -> L7b
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L7b
            goto L23
        L22:
            r10 = r3
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            dot r0 = (defpackage.dot) r0
            java.lang.Object r11 = r0.d
            monitor-enter(r11)
            int r2 = r0.k     // Catch: java.lang.Throwable -> L78
            int r12 = r0.l     // Catch: java.lang.Throwable -> L78
            java.lang.Object r13 = r0.h     // Catch: java.lang.Throwable -> L78
            java.lang.Class r14 = r0.i     // Catch: java.lang.Throwable -> L78
            dok r15 = r0.j     // Catch: java.lang.Throwable -> L78
            r16 = r3
            cyn r3 = r0.m     // Catch: java.lang.Throwable -> L78
            java.util.List r0 = r0.o     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L78
            goto L42
        L40:
            r0 = r16
        L42:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            if (r4 != r2) goto L77
            if (r5 != r12) goto L77
            char[] r2 = defpackage.dqm.a
            if (r6 != 0) goto L4e
            if (r13 != 0) goto L77
            goto L5f
        L4e:
            boolean r2 = r6 instanceof defpackage.dgz
            if (r2 == 0) goto L59
            dgz r6 = (defpackage.dgz) r6
            boolean r2 = r6.a()
            goto L5d
        L59:
            boolean r2 = r6.equals(r13)
        L5d:
            if (r2 == 0) goto L77
        L5f:
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L77
            if (r8 != 0) goto L6a
            if (r15 != 0) goto L77
            goto L71
        L6a:
            boolean r2 = r8.F(r15)
            if (r2 != 0) goto L71
            goto L77
        L71:
            if (r9 != r3) goto L77
            if (r10 != r0) goto L77
            r0 = 1
            return r0
        L77:
            return r16
        L78:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            throw r0
        L7b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dot.m(don):boolean");
    }

    @Override // defpackage.don
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.B;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.d) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}

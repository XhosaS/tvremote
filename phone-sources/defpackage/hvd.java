package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvd implements hux {
    private final Object a;
    private final hvb b;
    private final huz c;
    private final Context d;
    private final hjv e;
    private final Object f;
    private final Class g;
    private final huu h;
    private final int i;
    private final int j;
    private final hjw k;
    private final hvm l;
    private final List m;
    private final hvw n;
    private final Executor o;
    private hnv p;
    private hnj q;
    private long r;
    private Drawable s;
    private int t;
    private int u;
    private boolean v;
    private RuntimeException w;
    private volatile moz z;
    private final mfm y = new mfm();
    private int x = 1;

    public hvd(Context context, hjv hjvVar, Object obj, Object obj2, Class cls, huu huuVar, int i, int i2, hjw hjwVar, hvm hvmVar, hvb hvbVar, List list, huz huzVar, moz mozVar, hvw hvwVar, Executor executor) {
        this.a = obj;
        this.d = context;
        this.e = hjvVar;
        this.f = obj2;
        this.g = cls;
        this.h = huuVar;
        this.i = i;
        this.j = i2;
        this.k = hjwVar;
        this.l = hvmVar;
        this.b = hvbVar;
        this.m = list;
        this.c = huzVar;
        this.z = mozVar;
        this.n = hvwVar;
        this.o = executor;
        if (this.w == null && hjvVar.f.a(hjt.class)) {
            this.w = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        if (this.s == null) {
            this.s = null;
            huu huuVar = this.h;
            int i = huuVar.d;
            if (i > 0) {
                Resources.Theme theme = huuVar.n;
                if (theme == null) {
                    theme = this.d.getTheme();
                }
                Context context = this.d;
                this.s = hta.a(context, context, i, theme);
            }
        }
        return this.s;
    }

    private final void o() {
        if (this.v) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final boolean p() {
        huz huzVar = this.c;
        return huzVar == null || huzVar.h(this);
    }

    private final void q() {
        huz huzVar = this.c;
        if (huzVar != null) {
            huzVar.a().j();
        }
    }

    private final void r(hnr hnrVar) {
        this.y.c();
        synchronized (this.a) {
            int i = this.e.d;
            if (i <= 5) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.f) + "] with dimensions [" + this.t + "x" + this.u + "]", hnrVar);
                if (i <= 4) {
                    List listA = hnrVar.a();
                    int size = listA.size();
                    for (int i2 = 0; i2 < size; i2++) {
                    }
                }
            }
            this.q = null;
            this.x = 5;
            huz huzVar = this.c;
            if (huzVar != null) {
                huzVar.d(this);
            }
            this.v = true;
            try {
                List<hvb> list = this.m;
                if (list != null) {
                    for (hvb hvbVar : list) {
                        hvm hvmVar = this.l;
                        q();
                        hvbVar.i(hnrVar, hvmVar);
                    }
                }
                hvb hvbVar2 = this.b;
                if (hvbVar2 != null) {
                    hvm hvmVar2 = this.l;
                    q();
                    hvbVar2.i(hnrVar, hvmVar2);
                }
                if (p()) {
                    this.l.d(i());
                }
            } finally {
                this.v = false;
            }
        }
    }

    public final Object a() {
        this.y.c();
        return this.a;
    }

    @Override // defpackage.hux
    public final void b() {
        synchronized (this.a) {
            o();
            this.y.c();
            double d = hwk.a;
            this.r = SystemClock.elapsedRealtimeNanos();
            if (this.f == null) {
                int i = this.i;
                int i2 = this.j;
                if (hwp.l(i, i2)) {
                    this.t = i;
                    this.u = i2;
                }
                r(new hnr("Received null model"));
                return;
            }
            int i3 = this.x;
            if (i3 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i3 == 4) {
                g(this.p, 5);
                return;
            }
            List<hvb> list = this.m;
            if (list != null) {
                for (hvb hvbVar : list) {
                    if (hvbVar instanceof huw) {
                        throw null;
                    }
                }
            }
            this.x = 3;
            int i4 = this.i;
            int i5 = this.j;
            if (hwp.l(i4, i5)) {
                e(i4, i5);
            } else {
                this.l.g(this);
            }
            int i6 = this.x;
            if ((i6 == 2 || i6 == 3) && p()) {
                this.l.e(i());
            }
        }
    }

    @Override // defpackage.hux
    public final void c() {
        synchronized (this.a) {
            o();
            mfm mfmVar = this.y;
            mfmVar.c();
            if (this.x == 6) {
                return;
            }
            o();
            mfmVar.c();
            this.l.h(this);
            hnj hnjVar = this.q;
            hnv hnvVar = null;
            if (hnjVar != null) {
                synchronized (hnjVar.c) {
                    ((hnn) hnjVar.a).h((hvd) hnjVar.b);
                }
                this.q = null;
            }
            hnv hnvVar2 = this.p;
            if (hnvVar2 != null) {
                this.p = null;
                hnvVar = hnvVar2;
            }
            huz huzVar = this.c;
            if (huzVar == null || huzVar.g(this)) {
                this.l.a(i());
            }
            this.x = 6;
            if (hnvVar != null) {
                ((hnp) hnvVar).f();
            }
        }
    }

    public final void d(hnr hnrVar) {
        r(hnrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:31:0x00b2, B:33:0x00c0, B:39:0x0162, B:34:0x00ca, B:38:0x0157, B:52:0x017b, B:43:0x0168, B:14:0x0068, B:16:0x0076, B:18:0x007b, B:26:0x009f, B:21:0x0089, B:23:0x008f, B:24:0x0094), top: B:59:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168 A[Catch: all -> 0x017a, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x017a, blocks: (B:31:0x00b2, B:33:0x00c0, B:39:0x0162, B:34:0x00ca, B:38:0x0157, B:52:0x017b, B:43:0x0168, B:14:0x0068, B:16:0x0076, B:18:0x007b, B:26:0x009f, B:21:0x0089, B:23:0x008f, B:24:0x0094), top: B:59:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175 A[Catch: all -> 0x017d, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0011, B:9:0x005d, B:46:0x016e, B:48:0x0175, B:49:0x0178, B:53:0x017c, B:45:0x016a), top: B:60:0x000a }] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5, types: [how, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [cuj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvd.e(int, int):void");
    }

    @Override // defpackage.hux
    public final void f() {
        synchronized (this.a) {
            if (n()) {
                c();
            }
        }
    }

    public final void g(hnv hnvVar, int i) throws Throwable {
        Throwable th;
        boolean zA;
        this.y.c();
        hnv hnvVar2 = null;
        try {
            try {
                synchronized (this.a) {
                    try {
                        this.q = null;
                        if (hnvVar == null) {
                            d(new hnr("Expected to receive a Resource<R> with an object of " + this.g.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object objC = hnvVar.c();
                        if (objC == null || !this.g.isAssignableFrom(objC.getClass())) {
                            this.p = null;
                            d(new hnr("Expected to receive an object of " + this.g.toString() + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + "{" + String.valueOf(objC) + "} inside Resource{" + hnvVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            huz huzVar = this.c;
                            if (huzVar == null || huzVar.i(this)) {
                                q();
                                this.x = 4;
                                this.p = hnvVar;
                                if (this.e.d <= 3) {
                                    objC.getClass().getSimpleName();
                                    hjt.a(i);
                                    String.valueOf(this.f);
                                    double d = hwk.a;
                                    SystemClock.elapsedRealtimeNanos();
                                    double d2 = hwk.a;
                                }
                                if (huzVar != null) {
                                    huzVar.e(this);
                                }
                                this.v = true;
                                try {
                                    List<hvb> list = this.m;
                                    if (list != null) {
                                        zA = false;
                                        for (hvb hvbVar : list) {
                                            hvbVar.j(objC, this.f, i);
                                            if (hvbVar instanceof huw) {
                                                zA |= ((huw) hvbVar).a();
                                            }
                                        }
                                    } else {
                                        zA = false;
                                    }
                                    hvb hvbVar2 = this.b;
                                    if (hvbVar2 != null) {
                                        hvbVar2.j(objC, this.f, i);
                                    }
                                    if (!zA) {
                                        this.l.b(objC, this.n.a(i));
                                    }
                                    return;
                                } finally {
                                    this.v = false;
                                }
                            }
                            this.p = null;
                            this.x = 4;
                        }
                        ((hnp) hnvVar).f();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        hnvVar = null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th;
            } catch (Throwable th4) {
                th = th4;
                hnvVar2 = hnvVar;
                if (hnvVar2 == null) {
                    throw th;
                }
                ((hnp) hnvVar2).f();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.hux
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 4;
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 6;
        }
        return z;
    }

    @Override // defpackage.hux
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.x == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // defpackage.hux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.hux r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.hvd
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            int r4 = r1.i     // Catch: java.lang.Throwable -> L7b
            int r5 = r1.j     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r1.f     // Catch: java.lang.Throwable -> L7b
            java.lang.Class r7 = r1.g     // Catch: java.lang.Throwable -> L7b
            huu r8 = r1.h     // Catch: java.lang.Throwable -> L7b
            hjw r9 = r1.k     // Catch: java.lang.Throwable -> L7b
            java.util.List r10 = r1.m     // Catch: java.lang.Throwable -> L7b
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L7b
            goto L23
        L22:
            r10 = r3
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            hvd r0 = (defpackage.hvd) r0
            java.lang.Object r11 = r0.a
            monitor-enter(r11)
            int r2 = r0.i     // Catch: java.lang.Throwable -> L78
            int r12 = r0.j     // Catch: java.lang.Throwable -> L78
            java.lang.Object r13 = r0.f     // Catch: java.lang.Throwable -> L78
            java.lang.Class r14 = r0.g     // Catch: java.lang.Throwable -> L78
            huu r15 = r0.h     // Catch: java.lang.Throwable -> L78
            r16 = r3
            hjw r3 = r0.k     // Catch: java.lang.Throwable -> L78
            java.util.List r0 = r0.m     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L78
            goto L42
        L40:
            r0 = r16
        L42:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            if (r4 != r2) goto L77
            if (r5 != r12) goto L77
            char[] r2 = defpackage.hwp.a
            if (r6 != 0) goto L4e
            if (r13 != 0) goto L77
            goto L5f
        L4e:
            boolean r2 = r6 instanceof defpackage.hqc
            if (r2 == 0) goto L59
            hqc r6 = (defpackage.hqc) r6
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
            boolean r2 = r8.D(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvd.m(hux):boolean");
    }

    @Override // defpackage.hux
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            int i = this.x;
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
        synchronized (this.a) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}

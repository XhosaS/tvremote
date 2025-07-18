package com.facebook.litho;

import android.graphics.Rect;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import defpackage.a;
import defpackage.ahj;
import defpackage.bxb;
import defpackage.drb;
import defpackage.drc;
import defpackage.drq;
import defpackage.dru;
import defpackage.dsh;
import defpackage.dsi;
import defpackage.dsj;
import defpackage.dsl;
import defpackage.dsm;
import defpackage.dsn;
import defpackage.dso;
import defpackage.dsq;
import defpackage.dsr;
import defpackage.dtp;
import defpackage.dtw;
import defpackage.dtz;
import defpackage.dur;
import defpackage.dus;
import defpackage.dut;
import defpackage.dvd;
import defpackage.dvl;
import defpackage.dvm;
import defpackage.dvn;
import defpackage.dvz;
import defpackage.dwm;
import defpackage.dxj;
import defpackage.dxo;
import defpackage.dxr;
import defpackage.dxs;
import defpackage.dxt;
import defpackage.dxw;
import defpackage.dxy;
import defpackage.dyd;
import defpackage.dym;
import defpackage.dyr;
import defpackage.dzh;
import defpackage.dzo;
import defpackage.dzq;
import defpackage.dzr;
import defpackage.ebc;
import defpackage.eev;
import defpackage.eig;
import defpackage.emj;
import defpackage.emk;
import defpackage.emv;
import defpackage.emw;
import defpackage.ohv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ComponentTree implements dvl {
    private static volatile Looper O = null;
    public static final String a = "ComponentTree";
    public int A;
    public dvd B;
    public dvd C;
    public dxy D;
    public final int E;
    public final dtp F;
    public final dtw G;
    public final dtz H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public volatile eig L;
    public final ohv M;
    private String P;
    private volatile drc Q;
    private Deque R;
    private int S;
    private final dut T;
    private final boolean U;
    private emk V;
    private final Runnable W;
    private final Object X;
    private dsj Y;
    private final Object Z;
    private final List aa;
    private int ab;
    private int ac;
    private int ad;
    private dzh ae;
    private int af;
    private final dzr ag;
    public dvn c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public final dxj g;
    public boolean h = false;
    public List i;
    public final Object j;
    public dso k;
    public final dru l;
    public boolean m;
    public boolean n;
    public final boolean o;
    public final boolean p;
    public boolean q;
    public final boolean r;
    public dvz s;
    public emk t;
    public volatile boolean u;
    public volatile boolean v;
    public dym w;
    public dym x;
    public drq y;
    public int z;
    private static final AtomicInteger N = new AtomicInteger(0);
    public static final ThreadLocal b = new ThreadLocal();

    public ComponentTree(dsi dsiVar) {
        boolean z;
        new AtomicReference();
        this.j = new Object();
        this.V = new emj(Looper.getMainLooper());
        this.W = new dsh(this);
        this.X = new Object();
        this.Z = new Object();
        this.aa = new ArrayList();
        this.ab = -1;
        this.ad = -1;
        this.z = -1;
        this.A = -1;
        this.af = -1;
        this.G = new dtw();
        this.H = new dtz();
        this.ag = new dzr();
        dru druVar = new dru(dsiVar.a, null, null);
        druVar.h = this;
        druVar.c = null;
        this.l = druVar;
        this.y = dsiVar.c;
        dvn dvnVar = dsiVar.n;
        if (dvnVar != null) {
            v(dvnVar);
        }
        if (dsiVar.d) {
            boolean z2 = ebc.a;
            z = true;
        } else {
            z = false;
        }
        this.o = z;
        this.p = dsiVar.b;
        boolean z3 = ebc.a;
        this.U = dsiVar.e;
        this.t = dsiVar.f;
        this.r = true;
        this.u = dsiVar.h;
        this.v = false;
        i(dsiVar.i);
        this.J = dsiVar.l;
        this.I = dsiVar.j;
        this.F = dsiVar.k;
        this.e = dsiVar.o;
        dxy dxyVar = dsiVar.g;
        this.D = dxyVar == null ? new dxy(null) : dxyVar;
        this.E = N.getAndIncrement();
        this.g = new dxj();
        this.T = new dut(this);
        emk emkVar = this.V;
        emv emvVar = emw.a;
        this.V = emkVar;
        emk emkVar2 = this.t;
        this.t = new dxr(emkVar2 == null ? new emj(a()) : emkVar2);
        this.M = dsiVar.p;
        this.K = dsiVar.m;
        this.d = drb.a(druVar.a);
    }

    private final synchronized void E() {
        Map map;
        dvd dvdVar = this.C;
        if (dvdVar != null) {
            dzr dzrVar = this.ag;
            dzq dzqVar = dvdVar.H;
            if (dzqVar != null && (map = dzqVar.a) != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    dzo dzoVar = (dzo) dzqVar.a.get((String) it.next());
                    if (dzoVar == null) {
                        throw null;
                    }
                    List list = dzoVar.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        dxo dxoVar = (dxo) list.get(i);
                        dru druVar = dxoVar.b;
                        drq drqVar = dxoVar.a;
                        if (dzrVar.a(druVar.i())) {
                            try {
                                drqVar.aj();
                            } catch (Exception e) {
                                dsq.d(druVar, e);
                            }
                        }
                    }
                }
            }
        }
        this.ag.a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0091 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:13:0x0028, B:16:0x0030, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0043, B:25:0x0051, B:27:0x005a, B:29:0x0060, B:31:0x0064, B:34:0x0069, B:35:0x006a, B:37:0x006e, B:39:0x0074, B:41:0x0078, B:43:0x007c, B:45:0x0080, B:47:0x0084, B:50:0x008d, B:52:0x0091, B:54:0x0095, B:57:0x00a5, B:60:0x00b5, B:61:0x00b6, B:63:0x00bf, B:64:0x00c2), top: B:85:0x0028, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5 A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:13:0x0028, B:16:0x0030, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0043, B:25:0x0051, B:27:0x005a, B:29:0x0060, B:31:0x0064, B:34:0x0069, B:35:0x006a, B:37:0x006e, B:39:0x0074, B:41:0x0078, B:43:0x007c, B:45:0x0080, B:47:0x0084, B:50:0x008d, B:52:0x0091, B:54:0x0095, B:57:0x00a5, B:60:0x00b5, B:61:0x00b6, B:63:0x00bf, B:64:0x00c2), top: B:85:0x0028, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[Catch: all -> 0x00d4, Exception -> 0x00d6, TryCatch #1 {Exception -> 0x00d6, blocks: (B:13:0x0028, B:16:0x0030, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0043, B:25:0x0051, B:27:0x005a, B:29:0x0060, B:31:0x0064, B:34:0x0069, B:35:0x006a, B:37:0x006e, B:39:0x0074, B:41:0x0078, B:43:0x007c, B:45:0x0080, B:47:0x0084, B:50:0x008d, B:52:0x0091, B:54:0x0095, B:57:0x00a5, B:60:0x00b5, B:61:0x00b6, B:63:0x00bf, B:64:0x00c2), top: B:85:0x0028, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F(android.graphics.Rect r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.F(android.graphics.Rect, boolean):void");
    }

    private final void G() {
        dvd dvdVar = this.C;
        if (dvdVar == null) {
            throw new RuntimeException("Cannot promote null LayoutState!");
        }
        if (dvdVar == this.B) {
            return;
        }
        this.B = dvdVar;
        List list = dvdVar != null ? dvdVar.I : null;
        if (this.Q != null) {
            this.Q.b(list);
        } else if (list != null) {
            drc drcVar = this.Q;
            if (drcVar == null) {
                drcVar = new drc();
                this.Q = drcVar;
            }
            drcVar.b(list);
        }
        dvz dvzVar = this.s;
        if (dvzVar != null) {
            dvzVar.w();
        }
    }

    private static boolean H(dvd dvdVar, int i, int i2, int i3) {
        return dvdVar != null && dvdVar.u(i, i2, i3) && dvdVar.t();
    }

    private static boolean I(dvd dvdVar, int i, int i2) {
        return dvdVar != null && dvdVar.v(i, i2) && dvdVar.t();
    }

    public static synchronized Looper a() {
        if (O == null) {
            boolean z = ebc.a;
            HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
            handlerThread.start();
            O = handlerThread.getLooper();
        }
        return O;
    }

    public static dsi c(dru druVar, drq drqVar, dvn dvnVar) {
        dsi dsiVar = new dsi(druVar);
        if (drqVar == null) {
            throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
        }
        dsiVar.c = drqVar;
        dsiVar.n = dvnVar;
        return dsiVar;
    }

    public static dsi d(dru druVar, drq drqVar) {
        ComponentTree componentTree = druVar.h;
        if (componentTree != null) {
            return c(dru.c(druVar), drqVar, componentTree.c == null ? null : new dxs(componentTree));
        }
        throw new IllegalStateException("Cannot create a nested ComponentTree with a null parent ComponentTree.");
    }

    public static boolean z(int i) {
        return i == 0 || i == 2 || i == 4 || i == 6;
    }

    public final synchronized boolean A() {
        return this.f;
    }

    public final boolean B() {
        dwm dwmVar = this.s.n;
        dyd.a();
        if (!dwmVar.d) {
            dwm dwmVar2 = this.s.n;
            dyd.a();
            if (!dwmVar2.f) {
                return false;
            }
        }
        if (this.o) {
            n();
        } else {
            Rect rect = new Rect();
            this.s.getLocalVisibleRect(rect);
            p(rect, true);
        }
        return true;
    }

    public final synchronized void C(int i, int i2, int i3) {
        Map map;
        dvd dvdVar = this.C;
        if (dvdVar != null) {
            dzr dzrVar = this.ag;
            dzq dzqVar = dvdVar.H;
            if (dzqVar != null && (map = dzqVar.a) != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    dzo dzoVar = (dzo) dzqVar.a.get((String) it.next());
                    if (dzoVar == null) {
                        throw null;
                    }
                    List list = dzoVar.a;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        dxo dxoVar = (dxo) list.get(i4);
                        dru druVar = dxoVar.b;
                        drq drqVar = dxoVar.a;
                        String strI = druVar.i();
                        if (!dzrVar.a(strI)) {
                            int i5 = (int) (((i3 - i2) + 1) * dzoVar.c.a);
                            if (i >= i2 - i5 && i <= i3 + i5) {
                                try {
                                    drqVar.ai(dzoVar.b);
                                } catch (Exception e) {
                                    dsq.d(druVar, e);
                                }
                                dzrVar.b(strI, 1);
                            }
                        }
                        if (dzrVar.a(strI)) {
                            int i6 = (int) (((i3 - i2) + 1) * dzoVar.c.a);
                            if (i < i2 - i6 || i > i3 + i6) {
                                try {
                                    drqVar.aj();
                                } catch (Exception e2) {
                                    dsq.d(druVar, e2);
                                }
                                dzrVar.b(strI, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final int D(int i, boolean z, dym dymVar) {
        dyr dyrVar;
        boolean z2 = ebc.a;
        if (dymVar != null) {
            if (!this.u && (dyrVar = dymVar.b) != null) {
                this.B.g();
                return (int) dyrVar.d.a;
            }
            if (this.u && !z) {
                return i;
            }
        }
        return -1;
    }

    public final synchronized drq b() {
        return this.y;
    }

    public final synchronized dxy e() {
        return new dxy(this.D);
    }

    public final synchronized String f() {
        return this.P;
    }

    public final synchronized String g() {
        drq drqVar = this.y;
        if (drqVar == null) {
            return null;
        }
        return drqVar.d();
    }

    public dvz getLithoView() {
        return this.s;
    }

    public final synchronized List h() {
        ArrayList arrayList;
        dxy dxyVar = this.D;
        arrayList = null;
        if (dxyVar != null && dxyVar.c() != null) {
            Map mapC = dxyVar.c();
            arrayList = new ArrayList();
            Iterator it = mapC.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((List) it.next());
            }
        }
        return arrayList;
    }

    public final void i(dsm dsmVar) {
        if (dsmVar == null) {
            return;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(dsmVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:5:0x000d, B:7:0x0011, B:8:0x0014, B:17:0x0027, B:21:0x0038, B:23:0x003c, B:25:0x0040, B:28:0x0045, B:30:0x0050, B:31:0x0058, B:38:0x0080, B:9:0x0015, B:11:0x001b, B:13:0x001f, B:14:0x0022, B:16:0x0026, B:34:0x0060, B:35:0x007d), top: B:44:0x000d, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r6 = this;
            java.lang.String r0 = "Trying to attach a ComponentTree with a null root. Is released: "
            defpackage.dyd.a()
            dvz r1 = r6.s
            if (r1 == 0) goto L85
            r2 = 1
            r6.h = r2
            r3 = 0
            dut r4 = r6.T     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L14
            r4.a(r1)     // Catch: java.lang.Throwable -> L81
        L14:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L81
            r6.q = r2     // Catch: java.lang.Throwable -> L7e
            dvd r1 = r6.C     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L22
            dvd r2 = r6.B     // Catch: java.lang.Throwable -> L7e
            if (r2 == r1) goto L22
            r6.G()     // Catch: java.lang.Throwable -> L7e
        L22:
            drq r1 = r6.y     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L60
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            dvz r0 = r6.s     // Catch: java.lang.Throwable -> L81
            int r0 = r0.getMeasuredWidth()     // Catch: java.lang.Throwable -> L81
            dvz r1 = r6.s     // Catch: java.lang.Throwable -> L81
            int r1 = r1.getMeasuredHeight()     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L38
            if (r1 == 0) goto L5d
            r0 = r3
        L38:
            dvd r2 = r6.B     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L58
            int r4 = r2.s     // Catch: java.lang.Throwable -> L81
            if (r4 != r0) goto L58
            int r0 = r2.t     // Catch: java.lang.Throwable -> L81
            if (r0 == r1) goto L45
            goto L58
        L45:
            dvz r0 = r6.s     // Catch: java.lang.Throwable -> L81
            dwm r0 = r0.n     // Catch: java.lang.Throwable -> L81
            defpackage.dyd.a()     // Catch: java.lang.Throwable -> L81
            boolean r0 = r0.d     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L58
            dvz r0 = r6.s     // Catch: java.lang.Throwable -> L81
            dwm r0 = r0.n     // Catch: java.lang.Throwable -> L81
            r0.s()     // Catch: java.lang.Throwable -> L81
            goto L5d
        L58:
            dvz r0 = r6.s     // Catch: java.lang.Throwable -> L81
            r0.requestLayout()     // Catch: java.lang.Throwable -> L81
        L5d:
            r6.h = r3
            return
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r6.f     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r6.P     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            r5.append(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = ", Released Component name is: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L7e
            r5.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            r6.h = r3
            throw r0
        L85:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to attach a ComponentTree without a set View"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.j():void");
    }

    public final void k() {
        boolean z;
        dyd.a();
        synchronized (this) {
            if (this.y == null) {
                return;
            }
            dvd dvdVar = this.C;
            if (dvdVar == null) {
                throw new RuntimeException("Unexpected null mCommittedLayoutState");
            }
            int i = 0;
            if (this.B != dvdVar) {
                G();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                eig eigVar = this.L;
                if (eigVar != null) {
                    eigVar.a.x(0);
                    this.L = null;
                }
                if (!this.q || this.n) {
                    return;
                }
                int measuredWidth = this.s.getMeasuredWidth();
                int measuredHeight = this.s.getMeasuredHeight();
                if (measuredWidth != 0) {
                    i = measuredWidth;
                } else if (measuredHeight == 0) {
                    return;
                }
                dvd dvdVar2 = this.B;
                if (dvdVar2 != null && dvdVar2.s == i && dvdVar2.t == measuredHeight) {
                    B();
                } else {
                    this.s.requestLayout();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f1 A[Catch: all -> 0x0231, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:85:0x0184, B:87:0x0188, B:90:0x018f, B:120:0x01f1), top: B:215:0x0184, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.dxt r17, int r18, java.lang.String r19, defpackage.dzh r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.l(dxt, int, java.lang.String, dzh, boolean):void");
    }

    public final void m() {
        dyd.a();
        dut dutVar = this.T;
        if (dutVar != null) {
            boolean z = this.s.l;
            List list = dutVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dus dusVar = (dus) list.get(i);
                dusVar.a.clear();
                bxb bxbVar = (bxb) dusVar.b.get();
                if (bxbVar != null) {
                    dur durVar = new dur();
                    int[] iArr = ahj.a;
                    bxbVar.postOnAnimation(durVar);
                }
            }
            list.clear();
        }
        synchronized (this) {
            this.q = false;
        }
    }

    public final void n() {
        dyd.a();
        if (!this.o) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        }
        if (this.s == null) {
            return;
        }
        Rect rect = new Rect();
        if (!this.s.getLocalVisibleRect(rect)) {
            if (this.u) {
                return;
            }
            if ((this.x == null || rect.height() != 0) && (this.w == null || rect.width() != 0)) {
                return;
            }
        }
        p(rect, true);
    }

    public final void o(int i, int i2, int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        dyd.a();
        this.n = true;
        try {
            synchronized (this) {
                dvd dvdVar = this.C;
                if (dvdVar != null && dvdVar != this.B && I(dvdVar, i, i2)) {
                    G();
                }
                dvd dvdVar2 = this.B;
                boolean z4 = dvdVar2 != null && dvdVar2.d == i && dvdVar2.e == i2;
                drq drqVar = this.y;
                boolean zH = H(dvdVar2, drqVar != null ? drqVar.j : -1, i, i2);
                if (z4 || zH) {
                    dvd dvdVar3 = this.B;
                    iArr[0] = dvdVar3.s;
                    iArr[1] = dvdVar3.t;
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                z3 = z;
            } else {
                if (!z) {
                    s(null, i, i2, true, null, 7, -1, null, null, false, false);
                }
                z3 = true;
            }
            dxt dxtVar = new dxt();
            s(null, i, i2, false, dxtVar, 6, -1, null, null, false, z3);
            synchronized (this) {
                if (this.f) {
                    throw new RuntimeException("Tree is released during measure!");
                }
                if (this.C != this.B) {
                    G();
                }
                dvd dvdVar4 = this.B;
                if (dvdVar4 != null) {
                    iArr[0] = dvdVar4.s;
                    iArr[1] = dvdVar4.t;
                } else {
                    iArr[0] = dxtVar.a;
                    iArr[1] = dxtVar.b;
                    dsr.c(2, "Measure Specs: [" + View.MeasureSpec.toString(i) + ", " + View.MeasureSpec.toString(i2) + "], Current Specs: [" + View.MeasureSpec.toString(this.z) + ", " + View.MeasureSpec.toString(this.A) + "], Output [W: " + dxtVar.a + ", H:" + dxtVar.b + "], Last Layout Source: " + dvd.k(this.af), eev.a(this.l));
                }
            }
        } finally {
            this.n = false;
        }
    }

    public final void p(Rect rect, boolean z) {
        String strViewToString;
        dyd.a();
        if (!this.m) {
            F(rect, z);
            Deque deque = this.R;
            if (deque != null) {
                ArrayDeque arrayDeque = new ArrayDeque(deque);
                this.R.clear();
                while (!arrayDeque.isEmpty()) {
                    dsn dsnVar = (dsn) arrayDeque.pollFirst();
                    this.s.w();
                    F(dsnVar.a, dsnVar.b);
                }
                return;
            }
            return;
        }
        dsn dsnVar2 = new dsn(rect, z);
        Deque deque2 = this.R;
        if (deque2 == null) {
            this.R = new ArrayDeque();
        } else if (deque2.size() > 25) {
            dvz dvzVar = this.s;
            if (dvzVar != null) {
                strViewToString = LithoViewTestHelper.viewToString(dvzVar, true);
                if (TextUtils.isEmpty(strViewToString)) {
                    strViewToString = "(" + dvzVar.getLeft() + "," + dvzVar.getTop() + "-" + dvzVar.getRight() + "," + dvzVar.getBottom() + ")";
                }
            } else {
                strViewToString = null;
            }
            Object objG = this.y;
            if (objG == null) {
                objG = g();
            }
            dsr.c(3, a.r(objG, strViewToString, "Reentrant mounts exceed max attempts, view=", ", component="), eev.a(this.l));
            this.R.clear();
            return;
        }
        this.R.add(dsnVar2);
    }

    @Override // defpackage.dvl
    public final void q(dvm dvmVar) {
        dvm dvmVar2 = dvm.HINT_VISIBLE;
        int iOrdinal = dvmVar.ordinal();
        if (iOrdinal == 0) {
            dvz dvzVar = this.s;
            if (dvzVar != null) {
                dvzVar.x(true);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            dvz dvzVar2 = this.s;
            if (dvzVar2 != null) {
                dvzVar2.x(false);
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            throw new IllegalStateException("Illegal state: ".concat(String.valueOf(String.valueOf(dvmVar))));
        }
        r();
        dvn dvnVar = this.c;
        if (dvnVar != null) {
            dvnVar.c(this);
            this.c = null;
        }
    }

    public final void r() {
        List list;
        dyd.a();
        if (this.m) {
            throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            ((emj) this.V).removeCallbacks(this.W);
            synchronized (this.X) {
                dsj dsjVar = this.Y;
                if (dsjVar != null) {
                    this.t.a(dsjVar);
                    this.Y = null;
                }
            }
            synchronized (this.j) {
                dso dsoVar = this.k;
                if (dsoVar != null) {
                    this.t.a(dsoVar);
                    this.k = null;
                }
            }
            synchronized (this.Z) {
                int i = 0;
                while (true) {
                    list = this.aa;
                    if (i >= list.size()) {
                        break;
                    }
                    ((dsl) list.get(i)).b();
                    i++;
                }
                list.clear();
            }
            drq drqVar = this.y;
            if (drqVar != null) {
                this.P = drqVar.d();
            }
            dvz dvzVar = this.s;
            if (dvzVar != null) {
                dvzVar.v((ComponentTree) null, true);
            }
            this.f = true;
            this.y = null;
            E();
            this.B = null;
            this.C = null;
            this.D = null;
            this.i = null;
        }
        if (this.Q != null) {
            drc drcVar = this.Q;
            dyd.a();
            Map map = drcVar.a;
            if (map != null) {
                drcVar.a(map);
                drcVar.a = null;
            }
        }
        dtz dtzVar = this.H;
        synchronized (dtzVar) {
            dtzVar.b();
        }
    }

    public final void s(drq drqVar, int i, int i2, boolean z, dxt dxtVar, int i3, int i4, String str, dzh dzhVar, boolean z2, boolean z3) {
        drq drqVar2;
        drq drqVar3;
        drq drqVar4;
        dxy dxyVar;
        dxt dxtVar2 = dxtVar;
        dzh dzhVar2 = dzhVar;
        boolean z4 = ebc.a;
        synchronized (this) {
            if (this.f) {
                return;
            }
            boolean z5 = true;
            if (i3 == 0 || i3 == 1) {
                int i5 = this.ab;
                if (i5 >= 0 && i4 < 0) {
                    throw new IllegalStateException("Setting an unversioned root after calling setVersionedRootAndSizeSpec is not supported. If this ComponentTree takes its version from a parent tree make sure to always call setVersionedRootAndSizeSpec");
                }
                if (i5 > i4) {
                    return;
                } else {
                    this.ab = i4;
                }
            }
            drq drqVarM = (drqVar == null || (dxyVar = this.D) == null || !dxyVar.n()) ? drqVar : drqVar.m();
            boolean z6 = i != -1;
            if (i2 == -1) {
                z5 = false;
            }
            if (drqVarM != null) {
                drqVar2 = drqVarM;
                drqVar3 = drqVar2;
            } else {
                drqVar2 = this.y;
                drqVar3 = null;
            }
            int i6 = z6 ? i : this.z;
            int i7 = z5 ? i2 : this.A;
            dvd dvdVar = this.C;
            if (!z3 && drqVar2 != null && dvdVar != null && dvdVar.u(drqVar2.j, i6, i7)) {
                if (dxtVar2 != null) {
                    dxtVar2.b = dvdVar.t;
                    dxtVar2.a = dvdVar.s;
                }
                return;
            }
            if (z6) {
                this.z = i;
            }
            if (z5) {
                this.A = i2;
            }
            if (drqVarM != null) {
                this.y = drqVar3;
            }
            if (z3 && (drqVar4 = this.y) != null) {
                this.y = drqVar4.m();
            }
            if (dzhVar2 != null) {
                this.ae = dzhVar2;
            } else {
                dzhVar2 = this.ae;
            }
            this.af = i3;
            if (z) {
                if (dxtVar2 != null) {
                    throw new IllegalArgumentException("The layout can't be calculated asynchronously if we need the Size back");
                }
                dxtVar2 = null;
            }
            if (!z) {
                l(dxtVar2, i3, str, dzhVar2, z2);
                return;
            }
            synchronized (this.X) {
                dsj dsjVar = this.Y;
                if (dsjVar != null) {
                    this.t.a(dsjVar);
                }
                this.Y = new dsj(this, i3, dzhVar2, str, z2);
                this.t.b();
                this.t.c(this.Y);
            }
        }
    }

    public final void t(drq drqVar, int i, int i2, dxt dxtVar) {
        if (drqVar == null) {
            throw new IllegalArgumentException("Root component can't be null");
        }
        s(drqVar, i, i2, false, dxtVar, 0, -1, null, null, false, false);
    }

    public final void u(drq drqVar, int i, int i2, dxt dxtVar, dzh dzhVar, int i3) {
        if (drqVar == null) {
            throw new IllegalArgumentException("Root component can't be null");
        }
        s(drqVar, i, i2, false, dxtVar, 0, i3, null, dzhVar, false, false);
    }

    public final synchronized void v(dvn dvnVar) {
        if (this.c != null) {
            throw new IllegalStateException("Already subscribed");
        }
        this.c = dvnVar;
        dvnVar.b(this);
    }

    public final void w(boolean z, String str, boolean z2) {
        synchronized (this) {
            if (this.y == null) {
                return;
            }
            dzh dzhVarB = dzh.b(this.ae);
            if (z2) {
                int i = this.S + 1;
                this.S = i;
                if (i == 50) {
                    String strE = a.e(str, "State update loop during layout detected. Most recent attribution: ", ".\nState updates were dispatched over 50 times during the current layout. This happens most commonly when state updates are dispatched unconditionally from the render method.");
                    boolean z3 = ebc.a;
                    dsr.c(3, strE, eev.a(this.l));
                }
            }
            s(this.y, -1, -1, z, null, true != z ? 4 : 5, -1, str, dzhVarB, z2, false);
        }
    }

    public final synchronized void x(String str, dxw dxwVar) {
        dxy dxyVar;
        if (this.y != null && (dxyVar = this.D) != null) {
            dxyVar.m(str, dxwVar, true);
        }
    }

    public final synchronized boolean y(int i, int i2) {
        if (!I(this.B, i, i2)) {
            if (!I(this.C, i, i2)) {
                return false;
            }
        }
        return true;
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lbk implements lco {
    private static volatile lbk C;
    final long A;
    public final klk B;
    private Boolean D;
    private long E;
    public final Context a;
    public final boolean b;
    public final kts c;
    public final ktx d;
    public final lao e;
    public final lab f;
    public final lbh g;
    public final lhg h;
    public final lio i;
    public final kzu j;
    public final lfg k;
    public final leo l;
    public final kst m;
    public final let n;
    public final String o;
    public kzt p;
    public lgp q;
    public kul r;
    public kzq s;
    public lev t;
    public volatile Boolean v;
    public volatile boolean w;
    public int x;
    public int y;
    public boolean u = false;
    public final AtomicInteger z = new AtomicInteger(0);

    public lbk(lcy lcyVar) {
        Context context = lcyVar.a;
        kts ktsVar = new kts();
        this.c = ktsVar;
        kze.a = ktsVar;
        this.a = context;
        this.b = lcyVar.e;
        this.v = lcyVar.b;
        this.o = lcyVar.g;
        this.w = true;
        rgi.e(context);
        this.B = klk.a;
        Long l = lcyVar.f;
        this.A = l != null ? l.longValue() : System.currentTimeMillis();
        this.d = new ktx(this);
        lao laoVar = new lao(this);
        laoVar.p();
        this.e = laoVar;
        lab labVar = new lab(this);
        labVar.p();
        this.f = labVar;
        lio lioVar = new lio(this);
        lioVar.p();
        this.i = lioVar;
        this.j = new kzu(new lcx(this));
        this.m = new kst(this);
        lfg lfgVar = new lfg(this);
        lfgVar.b();
        this.k = lfgVar;
        leo leoVar = new leo(this);
        leoVar.b();
        this.l = leoVar;
        lhg lhgVar = new lhg(this);
        lhgVar.b();
        this.h = lhgVar;
        let letVar = new let(this);
        letVar.p();
        this.n = letVar;
        lbh lbhVar = new lbh(this);
        lbhVar.p();
        this.g = lbhVar;
        InitializationParams initializationParams = lcyVar.d;
        boolean z = initializationParams == null || initializationParams.b == 0;
        if (context.getApplicationContext() instanceof Application) {
            n(leoVar);
            if (leoVar.y.a.getApplicationContext() instanceof Application) {
                Application application = (Application) leoVar.y.a.getApplicationContext();
                if (leoVar.a == null) {
                    leoVar.a = new len(leoVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(leoVar.a);
                    application.registerActivityLifecycleCallbacks(leoVar.a);
                    lbk lbkVar = leoVar.y;
                    lab labVar2 = lbkVar.f;
                    lbkVar.o(labVar2);
                    labVar2.k.a("Registered activity lifecycle callback");
                }
            }
        } else {
            o(labVar);
            labVar.f.a("Application context is not an Application");
        }
        lbhVar.h(new lbj(this, lcyVar));
    }

    public static lbk i(Context context, InitializationParams initializationParams, Long l) {
        Bundle bundle;
        if (initializationParams != null) {
            Bundle bundle2 = initializationParams.d;
            initializationParams = new InitializationParams(initializationParams.a, initializationParams.b, initializationParams.c, bundle2, null);
        }
        kkk.k(context);
        kkk.k(context.getApplicationContext());
        if (C == null) {
            synchronized (lbk.class) {
                if (C == null) {
                    C = new lbk(new lcy(context, initializationParams, l));
                }
            }
        } else if (initializationParams != null && (bundle = initializationParams.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            kkk.k(C);
            C.v = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        kkk.k(C);
        return C;
    }

    public final int a() {
        lcn lcnVar = this.g;
        o(lcnVar);
        lcnVar.g();
        ktx ktxVar = this.d;
        if (ktxVar.w()) {
            return 1;
        }
        o(lcnVar);
        lcnVar.g();
        if (!this.w) {
            return 8;
        }
        lao laoVar = this.e;
        m(laoVar);
        Boolean boolH = laoVar.h();
        if (boolH != null) {
            return boolH.booleanValue() ? 0 : 3;
        }
        kts ktsVar = ktxVar.y.c;
        Boolean boolQ = ktxVar.q("firebase_analytics_collection_enabled");
        return boolQ != null ? boolQ.booleanValue() ? 0 : 4 : (this.v == null || this.v.booleanValue()) ? 0 : 7;
    }

    @Override // defpackage.lco
    public final kts aA() {
        return this.c;
    }

    @Override // defpackage.lco
    public final lab aB() {
        lab labVar = this.f;
        o(labVar);
        return labVar;
    }

    @Override // defpackage.lco
    public final lbh aC() {
        lbh lbhVar = this.g;
        o(lbhVar);
        return lbhVar;
    }

    @Override // defpackage.lco
    public final Context az() {
        return this.a;
    }

    public final kul d() {
        o(this.r);
        return this.r;
    }

    public final kzq e() {
        n(this.s);
        return this.s;
    }

    public final kzt f() {
        n(this.p);
        return this.p;
    }

    public final lev j() {
        l(this.t);
        return this.t;
    }

    public final lgp k() {
        n(this.q);
        return this.q;
    }

    public final void l(ksv ksvVar) {
        if (ksvVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final void m(lcm lcmVar) {
        if (lcmVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final void n(ksw kswVar) {
        if (kswVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!kswVar.e()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(kswVar.getClass()))));
        }
    }

    public final void o(lcn lcnVar) {
        if (lcnVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!lcnVar.r()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(lcnVar.getClass()))));
        }
    }

    final void p() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void q() {
        this.x++;
    }

    public final boolean r() {
        return this.v != null && this.v.booleanValue();
    }

    public final boolean s() {
        return a() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean t() {
        /*
            r5 = this;
            boolean r0 = r5.u
            if (r0 == 0) goto L9d
            lbh r0 = r5.g
            r5.o(r0)
            r0.g()
            java.lang.Boolean r0 = r5.D
            if (r0 == 0) goto L2f
            long r1 = r5.E
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L96
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r5.E
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L96
        L2f:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.E = r0
            lio r0 = r5.i
            r5.m(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.ah(r1)
            r2 = 0
            if (r1 == 0) goto L75
            r5.m(r0)
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.ah(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r5.a
            kmb r3 = defpackage.kmb.a
            kma r3 = r3.a(r1)
            boolean r3 = r3.c()
            r4 = 1
            if (r3 != 0) goto L74
            ktx r3 = r5.d
            boolean r3 = r3.y()
            if (r3 != 0) goto L74
            boolean r3 = defpackage.lio.ao(r1)
            if (r3 == 0) goto L75
            defpackage.kkk.k(r1)
            boolean r1 = defpackage.lio.av(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r5.D = r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L96
            r5.m(r0)
            kzq r1 = r5.e()
            java.lang.String r1 = r1.j()
            boolean r0 = r0.Z(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.D = r0
        L96:
            java.lang.Boolean r0 = r5.D
            boolean r0 = r0.booleanValue()
            return r0
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbk.t():boolean");
    }

    @Override // defpackage.lco
    public final void aD() {
    }
}

package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efn {
    public static final /* synthetic */ int f = 0;
    private static final AtomicInteger g = new AtomicInteger(1);
    public final dvn a;
    public final int b;
    public boolean c;
    public ComponentTree d;
    public ejm e;
    private final boolean h;
    private final boolean i;
    private efm j;
    private final ebc k;
    private final boolean l;
    private final boolean m;
    private final emk n;
    private boolean o;
    private boolean p;
    private int q;
    private dxy r;
    private int s;
    private int t;
    private boolean u;
    private final eht v;
    private eig w;

    public efn(efl eflVar) {
        new AtomicInteger(0);
        this.o = true;
        this.p = false;
        this.s = -1;
        this.t = -1;
        this.u = true;
        this.e = eflVar.a;
        this.n = eflVar.c;
        this.v = eflVar.i;
        this.h = eflVar.e;
        this.b = g.getAndIncrement();
        this.l = eflVar.d;
        this.m = eflVar.g;
        this.i = eflVar.f;
        this.a = eflVar.h;
        this.k = eflVar.b;
    }

    private final void u(dru druVar) {
        dsm eieVar;
        dtp dtpVar;
        if (this.d == null) {
            if (this.a != null) {
                this.j = new efm(this);
            }
            dsi dsiVarC = ComponentTree.c(druVar, this.e.b(), this.j);
            Object objD = this.e.d("is_reconciliation_enabled");
            Object objD2 = this.e.d("layout_diffing_enabled");
            Object objD3 = this.e.d("error_event_handler");
            if (objD != null) {
                dsiVarC.j = ((Boolean) objD).booleanValue();
            } else {
                dsiVarC.j = false;
            }
            if (objD2 != null) {
                dsiVarC.e = ((Boolean) objD2).booleanValue();
            } else {
                dsiVarC.e = this.i;
            }
            if ((objD3 instanceof dtp) && (dtpVar = (dtp) objD3) != null) {
                dsiVarC.k = dtpVar;
            }
            dsiVarC.f = this.n;
            dsiVarC.g = this.r;
            eht ehtVar = this.v;
            if (ehtVar == null) {
                eieVar = null;
            } else {
                eiz eizVar = ehtVar.a;
                eieVar = eizVar.j ? new eie(eizVar, this) : new eif(eizVar, this);
            }
            dsiVarC.i = eieVar;
            dsiVarC.h = this.p;
            dsiVarC.d = this.l;
            dsiVarC.b = this.m;
            dsiVarC.l = this.h;
            ohv ohvVarI = this.e.i();
            String strE = this.e.e();
            dsiVarC.p = ohvVarI;
            dsiVarC.m = strE;
            dsiVarC.o = true;
            dsiVarC.a();
            ComponentTree componentTreeA = dsiVarC.a();
            this.d = componentTreeA;
            eig eigVar = this.w;
            if (eigVar != null) {
                componentTreeA.L = eigVar;
            }
        }
    }

    final synchronized int a() {
        return this.q;
    }

    public final synchronized ComponentTree b() {
        return this.d;
    }

    public final synchronized ejm c() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:11:0x0021, B:13:0x0025, B:14:0x0029, B:8:0x0017, B:10:0x001b), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void d(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L17
            ejm r2 = r1.e     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "acquire_state_handler"
            java.lang.Object r2 = r2.d(r0)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L21
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L21
        L17:
            com.facebook.litho.ComponentTree r2 = r1.d     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L21
            dxy r2 = r2.e()     // Catch: java.lang.Throwable -> L2e
            r1.r = r2     // Catch: java.lang.Throwable -> L2e
        L21:
            com.facebook.litho.ComponentTree r2 = r1.d     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L29
            boolean r2 = r2.u     // Catch: java.lang.Throwable -> L2e
            r1.p = r2     // Catch: java.lang.Throwable -> L2e
        L29:
            r1.i()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r1)
            return
        L2e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2e
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efn.d(boolean):void");
    }

    public final synchronized void e(dsm dsmVar) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            synchronized (componentTree) {
                List list = componentTree.i;
                if (list != null) {
                    list.remove(dsmVar);
                }
            }
        }
    }

    public final synchronized void f() {
        this.u = false;
    }

    public final void g(dru druVar, int i, int i2, dxt dxtVar) {
        ComponentTree componentTree;
        drq drqVarB;
        dzh dzhVar;
        synchronized (this) {
            this.e.m();
            this.s = i;
            this.t = i2;
            u(druVar);
            componentTree = this.d;
            drqVarB = this.e.b();
            ejm ejmVar = this.e;
            dzhVar = ejmVar instanceof elb ? ((elb) ejmVar).a : null;
        }
        componentTree.s(drqVarB, i, i2, false, dxtVar, 0, -1, null, dzhVar, false, false);
        synchronized (this) {
            if (componentTree == this.d && drqVarB == this.e.b()) {
                this.c = true;
                if (dxtVar != null) {
                    this.q = dxtVar.b;
                }
            }
        }
    }

    final synchronized void h() {
        this.c = false;
    }

    public final synchronized void i() {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            efm efmVar = this.j;
            if (efmVar != null) {
                efmVar.d(dvm.DESTROYED);
                return;
            } else {
                componentTree.r();
                this.d = null;
                this.e.f();
            }
        }
        this.c = false;
    }

    public final synchronized void j(boolean z) {
        this.o = z;
    }

    final synchronized void k(int i) {
        this.q = i;
    }

    public final synchronized void l(ejm ejmVar) {
        h();
        this.e = ejmVar;
    }

    public final synchronized boolean m() {
        this.e.m();
        ComponentTree componentTree = this.d;
        boolean z = false;
        if (componentTree != null) {
            if (!componentTree.y(this.s, this.t)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public final synchronized boolean n() {
        return this.o;
    }

    public final synchronized boolean o() {
        return this.c;
    }

    public final synchronized boolean p(int i, int i2) {
        if (o() && this.s == i) {
            if (this.t == i2) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean q() {
        return this.u;
    }

    final synchronized void r(eig eigVar) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            componentTree.L = eigVar;
        } else {
            this.w = eigVar;
        }
    }

    final synchronized void s(int i, int i2, int i3) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            componentTree.C(i, i2, i3);
        }
    }

    public final void t(dru druVar, int i, int i2, dsm dsmVar) {
        ComponentTree componentTree;
        drq drqVarB;
        dzh dzhVar;
        synchronized (this) {
            this.e.m();
            this.s = i;
            this.t = i2;
            u(druVar);
            componentTree = this.d;
            drqVarB = this.e.b();
            ejm ejmVar = this.e;
            dzhVar = ejmVar instanceof elb ? ((elb) ejmVar).a : null;
        }
        if (dsmVar != null) {
            componentTree.i(dsmVar);
        }
        componentTree.s(drqVarB, i, i2, true, null, 1, -1, null, dzhVar, false, false);
        synchronized (this) {
            if (this.d == componentTree && drqVarB == this.e.b()) {
                this.c = true;
            }
        }
    }
}

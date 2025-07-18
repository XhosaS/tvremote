package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqm implements afoe {
    private volatile boolean a;
    private afog b;
    private Status c;
    private afql e;
    public afoe f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void k(Runnable runnable) {
        yqw.M(this.b != null, "May only be called after start");
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.d.add(runnable);
            }
        }
    }

    private final void l(afog afogVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.f.u(afogVar);
    }

    private final void o(afoe afoeVar) {
        afoe afoeVar2 = this.f;
        yqw.R(afoeVar2 == null, "realStream already set to %s", afoeVar2);
        this.f = afoeVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.afoe
    public final afeh a() {
        throw null;
    }

    @Override // defpackage.afzx
    public final void c() {
        yqw.M(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.c();
        } else {
            k(new afqe(this));
        }
    }

    @Override // defpackage.afzx
    public final void d() {
        yqw.M(this.b == null, "May only be called before start");
        this.i.add(new afpw(this));
    }

    @Override // defpackage.afzx
    public final void e(int i) {
        yqw.M(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.e(i);
        } else {
            k(new afpv(this, i));
        }
    }

    @Override // defpackage.afzx
    public final void f(affa affaVar) {
        yqw.M(this.b == null, "May only be called before start");
        affaVar.getClass();
        this.i.add(new afpx(this, affaVar));
    }

    final Runnable g(afoe afoeVar) {
        synchronized (this) {
            if (this.f == null) {
                afoeVar.getClass();
                o(afoeVar);
                afog afogVar = this.b;
                if (afogVar == null) {
                    this.d = null;
                    this.a = true;
                }
                if (afogVar != null) {
                    l(afogVar);
                    return new afqc(this);
                }
            }
        }
        return null;
    }

    @Override // defpackage.afzx
    public final void h(InputStream inputStream) {
        yqw.M(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.h(inputStream);
        } else {
            k(new afqd(this, inputStream));
        }
    }

    @Override // defpackage.afzx
    public final boolean i() {
        if (this.a) {
            return this.f.i();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            afql r2 = r6.e     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqm.j():void");
    }

    @Override // defpackage.afoe
    public void m(afry afryVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.f != null) {
                afryVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.f.m(afryVar);
            } else {
                afryVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                afryVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.afoe
    public void n(Status status) {
        boolean z = true;
        yqw.M(this.b != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.f == null) {
                o(afvn.a);
                this.c = status;
                z = false;
            }
        }
        if (z) {
            k(new afqf(this, status));
            return;
        }
        j();
        b();
        this.b.a(status, afof.PROCESSED, new afih());
    }

    @Override // defpackage.afoe
    public final void p() {
        yqw.M(this.b != null, "May only be called after start");
        k(new afqg(this));
    }

    @Override // defpackage.afoe
    public final void q(afft afftVar) {
        yqw.M(this.b == null, "May only be called before start");
        this.i.add(new afqb(this, afftVar));
    }

    @Override // defpackage.afoe
    public final void r(affw affwVar) {
        yqw.M(this.b == null, "May only be called before start");
        affwVar.getClass();
        this.i.add(new afpy(this, affwVar));
    }

    @Override // defpackage.afoe
    public final void s(int i) {
        yqw.M(this.b == null, "May only be called before start");
        this.i.add(new afpz(this, i));
    }

    @Override // defpackage.afoe
    public final void t(int i) {
        yqw.M(this.b == null, "May only be called before start");
        this.i.add(new afqa(this, i));
    }

    @Override // defpackage.afoe
    public final void u(afog afogVar) {
        Status status;
        boolean z;
        yqw.M(this.b == null, "already started");
        synchronized (this) {
            status = this.c;
            z = this.a;
            if (!z) {
                afql afqlVar = new afql(afogVar);
                this.e = afqlVar;
                afogVar = afqlVar;
            }
            this.b = afogVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            afogVar.a(status, afof.PROCESSED, new afih());
        } else if (z) {
            l(afogVar);
        }
    }

    protected void b() {
    }
}

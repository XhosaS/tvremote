package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class xwj implements xvk {
    private xtk a;
    private xwi b;
    private long c;
    private long d;
    public volatile boolean f;
    public xvm g;
    public xvk h;
    public List i = new ArrayList();
    private List e = new ArrayList();

    private final void f(Runnable runnable) {
        sij.x(this.g != null, "May only be called after start");
        synchronized (this) {
            if (this.f) {
                runnable.run();
            } else {
                this.i.add(runnable);
            }
        }
    }

    @Override // defpackage.xvk
    public final xpv a() {
        throw null;
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
    public final void c() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.i     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.i = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.f = r1     // Catch: java.lang.Throwable -> L6d
            xwi r2 = r6.b     // Catch: java.lang.Throwable -> L6d
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
            java.util.List r1 = r6.i     // Catch: java.lang.Throwable -> L6d
            r6.i = r0     // Catch: java.lang.Throwable -> L6d
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwj.c():void");
    }

    public final void d(xvm xvmVar) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.e = null;
        this.h.o(xvmVar);
    }

    public final void e(xvk xvkVar) {
        xvk xvkVar2 = this.h;
        sij.z(xvkVar2 == null, "realStream already set to %s", xvkVar2);
        this.h = xvkVar;
        this.d = System.nanoTime();
    }

    @Override // defpackage.xvk
    public void g(xxi xxiVar) {
        synchronized (this) {
            if (this.g == null) {
                return;
            }
            if (this.h != null) {
                xxiVar.b("buffered_nanos", Long.valueOf(this.d - this.c));
                this.h.g(xxiVar);
            } else {
                xxiVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.c));
                xxiVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.xvk
    public void h(xtk xtkVar) {
        boolean z = true;
        sij.x(this.g != null, "May only be called after start");
        xtkVar.getClass();
        synchronized (this) {
            if (this.h == null) {
                e(xzn.a);
                this.a = xtkVar;
                z = false;
            }
        }
        if (z) {
            f(new utm(this, xtkVar, 15, (char[]) null));
            return;
        }
        c();
        b();
        this.g.a(xtkVar, xvl.PROCESSED, new xsm());
    }

    @Override // defpackage.xvk
    public final void j() {
        sij.x(this.g != null, "May only be called after start");
        f(new xwf(this, 7));
    }

    @Override // defpackage.xvk
    public final void k(xqp xqpVar) {
        sij.x(this.g == null, "May only be called before start");
        this.e.add(new utm(this, xqpVar, 13, (char[]) null));
    }

    @Override // defpackage.xvk
    public final void l(xqs xqsVar) {
        sij.x(this.g == null, "May only be called before start");
        xqsVar.getClass();
        this.e.add(new utm(this, xqsVar, 12, (char[]) null));
    }

    @Override // defpackage.xvk
    public final void m(int i) {
        sij.x(this.g == null, "May only be called before start");
        this.e.add(new utl(this, i, 5, null));
    }

    @Override // defpackage.xvk
    public final void n(int i) {
        sij.x(this.g == null, "May only be called before start");
        this.e.add(new utl(this, i, 6, null));
    }

    @Override // defpackage.xvk
    public final void o(xvm xvmVar) {
        xtk xtkVar;
        boolean z;
        sij.x(this.g == null, "already started");
        synchronized (this) {
            xtkVar = this.a;
            z = this.f;
            if (!z) {
                xwi xwiVar = new xwi(xvmVar);
                this.b = xwiVar;
                xvmVar = xwiVar;
            }
            this.g = xvmVar;
            this.c = System.nanoTime();
        }
        if (xtkVar != null) {
            xvmVar.a(xtkVar, xvl.PROCESSED, new xsm());
        } else if (z) {
            d(xvmVar);
        }
    }

    @Override // defpackage.ybt
    public final boolean p() {
        if (this.f) {
            return this.h.p();
        }
        return false;
    }

    @Override // defpackage.ybt
    public final void r() {
        sij.x(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.r();
        } else {
            f(new xwf(this, 6));
        }
    }

    @Override // defpackage.ybt
    public final void t() {
        sij.x(this.g == null, "May only be called before start");
        this.e.add(new xwf(this, 4));
    }

    @Override // defpackage.ybt
    public final void u(int i) {
        sij.x(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.u(i);
        } else {
            f(new utl(this, i, 4, null));
        }
    }

    @Override // defpackage.ybt
    public final void v(xqh xqhVar) {
        sij.x(this.g == null, "May only be called before start");
        this.e.add(new utm(this, xqhVar, 11, (char[]) null));
    }

    @Override // defpackage.ybt
    public final void w(InputStream inputStream) {
        sij.x(this.g != null, "May only be called after start");
        if (this.f) {
            this.h.w(inputStream);
        } else {
            f(new utm((Object) this, (Object) inputStream, 14, (byte[]) null));
        }
    }

    protected void b() {
    }
}

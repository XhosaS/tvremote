package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agkv extends aghu implements Runnable, agfs {
    private static final long serialVersionUID = 6576896619930983584L;
    final agfs a;
    final agfw b;
    final int c;
    aghs d;
    aggi e;
    Throwable f;
    volatile boolean g;
    volatile boolean h;
    int i;
    boolean j;

    public agkv(agfs agfsVar, agfw agfwVar, int i) {
        this.a = agfsVar;
        this.b = agfwVar;
        this.c = i;
    }

    @Override // defpackage.agfs
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        e();
    }

    @Override // defpackage.aghs
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.h(obj);
        }
        e();
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (aghd.d(this.e, aggiVar)) {
            this.e = aggiVar;
            if (aggiVar instanceof aghp) {
                aghp aghpVar = (aghp) aggiVar;
                int i = aghpVar.i();
                if (i == 1) {
                    this.i = 1;
                    this.d = aghpVar;
                    this.g = true;
                    this.a.d(this);
                    e();
                    return;
                }
                if (i == 2) {
                    this.i = 2;
                    this.d = aghpVar;
                    this.a.d(this);
                    return;
                }
            }
            this.d = new agme(this.c);
            this.a.d(this);
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.dispose();
        this.b.dispose();
        if (getAndIncrement() == 0) {
            this.d.b();
        }
    }

    final void e() {
        if (getAndIncrement() == 0) {
            this.b.b(this, 0L, TimeUnit.NANOSECONDS);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (this.g) {
            agoh.e(th);
            return;
        }
        this.f = th;
        this.g = true;
        e();
    }

    @Override // defpackage.aghs
    public final Object ff() {
        return this.d.ff();
    }

    @Override // defpackage.aghs
    public final boolean fj() {
        return this.d.fj();
    }

    @Override // defpackage.aghq
    public final int i() {
        this.j = true;
        return 2;
    }

    final boolean j(boolean z, boolean z2, agfs agfsVar) {
        if (this.h) {
            this.d.b();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.h = true;
            this.d.b();
            agfsVar.fe(th);
            this.b.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.h = true;
        agfsVar.a();
        this.b.dispose();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r3 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.j
            r1 = 1
            if (r0 == 0) goto L47
            r0 = r1
        L6:
            boolean r2 = r7.h
            if (r2 == 0) goto Lc
            goto L8d
        Lc:
            boolean r2 = r7.g
            java.lang.Throwable r3 = r7.f
            if (r2 == 0) goto L24
            if (r3 != 0) goto L15
            goto L24
        L15:
            r7.h = r1
            agfs r0 = r7.a
            java.lang.Throwable r1 = r7.f
            r0.fe(r1)
            agfw r0 = r7.b
            r0.dispose()
            return
        L24:
            agfs r3 = r7.a
            r4 = 0
            r3.c(r4)
            if (r2 == 0) goto L3f
            r7.h = r1
            java.lang.Throwable r0 = r7.f
            if (r0 == 0) goto L36
            r3.fe(r0)
            goto L39
        L36:
            r3.a()
        L39:
            agfw r0 = r7.b
            r0.dispose()
            return
        L3f:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L8d
        L47:
            aghs r0 = r7.d
            agfs r2 = r7.a
            r3 = r1
        L4c:
            boolean r4 = r7.g
            boolean r5 = r0.fj()
            boolean r4 = r7.j(r4, r5, r2)
            if (r4 != 0) goto L8d
        L58:
            boolean r4 = r7.g
            java.lang.Object r5 = r0.ff()     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L62
            r6 = r1
            goto L63
        L62:
            r6 = 0
        L63:
            boolean r4 = r7.j(r4, r6, r2)
            if (r4 != 0) goto L8d
            if (r6 == 0) goto L73
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L4c
            goto L8d
        L73:
            r2.c(r5)
            goto L58
        L77:
            r3 = move-exception
            defpackage.aggq.a(r3)
            r7.h = r1
            aggi r1 = r7.e
            r1.dispose()
            r0.b()
            r2.fe(r3)
            agfw r0 = r7.b
            r0.dispose()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agkv.run():void");
    }
}

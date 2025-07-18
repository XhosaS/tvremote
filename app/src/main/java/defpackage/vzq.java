package defpackage;

import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzq {
    public final vyp a;
    public final vrl b;
    public final Executor c;
    public final AtomicReference d = new AtomicReference(null);
    public vyt e;
    public vys f;
    public vyx g;
    public final vrg h;
    public final vrg i;
    public final mcw j;
    public vzp k;

    public vzq(vxo vxoVar, mcw mcwVar, vyp vypVar, vrl vrlVar, Executor executor) {
        vyv vyvVar = vyx.f;
        ypv ypvVar = ypv.a;
        this.g = new vxk(0L, vyvVar, false, ypvVar, ypvVar);
        this.h = new vrg(2, new yqi() { // from class: vzf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                zyd zydVar = ((vyc) obj).a;
                return null;
            }
        });
        this.i = new vrg(1, new yqi() { // from class: vzg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                ((vyg) obj).c();
                return null;
            }
        });
        this.j = mcwVar;
        this.a = vypVar;
        this.b = vrlVar;
        vxi vxiVar = new vxi(vxoVar, ((vya) vxoVar).a, new vzr() { // from class: vxs
            @Override // defpackage.vzr
            public final int a(Instant instant, vxn vxnVar, boolean z) {
                if (vxnVar.b.b) {
                    return (!vxnVar.d() && z) ? 3 : 2;
                }
                return 1;
            }
        }, 0L, 1, new vxj(vxoVar, Long.MIN_VALUE, new vxf(0L), new vxg(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.f = vxiVar;
        this.e = vxiVar.e;
        this.c = executor;
    }

    public static void f(vxl vxlVar) {
        wvx wvxVarF = wzg.f("BackgroundCallbacks.onBackgroundFetch", wwb.a, true);
        try {
            vxlVar.a();
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void g(vxl vxlVar) {
        wvx wvxVarF = wzg.f("BackgroundCallbacks.onBackgroundFetchSucceeded", wwb.a, true);
        try {
            vxlVar.b();
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.vyx j(defpackage.vyx r6, defpackage.vyg r7) {
        /*
            r0 = r6
            vxk r0 = (defpackage.vxk) r0
            yqt r1 = r0.e
            boolean r2 = r1.g()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.c()
            if (r2 != r7) goto L1b
            ypv r0 = defpackage.ypv.a
            vyx r1 = r6.f(r7)
            r2 = r1
            r1 = r0
            goto L8d
        L1b:
            boolean r2 = r1.g()
            if (r2 != 0) goto L4e
            yqt r2 = r0.d
            boolean r3 = r2.g()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.c()
            if (r3 != r7) goto L4e
            java.lang.Object r0 = r2.c()
            vyg r0 = (defpackage.vyg) r0
            vxn r0 = r0.a()
            java.lang.Object r0 = r0.c()
            yqt r0 = defpackage.yqt.i(r0)
            ypv r1 = defpackage.ypv.a
            java.lang.Object r2 = r2.c()
            vyg r2 = (defpackage.vyg) r2
            vyx r2 = r6.f(r2)
            goto L8d
        L4e:
            boolean r2 = r1.g()
            if (r2 == 0) goto L78
            java.lang.Object r1 = r1.c()
            vyg r1 = (defpackage.vyg) r1
            vxn r1 = r1.a()
            java.lang.Object r1 = r1.c()
            vxn r2 = r7.a()
            java.lang.Object r2 = r2.c()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            ypv r0 = defpackage.ypv.a
            yqt r1 = defpackage.yqt.i(r7)
            r2 = r6
            goto L8d
        L78:
            vxn r1 = r7.a()
            java.lang.Object r1 = r1.c()
            yqt r1 = defpackage.yqt.i(r1)
            yqt r0 = r0.d
            vyx r2 = r6.f(r7)
            r5 = r1
            r1 = r0
            r0 = r5
        L8d:
            boolean r0 = r0.g()
            if (r0 == 0) goto Lca
            wwc r0 = defpackage.wwb.a
            r3 = 1
            java.lang.String r4 = "SubscriptionCallbacks.onNewData"
            wvx r0 = defpackage.wzg.f(r4, r0, r3)
            vqw r3 = defpackage.vqx.a()     // Catch: java.lang.Throwable -> Lc0
            vxk r6 = (defpackage.vxk) r6     // Catch: java.lang.Throwable -> Lb6
            vyv r6 = r6.b     // Catch: java.lang.Throwable -> Lb6
            vxn r7 = r7.a()     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r7 = r7.c()     // Catch: java.lang.Throwable -> Lb6
            r6.b(r7)     // Catch: java.lang.Throwable -> Lb6
            r3.close()     // Catch: java.lang.Throwable -> Lc0
            r0.close()
            goto Lca
        Lb6:
            r6 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.Throwable -> Lc0
        Lbf:
            throw r6     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc5:
            r7 = move-exception
            r6.addSuppressed(r7)
        Lc9:
            throw r6
        Lca:
            boolean r6 = r1.g()
            if (r6 == 0) goto Ld9
            java.lang.Object r6 = r1.c()
            vyg r6 = (defpackage.vyg) r6
            r6.c()
        Ld9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzq.j(vyx, vyg):vyx");
    }

    final void a() {
        vzp vzpVar = this.k;
        if (vzpVar != null) {
            this.a.d(((vxi) this.f).b, vzpVar);
            this.k = null;
        }
        this.h.a();
        this.i.a();
        yqt yqtVar = ((vxk) this.g).d;
        if (yqtVar.g()) {
            ((vyg) yqtVar.c()).c();
        }
        vxk vxkVar = (vxk) this.g;
        yqt yqtVar2 = vxkVar.e;
        if (!yqtVar2.g() || yqtVar2.equals(vxkVar.d)) {
            return;
        }
        ((vyg) ((vxk) this.g).e.c()).c();
    }

    public final void b(vyt vytVar, vyg vygVar) {
        yqw.L(vygVar.a().b.b);
        this.g = j(this.g, vygVar);
        this.e = vytVar;
    }

    final void c() {
        vxk vxkVar = (vxk) this.g;
        this.g = new vxk(vxkVar.a + 1, vyx.f, false, vxkVar.d, ypv.a);
    }

    public final void d(vyt vytVar) {
        wvx wvxVarF;
        uea.c();
        vxk vxkVar = (vxk) this.g;
        if (!vxkVar.d.g()) {
            vyv vyvVar = vxkVar.b;
            wvxVarF = wzg.f("SubscriptionCallbacks.onPending", wwb.a, true);
            try {
                vqw vqwVarA = vqx.a();
                try {
                    vyvVar.c();
                    vqwVarA.close();
                    wvxVarF.close();
                } finally {
                }
            } finally {
            }
        } else if ((vxkVar.b instanceof vxl) && this.h.b()) {
            vyx vyxVar = this.g;
            if (!((vxk) vyxVar).c) {
                vyx vyxVarG = vyxVar.g(true);
                this.g = vyxVarG;
                f((vxl) ((vxk) vyxVarG).b);
            }
        }
        vxj vxjVar = (vxj) vytVar;
        vxo vxoVar = vxjVar.a;
        long j = vxjVar.b;
        long j2 = ((vxf) vxjVar.c).a;
        yqw.M(j2 != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        final vxj vxjVar2 = new vxj(vxoVar, j, new vxf(j2 + 1), vxjVar.d, vxjVar.e, vxjVar.f);
        wvxVarF = wzg.f("DataSource fetchAndStoreData()", wwb.a, true);
        try {
            zyd zydVar = zxy.a;
            wvxVarF.a(zydVar);
            final vyc vycVar = new vyc(zydVar);
            wvxVarF.close();
            this.h.d(vycVar);
            vycVar.a.d(wyo.h(new Runnable() { // from class: vzj
                @Override // java.lang.Runnable
                public final void run() {
                    final vzq vzqVar = this.a;
                    final vyt vytVar2 = vxjVar2;
                    final vyc vycVar2 = vycVar;
                    vzqVar.b.execute(new Runnable() { // from class: vzl
                        @Override // java.lang.Runnable
                        public final void run() {
                            vzq vzqVar2 = vzqVar;
                            vyt vytVar3 = vytVar2;
                            vrg vrgVar = vzqVar2.h;
                            vyc vycVar3 = vycVar2;
                            if (vrgVar.c(vycVar3)) {
                                zyd zydVar2 = vycVar3.a;
                                uea.c();
                                try {
                                    try {
                                        zxn.o(zydVar2);
                                        Object obj = ((vya) ((vxj) vytVar3).a).a;
                                        if (vytVar3.h(vzqVar2.e)) {
                                            if (((vxk) vzqVar2.g).c && vzqVar2.i()) {
                                                yqw.M(((vxk) vzqVar2.g).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                                vzq.g((vxl) ((vxk) vzqVar2.g).b);
                                                vzqVar2.g = vzqVar2.g.g(false);
                                                return;
                                            }
                                            return;
                                        }
                                        vzqVar2.e(vytVar3);
                                        vyp vypVar = vzqVar2.a;
                                        zyd zydVar3 = zxy.a;
                                        vzp vzpVar = vzqVar2.k;
                                        vyl vylVar = (vyl) vypVar;
                                        vylVar.b(zydVar3, obj, vyo.a, yqt.i(vzpVar), vzqVar2.b);
                                    } catch (ExecutionException e) {
                                        vzqVar2.h(e.getCause());
                                    }
                                } catch (Throwable th) {
                                    vzqVar2.c.execute(new Runnable() { // from class: vzk
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            throw th;
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }), zwk.a);
        } finally {
        }
    }

    public final void e(vyt vytVar) {
        uea.c();
        vxj vxjVar = (vxj) vytVar;
        long j = ((vxg) vxjVar.d).a;
        yqw.M(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        vxg vxgVar = new vxg(j + 1);
        Instant instant = vxjVar.f;
        int i = vxjVar.e + 1;
        final vxj vxjVar2 = new vxj(vxjVar.a, vxjVar.b, vxjVar.c, vxgVar, i, instant);
        vxo vxoVar = vxjVar2.a;
        wvx wvxVarF = wzg.f("DataSource loadData()", wwb.a, true);
        try {
            zwc zwcVarA = vxoVar.a();
            wvxVarF.a(zwcVarA.g());
            final vyg vygVar = new vyg(zwcVarA);
            wvxVarF.close();
            this.i.d(vygVar);
            vygVar.b().d(wyo.h(new Runnable() { // from class: vzh
                @Override // java.lang.Runnable
                public final void run() {
                    final vzq vzqVar = this.a;
                    final vyt vytVar2 = vxjVar2;
                    final vyg vygVar2 = vygVar;
                    vzqVar.b.execute(new Runnable() { // from class: vzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            uea.c();
                            vzq vzqVar2 = vzqVar;
                            vyt vytVar3 = vytVar2;
                            yqw.M(!vytVar3.equals(vzqVar2.e), "The same LoadTask was processed twice.");
                            vyg vygVar3 = vygVar2;
                            yqw.L(vygVar3.b().isDone());
                            if (!vzqVar2.i.c(vygVar3) || vygVar3.b().isCancelled()) {
                                return;
                            }
                            try {
                                try {
                                    if (vytVar3.h(vzqVar2.e)) {
                                        vygVar3.c();
                                    } else if (!vygVar3.b().isCancelled()) {
                                        int iA = ((vxi) vzqVar2.f).c.a(((vxj) vytVar3).f, vygVar3.a(), !vytVar3.i()) - 1;
                                        if (iA == 0) {
                                            vygVar3.c();
                                            if (vytVar3.i()) {
                                                vye vyeVar = new vye();
                                                vyeVar.addSuppressed(wyy.b());
                                                vzqVar2.h(vyeVar);
                                            } else {
                                                vzqVar2.d(vytVar3);
                                            }
                                        } else if (iA != 1) {
                                            vzqVar2.b(vytVar3, vygVar3);
                                            if (vytVar3.i()) {
                                                vye vyeVar2 = new vye();
                                                vyeVar2.addSuppressed(wyy.b());
                                                vzqVar2.h(vyeVar2);
                                            } else {
                                                vzqVar2.d(vytVar3);
                                            }
                                        } else {
                                            vzqVar2.b(vytVar3, vygVar3);
                                            if (((vxk) vzqVar2.g).c && vzqVar2.i()) {
                                                yqw.M(((vxk) vzqVar2.g).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                                vzq.g((vxl) ((vxk) vzqVar2.g).b);
                                                vzqVar2.g = vzqVar2.g.g(false);
                                            }
                                        }
                                    }
                                    if (((vxk) vzqVar2.g).c && vzqVar2.i()) {
                                        yqw.M(((vxk) vzqVar2.g).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                        vzq.g((vxl) ((vxk) vzqVar2.g).b);
                                        vzqVar2.g = vzqVar2.g.g(false);
                                    }
                                } catch (vyy e) {
                                    vzqVar2.h(e.getCause());
                                }
                            } catch (Throwable th) {
                                vzqVar2.c.execute(new Runnable() { // from class: vzm
                                    @Override // java.lang.Runnable
                                    public final void run() throws Throwable {
                                        throw th;
                                    }
                                });
                            }
                        }
                    });
                }
            }), zwk.a);
        } finally {
        }
    }

    public final void h(Throwable th) {
        vxk vxkVar = (vxk) this.g;
        if (vxkVar.d.g()) {
            vyv vyvVar = vxkVar.b;
            if (vyvVar instanceof vyu) {
                vyu vyuVar = (vyu) vyvVar;
                wvx wvxVarF = wzg.f("RefreshCallbacks.onRefreshError", wwb.a, true);
                try {
                    vyuVar.a();
                    wvxVarF.close();
                } catch (Throwable th2) {
                    try {
                        wvxVarF.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            vyv vyvVar2 = vxkVar.b;
            wvx wvxVarF2 = wzg.f("SubscriptionCallbacks.onError", wwb.a, true);
            try {
                vqw vqwVarA = vqx.a();
                try {
                    vyvVar2.a(th);
                    vqwVarA.close();
                    wvxVarF2.close();
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    wvxVarF2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        if (((vxk) this.g).c && i()) {
            vxl vxlVar = (vxl) ((vxk) this.g).b;
            wvx wvxVarF3 = wzg.f("BackgroundCallbacks.onBackgroundFetchError", wwb.a, true);
            try {
                vxlVar.c();
                wvxVarF3.close();
                this.g = this.g.g(false);
            } catch (Throwable th6) {
                try {
                    wvxVarF3.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final boolean i() {
        if (!(((vxk) this.g).b instanceof vxl) || !this.h.b() || !this.i.b()) {
            return false;
        }
        yqw.L(((vxk) this.g).c);
        return true;
    }
}

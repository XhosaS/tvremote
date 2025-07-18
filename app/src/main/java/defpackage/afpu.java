package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afpu implements afvc {
    public final afkc b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public afvb f;
    private final Executor j;
    private final afgr i = afgr.a(afgr.b(afpu.class), null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile afpt h = new afpt(null, null);

    public afpu(Executor executor, afkc afkcVar) {
        this.j = executor;
        this.b = afkcVar;
    }

    final void a(afhk afhkVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new afpt(afhkVar, this.h.b);
            if (afhkVar != null && e()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    afps afpsVar = (afps) arrayList.get(i);
                    afhh afhhVar = afpsVar.a;
                    afhg afhgVarA = afhkVar.a(afhhVar);
                    afem afemVar = ((afwj) afhhVar).a;
                    if (afemVar.i() && afhgVarA.c()) {
                        afpsVar.d = afhgVarA.c;
                    }
                    afoh afohVarC = afrq.c(afhgVarA, afemVar.i());
                    if (afohVarC != null) {
                        Executor executor = this.j;
                        Executor executor2 = afemVar.c;
                        affp affpVar = afpsVar.b;
                        affp affpVarA = affpVar.a();
                        try {
                            afoe afoeVarB = afohVarC.b(((afwj) afhhVar).c, ((afwj) afhhVar).b, afemVar, afpsVar.c);
                            affpVar.f(affpVarA);
                            Runnable runnableG = afpsVar.g(afoeVarB);
                            if (runnableG != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(runnableG);
                            }
                            arrayList2.add(afpsVar);
                        } catch (Throwable th) {
                            afpsVar.b.f(affpVarA);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (e()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.g.remove((afps) it.next());
                        }
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!e()) {
                            afkc afkcVar = this.b;
                            afkcVar.c(this.d);
                            if (this.h.b != null && (runnable = this.e) != null) {
                                afkcVar.c(runnable);
                                this.e = null;
                            }
                        }
                        this.b.b();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r3 = new defpackage.afps(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r0.a.i() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r4.c() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r3.d = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r2.g.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r4 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [afoe] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afqz] */
    /* JADX WARN: Type inference failed for: r3v5, types: [afoe] */
    /* JADX WARN: Type inference failed for: r3v7, types: [afps, java.lang.Object] */
    @Override // defpackage.afoh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.afoe b(defpackage.afil r3, defpackage.afih r4, defpackage.afem r5, defpackage.afev[] r6) {
        /*
            r2 = this;
            afwj r0 = new afwj     // Catch: java.lang.Throwable -> L86
            afvp r1 = new afvp     // Catch: java.lang.Throwable -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L86
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L86
            afpt r3 = r2.h     // Catch: java.lang.Throwable -> L86
        Lc:
            io.grpc.Status r4 = r3.b     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L18
            afqz r3 = new afqz     // Catch: java.lang.Throwable -> L86
            afof r5 = defpackage.afof.PROCESSED     // Catch: java.lang.Throwable -> L86
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L77
        L18:
            afhk r4 = r3.a     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L35
            afhg r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L86
            afem r5 = r0.a     // Catch: java.lang.Throwable -> L86
            boolean r1 = r5.i()     // Catch: java.lang.Throwable -> L86
            afoh r1 = defpackage.afrq.c(r4, r1)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L36
            afil r3 = r0.c     // Catch: java.lang.Throwable -> L86
            afih r4 = r0.b     // Catch: java.lang.Throwable -> L86
            afoe r3 = r1.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L86
            goto L77
        L35:
            r4 = 0
        L36:
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L86
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L86
            afpt r1 = r2.h     // Catch: java.lang.Throwable -> L83
            if (r3 != r1) goto L80
            afps r3 = new afps     // Catch: java.lang.Throwable -> L83
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L83
            afem r0 = r0.a     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L56
            if (r4 == 0) goto L56
            boolean r0 = r4.c()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L56
            io.grpc.Status r4 = r4.c     // Catch: java.lang.Throwable -> L83
            r3.d = r4     // Catch: java.lang.Throwable -> L83
        L56:
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L83
            r4.add(r3)     // Catch: java.lang.Throwable -> L83
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L83
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L7d
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            r0 = 1
            if (r4 != r0) goto L6d
            afkc r4 = r2.b     // Catch: java.lang.Throwable -> L83
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L83
            r4.c(r0)     // Catch: java.lang.Throwable -> L83
        L6d:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L83
            r0 = 0
        L6f:
            if (r0 >= r4) goto L76
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L83
            int r0 = r0 + 1
            goto L6f
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
        L77:
            afkc r4 = r2.b
            r4.b()
            return r3
        L7d:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L83
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            r3 = r1
            goto Lc
        L83:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            throw r3     // Catch: java.lang.Throwable -> L86
        L86:
            r3 = move-exception
            afkc r4 = r2.b
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpu.b(afil, afih, afem, afev[]):afoe");
    }

    @Override // defpackage.afgx
    public final afgr c() {
        return this.i;
    }

    @Override // defpackage.afvc
    public final Runnable d(afvb afvbVar) {
        throw null;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.afvc
    public final void f(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.b != null) {
                return;
            }
            this.h = new afpt(this.h.a, status);
            afkc afkcVar = this.b;
            afkcVar.c(new afpr(this));
            if (!e() && (runnable = this.e) != null) {
                afkcVar.c(runnable);
                this.e = null;
            }
            this.b.b();
        }
    }

    @Override // defpackage.afvc
    public final void g(Status status) {
        throw null;
    }

    @Override // defpackage.afoh
    public final void i(afta aftaVar, Executor executor) {
        throw null;
    }
}

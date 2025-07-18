package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkp implements Comparable {
    public static final rko a = new rko();
    public final rfr b;
    public final String c;
    public final String d;
    public final boolean f;
    public final rmw i;
    private final boolean k;
    private final Set l;
    public final boolean e = false;
    public final boolean g = false;
    private volatile rmv j = null;
    public final rlg h = new rlg();

    public rkp(rfr rfrVar, String str, String str2, boolean z, boolean z2, Set set) {
        this.b = rfrVar;
        this.c = str;
        this.d = str2;
        this.f = z;
        this.k = z2;
        this.l = set;
        this.i = new rmw(rfrVar, str, str2, z);
    }

    public final rmv a() {
        rmv rmvVarA;
        rmv rmvVar = this.j;
        if (rmvVar != null) {
            return rmvVar;
        }
        synchronized (this) {
            rmvVarA = this.j;
            if (rmvVarA == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    rmvVarA = this.i.a();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    rmu rmuVar = rmvVarA.f;
                    int i = rmuVar.c - 2;
                    if (i != 15 && i != 16) {
                        rfr rfrVar = this.b;
                        rfrVar.f.e();
                        rmw rmwVar = this.i;
                        if (rmwVar.e() || !rmvVarA.b.isEmpty()) {
                            rfrVar.e().execute(new Runnable() { // from class: rka
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b();
                                }
                            });
                            if (this.k) {
                                ((rjw) rfrVar.c).a(rmvVarA.c, this.l, this.d, this.c, true, false);
                            } else {
                                ((rjw) rfrVar.c).a(rmvVarA.c, this.l, "", this.c, false, false);
                            }
                            if (!this.d.equals("")) {
                                rfrVar.e().execute(new Runnable() { // from class: rkb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final rkp rkpVar = this.a;
                                        rfr rfrVar2 = rkpVar.b;
                                        final zyd zydVarB = rlo.b(rfrVar2, rkpVar.c, rkpVar.d);
                                        zydVarB.d(new Runnable() { // from class: rkh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                try {
                                                    zxn.o(zydVarB);
                                                } catch (Exception e) {
                                                    Log.w("FlagStore", "Failed to store account on flag read for: " + rkpVar.c + " which may lead to stale flags.", e);
                                                }
                                            }
                                        }, rfrVar2.e());
                                    }
                                });
                            }
                            if (rmwVar.e()) {
                                rfrVar.e().execute(new Runnable() { // from class: rkc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.b.h.a(aags.FILE, new rlv() { // from class: rkg
                                            @Override // defpackage.rlv
                                            public final boolean a(List list) {
                                                rko rkoVar = rkp.a;
                                                if (list == null || list.isEmpty()) {
                                                    return false;
                                                }
                                                Iterator it = list.iterator();
                                                boolean z = false;
                                                while (it.hasNext()) {
                                                    rkp[] rkpVarArrC = rkoVar.c((String) it.next());
                                                    if (rkpVarArrC != null) {
                                                        int i2 = 0;
                                                        while (i2 < rkpVarArrC.length) {
                                                            boolean z2 = rkpVarArrC[i2].g;
                                                            i2++;
                                                            z = true;
                                                        }
                                                    }
                                                }
                                                return z;
                                            }
                                        });
                                    }
                                });
                            }
                        } else {
                            rfrVar.e().execute(new Runnable() { // from class: rjz
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.d();
                                }
                            });
                            rmvVarA = new rmv(rmy.a, rmuVar);
                        }
                    }
                    this.j = rmvVarA;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            }
        }
        return rmvVarA;
    }

    public final zyd b() {
        if (this.f) {
            rfr rfrVar = this.b;
            if (mhv.g(rfrVar.d)) {
                return a.a(rfrVar);
            }
        }
        return c();
    }

    public final zyd c() {
        zyd zydVarA;
        rgr rgrVar;
        rmv rmvVarA = a();
        String str = rmvVarA.b;
        rfr rfrVar = this.b;
        rml rmlVarC = rfrVar.f.c(this.f);
        if (rmlVarC.e) {
            if (yqv.c(str) && !rmlVarC.d) {
                return zxy.a;
            }
            rgs rgsVar = rgs.a;
            rgo rgoVar = new rgo();
            rmu rmuVar = rmvVarA.f;
            if (rmuVar.a) {
                rgrVar = rgr.a;
            } else {
                rgr rgrVar2 = rgr.a;
                rgp rgpVar = new rgp();
                int i = rmuVar.b;
                if ((rgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rgpVar.y();
                }
                rgr rgrVar3 = (rgr) rgpVar.b;
                rgrVar3.c = i - 2;
                rgrVar3.b |= 1;
                int i2 = rmuVar.c;
                if ((rgpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rgpVar.y();
                }
                rgr rgrVar4 = (rgr) rgpVar.b;
                rgrVar4.d = rgq.a(i2);
                rgrVar4.b |= 2;
                rgrVar = (rgr) rgpVar.v();
            }
            if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rgoVar.y();
            }
            rgs rgsVar2 = (rgs) rgoVar.b;
            rgrVar.getClass();
            rgsVar2.d = rgrVar;
            rgsVar2.b |= 2;
            if (!yqv.c(str)) {
                if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rgoVar.y();
                }
                rgs rgsVar3 = (rgs) rgoVar.b;
                str.getClass();
                rgsVar3.b |= 1;
                rgsVar3.c = str;
            }
            if (rmlVarC.d) {
                String str2 = this.c;
                if ((rgoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rgoVar.y();
                }
                rgs rgsVar4 = (rgs) rgoVar.b;
                str2.getClass();
                rgsVar4.b |= 4;
                rgsVar4.e = str2;
            }
            zydVarA = rfrVar.b().b((rgs) rgoVar.v());
        } else {
            if (yqv.c(str)) {
                return zxy.a;
            }
            zydVarA = rfrVar.b().a(str);
        }
        return zud.h(zydVarA, rgz.class, new zvi() { // from class: rkd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                int i3 = ((rgz) obj).a;
                if (i3 == 29501 || i3 == 29537 || i3 == 29538 || i3 == 29539 || i3 == 29540 || i3 == 29541 || i3 == 29542 || i3 == 29543 || i3 == 29544) {
                    rkp rkpVar = this.a;
                    if (!rkpVar.i.e()) {
                        rkpVar.d();
                    }
                }
                return zxy.a;
            }
        }, rfrVar.e());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.d.compareTo((String) obj);
    }

    public final void d() {
        final rmw rmwVar = this.i;
        final zyd zydVarC = rmwVar.c(this.d);
        zvi zviVar = new zvi() { // from class: rke
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                return rmwVar.d((rmy) obj);
            }
        };
        rfr rfrVar = this.b;
        zuz.h(zydVarC, zviVar, rfrVar.e()).d(new Runnable() { // from class: rkf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e(zydVarC);
            }
        }, rfrVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: CancellationException -> 0x0046, CancellationException | ExecutionException -> 0x0048, TryCatch #3 {CancellationException | ExecutionException -> 0x0048, blocks: (B:2:0x0000, B:4:0x0016, B:21:0x003e, B:14:0x0023, B:15:0x0024, B:17:0x002e, B:19:0x003a), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void e(defpackage.zyd r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.zxn.o(r4)     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmy r4 = (defpackage.rmy) r4     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmu r0 = new rmu     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmv r1 = new rmv     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmv r4 = r3.j     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            if (r4 != 0) goto L24
            monitor-enter(r3)     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmv r4 = r3.j     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L1f
            r3.j = r1     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L3e
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r4     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
        L24:
            yyr r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            yyr r0 = r1.e     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            boolean r4 = defpackage.zbk.e(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            if (r4 != 0) goto L3e
            rfr r4 = r3.b     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            yrp r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            java.lang.Object r4 = r4.eV()     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            rmj r4 = (defpackage.rmj) r4     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            if (r4 == 0) goto L6b
            r4.b()     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            return
        L3e:
            rlg r4 = r3.h     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            java.util.concurrent.atomic.AtomicInteger r4 = r4.a     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            r4.incrementAndGet()     // Catch: java.util.concurrent.CancellationException -> L46 java.util.concurrent.ExecutionException -> L48
            return
        L46:
            r4 = move-exception
            goto L49
        L48:
            r4 = move-exception
        L49:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L6b
            java.lang.String r0 = r3.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to update local snapshot for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", may result in stale flags."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FlagStore"
            android.util.Log.w(r1, r0, r4)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkp.e(zyd):void");
    }
}

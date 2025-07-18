package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.videos.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbi {
    public final Object a;
    public final Object b;

    public rbi(Activity activity) {
        this.b = activity;
        this.a = new eij(activity, 17);
    }

    public static rbi k(long j) {
        return new rbi(Long.TYPE, Long.valueOf(j), null);
    }

    public static rbi l(Context context) {
        rwv.c(context);
        return new rbi(context);
    }

    public static rbi m(iea ieaVar, idw idwVar, idf idfVar, ids idsVar, Executor executor, lio lioVar) {
        krz krzVar = new krz(ieg.a);
        krzVar.a = new ids[]{ieaVar, idsVar};
        krzVar.b = executor;
        krzVar.d(new lxf(ieaVar, idwVar, idfVar, lioVar, 9));
        iea ieaVarA = krzVar.a();
        iff iffVar = new iff();
        iffVar.f(R.layout.details_trailers);
        iffVar.c = new mlw(9);
        iffVar.d = new mmg(6);
        iffVar.g(ksd.a());
        iffVar.d();
        return new rbi(ieaVarA, iffVar.c());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qhm] */
    private final void n(qen qenVar) {
        qhs qhsVarN = ((yyh) this.b).n(vie.TARGET_REGISTERED);
        qhsVarN.b(qenVar);
        this.a.a(qhsVarN);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qhm] */
    private final void o(vhq vhqVar, qen qenVar, int i, qdi qdiVar) {
        qhs qhsVarM = ((yyh) this.b).m(vhqVar);
        qhsVarM.b(qenVar);
        qhsVarM.w = i;
        String simpleName = qdiVar.a().getClass().getSimpleName();
        simpleName.getClass();
        qhsVarM.p = simpleName;
        this.a.a(qhsVarM);
    }

    private static final int p(qdi qdiVar) {
        int i = 2;
        if (!(qdiVar instanceof qmj)) {
            if (qdiVar instanceof qmh) {
                return 2;
            }
            i = 4;
            if (!(qdiVar instanceof qmp)) {
                if (qdiVar instanceof qmn) {
                    return 4;
                }
                if (qdiVar instanceof qkc) {
                    return 3;
                }
                if (qdiVar instanceof qlo) {
                    return ((qlo) qdiVar).l() ? 6 : 5;
                }
                return 1;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, rjq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.qzh
            if (r0 == 0) goto L13
            r0 = r11
            qzh r0 = (defpackage.qzh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            qzh r0 = new qzh
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r11)
            goto L40
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L2f:
            defpackage.ybn.f(r11)
            java.lang.Object r11 = r10.b
            uhp r11 = r11.a()
            r0.b = r3
            java.lang.Object r11 = defpackage.wae.U(r11, r0)
            if (r11 == r1) goto L8a
        L40:
            r11.getClass()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yfm.z(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L54:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r11.next()
            rjn r1 = (defpackage.rjn) r1
            vrn r2 = defpackage.vrn.a
            vtw r2 = r2.m()
            r2.getClass()
            java.lang.String r6 = r1.a
            r6.getClass()
            defpackage.vxr.ag(r6, r2)
            java.lang.String r5 = r1.c
            vrn r4 = defpackage.vxr.af(r2)
            r6.getClass()
            java.lang.String r7 = r1.d
            java.lang.String r8 = r1.e
            boolean r9 = r1.g
            vou r3 = new vou
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.add(r3)
            goto L54
        L89:
            return r0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbi.a(yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, xbw] */
    public final qnr b(qel qelVar) {
        qelVar.getClass();
        if (qelVar.a()) {
            Object objB = this.b.b();
            objB.getClass();
            return (qnr) objB;
        }
        if (!qelVar.b()) {
            throw new IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
        }
        Object objB2 = this.a.b();
        objB2.getClass();
        return (qnr) objB2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, yil] */
    public final Object c(Map map, qkb qkbVar, qel qelVar, yih yihVar) {
        return ykr.l(this.b, new qbu(map, qkbVar, this, qelVar, (yih) null, 2), yihVar);
    }

    public final void d(qdl qdlVar, Set set) {
        qdlVar.getClass();
        if (!(qdlVar instanceof qdn)) {
            if (!(qdlVar instanceof qdi)) {
                throw new yfu();
            }
            qdi qdiVar = (qdi) qdlVar;
            int iP = p(qdiVar);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                o(vhq.FAILED_TO_REGISTER, (qen) it.next(), iP, qdiVar);
            }
            return;
        }
        for (Map.Entry entry : ((Map) ((qdn) qdlVar).a).entrySet()) {
            if (entry.getValue() instanceof qdn) {
                n((qen) entry.getKey());
            } else {
                Object value = entry.getValue();
                value.getClass();
                qdi qdiVar2 = (qdi) value;
                o(vhq.FAILED_TO_REGISTER, (qen) entry.getKey(), p(qdiVar2), qdiVar2);
            }
        }
    }

    public final void e(Map map, qdl qdlVar) {
        map.getClass();
        qdlVar.getClass();
        if (qdlVar instanceof qdn) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                n((qen) it.next());
            }
        } else {
            if (!(qdlVar instanceof qdi)) {
                throw new yfu();
            }
            qdi qdiVar = (qdi) qdlVar;
            int iP = p(qdiVar);
            for (Map.Entry entry : map.entrySet()) {
                qpv qpvVar = (qpv) entry.getKey();
                qen qenVar = (qen) entry.getValue();
                vhq vhqVar = qdiVar instanceof qmi ? yks.e(((qmi) qdiVar).l(), qpvVar) ? vhq.FAILED_TO_REGISTER : vhq.FAILED_TO_REGISTER_OTHER_ACCOUNT : (!(qdiVar instanceof qmq) || ((qmq) qdiVar).a.contains(qpvVar)) ? vhq.FAILED_TO_REGISTER : null;
                if (vhqVar != null) {
                    o(vhqVar, qenVar, iP, qdiVar);
                } else {
                    n(qenVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qdx] */
    public final synchronized Object f(qen qenVar) {
        Long lValueOf;
        if (qenVar != null) {
            try {
                lValueOf = Long.valueOf(qenVar.a);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            lValueOf = null;
        }
        ?? r1 = this.a;
        Object obj = r1.get(lValueOf);
        if (obj != null) {
            return obj;
        }
        Object objA = this.b.a(qenVar);
        r1.put(lValueOf, objA);
        return objA;
    }

    public final synchronized Object g(String str) {
        return h(qtl.t(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qdw] */
    public final synchronized Object h(qpv qpvVar) {
        ?? r0 = this.a;
        Object obj = r0.get(qpvVar);
        if (obj != null) {
            return obj;
        }
        Object objA = this.b.a(qpvVar);
        r0.put(qpvVar, objA);
        return objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if ((r2 - ((java.util.concurrent.atomic.AtomicLong) r0).get()) > java.util.concurrent.TimeUnit.MINUTES.toMillis(30)) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, ttm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void i(int r20, int r21, long r22, long r24, long r26) {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L87
            xed r0 = defpackage.xed.a     // Catch: java.lang.Throwable -> L87
            xee r0 = r0.get()     // Catch: java.lang.Throwable -> L87
            double r4 = r0.a()     // Catch: java.lang.Throwable -> L87
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L87
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L87
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L20
            goto L85
        L20:
            java.lang.Object r0 = r1.b     // Catch: java.lang.Throwable -> L87
            r4 = r0
            java.util.concurrent.atomic.AtomicLong r4 = (java.util.concurrent.atomic.AtomicLong) r4     // Catch: java.lang.Throwable -> L87
            long r4 = r4.get()     // Catch: java.lang.Throwable -> L87
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L30
            goto L44
        L30:
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch: java.lang.Throwable -> L87
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L87
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L87
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L87
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L85
        L44:
            java.lang.Object r0 = r1.a     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L87
            oce r0 = (defpackage.oce) r0     // Catch: java.lang.Throwable -> L87
            ocd r4 = new ocd     // Catch: java.lang.Throwable -> L87
            r5 = 1
            obv[] r6 = new defpackage.obv[r5]     // Catch: java.lang.Throwable -> L87
            obv r7 = new obv     // Catch: java.lang.Throwable -> L87
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L87
            long r8 = r8 - r26
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L87
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r9 = r21
            r11 = r22
            r13 = r24
            r18 = r8
            r8 = r20
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L87
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L87
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L87
            r4.<init>(r8, r6)     // Catch: java.lang.Throwable -> L87
            onz r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L87
            npw r4 = new npw     // Catch: java.lang.Throwable -> L87
            r4.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L87
            r0.p(r4)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r19)
            return
        L85:
            monitor-exit(r19)
            return
        L87:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L87
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbi.i(int, int, long, long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [iea, java.lang.Object] */
    public final void j(ntp ntpVar) {
        ntpVar.c(this.a, (ifc) this.b);
    }

    public rbi(cb cbVar, cb cbVar2) {
        this.b = cbVar;
        this.a = cbVar2;
    }

    private rbi(iea ieaVar, ifc ifcVar) {
        this.a = ieaVar;
        this.b = ifcVar;
    }

    public rbi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public rbi(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public rbi(qyb qybVar) {
        this.a = qybVar;
        this.b = new zft(this, null);
    }

    private rbi(Context context) {
        this.b = new AtomicLong(-1L);
        this.a = sij.l(new evk(context, new ocf("auth:gau"), 4, null));
    }

    public rbi(qdw qdwVar) {
        this.a = new HashMap();
        this.b = qdwVar;
    }

    public rbi(rjq rjqVar) {
        this.b = rjqVar;
        this.a = new yss(new kim(this, (yih) null, 6));
    }

    public rbi(xbw xbwVar, xbw xbwVar2) {
        xbwVar.getClass();
        xbwVar2.getClass();
        this.a = xbwVar;
        this.b = xbwVar2;
    }

    public rbi(qdx qdxVar) {
        this.b = qdxVar;
        this.a = new HashMap();
    }

    public rbi(yfo yfoVar, yfo yfoVar2) {
        yfoVar.getClass();
        this.b = yfoVar;
        yfoVar2.getClass();
        this.a = yfoVar2;
    }
}

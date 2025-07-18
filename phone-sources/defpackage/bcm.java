package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcm {
    public static final void A() {
        boolean z;
        synchronized (bjb.b) {
            kk kkVar = bjb.h.g;
            z = false;
            if (kkVar != null) {
                if (kkVar.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            bjb.r();
        }
    }

    public static final bin B(yjv yjvVar, yjv yjvVar2) {
        bin binVarA;
        bit bitVarB = bjb.b();
        bin binVar = bitVarB instanceof bin ? (bin) bitVarB : null;
        if (binVar == null || (binVarA = binVar.a(yjvVar, yjvVar2)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return binVarA;
    }

    public static final bit C(yjv yjvVar) {
        return bjb.b().b(yjvVar);
    }

    public static /* synthetic */ void E() {
        r();
        throw new yfs();
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final bby c(yil yilVar) {
        bby bbyVar = (bby) yilVar.get(bby.b);
        if (bbyVar != null) {
            return bbyVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object d(yjv yjvVar, yih yihVar) {
        return c(yihVar.getContext()).a(new bil(yjvVar, 1), yihVar);
    }

    public static final Object e(yjv yjvVar, yih yihVar) {
        return c(yihVar.getContext()).a(yjvVar, yihVar);
    }

    public static final void f() {
        yks.e(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public static final bhu g(bcq[] bcqVarArr, bhu bhuVar, bhu bhuVar2) {
        bht bhtVar = new bht(bhu.d);
        for (bcq bcqVar : bcqVarArr) {
            bbb bbbVar = bcqVar.a;
            if (bcqVar.f || !bhuVar.containsKey(bbbVar)) {
                ?? r4 = bhuVar2.get(bbbVar);
                bcqVar.getClass();
                bhtVar.put(bbbVar, ((bcp) bbbVar).b(bcqVar, r4));
            }
        }
        return bhtVar.b();
    }

    public static final Object h(bhu bhuVar, bbb bbbVar) {
        bbbVar.getClass();
        Object objA = bhuVar.get(bbbVar);
        if (objA == null) {
            objA = bbbVar.a();
        }
        return ((bec) objA).a(bhuVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(defpackage.bcq r10, defpackage.yjz r11, defpackage.bao r12, int r13) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            bao r12 = r12.d(r0)
            r0 = r12
            bas r0 = (defpackage.bas) r0
            bhu r1 = r0.ai()
            java.lang.Object r2 = defpackage.bau.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ad(r3, r2)
            java.lang.Object r2 = r0.T()
            java.lang.Object r3 = defpackage.ban.a
            boolean r3 = defpackage.yks.e(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            bec r2 = (defpackage.bec) r2
        L29:
            bbb r3 = r10.a
            bec r5 = r3.b(r10, r2)
            boolean r2 = defpackage.yks.e(r5, r2)
            if (r2 != 0) goto L38
            r0.ae(r5)
        L38:
            boolean r6 = r0.w
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L50
            boolean r2 = r10.f
            if (r2 != 0) goto L48
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4c
        L48:
            bhu r1 = r1.g(r3, r5)
        L4c:
            r0.s = r8
        L4e:
            r8 = r7
            goto L88
        L50:
            bdf r6 = r0.p
            int r9 = r6.f
            java.lang.Object r6 = r6.j(r9)
            r6.getClass()
            bhu r6 = (defpackage.bhu) r6
            boolean r9 = r0.K()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r10.f
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r0.j
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r0.j
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r6
            goto L82
        L7e:
            bhu r1 = r1.g(r3, r5)
        L82:
            boolean r2 = r0.k
            if (r2 != 0) goto L88
            if (r6 == r1) goto L4e
        L88:
            if (r8 == 0) goto L91
            boolean r2 = r0.w
            if (r2 != 0) goto L91
            r0.ak(r1)
        L91:
            ira r2 = r0.A
            boolean r3 = r0.j
            int r3 = defpackage.bau.a(r3)
            r2.g(r3)
            r0.j = r8
            r0.y = r1
            java.lang.Object r3 = defpackage.bau.c
            r5 = 202(0xca, float:2.83E-43)
            r0.ac(r5, r3, r7, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.a(r12, r1)
            r0.aa()
            r0.aa()
            int r1 = r2.e()
            boolean r1 = defpackage.bau.l(r1)
            r0.j = r1
            r0.y = r4
            bcr r12 = r12.M()
            if (r12 == 0) goto Ld3
            qt r0 = new qt
            r1 = 20
            r0.<init>(r10, r11, r13, r1)
            r12.d = r0
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcm.i(bcq, yjz, bao, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(defpackage.bcq[] r8, defpackage.yjz r9, defpackage.bao r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            bao r10 = r10.d(r0)
            r0 = r10
            bas r0 = (defpackage.bas) r0
            bhu r1 = r0.ai()
            java.lang.Object r2 = defpackage.bau.b
            r3 = 201(0xc9, float:2.82E-43)
            r0.ad(r3, r2)
            boolean r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L29
            bhu r2 = defpackage.bhu.d
            bhu r2 = g(r8, r1, r2)
            bhu r1 = r0.aj(r1, r2)
            r0.s = r3
        L27:
            r3 = r4
            goto L67
        L29:
            bdf r2 = r0.p
            java.lang.Object r2 = r2.k(r4)
            r2.getClass()
            bhu r2 = (defpackage.bhu) r2
            bdf r5 = r0.p
            java.lang.Object r5 = r5.k(r3)
            r5.getClass()
            bhu r5 = (defpackage.bhu) r5
            bhu r6 = g(r8, r1, r5)
            boolean r7 = r0.K()
            if (r7 == 0) goto L59
            boolean r7 = r0.k
            if (r7 != 0) goto L59
            boolean r5 = defpackage.yks.e(r5, r6)
            if (r5 != 0) goto L54
            goto L59
        L54:
            r0.ab()
            r1 = r2
            goto L27
        L59:
            bhu r1 = r0.aj(r1, r6)
            boolean r5 = r0.k
            if (r5 != 0) goto L67
            boolean r2 = defpackage.yks.e(r1, r2)
            if (r2 != 0) goto L27
        L67:
            if (r3 == 0) goto L70
            boolean r2 = r0.w
            if (r2 != 0) goto L70
            r0.ak(r1)
        L70:
            ira r2 = r0.A
            boolean r5 = r0.j
            int r5 = defpackage.bau.a(r5)
            r2.g(r5)
            r0.j = r3
            r0.y = r1
            java.lang.Object r3 = defpackage.bau.c
            r5 = 202(0xca, float:2.83E-43)
            r0.ac(r5, r3, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.a(r10, r1)
            r0.aa()
            r0.aa()
            int r1 = r2.e()
            boolean r1 = defpackage.bau.l(r1)
            r0.j = r1
            r1 = 0
            r0.y = r1
            bcr r10 = r10.M()
            if (r10 == 0) goto Lb6
            bho r0 = new bho
            r4 = 1
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcm.j(bcq[], yjz, bao, int):void");
    }

    public static final boolean k(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final void l(Throwable th, yjk yjkVar) {
        Collection collectionAC;
        Object objInvoke;
        th.getClass();
        bjw bjwVar = null;
        if (yjf.ak()) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            collectionAC = yfm.aC(suppressed);
        } else {
            Method method = yjd.b;
            collectionAC = (method == null || (objInvoke = method.invoke(th, null)) == null) ? yhb.a : yfm.aC((Throwable[]) objInvoke);
        }
        if (!collectionAC.isEmpty()) {
            Iterator it = collectionAC.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof bjw) {
                    return;
                }
            }
        }
        try {
            List list = (List) yjkVar.a();
            if (!list.isEmpty()) {
                bjwVar = new bjw(list);
            }
        } catch (Throwable th2) {
            bjwVar = th2;
        }
        if (bjwVar != null) {
            ybn.h(th, bjwVar);
        }
    }

    public static final Integer m(bdf bdfVar, baw bawVar, int i, int i2) {
        Integer numM;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iC = bdfVar.c(i) + i;
            if (bdfVar.y(i) && bdfVar.b(i) == 206 && yks.e(bdfVar.m(i), bau.e)) {
                Object objL = bdfVar.l(i, 0);
                baq baqVar = objL instanceof baq ? (baq) objL : null;
                if (baqVar != null && yks.e(baqVar.a, bawVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (bdfVar.w(i) && (numM = m(bdfVar, bawVar, i + 1, iC)) != null) {
                return Integer.valueOf(numM.intValue());
            }
            i = iC;
        }
    }

    public static final List n(bdf bdfVar, int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        int iE = bdfVar.e(i);
        bac bacVarG = bdfVar.g(i);
        while (i >= 0) {
            q(bdfVar.a.h(i), obj);
            if (iE >= 0) {
                bac bacVar = bacVarG;
                bacVarG = bdfVar.g(iE);
                i = iE;
                iE = bdfVar.e(iE);
                obj = bacVar;
            } else {
                i = iE;
                obj = bacVarG;
            }
        }
        return arrayList;
    }

    public static final List p(bdj bdjVar, int i, Integer num) {
        int iK;
        kc kcVar;
        if (bdjVar.r || bdjVar.f() == 0) {
            return yhb.a;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            iK = num.intValue();
        } else {
            iK = bdjVar.q;
            if (iK < 0) {
                iK = bdjVar.k(i);
            }
        }
        int iN = bdjVar.h - bdjVar.n(i);
        jc jcVar = bdjVar.t;
        int i2 = 0;
        if (jcVar != null && (kcVar = (kc) jcVar.a(i)) != null) {
            i2 = kcVar.b;
        }
        Object objValueOf = Integer.valueOf(iN + i2);
        while (i >= 0) {
            q(bdjVar.Y(i), objValueOf);
            objValueOf = bdjVar.o(i);
            if (iK >= 0) {
                int i3 = iK;
                iK = bdjVar.k(iK);
                i = i3;
            } else {
                i = iK;
            }
        }
        return arrayList;
    }

    public static final void q(bcm bcmVar, Object obj) {
        if (bcmVar == null) {
            return;
        }
        obj.getClass();
        throw null;
    }

    public static final void r() {
        throw new UnsupportedOperationException();
    }

    public static final int s(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final bit t() {
        return (bit) bjb.i.h();
    }

    public static final bit u(bit bitVar) {
        if (bitVar instanceof bjp) {
            bjp bjpVar = (bjp) bitVar;
            if (bjpVar.n == a.bL()) {
                bjpVar.l = null;
                return bitVar;
            }
        }
        if (bitVar instanceof bjq) {
            bjq bjqVar = (bjq) bitVar;
            if (bjqVar.b == a.bL()) {
                bjqVar.a = null;
                return bitVar;
            }
        }
        bit bitVarA = bjb.a(bitVar, null, false);
        bitVarA.w();
        return bitVarA;
    }

    public static final void v() {
        bjb.b().e();
    }

    public static final Object w(yjv yjvVar, yjk yjkVar) {
        bit bjpVar;
        if (yjvVar == null) {
            return yjkVar.a();
        }
        bit bitVar = (bit) bjb.i.h();
        if (bitVar instanceof bjp) {
            bjp bjpVar2 = (bjp) bitVar;
            if (bjpVar2.n == a.bL()) {
                yjv yjvVar2 = bjpVar2.l;
                yjv yjvVar3 = bjpVar2.m;
                try {
                    bjpVar2.l = bjb.p(yjvVar, yjvVar2, true);
                    bjpVar2.m = bjb.q(null, yjvVar3);
                    return yjkVar.a();
                } finally {
                    bjpVar2.l = yjvVar2;
                    bjpVar2.m = yjvVar3;
                }
            }
        }
        if (bitVar == null || (bitVar instanceof bin)) {
            bjpVar = new bjp(bitVar instanceof bin ? (bin) bitVar : null, yjvVar, null, true, false);
        } else {
            bjpVar = bitVar.b(yjvVar);
        }
        try {
            bit bitVarW = bjpVar.w();
            try {
                Object objA = yjkVar.a();
                bit.E(bitVarW);
                return objA;
            } catch (Throwable th) {
                bit.E(bitVarW);
                throw th;
            }
        } finally {
            bjpVar.d();
        }
    }

    public static final biq x(yjz yjzVar) {
        bjb.m(bjb.a);
        synchronized (bjb.b) {
            bjb.f = yfm.ag(bjb.f, yjzVar);
        }
        return new bis(yjzVar, 1);
    }

    public static final biq y(yjv yjvVar) {
        synchronized (bjb.b) {
            bjb.g = yfm.ag(bjb.g, yjvVar);
        }
        bjb.r();
        return new bis(yjvVar, 0);
    }

    public static final void z(bit bitVar, bit bitVar2, yjv yjvVar) {
        if (bitVar != bitVar2) {
            bit.E(bitVar);
            bitVar2.d();
        } else if (bitVar instanceof bjp) {
            ((bjp) bitVar).l = yjvVar;
        } else if (bitVar instanceof bjq) {
            ((bjq) bitVar).a = yjvVar;
        } else {
            Objects.toString(bitVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(bitVar)));
        }
    }
}

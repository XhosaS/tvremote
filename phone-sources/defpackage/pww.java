package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pww implements pwp {
    private static final Map a = yfm.h(new yfw(vht.DISMISSED_REMOTE, vhq.DROPPED_BY_STATE), new yfw(vht.EXPIRED, vhq.DROPPED_EXPIRED));
    private static final Map b = yfm.h(new yfw(vht.DISMISSED_REMOTE, vie.DISMISSED_REMOTE), new yfw(vht.EXPIRED, vie.EXPIRED));
    private final qbr c;
    private final xbw d;
    private final xbw e;
    private final pvg f;
    private final yyk g;
    private final rbi h;

    public pww(qbr qbrVar, xbw xbwVar, xbw xbwVar2, pvg pvgVar, rbi rbiVar, osk oskVar, yyk yykVar) {
        qbrVar.getClass();
        xbwVar.getClass();
        xbwVar2.getClass();
        pvgVar.getClass();
        rbiVar.getClass();
        oskVar.getClass();
        yykVar.getClass();
        this.c = qbrVar;
        this.d = xbwVar;
        this.e = xbwVar2;
        this.f = pvgVar;
        this.h = rbiVar;
        this.g = yykVar;
    }

    private final void h(vhq vhqVar, qen qenVar, qrx qrxVar, List list, pvi pviVar) {
        pvh pvhVarA = this.f.a(vhqVar);
        pvhVarA.e(qenVar);
        pvhVarA.d(list);
        pvo pvoVar = (pvo) pvhVarA;
        pvoVar.J = 2;
        pvoVar.A = pviVar;
        if (qrxVar != null) {
            pvoVar.o = qrxVar;
        }
        pvhVarA.a();
    }

    private final void i(vie vieVar, qen qenVar, List list, pvi pviVar) {
        pvh pvhVarB = this.f.b(vieVar);
        pvhVarB.e(qenVar);
        pvhVarB.d(list);
        ((pvo) pvhVarB).A = pviVar;
        pvhVarB.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        if (e(r2, r3, r4, r5, r6, r7) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, ygi] */
    @Override // defpackage.pwp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qen r9, java.util.List r10, defpackage.qdo r11, defpackage.pvi r12, boolean r13, defpackage.yih r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.pwt
            if (r0 == 0) goto L13
            r0 = r14
            pwt r0 = (defpackage.pwt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            pwt r0 = new pwt
            r0.<init>(r8, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.d
            yio r0 = defpackage.yio.a
            int r1 = r7.f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r9 = r7.a
            yyk r9 = (defpackage.yyk) r9
            defpackage.ybn.f(r14)     // Catch: java.lang.Throwable -> L2f
            goto L84
        L2f:
            r0 = move-exception
            r10 = r0
            goto L8a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            boolean r13 = r7.c
            yyk r9 = r7.i
            pvi r12 = r7.g
            qdo r11 = r7.h
            java.lang.Object r10 = r7.b
            java.lang.Object r1 = r7.a
            qen r1 = (defpackage.qen) r1
            defpackage.ybn.f(r14)
            r3 = r10
            r10 = r2
            r2 = r1
            goto L6c
        L4f:
            defpackage.ybn.f(r14)
            yyk r14 = r8.g
            r7.a = r9
            r7.b = r10
            r7.h = r11
            r7.g = r12
            r7.i = r14
            r7.c = r13
            r7.f = r3
            java.lang.Object r1 = r14.b(r7)
            if (r1 == r0) goto L8e
            r3 = r10
            r10 = r2
            r2 = r9
            r9 = r14
        L6c:
            r4 = r11
            r5 = r12
            r6 = r13
            r7.a = r9     // Catch: java.lang.Throwable -> L2f
            r11 = 0
            r7.b = r11     // Catch: java.lang.Throwable -> L2f
            r7.h = r11     // Catch: java.lang.Throwable -> L2f
            r7.g = r11     // Catch: java.lang.Throwable -> L2f
            r7.i = r11     // Catch: java.lang.Throwable -> L2f
            r7.f = r10     // Catch: java.lang.Throwable -> L2f
            r1 = r8
            java.lang.Object r10 = r1.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto L84
            goto L8e
        L84:
            r9.d()
            ygi r9 = defpackage.ygi.a
            return r9
        L8a:
            r9.d()
            throw r10
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.a(qen, java.util.List, qdo, pvi, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    @Override // defpackage.pwp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qen r9, java.util.List r10, defpackage.vmo r11, int r12, defpackage.pvu r13, defpackage.yih r14) {
        /*
            r8 = this;
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L7
            goto L47
        L7:
            int r4 = r11.f
            int r4 = defpackage.a.bm(r4)
            if (r4 != 0) goto L10
            goto L13
        L10:
            r5 = 3
            if (r4 == r5) goto L21
        L13:
            int r4 = r11.d
            vll r4 = defpackage.vll.b(r4)
            if (r4 != 0) goto L1d
            vll r4 = defpackage.vll.DELETION_STATUS_UNKNOWN
        L1d:
            vll r5 = defpackage.vll.DELETED
            if (r4 != r5) goto L36
        L21:
            qbr r4 = r8.c
            r5 = 0
            java.util.List r4 = r4.b(r9, r10, r5, r13)
            r7 = 5
            if (r12 != r7) goto L36
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L36
            vie r7 = defpackage.vie.DISMISSED_REMOTE
            r8.i(r7, r9, r4, r5)
        L36:
            vht r5 = r13.a
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            java.lang.Object r1 = r0.g(r1, r2, r3, r4, r5, r6)
            yio r0 = defpackage.yio.a
            if (r1 != r0) goto L47
            return r1
        L47:
            ygi r0 = defpackage.ygi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.b(qen, java.util.List, vmo, int, pvu, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0079 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qen r8, defpackage.qis r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.pwq
            if (r0 == 0) goto L13
            r0 = r10
            pwq r0 = (defpackage.pwq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pwq r0 = new pwq
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.a
            qis r9 = r0.e
            qen r2 = r0.f
            defpackage.ybn.f(r10)
            r6 = r0
            r0 = r9
            r9 = r2
        L30:
            r2 = r6
            goto L7d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            defpackage.ybn.f(r10)
            xbw r10 = r7.d
            java.lang.Object r10 = r10.b()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L56
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L56
            goto L86
        L56:
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L5e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r8.next()
            qqx r2 = (defpackage.qqx) r2
            r0.f = r9
            r0.e = r10
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = r2.a()
            if (r2 != r1) goto L79
            return r1
        L79:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L30
        L7d:
            qqw r5 = defpackage.qqw.a
            if (r10 == r5) goto L83
            r3 = r4
            goto L86
        L83:
            r10 = r0
            r0 = r2
            goto L5e
        L86:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.c(qen, qis, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.qen r5, java.util.List r6, defpackage.pvi r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.pwr
            if (r0 == 0) goto L13
            r0 = r8
            pwr r0 = (defpackage.pwr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pwr r0 = new pwr
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.b
            pvi r7 = r0.f
            java.lang.Object r6 = r0.a
            qen r2 = r0.g
            defpackage.ybn.f(r8)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.ybn.f(r8)
            xbw r8 = r4.d
            java.lang.Object r8 = r8.b()
            java.util.Set r8 = (java.util.Set) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = r5
            r5 = r8
        L48:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L65
            java.lang.Object r8 = r5.next()
            qqx r8 = (defpackage.qqx) r8
            r0.g = r2
            r0.a = r6
            r0.f = r7
            r0.b = r5
            r0.e = r3
            java.lang.Object r8 = r8.e()
            if (r8 != r1) goto L48
            return r1
        L65:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.d(qen, java.util.List, pvi, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0240, code lost:
    
        ((java.util.List) r11).add(r13);
        r10.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026c, code lost:
    
        if (r0.d(r1, r10, r6, r7) != r8) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0384 A[LOOP:3: B:103:0x037e->B:105:0x0384, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027a  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.EnumMap] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0233 -> B:68:0x023a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0243 -> B:44:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r21, java.util.List r22, defpackage.qdo r23, defpackage.pvi r24, boolean r25, defpackage.yih r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.e(qen, java.util.List, qdo, pvi, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0172, code lost:
    
        if (r1.a(r12, r18, r4) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0197, code lost:
    
        if (r1.a(r30, r13, r4) == r5) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xid] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r29, defpackage.qis r30, defpackage.qdo r31, defpackage.pvi r32, java.util.EnumMap r33, boolean r34, defpackage.yih r35) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.f(qen, qis, qdo, pvi, java.util.EnumMap, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qen r5, java.util.List r6, defpackage.vmo r7, int r8, defpackage.vht r9, defpackage.yih r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.pws
            if (r0 == 0) goto L13
            r0 = r10
            pws r0 = (defpackage.pws) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pws r0 = new pws
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.b
            vht r9 = r0.g
            int r8 = r0.h
            vmo r7 = r0.f
            java.lang.Object r6 = r0.a
            qen r2 = r0.i
            defpackage.ybn.f(r10)
            goto L4c
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            defpackage.ybn.f(r10)
            xbw r10 = r4.d
            java.lang.Object r10 = r10.b()
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r5
            r5 = r10
        L4c:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L6d
            java.lang.Object r10 = r5.next()
            qqx r10 = (defpackage.qqx) r10
            r0.i = r2
            r0.a = r6
            r0.f = r7
            r0.h = r8
            r0.g = r9
            r0.b = r5
            r0.e = r3
            java.lang.Object r10 = r10.g()
            if (r10 != r1) goto L4c
            return r1
        L6d:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pww.g(qen, java.util.List, vmo, int, vht, yih):java.lang.Object");
    }
}

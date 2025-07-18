package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pub implements ptr {
    private static final tvn c = tvn.n("GnpSdk");
    public final yyk a;
    public final aafi b;
    private final pxf d;
    private final qbd e;
    private final pvg f;
    private final qnr g;
    private final pvd h;
    private final qbr i;
    private final xbw j;
    private final tst k;
    private final yil l;
    private final rbi m;
    private final unc n;

    public pub(pxf pxfVar, qbd qbdVar, pvg pvgVar, unc uncVar, qnr qnrVar, pvd pvdVar, qbr qbrVar, xbw xbwVar, rbi rbiVar, yyk yykVar, tst tstVar, aafi aafiVar, yil yilVar) {
        pxfVar.getClass();
        qbdVar.getClass();
        pvgVar.getClass();
        pvdVar.getClass();
        qbrVar.getClass();
        xbwVar.getClass();
        rbiVar.getClass();
        yykVar.getClass();
        this.d = pxfVar;
        this.e = qbdVar;
        this.f = pvgVar;
        this.n = uncVar;
        this.g = qnrVar;
        this.h = pvdVar;
        this.i = qbrVar;
        this.j = xbwVar;
        this.m = rbiVar;
        this.a = yykVar;
        this.k = tstVar;
        this.b = aafiVar;
        this.l = yilVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ptr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Set r9, defpackage.yih r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ptw
            if (r0 == 0) goto L13
            r0 = r10
            ptw r0 = (defpackage.ptw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ptw r0 = new ptw
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r10)
            goto L87
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.a
            defpackage.ybn.f(r10)
            goto L56
        L3c:
            defpackage.ybn.f(r10)
            tvn r10 = defpackage.pub.c
            tuv r10 = r10.l()
            java.lang.String r2 = "Handling a deleted message in the SystemTrayPushHandlerImpl."
            r10.s(r2)
            qnr r10 = r8.g
            r0.a = r9
            r0.e = r4
            java.lang.Object r10 = r10.c(r0)
            if (r10 == r1) goto Lc7
        L56:
            qdl r10 = (defpackage.qdl) r10
            boolean r2 = r10 instanceof defpackage.qdn
            if (r2 == 0) goto L61
            qdn r10 = (defpackage.qdn) r10
            java.lang.Object r10 = r10.a
            goto L78
        L61:
            boolean r2 = r10 instanceof defpackage.qdi
            if (r2 == 0) goto Lc1
            qdi r10 = (defpackage.qdi) r10
            tvn r2 = defpackage.pub.c
            tuv r2 = r2.g()
            java.lang.Throwable r10 = r10.a()
            java.lang.String r5 = "Failed fetching accounts from storage, can't delete messages."
            defpackage.a.co(r2, r5, r10)
            yhb r10 = defpackage.yhb.a
        L78:
            java.util.List r10 = (java.util.List) r10
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L81
            goto Lbe
        L81:
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
            r9 = r10
        L87:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lbe
            java.lang.Object r10 = r9.next()
            qen r10 = (defpackage.qen) r10
            int r5 = r10.f
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            boolean r5 = r2.contains(r6)
            if (r5 == 0) goto L87
            com.google.common.collect.ImmutableSet r5 = r10.h
            if (r5 == 0) goto L87
            qqj r6 = defpackage.qqj.a
            boolean r5 = r5.contains(r6)
            if (r5 != r4) goto L87
            qbd r5 = r8.e
            vlo r6 = defpackage.vlo.REMOTE_DELETED_MESSAGES
            r0.a = r2
            r0.b = r9
            r0.e = r3
            r7 = 0
            java.lang.Object r10 = r5.a(r10, r7, r6, r0)
            if (r10 != r1) goto L87
            goto Lc7
        Lbe:
            ygi r9 = defpackage.ygi.a
            return r9
        Lc1:
            yfu r9 = new yfu
            r9.<init>()
            throw r9
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.a(java.util.Set, yih):java.lang.Object");
    }

    @Override // defpackage.ptr
    public final Object b(qen qenVar, qfi qfiVar, vku vkuVar, qfz qfzVar, qdo qdoVar, long j, long j2, yih yihVar) {
        c.l().s("Handling a notification thread in the SystemTrayPushHandlerImpl.");
        pvi pviVar = new pvi(new Long(j), new Long(j2), vhm.DELIVERED_FCM_PUSH);
        pvh pvhVarB = this.f.b(vie.DELIVERED);
        pvhVarB.e(qenVar);
        vlq vlqVar = vkuVar.e;
        if (vlqVar == null) {
            vlqVar = vlq.a;
        }
        pvhVarB.f(vlqVar);
        pvo pvoVar = (pvo) pvhVarB;
        pvoVar.u = qfiVar.b();
        pvoVar.A = pviVar;
        pvhVarB.a();
        tst tstVar = this.k;
        if (tstVar.g()) {
            vlq vlqVar2 = vkuVar.e;
            if (vlqVar2 == null) {
                vlqVar2 = vlq.a;
            }
            vlqVar2.getClass();
            qis qisVarW = osk.W(vlqVar2);
            qrf qrfVar = (qrf) tstVar.c();
            ocv.bm(qisVarW);
            Object objConvert = ptu.a.convert(qfzVar);
            objConvert.getClass();
            qfh qfhVar = qfiVar.a;
            qrt qrtVar = (qrt) objConvert;
            ptv ptvVar = ptv.a;
            qri qriVar = (qri) ptvVar.convert(qfhVar);
            if (qriVar == null) {
                qriVar = qri.a;
            }
            qri qriVar2 = (qri) ptvVar.convert(qfiVar.b);
            if (qriVar2 == null) {
                qriVar2 = qri.a;
            }
            new qrs(qrtVar, qriVar, qriVar2, qfiVar.c);
            qrfVar.b();
        }
        pxf pxfVar = this.d;
        vlq vlqVar3 = vkuVar.e;
        if (vlqVar3 == null) {
            vlqVar3 = vlq.a;
        }
        List listP = yfm.p(vlqVar3);
        vmc vmcVar = vkuVar.d;
        if (vmcVar == null) {
            vmcVar = vmc.a;
        }
        Object objA = pxfVar.a(qenVar, listP, qdoVar, pviVar, false, vmcVar.e, yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.ptr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qen r14, defpackage.vma r15, defpackage.qdo r16, defpackage.yih r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.ptx
            if (r1 == 0) goto L15
            r1 = r0
            ptx r1 = (defpackage.ptx) r1
            int r3 = r1.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r1.c = r3
            goto L1a
        L15:
            ptx r1 = new ptx
            r1.<init>(r13, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.a
            yio r9 = defpackage.yio.a
            int r1 = r8.c
            r10 = 16
            r11 = 1
            if (r1 == 0) goto L35
            if (r1 != r11) goto L2d
            defpackage.ybn.f(r0)
            goto Lac
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            defpackage.ybn.f(r0)
            tvn r0 = defpackage.pub.c
            tuv r1 = r0.l()
            java.lang.String r3 = "Handling a notification count info in the SystemTrayPushHandlerImpl."
            r1.s(r3)
            if (r14 != 0) goto L58
            tuv r0 = r0.g()
            tvk r0 = (defpackage.tvk) r0
            java.lang.String r1 = "Notification counts are only supported for accounts, received null account."
            r0.s(r1)
            qdn r0 = new qdn
            ygi r1 = defpackage.ygi.a
            r0.<init>(r1)
            return r0
        L58:
            vun r0 = r15.d
            r0.getClass()
            r1 = 10
            int r1 = defpackage.yfm.z(r0, r1)
            int r1 = defpackage.yfm.e(r1)
            int r1 = defpackage.ykn.j(r1, r10)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()
            vml r1 = (defpackage.vml) r1
            java.lang.String r3 = r1.b
            long r6 = r1.c
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            yfw r6 = new yfw
            r6.<init>(r3, r1)
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.b
            r5.put(r1, r3)
            goto L74
        L96:
            yil r12 = r13.l
            kaw r0 = new kaw
            r6 = 0
            r7 = 2
            r2 = r13
            r3 = r14
            r4 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.c = r11
            java.lang.Object r0 = defpackage.ykr.l(r12, r0, r8)
            if (r0 == r9) goto Lbd
        Lac:
            qdl r0 = (defpackage.qdl) r0
            if (r0 != 0) goto Lbc
            qdj r0 = new qdj
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = "Timeout while updating notifications count"
            r1.<init>(r2)
            r0.<init>(r1, r10)
        Lbc:
            return r0
        Lbd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.c(qen, vma, qdo, yih):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ptr
    public final Object d(qen qenVar, vmk vmkVar, vhi vhiVar, qdo qdoVar, yih yihVar) throws Throwable {
        tvn tvnVar = c;
        tvnVar.l().s("Handling a sync instruction in the SystemTrayPushHandlerImpl.");
        vmh vmhVarB = vmh.b(vmkVar.b);
        if (vmhVarB == null) {
            vmhVarB = vmh.UNKNOWN_INSTRUCTION;
        }
        switch (vmhVarB.ordinal()) {
            case 1:
                if (qenVar == null) {
                    ((tvk) tvnVar.f()).s("Payload with SYNC instruction must have an account");
                } else {
                    tvnVar.l().s("Payload has SYNC instruction.");
                    pvh pvhVarB = this.f.b(vie.DELIVERED_SYNC_INSTRUCTION);
                    pvhVarB.e(qenVar);
                    pvo pvoVar = (pvo) pvhVarB;
                    pvoVar.u = vhiVar;
                    pvoVar.J = 2;
                    pvhVarB.a();
                    Object objA = this.e.a(qenVar, new Long(vmkVar.c), vlo.SYNC_INSTRUCTION, yihVar);
                    if (objA == yio.a) {
                        return objA;
                    }
                }
                return ygi.a;
            case 2:
                if (qenVar == null) {
                    ((tvk) tvnVar.f()).s("Payload with FULL_SYNC instruction must have an account");
                } else {
                    tvnVar.l().s("Payload has FULL_SYNC instruction.");
                    pvh pvhVarB2 = this.f.b(vie.DELIVERED_FULL_SYNC_INSTRUCTION);
                    pvhVarB2.e(qenVar);
                    ((pvo) pvhVarB2).u = vhiVar;
                    pvhVarB2.a();
                    Object objB = this.e.b(qenVar, vlo.FULL_SYNC_INSTRUCTION, yihVar);
                    if (objB == yio.a) {
                        return objB;
                    }
                }
                return ygi.a;
            case 3:
                tvnVar.l().s("Payload has STORE_ALL_ACCOUNTS instruction.");
                Object objG = this.n.g(vmd.SERVER_SYNC_INSTRUCTION, yihVar);
                if (objG == yio.a) {
                    return objG;
                }
                return ygi.a;
            case 4:
                if (qenVar == null) {
                    ((tvk) tvnVar.f()).s("Payload with UPDATE_THREAD instruction must have an account");
                    return ygi.a;
                }
                tvnVar.l().s("Payload has UPDATE_THREAD_STATE instruction.");
                vmj vmjVar = vmkVar.d;
                if (vmjVar == null) {
                    vmjVar = vmj.a;
                }
                vmj vmjVar2 = vmjVar;
                vmjVar2.getClass();
                Object objF = f(qenVar, vmjVar2, vhiVar, qdoVar, yihVar);
                if (objF == yio.a) {
                    return objF;
                }
                return ygi.a;
            case 5:
                return ygi.a;
            case 6:
                pvh pvhVarB3 = this.f.b(vie.DELIVERED_REMOVE_STORAGE_INSTRUCTION);
                pvhVarB3.e(qenVar);
                ((pvo) pvhVarB3).u = vhiVar;
                pvhVarB3.a();
                tvnVar.l().s("Clear all data associated with the account.");
                Object objD = pvd.d(this.h, qenVar, true, yihVar);
                if (objD == yio.a) {
                    return objD;
                }
                return ygi.a;
            default:
                ((tvk) tvnVar.f()).s("Unknown sync instruction.");
                return ygi.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r27, defpackage.vmj r28, defpackage.vhi r29, defpackage.yih r30) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.e(qen, vmj, vhi, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[EXC_TOP_SPLITTER, PHI: r6 r10 r11 r12
  0x00b7: PHI (r6v3 int) = (r6v0 int), (r6v0 int), (r6v2 int), (r6v0 int), (r6v0 int) binds: [B:36:0x00b4, B:30:0x0094, B:34:0x009a, B:23:0x0052, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r10v2 qen) = (r10v0 qen), (r10v0 qen), (r10v1 qen), (r10v14 qen), (r10v15 qen) binds: [B:36:0x00b4, B:30:0x0094, B:34:0x009a, B:23:0x0052, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r11v2 vmj) = (r11v0 vmj), (r11v0 vmj), (r11v1 vmj), (r11v5 vmj), (r11v6 vmj) binds: [B:36:0x00b4, B:30:0x0094, B:34:0x009a, B:23:0x0052, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r12v2 vhi) = (r12v0 vhi), (r12v0 vhi), (r12v1 vhi), (r12v3 vhi), (r12v4 vhi) binds: [B:36:0x00b4, B:30:0x0094, B:34:0x009a, B:23:0x0052, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r10, defpackage.vmj r11, defpackage.vhi r12, defpackage.qdo r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.f(qen, vmj, vhi, qdo, yih):java.lang.Object");
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
            boolean r0 = r10 instanceof defpackage.pua
            if (r0 == 0) goto L13
            r0 = r10
            pua r0 = (defpackage.pua) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pua r0 = new pua
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
            xbw r10 = r4.j
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.g(qen, java.util.List, vmo, int, vht, yih):java.lang.Object");
    }
}

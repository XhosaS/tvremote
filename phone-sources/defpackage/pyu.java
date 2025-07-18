package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyu implements pyd {
    private static final tvn a = tvn.n("GnpSdk");
    private final pyj b;
    private final pzo c;
    private final pvg d;
    private final yfo e;
    private final nsf f;
    private final ntp g;
    private final aafi h;
    private final aafi i;
    private final aafi j;
    private final cb k;

    public pyu(pyj pyjVar, cb cbVar, aafi aafiVar, aafi aafiVar2, ntp ntpVar, aafi aafiVar3, nsf nsfVar, pzo pzoVar, pvg pvgVar, yfo yfoVar) {
        cbVar.getClass();
        pvgVar.getClass();
        yfoVar.getClass();
        this.b = pyjVar;
        this.k = cbVar;
        this.j = aafiVar;
        this.i = aafiVar2;
        this.g = ntpVar;
        this.h = aafiVar3;
        this.f = nsfVar;
        this.c = pzoVar;
        this.d = pvgVar;
        this.e = yfoVar;
    }

    private final void m(qen qenVar, qsm qsmVar, vhq vhqVar) {
        if (qsmVar.a()) {
            pvh pvhVarA = this.d.a(vhqVar);
            pvhVarA.e(qenVar);
            Throwable th = qsmVar.c;
            if (th != null) {
                ((pvo) pvhVarA).B = th.getClass().getSimpleName();
            }
            pvhVarA.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qjq] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, qmt] */
    @Override // defpackage.pyd
    public final pyc a(qen qenVar, vme vmeVar) {
        try {
            aafi aafiVar = this.h;
            vtw vtwVarM = vjm.a.m();
            vtwVarM.getClass();
            Object obj = aafiVar.c;
            String str = ((qei) obj).a;
            str.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vjm vjmVar = (vjm) vtwVarM.b;
            vjmVar.b |= 1;
            vjmVar.c = str;
            vkk vkkVarB = aafiVar.a.b(qenVar);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vjm vjmVar2 = (vjm) vtwVarM.b;
            vjmVar2.d = vkkVarB;
            vjmVar2.b |= 2;
            vtw vtwVarM2 = vjz.a.m();
            vtwVarM2.getClass();
            vtw vtwVarM3 = vjy.a.m();
            vtwVarM3.getClass();
            String str2 = ((qei) obj).b;
            if (str2 != null) {
                vef.K(Long.parseLong(str2), vtwVarM3);
            }
            vef.J(aafiVar.b.c(), vtwVarM3);
            vef.M(vef.I(vtwVarM3), vtwVarM2);
            vjz vjzVarL = vef.L(vtwVarM2);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            vjm vjmVar3 = (vjm) vucVar;
            vjmVar3.e = vjzVarL;
            vjmVar3.b |= 4;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            vjm vjmVar4 = (vjm) vucVar2;
            vjmVar4.f = vmeVar;
            vjmVar4.b |= 8;
            String str3 = qenVar.n;
            if (str3 != null) {
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                vjm vjmVar5 = (vjm) vtwVarM.b;
                vjmVar5.b |= 16;
                vjmVar5.g = str3;
            }
            vuc vucVarR = vtwVarM.r();
            vucVarR.getClass();
            vjm vjmVar6 = (vjm) vucVarR;
            qsm qsmVar = (qsm) ykr.n(yim.a, new pfo(this.k, qenVar, vjmVar6, (yih) null, 19));
            m(qenVar, qsmVar, vhq.FAILED_TO_UNREGISTER);
            return pyc.a(vjmVar6, qsmVar);
        } catch (qjr e) {
            pyb pybVarC = pyc.c();
            pybVarC.c = e;
            pybVarC.b(true);
            return pybVarC.a();
        }
    }

    @Override // defpackage.pyd
    public final pyc b(qen qenVar, vmd vmdVar, vme vmeVar) {
        if (new vul(xdq.a.get().a().c, qrb.a).contains(vmdVar)) {
            pyb pybVarC = pyc.c();
            pybVarC.c = new pyk(vmdVar);
            pybVarC.b(false);
            return pybVarC.a();
        }
        try {
            vjq vjqVarA = this.c.a(qenVar, vmdVar, vmeVar);
            qsm qsmVar = (qsm) ykr.n(yim.a, new pfo(this.k, qenVar, vjqVarA, (yih) null, 20));
            m(qenVar, qsmVar, vhq.FAILED_TO_REGISTER);
            return pyc.a(vjqVarA, qsmVar);
        } catch (qjr e) {
            pyb pybVarC2 = pyc.c();
            pybVarC2.c = e;
            pybVarC2.b(true);
            return pybVarC2.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022f  */
    @Override // defpackage.pyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qen r18, java.util.List r19, defpackage.vme r20, defpackage.yih r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.c(qen, java.util.List, vme, yih):java.lang.Object");
    }

    @Override // defpackage.pyd
    public final Object d(qen qenVar, long j, vlo vloVar, vme vmeVar, yih yihVar) {
        if (!new vul(xdt.a.get().a().c, qra.a).contains(vloVar)) {
            return j(qenVar, j, vloVar, vmeVar, yihVar);
        }
        pyb pybVarC = pyc.c();
        pybVarC.c = new pyk(vloVar);
        pybVarC.b(false);
        return pybVarC.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ab, code lost:
    
        if (r0 == r8) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.pyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r14, long r15, java.util.List r17, defpackage.vlo r18, defpackage.vme r19, defpackage.yih r20) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.e(qen, long, java.util.List, vlo, vme, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, qmt] */
    @Override // defpackage.pyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r9, defpackage.ptf r10, boolean r11, defpackage.vme r12, defpackage.yih r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.f(qen, ptf, boolean, vme, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r8, defpackage.vmo r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.pyt
            if (r0 == 0) goto L13
            r0 = r10
            pyt r0 = (defpackage.pyt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pyt r0 = new pyt
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            vju r8 = r6.d
            defpackage.ybn.f(r10)
            goto L95
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ybn.f(r10)
            vju r10 = defpackage.vju.a
            vtw r10 = r10.m()
            r10.getClass()
            r8.getClass()
            vuc r1 = r10.b
            boolean r1 = r1.A()
            if (r1 != 0) goto L4c
            r10.u()
        L4c:
            vuc r1 = r10.b
            r3 = r1
            vju r3 = (defpackage.vju) r3
            int r4 = r3.b
            r4 = r4 | r2
            r3.b = r4
            r3.c = r8
            r9.getClass()
            boolean r8 = r1.A()
            if (r8 != 0) goto L64
            r10.u()
        L64:
            vuc r8 = r10.b
            vju r8 = (defpackage.vju) r8
            r8.d = r9
            int r9 = r8.b
            r9 = r9 | 2
            r8.b = r9
            vuc r8 = r10.r()
            r8.getClass()
            cb r9 = r7.k
            r4 = r8
            vju r4 = (defpackage.vju) r4
            r6.d = r4
            r6.c = r2
            vjv r5 = defpackage.vjv.a
            r5.getClass()
            java.lang.Object r8 = r9.a
            r1 = r8
            qsu r1 = (defpackage.qsu) r1
            java.lang.String r2 = "/v1/updatethreadstatebytoken"
            r3 = 0
            java.lang.Object r10 = defpackage.qsu.g(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L94
            return r0
        L94:
            r8 = r4
        L95:
            qsm r10 = (defpackage.qsm) r10
            vhq r9 = defpackage.vhq.FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN
            r0 = 0
            r7.m(r0, r10, r9)
            pyc r8 = defpackage.pyc.a(r8, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.g(java.lang.String, vmo, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.qen r9, java.util.List r10, defpackage.yih r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.h(qen, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.qsm r4, defpackage.qen r5, defpackage.yih r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof defpackage.pyr
            if (r5 == 0) goto L13
            r5 = r6
            pyr r5 = (defpackage.pyr) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            pyr r5 = new pyr
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            qsl r4 = r5.e
            qsl r0 = r5.d
            qsm r5 = r5.f
            defpackage.ybn.f(r6)
            goto L6b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.ybn.f(r6)
            qsl r6 = defpackage.qsm.b()
            boolean r1 = r4.a()
            if (r1 == 0) goto L55
            java.lang.Throwable r5 = r4.c
            r6.c = r5
            java.lang.Integer r5 = r4.a
            r6.a = r5
            boolean r5 = r4.d
            r6.c(r5)
            boolean r4 = r4.e
            r6.b(r4)
            goto L74
        L55:
            vvj r1 = r4.b
            vjd r1 = (defpackage.vjd) r1
            r5.f = r4
            r5.d = r6
            r5.e = r6
            r5.c = r2
            java.lang.Object r5 = r3.l(r1, r5)
            if (r5 == r0) goto L79
            r0 = r6
            r6 = r5
            r5 = r4
            r4 = r0
        L6b:
            vvj r6 = (defpackage.vvj) r6
            r4.b = r6
            java.lang.Integer r5 = r5.a
            r4.a = r5
            r6 = r0
        L74:
            qsm r4 = r6.a()
            return r4
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.i(qsm, qen, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r0 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.qen r12, long r13, defpackage.vlo r15, defpackage.vme r16, defpackage.yih r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.pym
            if (r1 == 0) goto L15
            r1 = r0
            pym r1 = (defpackage.pym) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            pym r1 = new pym
            r1.<init>(r11, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.a
            yio r1 = defpackage.yio.a
            int r2 = r8.c
            r9 = 3
            r3 = 2
            r10 = 1
            if (r2 == 0) goto L4c
            if (r2 == r10) goto L42
            if (r2 == r3) goto L3c
            if (r2 != r9) goto L34
            vjc r12 = r8.d
            qen r13 = r8.e
            defpackage.ybn.f(r0)     // Catch: defpackage.qjr -> L7f
            goto L73
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            qen r12 = r8.e
            defpackage.ybn.f(r0)     // Catch: defpackage.qjr -> L7f
            goto L61
        L42:
            qen r12 = r8.e
            defpackage.ybn.f(r0)     // Catch: defpackage.qjr -> L7f
            vjc r0 = (defpackage.vjc) r0     // Catch: defpackage.qjr -> L7f
        L49:
            r13 = r12
            r12 = r0
            goto L64
        L4c:
            defpackage.ybn.f(r0)
            aafi r2 = r11.j     // Catch: defpackage.qjr -> L7f
            r8.e = r12     // Catch: defpackage.qjr -> L7f
            r8.c = r3     // Catch: defpackage.qjr -> L7f
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
            java.lang.Object r0 = r2.A(r3, r4, r6, r7, r8)     // Catch: defpackage.qjr -> L7f
            if (r0 != r1) goto L61
            goto L72
        L61:
            vjc r0 = (defpackage.vjc) r0     // Catch: defpackage.qjr -> L7f
            goto L49
        L64:
            cb r14 = r11.k     // Catch: defpackage.qjr -> L7f
            r8.e = r13     // Catch: defpackage.qjr -> L7f
            r8.d = r12     // Catch: defpackage.qjr -> L7f
            r8.c = r9     // Catch: defpackage.qjr -> L7f
            java.lang.Object r0 = r14.C(r13, r12, r8)     // Catch: defpackage.qjr -> L7f
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            qsm r0 = (defpackage.qsm) r0     // Catch: defpackage.qjr -> L7f
            vhq r14 = defpackage.vhq.FAILED_TO_FETCH_LATEST_NOTIFICATIONS     // Catch: defpackage.qjr -> L7f
            r11.m(r13, r0, r14)     // Catch: defpackage.qjr -> L7f
            pyc r12 = defpackage.pyc.a(r12, r0)     // Catch: defpackage.qjr -> L7f
            return r12
        L7f:
            r0 = move-exception
            r12 = r0
            pyb r13 = defpackage.pyc.c()
            r13.c = r12
            r13.b(r10)
            pyc r12 = r13.a()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.j(qen, long, vlo, vme, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.vjd r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pyp
            if (r0 == 0) goto L13
            r0 = r6
            pyp r0 = (defpackage.pyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pyp r0 = new pyp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            vjd r5 = r0.d
            defpackage.ybn.f(r6)     // Catch: java.lang.Throwable -> L29
            goto L6c
        L29:
            r6 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r6)
            vun r6 = r5.c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L44
            vun r5 = r5.b
            r5.getClass()
            return r5
        L44:
            yfo r6 = r4.e
            xcn r6 = (defpackage.xcn) r6
            java.lang.Object r6 = r6.a
            tst r6 = (defpackage.tst) r6
            boolean r2 = r6.g()
            if (r2 == 0) goto L8c
            java.lang.Object r6 = r6.c()     // Catch: java.lang.Throwable -> L29
            qil r6 = (defpackage.qil) r6     // Catch: java.lang.Throwable -> L29
            vun r2 = r5.b     // Catch: java.lang.Throwable -> L29
            r2.getClass()     // Catch: java.lang.Throwable -> L29
            vun r2 = r5.c     // Catch: java.lang.Throwable -> L29
            r2.getClass()     // Catch: java.lang.Throwable -> L29
            r0.d = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r6.a()     // Catch: java.lang.Throwable -> L29
            if (r6 == r1) goto L6f
        L6c:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L29
            goto L74
        L6f:
            return r1
        L70:
            java.lang.Object r6 = defpackage.ybn.e(r6)
        L74:
            java.lang.Throwable r0 = defpackage.yfy.a(r6)
            if (r0 != 0) goto L7b
            return r6
        L7b:
            tvn r6 = defpackage.pyu.a
            tuv r6 = r6.g()
            java.lang.String r1 = "decryptAndMergeFrontendNotificationThreadLists Failed"
            defpackage.a.co(r6, r1, r0)
            vun r5 = r5.b
            r5.getClass()
            return r5
        L8c:
            tvn r6 = defpackage.pyu.a
            tuv r6 = r6.g()
            tvk r6 = (defpackage.tvk) r6
            java.lang.String r0 = "FetchEncryptionHandler is not present"
            r6.s(r0)
            vun r5 = r5.b
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.k(vjd, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.vjd r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pys
            if (r0 == 0) goto L13
            r0 = r9
            pys r0 = (defpackage.pys) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pys r0 = new pys
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            vwv r8 = r0.d
            upq r1 = r0.f
            upq r0 = r0.e
            defpackage.ybn.f(r9)
            goto L8f
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ybn.f(r9)
            if (r8 != 0) goto L49
            vjf r8 = defpackage.vjf.a
            vtw r8 = r8.m()
            upq r8 = defpackage.vfi.E(r8)
            vjf r8 = r8.f()
            return r8
        L49:
            vjf r9 = defpackage.vjf.a
            vtw r9 = r9.m()
            upq r9 = defpackage.vfi.E(r9)
            java.lang.Object r2 = r9.b
            long r4 = r8.d
            vtw r2 = (defpackage.vtw) r2
            vuc r6 = r2.b
            boolean r6 = r6.A()
            if (r6 != 0) goto L64
            r2.u()
        L64:
            vuc r2 = r2.b
            vjf r2 = (defpackage.vjf) r2
            int r6 = r2.b
            r6 = r6 | r3
            r2.b = r6
            r2.d = r4
            vwv r4 = new vwv
            vun r2 = r2.c
            java.util.List r2 = j$.util.DesugarCollections.unmodifiableList(r2)
            r2.getClass()
            r4.<init>(r2)
            r0.e = r9
            r0.f = r9
            r0.d = r4
            r0.c = r3
            java.lang.Object r8 = r7.k(r8, r0)
            if (r8 == r1) goto Lcc
            r0 = r9
            r1 = r0
            r9 = r8
            r8 = r4
        L8f:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            fab r2 = new fab
            r3 = 20
            r2.<init>(r3)
            java.util.List r9 = defpackage.yfm.aj(r9, r2)
            r8.getClass()
            java.lang.Object r8 = r1.b
            vtw r8 = (defpackage.vtw) r8
            vuc r1 = r8.b
            boolean r1 = r1.A()
            if (r1 != 0) goto Lae
            r8.u()
        Lae:
            vuc r8 = r8.b
            vjf r8 = (defpackage.vjf) r8
            vjf r1 = defpackage.vjf.a
            vun r1 = r8.c
            boolean r2 = r1.c()
            if (r2 != 0) goto Lc2
            vun r1 = defpackage.vuc.s(r1)
            r8.c = r1
        Lc2:
            vun r8 = r8.c
            defpackage.vsf.h(r9, r8)
            vjf r8 = r0.f()
            return r8
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyu.l(vjd, yih):java.lang.Object");
    }
}

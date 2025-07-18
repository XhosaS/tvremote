package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qe extends yiz implements yjz {
    boolean a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ qg d;
    final /* synthetic */ uz e;
    final /* synthetic */ kw f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(uz uzVar, long j, kw kwVar, qg qgVar, yih yihVar) {
        super(2, yihVar);
        this.e = uzVar;
        this.c = j;
        this.f = kwVar;
        this.d = qgVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        qe qeVar = new qe(this.e, this.c, this.f, this.d, yihVar);
        qeVar.g = obj;
        return qeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r15.h(r1, r14) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r2.h(r15, r14) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            yio r0 = defpackage.yio.a
            int r1 = r14.b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 == r5) goto L16
            defpackage.ybn.f(r15)
            goto Lb2
        L16:
            java.lang.Object r1 = r14.g
            wt r1 = (defpackage.wt) r1
            defpackage.ybn.f(r15)
            goto L84
        L1e:
            boolean r1 = r14.a
            defpackage.ybn.f(r15)
            goto L6a
        L24:
            java.lang.Object r1 = r14.g
            yqe r1 = (defpackage.yqe) r1
            defpackage.ybn.f(r15)
            goto L51
        L2c:
            defpackage.ybn.f(r15)
            java.lang.Object r15 = r14.g
            yow r15 = (defpackage.yow) r15
            qg r8 = r14.d
            long r9 = r14.c
            kw r11 = r14.f
            aku r7 = new aku
            r12 = 0
            r13 = 1
            r7.<init>(r8, r9, r11, r12, r13)
            r1 = 0
            yqe r1 = defpackage.ykr.q(r15, r6, r1, r7, r5)
            uz r15 = r14.e
            r14.g = r1
            r14.b = r4
            java.lang.Object r15 = r15.o(r14)
            if (r15 == r0) goto Lb9
        L51:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            boolean r4 = r1.u()
            if (r4 == 0) goto L91
            r14.g = r6
            r14.a = r15
            r14.b = r3
            java.lang.Object r1 = defpackage.yoz.u(r1, r14)
            if (r1 == r0) goto Lb9
            r1 = r15
        L6a:
            if (r1 == 0) goto Lb2
            long r3 = r14.c
            ws r15 = new ws
            r15.<init>(r3)
            wt r1 = new wt
            r1.<init>(r15)
            kw r3 = r14.f
            r14.g = r1
            r14.b = r5
            java.lang.Object r15 = r3.h(r15, r14)
            if (r15 == r0) goto Lb9
        L84:
            kw r15 = r14.f
            r14.g = r6
            r14.b = r2
            java.lang.Object r15 = r15.h(r1, r14)
            if (r15 != r0) goto Lb2
            goto Lb9
        L91:
            qg r1 = r14.d
            ws r1 = r1.d
            if (r1 == 0) goto Lb2
            kw r2 = r14.f
            if (r15 == 0) goto La1
            wt r15 = new wt
            r15.<init>(r1)
            goto La6
        La1:
            wr r15 = new wr
            r15.<init>(r1)
        La6:
            r14.g = r6
            r1 = 5
            r14.b = r1
            java.lang.Object r15 = r2.h(r15, r14)
            if (r15 != r0) goto Lb2
            goto Lb9
        Lb2:
            qg r15 = r14.d
            r15.d = r6
            ygi r15 = defpackage.ygi.a
            return r15
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

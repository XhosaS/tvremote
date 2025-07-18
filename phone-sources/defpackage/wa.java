package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wa extends yiy implements yjz {
    Object a;
    int b;
    final /* synthetic */ yow c;
    final /* synthetic */ yka d;
    final /* synthetic */ yjv e;
    final /* synthetic */ uz f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(yow yowVar, yka ykaVar, yjv yjvVar, uz uzVar, yih yihVar) {
        super(yihVar);
        this.c = yowVar;
        this.d = ykaVar;
        this.e = yjvVar;
        this.f = uzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wa) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        wa waVar = new wa(this.c, this.d, this.e, this.f, yihVar);
        waVar.g = obj;
        return waVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            yio r0 = defpackage.yio.a
            int r1 = r13.b
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L14
            java.lang.Object r0 = r13.g
            yqe r0 = (defpackage.yqe) r0
            defpackage.ybn.f(r14)
            goto L6d
        L14:
            java.lang.Object r1 = r13.a
            java.lang.Object r4 = r13.g
            btq r4 = (defpackage.btq) r4
            defpackage.ybn.f(r14)
            goto L46
        L1e:
            defpackage.ybn.f(r14)
            java.lang.Object r14 = r13.g
            btq r14 = (defpackage.btq) r14
            yow r1 = r13.c
            yka r6 = defpackage.wf.a
            uz r6 = r13.f
            qy r7 = new qy
            r8 = 8
            r7.<init>(r6, r5, r8)
            r6 = 4
            yqe r1 = defpackage.ykr.q(r1, r5, r6, r7, r4)
            r13.g = r14
            r13.a = r1
            r13.b = r4
            java.lang.Object r4 = defpackage.wf.f(r14, r13, r3)
            if (r4 == r0) goto L9c
            r12 = r4
            r4 = r14
            r14 = r12
        L46:
            r9 = r14
            bsz r9 = (defpackage.bsz) r9
            r9.b()
            yka r7 = r13.d
            yka r14 = defpackage.wf.a
            if (r7 == r14) goto L60
            yow r14 = r13.c
            uz r8 = r13.f
            th r6 = new th
            r10 = 0
            r11 = 2
            r6.<init>(r7, r8, r9, r10, r11)
            defpackage.wf.k(r14, r1, r6)
        L60:
            r13.g = r1
            r13.a = r5
            r13.b = r2
            java.lang.Object r14 = defpackage.wf.i(r4, r13)
            if (r14 == r0) goto L9c
            r0 = r1
        L6d:
            bsz r14 = (defpackage.bsz) r14
            if (r14 != 0) goto L7e
            yow r14 = r13.c
            uz r1 = r13.f
            qf r3 = new qf
            r3.<init>(r1, r5, r2)
            defpackage.wf.k(r14, r0, r3)
            goto L99
        L7e:
            r14.b()
            yow r1 = r13.c
            uz r2 = r13.f
            qf r4 = new qf
            r4.<init>(r2, r5, r3, r5)
            defpackage.wf.k(r1, r0, r4)
            yjv r0 = r13.e
            bmx r1 = new bmx
            long r2 = r14.c
            r1.<init>(r2)
            r0.a(r1)
        L99:
            ygi r14 = defpackage.ygi.a
            return r14
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

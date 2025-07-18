package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dby extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ yld c;
    final /* synthetic */ dbz d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dby(yld yldVar, dbz dbzVar, Object obj, boolean z, yih yihVar) {
        super(2, yihVar);
        this.c = yldVar;
        this.d = dbzVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dby) create((dcc) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        dby dbyVar = new dby(this.c, this.d, this.e, this.f, yihVar);
        dbyVar.g = obj;
        return dbyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r5 == r0) goto L24;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.io.IOException {
        /*
            r4 = this;
            yio r0 = defpackage.yio.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.ybn.f(r5)
            goto L6a
        Ld:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.g
            dcc r2 = (defpackage.dcc) r2
            defpackage.ybn.f(r5)
            goto L41
        L17:
            defpackage.ybn.f(r5)
            java.lang.Object r5 = r4.g
            dcc r5 = (defpackage.dcc) r5
            yld r1 = r4.c
            dbz r3 = r4.d
            cvi r3 = r3.m()
            r4.g = r5
            r4.a = r1
            r4.b = r2
            java.lang.Object r2 = r3.b
            cvw r2 = (defpackage.cvw) r2
            java.lang.Object r2 = r2.a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.incrementAndGet()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            if (r3 == r0) goto L8b
            r2 = r5
            r5 = r3
        L41:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            yld r1 = (defpackage.yld) r1
            r1.a = r5
            java.lang.Object r5 = r4.e
            r1 = 0
            r4.g = r1
            r4.a = r1
            r3 = 2
            r4.b = r3
            r2.b()
            dci r3 = new dci
            r3.<init>(r2, r5, r1)
            java.io.File r5 = r2.a
            java.lang.Object r5 = defpackage.cwq.h(r5, r3, r4)
            if (r5 == r0) goto L67
            ygi r5 = defpackage.ygi.a
        L67:
            if (r5 != r0) goto L6a
            goto L8b
        L6a:
            boolean r5 = r4.f
            if (r5 == 0) goto L88
            dbz r5 = r4.d
            java.lang.Object r0 = r4.e
            dax r1 = new dax
            if (r0 == 0) goto L7b
            int r2 = r0.hashCode()
            goto L7c
        L7b:
            r2 = 0
        L7c:
            cxe r5 = r5.g
            yld r3 = r4.c
            int r3 = r3.a
            r1.<init>(r0, r2, r3)
            r5.F(r1)
        L88:
            ygi r5 = defpackage.ygi.a
            return r5
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dby.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

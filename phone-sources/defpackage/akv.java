package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akv extends yiz implements yjz {
    int a;
    final /* synthetic */ alg b;
    final /* synthetic */ long c;
    final /* synthetic */ uz d;
    final /* synthetic */ kw e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akv(uz uzVar, alg algVar, long j, kw kwVar, yih yihVar) {
        super(2, yihVar);
        this.d = uzVar;
        this.b = algVar;
        this.c = j;
        this.e = kwVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akv) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        akv akvVar = new akv(this.d, this.b, this.c, this.e, yihVar);
        akvVar.f = obj;
        return akvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r3.h(r12, r11) == r0) goto L19;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            yio r0 = defpackage.yio.a
            int r1 = r11.a
            r2 = 0
            r3 = 1
            defpackage.ybn.f(r12)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L2e
            goto L53
        Le:
            java.lang.Object r12 = r11.f
            yow r12 = (defpackage.yow) r12
            alg r5 = r11.b
            long r6 = r11.c
            kw r8 = r11.e
            aku r4 = new aku
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            r1 = 3
            r5 = 0
            defpackage.ykr.q(r12, r2, r5, r4, r1)
            uz r12 = r11.d
            r11.a = r3
            java.lang.Object r12 = r12.o(r11)
            if (r12 == r0) goto L5a
        L2e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            alg r1 = r11.b
            ws r1 = r1.k
            if (r1 == 0) goto L53
            kw r3 = r11.e
            if (r12 == 0) goto L44
            wt r12 = new wt
            r12.<init>(r1)
            goto L49
        L44:
            wr r12 = new wr
            r12.<init>(r1)
        L49:
            r1 = 2
            r11.a = r1
            java.lang.Object r12 = r3.h(r12, r11)
            if (r12 != r0) goto L53
            goto L5a
        L53:
            alg r12 = r11.b
            r12.k = r2
            ygi r12 = defpackage.ygi.a
            return r12
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

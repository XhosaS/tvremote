package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mt extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ yrz c;
    final /* synthetic */ mr d;
    final /* synthetic */ bdy e;
    final /* synthetic */ bdy f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(yrz yrzVar, mr mrVar, bdy bdyVar, bdy bdyVar2, yih yihVar) {
        super(2, yihVar);
        this.c = yrzVar;
        this.d = mrVar;
        this.e = bdyVar;
        this.f = bdyVar2;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        mt mtVar = new mt(this.c, this.d, this.e, this.f, yihVar);
        mtVar.g = obj;
        return mtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002c -> B:9:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            yio r0 = defpackage.yio.a
            int r1 = r11.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r11.a
            java.lang.Object r2 = r11.g
            yow r2 = (defpackage.yow) r2
            defpackage.ybn.f(r12)
            goto L2f
        L10:
            defpackage.ybn.f(r12)
            java.lang.Object r12 = r11.g
            yow r12 = (defpackage.yow) r12
            yrz r1 = r11.c
            yrr r1 = r1.C()
            r2 = r12
        L1e:
            r11.g = r2
            r11.a = r1
            r12 = 1
            r11.b = r12
            r12 = r1
            yrr r12 = (defpackage.yrr) r12
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L2f
            return r0
        L2f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L61
            r12 = r1
            yrr r12 = (defpackage.yrr) r12
            java.lang.Object r12 = r12.b()
            yrz r3 = r11.c
            java.lang.Object r3 = r3.m()
            java.lang.Object r3 = defpackage.ysd.a(r3)
            if (r3 == 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r5 = r12
        L4d:
            mr r6 = r11.d
            bdy r7 = r11.e
            bdy r8 = r11.f
            ajo r4 = new ajo
            r9 = 0
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 3
            r3 = 0
            r5 = 0
            defpackage.ykr.q(r2, r3, r5, r4, r12)
            goto L1e
        L61:
            ygi r12 = defpackage.ygi.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

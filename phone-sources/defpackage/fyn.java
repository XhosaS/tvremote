package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyn extends yiz implements yjz {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(float f, op opVar, fwr fwrVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = f;
        this.c = opVar;
        this.d = fwrVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((fyn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((fyn) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, my] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.e != 0) {
            return new fyn((aqj) this.d, this.b, (my) this.c, yihVar, 1);
        }
        return new fyn(this.b, (op) this.c, (fwr) this.d, yihVar, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        if (r10 == r0) goto L36;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, my] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 1
            if (r0 == 0) goto L2f
            yio r0 = defpackage.yio.a
            int r2 = r9.a
            defpackage.ybn.f(r10)
            if (r2 == 0) goto L10
            r7 = r9
            goto L2c
        L10:
            java.lang.Object r10 = r9.d
            float r2 = r9.b
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r2)
            java.lang.Object r5 = r9.c
            r9.a = r1
            aqj r10 = (defpackage.aqj) r10
            mr r3 = r10.c
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.mr.j(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L2c
            return r0
        L2c:
            ygi r10 = defpackage.ygi.a
            return r10
        L2f:
            r7 = r9
            yio r0 = defpackage.yio.a
            int r2 = r7.a
            r3 = 0
            if (r2 == 0) goto L41
            if (r2 == r1) goto L3d
            defpackage.ybn.f(r10)
            goto L9d
        L3d:
            defpackage.ybn.f(r10)
            goto L5b
        L41:
            defpackage.ybn.f(r10)
            float r10 = r7.b
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5b
            java.lang.Object r2 = r7.c
            r7.a = r1
            op r2 = (defpackage.op) r2
            java.lang.Object r1 = r2.b()
            java.lang.Object r10 = r2.i(r10, r1, r9)
            if (r10 != r0) goto L5b
            goto L9c
        L5b:
            float r10 = r7.b
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 != 0) goto L9d
            java.lang.Object r10 = r7.c
            java.lang.Object r3 = r7.d
            r1 = 2
            r7.a = r1
            r2 = r10
            op r2 = (defpackage.op) r2
            pf r4 = r2.c
            if (r4 != 0) goto L72
            ygi r10 = defpackage.ygi.a
            goto L9a
        L72:
            java.lang.Object r10 = r2.a()
            boolean r10 = defpackage.yks.e(r10, r3)
            if (r10 == 0) goto L89
            java.lang.Object r10 = r2.b()
            boolean r10 = defpackage.yks.e(r10, r3)
            if (r10 == 0) goto L89
            ygi r10 = defpackage.ygi.a
            goto L9a
        L89:
            bhi r10 = r2.l
            om r1 = new om
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r10 = defpackage.bhi.I(r10, r1, r9)
            if (r10 == r0) goto L9a
            ygi r10 = defpackage.ygi.a
        L9a:
            if (r10 != r0) goto L9d
        L9c:
            return r0
        L9d:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyn(aqj aqjVar, float f, my myVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.d = aqjVar;
        this.b = f;
        this.c = myVar;
    }
}

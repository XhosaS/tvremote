package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yui extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yui(yih yihVar, ykb ykbVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = ykbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ykb] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        if (i == 0) {
            yui yuiVar = new yui((yih) obj3, (ykb) this.c, 0);
            yuiVar.d = (ysy) obj;
            yuiVar.b = (Object[]) obj2;
            return yuiVar.invokeSuspend(ygi.a);
        }
        if (i != 1) {
            yui yuiVar2 = new yui((yka) this.c, (yih) obj3, 2);
            yuiVar2.d = (ysy) obj;
            yuiVar2.b = (Object[]) obj2;
            return yuiVar2.invokeSuspend(ygi.a);
        }
        yui yuiVar3 = new yui((yjz) this.c, (yih) obj3, 1);
        yuiVar3.d = (ysy) obj;
        yuiVar3.b = obj2;
        return yuiVar3.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [ysy] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ysy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ysy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ykb] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yka] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L77
            if (r0 == r4) goto L45
            yio r0 = defpackage.yio.a
            int r5 = r9.a
            if (r5 == 0) goto L1c
            if (r5 == r4) goto L16
            defpackage.ybn.f(r10)
            goto L41
        L16:
            java.lang.Object r1 = r9.d
            defpackage.ybn.f(r10)
            goto L36
        L1c:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.d
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.c
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r1 = r5[r1]
            r5 = r5[r4]
            r9.a = r4
            java.lang.Object r1 = r6.a(r1, r5, r9)
            if (r1 == r0) goto L44
            r8 = r1
            r1 = r10
            r10 = r8
        L36:
            r9.d = r2
            r9.a = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L41
            goto L44
        L41:
            ygi r10 = defpackage.ygi.a
            return r10
        L44:
            return r0
        L45:
            yio r0 = defpackage.yio.a
            int r1 = r9.a
            if (r1 == 0) goto L57
            if (r1 == r4) goto L51
            defpackage.ybn.f(r10)
            goto L73
        L51:
            java.lang.Object r1 = r9.d
            defpackage.ybn.f(r10)
            goto L68
        L57:
            defpackage.ybn.f(r10)
            java.lang.Object r1 = r9.d
            java.lang.Object r10 = r9.b
            java.lang.Object r5 = r9.c
            r9.a = r4
            java.lang.Object r10 = r5.a(r10, r9)
            if (r10 == r0) goto L76
        L68:
            r9.d = r2
            r9.a = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L73
            goto L76
        L73:
            ygi r10 = defpackage.ygi.a
            return r10
        L76:
            return r0
        L77:
            yio r0 = defpackage.yio.a
            int r5 = r9.a
            if (r5 == 0) goto L89
            if (r5 == r4) goto L83
            defpackage.ybn.f(r10)
            goto Lb0
        L83:
            java.lang.Object r1 = r9.d
            defpackage.ybn.f(r10)
            goto La5
        L89:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.d
            java.lang.Object r5 = r9.b
            java.lang.Object r6 = r9.c
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r1 = r5[r1]
            r7 = r5[r4]
            r5 = r5[r3]
            r9.a = r4
            java.lang.Object r1 = r6.a(r1, r7, r5, r9)
            if (r1 == r0) goto Lb3
            r8 = r1
            r1 = r10
            r10 = r8
        La5:
            r9.d = r2
            r9.a = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lb0
            goto Lb3
        Lb0:
            ygi r10 = defpackage.ygi.a
            return r10
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yui.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yui(yjz yjzVar, yih yihVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yui(yka ykaVar, yih yihVar, int i) {
        super(3, yihVar);
        this.e = i;
        this.c = ykaVar;
    }
}

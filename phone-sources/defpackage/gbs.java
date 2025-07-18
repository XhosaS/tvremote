package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbs extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbs(ysx ysxVar, yka ykaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = ysxVar;
        this.d = ykaVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gbs) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gbs) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yka] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f != 0) {
            gbs gbsVar = new gbs((ysx) this.c, (yka) this.d, yihVar, 1);
            gbsVar.e = obj;
            return gbsVar;
        }
        gbs gbsVar2 = new gbs((ysy) this.c, (yjz) this.d, yihVar, 0);
        gbsVar2.e = obj;
        return gbsVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r10.a(r6, r9) == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:24:0x0091). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L55
            yio r0 = defpackage.yio.a
            int r4 = r9.b
            if (r4 == 0) goto L1d
            if (r4 == r2) goto L13
            defpackage.ybn.f(r10)
            goto L51
        L13:
            java.lang.Object r2 = r9.a
            java.lang.Object r4 = r9.e
            ysy r4 = (defpackage.ysy) r4
            defpackage.ybn.f(r10)
            goto L3b
        L1d:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.e
            r4 = r10
            ysy r4 = (defpackage.ysy) r4
            ylf r10 = new ylf
            r10.<init>()
            r10.a = r3
            java.lang.Object r5 = r10.a
            r9.e = r4
            r9.a = r10
            r9.b = r2
            java.lang.Object r2 = r4.emit(r5, r9)
            if (r2 == r0) goto L54
            r2 = r10
        L3b:
            java.lang.Object r10 = r9.c
            java.lang.Object r5 = r9.d
            fzk r6 = new fzk
            r6.<init>(r2, r5, r4, r1)
            r9.e = r3
            r9.a = r3
            r9.b = r1
            java.lang.Object r10 = r10.a(r6, r9)
            if (r10 != r0) goto L51
            goto L54
        L51:
            ygi r10 = defpackage.ygi.a
            return r10
        L54:
            return r0
        L55:
            yio r0 = defpackage.yio.a
            int r4 = r9.b
            if (r4 == 0) goto L71
            if (r4 == r2) goto L67
            java.lang.Object r3 = r9.a
            java.lang.Object r4 = r9.e
            yqe r4 = (defpackage.yqe) r4
            defpackage.ybn.f(r10)
            goto L91
        L67:
            java.lang.Object r3 = r9.a
            java.lang.Object r4 = r9.e
            yqe r4 = (defpackage.yqe) r4
            defpackage.ybn.f(r10)
            goto La0
        L71:
            defpackage.ybn.f(r10)
            java.lang.Object r10 = r9.e
            yow r10 = (defpackage.yow) r10
            r4 = 6
            r5 = 0
            yrz r4 = defpackage.vyf.R(r5, r5, r4)
            java.lang.Object r6 = r9.d
            dbv r7 = new dbv
            r8 = 9
            r7.<init>(r4, r6, r3, r8)
            r6 = 3
            yqe r10 = defpackage.ykr.q(r10, r3, r5, r7, r6)
            yrr r3 = r4.C()
            r4 = r10
        L91:
            r9.e = r4
            r9.a = r3
            r9.b = r2
            r10 = r3
            yrr r10 = (defpackage.yrr) r10
            java.lang.Object r10 = r10.a(r9)
            if (r10 == r0) goto Lc4
        La0:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbe
            r10 = r3
            yrr r10 = (defpackage.yrr) r10
            java.lang.Object r10 = r10.b()
            java.lang.Object r5 = r9.c
            r9.e = r4
            r9.a = r3
            r9.b = r1
            java.lang.Object r10 = r5.emit(r10, r9)
            if (r10 != r0) goto L91
            goto Lc4
        Lbe:
            defpackage.ylh.ah(r4)
            ygi r10 = defpackage.ygi.a
            return r10
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbs(ysy ysyVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = ysyVar;
        this.d = yjzVar;
    }
}

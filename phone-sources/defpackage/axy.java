package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axy extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yil yilVar, ysx ysxVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = yilVar;
        this.c = ysxVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((axy) create((bco) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((axy) create((gbt) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((axy) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((axy) create((gbt) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((axy) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.e) {
            case 0:
                axy axyVar = new axy((yjk) this.b, (yjz) this.c, yihVar, 0);
                axyVar.d = obj;
                return axyVar;
            case 1:
                axy axyVar2 = new axy((yqe) this.c, (yjz) this.b, yihVar, 1);
                axyVar2.d = obj;
                return axyVar2;
            case 2:
                axy axyVar3 = new axy((yil) this.b, (ysx) this.c, yihVar, 2);
                axyVar3.d = obj;
                return axyVar3;
            case 3:
                axy axyVar4 = new axy((yqe) this.c, (yjz) this.b, yihVar, 3, (byte[]) null);
                axyVar4.d = obj;
                return axyVar4;
            case 4:
                axy axyVar5 = new axy((ysx) this.c, (yka) this.b, yihVar, 4);
                axyVar5.d = obj;
                return axyVar5;
            case 5:
                axy axyVar6 = new axy((ysx) this.c, (yka) this.b, yihVar, 5, (byte[]) null);
                axyVar6.d = obj;
                return axyVar6;
            case 6:
                axy axyVar7 = new axy((yrz) this.c, (yjz) this.b, yihVar, 6);
                axyVar7.d = obj;
                return axyVar7;
            case 7:
                axy axyVar8 = new axy((yol) this.c, (yjz) this.b, yihVar, 7);
                axyVar8.d = obj;
                return axyVar8;
            case 8:
                axy axyVar9 = new axy((ysy) this.b, (yvl) this.c, yihVar, 8);
                axyVar9.d = obj;
                return axyVar9;
            default:
                axy axyVar10 = new axy((yvp) this.c, (ysy) this.b, yihVar, 9);
                axyVar10.d = obj;
                return axyVar10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        if (r1.a(r2, r10) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0159, code lost:
    
        if (defpackage.ykr.l(r4, r5, r10) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
    
        if (r11.a(r3, r10) == r0) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, ysn] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, ysy] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yjk yjkVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = yjkVar;
        this.c = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yol yolVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yolVar;
        this.b = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yqe yqeVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yqeVar;
        this.b = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yqe yqeVar, yjz yjzVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = yqeVar;
        this.b = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yrz yrzVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yrzVar;
        this.b = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(ysx ysxVar, yka ykaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = ysxVar;
        this.b = ykaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(ysx ysxVar, yka ykaVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.e = i;
        this.c = ysxVar;
        this.b = ykaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(ysy ysyVar, yvl yvlVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.b = ysyVar;
        this.c = yvlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axy(yvp yvpVar, ysy ysyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.e = i;
        this.c = yvpVar;
        this.b = ysyVar;
    }
}

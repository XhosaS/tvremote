package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gat extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gat(gav gavVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = gavVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((gat) create((gbt) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        if (i != 1) {
            return ((gat) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gat) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        int i = this.f;
        if (i == 0) {
            gat gatVar = new gat((gav) this.d, yihVar, 0);
            gatVar.e = obj;
            return gatVar;
        }
        if (i != 1) {
            gat gatVar2 = new gat((gav) this.d, yihVar, 2, null);
            gatVar2.e = obj;
            return gatVar2;
        }
        gat gatVar3 = new gat((ty) this.d, yihVar, 1);
        gatVar3.e = obj;
        return gatVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r1.emit(r3, r14) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136 A[Catch: CancellationException -> 0x0164, TryCatch #3 {CancellationException -> 0x0164, blocks: (B:55:0x0112, B:58:0x012e, B:60:0x0136, B:63:0x014c, B:65:0x0150, B:35:0x009b), top: B:114:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c A[Catch: CancellationException -> 0x0164, TryCatch #3 {CancellationException -> 0x0164, blocks: (B:55:0x0112, B:58:0x012e, B:60:0x0136, B:63:0x014c, B:65:0x0150, B:35:0x009b), top: B:114:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0228  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0161 -> B:40:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0173 -> B:40:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0176 -> B:40:0x00bf). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gat.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gat(gav gavVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.f = i;
        this.d = gavVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gat(ty tyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = tyVar;
    }
}

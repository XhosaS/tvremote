package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gau extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ gav e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gav gavVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = gavVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gau) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((gau) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        return this.f != 0 ? new gau(this.e, yihVar, 1, null) : new gau(this.e, yihVar, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (((defpackage.gav) r5).a(r10, r2, r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        if (((defpackage.gav) r5).a(r10, r2, r9) == r0) goto L37;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gau.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gau(gav gavVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.f = i;
        this.e = gavVar;
    }
}

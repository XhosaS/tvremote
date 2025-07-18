package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbe extends yiz implements yjz {
    int a;
    final /* synthetic */ gbg b;
    final /* synthetic */ fus c;
    final /* synthetic */ cvi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbe(fus fusVar, gbg gbgVar, cvi cviVar, yih yihVar) {
        super(2, yihVar);
        this.c = fusVar;
        this.b = gbgVar;
        this.d = cviVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gbe) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new gbe(this.c, this.b, this.d, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r1.d(r1, r2, r3, true, r6, (defpackage.cb) r0.a, r10) == r8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r0.c() == r8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014b, code lost:
    
        if (r0.c() == r8) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, yva] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

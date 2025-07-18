package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmt extends yiz implements yjz {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cmv c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmt(boolean z, cmv cmvVar, long j, yih yihVar) {
        super(2, yihVar);
        this.b = z;
        this.c = cmvVar;
        this.d = j;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmt) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new cmt(this.b, this.c, this.d, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r10 == r0) goto L14;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            yio r0 = defpackage.yio.a
            int r1 = r9.a
            r2 = 1
            defpackage.ybn.f(r10)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L3d
        Ld:
            r6 = r9
            goto L25
        Lf:
            boolean r10 = r9.b
            if (r10 != 0) goto L2a
            cmv r10 = r9.c
            long r6 = r9.d
            r9.a = r2
            bse r3 = r10.b
            r4 = 0
            r8 = r9
            java.lang.Object r10 = r3.d(r4, r6, r8)
            r6 = r8
            if (r10 == r0) goto L3c
        L25:
            cmm r10 = (defpackage.cmm) r10
            long r0 = r10.a
            goto L41
        L2a:
            r6 = r9
            cmv r10 = r6.c
            long r2 = r6.d
            r1 = 2
            r6.a = r1
            bse r1 = r10.b
            r4 = 0
            java.lang.Object r10 = r1.d(r2, r4, r6)
            if (r10 != r0) goto L3d
        L3c:
            return r0
        L3d:
            cmm r10 = (defpackage.cmm) r10
            long r0 = r10.a
        L41:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

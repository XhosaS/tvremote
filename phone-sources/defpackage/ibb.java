package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibb extends yiz implements yjz {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ yol c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibb(yol yolVar, boolean z, yih yihVar) {
        super(2, yihVar);
        this.c = yolVar;
        this.b = z;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ibb) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ibb ibbVar = new ibb(this.c, this.b, yihVar);
        ibbVar.d = obj;
        return ibbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.emit(r4, r3) == r0) goto L15;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            yio r0 = defpackage.yio.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ybn.f(r4)
            goto L41
        Ld:
            java.lang.Object r1 = r3.d
            ysy r1 = (defpackage.ysy) r1
            defpackage.ybn.f(r4)
            goto L2b
        L15:
            defpackage.ybn.f(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            ysy r1 = (defpackage.ysy) r1
            yol r4 = r3.c
            if (r4 == 0) goto L2b
            r3.d = r1
            r3.a = r2
            java.lang.Object r4 = r4.z(r3)
            if (r4 == r0) goto L40
        L2b:
            boolean r4 = r3.b
            if (r4 != 0) goto L41
            iav r4 = new iav
            r4.<init>()
            r2 = 0
            r3.d = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.emit(r4, r3)
            if (r4 != r0) goto L41
        L40:
            return r0
        L41:
            ygi r4 = defpackage.ygi.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

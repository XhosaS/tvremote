package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agq extends yiy implements yjz {
    int a;
    final /* synthetic */ yjv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agq(yjv yjvVar, yih yihVar) {
        super(yihVar);
        this.b = yjvVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agq) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        agq agqVar = new agq(this.b, yihVar);
        agqVar.c = obj;
        return agqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            yio r0 = defpackage.yio.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ybn.f(r6)
            goto L45
        Ld:
            java.lang.Object r1 = r5.c
            btq r1 = (defpackage.btq) r1
            defpackage.ybn.f(r6)
            goto L27
        L15:
            defpackage.ybn.f(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            btq r1 = (defpackage.btq) r1
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = defpackage.ht.A(r1, r5)
            if (r6 == r0) goto L4f
        L27:
            bsz r6 = (defpackage.bsz) r6
            r6.b()
            yjv r2 = r5.b
            long r3 = r6.c
            bmx r6 = new bmx
            r6.<init>(r3)
            r2.a(r6)
            r6 = 0
            r5.c = r6
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.wf.i(r1, r5)
            if (r6 != r0) goto L45
            goto L4f
        L45:
            bsz r6 = (defpackage.bsz) r6
            if (r6 == 0) goto L4c
            r6.b()
        L4c:
            ygi r6 = defpackage.ygi.a
            return r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class us extends yiy implements yjz {
    Object a;
    int b;
    final /* synthetic */ yjk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(yjk yjkVar, yih yihVar) {
        super(yihVar);
        this.c = yjkVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((us) create((ymy) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        us usVar = new us(this.c, yihVar);
        usVar.d = obj;
        return usVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:12:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            yio r0 = defpackage.yio.a
            int r1 = r3.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r3.d
            ymy r2 = (defpackage.ymy) r2
            defpackage.ybn.f(r4)
            goto L2f
        L10:
            defpackage.ybn.f(r4)
            java.lang.Object r4 = r3.d
            ymy r4 = (defpackage.ymy) r4
            r2 = r4
        L18:
            yjk r4 = r3.c
            java.lang.Object r1 = r4.a()
            if (r1 == 0) goto L2e
            r3.d = r2
            r3.a = r1
            r4 = 1
            r3.b = r4
            java.lang.Object r4 = r2.a(r1, r3)
            if (r4 != r0) goto L2f
            return r0
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            goto L18
        L32:
            ygi r4 = defpackage.ygi.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

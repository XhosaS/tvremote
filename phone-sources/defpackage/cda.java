package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cda extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ yrz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cda(yrz yrzVar, yih yihVar) {
        super(2, yihVar);
        this.d = yrzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cda) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new cda(this.d, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:5:0x000a, B:12:0x0029, B:14:0x0031, B:9:0x0018, B:8:0x0013), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            yio r0 = defpackage.yio.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.ybn.f(r5)     // Catch: java.lang.Throwable -> L4b
            goto L29
        Le:
            defpackage.ybn.f(r5)
            yrz r2 = r4.d
            yrr r5 = r2.C()     // Catch: java.lang.Throwable -> L4b
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L4b
            r4.b = r1     // Catch: java.lang.Throwable -> L4b
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L4b
            r5 = r1
            yrr r5 = (defpackage.yrr) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> L4b
            if (r5 != r0) goto L29
            return r0
        L29:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L44
            r5 = r1
            yrr r5 = (defpackage.yrr) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L4b
            ygi r5 = (defpackage.ygi) r5     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.cdb.b     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L4b
            defpackage.bcm.A()     // Catch: java.lang.Throwable -> L4b
            goto L18
        L44:
            r5 = 0
            defpackage.vyf.Q(r2, r5)
            ygi r5 = defpackage.ygi.a
            return r5
        L4b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            defpackage.vyf.Q(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cda.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

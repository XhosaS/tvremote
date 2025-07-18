package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iot extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ yrq e;
    final /* synthetic */ iov f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iot(yrq yrqVar, iov iovVar, yih yihVar) {
        super(2, yihVar);
        this.e = yrqVar;
        this.f = iovVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iot) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new iot(this.e, this.f, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:6:0x000f, B:19:0x004f, B:13:0x0029, B:16:0x003d, B:18:0x0045, B:21:0x0058, B:9:0x001a, B:12:0x0025), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:6:0x000f, B:19:0x004f, B:13:0x0029, B:16:0x003d, B:18:0x0045, B:21:0x0058, B:9:0x001a, B:12:0x0025), top: B:32:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0045 -> B:7:0x0012). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            yio r0 = defpackage.yio.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L14
            java.lang.Object r1 = r6.c
            java.lang.Object r3 = r6.b
            java.lang.Object r4 = r6.a
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L73
        L12:
            r7 = r4
            goto L4f
        L14:
            java.lang.Object r1 = r6.c
            java.lang.Object r3 = r6.b
            java.lang.Object r4 = r6.a
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L73
            goto L3d
        L1e:
            defpackage.ybn.f(r7)
            yrq r3 = r6.e
            iov r7 = r6.f
            yrr r1 = r3.C()     // Catch: java.lang.Throwable -> L73
        L29:
            r6.a = r7     // Catch: java.lang.Throwable -> L73
            r6.b = r3     // Catch: java.lang.Throwable -> L73
            r6.c = r1     // Catch: java.lang.Throwable -> L73
            r6.d = r2     // Catch: java.lang.Throwable -> L73
            r4 = r1
            yrr r4 = (defpackage.yrr) r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r4.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r4 == r0) goto L72
            r5 = r4
            r4 = r7
            r7 = r5
        L3d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L73
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L6b
            r7 = r1
            yrr r7 = (defpackage.yrr) r7     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L73
            ygi r7 = (defpackage.ygi) r7     // Catch: java.lang.Throwable -> L73
            goto L12
        L4f:
            r4 = r7
            iov r4 = (defpackage.iov) r4     // Catch: java.lang.Throwable -> L73
            boolean r4 = r4.f()     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L29
            r6.a = r7     // Catch: java.lang.Throwable -> L73
            r6.b = r3     // Catch: java.lang.Throwable -> L73
            r6.c = r1     // Catch: java.lang.Throwable -> L73
            r4 = 2
            r6.d = r4     // Catch: java.lang.Throwable -> L73
            r4 = r7
            iov r4 = (defpackage.iov) r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r4.b(r6)     // Catch: java.lang.Throwable -> L73
            if (r4 != r0) goto L4f
            goto L72
        L6b:
            r7 = 0
            defpackage.vyf.Q(r3, r7)
            ygi r7 = defpackage.ygi.a
            return r7
        L72:
            return r0
        L73:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            defpackage.vyf.Q(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iot.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

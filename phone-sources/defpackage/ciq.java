package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciq implements bdy {
    public boolean a = true;
    public final cxe b;
    private final List c;
    private final cjr d;
    private final yjv e;
    private final bcb f;
    private final dfb g;

    public ciq(List list, Object obj, cjr cjrVar, dfb dfbVar, yjv yjvVar, cxe cxeVar) {
        this.c = list;
        this.d = cjrVar;
        this.g = dfbVar;
        this.e = yjvVar;
        this.b = cxeVar;
        this.f = new bci(obj, bcz.c);
    }

    @Override // defpackage.bdy
    public final Object a() {
        return this.f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (defpackage.yoz.r(r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00af, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00af, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0085, B:33:0x00af, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:39:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00bd -> B:39:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciq.b(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.cix r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cip
            if (r0 == 0) goto L13
            r0 = r7
            cip r0 = (defpackage.cip) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cip r0 = new cip
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            return r7
        L2a:
            r7 = move-exception
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.ybn.f(r7)
            aoa r7 = new aoa     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r2 = 20
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = defpackage.yoz.t(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L75
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r6
        L4c:
            yil r1 = r0.getContext()
            bbx r2 = kotlinx.coroutines.CoroutineExceptionHandler.d
            yij r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 != 0) goto L5b
            goto L80
        L5b:
            yil r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "Unable to load font "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            return r4
        L75:
            r6 = move-exception
            yil r7 = r0.getContext()
            boolean r7 = defpackage.yoz.B(r7)
            if (r7 == 0) goto L81
        L80:
            return r4
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciq.c(cix, yih):java.lang.Object");
    }
}

package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcg implements dau {
    public final yjk a;
    public final cvi c;
    private final File d;
    private final dcn e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final yyk f = new yyk();

    public dcg(File file, dcn dcnVar, cvi cviVar, yjk yjkVar) {
        this.d = file;
        this.e = dcnVar;
        this.c = cviVar;
        this.a = yjkVar;
    }

    private final void d() {
        if (this.b.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.dau
    public final void a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006f, blocks: (B:30:0x006e, B:40:0x007f, B:39:0x007c, B:36:0x0077), top: B:56:0x001f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [yka] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yka r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dce
            if (r0 == 0) goto L13
            r0 = r9
            dce r0 = (defpackage.dce) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dce r0 = new dce
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r8 = r0.a
            dcc r0 = r0.e
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r9 = move-exception
            goto L77
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.ybn.f(r9)
            r7.d()
            yyk r9 = r7.f
            boolean r9 = r9.c()
            dcc r2 = new dcc     // Catch: java.lang.Throwable -> L84
            java.io.File r4 = r7.d     // Catch: java.lang.Throwable -> L84
            dcn r5 = r7.e     // Catch: java.lang.Throwable -> L84
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L72
            r0.e = r2     // Catch: java.lang.Throwable -> L72
            r0.a = r9     // Catch: java.lang.Throwable -> L72
            r0.d = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = r8.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r8 == r1) goto L71
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r2
        L5e:
            r0.a()     // Catch: java.lang.Throwable -> L63
            r0 = 0
            goto L64
        L63:
            r0 = move-exception
        L64:
            if (r0 != 0) goto L6e
            if (r8 == 0) goto L6d
            yyk r8 = r7.f
            r8.d()
        L6d:
            return r9
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r9 = move-exception
            goto L80
        L71:
            return r1
        L72:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r2
        L77:
            r0.a()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r0 = move-exception
            defpackage.ybn.h(r9, r0)     // Catch: java.lang.Throwable -> L6f
        L7f:
            throw r9     // Catch: java.lang.Throwable -> L6f
        L80:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L85
        L84:
            r8 = move-exception
        L85:
            if (r9 == 0) goto L8c
            yyk r9 = r7.f
            r9.d()
        L8c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcg.b(yka, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9 A[Catch: all -> 0x012c, IOException -> 0x012e, TRY_ENTER, TryCatch #6 {all -> 0x012c, blocks: (B:38:0x00c9, B:40:0x00cf, B:44:0x00db, B:50:0x00f6, B:51:0x0116, B:47:0x00ef, B:54:0x011d, B:61:0x012b, B:60:0x0128), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d A[Catch: all -> 0x012c, IOException -> 0x012e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x012c, blocks: (B:38:0x00c9, B:40:0x00cf, B:44:0x00db, B:50:0x00f6, B:51:0x0116, B:47:0x00ef, B:54:0x011d, B:61:0x012b, B:60:0x0128), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yjz r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcg.c(yjz, yih):java.lang.Object");
    }
}

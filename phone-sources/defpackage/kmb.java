package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmb implements kmj {
    private final Context a;
    private final xjk b;
    private final ldv c;
    private final lie d;
    private final mdw e;
    private final isy f;

    public kmb(Context context, mdw mdwVar, isy isyVar, xjk xjkVar, ldv ldvVar, lie lieVar) {
        mdwVar.getClass();
        isyVar.getClass();
        ldvVar.getClass();
        lieVar.getClass();
        this.a = context;
        this.e = mdwVar;
        this.f = isyVar;
        this.b = xjkVar;
        this.c = ldvVar;
        this.d = lieVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        if (r10 == r1) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x002a, B:65:0x012c, B:18:0x003d, B:43:0x009e, B:45:0x00b7, B:51:0x00c9, B:53:0x00cd, B:55:0x00d5, B:56:0x00d8, B:58:0x00e9, B:60:0x00f6, B:61:0x010f, B:63:0x0128, B:46:0x00bc, B:48:0x00c0, B:49:0x00c5, B:69:0x0137), top: B:74:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x002a, B:65:0x012c, B:18:0x003d, B:43:0x009e, B:45:0x00b7, B:51:0x00c9, B:53:0x00cd, B:55:0x00d5, B:56:0x00d8, B:58:0x00e9, B:60:0x00f6, B:61:0x010f, B:63:0x0128, B:46:0x00bc, B:48:0x00c0, B:49:0x00c5, B:69:0x0137), top: B:74:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x002a, B:65:0x012c, B:18:0x003d, B:43:0x009e, B:45:0x00b7, B:51:0x00c9, B:53:0x00cd, B:55:0x00d5, B:56:0x00d8, B:58:0x00e9, B:60:0x00f6, B:61:0x010f, B:63:0x0128, B:46:0x00bc, B:48:0x00c0, B:49:0x00c5, B:69:0x0137), top: B:74:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x002a, B:65:0x012c, B:18:0x003d, B:43:0x009e, B:45:0x00b7, B:51:0x00c9, B:53:0x00cd, B:55:0x00d5, B:56:0x00d8, B:58:0x00e9, B:60:0x00f6, B:61:0x010f, B:63:0x0128, B:46:0x00bc, B:48:0x00c0, B:49:0x00c5, B:69:0x0137), top: B:74:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0128 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x002a, B:65:0x012c, B:18:0x003d, B:43:0x009e, B:45:0x00b7, B:51:0x00c9, B:53:0x00cd, B:55:0x00d5, B:56:0x00d8, B:58:0x00e9, B:60:0x00f6, B:61:0x010f, B:63:0x0128, B:46:0x00bc, B:48:0x00c0, B:49:0x00c5, B:69:0x0137), top: B:74:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.kmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.work.WorkerParameters r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmb.a(androidx.work.WorkerParameters, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (defpackage.cwm.A(r7, r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.kma
            if (r0 == 0) goto L13
            r0 = r8
            kma r0 = (defpackage.kma) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kma r0 = new kma
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ybn.f(r8)
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ybn.f(r8)
            goto L70
        L39:
            boolean r7 = r0.a
            defpackage.ybn.f(r8)
            goto L55
        L3f:
            defpackage.ybn.f(r8)
            android.content.Context r8 = r6.a
            dlr r2 = new dlr
            r2.<init>(r8)
            r0.a = r7
            r0.d = r5
            java.lang.Class<klm> r8 = defpackage.klm.class
            java.lang.Object r8 = r2.b(r8, r0)
            if (r8 == r1) goto L91
        L55:
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L89
            xjk r8 = r6.b
            boolean r8 = r8.a()
            if (r8 != 0) goto L66
            goto L89
        L66:
            mdw r8 = r6.e
            r0.d = r4
            java.lang.Object r7 = r8.g(r7, r0)
            if (r7 == r1) goto L91
        L70:
            mdw r7 = r6.e
            r8 = 0
            r7.h(r8)
            klm r7 = new klm
            r7.<init>()
            android.content.Context r8 = r6.a
            r0.d = r3
            java.lang.Object r7 = defpackage.cwm.A(r7, r8, r0)
            if (r7 != r1) goto L86
            goto L91
        L86:
            ygi r7 = defpackage.ygi.a
            return r7
        L89:
            isy r7 = r6.f
            r7.m()
            ygi r7 = defpackage.ygi.a
            return r7
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmb.b(boolean, yih):java.lang.Object");
    }
}

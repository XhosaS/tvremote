package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qew implements qeq {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final qnr c;
    private final qdq d;
    private final qol e;
    private final qhm f;
    private final qoj g;
    private final Set h;
    private final tst i;
    private final yyh j;

    public qew(Context context, qnr qnrVar, qdq qdqVar, qol qolVar, qhm qhmVar, qoj qojVar, yyh yyhVar, Set set, tst tstVar) {
        qojVar.getClass();
        set.getClass();
        this.b = context;
        this.c = qnrVar;
        this.d = qdqVar;
        this.e = qolVar;
        this.f = qhmVar;
        this.g = qojVar;
        this.j = yyhVar;
        this.h = set;
        this.i = tstVar;
    }

    private final void h(boolean z) {
        ((snf) this.g.z.get()).b(this.b.getPackageName(), Boolean.valueOf(z));
    }

    @Override // defpackage.qeq
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qmt] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, qor] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v0, types: [qew] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0156 -> B:46:0x015c). Please report as a decompilation issue!!! */
    @Override // defpackage.qeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r22, defpackage.qdo r23, long r24, defpackage.yih r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qew.b(android.content.Intent, qdo, long, yih):java.lang.Object");
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        ykr.n(yim.a, new dsk(this, intent, qdoVar, j, (yih) null, 4));
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        return yks.e("android.accounts.LOGIN_ACCOUNTS_CHANGED", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r6, defpackage.yih r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qes
            if (r0 == 0) goto L13
            r0 = r7
            qes r0 = (defpackage.qes) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qes r0 = new qes
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ybn.f(r7)
            qdq r7 = r5.d
            qpv r6 = r6.b()
            r0.c = r3
            qds r2 = new qds
            qdu r7 = (defpackage.qdu) r7
            r4 = 0
            r2.<init>(r7, r6, r4)
            yil r6 = r7.c
            java.lang.Object r7 = defpackage.ykr.l(r6, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            qoj r6 = r5.g
            android.content.Context r0 = r5.b
            qdl r7 = (defpackage.qdl) r7
            java.lang.String r0 = r0.getPackageName()
            boolean r7 = r7.g()
            ttm r6 = r6.A
            java.lang.Object r6 = r6.get()
            snf r6 = (defpackage.snf) r6
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r1[r3] = r7
            r6.b(r1)
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qew.e(qen, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r5, java.util.Set r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.qet
            if (r0 == 0) goto L13
            r0 = r7
            qet r0 = (defpackage.qet) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qet r0 = new qet
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qen r5 = r0.d
            defpackage.ybn.f(r7)
            goto L70
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            qpv r7 = r5.b()
            boolean r2 = r7 instanceof defpackage.qpz
            if (r2 == 0) goto L49
            qpv r5 = r5.b()
            qpz r5 = (defpackage.qpz) r5
            java.lang.String r5 = r5.a
            boolean r3 = r6.contains(r5)
            goto L87
        L49:
            boolean r2 = r7 instanceof defpackage.qpw
            if (r2 == 0) goto L54
            java.lang.String r5 = r5.d
            boolean r3 = defpackage.yfm.as(r6, r5)
            goto L87
        L54:
            boolean r6 = r7 instanceof defpackage.qpx
            if (r6 == 0) goto L78
            tst r6 = r4.i
            boolean r7 = r6.g()
            if (r7 == 0) goto L87
            java.lang.Object r6 = r6.c()
            qpy r6 = (defpackage.qpy) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r7 = r6.b()
            if (r7 == r1) goto L77
        L70:
            java.lang.String r5 = r5.b
            boolean r3 = defpackage.yks.e(r7, r5)
            goto L87
        L77:
            return r1
        L78:
            boolean r5 = r7 instanceof defpackage.qqn
            if (r5 != 0) goto L87
            boolean r5 = r7 instanceof defpackage.qql
            if (r5 == 0) goto L81
            goto L87
        L81:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        L87:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qew.f(qen, java.util.Set, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x014e, code lost:
    
        if (r1 != r3) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ca -> B:24:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x014e -> B:43:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.qen r18, defpackage.qen r19, defpackage.yih r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qew.g(qen, qen, yih):java.lang.Object");
    }
}

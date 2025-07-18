package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ilf implements ijf {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (((defpackage.ilf) r13).b(r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object i(defpackage.ilf r12, defpackage.imi[] r13, defpackage.yih r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ile
            if (r0 == 0) goto L13
            r0 = r14
            ile r0 = (defpackage.ile) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ile r0 = new ile
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            defpackage.ybn.f(r14)
            goto Lb5
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.Object r12 = r0.b
            java.lang.Object r13 = r0.a
            defpackage.ybn.f(r14)
            goto L98
        L3c:
            defpackage.ybn.f(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r13.length
            r7 = r4
        L4b:
            if (r7 >= r6) goto L6f
            r8 = r13[r7]
            boolean r9 = r8.d
            if (r9 != 0) goto L69
            java.util.Set r9 = defpackage.imi.a
            wog r10 = r8.e
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L69
            boolean r9 = r8.f
            if (r9 != 0) goto L69
            boolean r9 = r8.g
            if (r9 != 0) goto L69
            r14.add(r8)
            goto L6c
        L69:
            r2.add(r8)
        L6c:
            int r7 = r7 + 1
            goto L4b
        L6f:
            yfw r13 = new yfw
            r13.<init>(r14, r2)
            java.lang.Object r14 = r13.a
            java.lang.Object r13 = r13.b
            java.util.List r14 = (java.util.List) r14
            java.util.List r13 = (java.util.List) r13
            imi[] r2 = new defpackage.imi[r4]
            java.lang.Object[] r14 = r14.toArray(r2)
            imi[] r14 = (defpackage.imi[]) r14
            int r2 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r2)
            r0.a = r12
            r0.b = r13
            r0.e = r5
            java.lang.Object r14 = r12.a(r14, r0)
            if (r14 == r1) goto Lb8
            r11 = r13
            r13 = r12
            r12 = r11
        L98:
            imi[] r14 = new defpackage.imi[r4]
            java.lang.Object[] r12 = r12.toArray(r14)
            imi[] r12 = (defpackage.imi[]) r12
            int r14 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r14)
            r14 = 0
            r0.a = r14
            r0.b = r14
            r0.e = r3
            ilf r13 = (defpackage.ilf) r13
            java.lang.Object r12 = r13.b(r12, r0)
            if (r12 != r1) goto Lb5
            goto Lb8
        Lb5:
            ygi r12 = defpackage.ygi.a
            return r12
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilf.i(ilf, imi[], yih):java.lang.Object");
    }

    public abstract Object f(String str, List list, yih yihVar);

    public Object g(imi[] imiVarArr, yih yihVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r5, defpackage.wll r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ild
            if (r0 == 0) goto L13
            r0 = r7
            ild r0 = (defpackage.ild) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ild r0 = new ild
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wll r6 = r0.e
            java.lang.String r5 = r0.d
            defpackage.ybn.f(r7)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r7)
            java.util.List r7 = defpackage.yfm.p(r6)
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r4.f(r5, r7, r0)
            if (r7 == r1) goto L59
        L46:
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L54
            imi r7 = new imi
            r7.<init>(r5, r6)
            return r7
        L54:
            java.lang.Object r5 = defpackage.yfm.S(r7)
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilf.h(java.lang.String, wll, yih):java.lang.Object");
    }
}

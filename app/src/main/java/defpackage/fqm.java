package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqm {
    public final fxu a;
    public Map b;
    private final fqh c;

    public fqm(fqh fqhVar, fxu fxuVar) {
        fxuVar.getClass();
        this.c = fqhVar;
        this.a = fxuVar;
        this.b = agre.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.fqm r4, defpackage.agsw r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fql
            if (r0 == 0) goto L13
            r0 = r5
            fql r0 = (defpackage.fql) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            fql r0 = new fql
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fqm r4 = r0.c
            defpackage.agpl.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.agpl.b(r5)
            fqh r5 = r4.c
            r0.c = r4
            r0.b = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.Map r5 = (java.util.Map) r5
            r4.b = r5
            agpu r4 = defpackage.agpu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqm.a(fqm, agsw):java.lang.Object");
    }
}

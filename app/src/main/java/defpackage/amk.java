package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amk extends apd {
    public List a;
    final /* synthetic */ ano b;

    public amk(ano anoVar, List list) {
        this.b = anoVar;
        this.a = agqq.x(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.apd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object a(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.amg
            if (r0 == 0) goto L13
            r0 = r7
            amg r0 = (defpackage.amg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amg r0 = new amg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.agpl.b(r7)
            goto L66
        L36:
            defpackage.agpl.b(r7)
            java.util.List r7 = r6.a
            if (r7 == 0) goto L5b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L44
            goto L5b
        L44:
            ano r7 = r6.b
            aof r2 = r7.b()
            amj r4 = new amj
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.c = r3
            java.lang.Object r7 = r2.c(r4, r0)
            if (r7 == r1) goto L72
        L58:
            alt r7 = (defpackage.alt) r7
            goto L68
        L5b:
            ano r7 = r6.b
            r0.c = r4
            r2 = 0
            java.lang.Object r7 = r7.i(r2, r0)
            if (r7 == r1) goto L72
        L66:
            alt r7 = (defpackage.alt) r7
        L68:
            ano r0 = r6.b
            anp r0 = r0.d
            r0.b(r7)
            agpu r7 = defpackage.agpu.a
            return r7
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amk.a(agsw):java.lang.Object");
    }
}

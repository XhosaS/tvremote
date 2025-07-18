package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysq implements ysx {
    private final yjz a;

    public ysq() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ysx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ysy r6, defpackage.yih r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ysp
            if (r0 == 0) goto L13
            r0 = r7
            ysp r0 = (defpackage.ysp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysp r0 = new ysp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ywa r6 = r0.d
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r7 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ybn.f(r7)
            ywa r7 = new ywa
            yil r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.d = r7     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            yjz r6 = r5.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r6 == r1) goto L4d
            ygi r6 = defpackage.ygi.a     // Catch: java.lang.Throwable -> L57
        L4d:
            if (r6 == r1) goto L56
            r6 = r7
        L50:
            r6.releaseIntercepted()
            ygi r6 = defpackage.ygi.a
            return r6
        L56:
            return r1
        L57:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5b:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysq.a(ysy, yih):java.lang.Object");
    }

    public ysq(yjz yjzVar) {
        this.a = yjzVar;
    }
}

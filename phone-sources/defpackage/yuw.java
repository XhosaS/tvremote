package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuw implements ysy {
    final /* synthetic */ ylb a;
    final /* synthetic */ ysy b;

    public yuw(ylb ylbVar, ysy ysyVar) {
        this.a = ylbVar;
        this.b = ysyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yuv
            if (r0 == 0) goto L13
            r0 = r6
            yuv r0 = (defpackage.yuv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yuv r0 = new yuv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            if (r5 <= 0) goto L49
            ylb r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto L49
            r5.a = r3
            ysy r5 = r4.b
            yus r6 = defpackage.yus.a
            r0.c = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yuw.a(int, yih):java.lang.Object");
    }

    @Override // defpackage.ysy
    public final /* bridge */ /* synthetic */ Object emit(Object obj, yih yihVar) {
        return a(((Number) obj).intValue(), yihVar);
    }
}

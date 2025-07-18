package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yrd extends yxl implements Runnable {
    public final long b;

    public yrd(long j, yih yihVar) {
        super(yihVar.getContext(), yihVar);
        this.b = j;
    }

    @Override // defpackage.ynw, defpackage.yql
    public final String h() {
        return super.h() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            yil r0 = r5.a
            ypd r0 = defpackage.yoz.h(r0)
            boolean r1 = r0 instanceof defpackage.ypf
            if (r1 == 0) goto Ld
            ypf r0 = (defpackage.ypf) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.ynm.a
            yno r3 = defpackage.yno.c
            defpackage.ylh.p(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.a.cp(r1, r0, r3)
        L27:
            yrc r1 = new yrc
            r1.<init>(r0, r5)
            r5.M(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yrd.run():void");
    }
}

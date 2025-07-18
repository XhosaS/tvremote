package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agfv implements Runnable {
    final Runnable a;
    final aghg b;
    final long c;
    long d;
    long e;
    long f;
    final /* synthetic */ agfw g;

    public agfv(agfw agfwVar, long j, Runnable runnable, long j2, aghg aghgVar, long j3) {
        this.g = agfwVar;
        this.a = runnable;
        this.b = aghgVar;
        this.c = j3;
        this.e = j2;
        this.f = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.Runnable r0 = r12.a
            r0.run()
            aghg r0 = r12.b
            java.lang.Object r1 = r0.get()
            aggi r1 = (defpackage.aggi) r1
            boolean r1 = defpackage.aghd.b(r1)
            if (r1 != 0) goto L55
            agfw r1 = r12.g
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r2 = r1.a(r2)
            long r4 = defpackage.agfx.a
            long r6 = r2 + r4
            long r8 = r12.e
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r10 = 1
            if (r6 < 0) goto L3a
            long r6 = r12.c
            long r8 = r8 + r6
            long r8 = r8 + r4
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 < 0) goto L30
            goto L3a
        L30:
            long r4 = r12.f
            long r8 = r12.d
            long r8 = r8 + r10
            r12.d = r8
            long r8 = r8 * r6
            long r4 = r4 + r8
            goto L49
        L3a:
            long r4 = r12.c
            long r6 = r12.d
            long r6 = r6 + r10
            r12.d = r6
            long r8 = r2 + r4
            long r4 = r4 * r6
            long r4 = r8 - r4
            r12.f = r4
            r4 = r8
        L49:
            r12.e = r2
            long r4 = r4 - r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            aggi r1 = r1.b(r12, r4, r2)
            defpackage.aghd.g(r0, r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfv.run():void");
    }
}

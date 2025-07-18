package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahen extends ahmc implements Runnable {
    public final long b;

    public ahen(long j, agsw agswVar) {
        super(agswVar.fr(), agswVar);
        this.b = j;
    }

    @Override // defpackage.ahab, defpackage.ahdv
    public final String fv() {
        return super.fv() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r5 = this;
            agte r0 = r5.a
            ahcd r0 = defpackage.ahce.d(r0)
            boolean r1 = r0 instanceof defpackage.ahcf
            if (r1 == 0) goto Ld
            ahcf r0 = (defpackage.ahcf) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.agzn.a
            agzq r3 = defpackage.agzq.c
            defpackage.agzp.b(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L32
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Timed out waiting for "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            ahem r1 = new ahem
            r1.<init>(r0, r5)
            r5.K(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahen.run():void");
    }
}

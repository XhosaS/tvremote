package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vm implements bsb {
    public boolean a;
    private final vx b;

    public vm(vx vxVar, boolean z) {
        this.b = vxVar;
        this.a = z;
    }

    @Override // defpackage.bsb
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        vx vxVar = this.b;
        if (vxVar.a.j()) {
            return 0L;
        }
        return vxVar.f(vxVar.a(vxVar.a.a(vxVar.a(vxVar.b(j2)))));
    }

    @Override // defpackage.bsb
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r5, long r7, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.vl
            if (r5 == 0) goto L13
            r5 = r9
            vl r5 = (defpackage.vl) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L18
        L13:
            vl r5 = new vl
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.b
            yio r9 = defpackage.yio.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r7 = r5.a
            defpackage.ybn.f(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            boolean r6 = r4.a
            r2 = 0
            if (r6 == 0) goto L55
            vx r6 = r4.b
            boolean r0 = r6.f
            if (r0 == 0) goto L41
            goto L4f
        L41:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r6.g(r7, r5)
            if (r6 == r9) goto L54
        L4b:
            cmm r6 = (defpackage.cmm) r6
            long r2 = r6.a
        L4f:
            long r2 = defpackage.a.at(r7, r2)
            goto L55
        L54:
            return r9
        L55:
            cmm r5 = new cmm
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm.c(long, long, yih):java.lang.Object");
    }

    @Override // defpackage.bsb
    public final /* synthetic */ Object d(long j, yih yihVar) {
        return new cmm(0L);
    }
}

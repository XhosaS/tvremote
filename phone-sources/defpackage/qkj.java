package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkj implements qjl {
    private static final tvn b = tvn.n("GnpSdk");
    public final long a;
    private final yfo c;
    private final qei d;
    private final qjm e;
    private final String f;
    private final cb g;

    public qkj(yfo yfoVar, qei qeiVar, cb cbVar, qjm qjmVar) {
        yfoVar.getClass();
        qeiVar.getClass();
        qjmVar.getClass();
        this.c = yfoVar;
        this.d = qeiVar;
        this.g = cbVar;
        this.e = qjmVar;
        this.f = "GNP_PERIODIC_REGISTRATION";
        this.a = qeiVar.i * 86400 * 1000;
    }

    @Override // defpackage.qjl
    public final int a() {
        return 17;
    }

    @Override // defpackage.qjl
    public final long b() {
        return this.a;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r6.a(17, null, r5) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, qqe] */
    @Override // defpackage.qjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.os.Bundle r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof defpackage.qki
            if (r5 == 0) goto L13
            r5 = r6
            qki r5 = (defpackage.qki) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            qki r5 = new qki
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L36
            if (r1 == r2) goto L32
            if (r1 != r3) goto L2a
            defpackage.ybn.f(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.ybn.f(r6)
            goto L72
        L36:
            defpackage.ybn.f(r6)
            tvn r6 = defpackage.qkj.b
            tuv r6 = r6.l()
            java.lang.String r1 = "Executing GnpPeriodicRegistrationJob"
            r6.s(r1)
            cb r6 = r4.g
            int r6 = r6.N()
            if (r6 != r3) goto L65
            qei r6 = r4.d
            int r6 = r6.i
            if (r6 != 0) goto L53
            goto L65
        L53:
            yfo r6 = r4.c
            java.lang.Object r6 = r6.b()
            vmd r1 = defpackage.vmd.PERIODIC_REGISTRATION
            r5.c = r3
            java.lang.Object r5 = defpackage.qtl.r(r6, r1, r5)
            if (r5 != r0) goto L64
            goto L71
        L64:
            return r5
        L65:
            qjm r6 = r4.e
            r5.c = r2
            r1 = 17
            java.lang.Object r5 = defpackage.osk.R(r6, r1, r5)
            if (r5 != r0) goto L72
        L71:
            return r0
        L72:
            qdn r5 = new qdn
            ygi r6 = defpackage.ygi.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkj.d(android.os.Bundle, yih):java.lang.Object");
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.f;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return true;
    }

    @Override // defpackage.qjl
    public final int h() {
        return 2;
    }

    @Override // defpackage.qjl
    public final int i() {
        return 1;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxf implements gwz {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/account/state/AutoLogoutHandlerImpl");
    public final iax b;
    public final ahbt c;
    public final gtu d;
    public final fuk e;
    public final agow f;
    public final idl g;
    public final fcu h;
    public final igs i;
    private final frl j;
    private final boolean k;
    private final fda l;
    private final agow m;
    private final gph n;
    private final iaw o;

    public gxf(iax iaxVar, frl frlVar, boolean z, ahbt ahbtVar, fda fdaVar, agow agowVar, gph gphVar, gtu gtuVar, fuk fukVar, agow agowVar2, fcu fcuVar, idl idlVar, igs igsVar) {
        iaxVar.getClass();
        ahbtVar.getClass();
        fdaVar.getClass();
        agowVar.getClass();
        gtuVar.getClass();
        agowVar2.getClass();
        fcuVar.getClass();
        idlVar.getClass();
        igsVar.getClass();
        this.b = iaxVar;
        this.j = frlVar;
        this.k = z;
        this.c = ahbtVar;
        this.l = fdaVar;
        this.m = agowVar;
        this.n = gphVar;
        this.d = gtuVar;
        this.e = fukVar;
        this.f = agowVar2;
        this.h = fcuVar;
        this.g = idlVar;
        this.i = igsVar;
        this.o = new gxd(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r8 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gxa
            if (r0 == 0) goto L13
            r0 = r8
            gxa r0 = (defpackage.gxa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gxa r0 = new gxa
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r8)
            goto L7e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r8)
            agpk r8 = (defpackage.agpk) r8
            java.lang.Object r8 = r8.a
            goto L6b
        L3e:
            defpackage.agpl.b(r8)
            java.lang.String r8 = r7.type
            gtu r8 = r6.d
            boolean r2 = r8.r(r7)
            if (r2 == 0) goto L50
            android.accounts.Account r2 = r8.b(r7)
            goto L51
        L50:
            r2 = r7
        L51:
            if (r2 == 0) goto Lb4
            agow r5 = r6.m
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L74
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 == r1) goto Lb3
        L6b:
            boolean r0 = r8 instanceof defpackage.agpj
            if (r4 != r0) goto L71
            java.lang.String r8 = ""
        L71:
            java.lang.String r8 = (java.lang.String) r8
            goto L80
        L74:
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.e(r2, r0)
            if (r8 == r1) goto Lb3
        L7e:
            java.lang.String r8 = (java.lang.String) r8
        L80:
            int r8 = r8.length()
            if (r8 <= 0) goto Lb4
            iax r8 = r6.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            iaw r0 = r6.o     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            int r1 = defpackage.kcx.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            android.accounts.Account r7 = (android.accounts.Account) r7     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            r8.l(r7, r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            goto Lb4
        L92:
            r7 = move-exception
            zdy r8 = defpackage.gxf.a
            zeo r8 = r8.d()
            zdv r8 = (defpackage.zdv) r8
            zeo r7 = r8.p(r7)
            r8 = 147(0x93, float:2.06E-43)
            java.lang.String r0 = "AutoLogoutHandlerImpl.kt"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/account/state/AutoLogoutHandlerImpl"
            java.lang.String r2 = "checkAuthAndFetchAssistantSettings"
            zeo r7 = r7.q(r1, r2, r8, r0)
            zdv r7 = (defpackage.zdv) r7
            java.lang.String r8 = "Failed to fetch user settings needed for starting Assistant Setup."
            r7.u(r8)
            goto Lb4
        Lb3:
            return r1
        Lb4:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxf.a(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxf.b(agsw):java.lang.Object");
    }
}

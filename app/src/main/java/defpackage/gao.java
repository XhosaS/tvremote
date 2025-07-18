package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gao extends agtu implements agvb {
    int a;
    final /* synthetic */ gar b;
    final /* synthetic */ xgw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gao(gar garVar, xgw xgwVar, agsw agswVar) {
        super(2, agswVar);
        this.b = garVar;
        this.c = xgwVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gao) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r12.endsWith("com.google.android.apps.tv.launcherx") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (defpackage.ahal.a(r12, r3, r11) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        if (r12 == r0) goto L35;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto Lf
            defpackage.agpl.b(r12)
            if (r1 == r3) goto L1e
            goto Le9
        Lf:
            defpackage.agpl.b(r12)
            gar r12 = r11.b
            r11.a = r3
            fmg r12 = r12.k
            java.lang.Object r12 = r12.c(r11)
            if (r12 == r0) goto Lec
        L1e:
            gar r1 = r11.b
            ztw r4 = r1.l
            j$.time.Instant r12 = (j$.time.Instant) r12
            j$.time.Instant r4 = r4.a()
            int r12 = r12.compareTo(r4)
            zdy r4 = defpackage.gar.a
            zeo r5 = r4.b()
            r6 = 130(0x82, float:1.82E-43)
            java.lang.String r7 = "com/google/android/apps/tvsearch/launcher/assistant/redirect/AmbientRedirectActivityPeer$onCreate$1"
            java.lang.String r8 = "invokeSuspend"
            java.lang.String r9 = "AmbientRedirectActivityPeer.kt"
            zeo r5 = r5.q(r7, r8, r6, r9)
            zdv r5 = (defpackage.zdv) r5
            if (r12 < 0) goto L44
            r6 = r3
            goto L45
        L44:
            r6 = 0
        L45:
            java.lang.String r10 = "isTvtsModeActive value is %s"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.x(r10, r6)
            r5 = 0
            if (r12 >= 0) goto Lb6
            kdv r12 = r1.g
            com.google.android.apps.tvsearch.launcher.assistant.redirect.AmbientRedirectActivity r6 = r1.b
            java.lang.String r10 = r6.getCallingPackage()
            kdp r12 = r12.c(r10, r3)
            r12.b()
            boolean r3 = r12.b
            if (r3 != 0) goto Lb6
            java.lang.Throwable r12 = r12.d
            boolean r3 = r12 instanceof android.content.pm.PackageManager.NameNotFoundException
            if (r3 != 0) goto Lb0
            agow r12 = r1.j
            java.lang.Object r12 = r12.a()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L8b
            android.net.Uri r12 = r6.getReferrer()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r12.getClass()
            java.lang.String r3 = "com.google.android.apps.tv.launcherx"
            boolean r12 = r12.endsWith(r3)
            if (r12 != 0) goto Lb6
        L8b:
            zeo r12 = r4.d()
            r3 = 140(0x8c, float:1.96E-43)
            zeo r12 = r12.q(r7, r8, r3, r9)
            zdv r12 = (defpackage.zdv) r12
            java.lang.String r3 = r6.getCallingPackage()
            java.lang.String r4 = "Invalid caller package: %s"
            r12.x(r4, r3)
            agte r12 = r1.d
            gan r3 = new gan
            r3.<init>(r1, r5)
            r11.a = r2
            java.lang.Object r12 = defpackage.ahal.a(r12, r3, r11)
            if (r12 != r0) goto Le9
            goto Lec
        Lb0:
            defpackage.kkk.k(r12)
            android.content.pm.PackageManager$NameNotFoundException r12 = (android.content.pm.PackageManager.NameNotFoundException) r12
            throw r12
        Lb6:
            xgw r12 = r11.c
            r2 = 3
            r11.a = r2
            com.google.android.apps.tvsearch.launcher.assistant.redirect.AmbientRedirectActivity r2 = r1.b
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "discovery_channel"
            r4 = 12
            int r2 = r2.getIntExtra(r3, r4)
            ffk r3 = r1.i
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            r3.p(r12, r4)
            agte r3 = r1.d
            gaq r4 = new gaq
            r4.<init>(r2, r1, r12, r5)
            java.lang.Object r12 = defpackage.ahal.a(r3, r4, r11)
            if (r12 == r0) goto Le6
            agpu r12 = defpackage.agpu.a
        Le6:
            if (r12 != r0) goto Le9
            goto Lec
        Le9:
            agpu r12 = defpackage.agpu.a
            return r12
        Lec:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gao.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gao(this.b, this.c, agswVar);
    }
}

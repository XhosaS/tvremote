package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxc extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gxf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxc(gxf gxfVar, agsw agswVar) {
        super(2, agswVar);
        this.d = gxfVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gxc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r11.c
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/tvsearch/platform/account/state/AutoLogoutHandlerImpl$fetchSettingsListener$1$onFetchSettingsSuccess$1"
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "AutoLogoutHandlerImpl.kt"
            if (r1 == 0) goto L2e
            if (r1 == r7) goto L2a
            if (r1 == r6) goto L26
            if (r1 == r5) goto L1d
            java.lang.Object r0 = r11.a
            defpackage.agpl.b(r12)
            goto La4
        L1d:
            java.lang.Object r1 = r11.b
            java.lang.Object r5 = r11.a
            defpackage.agpl.b(r12)
            r12 = r5
            goto L8e
        L26:
            defpackage.agpl.b(r12)
            goto L4f
        L2a:
            defpackage.agpl.b(r12)
            goto L3b
        L2e:
            defpackage.agpl.b(r12)
            gxf r12 = r11.d
            r11.c = r7
            java.lang.Object r12 = r12.b(r11)
            if (r12 == r0) goto Ld9
        L3b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Ld6
            gxf r12 = r11.d
            r11.c = r6
            gtu r12 = r12.d
            java.lang.Object r12 = r12.j(r11)
            if (r12 == r0) goto Ld9
        L4f:
            r1 = r12
            android.accounts.Account r1 = (android.accounts.Account) r1
            if (r1 == 0) goto Ld6
            gxf r12 = r11.d
            zdy r6 = defpackage.gxf.a
            zeo r6 = r6.b()
            r9 = 79
            zeo r6 = r6.q(r3, r2, r9, r8)
            zdv r6 = (defpackage.zdv) r6
            java.lang.String r9 = "Removing account type %s from device as user has unlinked current device from other surfaces"
            java.lang.String r10 = r1.type
            r6.x(r9, r10)
            agow r6 = r12.f
            java.lang.Object r6 = r6.a()
            r6.getClass()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            fcu r9 = r12.h
            boolean r6 = r9.c(r6)
            r11.a = r12
            r11.b = r1
            r11.c = r5
            idl r5 = r12.g
            java.lang.Object r5 = r5.g(r1, r6, r11)
            if (r5 == r0) goto Ld9
        L8e:
            r5 = r12
            gxf r5 = (defpackage.gxf) r5
            fuk r5 = r5.e
            r11.a = r12
            r6 = 0
            r11.b = r6
            r6 = 4
            r11.c = r6
            android.accounts.Account r1 = (android.accounts.Account) r1
            java.lang.Object r1 = r5.b(r1, r4, r11)
            if (r1 == r0) goto Ld9
            r0 = r12
        La4:
            zdy r12 = defpackage.gxf.a
            zeo r12 = r12.b()
            r1 = 88
            zeo r12 = r12.q(r3, r2, r1, r8)
            zdv r12 = (defpackage.zdv) r12
            java.lang.String r1 = "Bringing up set up screens."
            r12.u(r1)
            gxf r0 = (defpackage.gxf) r0
            igs r12 = r0.i
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "START_VIA_MIC_PRESS"
            android.content.Intent r0 = r0.putExtra(r1, r4)
            java.lang.String r1 = "START_POST_SETUP_OOBE_VIA_AUTO_LOGOUT_REENTER_PASSWORD"
            android.content.Intent r0 = r0.putExtra(r1, r7)
            r0.getClass()
            android.content.ComponentName r1 = defpackage.irm.a
            android.content.ComponentName r1 = defpackage.irm.e
            r12.a(r0, r1)
        Ld6:
            agpu r12 = defpackage.agpu.a
            return r12
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gxc(this.d, agswVar);
    }
}

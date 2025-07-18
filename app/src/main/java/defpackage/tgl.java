package defpackage;

import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgl implements tgg {
    private final AccountId a;
    private final vhb b;
    private final vjo c;
    private final vkz d;
    private final Optional e;

    public tgl(AccountId accountId, vhb vhbVar, vjo vjoVar, vkz vkzVar, Optional optional) {
        this.a = accountId;
        this.b = vhbVar;
        this.c = vjoVar;
        this.d = vkzVar;
        this.e = optional;
    }

    @Override // defpackage.tgg
    public final Optional a() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tgh
            if (r0 == 0) goto L13
            r0 = r5
            tgh r0 = (defpackage.tgh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgh r0 = new tgh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)     // Catch: defpackage.vio -> L46
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            vjo r5 = r4.c     // Catch: defpackage.vio -> L46
            com.google.apps.tiktok.account.AccountId r2 = r4.a     // Catch: defpackage.vio -> L46
            zyd r5 = r5.b(r2)     // Catch: defpackage.vio -> L46
            r0.c = r3     // Catch: defpackage.vio -> L46
            java.lang.Object r5 = defpackage.ahkr.b(r5, r0)     // Catch: defpackage.vio -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = (java.lang.String) r5     // Catch: defpackage.vio -> L46
            return r5
        L46:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgl.b(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tgi
            if (r0 == 0) goto L13
            r0 = r6
            tgi r0 = (defpackage.tgi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgi r0 = new tgi
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.agpl.b(r6)     // Catch: defpackage.vio -> L86
            goto L4a
        L36:
            defpackage.agpl.b(r6)
            vhb r6 = r5.b     // Catch: defpackage.vio -> L86
            com.google.apps.tiktok.account.AccountId r2 = r5.a     // Catch: defpackage.vio -> L86
            zyd r6 = r6.b(r2)     // Catch: defpackage.vio -> L86
            r0.c = r4     // Catch: defpackage.vio -> L86
            java.lang.Object r6 = defpackage.ahkr.b(r6, r0)     // Catch: defpackage.vio -> L86
            if (r6 != r1) goto L4a
            goto L60
        L4a:
            vha r6 = (defpackage.vha) r6     // Catch: defpackage.vio -> L86
            vjo r2 = r5.c
            vhg r4 = r6.b()
            boolean r2 = r2.f(r4)
            if (r2 == 0) goto L69
            r0.c = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            if (r6 == 0) goto L66
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_GAIA
            return r6
        L66:
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_GAIA_NO_NAME
            return r6
        L69:
            vhg r0 = r6.b()
            java.lang.String r0 = r0.j
            java.lang.String r1 = "pseudonymous"
            boolean r0 = defpackage.agvy.c(r0, r1)
            if (r0 == 0) goto L7a
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_PSEUDONYMOUS
            return r6
        L7a:
            boolean r6 = defpackage.vkz.a(r6)
            if (r6 == 0) goto L83
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_DEIDENTIFIED
            return r6
        L83:
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_UNEXPECTED_ACCOUNT_TYPE
            return r6
        L86:
            zod r6 = defpackage.zod.CLIENT_ACCOUNT_STATE_ERROR
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgl.c(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tgj
            if (r0 == 0) goto L13
            r0 = r6
            tgj r0 = (defpackage.tgj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgj r0 = new tgj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.agpl.b(r6)
            vkz r6 = r5.d
            vhb r2 = r6.a
            com.google.apps.tiktok.account.AccountId r6 = r6.b
            zyd r6 = r2.b(r6)
            vky r2 = new vky
            r2.<init>()
            zwk r4 = defpackage.zwk.a
            yqi r2 = defpackage.wyo.a(r2)
            zyd r6 = defpackage.zuz.g(r6, r2, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.ahkr.b(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgl.d(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tgk
            if (r0 == 0) goto L13
            r0 = r6
            tgk r0 = (defpackage.tgk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tgk r0 = new tgk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.agpl.b(r6)
            goto L4a
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.agpl.b(r6)
            j$.util.Optional r6 = r5.e
            r2 = 0
            java.lang.Object r6 = r6.orElse(r2)
            roj r6 = (defpackage.roj) r6
            if (r6 == 0) goto L54
            zyd r6 = r6.b()
            r0.c = r4
            java.lang.Object r6 = defpackage.ahkr.b(r6, r0)
            if (r6 == r1) goto L53
        L4a:
            j$.util.Optional r6 = (j$.util.Optional) r6
            if (r6 == 0) goto L54
            boolean r3 = r6.isPresent()
            goto L54
        L53:
            return r1
        L54:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgl.e(agsw):java.lang.Object");
    }
}

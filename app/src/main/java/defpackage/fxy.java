package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxy implements fxv {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/fcm/FcmDeviceSettingsHelperImpl");
    private final Supplier b;
    private final fsv c;
    private final gtu d;
    private final idl e;

    public fxy(Supplier supplier, fsv fsvVar, gtu gtuVar, idl idlVar) {
        gtuVar.getClass();
        idlVar.getClass();
        this.b = supplier;
        this.c = fsvVar;
        this.d = gtuVar;
        this.e = idlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r5, defpackage.agsw r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fxw
            if (r0 == 0) goto L13
            r0 = r6
            fxw r0 = (defpackage.fxw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fxw r0 = new fxw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r6)
            goto L5c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.agpl.b(r6)
            if (r5 == 0) goto L68
            idl r6 = r4.e
            idj r6 = r6.e(r5)
            idj r2 = defpackage.idj.b
            if (r6 == r2) goto L4c
            java.util.function.Supplier r6 = r4.b
            java.lang.Object r6 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L68
        L4c:
            fsv r6 = r4.c
            java.lang.String r5 = r5.name
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L68:
            zdy r5 = defpackage.fxy.a
            zeo r5 = r5.b()
            r6 = 33
            java.lang.String r0 = "FcmDeviceSettingsHelperImpl.kt"
            java.lang.String r1 = "com/google/android/apps/tvsearch/fcm/FcmDeviceSettingsHelperImpl"
            java.lang.String r2 = "getNeedUpdateFcmDeviceSettings"
            zeo r5 = r5.q(r1, r2, r6, r0)
            zdv r5 = (defpackage.zdv) r5
            java.lang.String r6 = "No need to update Assistant settings as user is not signed in or is not opted in to assistant."
            r5.u(r6)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxy.a(android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:28:0x0071). Please report as a decompilation issue!!! */
    @Override // defpackage.fxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fxx
            if (r0 == 0) goto L13
            r0 = r7
            fxx r0 = (defpackage.fxx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fxx r0 = new fxx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.agpl.b(r7)
            goto L46
        L39:
            defpackage.agpl.b(r7)
            gtu r7 = r6.d
            r0.d = r5
            java.lang.Object r7 = r7.g(r0)
            if (r7 == r1) goto L7f
        L46:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L56
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L56
            goto L7a
        L56:
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L5b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r2.next()
            android.accounts.Account r7 = (android.accounts.Account) r7
            r0.a = r2
            r0.d = r4
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 == r1) goto L7f
        L71:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5b
            r3 = r5
        L7a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxy.b(agsw):java.lang.Object");
    }
}

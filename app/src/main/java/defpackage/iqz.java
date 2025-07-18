package defpackage;

import android.accounts.Account;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqz {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/settings/GeminiSettingsUpdateHandler");
    public final iax b;
    public final ipx c;
    public final fda d;
    public final ahbt e;
    public final fze f;
    public final gtu g;
    public final gyy h;
    private final ggk i;
    private final agow j;
    private final gph k;
    private final fjr l;
    private final icx m;
    private final idl n;
    private final fvb o;

    public iqz(ggk ggkVar, iax iaxVar, ipx ipxVar, fda fdaVar, Context context, ahbt ahbtVar, agow agowVar, gph gphVar, fze fzeVar, fjr fjrVar, gtu gtuVar, icx icxVar, idl idlVar, gyy gyyVar, fvb fvbVar) {
        iaxVar.getClass();
        fdaVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        fjrVar.getClass();
        gtuVar.getClass();
        idlVar.getClass();
        gyyVar.getClass();
        this.i = ggkVar;
        this.b = iaxVar;
        this.c = ipxVar;
        this.d = fdaVar;
        this.e = ahbtVar;
        this.j = agowVar;
        this.k = gphVar;
        this.f = fzeVar;
        this.l = fjrVar;
        this.g = gtuVar;
        this.m = icxVar;
        this.n = idlVar;
        this.h = gyyVar;
        this.o = fvbVar;
    }

    private final Object f(Account account, agsw agswVar) {
        this.n.J(account, idj.b, false);
        String str = account.name;
        str.getClass();
        Object objB = this.o.b(str, 3, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    private final Object g(Account account, agsw agswVar) {
        this.n.J(account, idj.a, false);
        String str = account.name;
        str.getClass();
        Object objB = this.o.b(str, 5, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    private final boolean h(int i) {
        return (i == 5 || i == 2) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (b(r3, r10, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (b((android.accounts.Account) r9, r10, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r9, final defpackage.aedy r10, defpackage.agsw r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.iqm
            if (r0 == 0) goto L13
            r0 = r11
            iqm r0 = (defpackage.iqm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iqm r0 = new iqm
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.agpl.b(r11)
            goto Lc0
        L37:
            aedy r10 = r0.e
            java.lang.Object r9 = r0.a
            defpackage.agpl.b(r11)
            agpk r11 = (defpackage.agpk) r11
            java.lang.Object r11 = r11.a
            goto L54
        L43:
            defpackage.agpl.b(r11)
            gtu r11 = r8.g
            r0.a = r9
            r0.e = r10
            r0.d = r5
            java.lang.Object r11 = r11.f(r9, r0)
            if (r11 == r1) goto Lc3
        L54:
            boolean r2 = r11 instanceof defpackage.agpj
            if (r5 != r2) goto L5a
            java.lang.String r11 = ""
        L5a:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            r2 = 0
            if (r11 <= 0) goto L98
            ipx r11 = r8.c
            r3 = r9
            android.accounts.Account r3 = (android.accounts.Account) r3
            boolean r11 = r11.c(r3)
            if (r11 == 0) goto L79
            fda r9 = r8.d
            iql r11 = new iql
            r11.<init>()
            r9.h(r11)
            goto Lc0
        L79:
            iax r11 = r8.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            iqs r5 = new iqs     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            r6 = r9
            android.accounts.Account r6 = (android.accounts.Account) r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            r5.<init>(r8, r6, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            int r6 = defpackage.kcx.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            android.accounts.Account r9 = (android.accounts.Account) r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            r11.l(r9, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            goto Lc0
        L8b:
            r0.a = r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r9 = r8.b(r3, r10, r0)
            if (r9 != r1) goto Lc0
            goto Lc3
        L98:
            zdy r11 = defpackage.iqz.a
            zeo r11 = r11.b()
            r4 = 178(0xb2, float:2.5E-43)
            java.lang.String r5 = "GeminiSettingsUpdateHandler.kt"
            java.lang.String r6 = "com/google/android/apps/tvsearch/setup/settings/GeminiSettingsUpdateHandler"
            java.lang.String r7 = "fetchSettings"
            zeo r11 = r11.q(r6, r7, r4, r5)
            zdv r11 = (defpackage.zdv) r11
            java.lang.String r4 = "Failed to fetch valid auth token."
            r11.u(r4)
            r0.a = r2
            r0.e = r2
            r0.d = r3
            android.accounts.Account r9 = (android.accounts.Account) r9
            java.lang.Object r9 = r8.b(r9, r10, r0)
            if (r9 != r1) goto Lc0
            goto Lc3
        Lc0:
            agpu r9 = defpackage.agpu.a
            return r9
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqz.a(android.accounts.Account, aedy, agsw):java.lang.Object");
    }

    public final Object b(Account account, aedy aedyVar, agsw agswVar) {
        int iA = aedx.a(aedyVar.d);
        if (iA != 0 && iA == 3) {
            Object objF = f(account, agswVar);
            if (objF == agtg.a) {
                return objF;
            }
        } else {
            Object objG = g(account, agswVar);
            if (objG == agtg.a) {
                return objG;
            }
        }
        return agpu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r30, java.lang.String r31, android.accounts.Account r32, defpackage.aedy r33, defpackage.agsw r34) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqz.c(java.lang.String, java.lang.String, android.accounts.Account, aedy, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ylo r11, android.accounts.Account r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqz.d(ylo, android.accounts.Account, agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r3 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if (r1.a(r10, r2, r4) != r5) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.accounts.Account r18, int r19, defpackage.agsw r20) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqz.e(android.accounts.Account, int, agsw):java.lang.Object");
    }
}

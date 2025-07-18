package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzn implements pyg {
    private static final tvn a = tvn.n("GnpSdk");
    private static final Set b = yfm.aZ(new vie[]{vie.SHOWN, vie.SHOWN_FORCED});
    private static final Set c = yfm.aZ(new vie[]{vie.ACTION_CLICK, vie.CLICKED, vie.DISMISSED, vie.SHOWN, vie.SHOWN_FORCED});
    private final Context d;
    private final qei e;
    private final tst f;
    private final qbp g;
    private final tst h;
    private final qmv i;
    private final pyf j;
    private final tst k;
    private final cb l;

    public pzn(Context context, qei qeiVar, tst tstVar, qbp qbpVar, tst tstVar2, qmv qmvVar, pyf pyfVar, tst tstVar3, cb cbVar) {
        qeiVar.getClass();
        qbpVar.getClass();
        this.d = context;
        this.e = qeiVar;
        this.f = tstVar;
        this.g = qbpVar;
        this.h = tstVar2;
        this.i = qmvVar;
        this.j = pyfVar;
        this.k = tstVar3;
        this.l = cbVar;
    }

    private final String e() {
        try {
            Context context = this.d;
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str.length() == 0 ? "unknown" : str : "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            ((tvk) ((tvk) a.f()).i(e)).s("Failed to get app version.");
            return "unknown";
        }
    }

    private final String f() throws PackageManager.NameNotFoundException {
        try {
            Context context = this.d;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String strValueOf = qtl.F() ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
            return strValueOf.length() == 0 ? "unknown" : strValueOf;
        } catch (PackageManager.NameNotFoundException e) {
            ((tvk) ((tvk) a.f()).i(e)).s("Failed to get app version code.");
            return "unknown";
        }
    }

    private final String g() {
        try {
            return opc.d(this.d.getContentResolver(), "device_country", "");
        } catch (SecurityException e) {
            ((tvk) ((tvk) a.f()).i(e)).s("Exception reading GServices 'device_country' key.");
            return null;
        }
    }

    private final String h() {
        String languageTag = this.d.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // defpackage.pyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vhx a(defpackage.vie r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzn.a(vie, boolean):vhx");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.pyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r17, defpackage.yih r18) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzn.b(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.pzl
            if (r0 == 0) goto L13
            r0 = r7
            pzl r0 = (defpackage.pzl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pzl r0 = new pzl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L28
            return r7
        L28:
            r6 = move-exception
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ybn.f(r7)
            if (r6 != 0) goto L38
            return r3
        L38:
            tst r7 = r5.k
            cb r1 = r5.l
            int r1 = r1.N()
            r4 = 2
            if (r1 != r4) goto L5f
            ttd r7 = (defpackage.ttd) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r7.a     // Catch: java.lang.Exception -> L28
            qqd r7 = (defpackage.qqd) r7     // Catch: java.lang.Exception -> L28
            qpz r1 = new qpz     // Catch: java.lang.Exception -> L28
            r1.<init>(r6)     // Catch: java.lang.Exception -> L28
            r0.c = r2     // Catch: java.lang.Exception -> L28
            r7.c()     // Catch: java.lang.Exception -> L28
            return r3
        L54:
            tvn r7 = defpackage.pzn.a
            tuv r7 = r7.g()
            java.lang.String r0 = "Failed getting language code from GnpRegistrationDataProvider"
            defpackage.a.co(r7, r0, r6)
        L5f:
            tst r6 = r5.f
            boolean r7 = r6.g()
            if (r7 == 0) goto L72
            java.lang.Object r6 = r6.c()
            qrh r6 = (defpackage.qrh) r6
            java.lang.String r6 = r6.a()
            return r6
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzn.c(java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.pzm
            if (r0 == 0) goto L13
            r0 = r7
            pzm r0 = (defpackage.pzm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pzm r0 = new pzm
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L28
            return r7
        L28:
            r6 = move-exception
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ybn.f(r7)
            if (r6 != 0) goto L38
            return r3
        L38:
            tst r7 = r5.k
            cb r1 = r5.l
            int r1 = r1.N()
            r4 = 2
            if (r1 != r4) goto L5f
            ttd r7 = (defpackage.ttd) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r7.a     // Catch: java.lang.Exception -> L28
            qqd r7 = (defpackage.qqd) r7     // Catch: java.lang.Exception -> L28
            qpz r1 = new qpz     // Catch: java.lang.Exception -> L28
            r1.<init>(r6)     // Catch: java.lang.Exception -> L28
            r0.c = r2     // Catch: java.lang.Exception -> L28
            r7.b()     // Catch: java.lang.Exception -> L28
            return r3
        L54:
            tvn r7 = defpackage.pzn.a
            tuv r7 = r7.g()
            java.lang.String r0 = "Failed getting device payload from GnpRegistrationDataProvider"
            defpackage.a.co(r7, r0, r6)
        L5f:
            tst r6 = r5.f
            boolean r7 = r6.g()
            if (r7 == 0) goto L72
            java.lang.Object r6 = r6.c()
            qrh r6 = (defpackage.qrh) r6
            vsl r6 = r6.b()
            return r6
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pzn.d(java.lang.String, yih):java.lang.Object");
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jaz implements jba {
    private final gtu a;
    private final jbc b;
    private final PackageInfo c;
    private final PackageManager d;
    private final ApplicationInfo e;
    private final boolean f;
    private final CharSequence g;
    private final String h;
    private final int i;
    private final fcu j;

    public jaz(gtu gtuVar, fcu fcuVar, jbc jbcVar, PackageInfo packageInfo, PackageManager packageManager) {
        String applicationLabel;
        gtuVar.getClass();
        fcuVar.getClass();
        this.a = gtuVar;
        this.j = fcuVar;
        this.b = jbcVar;
        this.c = packageInfo;
        this.d = packageManager;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        this.e = applicationInfo;
        this.f = fcuVar.a().contains(packageInfo.packageName);
        this.g = (applicationInfo == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null) ? "(unknown)" : applicationLabel;
        String str = packageInfo.packageName;
        str.getClass();
        this.h = str;
        this.i = applicationInfo != null ? applicationInfo.icon : -1;
    }

    @Override // defpackage.jbe
    public final int a() {
        return this.i;
    }

    @Override // defpackage.jba
    public final ComponentName b() {
        return null;
    }

    @Override // defpackage.jbe
    public final ApplicationInfo c() {
        return this.e;
    }

    @Override // defpackage.jba
    public final Cursor d(String str, int i, Map map) {
        str.getClass();
        return null;
    }

    @Override // defpackage.jbe
    public final CharSequence e() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jay
            if (r0 == 0) goto L13
            r0 = r8
            jay r0 = (defpackage.jay) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jay r0 = new jay
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            java.lang.String r2 = r0.e
            jbc r4 = r0.d
            defpackage.agpl.b(r8)
            goto L52
        L3a:
            defpackage.agpl.b(r8)
            jbc r8 = r7.b
            java.lang.String r2 = r7.h
            gtu r5 = r7.a
            r0.d = r8
            r0.e = r2
            r0.c = r4
            java.lang.Object r4 = r5.j(r0)
            if (r4 == r1) goto L6d
            r6 = r4
            r4 = r8
            r8 = r6
        L52:
            android.accounts.Account r8 = (android.accounts.Account) r8
            r5 = 0
            if (r8 == 0) goto L5a
            java.lang.String r8 = r8.name
            goto L5b
        L5a:
            r8 = r5
        L5b:
            r0.d = r5
            r0.e = r5
            r0.c = r3
            if (r8 != 0) goto L65
            java.lang.String r8 = ""
        L65:
            java.lang.Object r8 = r4.a(r2, r8, r0)
            if (r8 != r1) goto L6c
            goto L6d
        L6c:
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jaz.f(agsw):java.lang.Object");
    }

    @Override // defpackage.jbe
    public final String g() {
        return null;
    }

    @Override // defpackage.jbe
    public final String h() {
        return null;
    }

    @Override // defpackage.jbe
    public final String i() {
        return this.h;
    }

    @Override // defpackage.jba
    public final boolean k() {
        return false;
    }

    @Override // defpackage.jba
    public final boolean l() {
        return false;
    }

    @Override // defpackage.jbe
    public final boolean m() {
        return false;
    }

    @Override // defpackage.jba
    public final boolean n() {
        return this.f;
    }

    public final String toString() {
        return "CloudSearchableSource[name=" + ((Object) this.g) + ", packageName=" + this.h + "]";
    }

    @Override // defpackage.jbe
    public final void j() {
    }
}

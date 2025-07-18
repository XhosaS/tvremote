package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfj extends nez {
    private final Context a;

    public nfj(Context context) {
        this.a = context;
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("cbrand");
        this.b.g("cbr");
        this.b.g("cbrver");
        this.b.g("cplatform");
        this.b.g("cmodel");
        this.b.g("cos");
        this.b.g("cosver");
        this.b.g("c");
        this.b.g("cver");
        this.b.g("cplayer");
    }

    @Override // defpackage.nez
    protected final void i() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        Context context = this.a;
        String str = edt.an(context) ? "tv" : context.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp >= 540 ? "tablet" : "mobile";
        String str2 = true != "tv".equals(str) ? "android" : "android_tv";
        Context applicationContext = context.getApplicationContext();
        try {
            packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        String str3 = (packageInfo == null || packageInfo.versionName == null) ? "Unknown" : packageInfo.versionName;
        this.b.f("cbrand", Build.MANUFACTURER);
        this.b.f("cbr", this.a.getPackageName());
        nfa nfaVar = this.b;
        String strConcat = String.valueOf(str3).concat("/E1.8.0-alpha01");
        nfaVar.f("cbrver", strConcat);
        this.b.f("cplatform", str);
        this.b.f("cmodel", Build.MODEL);
        this.b.f("cos", "Android");
        this.b.f("cosver", Build.VERSION.RELEASE);
        this.b.f("c", str2);
        this.b.f("cver", strConcat);
        this.b.f("cplayer", "android_exoplayer_v2");
    }
}

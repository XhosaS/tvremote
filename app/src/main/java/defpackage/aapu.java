package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapu {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public aapu(Context context) {
        this.a = context;
    }

    public static String e(aahf aahfVar) {
        aahfVar.d();
        aahp aahpVar = aahfVar.e;
        String str = aahpVar.c;
        if (str != null) {
            return str;
        }
        aahfVar.d();
        String str2 = aahpVar.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    private final PackageInfo g(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void h() {
        PackageInfo packageInfoG = g(this.a.getPackageName());
        if (packageInfoG != null) {
            this.b = Integer.toString(packageInfoG.versionCode);
            this.c = packageInfoG.versionName;
        }
    }

    final synchronized int a() {
        PackageInfo packageInfoG;
        if (this.d == 0 && (packageInfoG = g("com.google.android.gms")) != null) {
            this.d = packageInfoG.versionCode;
        }
        return this.d;
    }

    final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        this.e = 2;
        return 2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            h();
        }
        return this.b;
    }

    final synchronized String d() {
        if (this.c == null) {
            h();
        }
        return this.c;
    }

    final boolean f() {
        return b() != 0;
    }
}

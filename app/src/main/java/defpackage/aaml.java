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
public class aaml {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public aaml(Context context) {
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

    private final PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void g() {
        PackageInfo packageInfoF = f(this.a.getPackageName());
        if (packageInfoF != null) {
            this.b = Integer.toString(packageInfoF.versionCode);
            this.c = packageInfoF.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo packageInfoF;
        if (this.d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
            this.d = packageInfoF.versionCode;
        }
        return this.d;
    }

    public final synchronized int b() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        this.e = 2;
        return 2;
    }

    public final synchronized String c() {
        if (this.b == null) {
            g();
        }
        return this.b;
    }

    public final synchronized String d() {
        if (this.c == null) {
            g();
        }
        return this.c;
    }
}

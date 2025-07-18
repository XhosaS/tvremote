package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class und {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public und(Context context) {
        this.a = context;
    }

    private final PackageInfo e(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    private final synchronized void f() {
        PackageInfo packageInfoE = e(this.a.getPackageName());
        if (packageInfoE != null) {
            this.b = Integer.toString(packageInfoE.versionCode);
            this.c = packageInfoE.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.d == 0 && (packageInfoE = e("com.google.android.gms")) != null) {
            this.d = packageInfoE.versionCode;
        }
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:12:0x0022, B:14:0x0029, B:16:0x003b, B:24:0x005c, B:19:0x0042, B:21:0x0055, B:27:0x0060, B:31:0x006f), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.e     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L73
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch: java.lang.Throwable -> L73
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L22
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)
            return r3
        L22:
            boolean r1 = defpackage.ocv.f()     // Catch: java.lang.Throwable -> L73
            r2 = 1
            if (r1 != 0) goto L42
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch: java.lang.Throwable -> L73
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L42
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L73
            if (r1 <= 0) goto L42
            goto L5c
        L42:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch: java.lang.Throwable -> L73
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch: java.lang.Throwable -> L73
            r1 = 2
            if (r0 == 0) goto L60
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L73
            if (r0 <= 0) goto L60
            r2 = r1
        L5c:
            r5.e = r2     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)
            return r2
        L60:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L73
            boolean r0 = defpackage.ocv.f()     // Catch: java.lang.Throwable -> L73
            if (r2 == r0) goto L6e
            goto L6f
        L6e:
            r2 = r1
        L6f:
            r5.e = r2     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)
            return r2
        L73:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L73
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.und.b():int");
    }

    public final synchronized String c() {
        if (this.b == null) {
            f();
        }
        return this.b;
    }

    public final synchronized String d() {
        if (this.c == null) {
            f();
        }
        return this.c;
    }
}

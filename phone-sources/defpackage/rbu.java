package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbu {
    public int a;
    public int b;
    public final Object c;

    public rbu(Context context) {
        this.a = 0;
        this.c = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoZ;
        if (this.b == 0) {
            try {
                packageInfoZ = oda.b((Context) this.c).z("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoZ = null;
            }
            if (packageInfoZ != null) {
                this.b = packageInfoZ.versionCode;
            }
        }
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x002a, B:12:0x0033, B:14:0x003a, B:16:0x004c, B:24:0x006d, B:19:0x0053, B:21:0x0066, B:27:0x0071, B:31:0x0080), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L84
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L84
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L84
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L84
            kwy r0 = defpackage.oda.b(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L84
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L84
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L84
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L33
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r3
        L33:
            boolean r0 = defpackage.ocv.f()     // Catch: java.lang.Throwable -> L84
            r2 = 1
            if (r0 != 0) goto L53
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L84
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L53
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L53
            goto L6d
        L53:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L84
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L84
            r1 = 2
            if (r0 == 0) goto L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L71
            r2 = r1
        L6d:
            r5.a = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r2
        L71:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L84
            boolean r0 = defpackage.ocv.f()     // Catch: java.lang.Throwable -> L84
            if (r2 == r0) goto L7f
            goto L80
        L7f:
            r2 = r1
        L80:
            r5.a = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            return r2
        L84:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L84
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbu.b():int");
    }

    public rbu(raz razVar, int i, int i2) {
        this.c = razVar;
        this.a = i;
        this.b = i2;
    }
}

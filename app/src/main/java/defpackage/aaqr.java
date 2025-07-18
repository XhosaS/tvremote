package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaqr implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final aaqp b;
    private final aapu f;
    private final PowerManager.WakeLock g;
    private final long h;

    public aaqr(aaqp aaqpVar, Context context, aapu aapuVar, long j) {
        this.b = aaqpVar;
        this.a = context;
        this.h = j;
        this.f = aapuVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (c) {
            Boolean bool = d;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? d(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean d(Context context, String str) {
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", a.e(str, "Missing Permission: ", ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest"));
        return false;
    }

    public final synchronized boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r3 = r2.b;
        r4 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r4 == 83) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r4 == 85) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r3.equals("U") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        r3 = r2.a;
        r4 = r0.a;
        r5 = r0.b.c();
        r6 = new android.os.Bundle();
        r6.putString("gcm.topic", "/topics/".concat(r3));
        r6.putString("delete", "1");
        defpackage.aaqp.a(r4.a(r4.b(r5, "/topics/".concat(r3), r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        if (defpackage.aaqp.e() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.e(r3, "Unsubscribe from topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r3.equals("S") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        r3 = r2.a;
        r4 = r0.a;
        r5 = r0.b.c();
        r6 = new android.os.Bundle();
        r6.putString("gcm.topic", "/topics/".concat(r3));
        defpackage.aaqp.a(r4.a(r4.b(r5, "/topics/".concat(r3), r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0132, code lost:
    
        if (defpackage.aaqp.e() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.e(r3, "Subscribe to topic: ", " succeeded."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        if (defpackage.aaqp.e() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        android.util.Log.d("FirebaseMessaging", defpackage.a.t(r2, "Unknown topic operation", "."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r0.d.c(r2);
        r3 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        if (r3.containsKey(r2) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r4 = (java.util.ArrayDeque) r3.get(r2);
        r5 = (defpackage.lvj) r4.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0174, code lost:
    
        if (r5 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        r5.a.p(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        if (r4.isEmpty() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r3.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0185, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0196, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        if (r0.getMessage() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b7, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01df, code lost:
    
        r9.b.d(r9.h);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaqr.run():void");
    }
}

package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upg implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final upe b;
    private final uos f;
    private final PowerManager.WakeLock g;
    private final long h;

    public upg(upe upeVar, Context context, uos uosVar, long j) {
        this.b = upeVar;
        this.a = context;
        this.h = j;
        this.f = uosVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (c) {
            Boolean bool = d;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r3 = r2.b;
        r4 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r4 == 83) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r4 == 85) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r3.equals("U") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r3 = r2.a;
        r4 = r0.a;
        r5 = r0.b.b();
        r6 = new android.os.Bundle();
        r6.putString("gcm.topic", "/topics/".concat(r3));
        r6.putString("delete", "1");
        defpackage.upe.a(defpackage.uoq.b(r4.a(r5, "/topics/".concat(r3), r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r3.equals("S") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        r3 = r2.a;
        r4 = r0.a;
        r5 = r0.b.b();
        r6 = new android.os.Bundle();
        r6.putString("gcm.topic", "/topics/".concat(r3));
        defpackage.upe.a(defpackage.uoq.b(r4.a(r5, "/topics/".concat(r3), r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r0.d.c(r2);
        r3 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
    
        if (r3.containsKey(r2) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        r4 = (java.util.ArrayDeque) r3.get(r2);
        r5 = (defpackage.kwy) r4.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0119, code lost:
    
        r5.u(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (r4.isEmpty() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0123, code lost:
    
        r3.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        if (r0.getMessage() == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0158, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        r9.b.d(r9.h);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upg.run():void");
    }
}

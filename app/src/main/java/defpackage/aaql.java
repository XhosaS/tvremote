package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaql implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new klw("firebase-iid-executor"));
    private final long c;
    private final PowerManager.WakeLock d;

    public aaql(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging firebaseMessaging = this.a;
        aaqf aaqfVarA = aaqf.a();
        Context context = firebaseMessaging.d;
        if (aaqfVarA.c(context)) {
            this.d.acquire();
        }
        boolean z = true;
        try {
            try {
                firebaseMessaging.h(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.a.h(false);
            }
            if (!firebaseMessaging.h.f()) {
                firebaseMessaging.h(false);
                if (!aaqf.a().c(context)) {
                    return;
                }
            }
            aaqf aaqfVarA2 = aaqf.a();
            if (aaqfVarA2.b == null) {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                aaqfVarA2.b = Boolean.valueOf(z);
            }
            if (!aaqfVarA2.a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
            if (!aaqfVarA2.b.booleanValue() || b()) {
                try {
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                        Log.w("FirebaseMessaging", "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval");
                    } else {
                        if (e2.getMessage() != null) {
                            throw e2;
                        }
                        Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                    }
                } catch (SecurityException unused) {
                    Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                }
                if (firebaseMessaging.c() == null) {
                    Log.e("FirebaseMessaging", "Token retrieval failed: null");
                    this.a.j(this.c);
                } else {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Token successfully retrieved");
                    }
                    this.a.h(false);
                }
            } else {
                aaqk aaqkVar = new aaqk(this);
                if (a()) {
                    Log.d("FirebaseMessaging", "Connectivity change received registered");
                }
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                aaql aaqlVar = aaqkVar.a;
                if (aaqlVar != null) {
                    aaqkVar.b = aaqlVar.a.d;
                    aaqkVar.b.registerReceiver(aaqkVar, intentFilter);
                }
            }
        } finally {
            if (aaqf.a().c(this.a.d)) {
                this.d.release();
            }
        }
    }
}

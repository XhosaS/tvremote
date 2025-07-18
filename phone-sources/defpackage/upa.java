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
public final class upa implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ocy("firebase-iid-executor", 0));
    private final long c;
    private final PowerManager.WakeLock d;

    public upa(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        return this.a.d;
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (uox.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                FirebaseMessaging firebaseMessaging = this.a;
                boolean z = true;
                firebaseMessaging.f(true);
                if (firebaseMessaging.g.e()) {
                    uox uoxVarA = uox.a();
                    Context contextA = a();
                    if (uoxVarA.b == null) {
                        if (contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        uoxVarA.b = Boolean.valueOf(z);
                    }
                    uoxVarA.a.booleanValue();
                    if (!uoxVarA.b.booleanValue() || b()) {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } else {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (firebaseMessaging.b() == null) {
                            Log.e("FirebaseMessaging", "Token retrieval failed: null");
                            this.a.h(this.c);
                        } else {
                            firebaseMessaging.f(false);
                        }
                    } else {
                        uoz uozVar = new uoz(this);
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        upa upaVar = uozVar.a;
                        if (upaVar != null) {
                            uozVar.b = upaVar.a();
                            uozVar.b.registerReceiver(uozVar, intentFilter);
                        }
                    }
                } else {
                    firebaseMessaging.f(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.f(false);
            }
        } finally {
            if (uox.a().c(a())) {
                this.d.release();
            }
        }
    }
}

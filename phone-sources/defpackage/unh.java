package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unh implements Runnable {
    public final FirebaseInstanceId a;
    final ExecutorService b = umy.a();
    private final long c;
    private final PowerManager.WakeLock d;

    public unh(FirebaseInstanceId firebaseInstanceId, long j) {
        this.a = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        return this.a.c.a();
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (uri.b().a(a())) {
            this.d.acquire();
        }
        try {
            try {
                FirebaseInstanceId firebaseInstanceId = this.a;
                boolean z = true;
                firebaseInstanceId.l(true);
                if (firebaseInstanceId.d.b() != 0) {
                    uri uriVarB = uri.b();
                    Context contextA = a();
                    if (uriVarB.a == null) {
                        if (contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        uriVarB.a = Boolean.valueOf(z);
                    }
                    ((Boolean) uriVarB.b).booleanValue();
                    if (((Boolean) uriVarB.a).booleanValue() && !b()) {
                        ung ungVar = new ung(this);
                        ungVar.a.a().registerReceiver(ungVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } else if (firebaseInstanceId.o(firebaseInstanceId.b())) {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                                Log.w("FirebaseInstanceId", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } else {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                        } catch (SecurityException unused) {
                            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (firebaseInstanceId.h(qtl.aO(firebaseInstanceId.c), "*") == null) {
                            Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                            this.a.n(this.c);
                        }
                        firebaseInstanceId.l(false);
                    } else {
                        firebaseInstanceId.l(false);
                    }
                } else {
                    this.a.l(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.l(false);
            }
        } finally {
            if (uri.b().a(a())) {
                this.d.release();
            }
        }
    }
}

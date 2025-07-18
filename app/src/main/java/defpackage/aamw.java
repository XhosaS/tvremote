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
public class aamw implements Runnable {
    public final FirebaseInstanceId a;
    final ExecutorService b = aamb.a();
    private final long c;
    private final PowerManager.WakeLock d;

    public aamw(FirebaseInstanceId firebaseInstanceId, long j) {
        this.a = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        aahf aahfVar = this.a.d;
        aahfVar.d();
        return aahfVar.c;
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (aams.a().b(a())) {
            this.d.acquire();
        }
        try {
            try {
                FirebaseInstanceId firebaseInstanceId = this.a;
                boolean z = true;
                firebaseInstanceId.j(true);
                if (firebaseInstanceId.e.b() != 0) {
                    aams aamsVarA = aams.a();
                    Context contextA = a();
                    if (aamsVarA.b == null) {
                        if (contextA.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        aamsVarA.b = Boolean.valueOf(z);
                    }
                    if (!aamsVarA.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (aamsVarA.b.booleanValue() && !b()) {
                        aamv aamvVar = new aamv(this);
                        if (FirebaseInstanceId.m()) {
                            Log.d("FirebaseInstanceId", "Connectivity change received registered");
                        }
                        aamvVar.a.a().registerReceiver(aamvVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    } else if (firebaseInstanceId.n(firebaseInstanceId.b())) {
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
                        if (firebaseInstanceId.f(aaml.e(firebaseInstanceId.d), "*") == null) {
                            Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                            this.a.l(this.c);
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                Log.d("FirebaseInstanceId", "Token successfully retrieved");
                            }
                            this.a.j(false);
                        }
                    } else {
                        this.a.j(false);
                    }
                } else {
                    this.a.j(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.j(false);
            }
        } finally {
            if (aams.a().b(a())) {
                this.d.release();
            }
        }
    }
}

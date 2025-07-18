package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
class jsm extends BroadcastReceiver {
    final /* synthetic */ jsn a;
    private final jth b;
    private final Runnable c;

    public jsm(jsn jsnVar, jth jthVar, Runnable runnable) {
        this.a = jsnVar;
        this.b = jthVar;
        this.c = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((zdv) ((zdv) jsn.a.c()).q("com/google/android/downloader/AndroidConnectivityHandler$NetworkBroadcastReceiver", "onReceive", 238, "AndroidConnectivityHandler.java")).x("NetworkBroadcastReceiver received an unexpected intent action: %s", intent.getAction());
            return;
        }
        if (intent.getBooleanExtra("noConnectivity", false)) {
            ((zdv) ((zdv) jsn.a.b()).q("com/google/android/downloader/AndroidConnectivityHandler$NetworkBroadcastReceiver", "onReceive", 245, "AndroidConnectivityHandler.java")).u("NetworkBroadcastReceiver updated but NO_CONNECTIVITY extra set");
            return;
        }
        zdy zdyVar = jsn.a;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/downloader/AndroidConnectivityHandler$NetworkBroadcastReceiver", "onReceive", 249, "AndroidConnectivityHandler.java")).F("NetworkBroadcastReceiver received intent: %s %s", intent.getAction(), intent.getExtras());
        if (!this.a.a(this.b)) {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/downloader/AndroidConnectivityHandler$NetworkBroadcastReceiver", "onReceive", 257, "AndroidConnectivityHandler.java")).u("Connectivity NOT satisfied in BroadcastReceiver");
        } else {
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/downloader/AndroidConnectivityHandler$NetworkBroadcastReceiver", "onReceive", 254, "AndroidConnectivityHandler.java")).u("Connectivity satisfied in BroadcastReceiver, running completion");
            this.c.run();
        }
    }
}

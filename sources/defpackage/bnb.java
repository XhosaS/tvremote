package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnb extends BroadcastReceiver {
    final /* synthetic */ bnd a;

    public bnb(bnd bndVar) {
        this.a = bndVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        if (intExtra == 12) {
            ((cbs) ((cbs) bnd.a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothServer$1", "onReceive", 93, "BluetoothServer.java")).p("State On");
            this.a.a();
        } else {
            if (intExtra != 13) {
                return;
            }
            ((cbs) ((cbs) bnd.a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothServer$1", "onReceive", 88, "BluetoothServer.java")).p("State Turning Off");
            this.a.b();
        }
    }
}

package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmy extends BroadcastReceiver {
    final /* synthetic */ bna a;

    public bmy(bna bnaVar) {
        this.a = bnaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        if (intExtra == 12) {
            ((cbs) ((cbs) bna.a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer$1", "onReceive", 90, "BluetoothLeServer.java")).p("State On");
            this.a.a();
        } else {
            if (intExtra != 13) {
                return;
            }
            ((cbs) ((cbs) bna.a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer$1", "onReceive", 85, "BluetoothLeServer.java")).p("State Turning Off");
            this.a.b();
        }
    }
}

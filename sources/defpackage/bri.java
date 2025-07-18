package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bri extends BroadcastReceiver {
    final /* synthetic */ brj a;

    public bri(brj brjVar) {
        this.a = brjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap map;
        if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) != 10) {
            return;
        }
        ((cbs) brj.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager$3", "onReceive", 99, "BleDeviceManager.java")).p("Bluetooth BLE adapter was shutdown");
        brj brjVar = this.a;
        synchronized (brjVar) {
            map = brjVar.d;
            brjVar.d = new HashMap();
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((bro) it.next()).e(0);
        }
    }
}

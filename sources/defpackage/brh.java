package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brh extends BroadcastReceiver {
    final /* synthetic */ brj a;

    public brh(brj brjVar) {
        this.a = brjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
        if (intExtra == 10) {
            brj brjVar = this.a;
            synchronized (brjVar) {
                brjVar.e.remove(bluetoothDevice.getAddress());
                brjVar.f.remove(bluetoothDevice.getAddress());
            }
            return;
        }
        if (intExtra != 12) {
            return;
        }
        ((cbs) brj.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager$2", "onReceive", 68, "BleDeviceManager.java")).t("Bluetooth device %s has bonded", bluetoothDevice);
        brj brjVar2 = this.a;
        synchronized (brjVar2) {
            if (brjVar2.d.containsKey(bluetoothDevice)) {
                return;
            }
            brjVar2.b(bluetoothDevice);
        }
    }
}

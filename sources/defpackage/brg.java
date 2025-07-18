package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brg extends BroadcastReceiver {
    final /* synthetic */ brj a;

    public brg(brj brjVar) {
        this.a = brjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice.getBondState() == 12) {
            ((cbs) brj.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager$1", "onReceive", 52, "BleDeviceManager.java")).t("Bluetooth device %s has connected", bluetoothDevice);
            this.a.b(bluetoothDevice);
        }
    }
}

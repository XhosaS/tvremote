package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmw extends BroadcastReceiver {
    final /* synthetic */ bmx a;

    public bmw(bmx bmxVar) {
        this.a = bmxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.e || intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1) != 2) {
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if ((bluetoothDevice.getType() & 2) != 0) {
            abortBroadcast();
            bluetoothDevice.setPairingConfirmation(false);
            ((cbs) bmx.a.g().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper$4", "onReceive", 237, "BluetoothLeAdvertiseWrapper.java")).p("Interrupt an incoming pairing request as the screen is off");
        }
    }
}

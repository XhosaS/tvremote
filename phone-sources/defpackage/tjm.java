package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjm {
    public static final tui a = tui.l("com/google/android/tv/remote/support/core/BluetoothClient");
    public final BluetoothAdapter b;
    public final BluetoothDevice c;
    public final tjl d;
    public final tjj e;

    public tjm(String str, tjj tjjVar) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.b = defaultAdapter;
        if (defaultAdapter != null) {
            BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
            this.c = remoteDevice;
            tui tuiVar = a;
            if (((tug) tuiVar.b()).I()) {
                ((tug) ((tug) tuiVar.e()).j("com/google/android/tv/remote/support/core/BluetoothClient", "<init>", 33, "BluetoothClient.java")).B("Creating Bluetooth client for %s %s", remoteDevice.getAddress(), remoteDevice.getName());
            }
        } else {
            this.c = null;
        }
        this.d = new tjl(this);
        this.e = tjjVar;
    }
}

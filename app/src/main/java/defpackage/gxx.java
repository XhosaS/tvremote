package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxx implements aejg {
    public static String b(BluetoothAdapter bluetoothAdapter) {
        String name = null;
        if (bluetoothAdapter != null) {
            try {
                name = bluetoothAdapter.getName();
            } catch (SecurityException e) {
                ((zdv) ((zdv) gxw.a.d()).p(e).q("com/google/android/apps/tvsearch/platform/bluetooth/SingletonModule", "provideDeviceName", 38, "SingletonModule.kt")).u("BLUETOOTH_CONNECT permission not gained; deriving name from manufacturer and model");
            }
        }
        if (name != null) {
            return name;
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }
}

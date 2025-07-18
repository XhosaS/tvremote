package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.tv.remote.service.audio.compression.Lc3Decoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bne {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/BluetoothUtil");

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean b(Context context, boolean z) {
        if (!a(context)) {
            if (z) {
                ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothUtil", "useBleServer", 56, "BluetoothUtil.java")).p("Use BLE server: device does not support BLE");
            }
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            if (z) {
                ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothUtil", "useBleServer", 62, "BluetoothUtil.java")).p("Use BLE server: L2CAP not supported");
            }
            return false;
        }
        if (Lc3Decoder.a) {
            return true;
        }
        if (z) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothUtil", "useBleServer", 68, "BluetoothUtil.java")).p("Use BLE server: LC3 codec not available");
        }
        return false;
    }
}

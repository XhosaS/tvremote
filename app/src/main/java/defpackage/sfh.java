package defpackage;

import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfh {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/bluetooth/BluetoothAudioDeviceKt");

    public static final String a(AudioDeviceInfo audioDeviceInfo) {
        Object objA;
        audioDeviceInfo.getClass();
        try {
            objA = AudioDeviceInfo.class.getMethod("getAddress", null).invoke(audioDeviceInfo, null);
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        if (agpk.a(objA) != null) {
            ((zdv) a.d().o(zfi.a, "ALT.BTAudioDevice").q("com/google/android/libraries/search/audio/bluetooth/BluetoothAudioDeviceKt", "getAddressCompat", 85, "BluetoothAudioDevice.kt")).u("#audio# accessing device's address failed");
            objA = null;
        }
        if (objA instanceof String) {
            return (String) objA;
        }
        return null;
    }

    public static final String b(AudioDeviceInfo audioDeviceInfo) {
        audioDeviceInfo.getClass();
        return "[" + audioDeviceInfo.getId() + ", " + d(audioDeviceInfo) + ", " + a(audioDeviceInfo) + ", " + audioDeviceInfo.getType() + "]";
    }

    public static final String c(BluetoothDevice bluetoothDevice) {
        Object objA;
        try {
            objA = bluetoothDevice.getName();
            if (objA == null) {
                objA = "";
            }
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        return (String) (true != (objA instanceof agpj) ? objA : "");
    }

    public static final String d(AudioDeviceInfo audioDeviceInfo) {
        String strA;
        try {
            CharSequence productName = audioDeviceInfo.getProductName();
            strA = productName != null ? productName.toString() : "";
        } catch (Throwable th) {
            strA = agpl.a(th);
        }
        return (String) (true != (strA instanceof agpj) ? strA : "");
    }
}

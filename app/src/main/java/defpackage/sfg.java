package defpackage;

import android.bluetooth.BluetoothDevice;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfg {
    public final String a;
    public final int b;
    public final boolean c;
    private final AudioDeviceInfo d;
    private final BluetoothDevice e;
    private final String f;
    private final boolean g;
    private final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sfg(android.media.AudioDeviceInfo r8, android.bluetooth.BluetoothDevice r9) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfg.<init>(android.media.AudioDeviceInfo, android.bluetooth.BluetoothDevice):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfg)) {
            return false;
        }
        if (this.h && agvy.c(this.d, ((sfg) obj).d)) {
            return true;
        }
        if (this.g && agvy.c(this.e, ((sfg) obj).e)) {
            return true;
        }
        sfg sfgVar = (sfg) obj;
        return agvy.c(this.d, sfgVar.d) && agvy.c(this.e, sfgVar.e);
    }

    public final int hashCode() {
        AudioDeviceInfo audioDeviceInfo = this.d;
        int iHashCode = audioDeviceInfo == null ? 0 : audioDeviceInfo.hashCode();
        BluetoothDevice bluetoothDevice = this.e;
        return (iHashCode * 31) + (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0);
    }

    public final String toString() {
        return "BluetoothAudioDevice(deviceInfo=" + this.d + ", bluetoothDevice=" + this.e + ")";
    }
}

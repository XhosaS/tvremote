package defpackage;

import android.bluetooth.le.AdvertisingSet;
import android.bluetooth.le.AdvertisingSetCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmv extends AdvertisingSetCallback {
    public final void onAdvertisingSetStarted(AdvertisingSet advertisingSet, int i, int i2) {
        if (i2 != 0) {
            ((cbs) bmx.a.g().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper$3", "onAdvertisingSetStarted", 211, "BluetoothLeAdvertiseWrapper.java")).w("onAdvertisingSetStarted: txPower=%d status=%d", i, i2);
        }
    }
}

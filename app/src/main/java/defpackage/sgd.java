package defpackage;

import android.bluetooth.BluetoothProfile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgd implements BluetoothProfile.ServiceListener {
    final /* synthetic */ sge a;

    public sgd(sge sgeVar) {
        this.a = sgeVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        bluetoothProfile.getClass();
        sge sgeVar = this.a;
        sgeVar.e.a(new sga(i, sgeVar, bluetoothProfile, null));
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        sge sgeVar = this.a;
        sgeVar.e.a(new sgc(i, sgeVar, null));
    }
}

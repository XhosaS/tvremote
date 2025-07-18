package defpackage;

import android.bluetooth.BluetoothProfile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wxa implements BluetoothProfile.ServiceListener {
    final /* synthetic */ String a = "";
    final /* synthetic */ String b = "";
    final /* synthetic */ String c = "ALT.BluetoothDeviceManager.bluetoothProfileServiceListener";
    final /* synthetic */ BluetoothProfile.ServiceListener d;
    final /* synthetic */ wxc e;

    public wxa(wxc wxcVar, BluetoothProfile.ServiceListener serviceListener) {
        this.d = serviceListener;
        this.e = wxcVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        wvl wvlVarB = this.e.b(this.c.concat("#onServiceConnected"), this.a, this.b, 0);
        try {
            this.d.onServiceConnected(i, bluetoothProfile);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        wvl wvlVarB = this.e.b(this.c.concat("#onServiceDisconnected"), this.a, this.b, 0);
        try {
            this.d.onServiceDisconnected(i);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

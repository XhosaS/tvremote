package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmz extends Thread {
    public final BluetoothServerSocket a;
    final /* synthetic */ bna b;

    public bmz(bna bnaVar, BluetoothServerSocket bluetoothServerSocket) {
        this.b = bnaVar;
        this.a = bluetoothServerSocket;
        setName("BluetoothLeServer");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        while (true) {
            try {
                BluetoothSocket bluetoothSocketAccept = this.a.accept();
                BluetoothDevice remoteDevice = bluetoothSocketAccept.getRemoteDevice();
                cbt cbtVar = bna.a;
                cch cchVarE = cbtVar.e();
                cck cckVar = btt.a;
                ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/BluetoothLeServer$AcceptThread", "run", 164, "BluetoothLeServer.java")).t("Incoming connection from %s", remoteDevice.getAddress());
                bms bmsVar = new bms(bluetoothSocketAccept, this.b.c);
                ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/BluetoothLeServer$AcceptThread", "run", 167, "BluetoothLeServer.java")).t("Client %s connecting", bmsVar);
                bmsVar.start();
            } catch (IOException unused) {
                ((cbs) ((cbs) bna.a.e().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer$AcceptThread", "run", 173, "BluetoothLeServer.java")).p("Bluetooth Server is shutting down");
                return;
            }
        }
    }
}

package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnc extends Thread {
    public final BluetoothServerSocket a;
    final /* synthetic */ bnd b;

    public bnc(bnd bndVar, BluetoothServerSocket bluetoothServerSocket) {
        this.b = bndVar;
        this.a = bluetoothServerSocket;
        setName("BluetoothServer");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        while (true) {
            try {
                BluetoothSocket bluetoothSocketAccept = this.a.accept();
                BluetoothDevice remoteDevice = bluetoothSocketAccept.getRemoteDevice();
                cbt cbtVar = bnd.a;
                cch cchVarE = cbtVar.e();
                cck cckVar = btt.a;
                ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/BluetoothServer$AcceptThread", "run", 183, "BluetoothServer.java")).t("Incoming connection from %s", remoteDevice.getAddress());
                bms bmsVar = new bms(bluetoothSocketAccept, this.b.b);
                ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/BluetoothServer$AcceptThread", "run", 186, "BluetoothServer.java")).t("Client %s connecting", bmsVar);
                bmsVar.start();
            } catch (IOException unused) {
                ((cbs) ((cbs) bnd.a.e().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothServer$AcceptThread", "run", 192, "BluetoothServer.java")).p("Bluetooth Server is shutting down");
                return;
            }
        }
    }
}

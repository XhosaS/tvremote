package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bna {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/BluetoothLeServer");
    public bmx b;
    public final byj c;
    private final Context d;
    private final BluetoothAdapter e;
    private final bpo f;
    private final bpn g = new bno(this, 1);
    private bmz h;

    public bna(buf bufVar, boolean z, byj byjVar, bpo bpoVar) {
        this.d = bufVar;
        this.c = byjVar;
        this.f = bpoVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.e = defaultAdapter;
        if (defaultAdapter == null) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeServer", "<init>", 65, "BluetoothLeServer.java")).p("Can't start Bluetooth LE server: bluetooth adapter not available");
            return;
        }
        if (z) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeServer", "<init>", 70, "BluetoothLeServer.java")).p("Bluetooth LE server disabled: disableLeAdvertising flag is on");
            return;
        }
        if (!bne.b(bufVar, true)) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeServer", "<init>", 74, "BluetoothLeServer.java")).p("Bluetooth LE server disabled: features not available");
            return;
        }
        bmy bmyVar = new bmy(this);
        bufVar.registerReceiver(bmyVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), "android.permission.BLUETOOTH_PRIVILEGED", null);
        bufVar.k(new aze((Object) this, bufVar, (BroadcastReceiver) bmyVar, 2));
        a();
    }

    public final void a() {
        if (this.h != null) {
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.e;
        if (!bluetoothAdapter.isEnabled()) {
            ((cbs) a.c().j("com/google/android/tv/remote/service/BluetoothLeServer", "startServer", 118, "BluetoothLeServer.java")).p("Bluetooth is unavailable");
            return;
        }
        try {
            BluetoothServerSocket bluetoothServerSocketListenUsingL2capChannel = bluetoothAdapter.listenUsingL2capChannel();
            char psm = (char) bluetoothServerSocketListenUsingL2capChannel.getPsm();
            bmz bmzVar = new bmz(this, bluetoothServerSocketListenUsingL2capChannel);
            this.h = bmzVar;
            bmzVar.start();
            this.b = new bmx(this.d, this.e, psm);
            bpo bpoVar = this.f;
            bpoVar.a(this.g);
            bpoVar.d = true;
            if (!bpoVar.b.isEmpty()) {
                bpoVar.b();
            }
            this.b.b();
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer", "startServer", 136, "BluetoothLeServer.java")).r("Bluetooth LE server started PSM=%d", psm);
        } catch (IOException | SecurityException e) {
            ((cbs) ((cbs) a.g().i(e)).j("com/google/android/tv/remote/service/BluetoothLeServer", "startServer", 127, "BluetoothLeServer.java")).p("Failed to start BLE server");
        }
    }

    public final void b() {
        if (this.h != null) {
            this.b.d();
            bpo bpoVar = this.f;
            bpoVar.d = false;
            bpoVar.a.removeCallbacks(bpoVar.c);
            bpoVar.c(this.g);
            try {
                this.h.a.close();
            } catch (IOException unused) {
            }
            this.h = null;
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer", "stopServer", 146, "BluetoothLeServer.java")).p("Bluetooth LE server stopped");
        }
    }
}

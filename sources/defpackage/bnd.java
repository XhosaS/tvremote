package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnd {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/BluetoothServer");
    public final byj b;
    private final boolean c;
    private final BluetoothAdapter d;
    private final bmx e;
    private bnc f;

    public bnd(buf bufVar, boolean z, boolean z2, byj byjVar) {
        boolean zB = bne.b(bufVar, false);
        boolean zA = bne.a(bufVar);
        this.c = z;
        this.b = byjVar;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.d = defaultAdapter;
        if (defaultAdapter == null) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothServer", "<init>", 60, "BluetoothServer.java")).p("Can't start Bluetooth LE server: bluetooth adapter not available");
            this.e = null;
            return;
        }
        if (z2) {
            ((cbs) a.b().j("com/google/android/tv/remote/service/BluetoothServer", "<init>", 66, "BluetoothServer.java")).p("LE advertising disabled: disableLeAdvertising flag is on");
        }
        if (!zA) {
            ((cbs) a.b().j("com/google/android/tv/remote/service/BluetoothServer", "<init>", 69, "BluetoothServer.java")).p("LE advertising disabled: BLE feature not available");
        }
        if (zB) {
            ((cbs) a.b().j("com/google/android/tv/remote/service/BluetoothServer", "<init>", 72, "BluetoothServer.java")).p("LE advertising disabled: BLE server is enabled");
        }
        if (z2 || !zA || zB) {
            this.e = null;
        } else {
            this.e = new bmx(bufVar, defaultAdapter);
        }
        bnb bnbVar = new bnb(this);
        bufVar.registerReceiver(bnbVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), "android.permission.BLUETOOTH_PRIVILEGED", null);
        bufVar.k(new aze((Object) this, bufVar, (BroadcastReceiver) bnbVar, 3));
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnd.a():void");
    }

    public final void b() {
        if (this.f != null) {
            bmx bmxVar = this.e;
            if (bmxVar != null) {
                bmxVar.d();
            }
            try {
                this.f.a.close();
            } catch (IOException unused) {
            }
            this.f = null;
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothServer", "stopServer", 165, "BluetoothServer.java")).p("Bluetooth server stopped");
        }
    }
}

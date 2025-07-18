package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkh extends BroadcastReceiver {
    final Handler a;
    final HashMap b = new HashMap();
    final HashSet c = new HashSet();
    final HashSet d = new HashSet();
    final ArrayDeque e = new ArrayDeque();
    boolean f;
    boolean g;
    final /* synthetic */ tki h;

    public tkh(tki tkiVar, Handler handler) {
        this.h = tkiVar;
        this.a = handler;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        tkiVar.b.registerReceiver(this, intentFilter, null, handler);
        tui tuiVar = tki.a;
        ((tug) ((tug) tuiVar.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "<init>", 135, "BluetoothAgent.java")).s("Starting Bluetooth discovery");
        boolean zStartDiscovery = tkiVar.c.startDiscovery();
        this.g = zStartDiscovery;
        a(zStartDiscovery);
        if (this.g) {
            return;
        }
        ((tug) ((tug) tuiVar.g()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "<init>", 139, "BluetoothAgent.java")).s("Failed to start Bluetooth discovery");
    }

    private final void b() {
        ArrayDeque arrayDeque = this.e;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) arrayDeque.peek();
        if (bluetoothDevice != null) {
            if (this.g) {
                ((tug) ((tug) tki.a.e()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "fetchUuidsForNextQueuedDevice", 327, "BluetoothAgent.java")).s("Suppressing UUIDs fetch while the discovery is in progress");
                return;
            } else {
                ((tug) ((tug) tki.a.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "fetchUuidsForNextQueuedDevice", 329, "BluetoothAgent.java")).z("Fetching UUID for %s (%d left)", bluetoothDevice.getAddress(), arrayDeque.size());
                bluetoothDevice.fetchUuidsWithSdp();
                return;
            }
        }
        if (this.g) {
            return;
        }
        tui tuiVar = tki.a;
        ((tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "fetchUuidsForNextQueuedDevice", 318, "BluetoothAgent.java")).s("Done fetching UUIDs");
        tki tkiVar = this.h;
        tkiVar.d.c();
        boolean zStartDiscovery = tkiVar.c.startDiscovery();
        this.g = zStartDiscovery;
        if (zStartDiscovery) {
            return;
        }
        ((tug) ((tug) tuiVar.g()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "fetchUuidsForNextQueuedDevice", 322, "BluetoothAgent.java")).s("Failed to continue Bluetooth discovery");
        a(false);
    }

    final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (z) {
                this.h.d.d();
            } else {
                this.h.d.e();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkh.onReceive(android.content.Context, android.content.Intent):void");
    }
}

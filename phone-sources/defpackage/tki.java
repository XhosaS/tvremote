package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tki extends tkr {
    public static final tui a = tui.l("com/google/android/tv/remote/support/discovery/BluetoothAgent");
    public final Context b;
    public final BluetoothAdapter c;
    public tkq d;
    private tkh e;

    public tki(Context context) {
        this.b = context;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.c = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
    }

    public static boolean c(Parcelable[] parcelableArr) {
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                UUID uuid = ((ParcelUuid) parcelable).getUuid();
                if (tie.a.equals(uuid) || tie.b.equals(uuid)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tkr
    public final void a(tkq tkqVar) {
        tui tuiVar = a;
        ((tug) ((tug) tuiVar.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent", "startDiscovery", 46, "BluetoothAgent.java")).s("startDiscovery");
        BluetoothAdapter bluetoothAdapter = this.c;
        if (bluetoothAdapter == null) {
            tkqVar.f();
            return;
        }
        if (this.e == null) {
            try {
                if (bluetoothAdapter.isDiscovering()) {
                    ((tug) ((tug) tuiVar.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent", "startDiscovery", 62, "BluetoothAgent.java")).s("Bluetooth already discovering, cancelling first");
                    this.c.cancelDiscovery();
                }
            } catch (SecurityException unused) {
                ((tug) ((tug) a.e()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent", "startDiscovery", 58, "BluetoothAgent.java")).s("Bluetooth permissions are not granted");
                return;
            }
        } else {
            b();
        }
        ((tug) ((tug) tuiVar.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent", "startDiscovery", 69, "BluetoothAgent.java")).s("Preparing Bluetooth discovery");
        this.d = tkqVar;
        this.e = new tkh(this, new Handler(Looper.myLooper()));
    }

    @Override // defpackage.tkr
    public final void b() {
        ((tug) ((tug) a.c()).j("com/google/android/tv/remote/support/discovery/BluetoothAgent", "stopDiscovery", 76, "BluetoothAgent.java")).s("stopDiscovery");
        tkh tkhVar = this.e;
        if (tkhVar != null) {
            tki tkiVar = tkhVar.h;
            tkiVar.b.unregisterReceiver(tkhVar);
            tkhVar.a.removeCallbacksAndMessages(null);
            try {
                tkiVar.c.cancelDiscovery();
            } catch (SecurityException e) {
                ((tug) ((tug) ((tug) a.g()).i(e)).j("com/google/android/tv/remote/support/discovery/BluetoothAgent$BluetoothActionsReceiver", "unregister", (char) 159, "BluetoothAgent.java")).s("You tried cancelling discovery while bluetooth permissions haven't been granted.");
            }
            this.e = null;
            this.d = null;
        }
    }
}

package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brj {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/BleDeviceManager");
    public final Context b;
    public boolean c;
    public HashMap d = new HashMap();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final BroadcastReceiver g = new brg(this);
    public final BroadcastReceiver h = new brh(this);
    public final BroadcastReceiver i = new bri(this);
    private final brp j;

    public brj(Context context, brp brpVar) {
        this.b = context;
        this.j = brpVar;
    }

    private final void f(BluetoothDevice bluetoothDevice, boolean z) {
        brp brpVar = this.j;
        Context context = (Context) ((cpj) brpVar.a).a;
        bqo bqoVar = (bqo) brpVar.b.a();
        bqoVar.getClass();
        bsi bsiVar = (bsi) brpVar.c.a();
        bsiVar.getClass();
        bqv bqvVar = (bqv) brpVar.d.a();
        bqvVar.getClass();
        btj btjVar = (btj) brpVar.e.a();
        btjVar.getClass();
        bth bthVar = (bth) brpVar.f.a();
        bthVar.getClass();
        btf btfVar = (btf) brpVar.g.a();
        btfVar.getClass();
        Boolean bool = (Boolean) brpVar.h.a();
        bool.getClass();
        crv crvVar = brpVar.i;
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) crvVar.a();
        bool2.getClass();
        boolean zBooleanValue2 = bool2.booleanValue();
        bluetoothDevice.getClass();
        bro broVar = new bro(context, bqoVar, bsiVar, bqvVar, btjVar, bthVar, btfVar, zBooleanValue, zBooleanValue2, this, bluetoothDevice, z);
        synchronized (this) {
            if (this.e.contains(bluetoothDevice.getAddress())) {
                ((cbs) a.c().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "addDevice", 221, "BleDeviceManager.java")).t("The device %s was unsupported last time, skipping connection", bluetoothDevice);
                return;
            }
            bro broVar2 = (bro) this.d.put(bluetoothDevice, broVar);
            boolean zContains = this.f.contains(bluetoothDevice.getAddress());
            if (broVar2 != null) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "addDevice", 229, "BleDeviceManager.java")).t("It seems that the same device %s is already connected", bluetoothDevice);
                broVar2.b();
            }
            brf brfVar = broVar.g;
            Context context2 = broVar.c;
            BluetoothDevice bluetoothDevice2 = broVar.e;
            ((cbs) brf.a.c().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "connect", 128, "BleDeviceConnection.java")).z("Connecting to %s (%s)", bluetoothDevice2, bluetoothDevice2.getName());
            AtomicReference atomicReference = brfVar.h;
            if (sd.g(atomicReference, bre.UNINITIALIZED, bre.GATT_CONNECTING)) {
                brfVar.j = zContains;
                brfVar.i = bluetoothDevice2.connectGatt(context2, false, new brd(brfVar));
                if (brfVar.i != null) {
                    return;
                } else {
                    atomicReference.set(bre.DISCONNECTED);
                }
            }
            e(broVar);
        }
    }

    public final synchronized void a(PrintWriter printWriter) {
        printWriter.println("BLE remotes:");
        for (bro broVar : this.d.values()) {
            PrintWriter printWriterAppend = printWriter.append("\t");
            BluetoothDevice bluetoothDevice = broVar.e;
            String name = bluetoothDevice.getName();
            String address = bluetoothDevice.getAddress();
            String string = broVar.g.h.toString();
            bsd bsdVar = broVar.i;
            printWriterAppend.println(String.format("%s (%s): %s, Capability: %s, %s", name, address, string, bsdVar.e.g(), bsdVar.b()));
        }
    }

    public final void b(BluetoothDevice bluetoothDevice) {
        int type = bluetoothDevice.getType();
        if (type == 2 || type == 3) {
            BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
            if (bluetoothClass == null) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "isDeviceClassSupported", 187, "BleDeviceManager.java")).t("Unable to resolve device class for %s", bluetoothDevice);
            } else {
                int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
                if (majorDeviceClass != 0 && majorDeviceClass != 1280 && majorDeviceClass != 7936) {
                    ((cbs) a.e().j("com/google/android/tv/remote/service/bleremote/BleDeviceManager", "isDeviceClassSupported", 196, "BleDeviceManager.java")).r("Remotes of device class %x are not supported", bluetoothClass.getDeviceClass());
                    if ("NVIDIA".equals(Build.MANUFACTURER)) {
                        f(bluetoothDevice, true);
                        return;
                    }
                    return;
                }
            }
            f(bluetoothDevice, false);
        }
    }

    public final synchronized void c(bro broVar) {
        this.f.add(broVar.e.getAddress());
    }

    public final synchronized void d(bro broVar) {
        this.e.add(broVar.e.getAddress());
    }

    public final synchronized void e(bro broVar) {
        HashMap map = this.d;
        BluetoothDevice bluetoothDevice = broVar.e;
        if (map.get(bluetoothDevice) == broVar) {
            this.d.remove(bluetoothDevice);
        }
    }
}

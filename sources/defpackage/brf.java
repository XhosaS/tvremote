package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brf {
    public BluetoothGatt i;
    public boolean j;
    public boolean k;
    public long m;
    public BluetoothGattCharacteristic n;
    public BluetoothGattCharacteristic o;
    public BluetoothGattCharacteristic p;
    public int q;
    public final bro r;
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/BleDeviceConnection");
    public static final UUID b = UUID.fromString("AB5E0001-5A21-4F05-BC7D-AF01F617B664");
    public static final UUID c = UUID.fromString("AB5E0002-5A21-4F05-BC7D-AF01F617B664");
    public static final UUID d = UUID.fromString("AB5E0003-5A21-4F05-BC7D-AF01F617B664");
    public static final UUID e = UUID.fromString("AB5E0004-5A21-4F05-BC7D-AF01F617B664");
    private static final UUID s = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID f = UUID.fromString("00001812-0000-1000-8000-00805f9b34fb");
    public static final UUID g = UUID.fromString("00002a4d-0000-1000-8000-00805f9b34fb");
    public final LinkedBlockingQueue l = new LinkedBlockingQueue();
    public final AtomicReference h = new AtomicReference(bre.UNINITIALIZED);

    public brf(bro broVar) {
        this.r = broVar;
    }

    public static BluetoothGattCharacteristic a(BluetoothGattService bluetoothGattService, UUID uuid) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        if (characteristic == null) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "findCharacteristic", 297, "BleDeviceConnection.java")).z("Required characteristics %s is not found in service %s", uuid, bluetoothGattService.getUuid());
        }
        return characteristic;
    }

    public static boolean e(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(s);
        if (descriptor == null) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "enableNotification", 313, "BleDeviceConnection.java")).z("Unable to find client config descriptor for: %s %s", bluetoothGatt.getDevice(), bluetoothGattCharacteristic.getUuid());
            return false;
        }
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return bluetoothGatt.writeDescriptor(descriptor);
    }

    public final void b(BluetoothGatt bluetoothGatt, bre breVar, int i) {
        if (sd.g(this.h, breVar, bre.DISCONNECTED)) {
            if (i == 0) {
                ((cbs) a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "closeGattIfInState", 222, "BleDeviceConnection.java")).t("Disconnected from %s", bluetoothGatt.getDevice());
            } else {
                ((cbs) a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "closeGattIfInState", 224, "BleDeviceConnection.java")).z("Connection failed at %s for %s", breVar, bluetoothGatt.getDevice());
            }
            bluetoothGatt.close();
            this.r.c(i);
        }
    }

    public final void c(BluetoothGatt bluetoothGatt) {
        AtomicReference atomicReference;
        bre breVar;
        bre breVar2;
        do {
            LinkedBlockingQueue linkedBlockingQueue = this.l;
            byte[] bArr = (byte[]) linkedBlockingQueue.poll();
            if (bArr != null) {
                this.p.setValue(bArr);
                this.m = SystemClock.uptimeMillis();
                if (bluetoothGatt.writeCharacteristic(this.p)) {
                    ((cbs) a.c().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "maybeSendNextCommand", 170, "BleDeviceConnection.java")).u("Sending command 0x%02X to %s", bArr[0], bluetoothGatt.getDevice());
                    return;
                } else {
                    b(bluetoothGatt, bre.CHARACTERISTIC_WRITE, 0);
                    return;
                }
            }
            atomicReference = this.h;
            breVar = bre.CHARACTERISTIC_WRITE;
            breVar2 = bre.READY;
            if (!sd.g(atomicReference, breVar, breVar2) || linkedBlockingQueue.isEmpty()) {
                return;
            }
        } while (sd.g(atomicReference, breVar2, breVar));
    }

    public final boolean d(BluetoothGatt bluetoothGatt) {
        AtomicReference atomicReference = this.h;
        bre breVar = bre.DISCONNECTED;
        bre breVar2 = (bre) atomicReference.getAndSet(breVar);
        if (breVar2 == bre.UNINITIALIZED || breVar2 == breVar) {
            return false;
        }
        bluetoothGatt.close();
        if (breVar2 == bre.READY) {
            ((cbs) a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "disconnect", 209, "BleDeviceConnection.java")).t("Disconnected from %s", bluetoothGatt.getDevice());
            return true;
        }
        ((cbs) a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "disconnect", 211, "BleDeviceConnection.java")).z("Connection failed at %s for %s", breVar2, bluetoothGatt.getDevice());
        return true;
    }
}

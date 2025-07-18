package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brd extends BluetoothGattCallback {
    final /* synthetic */ brf a;

    public brd(brf brfVar) {
        this.a = brfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0411  */
    @Override // android.bluetooth.BluetoothGattCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt r17, android.bluetooth.BluetoothGattCharacteristic r18) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brd.onCharacteristicChanged(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (i != 0) {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onCharacteristicWrite", 463, "BleDeviceConnection.java")).A("Failed to write characteristic %s to %s: %d", bluetoothGattCharacteristic.getUuid(), bluetoothGatt.getDevice(), Integer.valueOf(i));
            this.a.b(bluetoothGatt, bre.CHARACTERISTIC_WRITE, i);
        } else {
            brf brfVar = this.a;
            if (brfVar.m != 0) {
                ((cbs) brf.a.c().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onCharacteristicWrite", 456, "BleDeviceConnection.java")).s("GATT command is sent in %dms", SystemClock.uptimeMillis() - brfVar.m);
            }
            brfVar.c(bluetoothGatt);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            if (bluetoothGatt.getDevice().isConnected()) {
                ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onConnectionStateChange", 393, "BleDeviceConnection.java")).t("GATT connection is lost, but the device %s is still connected", bluetoothGatt.getDevice());
            }
            if (i != 0) {
                ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onConnectionStateChange", 397, "BleDeviceConnection.java")).y("Failed to successfully disconnect from %s: %d", bluetoothGatt.getDevice(), i);
            }
            brf brfVar = this.a;
            if (brfVar.d(bluetoothGatt)) {
                brfVar.r.c(i);
                return;
            }
            return;
        }
        if (i2 != 2) {
            return;
        }
        if (i != 0) {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onConnectionStateChange", 387, "BleDeviceConnection.java")).y("Failed to connect to %s: %d", bluetoothGatt.getDevice(), i);
            this.a.b(bluetoothGatt, bre.GATT_CONNECTING, i);
            return;
        }
        brf brfVar2 = this.a;
        brfVar2.i = bluetoothGatt;
        if (bluetoothGatt.discoverServices()) {
            sd.g(brfVar2.h, bre.GATT_CONNECTING, bre.SERVICE_DISCOVERING);
        }
        brfVar2.b(bluetoothGatt, bre.GATT_CONNECTING, 257);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        if (i != 0) {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onDescriptorWrite", 445, "BleDeviceConnection.java")).A("Failed to write descriptor for %s to %s: %d", bluetoothGattDescriptor.getCharacteristic().getUuid(), bluetoothGatt.getDevice(), Integer.valueOf(i));
            this.a.b(bluetoothGatt, bre.CONFIGURING_DESCRIPTORS, i);
            return;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        brf brfVar = this.a;
        if (characteristic == brfVar.o) {
            if (brf.e(bluetoothGatt, brfVar.n)) {
                return;
            }
        } else if (bluetoothGattDescriptor.getCharacteristic() == brfVar.n && sd.g(brfVar.h, bre.CONFIGURING_DESCRIPTORS, bre.READY)) {
            ((cbs) brf.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onDescriptorWrite", 438, "BleDeviceConnection.java")).t("Successfully connected to %s", bluetoothGatt.getDevice());
            brfVar.r.d(brfVar.q);
        }
        brfVar.b(bluetoothGatt, bre.CONFIGURING_DESCRIPTORS, 257);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.a.k = true;
        if (i2 == 0) {
            ((cbs) brf.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onMtuChanged", 489, "BleDeviceConnection.java")).y("MTU for %s has been changed to %d", bluetoothGatt.getDevice(), i);
        } else {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onMtuChanged", 491, "BleDeviceConnection.java")).A("Failed to change MTU for %s to %d: %d", bluetoothGatt.getDevice(), Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        if (i != 0) {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onServicesDiscovered", 423, "BleDeviceConnection.java")).y("Failed to discover services for %s: %d", bluetoothGatt.getDevice(), i);
            this.a.b(bluetoothGatt, bre.SERVICE_DISCOVERING, i);
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(brf.b);
        if (service == null) {
            ((cbs) brf.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection$GattCallback", "onServicesDiscovered", 414, "BleDeviceConnection.java")).t("Voice over BLE is not supported by %s", bluetoothGatt.getDevice());
            brf brfVar = this.a;
            brfVar.r.f();
            brfVar.b(bluetoothGatt, bre.SERVICE_DISCOVERING, 0);
            return;
        }
        brf brfVar2 = this.a;
        brfVar2.n = brf.a(service, brf.e);
        brfVar2.o = brf.a(service, brf.d);
        brfVar2.p = brf.a(service, brf.c);
        if ((brfVar2.p.getProperties() & 4) != 0) {
            brfVar2.q = 1;
            ((cbs) ((cbs) brf.a.e().g(btt.a)).j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "initializeVoiceService", 240, "BleDeviceConnection.java")).p("Using expedited write");
            brfVar2.p.setWriteType(1);
        } else {
            brfVar2.q = 0;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = brfVar2.n;
        if (bluetoothGattCharacteristic == null || brfVar2.o == null || brfVar2.p == null) {
            brfVar2.r.f();
        } else if (bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true) && bluetoothGatt.setCharacteristicNotification(brfVar2.o, true)) {
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                if (bluetoothGattService.getUuid().equals(brf.f)) {
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic2 : bluetoothGattService.getCharacteristics()) {
                        if (bluetoothGattCharacteristic2.getUuid().equals(brf.g) && (bluetoothGattCharacteristic2.getProperties() & 16) != 0 && !bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic2, true)) {
                            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "initializeVoiceService", 270, "BleDeviceConnection.java")).z("Failed to enable notification %s for device %s", bluetoothGattCharacteristic2.getUuid(), bluetoothGatt.getDevice());
                        }
                    }
                }
            }
            if (brfVar2.q > 0 && brfVar2.j) {
                ((cbs) brf.a.b().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "initializeVoiceService", 280, "BleDeviceConnection.java")).p("Skipping CCCD configuration");
                if (sd.g(brfVar2.h, bre.SERVICE_DISCOVERING, bre.READY)) {
                    brfVar2.r.d(brfVar2.q);
                }
            } else if (brf.e(bluetoothGatt, brfVar2.o)) {
                sd.g(brfVar2.h, bre.SERVICE_DISCOVERING, bre.CONFIGURING_DESCRIPTORS);
            }
        } else {
            ((cbs) brf.a.g().j("com/google/android/tv/remote/service/bleremote/BleDeviceConnection", "initializeVoiceService", 254, "BleDeviceConnection.java")).t("Unable to subscribe to required notifications for device %s", bluetoothGatt.getDevice());
        }
        brfVar2.b(bluetoothGatt, bre.SERVICE_DISCOVERING, 257);
    }
}

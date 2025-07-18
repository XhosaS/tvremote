package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import android.os.PowerManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmx {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper");
    private static final AdvertisingSetParameters g = new AdvertisingSetParameters.Builder().setConnectable(true).setScannable(true).setInterval(1600).setLegacyMode(true).build();
    public boolean b;
    public Long c;
    public String d;
    boolean e;
    public AdvertiseData f;
    private final Context h;
    private final BluetoothAdapter i;
    private final Character j;
    private BluetoothLeAdvertiser k;
    private BroadcastReceiver l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private AdvertisingSetCallback o;
    private AdvertiseData p;
    private AdvertiseData q;

    public bmx(Context context, BluetoothAdapter bluetoothAdapter) {
        this.b = true;
        this.h = context;
        this.i = bluetoothAdapter;
        this.j = null;
    }

    private static AdvertiseData e(boolean z, byte[] bArr) {
        return new AdvertiseData.Builder().setIncludeDeviceName(z).addManufacturerData(224, bArr).build();
    }

    private final boolean f(boolean z) {
        if (!z) {
            BroadcastReceiver broadcastReceiver = this.l;
            if (broadcastReceiver != null) {
                this.h.unregisterReceiver(broadcastReceiver);
                this.l = null;
            }
            BroadcastReceiver broadcastReceiver2 = this.m;
            if (broadcastReceiver2 != null) {
                this.h.unregisterReceiver(broadcastReceiver2);
                this.m = null;
            }
            BroadcastReceiver broadcastReceiver3 = this.n;
            if (broadcastReceiver3 != null) {
                this.h.unregisterReceiver(broadcastReceiver3);
                this.n = null;
            }
        }
        AdvertisingSetCallback advertisingSetCallback = this.o;
        if (advertisingSetCallback == null) {
            return false;
        }
        this.k.stopAdvertisingSet(advertisingSetCallback);
        this.o = null;
        return true;
    }

    public final void a() {
        if (this.o != null) {
            ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "maybeRestartAdvertising", 136, "BluetoothLeAdvertiseWrapper.java")).p("Restarting LE advertisement");
            f(true);
            c(true);
        }
    }

    public final void b() {
        if (this.k != null || this.o != null) {
            throw new IllegalStateException("Cannot start advertising: already started");
        }
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.i.getBluetoothLeAdvertiser();
        this.k = bluetoothLeAdvertiser;
        if (bluetoothLeAdvertiser == null) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertising", 154, "BluetoothLeAdvertiseWrapper.java")).p("Cannot start advertising: BluetoothLeAdvertiser not available");
        } else {
            c(false);
        }
    }

    public final void c(boolean z) {
        boolean z2;
        if (!z) {
            Context context = this.h;
            PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
            if (powerManager == null) {
                ((cbs) a.g().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertisingInternal", 164, "BluetoothLeAdvertiseWrapper.java")).p("Power manager not available, device name will be advertised at all times");
                this.e = true;
            } else {
                this.l = new bmt(this, powerManager);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                context.registerReceiver(this.l, intentFilter);
                this.e = powerManager.isInteractive();
            }
            this.m = new bmu(this);
            context.registerReceiver(this.m, new IntentFilter("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED"), "android.permission.BLUETOOTH_PRIVILEGED", null);
            this.d = this.i.getName();
        }
        while (true) {
            try {
                bmv bmvVar = new bmv();
                BluetoothLeAdvertiser bluetoothLeAdvertiser = this.k;
                AdvertisingSetParameters advertisingSetParameters = g;
                AdvertiseData advertiseDataBuild = this.f;
                if (advertiseDataBuild == null) {
                    AdvertiseData.Builder includeTxPowerLevel = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
                    ParcelUuid parcelUuid = new ParcelUuid(bli.a);
                    if (this.c != null) {
                        includeTxPowerLevel.addServiceData(parcelUuid, ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.c.longValue()).array());
                    } else {
                        includeTxPowerLevel.addServiceUuid(parcelUuid);
                    }
                    advertiseDataBuild = includeTxPowerLevel.build();
                    this.f = advertiseDataBuild;
                }
                AdvertiseData advertiseData = advertiseDataBuild;
                if (this.q == null || this.p == null) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocate(27).order(ByteOrder.LITTLE_ENDIAN);
                    Character ch = this.j;
                    if (ch != null) {
                        byteBufferOrder.put((byte) 3).put((byte) 33).putChar(ch.charValue());
                    }
                    byte[] bArrP = atg.p(byteBufferOrder);
                    this.q = e(false, bArrP);
                    if (this.b) {
                        this.p = e(true, bArrP);
                    } else {
                        ByteBuffer byteBufferSlice = byteBufferOrder.slice();
                        byteBufferSlice.position(2);
                        StandardCharsets.UTF_8.newEncoder().encode(CharBuffer.wrap(this.d), byteBufferSlice, true);
                        bdq.j(byteBufferOrder.position() == byteBufferSlice.arrayOffset());
                        int iPosition = byteBufferSlice.position();
                        byteBufferOrder.put((byte) (iPosition - 1)).put((byte) 34).position(byteBufferOrder.position() + (iPosition - 2));
                        this.p = e(false, atg.p(byteBufferOrder));
                    }
                }
                bluetoothLeAdvertiser.startAdvertisingSet(advertisingSetParameters, advertiseData, this.e ? this.p : this.q, null, null, bmvVar);
                this.o = bmvVar;
                if (z) {
                    return;
                }
                try {
                    this.n = new bmw(this);
                    IntentFilter intentFilter2 = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
                    intentFilter2.setPriority(1);
                    this.h.registerReceiver(this.n, intentFilter2, "android.permission.BLUETOOTH_PRIVILEGED", null);
                    cbs cbsVar = (cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertisingInternal", 248, "BluetoothLeAdvertiseWrapper.java");
                    Character ch2 = this.j;
                    cbsVar.z("BLE Advertisement has started with PSM=%s%s", ch2 == null ? "none" : Integer.valueOf(ch2.charValue()), this.c == null ? "" : " with rotating ids");
                    return;
                } catch (IllegalArgumentException e) {
                    e = e;
                    z2 = false;
                    if (!this.b) {
                        ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertisingInternal", 255, "BluetoothLeAdvertiseWrapper.java")).p("Cannot start BLE advertising");
                        f(z2);
                        return;
                    } else {
                        ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertisingInternal", 258, "BluetoothLeAdvertiseWrapper.java")).p("Cannot start advertising: retrying with truncated name");
                        this.q = null;
                        this.p = null;
                        this.b = false;
                    }
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                z2 = z;
            }
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "startAdvertisingInternal", 258, "BluetoothLeAdvertiseWrapper.java")).p("Cannot start advertising: retrying with truncated name");
            this.q = null;
            this.p = null;
            this.b = false;
        }
    }

    public final void d() {
        if (f(false)) {
            ((cbs) a.e().j("com/google/android/tv/remote/service/BluetoothLeAdvertiseWrapper", "stopAdvertising", 269, "BluetoothLeAdvertiseWrapper.java")).p("BLE Advertisement has stopped");
        }
        this.k = null;
    }

    public bmx(Context context, BluetoothAdapter bluetoothAdapter, char c) {
        this.b = true;
        this.h = context;
        this.i = bluetoothAdapter;
        this.j = Character.valueOf(c);
    }
}

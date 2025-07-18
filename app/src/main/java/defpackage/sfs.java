package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfs extends agtu implements agvb {
    final /* synthetic */ sge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfs(sge sgeVar, agsw agswVar) {
        super(2, agswVar);
        this.a = sgeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sfs) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        Object objA2;
        agpl.b(obj);
        sge sgeVar = this.a;
        if (!sgeVar.h.b()) {
            ((zdv) sge.a.b().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 430, "BluetoothDeviceManager.kt")).u("#audio# ensure BT-components initialized");
        }
        Context context = sgeVar.b;
        if (Build.VERSION.SDK_INT >= 31 ? !(sug.a(context, "android.permission.BLUETOOTH_SCAN") && sug.a(context, "android.permission.BLUETOOTH_CONNECT")) : !sug.a(context, "android.permission.BLUETOOTH")) {
            ((zdv) sge.a.d().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 433, "BluetoothDeviceManager.kt")).u("#audio# BT-headset-profile failed to register, no BT permission");
        } else {
            BluetoothAdapter bluetoothAdapter = sgeVar.g;
            if (bluetoothAdapter == null) {
                try {
                    objA = Build.VERSION.SDK_INT >= 31 ? ((BluetoothManager) sgeVar.d.a()).getAdapter() : BluetoothAdapter.getDefaultAdapter();
                } catch (Throwable th) {
                    objA = agpl.a(th);
                }
                if (true == (objA instanceof agpj)) {
                    objA = null;
                }
                bluetoothAdapter = (BluetoothAdapter) objA;
            }
            sgeVar.g = bluetoothAdapter;
            if (!sgeVar.h.b()) {
                try {
                    BluetoothAdapter bluetoothAdapter2 = sgeVar.g;
                    objA2 = bluetoothAdapter2 != null ? Boolean.valueOf(bluetoothAdapter2.getProfileProxy(sgeVar.b, sgeVar.l, 1)) : null;
                } catch (Throwable th2) {
                    objA2 = agpl.a(th2);
                }
                if (true == (objA2 instanceof agpj)) {
                    objA2 = null;
                }
                Boolean bool = (Boolean) objA2;
                sgeVar.h.a = bool != null ? bool.booleanValue() : 0;
            }
            agzv agzvVar = sgeVar.h;
            if (!agzvVar.b()) {
                ((zdv) sge.a.d().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager", "ensureBluetoothInitializedInternal", 459, "BluetoothDeviceManager.kt")).u("#audio# BT-headset-profile failed to register");
            }
            agzvVar.b();
        }
        sgeVar.c.registerAudioDeviceCallback(sgeVar.k, null);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sfs(this.a, agswVar);
    }
}

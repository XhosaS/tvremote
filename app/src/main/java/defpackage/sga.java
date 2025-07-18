package defpackage;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sga extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ sge b;
    final /* synthetic */ BluetoothProfile c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga(int i, sge sgeVar, BluetoothProfile bluetoothProfile, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = sgeVar;
        this.c = bluetoothProfile;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sga) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        if (this.a == 1) {
            ((zdv) sge.a.b().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$bluetoothProfileServiceListener$1$onServiceConnected$1", "invokeSuspend", 129, "BluetoothDeviceManager.kt")).u("#audio# BT-headset-profile connected");
            sge sgeVar = this.b;
            BluetoothProfile bluetoothProfile = this.c;
            sgg sggVar = sgeVar.m;
            ((TelephonyManager) sggVar.a.a()).getClass();
            ((sfm) sggVar.b.a()).getClass();
            ((sfm) sggVar.c.a()).getClass();
            ((sfm) sggVar.d.a()).getClass();
            ((sfm) sggVar.e.a()).getClass();
            Boolean bool = (Boolean) sggVar.f.a();
            bool.getClass();
            bool.booleanValue();
            sgeVar.n = new sgf((BluetoothHeadset) bluetoothProfile);
            sgeVar.a();
            sgeVar.i.a(new agux() { // from class: sfz
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    ((sfn) obj2).b();
                    return agpu.a;
                }
            });
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sga(this.a, this.b, this.c, agswVar);
    }
}

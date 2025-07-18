package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sgc extends agtu implements agvb {
    final /* synthetic */ int a;
    final /* synthetic */ sge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgc(int i, sge sgeVar, agsw agswVar) {
        super(2, agswVar);
        this.a = i;
        this.b = sgeVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sgc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        if (this.a == 1) {
            sge sgeVar = this.b;
            if (sgeVar.n != null) {
                ((zdv) sge.a.b().o(zfi.a, "ALT.BtDevicesMgr").q("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothDeviceManager$bluetoothProfileServiceListener$1$onServiceDisconnected$1", "invokeSuspend", 146, "BluetoothDeviceManager.kt")).u("#audio# BT-headset-profile disconnected");
                sgeVar.n = null;
                sgeVar.i.a(new agux() { // from class: sgb
                    @Override // defpackage.agux
                    public final Object a(Object obj2) {
                        ((sfn) obj2).a();
                        return agpu.a;
                    }
                });
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sgc(this.a, this.b, agswVar);
    }
}

package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vya implements vxo {
    final /* synthetic */ Object a;
    final /* synthetic */ txl b;

    public vya(txl txlVar, Object obj) {
        this.b = txlVar;
        this.a = obj;
    }

    @Override // defpackage.vxo
    public final zwc a() {
        zyc zycVar = zwc.a;
        zvw zvwVar = new zvw();
        zzc zzcVar = new zzc(new zvq(this.b, zvwVar));
        zzcVar.run();
        return new zwc(zzcVar, zvwVar).d(wyo.e(new zvy() { // from class: vxz
            @Override // defpackage.zvy
            public final Object a(zvz zvzVar, Object obj) {
                return vxn.a(obj, Instant.now());
            }
        }), zwk.a);
    }

    @Override // defpackage.vxo
    public final zyd b() {
        return zxy.a;
    }

    @Override // defpackage.vxo
    public final Object c() {
        return this.a;
    }

    public final String toString() {
        return "LocalDataSource[" + this.b.toString() + "]";
    }
}

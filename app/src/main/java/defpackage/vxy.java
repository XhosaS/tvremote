package defpackage;

import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vxy implements vxo {
    final /* synthetic */ vxo a;
    final /* synthetic */ yqi b;
    final /* synthetic */ Executor c;

    public vxy(vxo vxoVar, yqi yqiVar, Executor executor) {
        this.a = vxoVar;
        this.b = yqiVar;
        this.c = executor;
    }

    @Override // defpackage.vxo
    public final zwc a() {
        zwc zwcVarA = this.a.a();
        final yqi yqiVar = this.b;
        return zwcVarA.d(wyo.e(new zvy() { // from class: vxx
            @Override // defpackage.zvy
            public final Object a(zvz zvzVar, Object obj) {
                vxn vxnVar = (vxn) obj;
                vxn vxnVar2 = vxn.a;
                if (vxnVar == vxnVar2) {
                    return vxnVar2;
                }
                yqi yqiVar2 = yqiVar;
                return vxnVar.d() ? vxn.a(yqiVar2.apply(vxnVar.c()), vxnVar.b()) : new vxn(yqiVar2.apply(vxnVar.c()), Instant.EPOCH, false);
            }
        }), this.c);
    }

    @Override // defpackage.vxo
    public final zyd b() {
        return zxy.a;
    }

    @Override // defpackage.vxo
    public final Object c() {
        return ((vxc) this.a).a;
    }

    public final String toString() {
        yqi yqiVar = this.b;
        return "DataSources.transform(" + this.a.toString() + ", " + yqiVar.toString() + ")";
    }
}

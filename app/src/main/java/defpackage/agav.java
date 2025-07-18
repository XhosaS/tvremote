package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agav extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgr b;
    final /* synthetic */ String c = "request";
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agav(ahgr ahgrVar, Object obj, agsw agswVar) {
        super(2, agswVar);
        this.b = ahgrVar;
        this.d = obj;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agav) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws StatusException {
        agwe agweVar;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            agweVar = (agwe) this.e;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ahgs ahgsVar = (ahgs) this.e;
            agwe agweVar2 = new agwe();
            ahgr ahgrVar = this.b;
            agau agauVar = new agau(agweVar2, ahgsVar, this.d);
            this.e = agweVar2;
            this.a = 1;
            if (ahgrVar.fD(agauVar, this) == agtgVar) {
                return agtgVar;
            }
            agweVar = agweVar2;
        }
        if (agweVar.a) {
            return agpu.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.k.withDescription("Expected one " + str + " for " + obj2 + " but received none"), null);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        agav agavVar = new agav(this.b, this.d, agswVar);
        agavVar.e = obj;
        return agavVar;
    }
}

package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agau implements ahgs {
    final /* synthetic */ agwe a;
    final /* synthetic */ ahgs b;
    final /* synthetic */ String c = "request";
    final /* synthetic */ Object d;

    public agau(agwe agweVar, ahgs ahgsVar, Object obj) {
        this.a = agweVar;
        this.b = ahgsVar;
        this.d = obj;
    }

    @Override // defpackage.ahgs
    public final Object a(Object obj, agsw agswVar) throws StatusException {
        agwe agweVar = this.a;
        if (!agweVar.a) {
            agweVar.a = true;
            Object objA = this.b.a(obj, agswVar);
            return objA == agtg.a ? objA : agpu.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.k.withDescription("Expected one " + str + " for " + obj2 + " but received two"), null);
    }
}

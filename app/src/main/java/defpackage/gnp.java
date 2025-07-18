package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnp extends agtu implements agvb {
    final /* synthetic */ gnr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnp(gnr gnrVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gnrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnp) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        gnr gnrVar = this.a;
        Instant instantA = gnrVar.d.a();
        instantA.getClass();
        String str = gnrVar.e;
        str.getClass();
        gnrVar.b.b(new gnf(instantA, str, 1));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gnp(this.a, agswVar);
    }
}

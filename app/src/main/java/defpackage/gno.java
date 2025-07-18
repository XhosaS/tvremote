package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gno extends agtu implements agvb {
    final /* synthetic */ gnr a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gno(gnr gnrVar, String str, int i, agsw agswVar) {
        super(2, agswVar);
        this.a = gnrVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gno) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        gnr gnrVar = this.a;
        Instant instantA = gnrVar.d.a();
        instantA.getClass();
        gnrVar.b.b(new gnf(instantA, this.b, this.c));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gno(this.a, this.b, this.c, agswVar);
    }
}

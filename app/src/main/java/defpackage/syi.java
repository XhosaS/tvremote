package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syi extends agtu implements agvb {
    final /* synthetic */ syj a;
    final /* synthetic */ abvo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syi(syj syjVar, abvo abvoVar, agsw agswVar) {
        super(2, agswVar);
        this.a = syjVar;
        this.b = abvoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((syi) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        syj syjVar = this.a;
        if (syjVar.d()) {
            return agpu.a;
        }
        syjVar.c = syjVar.c.s(this.b);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new syi(this.a, this.b, agswVar);
    }
}

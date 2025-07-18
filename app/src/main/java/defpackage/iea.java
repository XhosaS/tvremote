package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iea extends agtu implements agvb {
    int a;
    final /* synthetic */ iep b;
    final /* synthetic */ ire c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iea(iep iepVar, ire ireVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iepVar;
        this.c = ireVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iea) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iep iepVar = this.b;
            ire ireVar = this.c;
            this.a = 1;
            if (iepVar.a(ireVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iea(this.b, this.c, agswVar);
    }
}

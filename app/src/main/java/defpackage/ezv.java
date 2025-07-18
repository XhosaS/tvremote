package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezv extends agtu implements agvb {
    int a;
    final /* synthetic */ fab b;
    final /* synthetic */ fmy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezv(fab fabVar, fmy fmyVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fabVar;
        this.c = fmyVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fab fabVar = this.b;
            fmy fmyVar = this.c;
            this.a = 1;
            if (fabVar.c(fmyVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ezv(this.b, this.c, agswVar);
    }
}

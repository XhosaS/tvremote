package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkb extends agtu implements agvb {
    int a;
    final /* synthetic */ bkd b;
    final /* synthetic */ bko c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkb(bkd bkdVar, bko bkoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bkdVar;
        this.c = bkoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            bkd bkdVar = this.b;
            bko bkoVar = this.c;
            this.a = 1;
            if (bkdVar.a.f(bkoVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bkb(this.b, this.c, agswVar);
    }
}

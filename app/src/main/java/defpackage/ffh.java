package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffh extends agtu implements agvb {
    int a;
    final /* synthetic */ ffj b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffh(ffj ffjVar, int i, agsw agswVar) {
        super(2, agswVar);
        this.b = ffjVar;
        this.c = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ffj ffjVar = this.b;
            int i2 = this.c;
            ffb ffbVar = new ffb();
            this.a = 1;
            if (ffjVar.g.a(i2, ffbVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ffh(this.b, this.c, agswVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxo extends agtu implements agvb {
    int a;
    final /* synthetic */ fxk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(fxk fxkVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fxkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fxk fxkVar = this.b;
            this.a = 1;
            if (fxkVar.b.a(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fxo(this.b, agswVar);
    }
}

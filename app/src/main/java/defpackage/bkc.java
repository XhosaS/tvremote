package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkc extends agtu implements agvb {
    int a;
    final /* synthetic */ bkd b;
    final /* synthetic */ bkp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(bkd bkdVar, bkp bkpVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bkdVar;
        this.c = bkpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            bkd bkdVar = this.b;
            bkp bkpVar = this.c;
            this.a = 1;
            if (bkdVar.a.g(bkpVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bkc(this.b, this.c, agswVar);
    }
}

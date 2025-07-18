package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjz extends agtu implements agvb {
    int a;
    final /* synthetic */ bkd b;
    final /* synthetic */ bkn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjz(bkd bkdVar, bkn bknVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bkdVar;
        this.c = bknVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bjz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            bkd bkdVar = this.b;
            bkn bknVar = this.c;
            this.a = 1;
            if (bkdVar.a.c(bknVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bjz(this.b, this.c, agswVar);
    }
}

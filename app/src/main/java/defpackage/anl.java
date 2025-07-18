package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anl extends agtu implements agvb {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ano c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anl(ano anoVar, agsw agswVar) {
        super(2, agswVar);
        this.c = anoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anl) c((aog) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            aog aogVar = (aog) this.b;
            ano anoVar = this.c;
            this.a = 1;
            if (anoVar.e(aogVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        anl anlVar = new anl(this.c, agswVar);
        anlVar.b = obj;
        return anlVar;
    }
}

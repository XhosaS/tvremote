package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aml extends agtu implements agvb {
    int a;
    final /* synthetic */ ano b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aml(ano anoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = anoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aml) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ano anoVar = this.b;
            this.a = 1;
            if (anoVar.f(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new aml(this.b, agswVar);
    }
}

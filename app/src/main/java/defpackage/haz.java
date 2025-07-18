package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haz extends agtu implements agvb {
    int a;
    final /* synthetic */ hba b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haz(hba hbaVar, agsw agswVar) {
        super(2, agswVar);
        this.b = hbaVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((haz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hba hbaVar = this.b;
            this.a = 1;
            if (hbaVar.a(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new haz(this.b, agswVar);
    }
}

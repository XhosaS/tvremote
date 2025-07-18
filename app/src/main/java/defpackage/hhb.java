package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhb extends agtu implements agvb {
    int a;
    final /* synthetic */ hhd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(hhd hhdVar, agsw agswVar) {
        super(2, agswVar);
        this.b = hhdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hhd hhdVar = this.b;
            this.a = 1;
            if (hhdVar.h.b(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hhb(this.b, agswVar);
    }
}

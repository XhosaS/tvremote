package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sko extends agtu implements agvb {
    int a;
    final /* synthetic */ skv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sko(skv skvVar, agsw agswVar) {
        super(2, agswVar);
        this.b = skvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sko) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            skv skvVar = this.b;
            this.a = 1;
            if (skvVar.h(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sko(this.b, agswVar);
    }
}

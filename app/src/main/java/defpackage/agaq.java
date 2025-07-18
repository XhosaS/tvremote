package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agaq extends agtu implements agvb {
    int a;
    final /* synthetic */ agam b;
    final /* synthetic */ afeq c;
    final /* synthetic */ agay d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agaq(agam agamVar, afeq afeqVar, agay agayVar, agsw agswVar) {
        super(2, agswVar);
        this.b = agamVar;
        this.c = afeqVar;
        this.d = agayVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agaq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Exception {
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                agam agamVar = this.b;
                afeq afeqVar = this.c;
                agay agayVar = this.d;
                this.a = 1;
                if (agamVar.a(afeqVar, agayVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
            this.c.c();
            return agpu.a;
        } catch (Exception e) {
            this.c.b("Collection of requests completed exceptionally", e);
            throw e;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new agaq(this.b, this.c, this.d, agswVar);
    }
}

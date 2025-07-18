package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahfv extends agtu implements agvb {
    int a;
    final /* synthetic */ ahgh b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahfv(ahgh ahghVar, Object obj, agsw agswVar) {
        super(2, agswVar);
        this.b = ahghVar;
        this.c = obj;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahfv) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        Object objA;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                ahgh ahghVar = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (ahghVar.g(obj2, this) == agtgVar) {
                    return agtgVar;
                }
            }
            objA = agpu.a;
        } catch (Throwable th) {
            objA = agpl.a(th);
        }
        return new ahft(agpk.b(objA) ? agpu.a : new ahfr(agpk.a(objA)));
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahfv ahfvVar = new ahfv(this.b, this.c, agswVar);
        ahfvVar.d = obj;
        return ahfvVar;
    }
}

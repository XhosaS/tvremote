package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpq extends agtu implements agvb {
    int a;
    final /* synthetic */ gps b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpq(gps gpsVar, agsw agswVar) {
        super(2, agswVar);
        this.b = gpsVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gpq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            gps gpsVar = this.b;
            this.a = 1;
            if (gpsVar.g(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gpq(this.b, agswVar);
    }
}

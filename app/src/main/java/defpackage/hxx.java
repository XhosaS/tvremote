package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxx extends agtu implements agvb {
    int a;
    final /* synthetic */ hxz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxx(hxz hxzVar, agsw agswVar) {
        super(2, agswVar);
        this.b = hxzVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hxx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            hxz hxzVar = this.b;
            this.a = 1;
            if (hxzVar.d() == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hxx(this.b, agswVar);
    }
}

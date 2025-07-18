package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sby extends agtu implements agvb {
    int a;
    final /* synthetic */ sbz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sby(sbz sbzVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sbzVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sby) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            sbz sbzVar = this.b;
            long millis = sbzVar.c.toMillis();
            sbx sbxVar = new sbx(sbzVar, null);
            this.a = 1;
            obj = ahep.b(millis, sbxVar, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        rur rurVar = (rur) obj;
        return rurVar == null ? sbz.b : rurVar;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sby(this.b, agswVar);
    }
}

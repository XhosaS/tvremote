package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqr extends agtu implements agvb {
    int a;
    final /* synthetic */ sqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqr(sqv sqvVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqr) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zyd zydVarH = this.b.d.h();
            this.a = 1;
            obj = ahkr.b(zydVarH, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        sqv sqvVar = this.b;
        sqvVar.a.a(new sqq(sqvVar, null));
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sqr(this.b, agswVar);
    }
}

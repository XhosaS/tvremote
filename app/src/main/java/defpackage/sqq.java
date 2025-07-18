package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sqq extends agtu implements agvb {
    int a;
    final /* synthetic */ sqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqq(sqv sqvVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sqvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            sqv sqvVar = this.b;
            this.a = 1;
            if (sqvVar.e(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sqq(this.b, agswVar);
    }
}

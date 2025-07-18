package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbx extends agtu implements agvb {
    int a;
    final /* synthetic */ sbz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbx(sbz sbzVar, agsw agswVar) {
        super(2, agswVar);
        this.b = sbzVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sbx) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        sbz sbzVar = this.b;
        this.a = 1;
        Object objB = ahkr.b(sbzVar.d, this);
        return objB == agtgVar ? agtgVar : objB;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new sbx(this.b, agswVar);
    }
}

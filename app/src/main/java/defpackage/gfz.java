package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfz extends agtu implements agvb {
    int a;
    final /* synthetic */ fto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfz(fto ftoVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ftoVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gfz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        fto ftoVar = this.b;
        this.a = 1;
        Object objA = ftoVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gfz(this.b, agswVar);
    }
}

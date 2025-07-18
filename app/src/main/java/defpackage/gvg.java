package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvg extends agtu implements agvb {
    int a;
    final /* synthetic */ gvh b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvg(gvh gvhVar, String str, agsw agswVar) {
        super(2, agswVar);
        this.b = gvhVar;
        this.c = str;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gvg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        gvh gvhVar = this.b;
        gvf gvfVar = new gvf(gvhVar, this.c, null);
        this.a = 1;
        Object objA = ahal.a(gvhVar.a, gvfVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gvg(this.b, this.c, agswVar);
    }
}

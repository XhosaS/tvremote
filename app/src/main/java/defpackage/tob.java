package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tob extends agtu implements agvb {
    int a;
    final /* synthetic */ toc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tob(toc tocVar, agsw agswVar) {
        super(2, agswVar);
        this.b = tocVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tob) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        toc tocVar = this.b;
        this.a = 1;
        Object objC = tocVar.c(this);
        return objC == agtgVar ? agtgVar : objC;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tob(this.b, agswVar);
    }
}

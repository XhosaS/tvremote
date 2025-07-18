package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpi extends agtu implements agvb {
    int a;
    final /* synthetic */ agux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpi(agsw agswVar, agux aguxVar) {
        super(2, agswVar);
        this.b = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpi) c((bog) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        agux aguxVar = this.b;
        this.a = 1;
        Object objA = aguxVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bpi bpiVar = new bpi(agswVar, this.b);
        bpiVar.c = obj;
        return bpiVar;
    }
}

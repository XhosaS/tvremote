package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpl extends agtu implements agvb {
    int a;
    final /* synthetic */ agux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpl(agsw agswVar, agux aguxVar) {
        super(2, agswVar);
        this.b = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpl) c((bog) obj, (agsw) obj2)).b(agpu.a);
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
        bpl bplVar = new bpl(agswVar, this.b);
        bplVar.c = obj;
        return bplVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpc extends agtu implements agvb {
    final /* synthetic */ agux a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpc(agsw agswVar, agux aguxVar) {
        super(2, agswVar);
        this.a = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpc) c((bog) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        bog bogVar = (bog) this.b;
        bogVar.getClass();
        return this.a.a(bogVar.a.a);
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bpc bpcVar = new bpc(agswVar, this.a);
        bpcVar.b = obj;
        return bpcVar;
    }
}

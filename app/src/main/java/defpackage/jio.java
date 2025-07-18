package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jio extends agtu implements agvb {
    final /* synthetic */ jip a;
    final /* synthetic */ xnr b;
    final /* synthetic */ gez c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jio(jip jipVar, xnr xnrVar, gez gezVar, agsw agswVar) {
        super(2, agswVar);
        this.a = jipVar;
        this.b = xnrVar;
        this.c = gezVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jio) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ahbt ahbtVar = (ahbt) this.d;
        zyd zydVarD = this.a.g.d(this.b, this.c);
        ahcb ahcbVarD = ahal.d(ahbtVar, null, 0, new jim(zydVarD, null), 3);
        ahcbVarD.w(new jin(zydVarD));
        return ahcbVarD;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        jio jioVar = new jio(this.a, this.b, this.c, agswVar);
        jioVar.d = obj;
        return jioVar;
    }
}

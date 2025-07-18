package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bou extends agtu implements agvb {
    final /* synthetic */ agvb a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bou(agvb agvbVar, agsw agswVar) {
        super(2, agswVar);
        this.a = agvbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bou) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        agtc agtcVar = ((ahbt) this.b).fs().get(agsy.b);
        agtcVar.getClass();
        agsy agsyVar = (agsy) agtcVar;
        ahaz ahazVar = new ahaz();
        ahal.c(ahde.a, agsyVar, 4, new bos(ahazVar, this.a, null));
        while (!ahazVar.v()) {
            try {
                return ahak.a(agsyVar, new bot(ahazVar, null));
            } catch (InterruptedException unused) {
            }
        }
        return ahazVar.A();
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bou bouVar = new bou(this.a, agswVar);
        bouVar.b = obj;
        return bouVar;
    }
}

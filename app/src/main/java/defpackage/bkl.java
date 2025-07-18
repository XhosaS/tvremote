package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkl extends agtu implements agvb {
    final /* synthetic */ bkn a;
    final /* synthetic */ bkm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkl(bkn bknVar, bkm bkmVar, agsw agswVar) {
        super(2, agswVar);
        this.a = bknVar;
        this.b = bkmVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bkl) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        throw null;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        bkl bklVar = new bkl(this.a, this.b, agswVar);
        bklVar.c = obj;
        return bklVar;
    }
}

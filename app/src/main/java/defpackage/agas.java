package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agas extends agtu implements agvb {
    int a;
    final /* synthetic */ afem b;
    final /* synthetic */ afen c;
    final /* synthetic */ afil d;
    final /* synthetic */ afih e;
    final /* synthetic */ agam f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agas(afem afemVar, afen afenVar, afil afilVar, afih afihVar, agam agamVar, agsw agswVar) {
        super(2, agswVar);
        this.b = afemVar;
        this.c = afenVar;
        this.d = afilVar;
        this.e = afihVar;
        this.f = agamVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agas) c((ahgs) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            agar agarVar = new agar(this.b, this.c, this.d, this.e, (ahgs) this.g, this.f, null);
            this.a = 1;
            if (ahbu.a(agarVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        agas agasVar = new agas(this.b, this.c, this.d, this.e, this.f, agswVar);
        agasVar.g = obj;
        return agasVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpf extends agtu implements agvb {
    int a;
    final /* synthetic */ agte b;
    final /* synthetic */ bmn c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ agux f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpf(agte agteVar, bmn bmnVar, boolean z, boolean z2, agux aguxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = agteVar;
        this.c = bmnVar;
        this.d = z;
        this.e = z2;
        this.f = aguxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bpf) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Throwable {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        agte agteVar = this.b;
        bpe bpeVar = new bpe(this.c, this.d, this.e, this.f, null);
        this.a = 1;
        Object objA = ahal.a(agteVar, bpeVar, this);
        return objA == agtgVar ? agtgVar : objA;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new bpf(this.b, this.c, this.d, this.e, this.f, agswVar);
    }
}

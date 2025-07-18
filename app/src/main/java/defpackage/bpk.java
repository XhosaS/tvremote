package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpk extends agtu implements agux {
    int a;
    final /* synthetic */ bmn b;
    final /* synthetic */ agux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpk(bmn bmnVar, agux aguxVar, agsw agswVar) {
        super(1, agswVar);
        this.b = bmnVar;
        this.c = aguxVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new bpk(this.b, this.c, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        bmn bmnVar = this.b;
        bpj bpjVar = new bpj(bmnVar, null, this.c);
        this.a = 1;
        Object objW = bmnVar.w(bpjVar, this);
        return objW == agtgVar ? agtgVar : objW;
    }
}

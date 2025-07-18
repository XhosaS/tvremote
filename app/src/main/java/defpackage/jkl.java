package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkl extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ xjj c;
    final /* synthetic */ gez d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkl(jkx jkxVar, xjj xjjVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = xjjVar;
        this.d = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jkl(this.b, this.c, this.d, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        jkx jkxVar = this.b;
        jkk jkkVar = new jkk(jkxVar, this.c, this.d, null);
        this.a = 1;
        Object objF = jkxVar.f(jkkVar, this);
        return objF == agtgVar ? agtgVar : objF;
    }
}

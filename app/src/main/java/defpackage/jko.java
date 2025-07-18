package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jko extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ xjl c;
    final /* synthetic */ gez d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jko(jkx jkxVar, xjl xjlVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = xjlVar;
        this.d = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jko(this.b, this.c, this.d, (agsw) obj).b(agpu.a);
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
        jkn jknVar = new jkn(jkxVar, this.c, this.d, null);
        this.a = 1;
        Object objF = jkxVar.f(jknVar, this);
        return objF == agtgVar ? agtgVar : objF;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkf extends agtu implements agux {
    int a;
    final /* synthetic */ jkx b;
    final /* synthetic */ gez c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkf(jkx jkxVar, gez gezVar, agsw agswVar) {
        super(1, agswVar);
        this.b = jkxVar;
        this.c = gezVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new jkf(this.b, this.c, (agsw) obj).b(agpu.a);
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
        jke jkeVar = new jke(jkxVar, this.c, null);
        this.a = 1;
        Object objF = jkxVar.f(jkeVar, this);
        return objF == agtgVar ? agtgVar : objF;
    }
}

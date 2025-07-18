package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amu extends agtu implements agux {
    int a;
    final /* synthetic */ agux b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amu(agux aguxVar, agsw agswVar) {
        super(1, agswVar);
        this.b = aguxVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new amu(this.b, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        agux aguxVar = this.b;
        this.a = 1;
        Object objA = aguxVar.a(this);
        return objA == agtgVar ? agtgVar : objA;
    }
}

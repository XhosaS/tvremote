package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bok extends agtu implements agux {
    int a;
    final /* synthetic */ bol b;
    final /* synthetic */ bnf c;
    final /* synthetic */ agvb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bok(bol bolVar, bnf bnfVar, agvb agvbVar, agsw agswVar) {
        super(1, agswVar);
        this.b = bolVar;
        this.c = bnfVar;
        this.d = agvbVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new bok(this.b, this.c, this.d, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Exception {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i != 0) {
            return obj;
        }
        bol bolVar = this.b;
        bnf bnfVar = this.c;
        agvb agvbVar = this.d;
        this.a = 1;
        Object objD = bolVar.d(bnfVar, agvbVar, this);
        return objD == agtgVar ? agtgVar : objD;
    }
}

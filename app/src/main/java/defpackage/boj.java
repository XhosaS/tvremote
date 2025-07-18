package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class boj extends agtu implements agux {
    final /* synthetic */ bol a;
    final /* synthetic */ String b;
    final /* synthetic */ agux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boj(bol bolVar, String str, agux aguxVar, agsw agswVar) {
        super(1, agswVar);
        this.a = bolVar;
        this.b = str;
        this.c = aguxVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new boj(this.a, this.b, this.c, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) throws Exception {
        agpl.b(obj);
        bsk bskVar = this.a.a;
        String str = this.b;
        agux aguxVar = this.c;
        brj brjVarA = bskVar.a(str);
        try {
            Object objA = aguxVar.a(brjVarA);
            aguj.a(brjVarA, null);
            return objA;
        } finally {
        }
    }
}

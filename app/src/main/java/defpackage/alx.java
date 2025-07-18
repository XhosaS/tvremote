package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alx extends agtu implements agux {
    int a;
    final /* synthetic */ alu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alx(alu aluVar, agsw agswVar) {
        super(1, agswVar);
        this.b = aluVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new alx(this.b, (agsw) obj).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            alu aluVar = this.b;
            this.a = 1;
            if (aluVar.a(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }
}

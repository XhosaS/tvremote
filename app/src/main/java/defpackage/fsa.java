package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsa extends agtu implements agvb {
    int a;
    final /* synthetic */ fsb b;
    final /* synthetic */ String c;
    final /* synthetic */ fwe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsa(fsb fsbVar, String str, fwe fweVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fsbVar;
        this.c = str;
        this.d = fweVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fsa) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fsb fsbVar = this.b;
            String str = this.c;
            fwe fweVar = this.d;
            this.a = 1;
            if (fsbVar.b.d(str, fweVar, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fsa(this.b, this.c, this.d, agswVar);
    }
}

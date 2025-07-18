package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvc extends agtu implements agvb {
    int a;
    final /* synthetic */ fvd b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvc(fvd fvdVar, String str, int i, agsw agswVar) {
        super(2, agswVar);
        this.b = fvdVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fvd fvdVar = this.b;
            String str = this.c;
            int i2 = this.d;
            this.a = 1;
            if (fvdVar.a.b(str, i2, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvc(this.b, this.c, this.d, agswVar);
    }
}

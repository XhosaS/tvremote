package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgj extends agtu implements agvb {
    int a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ fgl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgj(byte[] bArr, fgl fglVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bArr;
        this.c = fglVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            xqe xqeVarE = fgl.a.e(this.b);
            if (xqeVarE != null) {
                fgl fglVar = this.c;
                fgi fgiVar = new fgi(fglVar, xqeVarE, null);
                this.a = 1;
                if (ahal.a(fglVar.c, fgiVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgj(this.b, this.c, agswVar);
    }
}

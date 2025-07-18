package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgh extends agtu implements agvb {
    int a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ fgl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgh(byte[] bArr, fgl fglVar, agsw agswVar) {
        super(2, agswVar);
        this.b = bArr;
        this.c = fglVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            xpy xpyVarD = fgl.a.d(this.b);
            if (xpyVarD != null) {
                fgl fglVar = this.c;
                fgg fggVar = new fgg(fglVar, xpyVarD, null);
                this.a = 1;
                if (ahal.a(fglVar.c, fggVar, this) == agtgVar) {
                    return agtgVar;
                }
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fgh(this.b, this.c, agswVar);
    }
}

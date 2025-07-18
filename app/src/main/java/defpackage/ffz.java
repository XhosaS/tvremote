package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffz extends agtu implements agvb {
    int a;
    final /* synthetic */ fga b;
    final /* synthetic */ String c;
    final /* synthetic */ byte[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffz(fga fgaVar, String str, byte[] bArr, agsw agswVar) {
        super(2, agswVar);
        this.b = fgaVar;
        this.c = str;
        this.d = bArr;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            zyd zydVarA = ((gqp) this.b.f.a()).a(this.c, this.d);
            this.a = 1;
            if (ahkr.b(zydVarA, this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ffz(this.b, this.c, this.d, agswVar);
    }
}

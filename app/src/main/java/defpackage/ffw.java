package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffw extends agtu implements agvb {
    int a;
    final /* synthetic */ ffx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffw(ffx ffxVar, agsw agswVar) {
        super(2, agswVar);
        this.b = ffxVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ffw) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ffx ffxVar = this.b;
            this.a = 1;
            Object objB = ((jbd) ffxVar.a.p.a()).b(this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ffw(this.b, agswVar);
    }
}

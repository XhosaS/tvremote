package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iej extends agtu implements agvb {
    int a;
    final /* synthetic */ iep b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iej(iep iepVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iepVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iej) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iep iepVar = this.b;
            this.a = 1;
            if (iepVar.b(this) == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iej(this.b, agswVar);
    }
}

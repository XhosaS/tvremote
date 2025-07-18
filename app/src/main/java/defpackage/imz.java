package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class imz extends agtu implements agvb {
    int a;
    final /* synthetic */ ind b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imz(ind indVar, agsw agswVar) {
        super(2, agswVar);
        this.b = indVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((imz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ind indVar = this.b;
            zyd zydVarA = indVar.o.a(indVar.A);
            this.a = 1;
            if (ahkr.b(zydVarA, this) == agtgVar) {
                return agtgVar;
            }
        }
        ((zdv) ind.a.b().q("com/google/android/apps/tvsearch/setup/fragment/homegraph/HomeGraphSetupActivityPeer$startHeterodyneSync$1$1", "invokeSuspend", 1046, "HomeGraphSetupActivityPeer.kt")).u("Heterodyne sync finished.");
        ind indVar2 = this.b;
        indVar2.k.a = indVar2.A;
        indVar2.j();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new imz(this.b, agswVar);
    }
}

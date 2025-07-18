package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class gef implements fxj, agvt {
    final /* synthetic */ geh a;

    public gef(geh gehVar) {
        this.a = gehVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objG = this.a.g(agswVar);
        return objG == agtg.a ? objG : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, this.a, geh.class, "updateAccountLocations", "updateAccountLocations(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(b(), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}

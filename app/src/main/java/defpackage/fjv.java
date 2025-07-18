package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fjv implements fxj, agvt {
    final /* synthetic */ fjx a;

    public fjv(fjx fjxVar) {
        this.a = fjxVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objA = this.a.a(agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, this.a, fjx.class, "refresh", "refresh(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
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

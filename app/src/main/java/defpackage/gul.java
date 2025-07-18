package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class gul implements fxj, agvt {
    final /* synthetic */ gva a;

    public gul(gva gvaVar) {
        this.a = gvaVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) throws Throwable {
        Object objU = gva.u(this.a, agswVar);
        return objU == agtg.a ? objU : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, agvx.class, "refreshGaiaIds", "initStartup$refreshGaiaIds(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvw(1, agvx.class, "refreshGaiaIds", "initStartup$refreshGaiaIds(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvw(1, agvx.class, "refreshGaiaIds", "initStartup$refreshGaiaIds(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0).hashCode();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class guk implements fxj, agvt {
    final /* synthetic */ gva a;

    public guk(gva gvaVar) {
        this.a = gvaVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) throws Throwable {
        Object objT = gva.t(this.a, agswVar);
        return objT == agtg.a ? objT : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, agvx.class, "refreshAccounts", "initStartup$refreshAccounts(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvw(1, agvx.class, "refreshAccounts", "initStartup$refreshAccounts(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvw(1, agvx.class, "refreshAccounts", "initStartup$refreshAccounts(Lcom/google/android/apps/tvsearch/platform/account/KatnissAccountManagerImpl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0).hashCode();
    }
}

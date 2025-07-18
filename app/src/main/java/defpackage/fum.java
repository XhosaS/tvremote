package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fum implements fxj, agvt {
    final /* synthetic */ ahni a;
    final /* synthetic */ fup b;

    public fum(ahni ahniVar, fup fupVar) {
        this.a = ahniVar;
        this.b = fupVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objA = fup.a(this.a, this.b, agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/PendingCheckAutoLogoutAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/PendingCheckAutoLogoutAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/PendingCheckAutoLogoutAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0).hashCode();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fse implements fxj, agvt {
    final /* synthetic */ ahni a;
    final /* synthetic */ fsg b;

    public fse(ahni ahniVar, fsg fsgVar) {
        this.a = ahniVar;
        this.b = fsgVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objB = fsg.b(this.a, this.b, agswVar);
        return objB == agtg.a ? objB : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/DscAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/DscAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lkotlinx/coroutines/sync/Mutex;Lcom/google/android/apps/tvsearch/datastore/user/accessors/DscAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0).hashCode();
    }
}

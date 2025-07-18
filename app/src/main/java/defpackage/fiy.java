package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fiy implements fxj, agvt {
    final /* synthetic */ fja a;

    public fiy(fja fjaVar) {
        this.a = fjaVar;
    }

    @Override // defpackage.fxj
    public final Object a(agsw agswVar) {
        Object objA = fja.a(this.a, agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.agvt
    public final agoz b() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lcom/google/android/apps/tvsearch/datastore/device/accessors/AppsDataAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fxj) && (obj instanceof agvt)) {
            return agvy.c(new agvw(1, agvx.class, "updateCache", "init$updateCache(Lcom/google/android/apps/tvsearch/datastore/device/accessors/AppsDataAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), ((agvt) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return new agvw(1, agvx.class, "updateCache", "init$updateCache(Lcom/google/android/apps/tvsearch/datastore/device/accessors/AppsDataAccessorCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0).hashCode();
    }
}

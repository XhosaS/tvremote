package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wdz extends agvw implements agux {
    public wdz(Object obj) {
        super(1, obj, wea.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        vzv vzvVar = (vzv) obj;
        vzvVar.getClass();
        wea weaVar = (wea) this.c;
        if (!agvy.c(vzvVar, vzw.a(new vzu()))) {
            return zxn.h(vzvVar);
        }
        zyd zydVarC = ((ujk) weaVar.q.eV()).c();
        zydVarC.getClass();
        return zydVarC;
    }
}

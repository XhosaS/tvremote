package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfd implements yjk {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public kfd(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yft] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yft] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        duz duzVar;
        dwx defaultViewModelProviderFactory;
        dwx defaultViewModelProviderFactory2;
        int i = this.c;
        if (i == 0) {
            this.a.a(this.b);
            return ygi.a;
        }
        if (i == 1) {
            ((kbc) this.b).a(this.a);
            return ygi.a;
        }
        if (i != 2) {
            dxd dxdVarL = czu.l(this.a);
            duzVar = dxdVarL instanceof duz ? (duz) dxdVarL : null;
            return (duzVar == null || (defaultViewModelProviderFactory2 = duzVar.getDefaultViewModelProviderFactory()) == null) ? ((bv) this.b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory2;
        }
        dxd dxdVarL2 = czu.l(this.a);
        duzVar = dxdVarL2 instanceof duz ? (duz) dxdVarL2 : null;
        return (duzVar == null || (defaultViewModelProviderFactory = duzVar.getDefaultViewModelProviderFactory()) == null) ? ((bv) this.b).getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }

    public kfd(yjv yjvVar, kdh kdhVar, int i) {
        this.c = i;
        this.a = yjvVar;
        this.b = kdhVar;
    }
}

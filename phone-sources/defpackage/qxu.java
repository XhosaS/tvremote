package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxu implements yjk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qxu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yft] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yft] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            return czu.l(this.a).getViewModelStore();
        }
        if (i == 1) {
            return ((bck) this.a).a;
        }
        if (i != 2) {
            return new rdp[((ysx[]) this.a).length];
        }
        dxd dxdVarL = czu.l(this.a);
        duz duzVar = dxdVarL instanceof duz ? (duz) dxdVarL : null;
        return duzVar != null ? duzVar.getDefaultViewModelCreationExtras() : dxh.a;
    }
}

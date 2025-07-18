package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbm implements ysx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dbm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, ysx] */
    @Override // defpackage.ysx
    public final Object a(ysy ysyVar, yih yihVar) {
        int i = this.b;
        if (i == 0) {
            Object objA = this.a.a(new dbl(ysyVar, 0), yihVar);
            return objA == yio.a ? objA : ygi.a;
        }
        if (i == 1) {
            Object objA2 = this.a.a(new dbl(ysyVar, 1), yihVar);
            return objA2 == yio.a ? objA2 : ygi.a;
        }
        if (i == 2) {
            Object objA3 = this.a.a(new dbl(ysyVar, 2), yihVar);
            return objA3 == yio.a ? objA3 : ygi.a;
        }
        if (i != 3) {
            Object objA4 = this.a.a(new dbl(ysyVar, 3), yihVar);
            return objA4 == yio.a ? objA4 : ygi.a;
        }
        Object obj = this.a;
        Object objZ = wae.Z(ysyVar, (ysx[]) obj, new cdq(obj, 10), new gsz(null), yihVar);
        return objZ == yio.a ? objZ : ygi.a;
    }
}

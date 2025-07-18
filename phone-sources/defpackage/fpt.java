package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fpt implements fqo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fpt(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, uhp] */
    @Override // defpackage.fqo
    public final Object a(foo fooVar, fnw fnwVar, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return fooVar.z(fnwVar);
        }
        int i3 = 1;
        if (i2 == 1) {
            return fooVar.y(fnwVar);
        }
        if (i2 == 2) {
            return fooVar.s() ? sfy.C(new fra(-100)) : edt.Q(this.a.a(fooVar, fnwVar, i), new pbb(fooVar, i3));
        }
        if (fooVar.s()) {
            return sfy.C(new fra(-100));
        }
        return edt.Q(this.a.a(fooVar, fnwVar, i), new oyy(fooVar, fnwVar, this.b, i3));
    }
}

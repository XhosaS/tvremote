package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aba implements yjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ aba(Object obj, int i, Object obj2, int i2, int i3) {
        this.e = i3;
        this.d = obj;
        this.a = i;
        this.b = obj2;
        this.c = i2;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.c;
            Object obj3 = this.b;
            int i3 = this.a;
            ((abc) this.d).e(i3, obj3, (bao) obj, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.c;
            Object obj4 = this.b;
            int i5 = this.a;
            ((aae) this.d).e(i5, obj4, (bao) obj, bdi.n(i4 | 1));
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.c;
        int i7 = this.a;
        Object obj5 = this.d;
        ((kht) this.b).a((bqh) obj5, i7, (bao) obj, bdi.n(i6 | 1));
        return ygi.a;
    }

    public /* synthetic */ aba(kht khtVar, bqh bqhVar, int i, int i2, int i3) {
        this.e = i3;
        this.b = khtVar;
        this.d = bqhVar;
        this.a = i;
        this.c = i2;
    }
}

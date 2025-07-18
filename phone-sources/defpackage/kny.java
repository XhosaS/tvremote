package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kny implements yjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kny(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.a;
            jxl.q((String) this.b, (bao) obj, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i3 = this.a;
            ((klm) this.b).h((bao) obj, bdi.n(i3 | 1));
            return ygi.a;
        }
        if (i == 2) {
            ((Integer) obj2).intValue();
            int i4 = this.a;
            jys.t((bnn) this.b, (bao) obj, bdi.n(i4 | 1));
            return ygi.a;
        }
        if (i != 3) {
            ((Integer) obj2).intValue();
            int i5 = this.a;
            jyv.q(this.b, (bao) obj, bdi.n(i5 | 1));
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.a;
        kph.a((kpe) this.b, (bao) obj, bdi.n(i6 | 1));
        return ygi.a;
    }
}

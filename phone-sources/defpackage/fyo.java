package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fyo implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fyo(kfb kfbVar, boolean z, int i, int i2) {
        this.d = i2;
        this.c = kfbVar;
        this.a = z;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.b;
            ?? r0 = this.c;
            fus.z(this.a, r0, (bao) obj, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            ((Integer) obj2).intValue();
            int i3 = this.b;
            ?? r02 = this.c;
            hp.e(this.a, r02, (bao) obj, bdi.n(i3 | 1));
            return ygi.a;
        }
        if (i != 2) {
            ((Integer) obj2).intValue();
            int i4 = this.b;
            boolean z = this.a;
            ((kfb) this.c).a(z, (bao) obj, bdi.n(i4 | 1));
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.b;
        boolean z2 = this.a;
        ((kfb) this.c).b(z2, (bao) obj, bdi.n(i5 | 1));
        return ygi.a;
    }

    public /* synthetic */ fyo(boolean z, yjz yjzVar, int i, int i2) {
        this.d = i2;
        this.a = z;
        this.c = yjzVar;
        this.b = i;
    }
}

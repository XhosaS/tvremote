package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aws implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bkp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ aws(boolean z, Object obj, bkp bkpVar, boolean z2, Object obj2, int i, int i2) {
        this.g = i2;
        this.a = z;
        this.e = obj;
        this.b = bkpVar;
        this.c = z2;
        this.f = obj2;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.g == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            Object obj3 = this.f;
            boolean z = this.c;
            bkp bkpVar = this.b;
            awt.a(this.a, this.e, bkpVar, z, (awr) obj3, baoVar, bdi.n(this.d | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i = this.d;
        Object obj4 = this.f;
        boolean z2 = this.c;
        bkp bkpVar2 = this.b;
        wv.E(this.a, this.e, bkpVar2, z2, (atk) obj4, baoVar2, bdi.n(i | 1));
        return ygi.a;
    }
}

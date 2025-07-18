package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kpi implements yjz {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kpi(long j, yjz yjzVar, int i, int i2) {
        this.d = i2;
        this.a = j;
        this.c = yjzVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            ((Integer) obj2).intValue();
            int i = this.b;
            ?? r0 = this.c;
            zy.t(this.a, r0, (bao) obj, bdi.n(i | 1));
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int i2 = this.b;
        long j = this.a;
        ((kpj) this.c).a(j, (bao) obj, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ kpi(kpj kpjVar, long j, int i, int i2) {
        this.d = i2;
        this.c = kpjVar;
        this.a = j;
        this.b = i;
    }
}

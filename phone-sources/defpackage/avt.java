package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class avt implements yjz {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ avt(khp khpVar, long j, long j2, bkp bkpVar, chc chcVar, int i, int i2) {
        this.g = i2;
        this.e = khpVar;
        this.a = j;
        this.b = j2;
        this.f = bkpVar;
        this.d = chcVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bkp, java.lang.Object] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            long j = this.b;
            long j2 = this.a;
            Object obj3 = this.f;
            wv.z(this.d, this.e, (chc) obj3, j2, j, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            int i3 = this.c;
            Object obj4 = this.d;
            ?? r7 = this.f;
            long j3 = this.b;
            ((khp) this.e).c(this.a, j3, r7, (chc) obj4, baoVar2, bdi.n(i3 | 1));
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        ((Integer) obj2).intValue();
        int i4 = this.c;
        ?? r6 = this.e;
        long j4 = this.b;
        long j5 = this.a;
        atj.a(this.d, this.f, j5, j4, r6, baoVar3, bdi.n(i4 | 1));
        return ygi.a;
    }

    public /* synthetic */ avt(yjk yjkVar, bkp bkpVar, long j, long j2, yjv yjvVar, int i, int i2) {
        this.g = i2;
        this.d = yjkVar;
        this.f = bkpVar;
        this.a = j;
        this.b = j2;
        this.e = yjvVar;
        this.c = i;
    }

    public /* synthetic */ avt(yjz yjzVar, yjz yjzVar2, chc chcVar, long j, long j2, int i, int i2) {
        this.g = i2;
        this.d = yjzVar;
        this.e = yjzVar2;
        this.f = chcVar;
        this.a = j;
        this.b = j2;
        this.c = i;
    }
}

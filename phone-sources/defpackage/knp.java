package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class knp implements yjz {
    public final /* synthetic */ long a;
    public final /* synthetic */ bkp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ knp(long j, bkp bkpVar, yjz yjzVar, yjz yjzVar2, int i, int i2, int i3) {
        this.g = i3;
        this.a = j;
        this.b = bkpVar;
        this.f = yjzVar;
        this.e = yjzVar2;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.d;
            int i3 = this.c;
            bkp bkpVar = this.b;
            jxl.B((wls) this.e, (chc) this.f, this.a, bkpVar, i3, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            int i4 = this.c;
            int i5 = this.d;
            long j = this.a;
            asg.a((bqh) this.f, (String) this.e, this.b, j, baoVar2, bdi.n(i4 | 1), i5);
            return ygi.a;
        }
        if (i != 2) {
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.c | 1);
            int i6 = this.d;
            long j2 = this.a;
            bkp bkpVar2 = this.b;
            rdd.z((bqh) this.f, (String) this.e, bkpVar2, j2, (bao) obj, iN, i6);
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int iN2 = bdi.n(this.c | 1);
        int i7 = this.d;
        ?? r4 = this.e;
        ?? r3 = this.f;
        bkp bkpVar3 = this.b;
        jys.p(this.a, bkpVar3, r3, r4, (bao) obj, iN2, i7);
        return ygi.a;
    }

    public /* synthetic */ knp(bqh bqhVar, String str, bkp bkpVar, long j, int i, int i2, int i3) {
        this.g = i3;
        this.f = bqhVar;
        this.e = str;
        this.b = bkpVar;
        this.a = j;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ knp(wls wlsVar, chc chcVar, long j, bkp bkpVar, int i, int i2, int i3) {
        this.g = i3;
        this.e = wlsVar;
        this.f = chcVar;
        this.a = j;
        this.b = bkpVar;
        this.c = i;
        this.d = i2;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kho implements yjz {
    public final /* synthetic */ float a;
    public final /* synthetic */ bkp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kho(khp khpVar, float f, yjv yjvVar, bkp bkpVar, int i, int i2) {
        this.f = i2;
        this.d = khpVar;
        this.a = f;
        this.e = yjvVar;
        this.b = bkpVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            bkp bkpVar = this.b;
            ?? r2 = this.e;
            ((khp) this.d).b(this.a, r2, bkpVar, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            int i3 = this.c;
            float f = this.a;
            bkp bkpVar2 = this.b;
            rdd.q(this.d, this.e, bkpVar2, f, baoVar2, bdi.n(i3 | 1));
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        ((Integer) obj2).intValue();
        int i4 = this.c;
        float f2 = this.a;
        bkp bkpVar3 = this.b;
        a.bZ(this.d, this.e, bkpVar3, f2, baoVar3, bdi.n(i4 | 1));
        return ygi.a;
    }

    public /* synthetic */ kho(yjz yjzVar, yjz yjzVar2, bkp bkpVar, float f, int i, int i2) {
        this.f = i2;
        this.d = yjzVar;
        this.e = yjzVar2;
        this.b = bkpVar;
        this.a = f;
        this.c = i;
    }
}

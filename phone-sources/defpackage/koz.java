package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class koz implements yjz {
    public final /* synthetic */ bkp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ yjz d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ koz(wqo wqoVar, long j, bkp bkpVar, float f, yjz yjzVar, int i, int i2) {
        this.g = i2;
        this.f = wqoVar;
        this.b = j;
        this.a = bkpVar;
        this.c = f;
        this.d = yjzVar;
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i = this.e;
            yjz yjzVar = this.d;
            float f = this.c;
            bkp bkpVar = this.a;
            jys.m((wqo) this.f, this.b, bkpVar, f, yjzVar, baoVar, bdi.n(i | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.e;
        yjz yjzVar2 = this.d;
        float f2 = this.c;
        long j = this.b;
        jyv.A(this.f, this.a, j, f2, yjzVar2, baoVar2, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ koz(yjk yjkVar, bkp bkpVar, long j, float f, yjz yjzVar, int i, int i2) {
        this.g = i2;
        this.f = yjkVar;
        this.a = bkpVar;
        this.b = j;
        this.c = f;
        this.d = yjzVar;
        this.e = i;
    }
}

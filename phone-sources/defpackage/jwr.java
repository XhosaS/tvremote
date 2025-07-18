package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jwr implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jwr(long j, yjk yjkVar, boolean z, int i, int i2) {
        this.e = i2;
        this.b = j;
        this.d = yjkVar;
        this.a = z;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i2 = this.c;
            long j = this.b;
            ((jws) this.d).b(this.a, j, baoVar, bdi.n(i2 | 1));
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar2 = (bao) obj;
            ((Integer) obj2).intValue();
            int i3 = this.c;
            long j2 = this.b;
            ((jws) this.d).a(this.a, j2, baoVar2, bdi.n(i3 | 1));
            return ygi.a;
        }
        bao baoVar3 = (bao) obj;
        ((Integer) obj2).intValue();
        int i4 = this.c;
        boolean z = this.a;
        atc.a(this.b, this.d, z, baoVar3, bdi.n(i4 | 1));
        return ygi.a;
    }

    public /* synthetic */ jwr(jws jwsVar, boolean z, long j, int i, int i2) {
        this.e = i2;
        this.d = jwsVar;
        this.a = z;
        this.b = j;
        this.c = i;
    }
}

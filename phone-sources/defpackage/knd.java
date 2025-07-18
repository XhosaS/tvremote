package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class knd implements yjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bkp d;
    public final /* synthetic */ int e;
    private final /* synthetic */ int f;

    public /* synthetic */ knd(int i, float f, long j, bkp bkpVar, int i2, int i3) {
        this.f = i3;
        this.a = i;
        this.b = f;
        this.c = j;
        this.d = bkpVar;
        this.e = i2;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.a | 1);
            int i = this.e;
            long j = this.c;
            float f = this.b;
            og.v(this.d, f, j, (bao) obj, iN, i);
            return ygi.a;
        }
        bao baoVar = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.e;
        bkp bkpVar = this.d;
        long j2 = this.c;
        kir.f(this.a, this.b, j2, bkpVar, baoVar, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ knd(bkp bkpVar, float f, long j, int i, int i2, int i3) {
        this.f = i3;
        this.d = bkpVar;
        this.b = f;
        this.c = j;
        this.a = i;
        this.e = i2;
    }
}

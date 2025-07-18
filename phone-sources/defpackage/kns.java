package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kns implements yjz {
    public final /* synthetic */ bkp a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kns(String str, long j, int i, bkp bkpVar, int i2, int i3) {
        this.f = i3;
        this.e = str;
        this.b = j;
        this.c = i;
        this.a = bkpVar;
        this.d = i2;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.c | 1);
            int i2 = this.d;
            long j = this.b;
            bkp bkpVar = this.a;
            jxl.t((String) this.e, bkpVar, j, (bao) obj, iN, i2);
            return ygi.a;
        }
        if (i != 1) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i3 = this.d;
            bkp bkpVar2 = this.a;
            int i4 = this.c;
            jyv.u((String) this.e, this.b, i4, bkpVar2, baoVar, bdi.n(i3 | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i5 = this.d;
        long j2 = this.b;
        bkp bkpVar3 = this.a;
        ((khk) this.e).e(this.c, bkpVar3, j2, baoVar2, bdi.n(i5 | 1));
        return ygi.a;
    }

    public /* synthetic */ kns(String str, bkp bkpVar, long j, int i, int i2, int i3) {
        this.f = i3;
        this.e = str;
        this.a = bkpVar;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ kns(khk khkVar, int i, bkp bkpVar, long j, int i2, int i3) {
        this.f = i3;
        this.e = khkVar;
        this.c = i;
        this.a = bkpVar;
        this.b = j;
        this.d = i2;
    }
}

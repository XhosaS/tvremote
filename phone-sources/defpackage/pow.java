package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pow implements yjz {
    public final /* synthetic */ float a;
    public final /* synthetic */ yjv b;
    public final /* synthetic */ bkp c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ auy e;
    public final /* synthetic */ yka f;
    public final /* synthetic */ yka g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ylz j;
    public final /* synthetic */ kw k;
    private final /* synthetic */ int l;

    public /* synthetic */ pow(float f, yjv yjvVar, bkp bkpVar, boolean z, auy auyVar, kw kwVar, yka ykaVar, yka ykaVar2, ylz ylzVar, int i, int i2, int i3) {
        this.l = i3;
        this.a = f;
        this.b = yjvVar;
        this.c = bkpVar;
        this.d = z;
        this.e = auyVar;
        this.k = kwVar;
        this.f = ykaVar;
        this.g = ykaVar2;
        this.j = ylzVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.l != 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i = this.h;
            int i2 = this.i;
            ylz ylzVar = this.j;
            yka ykaVar = this.g;
            yka ykaVar2 = this.f;
            kw kwVar = this.k;
            auy auyVar = this.e;
            boolean z = this.d;
            bkp bkpVar = this.c;
            avm.d(this.a, this.b, bkpVar, z, auyVar, kwVar, ykaVar2, ykaVar, ylzVar, baoVar, bdi.n(i | 1), bdi.n(i2));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i3 = this.h;
        int i4 = this.i;
        ylz ylzVar2 = this.j;
        yka ykaVar3 = this.g;
        yka ykaVar4 = this.f;
        kw kwVar2 = this.k;
        auy auyVar2 = this.e;
        boolean z2 = this.d;
        bkp bkpVar2 = this.c;
        pox.a(this.a, this.b, bkpVar2, z2, auyVar2, kwVar2, ykaVar4, ykaVar3, ylzVar2, baoVar2, bdi.n(i3 | 1), bdi.n(i4));
        return ygi.a;
    }
}

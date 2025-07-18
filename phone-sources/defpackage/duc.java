package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class duc implements yjz {
    public final /* synthetic */ String a;
    public final /* synthetic */ djh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ duc(djl djlVar, String str, djh djhVar, int i, int i2, int i3, int i4) {
        this.g = i4;
        this.f = djlVar;
        this.a = str;
        this.b = djhVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [djl, java.lang.Object] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            ((Integer) obj2).intValue();
            int iN = bdi.n(this.d | 1);
            int i = this.e;
            int i2 = this.c;
            djh djhVar = this.b;
            String str = this.a;
            cry.m(this.f, str, djhVar, i2, (bao) obj, iN, i);
            return ygi.a;
        }
        bao baoVar = (bao) obj;
        ((Integer) obj2).intValue();
        int iN2 = bdi.n(this.d | 1);
        int i3 = this.e;
        int i4 = this.c;
        Object obj3 = this.f;
        czu.r(this.a, this.b, (due) obj3, i4, baoVar, iN2, i3);
        return ygi.a;
    }

    public /* synthetic */ duc(String str, djh djhVar, due dueVar, int i, int i2, int i3, int i4) {
        this.g = i4;
        this.a = str;
        this.b = djhVar;
        this.f = dueVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}

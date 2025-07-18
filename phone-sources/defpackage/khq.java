package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class khq implements yjz {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ khq(float f, bkp bkpVar, yjz yjzVar, int i, int i2) {
        this.e = i2;
        this.a = f;
        this.c = bkpVar;
        this.d = yjzVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bkp, java.lang.Object] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.e == 0) {
            ((Integer) obj2).intValue();
            int i = this.b;
            ?? r0 = this.d;
            ?? r1 = this.c;
            kdw.m(this.a, r1, r0, (bao) obj, bdi.n(i | 1));
            return ygi.a;
        }
        ((Integer) obj2).intValue();
        int i2 = this.b;
        float f = this.a;
        Object obj3 = this.d;
        ((jhl) this.c).i((wfo) obj3, f, (bao) obj, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ khq(jhl jhlVar, wfo wfoVar, float f, int i, int i2) {
        this.e = i2;
        this.c = jhlVar;
        this.d = wfoVar;
        this.a = f;
        this.b = i;
    }
}

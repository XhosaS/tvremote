package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kig implements yjz {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ kig(bkp bkpVar, avn avnVar, boolean z, kw kwVar, yka ykaVar, yka ykaVar2, int i, int i2) {
        this.h = i2;
        this.d = bkpVar;
        this.c = avnVar;
        this.a = z;
        this.g = kwVar;
        this.e = ykaVar;
        this.f = ykaVar2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yka] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i = this.b;
            ?? r6 = this.f;
            ?? r5 = this.e;
            Object obj3 = this.g;
            avm.c(this.d, (avn) this.c, this.a, (kw) obj3, r5, r6, baoVar, bdi.n(i | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.b;
        ?? r52 = this.g;
        ?? r4 = this.f;
        boolean z = this.a;
        ((kik) this.c).k((String) this.d, this.e, z, r4, r52, baoVar2, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ kig(kik kikVar, String str, yjk yjkVar, boolean z, yjv yjvVar, bkp bkpVar, int i, int i2) {
        this.h = i2;
        this.c = kikVar;
        this.d = str;
        this.e = yjkVar;
        this.a = z;
        this.f = yjvVar;
        this.g = bkpVar;
        this.b = i;
    }
}

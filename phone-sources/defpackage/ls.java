package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ls extends ykt implements yjz {
    final /* synthetic */ yjv a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(pf pfVar, bkp bkpVar, yjv yjvVar, bkd bkdVar, yjv yjvVar2, ykb ykbVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.e = pfVar;
        this.c = bkpVar;
        this.a = yjvVar;
        this.f = bkdVar;
        this.d = yjvVar2;
        this.g = ykbVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, ykb] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            bao baoVar = (bao) obj;
            ((Number) obj2).intValue();
            kv.j((pf) this.e, this.c, this.a, this.f, this.d, this.g, baoVar, bdi.n(this.b | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Number) obj2).intValue();
        Object obj3 = this.c;
        yjv yjvVar = this.a;
        ?? r2 = this.d;
        Object obj4 = this.e;
        mg mgVar = (mg) this.f;
        pf pfVar = (pf) obj3;
        kv.e(pfVar, yjvVar, r2, (mf) obj4, mgVar, this.g, baoVar2, bdi.n(this.b | 1));
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(pf pfVar, yjv yjvVar, bkp bkpVar, mf mfVar, mg mgVar, yka ykaVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.c = pfVar;
        this.a = yjvVar;
        this.d = bkpVar;
        this.e = mfVar;
        this.f = mgVar;
        this.g = ykaVar;
        this.b = i;
    }
}

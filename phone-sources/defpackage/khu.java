package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class khu implements yjz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ khu(mdw mdwVar, jyb jybVar, bcb bcbVar, by byVar, gi giVar, bcb bcbVar2, int i, int i2) {
        this.h = i2;
        this.e = mdwVar;
        this.f = jybVar;
        this.c = bcbVar;
        this.g = byVar;
        this.b = giVar;
        this.d = bcbVar2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        if (this.h != 0) {
            bao baoVar = (bao) obj;
            ((Integer) obj2).intValue();
            int i = this.a;
            ?? r6 = this.d;
            Object obj3 = this.b;
            Object obj4 = this.g;
            jxl.E((mdw) this.e, (jyb) this.f, this.c, (by) obj4, (gi) obj3, r6, baoVar, bdi.n(i | 1));
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        ((Integer) obj2).intValue();
        int i2 = this.a;
        ?? r5 = this.g;
        ?? r4 = this.f;
        ?? r3 = this.e;
        ?? r2 = this.d;
        kdw.g(this.b, this.c, r2, r3, r4, r5, baoVar2, bdi.n(i2 | 1));
        return ygi.a;
    }

    public /* synthetic */ khu(yjk yjkVar, yjk yjkVar2, yjz yjzVar, yjz yjzVar2, yjz yjzVar3, bkp bkpVar, int i, int i2) {
        this.h = i2;
        this.b = yjkVar;
        this.c = yjkVar2;
        this.d = yjzVar;
        this.e = yjzVar2;
        this.f = yjzVar3;
        this.g = bkpVar;
        this.a = i;
    }
}

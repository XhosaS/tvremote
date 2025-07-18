package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccp extends ykt implements yjz {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccp(bzz bzzVar, ccf ccfVar, yjz yjzVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.b = bzzVar;
        this.d = ccfVar;
        this.c = yjzVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bzz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, yjv] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            ((Number) obj2).intValue();
            ?? r6 = this.b;
            Object obj3 = this.d;
            ccf ccfVar = (ccf) obj3;
            ccq.b(r6, ccfVar, this.c, (bao) obj, bdi.n(1 | this.a));
            return ygi.a;
        }
        if (i != 1) {
            ((Number) obj2).intValue();
            cna.a(this.d, this.b, this.c, (bao) obj, bdi.n(1 | this.a));
            return ygi.a;
        }
        ((Number) obj2).intValue();
        Object obj4 = this.d;
        bww bwwVar = (bww) obj4;
        bwu.b(bwwVar, this.b, this.c, (bao) obj, bdi.n(1 | this.a));
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccp(Object obj, bkp bkpVar, Object obj2, int i, int i2) {
        super(2);
        this.e = i2;
        this.d = obj;
        this.b = bkpVar;
        this.c = obj2;
        this.a = i;
    }
}

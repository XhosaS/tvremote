package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cng extends ykt implements yjk {
    final /* synthetic */ yjk a;
    final /* synthetic */ cmi b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cng(cnu cnuVar, yjk yjkVar, cns cnsVar, cmi cmiVar, int i) {
        super(0);
        this.e = i;
        this.d = cnuVar;
        this.a = yjkVar;
        this.c = cnsVar;
        this.b = cmiVar;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        if (this.e != 0) {
            Object obj = this.d;
            cnu cnuVar = (cnu) obj;
            cnuVar.a(this.a, (cns) this.c, this.b);
            return ygi.a;
        }
        Object obj2 = this.c;
        cny cnyVar = (cny) obj2;
        cnyVar.n(this.a, (cob) this.d, this.b);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cng(cny cnyVar, yjk yjkVar, cob cobVar, cmi cmiVar, int i) {
        super(0);
        this.e = i;
        this.c = cnyVar;
        this.a = yjkVar;
        this.d = cobVar;
        this.b = cmiVar;
    }
}

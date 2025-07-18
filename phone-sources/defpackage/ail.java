package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ail extends yiz implements yjz {
    int a;
    final /* synthetic */ yuj b;
    final /* synthetic */ akb c;
    final /* synthetic */ cka d;
    final /* synthetic */ sp e;
    final /* synthetic */ yjv f;
    final /* synthetic */ yjk g;
    final /* synthetic */ cds h;
    final /* synthetic */ cbv i;
    final /* synthetic */ aip j;
    final /* synthetic */ lhr k;
    private /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ail(yuj yujVar, akb akbVar, lhr lhrVar, aip aipVar, cbv cbvVar, cka ckaVar, sp spVar, yjv yjvVar, yjk yjkVar, cds cdsVar, yih yihVar) {
        super(2, yihVar);
        this.b = yujVar;
        this.c = akbVar;
        this.k = lhrVar;
        this.j = aipVar;
        this.i = cbvVar;
        this.d = ckaVar;
        this.e = spVar;
        this.f = yjvVar;
        this.g = yjkVar;
        this.h = cdsVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ail) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ail ailVar = new ail(this.b, this.c, this.k, this.j, this.i, this.d, this.e, this.f, this.g, this.h, yihVar);
        ailVar.l = obj;
        return ailVar;
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            yow yowVar = (yow) this.l;
            akb akbVar = this.c;
            aip aipVar = this.j;
            ykr.q(yowVar, null, 4, new qd(akbVar, aipVar, (yih) null, 11), 1);
            yuj yujVar = this.b;
            if (yujVar != null) {
                ykr.q(yowVar, null, 0, new qd(yujVar, aipVar, (yih) null, 12), 3);
            }
            lhr lhrVar = this.k;
            aiu aiuVar = new aiu(akbVar, lhrVar, aipVar, yowVar);
            cbv cbvVar = this.i;
            aij aijVar = new aij(akbVar, this.d, this.e, aipVar, this.f, aiuVar, lhrVar, this.g, this.h);
            this.a = 1;
            if (cbvVar.a(aijVar, this) == yioVar) {
                return yioVar;
            }
        }
        throw new yfs();
    }
}

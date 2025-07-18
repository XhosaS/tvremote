package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class la extends ykt implements yka {
    final /* synthetic */ bje a;
    final /* synthetic */ Object b;
    final /* synthetic */ lj c;
    final /* synthetic */ ykb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(bje bjeVar, Object obj, lj ljVar, ykb ykbVar) {
        super(3);
        this.a = bjeVar;
        this.b = obj;
        this.c = ljVar;
        this.d = ykbVar;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        lt ltVar = (lt) obj;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? baoVar.F(ltVar) : baoVar.H(ltVar)) ? 2 : 4;
        }
        if (baoVar.L((iIntValue & 19) != 18, iIntValue & 1)) {
            bje bjeVar = this.a;
            boolean zF = baoVar.F(bjeVar);
            Object obj4 = this.b;
            boolean zH = zF | baoVar.H(obj4);
            lj ljVar = this.c;
            boolean zH2 = zH | baoVar.H(ljVar);
            Object objG = baoVar.g();
            if (zH2 || objG == ban.a) {
                objG = new ma(bjeVar, obj4, ljVar, 1);
                baoVar.A(objG);
            }
            bbn.c(ltVar, (yjv) objG, baoVar);
            ki kiVar = ljVar.d;
            ltVar.getClass();
            kiVar.j(obj4, ((lu) ltVar).a);
            Object objG2 = baoVar.g();
            if (objG2 == ban.a) {
                objG2 = new le();
                baoVar.A(objG2);
            }
            this.d.a((le) objG2, obj4, baoVar, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbr extends ykt implements yjz {
    final /* synthetic */ cbc a;
    final /* synthetic */ yjz b;
    final /* synthetic */ ccf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbr(cbc cbcVar, ccf ccfVar, yjz yjzVar) {
        super(2);
        this.a = cbcVar;
        this.c = ccfVar;
        this.b = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bao baoVar = (bao) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (baoVar.L(i != 2, iIntValue & 1)) {
            ccq.b(this.a, this.c, this.b, baoVar, 0);
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

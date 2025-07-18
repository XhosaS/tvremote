package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aac implements ykb {
    final /* synthetic */ yka a;

    public aac(yka ykaVar) {
        this.a = ykaVar;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        bhi bhiVar = (bhi) obj;
        ((Number) obj2).intValue();
        bao baoVar = (bao) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != baoVar.F(bhiVar) ? 2 : 4;
        }
        if (baoVar.L((iIntValue & 131) != 130, iIntValue & 1)) {
            this.a.a(bhiVar, baoVar, Integer.valueOf(iIntValue & 14));
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

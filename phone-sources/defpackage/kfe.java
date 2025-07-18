package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfe implements ykb {
    final /* synthetic */ List a;
    final /* synthetic */ yjv b;
    final /* synthetic */ boolean c;

    public kfe(List list, yjv yjvVar, boolean z) {
        this.a = list;
        this.b = yjvVar;
        this.c = z;
    }

    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bhi bhiVar = (bhi) obj;
        int iIntValue = ((Number) obj2).intValue();
        bao baoVar = (bao) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != baoVar.F(bhiVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != baoVar.D(iIntValue) ? 16 : 32;
        }
        if (baoVar.L((i & 147) != 146, i & 1)) {
            kdh kdhVar = (kdh) this.a.get(iIntValue);
            baoVar.x(905941176);
            baoVar.x(-1633490746);
            yjv yjvVar = this.b;
            boolean zF = baoVar.F(yjvVar) | baoVar.F(kdhVar);
            Object objG = baoVar.g();
            if (zF || objG == ban.a) {
                objG = new kfd(yjvVar, kdhVar, 0);
                baoVar.A(objG);
            }
            baoVar.p();
            kff.k(kdhVar, (yjk) objG, this.c, baoVar, 0);
            baoVar.p();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

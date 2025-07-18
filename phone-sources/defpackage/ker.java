package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ker implements ykb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ker(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yka] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, ykb] */
    @Override // defpackage.ykb
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.c;
        if (i3 == 0) {
            abe abeVar = (abe) obj;
            int iIntValue = ((Number) obj2).intValue();
            bao baoVar = (bao) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i = iIntValue2 | (true != baoVar.F(abeVar) ? 2 : 4);
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= true == baoVar.D(iIntValue) ? 32 : 16;
            }
            if (baoVar.L((i & 147) != 146, i & 1)) {
                kel kelVar = (kel) this.a.get(iIntValue);
                baoVar.x(-2147351497);
                this.b.a(kelVar, baoVar, 0);
                baoVar.p();
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        if (i3 == 1) {
            int iIntValue3 = ((Number) obj2).intValue();
            bao baoVar2 = (bao) obj3;
            int iIntValue4 = ((Number) obj4).intValue();
            ((bhi) obj).getClass();
            if ((iIntValue4 & 48) == 0) {
                iIntValue4 |= true == baoVar2.D(iIntValue3) ? 32 : 16;
            }
            if ((iIntValue4 & 145) == 144 && baoVar2.K()) {
                baoVar2.t();
            } else {
                wkx wkxVar = (wkx) ((gag) this.a).i(iIntValue3);
                if (wkxVar != null) {
                    jbr.ag(((jzv) this.b).a, wkxVar, bkp.g, null, baoVar2, 4528, 0);
                }
            }
            return ygi.a;
        }
        if (i3 == 2) {
            bhi bhiVar = (bhi) obj;
            int iIntValue5 = ((Number) obj2).intValue();
            bao baoVar3 = (bao) obj3;
            int iIntValue6 = ((Number) obj4).intValue();
            if ((iIntValue6 & 6) == 0) {
                i2 = iIntValue6 | (true != baoVar3.F(bhiVar) ? 2 : 4);
            } else {
                i2 = iIntValue6;
            }
            if ((iIntValue6 & 48) == 0) {
                i2 |= true == baoVar3.D(iIntValue5) ? 32 : 16;
            }
            if (baoVar3.L((i2 & 147) != 146, i2 & 1)) {
                kem kemVar = (kem) this.a.get(iIntValue5);
                baoVar3.x(985778659);
                this.b.a(Integer.valueOf(iIntValue5), kemVar, baoVar3, Integer.valueOf(((i2 & R.styleable.AppCompatTheme_windowNoTitle) >> 3) & 14));
                baoVar3.p();
            } else {
                baoVar3.t();
            }
            return ygi.a;
        }
        int iIntValue7 = ((Number) obj).intValue();
        kem kemVar2 = (kem) obj2;
        bao baoVar4 = (bao) obj3;
        int iIntValue8 = ((Number) obj4).intValue();
        kemVar2.getClass();
        kez kezVar = kez.a;
        baoVar4.x(5004770);
        Object obj5 = this.b;
        boolean zF = baoVar4.F(obj5);
        Object objG = baoVar4.g();
        if (zF || objG == ban.a) {
            objG = new kah(obj5, 7);
            baoVar4.A(objG);
        }
        yjv yjvVar = (yjv) objG;
        baoVar4.p();
        baoVar4.x(5004770);
        Object obj6 = this.a;
        boolean zF2 = baoVar4.F(obj6);
        Object objG2 = baoVar4.g();
        if (zF2 || objG2 == ban.a) {
            objG2 = new kah(obj6, 8);
            baoVar4.A(objG2);
        }
        baoVar4.p();
        kezVar.b(iIntValue7, kemVar2, yjvVar, (yjv) objG2, null, baoVar4, iIntValue8 & R.styleable.AppCompatTheme_windowNoTitle);
        return ygi.a;
    }

    public ker(yjv yjvVar, yjv yjvVar2, int i) {
        this.c = i;
        this.b = yjvVar;
        this.a = yjvVar2;
    }
}

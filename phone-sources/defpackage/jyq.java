package defpackage;

import androidx.compose.foundation.selection.SelectableElement;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyq implements ykb {
    final /* synthetic */ List a;
    final /* synthetic */ bje b;
    final /* synthetic */ isy c;
    final /* synthetic */ mdw d;

    public jyq(List list, bje bjeVar, mdw mdwVar, isy isyVar) {
        this.a = list;
        this.b = bjeVar;
        this.d = mdwVar;
        this.c = isyVar;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ykb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Object obj5 = (bhi) obj;
        int iIntValue = ((Number) obj2).intValue();
        bao baoVar = (bao) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        boolean z2 = true;
        if ((iIntValue2 & 6) == 0) {
            i = (true != baoVar.F(obj5) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != baoVar.D(iIntValue) ? 16 : 32;
        }
        boolean z3 = false;
        if (baoVar.L((i & 147) != 146, i & 1)) {
            wnu wnuVar = (wnu) this.a.get(iIntValue);
            baoVar.x(69338269);
            bkp bkpVarA = zi.a(wv.p(bkp.g, ccf.x(R.dimen.rating_item_padding, baoVar)), 1.0f);
            bje bjeVar = this.b;
            boolean zBooleanValue = ((Boolean) bjeVar.get(iIntValue)).booleanValue();
            baoVar.x(-1224400529);
            mdw mdwVar = this.d;
            boolean zH = baoVar.H(mdwVar);
            isy isyVar = this.c;
            boolean zH2 = zH | baoVar.H(isyVar) | baoVar.F(wnuVar);
            int i2 = (i & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48;
            boolean z4 = zH2 | ((i2 > 32 && baoVar.D(iIntValue)) || (i & 48) == 32);
            Object objG = baoVar.g();
            if (z4 || objG == ban.a) {
                Object jypVar = new jyp(bjeVar, mdwVar, isyVar, wnuVar, iIntValue, 1);
                baoVar.A(jypVar);
                objG = jypVar;
            }
            baoVar.p();
            bkp bkpVarA2 = bkpVarA.a(new SelectableElement(zBooleanValue, null, null, true, true, null, (yjk) objG));
            wnuVar.getClass();
            boolean z5 = iIntValue == 0;
            if (iIntValue == isyVar.d.size() - 1) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            boolean zBooleanValue2 = ((Boolean) bjeVar.get(iIntValue)).booleanValue();
            baoVar.x(-1224400529);
            boolean zH3 = baoVar.H(mdwVar) | baoVar.H(isyVar) | baoVar.F(wnuVar);
            if ((i2 <= 32 || !baoVar.D(iIntValue)) && (i & 48) != 32) {
                z2 = z;
            }
            boolean z6 = zH3 | z2;
            Object objG2 = baoVar.g();
            if (z6 || objG2 == ban.a) {
                objG2 = new jyp(bjeVar, mdwVar, isyVar, wnuVar, iIntValue, 0);
                baoVar.A(objG2);
            }
            baoVar.p();
            jys.a(bkpVarA2, wnuVar, z5, z3, zBooleanValue2, (yjk) objG2, baoVar, 0);
            baoVar.p();
        } else {
            baoVar.t();
        }
        return ygi.a;
    }
}

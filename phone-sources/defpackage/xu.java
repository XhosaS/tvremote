package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xu {
    private static final bvt a = new xw(xk.c, bkb.j);

    public static final bvt a(xj xjVar, bkc bkcVar, bao baoVar, int i) {
        if (yks.e(xjVar, xk.c) && yks.e(bkcVar, bkb.j)) {
            baoVar.x(-1446569784);
            baoVar.p();
            return a;
        }
        baoVar.x(-1446515937);
        boolean z = ((((i & 14) ^ 6) > 4 && baoVar.F(xjVar)) || (i & 6) == 4) | ((((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVar.F(bkcVar)) || (i & 48) == 32);
        Object objG = baoVar.g();
        if (z || objG == ban.a) {
            objG = new xw(xjVar, bkcVar);
            baoVar.A(objG);
        }
        xw xwVar = (xw) objG;
        baoVar.p();
        return xwVar;
    }
}

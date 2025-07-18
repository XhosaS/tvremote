package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zf {
    private static final bvt a = new zg(xk.a, bkb.m);

    public static final bvt a(xe xeVar, bkh bkhVar, bao baoVar, int i) {
        if (yks.e(xeVar, xk.a) && yks.e(bkhVar, bkb.m)) {
            baoVar.x(-1073795767);
            baoVar.p();
            return a;
        }
        baoVar.x(-1073744896);
        boolean z = ((((i & 14) ^ 6) > 4 && baoVar.F(xeVar)) || (i & 6) == 4) | ((((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && baoVar.F(bkhVar)) || (i & 48) == 32);
        Object objG = baoVar.g();
        if (z || objG == ban.a) {
            objG = new zg(xeVar, bkhVar);
            baoVar.A(objG);
        }
        zg zgVar = (zg) objG;
        baoVar.p();
        return zgVar;
    }
}

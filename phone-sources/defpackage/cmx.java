package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmx {
    public static final cmw a = new cmw();

    public static final float a(int i) {
        return -i;
    }

    public static final float b(float f) {
        return -f;
    }

    public static final int c(int i) {
        return i == 0 ? 1 : 2;
    }

    public static final void d(View view, bys bysVar) {
        long jQ = bty.q(bysVar.n());
        int iRound = Math.round(Float.intBitsToFloat((int) (jQ >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jQ & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }
}

package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ogm {
    public static int a(float f, DisplayMetrics displayMetrics) {
        return duc.a(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static int b(DisplayMetrics displayMetrics, nhn nhnVar) {
        if (nhnVar == null || !d(nhnVar) || nhnVar.j() == 3 || nhnVar.g() <= 0.0f) {
            return -1;
        }
        return a(nhnVar.g(), displayMetrics);
    }

    public static void c(nhm nhmVar, ogl oglVar) {
        e(nhmVar.p(), 9, nhmVar.g(), oglVar);
        e(nhmVar.s(), 7, nhmVar.j(), oglVar);
        e(nhmVar.x(), 8, nhmVar.o(), oglVar);
        e(nhmVar.v(), 5, nhmVar.m(), oglVar);
        e(nhmVar.r(), 6, nhmVar.i(), oglVar);
        e(nhmVar.w(), 2, nhmVar.n(), oglVar);
        e(nhmVar.u(), 3, nhmVar.l(), oglVar);
        e(nhmVar.q(), 4, nhmVar.h(), oglVar);
        e(nhmVar.t(), 1, nhmVar.k(), oglVar);
    }

    public static boolean d(nhn nhnVar) {
        return nhnVar.i() || nhnVar.h();
    }

    private static void e(boolean z, int i, nhn nhnVar, ogl oglVar) {
        if (z && d(nhnVar)) {
            oglVar.a(i, nhnVar);
        }
    }
}

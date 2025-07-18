package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zi {
    private static final FillElement a = new FillElement(2, 1.0f);
    private static final FillElement b = new FillElement(1, 1.0f);
    private static final FillElement c = new FillElement(3, 1.0f);
    private static final WrapContentElement d = zy.e(bkb.k);
    private static final WrapContentElement e = zy.e(bkb.j);
    private static final WrapContentElement f = zy.c(bkb.n);
    private static final WrapContentElement g = zy.c(bkb.m);
    private static final WrapContentElement h = zy.d(bkb.e);
    private static final WrapContentElement i = zy.d(bkb.a);

    public static final bkp a(bkp bkpVar, float f2) {
        return bkpVar.a(f2 == 1.0f ? a : new FillElement(2, f2));
    }

    public static final bkp b(bkp bkpVar, float f2) {
        return bkpVar.a(new SizeElement(0.0f, f2, 0.0f, f2, 5));
    }

    public static final bkp c(bkp bkpVar, float f2, float f3) {
        return bkpVar.a(new SizeElement(0.0f, f2, 0.0f, f3, 5));
    }

    public static final bkp d(bkp bkpVar, float f2) {
        return bkpVar.a(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final bkp e(bkp bkpVar, long j) {
        return f(bkpVar, cmc.b(j), cmc.a(j));
    }

    public static final bkp f(bkp bkpVar, float f2, float f3) {
        return bkpVar.a(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final bkp g(bkp bkpVar, float f2, float f3, float f4, float f5) {
        return bkpVar.a(new SizeElement(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ bkp k(bkp bkpVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return c(bkpVar, f2, f3);
    }

    public static /* synthetic */ bkp l(bkp bkpVar, float f2, float f3, float f4, float f5, int i2) {
        float f6 = (i2 & 8) != 0 ? Float.NaN : f5;
        float f7 = (i2 & 4) != 0 ? Float.NaN : f4;
        return bkpVar.a(new SizeElement(1 != (i2 & 1) ? f2 : Float.NaN, (i2 & 2) != 0 ? Float.NaN : f3, f7, f6, false));
    }

    public static /* synthetic */ bkp m(bkp bkpVar, float f2, float f3, float f4, int i2) {
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return g(bkpVar, f2, f3, f4, Float.NaN);
    }

    public static /* synthetic */ bkp o(bkp bkpVar) {
        bkh bkhVar = bkb.n;
        return bkpVar.a(yks.e(bkhVar, bkhVar) ? f : yks.e(bkhVar, bkb.m) ? g : zy.c(bkhVar));
    }

    public static /* synthetic */ bkp q(bkp bkpVar) {
        bkc bkcVar = bkb.k;
        return bkpVar.a(yks.e(bkcVar, bkcVar) ? d : yks.e(bkcVar, bkb.j) ? e : zy.e(bkcVar));
    }

    public static /* synthetic */ bkp r() {
        return new UnspecifiedConstraintsElement(24.0f, Float.NaN);
    }
}

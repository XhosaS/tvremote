package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zh {
    public static final zh a = new zh();

    private zh() {
    }

    public static final bkp a(bkp bkpVar, float f, boolean z) {
        if (f <= 0.0d) {
            zy.a("invalid weight; must be greater than zero");
        }
        return bkpVar.a(new LayoutWeightElement(ykn.h(f, Float.MAX_VALUE), z));
    }
}

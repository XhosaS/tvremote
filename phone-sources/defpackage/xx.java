package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xx {
    public static final xx a = new xx();

    private xx() {
    }

    public static final bkp a(bkp bkpVar, bkc bkcVar) {
        return bkpVar.a(new HorizontalAlignElement(bkcVar));
    }

    public static final bkp b(bkp bkpVar, float f, boolean z) {
        if (f <= 0.0d) {
            zy.a("invalid weight; must be greater than zero");
        }
        return bkpVar.a(new LayoutWeightElement(ykn.h(f, Float.MAX_VALUE), z));
    }
}

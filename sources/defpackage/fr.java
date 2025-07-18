package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fr extends PopupWindow {
    public fr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        aps apsVarR = aps.r(context, attributeSet, cu.s, i, 0);
        if (apsVarR.o(2)) {
            setOverlapAnchor(apsVarR.n(2, false));
        }
        setBackgroundDrawable(apsVarR.i(0));
        apsVarR.m();
    }
}

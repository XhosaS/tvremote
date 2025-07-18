package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
class lw extends PopupWindow {
    public lw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        rv rvVarF = rv.f(context, attributeSet, hs.s, i, 0);
        if (rvVarF.b.hasValue(2)) {
            setOverlapAnchor(rvVarF.b.getBoolean(2, false));
        }
        setBackgroundDrawable(rvVarF.b(0));
        rvVarF.b.recycle();
    }
}

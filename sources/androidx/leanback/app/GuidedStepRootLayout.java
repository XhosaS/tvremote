package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.qp;

/* compiled from: PG */
/* loaded from: classes.dex */
class GuidedStepRootLayout extends LinearLayout {
    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewFocusSearch = super.focusSearch(view, i);
        if ((i != 17 && i != 66) || qp.i(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        getLayoutDirection();
        return view;
    }

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

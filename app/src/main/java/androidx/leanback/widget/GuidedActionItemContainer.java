package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.aza;
import defpackage.bbc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GuidedActionItemContainer extends aza {
    public boolean a;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (this.a || !bbc.a(this, view)) {
            return super.focusSearch(view, i);
        }
        View viewFocusSearch = super.focusSearch(view, i);
        if (bbc.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }
}

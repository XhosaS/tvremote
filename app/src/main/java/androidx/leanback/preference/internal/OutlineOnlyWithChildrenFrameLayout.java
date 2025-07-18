package androidx.leanback.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.aum;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {
    public ViewOutlineProvider a;
    private ViewOutlineProvider b;

    public OutlineOnlyWithChildrenFrameLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateOutline();
    }

    @Override // android.view.View
    public final void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.a = viewOutlineProvider;
        if (this.b == null) {
            this.b = new aum(this);
        }
        super.setOutlineProvider(this.b);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

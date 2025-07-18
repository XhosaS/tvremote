package com.google.android.apps.tvsearch.results.searchlist;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.awc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SearchItemDetailCardView extends awc {
    private static final int[] g = {R.attr.state_pressed};
    public final ArrayList f;

    public SearchItemDetailCardView(Context context) {
        this(context, null);
    }

    final void f(boolean z) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(true != z ? 4 : 0);
        }
    }

    @Override // defpackage.awc, android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i);
        int length = iArrOnCreateDrawableState.length;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            z |= !(i3 != 16842919);
            z2 |= !(i3 != 16842910);
        }
        return (z && z2) ? View.PRESSED_ENABLED_STATE_SET : z ? g : z2 ? View.ENABLED_STATE_SET : View.EMPTY_STATE_SET;
    }

    @Override // defpackage.awc, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        f(isActivated());
    }

    @Override // defpackage.awc, android.view.View
    public final void setActivated(boolean z) {
        super.setActivated(z);
        f(z);
    }

    public SearchItemDetailCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchItemDetailCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        setBackgroundResource(com.google.android.katniss.R.color.card_bg_background_color_transparent);
        setForeground(context.getDrawable(com.google.android.katniss.R.drawable.lb_card_foreground));
        setCardType(2);
        setInfoVisibility(1);
        setFocusable(true);
        setClipToPadding(false);
        setClipChildren(false);
    }
}

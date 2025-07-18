package com.google.android.apps.play.movies.mobile.view.widget;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MovieBundleItemCardView extends RelativeLayout {
    public MovieBundleItemCardView(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        boolean zPerformAccessibilityAction = super.performAccessibilityAction(i, bundle);
        if (!zPerformAccessibilityAction || i != 64) {
            return zPerformAccessibilityAction;
        }
        ViewParent parent = getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) parent;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int decoratedLeft = layoutManager.getDecoratedLeft(this) - ((recyclerView.getWidth() - layoutManager.getDecoratedMeasuredWidth(this)) / 2);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, true);
            recyclerView.scrollBy(decoratedLeft, 0);
            recyclerView.setTag(R.id.suppress_item_accessibility_event_tag, null);
        }
        return true;
    }

    public MovieBundleItemCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MovieBundleItemCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

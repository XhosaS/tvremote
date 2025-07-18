package com.google.android.apps.play.movies.mobile.view.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AllScrollsRecyclerView extends RecyclerView {
    private RecyclerView.OnScrollListener a;

    public AllScrollsRecyclerView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3;
        int iIndexOfChild = indexOfChild(null);
        return (iIndexOfChild < 0 || (i3 = iIndexOfChild + 1) == i) ? i2 : i2 == iIndexOfChild ? i2 + 1 : i2 == i3 ? i2 - 1 : i2;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a != null) {
            onScrollChanged(0, 0, 0, 0);
            this.a.onScrolled(this, 0, 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.a = onScrollListener;
    }

    public AllScrollsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AllScrollsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

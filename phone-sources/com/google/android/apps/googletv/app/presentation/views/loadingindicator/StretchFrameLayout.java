package com.google.android.apps.googletv.app.presentation.views.loadingindicator;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StretchFrameLayout extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Integer numValueOf = null;
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            numValueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).getOrientation());
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            numValueOf = Integer.valueOf(((StaggeredGridLayoutManager) layoutManager).getOrientation());
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            getLayoutParams().width = -2;
            getLayoutParams().height = -1;
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            getLayoutParams().width = -1;
            getLayoutParams().height = -2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ StretchFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

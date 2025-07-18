package com.google.android.apps.googletv.app.presentation.views.verticalgridrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import defpackage.klg;
import defpackage.mui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VerticalGridRecyclerView extends ModelAwareRecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalGridRecyclerView(Context context) {
        this(context, null);
        context.getClass();
    }

    public final void b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("spanCount must be a valid positive value for VerticalGridRecyclerView");
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        layoutManager.getClass();
        ((GridLayoutManager) layoutManager).setSpanCount(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setLayoutManager(new GridLayoutManager(context, 1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mui.c, 0, 0);
        try {
            b(typedArrayObtainStyledAttributes.getInt(4, 1));
            typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            typedArrayObtainStyledAttributes.recycle();
            addItemDecoration(new klg(this));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

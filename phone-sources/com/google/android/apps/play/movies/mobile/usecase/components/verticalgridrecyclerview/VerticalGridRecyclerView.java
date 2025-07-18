package com.google.android.apps.play.movies.mobile.usecase.components.verticalgridrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import defpackage.mui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VerticalGridRecyclerView extends ModelAwareRecyclerView {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalGridRecyclerView(Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setLayoutManager(new VerticalGridFlowLayoutManager(this));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mui.c, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(4, 1);
            if (i > 0) {
                this.a = i;
                this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
                this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                return;
            }
            throw new IllegalArgumentException("spanCount must be a valid positive value for VerticalGridRecyclerView");
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

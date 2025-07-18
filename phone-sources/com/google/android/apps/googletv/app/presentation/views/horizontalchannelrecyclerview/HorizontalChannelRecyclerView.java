package com.google.android.apps.googletv.app.presentation.views.horizontalchannelrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView;
import com.google.android.videos.R;
import defpackage.kjm;
import defpackage.kjn;
import defpackage.kjo;
import defpackage.sdc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HorizontalChannelRecyclerView extends ModelAwareRecyclerView {
    public float a;
    public int b;
    public int c;
    private int d;
    private int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalChannelRecyclerView(Context context) {
        this(context, null);
        context.getClass();
    }

    @Override // com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView
    public final sdc a() {
        return new kjm();
    }

    public final void b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("cardCountPerRow must be a valid positive value for HorizontalChannelRecyclerView");
        }
        this.a = f;
    }

    public final void c(int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        layoutManager.getClass();
        ((GridLayoutManager) layoutManager).setSpanCount(i);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RecyclerView.Adapter adapter;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.d;
        int i6 = i2 - i4;
        int i7 = i3 - i;
        if (i5 == i7 && this.e == i6) {
            return;
        }
        if ((i5 > 0 || this.e > 0) && (adapter = getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        this.d = i7;
        this.e = i6;
    }

    @Override // com.google.android.libraries.play.movies.symbian.recyclerview.ModelAwareRecyclerView, android.support.v7.widget.RecyclerView
    public final void setAdapter(RecyclerView.Adapter<?> adapter) {
        if (adapter != null && !(adapter instanceof kjm)) {
            throw new IllegalArgumentException("HorizontalChannelRecyclerView accepts only HorizontalChannelAdapter");
        }
        super.setAdapter(adapter);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("HorizontalChannelRecyclerView accepts only LinearLayoutManager Or GridLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.getOrientation() != 0) {
            throw new IllegalArgumentException("HorizontalChannelRecyclerView accepts only horizontal orientation");
        }
        linearLayoutManager.setInitialPrefetchItemCount(0);
        super.setLayoutManager(layoutManager);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalChannelRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = -1.0f;
        kjn kjnVar = new kjn(context);
        kjnVar.setItemPrefetchEnabled(true);
        kjnVar.setInitialPrefetchItemCount(5);
        kjnVar.setAutoMeasureEnabled(true);
        setLayoutManager(kjnVar);
        setAdapter(new kjm());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, kjo.a, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(3, 1);
            if (i > 0) {
                c(i);
            }
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            if (f > 0.0f) {
                b(f);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.channel_start_spacing);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.channel_end_spacing);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

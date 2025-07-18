package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.thq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayRatingBadgeContainer extends FrameLayout {
    private View a;
    private View b;

    public PlayRatingBadgeContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final int getBaseline() {
        return this.b.getVisibility() != 8 ? this.b.getBaseline() : this.a.getVisibility() != 8 ? this.a.getBaseline() : getMeasuredHeight();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.li_rating);
        this.b = findViewById(R.id.li_badge);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int visibility = this.a.getVisibility();
        boolean z2 = layoutDirection == 0;
        if (visibility != 8) {
            int measuredWidth = this.a.getMeasuredWidth();
            int iC = thq.c(width, measuredWidth, z2, 0);
            View view = this.a;
            view.layout(iC, 0, measuredWidth + iC, view.getMeasuredHeight());
        }
        if (this.b.getVisibility() != 8) {
            int measuredWidth2 = this.b.getMeasuredWidth();
            int iC2 = thq.c(width, measuredWidth2, z2, 0);
            View view2 = this.b;
            view2.layout(iC2, 0, measuredWidth2 + iC2, view2.getMeasuredHeight());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMax;
        int iMax2;
        int size = View.MeasureSpec.getSize(i);
        if (this.a.getVisibility() != 8) {
            this.a.measure(0, 0);
            if (this.a.getMeasuredWidth() > size) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                this.a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            iMax = this.a.getMeasuredWidth();
            iMax2 = this.a.getMeasuredHeight();
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), 0);
            iMax = Math.max(iMax, this.b.getMeasuredWidth());
            iMax2 = Math.max(iMax2, this.b.getMeasuredHeight());
        }
        setMeasuredDimension(iMax, iMax2);
    }

    public PlayRatingBadgeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

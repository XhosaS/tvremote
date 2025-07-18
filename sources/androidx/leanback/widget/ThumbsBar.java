package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int a() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iA = a();
        View childAt = getChildAt(iA);
        int width = getWidth() / 2;
        int measuredWidth = childAt.getMeasuredWidth() / 2;
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        int measuredWidth2 = width - measuredWidth;
        childAt.layout(measuredWidth2, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i5 = iA - 1; i5 >= 0; i5--) {
            int i6 = measuredWidth2 - this.f;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            measuredWidth2 = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            iA++;
            if (iA >= this.a) {
                return;
            }
            int i7 = width2 + this.f;
            View childAt3 = getChildAt(iA);
            childAt3.layout(i7, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + paddingTop);
            width2 = i7 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() - this.d;
        int i3 = ((measuredWidth + r5) - 1) / (this.b + this.f);
        if (i3 < 2) {
            i3 = 2;
        } else if ((i3 & 1) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        if (this.a != i4) {
            this.a = i4;
            while (getChildCount() > this.a) {
                removeView(getChildAt(getChildCount() - 1));
            }
            while (getChildCount() < this.a) {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(this.b, this.c));
            }
            int iA = a();
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (iA == i5) {
                    layoutParams.width = this.d;
                    layoutParams.height = this.e;
                } else {
                    layoutParams.width = this.b;
                    layoutParams.height = this.c;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        new SparseArray();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }
}

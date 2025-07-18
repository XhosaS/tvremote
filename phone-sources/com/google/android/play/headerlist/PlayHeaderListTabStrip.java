package com.google.android.play.headerlist;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tfy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderListTabStrip extends FrameLayout {
    public HorizontalScrollView a;
    public PlayHeaderListTabContainer b;
    public boolean c;
    public int d;

    public PlayHeaderListTabStrip(Context context) {
        this(context, null, 0);
    }

    private final void a() throws Resources.NotFoundException {
        PlayHeaderListTabContainer playHeaderListTabContainer = this.b;
        playHeaderListTabContainer.a.setColor(getResources().getColor(R.color.play_header_list_tab_underline_color));
        playHeaderListTabContainer.invalidate();
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.a = (HorizontalScrollView) findViewById(R.id.play_header_list_tab_scroll);
        this.b = (PlayHeaderListTabContainer) findViewById(R.id.play_header_list_tab_container);
        a();
        a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int scrollX = this.a.getScrollX();
        int i5 = this.d;
        if (scrollX != i5) {
            this.a.scrollTo(i5, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredWidth2;
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            PlayHeaderListTabContainer playHeaderListTabContainer = this.b;
            if (playHeaderListTabContainer.d != size || !playHeaderListTabContainer.e) {
                playHeaderListTabContainer.d = size;
                int i3 = size >> 1;
                View childAt = playHeaderListTabContainer.getChildAt(0);
                if (childAt != null) {
                    childAt.measure(-2, -2);
                    measuredWidth = i3 - (childAt.getMeasuredWidth() / 2);
                } else {
                    measuredWidth = 0;
                }
                View childAt2 = playHeaderListTabContainer.getChildAt(playHeaderListTabContainer.getChildCount() - 1);
                if (childAt2 != null) {
                    childAt2.measure(-2, -2);
                    measuredWidth2 = i3 - (childAt2.getMeasuredWidth() / 2);
                } else {
                    measuredWidth2 = 0;
                }
                int[] iArr = cww.a;
                int layoutDirection = playHeaderListTabContainer.getLayoutDirection();
                int i4 = layoutDirection == 0 ? measuredWidth2 : measuredWidth;
                if (layoutDirection != 0) {
                    measuredWidth = measuredWidth2;
                }
                playHeaderListTabContainer.setPaddingRelative(measuredWidth, 0, i4, 0);
                playHeaderListTabContainer.e = true;
            }
        }
        super.onMeasure(i, i2);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        new tfy(this);
        this.c = true;
        float f = getResources().getDisplayMetrics().density;
        getResources().getColorStateList(R.color.play_header_list_tab_text_color);
    }
}

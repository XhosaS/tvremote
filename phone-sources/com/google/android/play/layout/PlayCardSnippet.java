package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tgr;
import defpackage.thq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardSnippet extends tgr {
    private TextView a;
    private ImageView b;
    private final int c;
    private int d;
    private final int e;

    public PlayCardSnippet(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.li_snippet_text);
        this.b = (ImageView) findViewById(R.id.li_snippet_avatar);
        this.d = this.c;
        this.a.setTextSize(0, this.e);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        int measuredHeight = this.a.getMeasuredHeight();
        int measuredWidth = this.a.getMeasuredWidth();
        int visibility = this.b.getVisibility();
        boolean z2 = layoutDirection == 0;
        if (visibility == 8) {
            int i5 = paddingTop + ((height - measuredHeight) / 2);
            int iC = thq.c(width, measuredWidth, z2, 0);
            this.a.layout(iC, i5, measuredWidth + iC, measuredHeight + i5);
            return;
        }
        int measuredHeight2 = this.b.getMeasuredHeight();
        int measuredWidth2 = this.b.getMeasuredWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        int iC2 = thq.c(width, measuredWidth2, z2, 0);
        int i6 = iC2 + measuredWidth2;
        int marginEnd = measuredWidth2 + marginLayoutParams.getMarginEnd();
        if (measuredHeight2 <= measuredHeight) {
            int i7 = paddingTop + ((height - measuredHeight) / 2);
            this.b.layout(iC2, i7, i6, measuredHeight2 + i7);
            int iC3 = thq.c(width, measuredWidth, z2, marginEnd);
            this.a.layout(iC3, i7, measuredWidth + iC3, measuredHeight + i7);
            return;
        }
        int i8 = ((height - measuredHeight2) / 2) + paddingTop;
        this.b.layout(iC2, i8, i6, measuredHeight2 + i8);
        int i9 = paddingTop + ((height - measuredHeight) / 2);
        int iC4 = thq.c(width, measuredWidth, z2, marginEnd);
        this.a.layout(iC4, i9, measuredWidth + iC4, measuredHeight + i9);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.b.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
            this.b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            paddingLeft -= this.d + marginLayoutParams.rightMargin;
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), 0);
        setMeasuredDimension(size, getPaddingTop() + Math.max(this.d, this.a.getMeasuredHeight()) + getPaddingBottom());
    }

    public PlayCardSnippet(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.c = resources.getDimensionPixelSize(R.dimen.play_card_snippet_avatar_size);
        resources.getDimensionPixelSize(R.dimen.play_card_snippet_avatar_large_size);
        this.e = resources.getDimensionPixelSize(R.dimen.play_snippet_regular_size);
        resources.getDimensionPixelSize(R.dimen.play_snippet_large_size);
    }
}

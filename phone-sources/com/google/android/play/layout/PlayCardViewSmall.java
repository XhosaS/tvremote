package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tgo;
import defpackage.thq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardViewSmall extends tgo {
    protected View o;
    protected View p;
    private int q;
    private int r;
    private final int s;
    private int t;

    public PlayCardViewSmall(Context context) {
        this(context, null);
    }

    private final boolean c(int i) {
        return (i & this.q) != 0;
    }

    @Override // defpackage.tgo, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.o = findViewById(R.id.rating_badge_container);
        this.p = findViewById(R.id.li_ad_label_container);
    }

    @Override // defpackage.tgo, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int bottom;
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ImageView imageView = this.f;
        ViewGroup.MarginLayoutParams marginLayoutParams6 = imageView != null ? (ViewGroup.MarginLayoutParams) imageView.getLayoutParams() : null;
        boolean z2 = layoutDirection == 0;
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        int measuredWidth = this.a.getMeasuredWidth();
        int marginStart = marginLayoutParams.getMarginStart();
        int measuredHeight = this.a.getMeasuredHeight();
        int i6 = paddingTop + measuredHeight;
        int iC = thq.c(width, measuredWidth, z2, paddingStart + marginStart);
        this.a.layout(iC, paddingTop + marginLayoutParams.topMargin, measuredWidth + iC, paddingTop + marginLayoutParams.topMargin + measuredHeight);
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            int measuredWidth2 = this.p.getMeasuredWidth();
            int paddingStart2 = this.a.getPaddingStart();
            int paddingTop2 = (i6 - this.a.getPaddingTop()) - this.p.getMeasuredHeight();
            int iC2 = thq.c(width, measuredWidth2, z2, paddingStart + paddingStart2 + marginStart);
            View view2 = this.p;
            view2.layout(iC2, paddingTop2, measuredWidth2 + iC2, paddingTop2 + view2.getMeasuredHeight());
        }
        int measuredWidth3 = this.b.getMeasuredWidth();
        int marginStart2 = marginLayoutParams2.getMarginStart();
        int i7 = i6 + marginLayoutParams2.topMargin + this.t;
        int iC3 = thq.c(width, measuredWidth3, z2, paddingStart + marginStart2);
        int measuredHeight2 = this.b.getMeasuredHeight() + i7;
        this.b.layout(iC3, i7, measuredWidth3 + iC3, measuredHeight2);
        ImageView imageView2 = this.f;
        if (imageView2 != null && imageView2.getVisibility() != 8) {
            int measuredWidth4 = this.f.getMeasuredWidth();
            int marginEnd = marginLayoutParams6.getMarginEnd();
            int i8 = i7 + marginLayoutParams6.topMargin;
            int iB = thq.b(width, measuredWidth4, z2, paddingEnd + marginEnd);
            ImageView imageView3 = this.f;
            imageView3.layout(iB, i8, measuredWidth4 + iB, imageView3.getMeasuredHeight() + i8);
        }
        int iMax = Math.max(this.t, 0);
        boolean zC = c(2);
        int measuredWidth5 = this.k.getMeasuredWidth();
        int measuredHeight3 = this.k.getMeasuredHeight();
        if (zC) {
            i5 = iMax;
            bottom = this.b.getBottom() + marginLayoutParams5.topMargin + i5;
        } else {
            i5 = iMax;
            bottom = (((height - paddingBottom) - marginLayoutParams5.bottomMargin) - measuredHeight3) - this.t;
        }
        int iB2 = thq.b(width, measuredWidth5, z2, paddingEnd + marginLayoutParams5.getMarginEnd());
        this.k.layout(iB2, bottom, measuredWidth5 + iB2, measuredHeight3 + bottom);
        if (this.d.getVisibility() != 8) {
            int measuredWidth6 = this.d.getMeasuredWidth();
            int marginStart3 = marginLayoutParams3.getMarginStart();
            int baseline = !zC ? measuredHeight2 + marginLayoutParams2.bottomMargin + marginLayoutParams3.topMargin + i5 : (this.k.getBaseline() + bottom) - this.d.getBaseline();
            int iC4 = thq.c(width, measuredWidth6, z2, paddingStart + marginStart3);
            PlayTextView playTextView = this.d;
            playTextView.layout(iC4, baseline, measuredWidth6 + iC4, playTextView.getMeasuredHeight() + baseline);
        }
        if (this.o.getVisibility() != 8) {
            int measuredWidth7 = this.o.getMeasuredWidth();
            int marginStart4 = marginLayoutParams4.getMarginStart();
            int baseline2 = (bottom + this.k.getBaseline()) - this.o.getBaseline();
            int iC5 = thq.c(width, measuredWidth7, z2, paddingStart + marginStart4);
            View view3 = this.o;
            view3.layout(iC5, baseline2, view3.getMeasuredWidth() + iC5, this.o.getMeasuredHeight() + baseline2);
        }
        if (this.m.getVisibility() != 8) {
            int measuredWidth8 = this.m.getMeasuredWidth();
            int marginStart5 = marginLayoutParams7.getMarginStart();
            int i9 = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - this.t;
            int iC6 = thq.c(width, measuredWidth8, z2, paddingStart + marginStart5);
            PlayCardSnippet playCardSnippet = this.m;
            playCardSnippet.layout(iC6, i9 - playCardSnippet.getMeasuredHeight(), measuredWidth8 + iC6, i9);
        }
        int measuredWidth9 = paddingStart + ((((width - paddingStart) - paddingEnd) - this.n.getMeasuredWidth()) / 2);
        int measuredHeight4 = paddingTop + ((((height - paddingTop) - paddingBottom) - this.n.getMeasuredHeight()) / 2);
        View view4 = this.n;
        view4.layout(measuredWidth9, measuredHeight4, view4.getMeasuredWidth() + measuredWidth9, this.n.getMeasuredHeight() + measuredHeight4);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0209  */
    @Override // defpackage.tgo, android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r18, int r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.PlayCardViewSmall.onMeasure(int, int):void");
    }

    public PlayCardViewSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 1;
        this.r = -1;
        Resources resources = context.getResources();
        this.r = resources.getDimensionPixelSize(R.dimen.play_small_card_content_min_height);
        this.s = resources.getDimensionPixelSize(R.dimen.play_card_extra_vspace);
    }
}

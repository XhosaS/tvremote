package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.tgo;
import defpackage.thq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardViewMini extends tgo {
    protected View o;
    private int p;
    private int q;

    public PlayCardViewMini(Context context) {
        this(context, null);
    }

    private static final boolean c(int i) {
        return i <= 1;
    }

    @Override // defpackage.tgo, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.o = findViewById(R.id.li_ad_label_container);
    }

    @Override // defpackage.tgo, com.google.android.play.layout.ForegroundRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f.getLayoutParams();
        View view = this.o;
        ViewGroup.MarginLayoutParams marginLayoutParams6 = view != null ? (ViewGroup.MarginLayoutParams) view.getLayoutParams() : null;
        boolean z2 = layoutDirection == 0;
        int measuredWidth = this.a.getMeasuredWidth();
        int measuredHeight = this.a.getMeasuredHeight();
        int iC = thq.c(width, measuredWidth, z2, paddingStart);
        int i6 = measuredHeight + paddingTop;
        this.a.layout(iC, paddingTop, measuredWidth + iC, i6);
        View view2 = this.o;
        if (view2 == null || view2.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            int measuredWidth2 = this.o.getMeasuredWidth();
            int marginStart = marginLayoutParams6.getMarginStart();
            int paddingTop2 = (i6 - this.a.getPaddingTop()) - this.o.getMeasuredHeight();
            int iC2 = thq.c(width, measuredWidth2, z2, paddingStart + this.a.getPaddingStart() + marginStart);
            View view3 = this.o;
            i5 = paddingTop;
            view3.layout(iC2, paddingTop2, view3.getMeasuredWidth() + iC2, this.o.getMeasuredHeight() + paddingTop2);
        }
        int marginStart2 = marginLayoutParams.getMarginStart();
        int measuredWidth3 = this.b.getMeasuredWidth();
        int i7 = (i6 + marginLayoutParams.topMargin) - this.q;
        int iC3 = thq.c(width, measuredWidth3, z2, paddingStart + marginStart2);
        TextView textView = this.b;
        textView.layout(iC3, i7, measuredWidth3 + iC3, textView.getMeasuredHeight() + i7);
        int marginEnd = marginLayoutParams5.getMarginEnd();
        int measuredWidth4 = this.f.getMeasuredWidth();
        int i8 = marginLayoutParams5.topMargin + i7;
        int iB = thq.b(width, measuredWidth4, z2, paddingEnd + marginEnd);
        ImageView imageView = this.f;
        imageView.layout(iB, i8, measuredWidth4 + iB, imageView.getMeasuredHeight() + i8);
        int marginEnd2 = marginLayoutParams4.getMarginEnd();
        int measuredWidth5 = this.k.getMeasuredWidth();
        int i9 = ((height - paddingBottom) - marginLayoutParams4.bottomMargin) + this.q;
        int iB2 = thq.b(width, measuredWidth5, z2, paddingEnd + marginEnd2);
        PlayCardLabelView playCardLabelView = this.k;
        playCardLabelView.layout(iB2, i9 - playCardLabelView.getMeasuredHeight(), measuredWidth5 + iB2, i9);
        if (this.d.getVisibility() == 0) {
            int marginStart3 = marginLayoutParams2.getMarginStart();
            int measuredWidth6 = this.d.getMeasuredWidth();
            int iC4 = thq.c(width, measuredWidth6, z2, paddingStart + marginStart3);
            int i10 = measuredWidth6 + iC4;
            if (c(this.b.getLineCount())) {
                int measuredHeight2 = i7 + this.b.getMeasuredHeight() + marginLayoutParams.bottomMargin + marginLayoutParams2.topMargin;
                PlayTextView playTextView = this.d;
                playTextView.layout(iC4, measuredHeight2, i10, playTextView.getMeasuredHeight() + measuredHeight2);
            } else {
                int measuredHeight3 = ((i9 - this.k.getMeasuredHeight()) + this.k.getBaseline()) - this.d.getBaseline();
                PlayTextView playTextView2 = this.d;
                playTextView2.layout(iC4, measuredHeight3, i10, playTextView2.getMeasuredHeight() + measuredHeight3);
            }
        }
        if (this.e.getVisibility() == 0) {
            int marginStart4 = marginLayoutParams3.getMarginStart();
            int measuredWidth7 = this.e.getMeasuredWidth();
            int top = (this.k.getTop() + this.k.getBaseline()) - this.e.getBaseline();
            int iC5 = thq.c(width, measuredWidth7, z2, paddingStart + marginStart4);
            StarRatingBar starRatingBar = this.e;
            starRatingBar.layout(iC5, top, measuredWidth7 + iC5, starRatingBar.getMeasuredHeight() + top);
        }
        int measuredWidth8 = paddingStart + ((((width - paddingStart) - paddingEnd) - this.n.getMeasuredWidth()) / 2);
        int measuredHeight4 = i5 + ((((height - i5) - paddingBottom) - this.n.getMeasuredHeight()) / 2);
        View view4 = this.n;
        view4.layout(measuredWidth8, measuredHeight4, view4.getMeasuredWidth() + measuredWidth8, this.n.getMeasuredHeight() + measuredHeight4);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tgo, android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r11, int r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.PlayCardViewMini.onMeasure(int, int):void");
    }

    public PlayCardViewMini(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = -1;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.play_mini_card_content_height);
    }
}

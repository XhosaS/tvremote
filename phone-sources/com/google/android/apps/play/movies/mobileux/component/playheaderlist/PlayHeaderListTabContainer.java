package com.google.android.apps.play.movies.mobileux.component.playheaderlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cww;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderListTabContainer extends LinearLayout {
    private static final int[] f = new int[2];
    private static final int[] g = new int[2];
    public int a;
    public float b;
    public boolean c;
    public int d;
    public boolean e;
    private final Paint h;
    private int i;

    public PlayHeaderListTabContainer(Context context) {
        this(context, null);
    }

    public final void a() {
        int measuredWidth;
        int measuredWidth2;
        if (this.c) {
            measuredWidth2 = getResources().getDimensionPixelSize(R.dimen.play_header_list_tab_floating_padding);
            measuredWidth = measuredWidth2;
        } else {
            int i = this.d >> 1;
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.measure(-2, -2);
                measuredWidth = i - (childAt.getMeasuredWidth() / 2);
            } else {
                measuredWidth = 0;
            }
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null) {
                childAt2.measure(-2, -2);
                measuredWidth2 = i - (childAt2.getMeasuredWidth() / 2);
            } else {
                measuredWidth2 = 0;
            }
            int[] iArr = cww.a;
            if (getLayoutDirection() == 0) {
                int i2 = measuredWidth;
                measuredWidth = measuredWidth2;
                measuredWidth2 = i2;
            }
        }
        int[] iArr2 = cww.a;
        setPaddingRelative(measuredWidth2, 0, measuredWidth, 0);
        this.e = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) throws Resources.NotFoundException {
        if (getChildCount() <= 0 || this.a >= getChildCount()) {
            return;
        }
        View childAt = getChildAt(this.a);
        int[] iArr = f;
        a.c(childAt, iArr);
        if (this.b > 0.0f && this.a < getChildCount() - 1) {
            a.c(getChildAt(this.a + 1), g);
            float f2 = this.b;
            float f3 = 1.0f - f2;
            iArr[0] = (int) ((r4[0] * f2) + (iArr[0] * f3));
            iArr[1] = (int) ((f2 * r4[1]) + (f3 * iArr[1]));
        }
        int height = getHeight();
        float dimension = getResources().getDimension(R.dimen.tab_selected_highlight_height);
        float dimension2 = getResources().getDimension(R.dimen.header_tab_horizontal_padding);
        int i = this.i;
        canvas.drawRoundRect(new RectF(iArr[0] + dimension2, height - i, iArr[1] - dimension2, height + i), dimension, dimension, this.h);
    }

    public PlayHeaderListTabContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.tab_selected_highlight_height);
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.movies_600));
        invalidate();
    }
}

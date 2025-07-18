package com.google.android.play.headerlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderListTabContainer extends LinearLayout {
    private static final int[] f = new int[2];
    private static final int[] g = new int[2];
    public final Paint a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    private int h;

    public PlayHeaderListTabContainer(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getChildCount() <= 0 || this.b >= getChildCount()) {
            return;
        }
        View childAt = getChildAt(this.b);
        int[] iArr = f;
        a.c(childAt, iArr);
        if (this.c > 0.0f && this.b < getChildCount() - 1) {
            a.c(getChildAt(this.b + 1), g);
            float f2 = this.c;
            float f3 = 1.0f - f2;
            iArr[0] = (int) ((r4[0] * f2) + (iArr[0] * f3));
            iArr[1] = (int) ((f2 * r4[1]) + (f3 * iArr[1]));
        }
        canvas.drawRect(iArr[0], r0 - this.h, iArr[1], getHeight(), this.a);
    }

    public PlayHeaderListTabContainer(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.play_header_list_tab_strip_selected_long_rectangular_underline_height);
        resources.getDimensionPixelSize(R.dimen.play_header_list_tab_strip_selected_underline_corner_radius);
        resources.getDimensionPixelSize(R.dimen.play_header_list_tab_strip_selected_underline_inset);
        this.a = new Paint();
    }
}

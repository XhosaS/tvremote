package com.google.android.libraries.play.widget.replaydialog.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ButtonsLayoutView extends LinearLayout {
    private final int a;
    private Button b;
    private Button c;
    private int d;
    private int e;

    public ButtonsLayoutView(Context context) {
        this(context, null);
    }

    private static final boolean a(LinearLayout.LayoutParams layoutParams, int i, int i2, int i3) {
        boolean z;
        float f = i;
        if (layoutParams.weight != f) {
            layoutParams.weight = f;
            z = true;
        } else {
            z = false;
        }
        if (layoutParams.width != i2) {
            layoutParams.width = i2;
            z = true;
        }
        if (layoutParams.getMarginEnd() == i3) {
            return z;
        }
        layoutParams.setMarginEnd(i3);
        return true;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (Button) findViewById(R.id.primary_button);
        this.c = (Button) findViewById(R.id.secondary_button);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean zA;
        boolean zA2;
        if (View.MeasureSpec.getMode(i) != 1073741824 || this.b.getVisibility() == 8 || this.c.getVisibility() == 8) {
            super.onMeasure(i, i2);
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = this.a;
        int i4 = size - i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        this.b.measure(iMakeMeasureSpec, 0);
        this.c.measure(iMakeMeasureSpec, 0);
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int i5 = this.e;
        float f = i5;
        int i6 = this.d + i5;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        float f2 = i4;
        float f3 = f / i6;
        int i7 = (int) ((1.0f - f3) * f2);
        int i8 = (int) (f3 * f2);
        if (measuredWidth2 <= i8 && measuredWidth <= i7) {
            setOrientation(0);
            zA = a(layoutParams, this.d, 0, layoutParams.getMarginEnd());
            zA2 = a(layoutParams2, this.e, 0, i3);
        } else if (measuredWidth2 > i7 || measuredWidth > i8) {
            int i9 = (int) (f2 * 0.5f);
            if (measuredWidth2 > i9 || measuredWidth > i9) {
                setOrientation(1);
                zA = a(layoutParams, 0, -1, layoutParams.getMarginEnd());
                zA2 = a(layoutParams2, 0, -1, 0);
            } else {
                setOrientation(0);
                zA = a(layoutParams, 1, 0, layoutParams.getMarginEnd());
                zA2 = a(layoutParams2, 1, 0, i3);
            }
        } else {
            setOrientation(0);
            zA = a(layoutParams, this.e, 0, layoutParams.getMarginEnd());
            zA2 = a(layoutParams2, this.d, 0, i3);
        }
        if (zA) {
            this.b.setLayoutParams(layoutParams);
        }
        if (zA2) {
            this.c.setLayoutParams(layoutParams2);
        }
        super.onMeasure(i, i2);
    }

    public ButtonsLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 5;
        this.e = 3;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.replay__replaydialog_buttons_horizonal_margin);
    }
}

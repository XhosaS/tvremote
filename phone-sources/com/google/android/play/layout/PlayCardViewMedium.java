package com.google.android.play.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.tgo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCardViewMedium extends tgo {
    public PlayCardViewMedium(Context context) {
        this(context, null);
    }

    @Override // defpackage.tgo, android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((tgo) this).a.getLayoutParams();
        if (((tgo) this).a.getVisibility() != 8) {
            marginLayoutParams.width = (int) (((((size - paddingTop) - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) / 0.0f);
        } else {
            marginLayoutParams.width = 0;
        }
        super.onMeasure(i, i2);
    }

    public PlayCardViewMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

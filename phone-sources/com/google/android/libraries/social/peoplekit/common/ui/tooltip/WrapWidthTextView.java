package com.google.android.libraries.social.peoplekit.common.ui.tooltip;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WrapWidthTextView extends AppCompatTextView {
    public WrapWidthTextView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        int gravity = getGravity();
        setGravity((8388615 & gravity) == 8388613 ? 8388611 : 8388613);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float lineWidth = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > lineWidth) {
                    lineWidth = layout.getLineWidth(i3);
                }
            }
            setMeasuredDimension(((int) Math.ceil(lineWidth)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getMeasuredHeight());
            setGravity(gravity);
        }
    }

    public WrapWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

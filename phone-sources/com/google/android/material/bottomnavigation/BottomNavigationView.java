package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.videos.R;
import defpackage.sil;
import defpackage.spr;
import defpackage.sps;
import defpackage.spt;
import defpackage.suy;
import defpackage.swa;
import defpackage.swj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BottomNavigationView extends swj {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.swj
    public final int a() {
        return 6;
    }

    @Override // defpackage.swj
    protected final swa b(Context context) {
        return new spr(context);
    }

    public final void c(boolean z) {
        spr sprVar = (spr) this.b;
        if (sprVar.a != z) {
            sprVar.a = z;
            this.c.updateMenuView(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i2;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TintTypedArray tintTypedArrayB = suy.b(getContext(), attributeSet, spt.a, i, i2, new int[0]);
        c(tintTypedArrayB.getBoolean(2, true));
        if (tintTypedArrayB.hasValue(0)) {
            setMinimumHeight(tintTypedArrayB.getDimensionPixelSize(0, 0));
        }
        tintTypedArrayB.recycle();
        sil.n(this, new sps());
    }
}

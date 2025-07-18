package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {
    private float a;
    private float b;
    private float c;

    public ScaleFrameLayout(Context context) {
        this(context, null);
    }

    private static int a(int i, float f) {
        if (f == 1.0f) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) / f) + 0.5f), View.MeasureSpec.getMode(i));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setScaleX(this.c);
        view.setScaleY(this.c);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean zAddViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (zAddViewInLayout) {
            view.setScaleX(this.c);
            view.setScaleY(this.c);
        }
        return zAddViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        float f = this.a;
        if (f == 1.0f && this.b == 1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(a(i, f), a(i2, this.b));
        setMeasuredDimension((int) ((getMeasuredWidth() * this.a) + 0.5f), (int) ((getMeasuredHeight() * this.b) + 0.5f));
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1.0f;
        this.b = 1.0f;
        this.c = 1.0f;
    }
}

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ForegroundRelativeLayout extends RelativeLayout {
    private Drawable a;
    private final Rect b;
    private final Rect c;
    private boolean d;
    public int g;
    public int h;
    public int i;
    public int j;

    public ForegroundRelativeLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d) {
                this.d = false;
                Rect rect = this.b;
                Rect rect2 = this.c;
                rect.set(this.g, this.h, getWidth() - this.i, getHeight() - this.j);
                Gravity.apply(R.styleable.AppCompatTheme_windowActionModeOverlay, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.a.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d = true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.a);
            }
            this.a = drawable;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    this.g = rect.left;
                    this.h = rect.top;
                    this.i = rect.right;
                    this.j = rect.bottom;
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.b = new Rect();
        this.c = new Rect();
        this.d = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.foreground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

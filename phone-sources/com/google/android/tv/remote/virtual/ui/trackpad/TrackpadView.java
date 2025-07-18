package com.google.android.tv.remote.virtual.ui.trackpad;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.google.android.videos.R;
import defpackage.ton;
import defpackage.toq;
import defpackage.tor;
import defpackage.tov;
import defpackage.tui;
import defpackage.ufx;
import defpackage.zft;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrackpadView extends View {
    public static final tui a = tui.l("com/google/android/tv/remote/virtual/ui/trackpad/TrackpadView");
    public toq b;
    public boolean c;
    public boolean d;
    private final ton e;
    private final tov f;
    private final int g;
    private boolean h;
    private Drawable i;
    private int j;
    private int k;
    private int[] l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private ObjectAnimator r;

    public TrackpadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int a() {
        int width = getWidth();
        int iMin = Math.min(width, getHeight());
        int i = width - this.j;
        return Math.max(0, Math.min(i, (i / 2) + ((int) (this.o * iMin))));
    }

    private final int b() {
        int height = getHeight();
        int iMin = Math.min(getWidth(), height);
        int i = height - this.k;
        return Math.max(0, Math.min(i, (i / 2) + ((int) (this.p * iMin))));
    }

    @Override // android.view.View
    public final void dispatchDrawableHotspotChanged(float f, float f2) {
        super.dispatchDrawableHotspotChanged(f, f2);
        Drawable drawable = this.i;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.i.setHotspot(f - a(), f2 - b());
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.i.setState(this.l);
    }

    @Override // android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i);
        this.l = iArrOnCreateDrawableState;
        int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        int i2 = 0;
        while (true) {
            if (i2 >= iArrCopyOf.length) {
                break;
            }
            if (iArrCopyOf[i2] == 16842919) {
                iArrCopyOf[i2] = 0;
            }
            i2++;
        }
        boolean z = this.c;
        if (z || this.d) {
            iArrCopyOf[(r4 - i) - 1] = 16842919;
            if (z) {
                this.c = false;
                post(new ufx(this, 1));
            }
        }
        return iArrCopyOf;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.r = null;
        }
        this.f.a();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.h) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setPathEffect(new DashPathEffect(new float[]{20.0f, 20.0f}, 0.0f));
            paint.setARGB(127, 255, 255, 255);
            int width = getWidth();
            int height = getHeight();
            float x = getX() + (width / 2.0f);
            float y = getY() + (height / 2.0f);
            int iMin = Math.min(getWidth(), getHeight());
            tov tovVar = this.f;
            float f = iMin;
            canvas.drawCircle(x, y, tovVar.g * f, paint);
            canvas.drawCircle(x, y, tovVar.h * f, paint);
            canvas.drawCircle(x, y, tovVar.i * f, paint);
            Pair pairA = this.e.a();
            float fFloatValue = x - (((Float) pairA.first).floatValue() * f);
            float fFloatValue2 = y + (((Float) pairA.second).floatValue() * f);
            float f2 = fFloatValue - f;
            float f3 = fFloatValue2 - f;
            canvas2 = canvas;
            canvas2.drawLine(fFloatValue, fFloatValue2, f2, f3, paint);
            float f4 = fFloatValue2 + f;
            canvas2.drawLine(fFloatValue, fFloatValue2, f2, f4, paint);
            float f5 = fFloatValue + f;
            canvas2.drawLine(fFloatValue, fFloatValue2, f5, f3, paint);
            canvas2.drawLine(fFloatValue, fFloatValue2, f5, f4, paint);
        } else {
            canvas2 = canvas;
        }
        if (this.i != null) {
            canvas2.translate(a(), b());
            this.i.draw(canvas2);
            canvas2.translate(-r9, -r0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tv.remote.virtual.ui.trackpad.TrackpadView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setPosX(float f) {
        this.o = f;
        invalidate();
    }

    public void setPosY(float f) {
        this.p = f;
        invalidate();
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    public TrackpadView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TrackpadView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = false;
        this.q = -1;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tor.b, i, i2);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        boolean z = false;
        ColorStateList colorStateList = null;
        PorterDuff.Mode mode = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                this.h = typedArrayObtainStyledAttributes.getBoolean(0, false);
            } else if (index == 1) {
                this.i = typedArrayObtainStyledAttributes.getDrawable(1);
                z = true;
            } else if (index == 2) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
            } else if (index == 3) {
                mode = new PorterDuff.Mode[]{PorterDuff.Mode.SRC_OVER, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.ADD}[typedArrayObtainStyledAttributes.getInt(3, 1)];
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            this.i = getResources().getDrawable(R.drawable.default_trackpad_indicator, null);
        }
        Drawable drawable = this.i;
        if (drawable != null) {
            this.j = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.i.getIntrinsicHeight();
            this.k = intrinsicHeight;
            int i4 = this.j;
            if (i4 != -1 && intrinsicHeight != -1) {
                this.i.setBounds(0, 0, i4, intrinsicHeight);
            } else {
                this.i = null;
            }
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            if (colorStateList != null || mode != null) {
                Drawable drawableMutate = drawable2.mutate();
                this.i = drawableMutate;
                if (colorStateList != null) {
                    drawableMutate.setTintList(colorStateList);
                }
                if (mode != null) {
                    this.i.setTintMode(mode);
                }
            }
            if (this.i.isStateful()) {
                setClickable(true);
            }
            this.i.setCallback(this);
        }
        Resources resources = context.getResources();
        float fraction = resources.getFraction(R.fraction.touchpad_repeat_distance_slow, 1, 1);
        this.e = new ton(fraction);
        this.f = new tov(new zft(this), fraction, resources.getFraction(R.fraction.touchpad_repeat_distance_normal, 1, 1), resources.getFraction(R.fraction.touchpad_repeat_distance_fast, 1, 1), resources.getInteger(R.integer.touchpad_delay_long_press_ms), resources.getInteger(R.integer.touchpad_repeat_interval_slow_ms), resources.getInteger(R.integer.touchpad_repeat_interval_normal_ms), resources.getInteger(R.integer.touchpad_repeat_interval_fast_ms));
        this.g = resources.getInteger(R.integer.indicator_return_animation_duration_ms);
    }
}

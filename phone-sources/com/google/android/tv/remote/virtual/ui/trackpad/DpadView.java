package com.google.android.tv.remote.virtual.ui.trackpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableMap;
import defpackage.cww;
import defpackage.ton;
import defpackage.too;
import defpackage.toq;
import defpackage.tor;
import defpackage.tos;
import defpackage.tow;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DpadView extends FrameLayout {
    public float a;
    public toq b;
    private final too c;

    /* compiled from: PG */
    class DirectionalButton extends RemoteButton {
        private final tow c;

        public DirectionalButton(final tow towVar, Drawable drawable) {
            super(DpadView.this.getContext());
            this.c = towVar;
            setBackground(drawable);
            this.b = new tos() { // from class: top
                @Override // defpackage.tos
                public final void a(tlv tlvVar) {
                    dpadView.b.a(towVar.g, tlvVar);
                }
            };
        }

        public boolean pointInView(float f, float f2, float f3) {
            float f4 = -f3;
            DpadView dpadView = DpadView.this;
            int width = dpadView.getWidth();
            int height = dpadView.getHeight();
            if (f >= f4 && f2 >= f4 && f <= width + f3 && f2 <= height + f3) {
                float f5 = f - (width / 2);
                float f6 = (height / 2) - f2;
                if (Math.hypot(f5, f6) < (Math.min(width, height) * dpadView.a) / 2.0f) {
                    return this.c == tow.NONE;
                }
                if (ton.b(f5, f6) == this.c) {
                    return true;
                }
            }
            return false;
        }
    }

    public DpadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.c.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.c.n(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    protected boolean isTransformedTouchPointInView(float f, float f2, View view, PointF pointF) {
        boolean zPointInView = ((DirectionalButton) view).pointInView(f, f2, 0.0f);
        if (!zPointInView || pointF == null) {
            return zPointInView;
        }
        pointF.set(f, f2);
        return true;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.c.e(z, i, rect);
    }

    public DpadView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DpadView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0.44f;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tor.a, i, i2);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(0, tow.NONE);
        builder.put(5, tow.UP);
        builder.put(4, tow.RIGHT);
        builder.put(2, tow.DOWN);
        builder.put(3, tow.LEFT);
        ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.a = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, 1.0f);
            } else {
                tow towVar = (tow) immutableMapBuildOrThrow.get(Integer.valueOf(index));
                if (towVar != null) {
                    addView(new DirectionalButton(towVar, typedArrayObtainStyledAttributes.getDrawable(index)));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        too tooVar = new too(this);
        this.c = tooVar;
        cww.p(this, tooVar);
    }
}

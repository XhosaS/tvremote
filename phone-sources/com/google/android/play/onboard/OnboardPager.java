package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.gll;
import defpackage.thv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OnboardPager extends thv {
    protected final boolean h;
    protected final boolean i;
    protected float j;

    public OnboardPager(Context context) {
        super(context);
        this.h = true;
        this.i = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean o() {
        return u(-1) && super.o();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 || !v(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            motionEvent.setAction(3);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v(motionEvent)) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean p() {
        return u(1) && super.p();
    }

    protected final boolean u(int i) {
        int i2 = this.c;
        gll gllVar = this.b;
        int iJ = gllVar == null ? 0 : gllVar.j();
        if (i < 0 && i2 > 0) {
            return t() ? this.h : this.i;
        }
        if (i <= 0 || i2 >= iJ - 1) {
            return true;
        }
        return t() ? this.i : this.h;
    }

    protected final boolean v(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = motionEvent.getX(0);
        } else if (actionMasked != 2) {
            if (actionMasked == 5 || actionMasked == 6) {
                return false;
            }
        } else {
            if (pointerCount > 1) {
                return false;
            }
            float x = motionEvent.getX(0);
            float f = x - this.j;
            this.j = x;
            if (!u((int) Math.signum(-f))) {
                return false;
            }
        }
        return true;
    }

    public OnboardPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
        this.i = true;
    }
}

package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awc extends FrameLayout {
    private static final int[] f = {R.attr.state_pressed};
    ArrayList a;
    ArrayList b;
    float c;
    float d;
    float e;
    private int g;
    private int h;
    private int i;
    private ArrayList j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private final int o;
    private final int p;
    private Animation q;
    private final Runnable r;

    public awc(Context context) {
        this(context, null);
    }

    private final void f(boolean z) {
        int i = this.g;
        float f2 = 0.0f;
        if (i == 3) {
            if (z) {
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    ((View) this.a.get(i2)).setVisibility(0);
                }
                return;
            }
            for (int i3 = 0; i3 < this.a.size(); i3++) {
                ((View) this.a.get(i3)).setVisibility(8);
            }
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                ((View) this.b.get(i4)).setVisibility(8);
            }
            this.c = 0.0f;
            return;
        }
        if (i != 2) {
            if (i == 1) {
                e();
                if (z) {
                    for (int i5 = 0; i5 < this.a.size(); i5++) {
                        ((View) this.a.get(i5)).setVisibility(0);
                    }
                    f2 = 1.0f;
                }
                float f3 = this.e;
                if (f2 != f3) {
                    avy avyVar = new avy(this, f3, f2);
                    this.q = avyVar;
                    avyVar.setDuration(this.o);
                    this.q.setInterpolator(new DecelerateInterpolator());
                    this.q.setAnimationListener(new avw(this));
                    startAnimation(this.q);
                    return;
                }
                return;
            }
            return;
        }
        if (this.h != 2) {
            for (int i6 = 0; i6 < this.a.size(); i6++) {
                ((View) this.a.get(i6)).setVisibility(true != z ? 8 : 0);
            }
            return;
        }
        e();
        if (z) {
            for (int i7 = 0; i7 < this.a.size(); i7++) {
                ((View) this.a.get(i7)).setVisibility(0);
            }
            f2 = 1.0f;
        }
        float f4 = this.d;
        if (f4 != f2) {
            avz avzVar = new avz(this, f4, f2);
            this.q = avzVar;
            avzVar.setDuration(this.p);
            this.q.setInterpolator(new AccelerateDecelerateInterpolator());
            this.q.setAnimationListener(new avv(this));
            startAnimation(this.q);
        }
    }

    private final boolean g() {
        return this.g == 3;
    }

    private final boolean h() {
        return this.g != 0;
    }

    final float a() {
        return (this.g == 1 && this.h == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    final float b() {
        return (this.g == 2 && this.h == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final awb generateLayoutParams(AttributeSet attributeSet) {
        return new awb(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof awb;
    }

    final void d(boolean z) {
        e();
        int i = 0;
        if (z) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.k, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMax = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                View view = (View) this.b.get(i2);
                view.setVisibility(0);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredHeight());
            }
            i = iMax;
        }
        awa awaVar = new awa(this, this.c, z ? i : 0.0f);
        this.q = awaVar;
        awaVar.setDuration(this.p);
        this.q.setInterpolator(new AccelerateDecelerateInterpolator());
        this.q.setAnimationListener(new avu(this));
        startAnimation(this.q);
    }

    final void e() {
        Animation animation = this.q;
        if (animation != null) {
            animation.cancel();
            this.q = null;
            clearAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new awb();
    }

    public int getCardType() {
        return this.g;
    }

    @Deprecated
    public int getExtraVisibility() {
        return this.i;
    }

    public int getInfoVisibility() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i);
        int length = iArrOnCreateDrawableState.length;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            z |= !(i3 != 16842919);
            z2 |= !(i3 != 16842910);
        }
        return (z && z2) ? View.PRESSED_ENABLED_STATE_SET : z ? f : z2 ? View.ENABLED_STATE_SET : View.EMPTY_STATE_SET;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.r);
        e();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < this.j.size(); i5++) {
            View view = (View) this.j.get(i5);
            if (view.getVisibility() != 8) {
                view.layout(getPaddingLeft(), (int) paddingTop, this.k + getPaddingLeft(), (int) (view.getMeasuredHeight() + paddingTop));
                paddingTop += view.getMeasuredHeight();
            }
        }
        if (h()) {
            float measuredHeight = 0.0f;
            for (int i6 = 0; i6 < this.a.size(); i6++) {
                measuredHeight += ((View) this.a.get(i6)).getMeasuredHeight();
            }
            int i7 = this.g;
            if (i7 == 1) {
                paddingTop -= measuredHeight;
                if (paddingTop < 0.0f) {
                    paddingTop = 0.0f;
                }
            } else if (i7 != 2) {
                paddingTop -= this.c;
            } else if (this.h == 2) {
                measuredHeight *= this.d;
            }
            for (int i8 = 0; i8 < this.a.size(); i8++) {
                View view2 = (View) this.a.get(i8);
                if (view2.getVisibility() != 8) {
                    int measuredHeight2 = view2.getMeasuredHeight();
                    if (measuredHeight2 > measuredHeight) {
                        measuredHeight2 = (int) measuredHeight;
                    }
                    float f2 = measuredHeight2;
                    paddingTop += f2;
                    view2.layout(getPaddingLeft(), (int) paddingTop, this.k + getPaddingLeft(), (int) paddingTop);
                    measuredHeight -= f2;
                    if (measuredHeight <= 0.0f) {
                        break;
                    }
                }
            }
            if (g()) {
                for (int i9 = 0; i9 < this.b.size(); i9++) {
                    View view3 = (View) this.b.get(i9);
                    if (view3.getVisibility() != 8) {
                        view3.layout(getPaddingLeft(), (int) paddingTop, this.k + getPaddingLeft(), (int) (view3.getMeasuredHeight() + paddingTop));
                        paddingTop += view3.getMeasuredHeight();
                    }
                }
            }
        }
        onSizeChanged(0, 0, i3 - i, i4 - i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awc.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        if (z != isActivated()) {
            super.setActivated(z);
            if (h() && this.h == 1) {
                f(isActivated());
            }
        }
    }

    public void setCardType(int i) {
        if (this.g != i) {
            if (i < 0 || i >= 4) {
                Log.e("BaseCardView", a.a(i, "Invalid card type specified: ", ". Defaulting to type CARD_TYPE_MAIN_ONLY."));
                this.g = 0;
            } else {
                this.g = i;
            }
            requestLayout();
        }
    }

    @Deprecated
    public void setExtraVisibility(int i) {
        if (this.i != i) {
            this.i = i;
        }
    }

    public void setInfoVisibility(int i) {
        if (this.h != i) {
            e();
            this.h = i;
            this.d = b();
            requestLayout();
            float fA = a();
            if (fA != this.e) {
                this.e = fA;
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    ((View) this.a.get(i2)).setAlpha(this.e);
                }
            }
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        if (z != isSelected()) {
            super.setSelected(z);
            boolean zIsSelected = isSelected();
            Runnable runnable = this.r;
            removeCallbacks(runnable);
            if (this.g != 3) {
                if (this.h == 2) {
                    f(zIsSelected);
                }
            } else if (!zIsSelected) {
                d(false);
            } else if (this.m) {
                postDelayed(runnable, this.n);
            } else {
                post(runnable);
                this.m = true;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public awc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.baseCardViewStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new awb();
    }

    public awc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new avt(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, atk.d, i, 0);
        try {
            this.g = typedArrayObtainStyledAttributes.getInteger(3, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                setForeground(drawable);
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                setBackground(drawable2);
            }
            this.h = typedArrayObtainStyledAttributes.getInteger(5, 1);
            int integer = typedArrayObtainStyledAttributes.getInteger(4, 2);
            this.i = integer;
            int i2 = this.h;
            if (integer < i2) {
                this.i = i2;
            }
            this.n = typedArrayObtainStyledAttributes.getInteger(6, getResources().getInteger(com.google.android.katniss.R.integer.lb_card_selected_animation_delay));
            this.p = typedArrayObtainStyledAttributes.getInteger(7, getResources().getInteger(com.google.android.katniss.R.integer.lb_card_selected_animation_duration));
            this.o = typedArrayObtainStyledAttributes.getInteger(0, getResources().getInteger(com.google.android.katniss.R.integer.lb_card_activated_animation_duration));
            typedArrayObtainStyledAttributes.recycle();
            this.m = true;
            this.j = new ArrayList();
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = b();
            this.e = a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof awb ? new awb((awb) layoutParams) : new awb(layoutParams);
    }
}

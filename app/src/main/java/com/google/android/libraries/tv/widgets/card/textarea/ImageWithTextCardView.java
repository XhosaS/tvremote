package com.google.android.libraries.tv.widgets.card.textarea;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.katniss.R;
import defpackage.uts;
import defpackage.utu;
import defpackage.utv;
import defpackage.utx;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ImageWithTextCardView extends FrameLayout {
    public final uts a;
    public final uts b;
    public final uts c;
    public View d;
    public Drawable e;
    public int f;
    private final utu g;
    private final uts[] h;
    private final ObjectAnimator i;
    private final ObjectAnimator j;
    private float k;
    private utx l;
    private utx m;
    private utx n;
    private utx o;
    private boolean p;
    private boolean q;
    private float r;
    private float s;
    private int t;
    private float u;
    private float v;
    private int w;

    public ImageWithTextCardView(Context context) {
        this(context, null);
    }

    public static boolean f(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return (i2 == 0 || i2 == 1) ? false : true;
    }

    public static boolean g(int i) {
        if (i != 0) {
            return i + (-1) != 0;
        }
        throw null;
    }

    public static boolean h(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return (i2 == 1 || i2 == 2) ? false : true;
    }

    public static int i(Context context) {
        utu utuVarC = utu.c(context);
        return utuVarC.a(R.id.card_text_subtitle) + utuVarC.a(R.id.card_text_title);
    }

    private final boolean l() {
        return this.c.f(this.o) && f(this.f);
    }

    private final boolean m() {
        utx utxVar;
        if (!this.q || (utxVar = this.n) == null) {
            utxVar = this.m;
        }
        return this.b.f(utxVar) && g(this.f);
    }

    private final boolean n() {
        return this.a.f(this.l) && h(this.f);
    }

    public final void a(boolean z) {
        if (this.q != z) {
            this.q = z;
            ObjectAnimator objectAnimator = this.j;
            objectAnimator.cancel();
            objectAnimator.setFloatValues(z ? this.v : 0.0f);
            objectAnimator.start();
            n();
            m();
            l();
            invalidate();
        }
    }

    public final void b(utx utxVar, utx utxVar2) {
        this.m = utxVar;
        this.n = utxVar2;
        if (m()) {
            invalidate();
        }
    }

    public final void c(int... iArr) {
        boolean z;
        uts[] utsVarArr = this.h;
        int length = utsVarArr.length;
        boolean z2 = false;
        for (int i = 0; i < 3; i++) {
            uts utsVar = utsVarArr[i];
            if (Arrays.equals(utsVar.f, iArr)) {
                z = false;
            } else {
                utsVar.f = iArr;
                utsVar.b();
                z = true;
            }
            z2 |= z;
        }
        if (!z2 || this.r == 0.0f) {
            return;
        }
        invalidate();
    }

    public final void d(boolean z) {
        if (this.p != z) {
            this.p = z;
            ObjectAnimator objectAnimator = this.i;
            objectAnimator.cancel();
            objectAnimator.setFloatValues(true != z ? 0.0f : 1.0f);
            objectAnimator.start();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        boolean z = false;
        if (this.d != null && this.k != 1.0f) {
            z = true;
        }
        if (z) {
            canvas.save();
            float f = this.k;
            canvas.scale(f, f, this.d.getWidth() * 0.5f, this.d.getHeight() * 0.5f);
        }
        super.dispatchDraw(canvas);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable == null || !drawable.setState(getDrawableState())) {
            return;
        }
        invalidate();
    }

    public final void e(int i) {
        if (i != this.f) {
            this.f = i;
            if (this.p) {
                invalidate();
            }
        }
    }

    public View getCardFrame() {
        return this.d;
    }

    public Drawable getCardFrameBackground() {
        return null;
    }

    public Drawable getCardFrameForeground() {
        return this.e;
    }

    public float getCardFrameScale() {
        return this.k;
    }

    public CharSequence getDescription() {
        return this.c.e;
    }

    public int getDescriptionLayoutInfoWidth() {
        return this.c.g;
    }

    public CharSequence getSubtitle() {
        return this.b.e;
    }

    public int getSubtitleLayoutInfoWidth() {
        return this.b.g;
    }

    public float getTextAlpha() {
        return this.r;
    }

    public int getTextTintColor() {
        return this.w;
    }

    public float getTextTranslationY() {
        return this.u;
    }

    public CharSequence getTitle() {
        return this.a.e;
    }

    public int getTitleLayoutInfoWidth() {
        return this.a.g;
    }

    public ViewGroup.MarginLayoutParams getTitleMargins() {
        return this.a.l;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void j(CharSequence charSequence) {
        this.o = utv.a(charSequence);
        if (l()) {
            invalidate();
        }
    }

    public final void k(CharSequence charSequence) {
        this.l = utv.a(charSequence);
        if (n()) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.r == 0.0f) {
            return;
        }
        int bottom = this.d.getBottom() + ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).bottomMargin;
        int i = (int) this.u;
        canvas.save();
        float f = this.s;
        int i2 = bottom + i;
        canvas.scale(f, f, 0.0f, i2);
        float height = getHeight() / this.s;
        uts[] utsVarArr = this.h;
        int length = utsVarArr.length;
        for (int i3 = 0; i3 < 3; i3++) {
            uts utsVar = utsVarArr[i3];
            if (utsVar.e != null && ((utsVar != this.a || h(this.f)) && ((utsVar != this.b || g(this.f)) && (utsVar != this.c || f(this.f))))) {
                ViewGroup.MarginLayoutParams marginLayoutParams = utsVar.l;
                int height2 = marginLayoutParams.topMargin + utsVar.a().getHeight() + this.t;
                if (i2 + height2 > height) {
                    break;
                }
                float f2 = marginLayoutParams.leftMargin;
                float f3 = marginLayoutParams.topMargin;
                canvas.save();
                canvas.translate(f2 + 0.0f, i2 + f3);
                utsVar.a().draw(canvas);
                canvas.restore();
                i2 += height2 + marginLayoutParams.bottomMargin;
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = getChildAt(0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        this.d.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin + this.d.getMeasuredWidth(), marginLayoutParams.topMargin + this.d.getMeasuredHeight());
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChildWithMargins(this.d, i, 0, i2, 0);
        int size = View.MeasureSpec.getMode(i2) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        int measuredHeight = marginLayoutParams.topMargin + this.d.getMeasuredHeight() + marginLayoutParams.bottomMargin;
        int measuredWidth = marginLayoutParams.leftMargin + this.d.getMeasuredWidth() + marginLayoutParams.rightMargin;
        int height = (int) this.v;
        int layoutDirection = getLayoutDirection();
        uts[] utsVarArr = this.h;
        int length = utsVarArr.length;
        for (int i3 = 0; i3 < 3; i3++) {
            uts utsVar = utsVarArr[i3];
            ViewGroup.MarginLayoutParams marginLayoutParams2 = utsVar.l;
            int i4 = (measuredWidth - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
            if (utsVar.g != i4) {
                utsVar.g = i4;
                utsVar.b = null;
            }
            if (utsVar.d != layoutDirection) {
                utsVar.d = layoutDirection;
                utsVar.b = null;
            }
            if (utsVar.e != null) {
                height += marginLayoutParams2.topMargin + utsVar.a().getHeight() + marginLayoutParams2.bottomMargin + this.t;
            }
        }
        int i5 = height + measuredHeight;
        if (i5 <= size) {
            this.s = 1.0f;
        } else {
            this.s = Math.max(0.5f, (size - measuredHeight) / height);
        }
        setMeasuredDimension(resolveSizeAndState(measuredWidth, i, 0), resolveSizeAndState(Math.min(size, i5), i2, 0));
    }

    public void setCardFrameScale(float f) {
        if (this.k != f) {
            this.k = f;
            invalidate();
        }
    }

    public void setDescriptionTextAlpha(float f) {
        if (this.c.c(f)) {
            invalidate();
        }
    }

    public void setDescriptionTextColor(int i) {
        uts utsVar = this.c;
        utsVar.c = ColorStateList.valueOf(i);
        utsVar.b();
        if (this.r != 0.0f) {
            invalidate();
        }
    }

    public void setExtraLineHeight(int i) {
        if (this.t != i) {
            this.t = i;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!layoutParams.equals(getLayoutParams()) || getLayoutDirection() == 1) {
            super.setLayoutParams(layoutParams);
        }
    }

    public void setSubtitleLetterSpacing(float f) {
        uts utsVar = this.b;
        if (utsVar.k != f) {
            utsVar.k = f;
            utsVar.b();
            if (g(this.f)) {
                invalidate();
            }
        }
    }

    public void setSubtitleTextAlpha(float f) {
        if (this.b.c(f)) {
            invalidate();
        }
    }

    public void setSubtitleTextColor(int i) {
        uts utsVar = this.b;
        utsVar.c = ColorStateList.valueOf(i);
        utsVar.b();
        if (this.r != 0.0f) {
            invalidate();
        }
    }

    public void setTextAlpha(float f) {
        this.r = f;
        setTitleTextAlpha(f);
        setSubtitleTextAlpha(f);
        setDescriptionTextAlpha(f);
    }

    public void setTextTintColor(int i) {
        boolean z;
        if (this.w == i) {
            return;
        }
        this.w = i;
        uts[] utsVarArr = this.h;
        int length = utsVarArr.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < 3; i2++) {
            uts utsVar = utsVarArr[i2];
            if (utsVar.i != i) {
                utsVar.i = i;
                utsVar.b();
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
        }
        if (!z2 || this.r == 0.0f) {
            return;
        }
        invalidate();
    }

    public void setTextTranslationValue(float f) {
        this.u = f;
    }

    public void setTextTranslationY(float f) {
        if (this.u != f) {
            this.u = f;
            invalidate();
        }
    }

    public void setTextTranslationYWhenFocused(float f) {
        this.v = f;
    }

    public void setTitleTextAlpha(float f) {
        if (this.a.c(f)) {
            invalidate();
        }
    }

    public void setTitleTextColor(int i) {
        uts utsVar = this.a;
        utsVar.c = ColorStateList.valueOf(i);
        utsVar.b();
        if (this.r != 0.0f) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable == null || drawable == this.e) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public ImageWithTextCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        utu utuVarC = utu.c(getContext());
        this.g = utuVarC;
        uts utsVarB = utuVarC.b(R.id.card_text_title);
        this.a = utsVarB;
        uts utsVarB2 = utuVarC.b(R.id.card_text_subtitle);
        this.b = utsVarB2;
        uts utsVarB3 = utuVarC.b(R.id.card_text_description);
        this.c = utsVarB3;
        this.h = new uts[]{utsVarB, utsVarB2, utsVarB3};
        this.i = ObjectAnimator.ofFloat(this, "textAlpha", 1.0f).setDuration(getResources().getInteger(R.integer.default_focused_animation_duration_ms));
        this.j = ObjectAnimator.ofFloat(this, "textTranslationY", 0.0f).setDuration(getResources().getInteger(R.integer.default_focused_animation_duration_ms));
        this.k = 1.0f;
        this.f = 4;
        this.p = true;
        this.q = false;
        this.r = 1.0f;
        this.s = 1.0f;
        this.t = 0;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0;
        setWillNotDraw(false);
        setTransitionGroup(true);
    }
}

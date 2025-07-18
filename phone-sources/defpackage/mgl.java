package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mgl extends View {
    public static final mgm i = new mgi();
    public static final mgm j = new mgj();
    public static final mgm k = new mgk();
    public final RectF l;
    protected float m;
    protected float n;

    public mgl(Context context) {
        super(context);
        this.l = new RectF();
    }

    protected abstract float a();

    public void c(int i2) {
        setAlpha(0.0f);
        Animator animatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", ei());
        float fA = a();
        if (fA != 1.0f) {
            float f = this.m;
            RectF rectF = this.l;
            setPivotX(f - rectF.left);
            setPivotY(this.n - rectF.top);
            setScaleX(fA);
            setScaleY(fA);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorOfFloat, ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f));
            animatorOfFloat = animatorSet;
        }
        animatorOfFloat.setStartDelay(i2 * 200);
        animatorOfFloat.setDuration(150L);
        animatorOfFloat.setInterpolator(ted.a(getContext()));
        animatorOfFloat.start();
    }

    public final void d(RectF rectF, RectF rectF2) {
        RectF rectF3 = this.l;
        rectF3.set(rectF);
        this.m = rectF.centerX();
        this.n = rectF.centerY();
        rectF3.intersect(rectF2);
        float fWidth = rectF3.width() + 0.5f;
        float fHeight = rectF3.height() + 0.5f;
        float f = rectF3.left - rectF2.left;
        float f2 = rectF3.top - rectF2.top;
        int i2 = (int) fWidth;
        int i3 = (int) fHeight;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        int i4 = (int) f;
        layoutParams.leftMargin = i4;
        int i5 = (int) f2;
        layoutParams.topMargin = i5;
        setLayoutParams(layoutParams);
        layout(i4, i5, i2 + i4, i3 + i5);
    }

    protected float ei() {
        return 1.0f;
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i2, Rect rect) {
        setActivated(z);
        super.onFocusChanged(z, i2, rect);
    }
}

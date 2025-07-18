package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syz {
    public final sys a;
    public final ClippableRoundedCornerLayout b;
    public final Toolbar c;
    public final EditText d;
    public final svq e;
    public AnimatorSet f;
    public sym g;
    private final View h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final Toolbar k;
    private final LinearLayout l;
    private final TextView m;
    private final ImageButton n;
    private final View o;
    private final TouchObserverFrameLayout p;

    public syz(sys sysVar) {
        this.a = sysVar;
        this.h = sysVar.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = sysVar.b;
        this.b = clippableRoundedCornerLayout;
        this.i = sysVar.e;
        this.j = sysVar.f;
        this.k = sysVar.g;
        this.c = sysVar.h;
        this.m = sysVar.i;
        this.d = sysVar.k;
        this.n = sysVar.l;
        this.o = sysVar.m;
        this.p = sysVar.n;
        this.l = sysVar.j;
        this.e = new svq(clippableRoundedCornerLayout);
    }

    private final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int iJ = j(this.g);
        return sil.p(this.g) ? iJ - marginEnd : ((iJ + this.g.getWidth()) + marginEnd) - this.a.getWidth();
    }

    private final int h() {
        FrameLayout frameLayout = this.j;
        int top = frameLayout.getTop() + (frameLayout.getHeight() / 2);
        sym symVar = this.g;
        int top2 = symVar.getTop();
        for (ViewParent parent = symVar.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            top2 += ((View) parent).getTop();
        }
        return (top2 + (this.g.getHeight() / 2)) - top;
    }

    private final int i(View view, View view2) {
        if (view != null) {
            return j(view) - j(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.g.getPaddingStart();
        int iJ = j(this.g);
        return sil.p(this.g) ? (((iJ + this.g.getWidth()) + marginStart) - paddingStart) - this.a.getRight() : (iJ - marginStart) + paddingStart;
    }

    private final int j(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    private final Animator k(boolean z, View view) {
        TextView textView = this.g.b;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = this.g.a;
        }
        return m(z, view, j(textView) - (view.getLeft() + this.l.getLeft()), h());
    }

    private final void l(AnimatorSet animatorSet) {
        ImageButton imageButtonB = suz.b(this.k);
        if (imageButtonB == null) {
            return;
        }
        Drawable drawableA = cry.a(imageButtonB.getDrawable());
        if (!this.a.p) {
            if (drawableA instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) drawableA).setProgress(1.0f);
            }
            if (drawableA instanceof sue) {
                ((sue) drawableA).a(1.0f);
                return;
            }
            return;
        }
        if (drawableA instanceof DrawerArrowDrawable) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new fsz((DrawerArrowDrawable) drawableA, 12));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableA instanceof sue) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new fsz((sue) drawableA, 13));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
        sym symVar = this.g;
        if (symVar == null || symVar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new fsz(imageButtonB, 15));
        animatorSet.playTogether(valueAnimatorOfFloat3);
    }

    private static final Animator m(boolean z, View view, int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(sul.b(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(sul.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(suq.a(z, sns.b));
        return animatorSet;
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(suq.a(z, sns.b));
        return animatorSet;
    }

    public final AnimatorSet b(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.k;
        ImageButton imageButtonB = suz.b(toolbar);
        if (imageButtonB != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i(suz.b(this.g), imageButtonB), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(sul.b(imageButtonB));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(sul.c(imageButtonB));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewA = suz.a(toolbar);
        if (actionMenuViewA != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(i(suz.a(this.g), actionMenuViewA), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(sul.b(actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(h(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(sul.c(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(suq.a(z, sns.b));
        return animatorSet;
    }

    public final AnimatorSet c(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f == null) {
            animatorSet.playTogether(a(z), b(z));
        }
        Animator[] animatorArr = new Animator[10];
        TimeInterpolator timeInterpolator = z ? sns.a : sns.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(true != z ? 250L : 300L);
        valueAnimatorOfFloat.setStartDelay(true != z ? 0L : 100L);
        valueAnimatorOfFloat.setInterpolator(suq.a(z, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(sul.a(this.h));
        animatorArr[0] = valueAnimatorOfFloat;
        long j = true != z ? 250L : 300L;
        svq svqVar = this.e;
        Rect rectI = svqVar.g;
        Rect rectH = svqVar.h;
        if (rectI == null) {
            rectI = sil.i(this.a);
        }
        if (rectH == null) {
            rectH = sil.h(this.b, this.g);
        }
        final Rect rect = new Rect(rectH);
        final float fC = this.g.c();
        float[] fArr = this.b.b;
        float[] fArrI = svqVar.i();
        int i = 6;
        final float[] fArr2 = {Math.max(fArr[0], fArrI[0]), Math.max(fArr[1], fArrI[1]), Math.max(fArr[2], fArrI[2]), Math.max(fArr[3], fArrI[3]), Math.max(fArr[4], fArrI[4]), Math.max(fArr[5], fArrI[5]), Math.max(fArr[6], fArrI[6]), Math.max(fArr[7], fArrI[7])};
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new sup(rect), rectH, rectI);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: syt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                TimeInterpolator timeInterpolator2 = sns.a;
                float f2 = fC;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                Rect rect2 = rect;
                this.a.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom, fArr4);
            }
        });
        valueAnimatorOfObject.setDuration(j);
        TimeInterpolator timeInterpolator2 = sns.b;
        valueAnimatorOfObject.setInterpolator(suq.a(z, timeInterpolator2));
        animatorArr[1] = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(true != z ? 42L : 50L);
        valueAnimatorOfFloat2.setStartDelay(true != z ? 0L : 250L);
        TimeInterpolator timeInterpolator3 = sns.a;
        valueAnimatorOfFloat2.setInterpolator(suq.a(z, timeInterpolator3));
        valueAnimatorOfFloat2.addUpdateListener(sul.a(this.n));
        animatorArr[2] = valueAnimatorOfFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(true != z ? 83L : 150L);
        valueAnimatorOfFloat3.setStartDelay(true != z ? 0L : 75L);
        valueAnimatorOfFloat3.setInterpolator(suq.a(z, timeInterpolator3));
        View view = this.o;
        TouchObserverFrameLayout touchObserverFrameLayout = this.p;
        valueAnimatorOfFloat3.addUpdateListener(sul.a(view, touchObserverFrameLayout));
        animatorArr2[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(j);
        valueAnimatorOfFloat4.setInterpolator(suq.a(z, timeInterpolator2));
        valueAnimatorOfFloat4.addUpdateListener(sul.c(view));
        animatorArr2[1] = valueAnimatorOfFloat4;
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(j);
        valueAnimatorOfFloat5.setInterpolator(suq.a(z, timeInterpolator2));
        valueAnimatorOfFloat5.addUpdateListener(new sul(new suj(0), touchObserverFrameLayout));
        animatorArr2[2] = valueAnimatorOfFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        View view2 = this.i;
        animatorArr[4] = m(z, view2, g(view2), h());
        Toolbar toolbar = this.c;
        animatorArr[5] = m(z, toolbar, g(toolbar), h());
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(j);
        valueAnimatorOfFloat6.setInterpolator(suq.a(z, timeInterpolator2));
        if (this.a.q) {
            valueAnimatorOfFloat6.addUpdateListener(new suf(suz.a(toolbar), suz.a(this.k)));
        }
        animatorArr[6] = valueAnimatorOfFloat6;
        EditText editText = this.d;
        animatorArr[7] = k(z, editText);
        animatorArr[8] = k(z, this.m);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (this.g != null && !TextUtils.equals(editText.getText(), this.g.e())) {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat7.addUpdateListener(new fsz(this, 14));
            animatorSet3.playTogether(valueAnimatorOfFloat7);
        }
        if (this.g != null && TextUtils.equals(editText.getText(), this.g.e())) {
            Rect rect2 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.g.a.getWidth(), editText.getWidth());
            valueAnimatorOfInt.addUpdateListener(new gio(this, rect2, i));
            animatorSet3.playTogether(valueAnimatorOfInt);
        }
        animatorSet3.setDuration(j);
        animatorSet3.setInterpolator(suq.a(z, timeInterpolator3));
        animatorArr[9] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new syy(this, z));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(sul.c(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        l(animatorSet);
        animatorSet.setInterpolator(suq.a(z, sns.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final AnimatorSet e() {
        if (this.g != null) {
            sys sysVar = this.a;
            if (sysVar.o()) {
                sysVar.d();
            }
            AnimatorSet animatorSetC = c(false);
            animatorSetC.addListener(new syv(this));
            animatorSetC.start();
            return animatorSetC;
        }
        sys sysVar2 = this.a;
        if (sysVar2.o()) {
            sysVar2.d();
        }
        AnimatorSet animatorSetD = d(false);
        animatorSetD.addListener(new syx(this));
        animatorSetD.start();
        return animatorSetD;
    }

    public final void f(float f) {
        ActionMenuView actionMenuViewA;
        this.n.setAlpha(f);
        this.o.setAlpha(f);
        this.p.setAlpha(f);
        if (!this.a.q || (actionMenuViewA = suz.a(this.k)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f);
    }
}

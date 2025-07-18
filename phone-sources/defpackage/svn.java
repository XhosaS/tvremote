package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svn extends svh {
    private final float f;
    private final float g;

    public svn(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final Animator e() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.a;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new dup());
        return animatorSet;
    }

    public final void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorE = e();
        animatorE.setDuration(this.d);
        animatorE.start();
    }

    public final void g(float f) {
        float fA = a(f);
        View view = this.a;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f / width;
        float f3 = this.g / height;
        TimeInterpolator timeInterpolator = sns.a;
        float f4 = ((f2 + 0.0f) * fA) + 0.0f;
        float f5 = (fA * (f3 + 0.0f)) + 0.0f;
        float f6 = 1.0f - f4;
        if (Float.isNaN(f6)) {
            return;
        }
        float f7 = 1.0f - f5;
        if (Float.isNaN(f7)) {
            return;
        }
        view.setScaleX(f6);
        view.setPivotY(height);
        view.setScaleY(f7);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(f7 != 0.0f ? f6 / f7 : 1.0f);
            }
        }
    }

    public final void h(fd fdVar) {
        if (super.d(fdVar) == null) {
            return;
        }
        g(fdVar.b);
    }
}

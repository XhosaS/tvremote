package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usz implements Animator.AnimatorListener {
    final /* synthetic */ uta a;
    final /* synthetic */ LayerDrawable b;

    public usz(uta utaVar, LayerDrawable layerDrawable) {
        this.a = utaVar;
        this.b = layerDrawable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Drawable drawableA = this.a.a(this.b);
        if (drawableA != null) {
            drawableA.setVisible(false, false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

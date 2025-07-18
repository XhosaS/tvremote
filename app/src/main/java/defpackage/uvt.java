package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.tv.widgets.transition.AnimatorTransition;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvt implements Animator.AnimatorPauseListener {
    final AnimatorTransition.AnimatorTarget a;
    final Float[] b;
    final /* synthetic */ View c;
    final /* synthetic */ TransitionValues d;
    final /* synthetic */ Animator e;
    final /* synthetic */ ViewGroup f;
    final /* synthetic */ AnimatorTransition g;

    public uvt(AnimatorTransition animatorTransition, View view, TransitionValues transitionValues, Animator animator, ViewGroup viewGroup) {
        this.c = view;
        this.d = transitionValues;
        this.e = animator;
        this.f = viewGroup;
        this.g = animatorTransition;
        AnimatorTransition.AnimatorTarget animatorTarget = new AnimatorTransition.AnimatorTarget(view, transitionValues);
        this.a = animatorTarget;
        this.b = new Float[((zcg) AnimatorTransition.a).d];
        animator.setTarget(animatorTarget);
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) throws Resources.NotFoundException {
        int i = 0;
        while (true) {
            yyk yykVar = AnimatorTransition.a;
            if (i >= ((zcg) yykVar).d) {
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f.getContext(), this.g.c);
                animatorLoadAnimator.setTarget(this.c);
                animatorLoadAnimator.end();
                return;
            }
            this.b[i] = (Float) ((Property) yykVar.get(i)).get(this.c);
            i++;
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        int i = 0;
        while (true) {
            yyk yykVar = AnimatorTransition.a;
            if (i >= ((zcg) yykVar).d) {
                return;
            }
            ((Property) yykVar.get(i)).set(this.c, this.b[i]);
            i++;
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class aup extends ChangeBounds {
    final HashMap a = new HashMap();
    final SparseIntArray b = new SparseIntArray();
    final HashMap c = new HashMap();

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int iIntValue;
        Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (animatorCreateAnimator != null && transitionValues2 != null && transitionValues2.view != null) {
            View view = transitionValues2.view;
            Integer num = (Integer) this.a.get(view);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int i = this.b.get(view.getId(), -1);
                if (i != -1) {
                    iIntValue = i;
                } else {
                    Integer num2 = (Integer) this.c.get(view.getClass().getName());
                    iIntValue = num2 != null ? num2.intValue() : 0;
                }
            }
            animatorCreateAnimator.setStartDelay(iIntValue);
        }
        return animatorCreateAnimator;
    }
}

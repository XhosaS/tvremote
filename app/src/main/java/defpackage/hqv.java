package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqv {
    public static final Animator a(View view, int i, hqw hqwVar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", i, 0.0f);
        objectAnimatorOfFloat.setDuration(hqwVar.as);
        objectAnimatorOfFloat.setInterpolator(hqwVar.at);
        return objectAnimatorOfFloat;
    }
}

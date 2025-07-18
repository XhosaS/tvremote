package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hfc extends AnimatorListenerAdapter {
    final /* synthetic */ hff a;

    public hfc(hff hffVar) {
        this.a = hffVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MotionResultsFrame motionResultsFrame = this.a.b;
        motionResultsFrame.setVisibility(0);
        motionResultsFrame.k(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(4);
    }
}

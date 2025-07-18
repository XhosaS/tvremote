package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hll extends AnimatorListenerAdapter {
    final /* synthetic */ MotionResultsFrame a;

    public hll(MotionResultsFrame motionResultsFrame) {
        this.a = motionResultsFrame;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        MotionResultsFrame motionResultsFrame = this.a;
        motionResultsFrame.j.setVisibility(0);
        motionResultsFrame.j.setAlpha(0.0f);
    }
}

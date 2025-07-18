package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlk extends AnimatorListenerAdapter {
    final /* synthetic */ MotionResultsFrame a;

    public hlk(MotionResultsFrame motionResultsFrame) {
        this.a = motionResultsFrame;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.j.setVisibility(8);
    }
}

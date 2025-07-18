package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tvsearch.results.motion.MotionResultsFrame;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hlh extends AnimatorListenerAdapter {
    final /* synthetic */ MotionResultsFrame a;
    private boolean b = false;

    public hlh(MotionResultsFrame motionResultsFrame) {
        this.a = motionResultsFrame;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            return;
        }
        this.a.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        MotionResultsFrame motionResultsFrame = this.a;
        hle hleVar = motionResultsFrame.e;
        if (hleVar != null) {
            hleVar.setVisibility(0);
        }
        motionResultsFrame.l(0.0f);
    }
}

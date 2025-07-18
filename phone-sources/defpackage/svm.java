package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svm extends AnimatorListenerAdapter {
    final /* synthetic */ svn a;

    public svm(svn svnVar) {
        this.a = svnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        svn svnVar = this.a;
        svnVar.a.setTranslationY(0.0f);
        svnVar.g(0.0f);
    }
}

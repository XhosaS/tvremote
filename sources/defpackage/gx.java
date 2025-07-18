package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gx extends AnimatorListenerAdapter {
    final /* synthetic */ gz a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ ik d;

    public gx(ik ikVar, gz gzVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = ikVar;
        this.a = gzVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ik ikVar = this.d;
        gz gzVar = this.a;
        ikVar.a(gzVar.a);
        ikVar.l.remove(gzVar.a);
        ikVar.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ja jaVar = this.a.a;
    }
}

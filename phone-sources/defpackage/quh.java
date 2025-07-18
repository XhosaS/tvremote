package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class quh extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ quj b;

    public quh(quj qujVar, Drawable drawable) {
        this.a = drawable;
        this.b = qujVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        quj qujVar = this.b;
        qujVar.b.f(this.a);
        qujVar.a.setVisibility(0);
    }
}

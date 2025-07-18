package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qur extends AnimatorListenerAdapter {
    final /* synthetic */ qut a;

    public qur(qut qutVar) {
        this.a = qutVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yau yauVar;
        qut qutVar = this.a;
        if (qutVar.e.g() && (yauVar = ((qup) qutVar.e.c()).c) != null) {
            yauVar.b = false;
            Object obj = yauVar.c;
            if (obj != null) {
                ((AnimatorSet) obj).end();
            }
        }
        qutVar.a.j(null);
    }
}

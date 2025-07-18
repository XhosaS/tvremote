package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qus extends AnimatorListenerAdapter {
    final /* synthetic */ tst a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ qut c;

    public qus(qut qutVar, tst tstVar, Drawable drawable) {
        this.a = tstVar;
        this.b = drawable;
        this.c = qutVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        yau yauVar;
        qut qutVar = this.c;
        qutVar.e = this.a;
        if (qutVar.e.g() && (yauVar = ((qup) qutVar.e.c()).c) != null) {
            yauVar.b = true;
            Object obj = yauVar.c;
            if (obj != null) {
                ((AnimatorSet) obj).start();
            }
        }
        qutVar.a.j(this.b);
    }
}

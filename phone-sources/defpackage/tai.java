package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tai extends AnimatorListenerAdapter {
    final /* synthetic */ tam a;

    public tai(tam tamVar) {
        this.a = tamVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        tam tamVar = this.a;
        ViewOverlay viewOverlayK = sil.k(tamVar);
        Iterator it = tamVar.d.iterator();
        while (it.hasNext()) {
            viewOverlayK.remove((tdg) it.next());
        }
    }
}

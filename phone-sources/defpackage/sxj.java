package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxj extends AnimatorListenerAdapter {
    final /* synthetic */ sxm a;

    public sxj(sxm sxmVar) {
        this.a = sxmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        sxm sxmVar = this.a;
        List list = sxmVar.k;
        if (list == null || sxmVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gku) it.next()).c(sxmVar);
        }
    }
}

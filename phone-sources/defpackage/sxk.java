package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxk extends AnimatorListenerAdapter {
    final /* synthetic */ sxm a;

    public sxk(sxm sxmVar) {
        this.a = sxmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        sxm sxmVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        List list = sxmVar.k;
        if (list == null || sxmVar.l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gku) it.next()).b(sxmVar);
        }
    }
}

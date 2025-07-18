package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkv extends AnimatorListenerAdapter {
    final /* synthetic */ gky a;

    public gkv(gky gkyVar) {
        this.a = gkyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gky gkyVar = this.a;
        ArrayList arrayList = new ArrayList(gkyVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gku) arrayList.get(i)).b(gkyVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        gky gkyVar = this.a;
        ArrayList arrayList = new ArrayList(gkyVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gku) arrayList.get(i)).c(gkyVar);
        }
    }
}

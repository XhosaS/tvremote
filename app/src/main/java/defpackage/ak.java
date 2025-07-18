package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ak extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ en d;
    final /* synthetic */ al e;

    public ak(ViewGroup viewGroup, View view, boolean z, en enVar, al alVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = enVar;
        this.e = alVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        View view = this.b;
        ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c) {
            int i = this.d.h;
            view.getClass();
            em.b(i, view, viewGroup);
        }
        al alVar = this.e;
        alVar.a.a.f(alVar);
        if (de.S(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}

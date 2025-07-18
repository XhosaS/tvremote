package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ be d;
    final /* synthetic */ k e;

    public j(ViewGroup viewGroup, View view, boolean z, be beVar, k kVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = beVar;
        this.e = kVar;
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
            ii.Q(i, view, viewGroup);
        }
        k kVar = this.e;
        kVar.a.a.f(kVar);
        if (am.S(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}

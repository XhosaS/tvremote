package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ba extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ C0038do d;
    final /* synthetic */ bb e;

    public ba(ViewGroup viewGroup, View view, boolean z, C0038do c0038do, bb bbVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = c0038do;
        this.e = bbVar;
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
            fh.e(i, view, viewGroup);
        }
        bb bbVar = this.e;
        bbVar.a.a.f(bbVar);
        if (cr.Y(2)) {
            Objects.toString(this.d);
        }
    }
}

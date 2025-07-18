package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkp extends AnimatorListenerAdapter implements gjr {
    final /* synthetic */ gkr a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public gkp(gkr gkrVar, ViewGroup viewGroup, View view, View view2) {
        this.a = gkrVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.gjr
    public final void a(gju gjuVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.gjr
    public final void b(gju gjuVar) {
        gjuVar.G(this);
    }

    @Override // defpackage.gjr
    public final /* synthetic */ void f(gju gjuVar) {
        gli.h(this, gjuVar);
    }

    @Override // defpackage.gjr
    public final /* synthetic */ void g(gju gjuVar) {
        gli.i(this, gjuVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.c;
        if (view.getParent() == null) {
            cww.k(this.b, view);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.d;
            View view2 = this.c;
            view.setTag(R.id.save_overlay_view, view2);
            cww.k(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.gjr
    public final void c() {
    }

    @Override // defpackage.gjr
    public final void d() {
    }

    @Override // defpackage.gjr
    public final void e(gju gjuVar) {
    }
}

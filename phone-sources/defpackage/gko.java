package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gko extends AnimatorListenerAdapter implements gjr {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public gko(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            gki.d(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        gkf.a(viewGroup, z);
    }

    @Override // defpackage.gjr
    public final void b(gju gjuVar) {
        gjuVar.G(this);
    }

    @Override // defpackage.gjr
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        gki.d(this.b, this.c);
    }

    @Override // defpackage.gjr
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        gki.d(this.b, 0);
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
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            gki.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.gjr
    public final void a(gju gjuVar) {
    }

    @Override // defpackage.gjr
    public final void e(gju gjuVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

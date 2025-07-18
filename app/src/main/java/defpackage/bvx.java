package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvx extends AnimatorListenerAdapter implements buv {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public bvx(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        i(true);
    }

    private final void h() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (!this.a) {
            bvr.a.d(this.b, this.c);
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
        bvo.a(viewGroup, z);
    }

    @Override // defpackage.buv
    public final void b(bvc bvcVar) {
        bvcVar.H(this);
    }

    @Override // defpackage.buv
    public final void c() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        i(false);
        if (this.a) {
            return;
        }
        bvr.a.d(this.b, this.c);
    }

    @Override // defpackage.buv
    public final void d() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        i(true);
        if (this.a) {
            return;
        }
        bvr.a.d(this.b, 0);
    }

    @Override // defpackage.buv
    public final /* synthetic */ void f(bvc bvcVar) {
        b(bvcVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (z) {
            bvr.a.d(this.b, 0);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // defpackage.buv
    public final void a(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final void e(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final /* synthetic */ void g(bvc bvcVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}

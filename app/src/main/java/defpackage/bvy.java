package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvy extends AnimatorListenerAdapter implements buv {
    final /* synthetic */ bwa a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public bvy(bwa bwaVar, ViewGroup viewGroup, View view, View view2) {
        this.a = bwaVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.buv
    public final void a(bvc bvcVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.buv
    public final void b(bvc bvcVar) {
        bvcVar.H(this);
    }

    @Override // defpackage.buv
    public final /* synthetic */ void f(bvc bvcVar) {
        b(bvcVar);
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
            ahj.i(this.b, view);
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
            ahj.i(this.b, view2);
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

    @Override // defpackage.buv
    public final void c() {
    }

    @Override // defpackage.buv
    public final void d() {
    }

    @Override // defpackage.buv
    public final void e(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final /* synthetic */ void g(bvc bvcVar) {
    }
}

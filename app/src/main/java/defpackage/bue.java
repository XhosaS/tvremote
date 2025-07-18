package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class bue extends AnimatorListenerAdapter implements buv {
    private final View a;
    private boolean b = false;

    public bue(View view) {
        this.a = view;
    }

    @Override // defpackage.buv
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? bvr.a.a(view) : 0.0f));
    }

    @Override // defpackage.buv
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        bvr.a.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        bvr.a.c(this.a, 1.0f);
    }

    @Override // defpackage.buv
    public final void a(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final void b(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final void e(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final /* synthetic */ void f(bvc bvcVar) {
    }

    @Override // defpackage.buv
    public final void g(bvc bvcVar) {
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjj extends AnimatorListenerAdapter implements gjr {
    private final View a;
    private boolean b = false;

    public gjj(View view) {
        this.a = view;
    }

    @Override // defpackage.gjr
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? gki.a(view) : 0.0f));
    }

    @Override // defpackage.gjr
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.gjr
    public final /* synthetic */ void f(gju gjuVar) {
        gli.h(this, gjuVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        gki.c(this.a, 1.0f);
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
        gki.c(this.a, 1.0f);
    }

    @Override // defpackage.gjr
    public final void a(gju gjuVar) {
    }

    @Override // defpackage.gjr
    public final void b(gju gjuVar) {
    }

    @Override // defpackage.gjr
    public final void e(gju gjuVar) {
    }

    @Override // defpackage.gjr
    public final void g(gju gjuVar) {
    }
}

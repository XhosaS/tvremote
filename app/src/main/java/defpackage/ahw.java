package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahw {
    public final WeakReference a;

    public ahw(View view) {
        this.a = new WeakReference(view);
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(ahx ahxVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (ahxVar != null) {
                view.animate().setListener(new ahv(ahxVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(final hp hpVar) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(hpVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ahu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ((View) hpVar.a.c.getParent()).invalidate();
                }
            } : null);
        }
    }

    public final void f(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}

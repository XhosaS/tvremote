package defpackage;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqp extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ pqw a;

    public pqp(pqw pqwVar) {
        this.a = pqwVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) throws Resources.NotFoundException {
        pqw pqwVar = this.a;
        if (!pqwVar.y) {
            return false;
        }
        if (!pqwVar.u) {
            pqwVar.u = true;
            pqwVar.v = new LinearInterpolator();
            pqwVar.w = pqwVar.c(pqwVar.v);
            Animator animator = pqwVar.p;
            if (animator != null) {
                animator.cancel();
            }
            pqwVar.I.bH();
        }
        pqwVar.s = ocv.bC(motionEvent2.getX(), motionEvent2.getY(), motionEvent.getX(), motionEvent.getY());
        float fMin = Math.min(1.0f, pqwVar.s / pqwVar.getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_max_transition_distance));
        pqwVar.t = fMin;
        float interpolation = pqwVar.v.getInterpolation(fMin);
        float f3 = 1.0f - interpolation;
        Rect rect = pqwVar.a;
        pra praVar = pqwVar.e;
        float fExactCenterX = (rect.exactCenterX() - praVar.h) * interpolation;
        float fExactCenterY = interpolation * (rect.exactCenterY() - praVar.i);
        praVar.setScale(f3);
        int i = (int) (255.0f * f3);
        praVar.setAlpha(i);
        praVar.setTranslationX(fExactCenterX);
        praVar.setTranslationY(fExactCenterY);
        pqy pqyVar = pqwVar.f;
        pqyVar.setAlpha(i);
        pqyVar.setScale(f3);
        if (pqwVar.q()) {
            pqwVar.o.setElevation(f3 * pqwVar.g.getElevation());
        }
        pqwVar.H.setAlpha(1.0f - pqwVar.w.getInterpolation(pqwVar.t));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        pqw pqwVar = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (pqwVar.B != null && pqwVar.E.isTouchExplorationEnabled() && pqwVar.B.c == 5) {
            pqwVar.d(0);
            return true;
        }
        if (!pqwVar.z) {
            return true;
        }
        if (pqwVar.o(x, y) && pqwVar.e.e(x, y)) {
            return true;
        }
        pqwVar.d(0);
        return true;
    }
}

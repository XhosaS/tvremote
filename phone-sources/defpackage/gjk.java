package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjk extends gkr {
    public gjk() {
    }

    private static float Q(gke gkeVar, float f) {
        Float f2;
        return (gkeVar == null || (f2 = (Float) gkeVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator R(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        gki.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) gki.b, f2);
        gjj gjjVar = new gjj(view);
        objectAnimatorOfFloat.addListener(gjjVar);
        j().C(gjjVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.gkr, defpackage.gju
    public final void c(gke gkeVar) {
        gkr.P(gkeVar);
        Float fValueOf = (Float) gkeVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = gkeVar.b.getVisibility() == 0 ? Float.valueOf(gki.a(gkeVar.b)) : Float.valueOf(0.0f);
        }
        gkeVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.gju
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gkr
    public final Animator f(View view, gke gkeVar) {
        gkj gkjVar = gki.a;
        return R(view, Q(gkeVar, 0.0f), 1.0f);
    }

    @Override // defpackage.gkr
    public final Animator g(View view, gke gkeVar, gke gkeVar2) {
        gkj gkjVar = gki.a;
        Animator animatorR = R(view, Q(gkeVar, 1.0f), 0.0f);
        if (animatorR == null) {
            gki.c(view, Q(gkeVar2, 1.0f));
        }
        return animatorR;
    }

    public gjk(int i) {
        this.v = i;
    }
}

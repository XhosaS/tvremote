package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class buf extends bwa {
    public buf() {
    }

    private static float O(bvl bvlVar, float f) {
        Float f2;
        return (bvlVar == null || (f2 = (Float) bvlVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bvr.a.c(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) bvr.b, f2);
        bue bueVar = new bue(view);
        objectAnimatorOfFloat.addListener(bueVar);
        j().F(bueVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.bwa, defpackage.bvc
    public final void c(bvl bvlVar) {
        super.N(bvlVar);
        Float fValueOf = (Float) bvlVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (bvlVar.b.getVisibility() == 0) {
                fValueOf = Float.valueOf(bvr.a.a(bvlVar.b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        bvlVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.bvc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bwa
    public final Animator f(View view, bvl bvlVar) {
        bvs bvsVar = bvr.a;
        return P(view, O(bvlVar, 0.0f), 1.0f);
    }

    @Override // defpackage.bwa
    public final Animator g(View view, bvl bvlVar, bvl bvlVar2) {
        bvs bvsVar = bvr.a;
        Animator animatorP = P(view, O(bvlVar, 1.0f), 0.0f);
        if (animatorP == null) {
            bvr.a.c(view, O(bvlVar2, 1.0f));
        }
        return animatorP;
    }

    public buf(int i) {
        this.u = i;
    }
}

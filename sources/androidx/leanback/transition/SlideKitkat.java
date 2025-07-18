package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.google.android.tv.remote.service.R;
import defpackage.ux;
import defpackage.ve;
import defpackage.vf;
import defpackage.vg;
import defpackage.vh;
import defpackage.vi;
import defpackage.vj;
import defpackage.vk;
import defpackage.vn;

/* compiled from: PG */
/* loaded from: classes.dex */
class SlideKitkat extends Visibility {
    private static final TimeInterpolator a = new DecelerateInterpolator();
    private static final TimeInterpolator b = new AccelerateInterpolator();
    private static final vk c = new ve();
    private static final vk d = new vf();
    private static final vk e = new vg();
    private static final vk f = new vh();
    private static final vk g = new vi();
    private static final vk h = new vj();
    private vk i;

    public SlideKitkat() {
        a(80);
    }

    private static final Animator b(View view, Property property, float f2, float f3, float f4, TimeInterpolator timeInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f2 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2, f3);
        vn vnVar = new vn(view, property, f4, f3, i);
        objectAnimatorOfFloat.addListener(vnVar);
        objectAnimatorOfFloat.addPauseListener(vnVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    public final void a(int i) {
        vk vkVar;
        if (i == 3) {
            vkVar = c;
        } else if (i == 5) {
            vkVar = e;
        } else if (i == 48) {
            vkVar = d;
        } else if (i == 80) {
            vkVar = f;
        } else if (i == 8388611) {
            vkVar = g;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            vkVar = h;
        }
        this.i = vkVar;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.i.b(view);
        return b(view, this.i.c(), this.i.a(view), fB, fB, a, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.i.b(view);
        return b(view, this.i.c(), fB, this.i.a(view), fB, b, 4);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ux.g);
        a(typedArrayObtainStyledAttributes.getInt(3, 80));
        long j = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

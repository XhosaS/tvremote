package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class bz {
    static bx a(Context context, bq bqVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int iDW;
        boolean z3;
        bn bnVar = bqVar.U;
        int iB = 0;
        int i = bnVar == null ? 0 : bnVar.f;
        if (z2) {
            if (z) {
                iDW = bqVar.dX();
                z3 = true;
            } else {
                iDW = bqVar.dY();
                z3 = false;
            }
        } else if (z) {
            iDW = bqVar.dV();
            z3 = true;
        } else {
            iDW = bqVar.dW();
            z3 = false;
        }
        boolean z4 = z3;
        bqVar.ad(0, 0, 0, 0);
        ViewGroup viewGroup = bqVar.Q;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            bqVar.Q.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = bqVar.Q;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        bqVar.av(i, iDW);
        Animator animatorAs = bqVar.as(i, iDW);
        if (animatorAs != null) {
            return new bx(animatorAs);
        }
        if (iDW != 0) {
            iB = iDW;
        } else if (i != 0) {
            iB = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z4 ? b(context, android.R.attr.activityOpenEnterAnimation) : b(context, android.R.attr.activityOpenExitAnimation) : true != z3 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z4 ? b(context, android.R.attr.activityCloseEnterAnimation) : b(context, android.R.attr.activityCloseExitAnimation) : true != z3 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z3 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new bx(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new bx(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new bx(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}

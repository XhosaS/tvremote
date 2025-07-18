package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snw {
    private final ko a = new ko();
    private final ko b = new ko();

    public static snw b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static snw c(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return h(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return h(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(i))), e);
            return null;
        }
    }

    private static snw h(List list) {
        snw snwVar = new snw();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            snwVar.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            snx snxVar = new snx(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            snxVar.a = objectAnimator.getRepeatCount();
            snxVar.b = objectAnimator.getRepeatMode();
            snwVar.a.put(propertyName, snxVar);
        }
        return snwVar;
    }

    public final ObjectAnimator a(String str, Object obj, Property property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        d(str).b(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final snx d(String str) {
        ko koVar = this.a;
        if (koVar.get(str) != null) {
            return (snx) koVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof snw) {
            return this.a.equals(((snw) obj).a);
        }
        return false;
    }

    public final boolean f(String str) {
        return this.b.get(str) != null;
    }

    public final PropertyValuesHolder[] g(String str) {
        if (!f(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}

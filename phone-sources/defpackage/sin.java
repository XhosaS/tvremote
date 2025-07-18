package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TintTypedArray;
import android.util.TypedValue;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sin {
    public sin() {
    }

    public static void a(soo sooVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        sooVar.setBounds(rect);
        sooVar.i(view, null);
    }

    public static void b(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    public static Typeface d(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, cmq.l(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int f(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int g(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static ColorStateList h(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static ColorStateList i(Context context, TintTypedArray tintTypedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!tintTypedArray.hasValue(i) || (resourceId = tintTypedArray.getResourceId(i, 0)) == 0 || (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i) : colorStateList;
    }

    public static Drawable j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawable;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawable = AppCompatResources.getDrawable(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawable;
    }

    public static boolean k(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static syh m(Context context, TypedArray typedArray) {
        int resourceId;
        if (!typedArray.hasValue(0) || (resourceId = typedArray.getResourceId(0, 0)) == 0) {
            return null;
        }
        return new syh(context, resourceId);
    }

    public static int n(Context context, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, sye.a);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static boolean o(ulp ulpVar) {
        return "true".equals(sjj.a("debug.social", "true")) && "true".equals(sjj.a((String) ulpVar.a, "true"));
    }

    public sin(byte[] bArr) {
    }

    public sin(byte[] bArr, byte[] bArr2) {
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public void c(taa taaVar, float f, float f2) {
    }
}

package defpackage;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class xo {
    public xo() {
    }

    public static void a(Activity activity) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new xp());
    }

    public static xx b(xz xzVar) {
        return xzVar.a();
    }

    public static xx c(xz xzVar) {
        return xzVar.b();
    }

    public static void d(View view, abk abkVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, abkVar);
    }

    public static ColorStateList f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = nf.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static int g(Context context, int i, int i2) {
        TypedValue typedValueH = h(context, i);
        return (typedValueH == null || typedValueH.type != 16) ? i2 : typedValueH.data;
    }

    public static TypedValue h(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean i(Context context, int i, boolean z) {
        TypedValue typedValueH = h(context, i);
        return (typedValueH == null || typedValueH.type != 18) ? z : typedValueH.data != 0;
    }

    public static TimeInterpolator j(Context context, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.motionEasingEmphasizedInterpolator, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m(strValueOf, "cubic-bezier") && !m(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = l(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return new PathInterpolator(k(strArrSplit, 0), k(strArrSplit, 1), k(strArrSplit, 2), k(strArrSplit, 3));
            }
            throw new IllegalArgumentException(b.e(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!m(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String strL = l(strValueOf, "path");
        Path path = new Path();
        try {
            mo.M(mo.N(strL), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(strL)), e);
        }
    }

    private static float k(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String l(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean m(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public xo(char[] cArr) {
    }

    public void e(bkr bkrVar, float f, float f2) {
    }
}

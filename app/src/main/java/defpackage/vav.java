package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vav {
    public static TimeInterpolator a(Context context, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.motionEasingEmphasizedInterpolator, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!d(strValueOf, "cubic-bezier") && !d(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (d(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = c(strValueOf, "cubic-bezier").split(",");
            int length = strArrSplit.length;
            if (length == 4) {
                return new PathInterpolator(b(strArrSplit, 0), b(strArrSplit, 1), b(strArrSplit, 2), b(strArrSplit, 3));
            }
            throw new IllegalArgumentException(a.b(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!d(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String strC = c(strValueOf, "path");
        Path path = new Path();
        try {
            acv.a(acv.b(strC), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(strC)), e);
        }
    }

    private static float b(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String c(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean d(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }
}

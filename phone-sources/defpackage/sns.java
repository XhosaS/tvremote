package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sns {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new dup();
    public static final TimeInterpolator c = new duo();
    public static final TimeInterpolator d = new duq();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}

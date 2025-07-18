package defpackage;

import android.R;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ted {
    public static Interpolator a;
    public static Interpolator b;
    private static Interpolator c;

    public static Interpolator a(Context context) {
        if (c == null) {
            c = AnimationUtils.loadInterpolator(context.getApplicationContext(), R.interpolator.fast_out_slow_in);
        }
        return c;
    }
}

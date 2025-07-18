package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hex {
    public final int a;
    public final int b;
    public final Interpolator c;
    public final Interpolator d;
    public final int e;
    public AnimatorSet f;

    public hex(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getInteger(R.integer.search_bar_text_fade_in_duration_ms);
        this.c = AnimationUtils.loadInterpolator(context, R.anim.alpha_curve);
        this.d = AnimationUtils.loadInterpolator(context, R.anim.slide_up);
        this.b = resources.getInteger(R.integer.search_bar_text_fade_out_duration_ms);
        this.e = resources.getDimensionPixelSize(R.dimen.opa_warning_height);
    }
}

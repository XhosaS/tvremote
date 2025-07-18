package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Interpolator f;
    public final ColorStateList g;
    public final int h;
    public final int i;
    public final int j;

    public hzr(Resources resources, Context context) throws Resources.NotFoundException {
        resources.getClass();
        context.getClass();
        this.a = resources.getColor(R.color.suggestion_chip_bg_flash_color, null);
        this.b = resources.getInteger(R.integer.suggest_flash_in_duration_ms);
        this.c = resources.getInteger(R.integer.suggest_flash_out_duration_ms);
        this.d = resources.getColor(R.color.G900, null);
        this.e = resources.getColor(R.color.suggestion_chip_bg_focused_color, null);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.press_curve);
        interpolatorLoadInterpolator.getClass();
        this.f = interpolatorLoadInterpolator;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(context.getColor(R.color.pressed_foreground_ripple_color));
        colorStateListValueOf.getClass();
        this.g = colorStateListValueOf;
        this.h = (int) resources.getDimension(R.dimen.pressed_foreground_ripple_radius);
        this.i = resources.getColor(R.color.G200, null);
        this.j = resources.getColor(R.color.suggestion_chip_bg_color, null);
    }
}

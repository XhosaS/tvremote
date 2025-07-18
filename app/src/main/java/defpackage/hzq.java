package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Interpolator e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    private final int q;

    public hzq(Resources resources, Context context) throws Resources.NotFoundException {
        resources.getClass();
        context.getClass();
        this.a = resources.getColor(R.color.G900, null);
        this.b = resources.getColor(R.color.suggestion_chip_bg_focused_color, null);
        int dimension = (int) resources.getDimension(R.dimen.suggestion_chip_height);
        this.q = dimension;
        this.c = resources.getInteger(R.integer.suggest_focus_in_duration_ms);
        this.d = resources.getInteger(R.integer.suggest_focus_out_duration_ms);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.standard_curve);
        interpolatorLoadInterpolator.getClass();
        this.e = interpolatorLoadInterpolator;
        this.f = resources.getDimensionPixelSize(R.dimen.suggestion_chip_start_padding);
        this.g = resources.getColor(R.color.G200, null);
        this.h = resources.getColor(R.color.suggestion_chip_bg_color, null);
        int dimension2 = (int) resources.getDimension(R.dimen.suggestion_chip_unfocused_height);
        this.i = dimension2;
        int dimension3 = (int) resources.getDimension(R.dimen.suggestion_chip_margin);
        this.j = dimension3;
        float dimension4 = resources.getDimension(R.dimen.s3v3_text_size);
        this.k = dimension4;
        int i = dimension - dimension2;
        this.l = i;
        this.m = i / 2;
        this.n = dimension3 + dimension3 + i;
        this.o = resources.getDimension(R.dimen.s3v3_icon_size) / dimension4;
        this.p = dimension2 + dimension3 + dimension3;
    }
}

package defpackage;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.view.ViewOutlineProvider;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpe {
    final ArgbEvaluator a = new ArgbEvaluator();
    final ViewOutlineProvider b;
    final float c;
    final int d;
    final int e;
    final int f;
    final int g;

    public hpe(Resources resources) throws Resources.NotFoundException {
        this.c = resources.getFraction(R.fraction.lb_focus_zoom_factor_medium, 1, 1);
        resources.getDimensionPixelSize(R.dimen.carousel_item_image_constant_height);
        this.d = resources.getInteger(R.integer.search_item_focus_transition_duration_ms);
        this.e = resources.getColor(R.color.G50, null);
        this.f = resources.getColor(R.color.G400, null);
        this.g = resources.getColor(R.color.G600, null);
        this.b = new hpd(resources.getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
    }
}

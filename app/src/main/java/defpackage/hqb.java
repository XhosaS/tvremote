package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqb {
    public final LayoutInflater a;
    public final wke b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public hqb(Resources resources, wke wkeVar, LayoutInflater layoutInflater) {
        this.b = wkeVar;
        this.a = layoutInflater;
        this.c = (int) resources.getDimension(R.dimen.space_white);
        this.d = (int) resources.getDimension(R.dimen.space_light_yellow);
        this.e = (int) resources.getDimension(R.dimen.space_salmon);
        this.f = (int) resources.getDimension(R.dimen.space_light_blue);
        int dimension = (int) resources.getDimension(R.dimen.badge_b4_icon_height);
        this.g = dimension;
        int dimension2 = (int) resources.getDimension(R.dimen.badge_b4_layout_height);
        this.h = dimension2;
        this.i = (int) resources.getDimension(R.dimen.badge_center_image_layout_height);
        this.j = (dimension2 - dimension) / 2;
        this.k = (int) resources.getDimension(R.dimen.badge_b4_bubble_corner_radius);
        this.l = (int) resources.getDimension(R.dimen.badge_b4_bubble_width_padding);
        this.m = (int) resources.getDimension(R.dimen.badge_item_bottom_guard_height);
        this.n = resources.getColor(R.color.G900, null);
        this.o = resources.getColor(R.color.G900p00, null);
    }
}

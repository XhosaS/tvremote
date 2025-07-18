package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmb extends mvr {
    private final Context a;
    private final Resources c;
    private final ViewGroup d;

    public mmb(Context context, ViewGroup viewGroup) {
        super(context);
        this.d = viewGroup;
        this.a = context;
        this.c = context.getResources();
    }

    static int c(Resources resources) throws Resources.NotFoundException {
        float f = resources.getDisplayMetrics().density * resources.getConfiguration().screenWidthDp;
        float integer = resources.getInteger(R.integer.asset_details_screenshot_height_in_16ths_of_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_search_toolbar_height);
        float f2 = resources.getDisplayMetrics().density;
        return Math.max((int) ((f / 16.0f) * integer), (((dimensionPixelSize + ((int) (f2 + f2))) * 3) / 2) + resources.getDimensionPixelSize(R.dimen.movie_details_info_panel_margin_top) + resources.getDimensionPixelSize(R.dimen.play_collection_card_half_spacing) + resources.getDimensionPixelSize(R.dimen.play_header_list_banner_height));
    }

    public static int g(Resources resources) {
        return ((c(resources) - resources.getDimensionPixelSize(R.dimen.movie_details_info_panel_margin_top)) - resources.getDimensionPixelSize(R.dimen.play_collection_card_half_spacing)) - resources.getDimensionPixelSize(R.dimen.play_header_list_banner_height);
    }

    @Override // defpackage.mvr
    public final int a() {
        int iG = g(this.c);
        return (iG + iG) / 3;
    }

    @Override // defpackage.mvr
    public final int b() {
        return 2;
    }

    @Override // defpackage.mvr
    public final int d() {
        return 0;
    }

    @Override // defpackage.mvr
    public final int e() {
        return -16777216;
    }

    @Override // defpackage.mvr
    public final int f(Context context) {
        return mjo.q(context);
    }

    @Override // defpackage.mvr
    public final Toolbar h(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        PlaySearchToolbar playSearchToolbar = (PlaySearchToolbar) layoutInflater.inflate(R.layout.movies_search_toolbar, viewGroup, false);
        Context context = this.a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.play_collection_edge_padding_minus_card_half_spacing);
        playSearchToolbar.b = (PlaySearch) LayoutInflater.from(playSearchToolbar.getContext()).inflate(R.layout.movies_search, (ViewGroup) playSearchToolbar, false);
        playSearchToolbar.j = new Toolbar.LayoutParams(-1, -2, 17);
        PlaySearch playSearch = playSearchToolbar.b;
        int i = playSearchToolbar.h;
        playSearch.f = dimensionPixelSize;
        playSearch.h = i;
        playSearch.g = dimensionPixelSize;
        playSearch.requestLayout();
        playSearchToolbar.b.j(new mwa());
        playSearchToolbar.b.k();
        playSearchToolbar.b.l();
        playSearchToolbar.b.g(1);
        playSearchToolbar.b.i();
        playSearchToolbar.b.a = new thf(playSearchToolbar, 1);
        playSearchToolbar.e = playSearchToolbar.getBackground();
        playSearchToolbar.c = (PlaySearch) LayoutInflater.from(context).inflate(R.layout.movies_search, (ViewGroup) playSearchToolbar, false);
        playSearchToolbar.c.j(new mwa());
        playSearchToolbar.c.k();
        playSearchToolbar.c.l();
        playSearchToolbar.c.g(2);
        playSearchToolbar.c.i();
        playSearchToolbar.c.a = new thf(playSearchToolbar, 0);
        PlaySearch playSearch2 = playSearchToolbar.b;
        if (playSearch2.b.c == 2) {
            return playSearchToolbar;
        }
        if (playSearch2.getParent() == playSearchToolbar) {
            playSearchToolbar.b.i();
            playSearchToolbar.removeView(playSearchToolbar.b);
        }
        playSearchToolbar.b();
        return playSearchToolbar;
    }

    @Override // defpackage.mvr
    public final boolean j() {
        return true;
    }

    @Override // defpackage.mvr
    public final boolean k() {
        return true;
    }

    @Override // defpackage.mvr
    public final void l(ViewGroup viewGroup) {
        Resources resources = this.c;
        ViewGroup viewGroup2 = this.d;
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        layoutParams.height = c(resources) + resources.getDimensionPixelSize(R.dimen.movie_details_screenshot_overlapped_height);
        viewGroup.addView(viewGroup2, layoutParams);
    }

    @Override // defpackage.mvr
    public final void i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }
}

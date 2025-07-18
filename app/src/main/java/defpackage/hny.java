package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hny {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/searchentity/EntityForegroundImageHolder");
    protected final Resources b;
    protected hoh c;
    protected final View d;
    public final ImageDownloadView e;
    public final hmb f;
    int g;
    private final hmc h;

    public hny(ViewGroup viewGroup, hmb hmbVar, hmc hmcVar) {
        this.f = hmbVar;
        this.h = hmcVar;
        this.b = viewGroup.getResources();
        this.d = viewGroup.findViewById(R.id.entity_detail_description);
        LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup, true);
        this.e = (ImageDownloadView) viewGroup.findViewById(R.id.foreground_image);
        this.g = 1;
    }

    public abstract int a();

    public void b(BitmapDrawable bitmapDrawable) {
        if (this.c.w()) {
            return;
        }
        e(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
    }

    public void c() {
        int i = true != this.c.g ? R.drawable.ic_search_default : R.drawable.ic_card_noface;
        ImageDownloadView imageDownloadView = this.e;
        imageDownloadView.setImageResource(i);
        imageDownloadView.setVisibility(0);
        this.g = 3;
        g();
    }

    public void e(int i, int i2) {
        hmc hmcVar = this.h;
        boolean zB = hmcVar.B();
        ImageDownloadView imageDownloadView = this.e;
        ViewGroup.LayoutParams layoutParams = imageDownloadView.getLayoutParams();
        boolean z = false;
        if (zB && !hmcVar.A()) {
            z = true;
        }
        f(z, i / i2, layoutParams);
        imageDownloadView.setLayoutParams(layoutParams);
    }

    public final void f(boolean z, float f, ViewGroup.LayoutParams layoutParams) {
        if (z) {
            if (f > 1.555f) {
                Resources resources = this.b;
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.details_fg_compact_height);
                layoutParams.width = resources.getDimensionPixelSize(R.dimen.details_fg_16_9_compact_width);
                return;
            } else if (f > 1.167f) {
                Resources resources2 = this.b;
                layoutParams.height = resources2.getDimensionPixelSize(R.dimen.details_fg_fullscreen_height);
                layoutParams.width = resources2.getDimensionPixelSize(R.dimen.details_fg_4_3_fullscreen_width);
                return;
            } else if (f > 0.833f) {
                Resources resources3 = this.b;
                layoutParams.height = resources3.getDimensionPixelSize(R.dimen.details_fg_fullscreen_height);
                layoutParams.width = resources3.getDimensionPixelSize(R.dimen.details_fg_fullscreen_height);
                return;
            } else {
                Resources resources4 = this.b;
                layoutParams.height = resources4.getDimensionPixelSize(R.dimen.details_fg_2_3_fullscreen_height);
                layoutParams.width = resources4.getDimensionPixelSize(R.dimen.details_fg_2_3_fullscreen_width);
                return;
            }
        }
        if (f > 1.555f) {
            Resources resources5 = this.b;
            layoutParams.height = resources5.getDimensionPixelSize(R.dimen.details_fg_compact_height);
            layoutParams.width = resources5.getDimensionPixelSize(R.dimen.details_fg_16_9_compact_width);
        } else if (f > 1.167f) {
            Resources resources6 = this.b;
            layoutParams.height = resources6.getDimensionPixelSize(R.dimen.details_fg_compact_height);
            layoutParams.width = resources6.getDimensionPixelSize(R.dimen.details_fg_4_3_compact_width);
        } else if (f > 0.833f) {
            Resources resources7 = this.b;
            layoutParams.height = resources7.getDimensionPixelSize(R.dimen.details_fg_compact_height);
            layoutParams.width = resources7.getDimensionPixelSize(R.dimen.details_fg_compact_height);
        } else {
            Resources resources8 = this.b;
            layoutParams.height = resources8.getDimensionPixelSize(R.dimen.details_fg_2_3_compact_height);
            layoutParams.width = resources8.getDimensionPixelSize(R.dimen.details_fg_2_3_compact_width);
        }
    }

    protected void g() {
        throw null;
    }

    protected final boolean h() {
        if (this.g == 3) {
            return false;
        }
        return (this.c.j() == null || this.c.e() == null || this.c.l() == null) ? false : true;
    }

    public void d() {
    }
}

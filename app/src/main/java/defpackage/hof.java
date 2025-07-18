package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hof extends hny {
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final Interpolator m;
    public final View n;
    public final View o;
    private final TextView p;

    public hof(ViewGroup viewGroup, hmb hmbVar, hmc hmcVar) throws Resources.NotFoundException {
        super(viewGroup, hmbVar, hmcVar);
        this.k = this.b.getInteger(R.integer.suggest_flash_in_duration_ms);
        this.l = this.b.getInteger(R.integer.suggest_flash_out_duration_ms);
        this.h = this.b.getColor(R.color.G800, null);
        this.i = this.b.getColor(R.color.G700, null);
        this.j = this.b.getColor(R.color.G400, null);
        this.m = AnimationUtils.loadInterpolator(viewGroup.getContext(), R.anim.press_curve);
        View viewFindViewById = viewGroup.findViewById(R.id.foreground_image_attribution_button);
        this.n = viewFindViewById;
        this.p = (TextView) viewFindViewById.findViewById(R.id.attribution_text);
        this.o = viewGroup.findViewById(R.id.foreground_image_attribution_container);
        this.e.setOutlineProvider(new hoc(this.b.getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius)));
        this.e.setClipToOutline(true);
    }

    @Override // defpackage.hny
    public final int a() {
        return R.layout.entity_image_watson;
    }

    @Override // defpackage.hny
    public final void c() {
        super.c();
        this.o.setVisibility(4);
    }

    @Override // defpackage.hny
    public final void d() {
        this.o.setVisibility(4);
    }

    @Override // defpackage.hny
    protected final void g() throws Resources.NotFoundException {
        if (!h()) {
            this.p.setText("");
            ImageDownloadView imageDownloadView = this.e;
            imageDownloadView.setForeground(null);
            imageDownloadView.setOnClickListener(null);
            imageDownloadView.setClickable(false);
            imageDownloadView.setOnFocusChangeListener(null);
            imageDownloadView.setFocusable(false);
            this.o.setVisibility(4);
            return;
        }
        TextView textView = this.p;
        textView.setText(this.c.l());
        Resources resources = this.b;
        Drawable drawable = resources.getDrawable(R.drawable.open_in_new_24px_g50, null);
        if (drawable != null) {
            int textSize = (int) textView.getTextSize();
            drawable.setBounds(0, 0, textSize, textSize);
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
        }
        ImageDownloadView imageDownloadView2 = this.e;
        imageDownloadView2.setOnClickListener(new hnu(this, this.c.e(), this.c.j()));
        imageDownloadView2.setOnFocusChangeListener(new hoe(this));
        imageDownloadView2.setFocusable(true);
        imageDownloadView2.setContentDescription(resources.getString(R.string.entity_foreground_image_attribution_content_description, this.c.i()));
        ahj.n(imageDownloadView2, new hnx(this));
    }
}

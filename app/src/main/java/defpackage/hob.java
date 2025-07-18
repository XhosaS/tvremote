package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hob extends hny {
    private final View h;
    private final View i;

    public hob(ViewGroup viewGroup, hmb hmbVar, hmc hmcVar) {
        super(viewGroup, hmbVar, hmcVar);
        View viewFindViewById = viewGroup.findViewById(R.id.foreground_image_border);
        this.h = viewFindViewById;
        this.i = viewGroup.findViewById(R.id.foreground_image_container);
        hnz hnzVar = new hnz(this.b.getDimensionPixelSize(R.dimen.entity_details_image_radius));
        this.e.setOutlineProvider(hnzVar);
        viewFindViewById.setOutlineProvider(hnzVar);
        this.e.setClipToOutline(true);
        viewFindViewById.setClipToOutline(true);
    }

    @Override // defpackage.hny
    public final int a() {
        return R.layout.entity_image_amati;
    }

    @Override // defpackage.hny
    public final void b(BitmapDrawable bitmapDrawable) throws Resources.NotFoundException {
        ImageDownloadView imageDownloadView = this.e;
        ViewGroup.LayoutParams layoutParams = imageDownloadView.getLayoutParams();
        if (layoutParams.height <= layoutParams.width || !this.c.g) {
            if (this.c.w()) {
                return;
            }
            e(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
            return;
        }
        int dimensionPixelSize = this.b.getDimensionPixelSize(R.dimen.details_fg_facial_circle_diameter);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageDownloadView.setLayoutParams(layoutParams);
        i(layoutParams);
        Bitmap bitmap = bitmapDrawable.getBitmap();
        int width = bitmap.getWidth();
        imageDownloadView.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, width));
        hoa hoaVar = new hoa(dimensionPixelSize);
        imageDownloadView.setOutlineProvider(hoaVar);
        this.h.setOutlineProvider(hoaVar);
    }

    @Override // defpackage.hny
    public final void e(int i, int i2) {
        super.e(i, i2);
        i(this.e.getLayoutParams());
    }

    @Override // defpackage.hny
    protected final void g() {
        if (!h()) {
            this.h.setVisibility(4);
            View view = this.i;
            view.setFocusable(false);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        this.h.setVisibility(0);
        View view2 = this.i;
        view2.setFocusable(true);
        view2.setOnClickListener(new hnu(this, this.c.e(), this.c.j()));
        view2.setContentDescription(this.b.getString(R.string.entity_foreground_image_attribution_content_description, this.c.i()));
        ahj.n(view2, new hnx(this));
    }

    final void i(ViewGroup.LayoutParams layoutParams) {
        View view = this.h;
        view.getLayoutParams().width = layoutParams.width;
        view.getLayoutParams().height = layoutParams.height;
        view.requestLayout();
    }
}

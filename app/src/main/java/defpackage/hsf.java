package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hsf extends dpa {
    final /* synthetic */ ImageView c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsf(ImageView imageView, ImageView imageView2, int i) {
        super(imageView);
        this.c = imageView2;
        this.d = i;
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void a(Drawable drawable) {
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpb, defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        Drawable drawable = (Drawable) obj;
        super.b(drawable, dpmVar);
        ImageView imageView = this.c;
        imageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = this.d;
        layoutParams.height = i;
        imageView.getLayoutParams().width = (int) ((i / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(drawable);
    }
}

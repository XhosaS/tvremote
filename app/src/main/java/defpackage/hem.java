package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hem extends dpa {
    final /* synthetic */ int c;
    final /* synthetic */ hen d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hem(hen henVar, ImageView imageView, int i) {
        super(imageView);
        this.c = i;
        this.d = henVar;
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void a(Drawable drawable) {
        int i = hen.y;
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpb, defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        super.b((Drawable) obj, dpmVar);
        ImageView imageView = this.d.s;
        imageView.setVisibility(0);
        float width = ((BitmapDrawable) imageView.getDrawable()).getBitmap().getWidth();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        float height = ((BitmapDrawable) imageView.getDrawable()).getBitmap().getHeight();
        int i = this.c;
        layoutParams.height = (int) ((i / width) * height);
        imageView.getLayoutParams().width = i;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}

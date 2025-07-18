package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpo extends dpa {
    final /* synthetic */ ImageDownloadView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpo(ImageDownloadView imageDownloadView, ImageView imageView) {
        super(imageView);
        this.c = imageDownloadView;
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void a(Drawable drawable) {
        ((zdv) ((zdv) ImageDownloadView.a.d()).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageDownloadView$1", "onLoadFailed", 57, "ImageDownloadView.java")).u("ImageManager future returned failure.");
        jpn jpnVar = this.c.d;
        if (jpnVar != null) {
            jpnVar.a(new IllegalStateException("ImageManager load failed."));
        }
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpb, defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        super.b((Drawable) obj, dpmVar);
        jpn jpnVar = this.c.d;
        if (jpnVar != null) {
            jpnVar.b();
        }
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void c(Drawable drawable) {
        ImageDownloadView imageDownloadView = this.c;
        imageDownloadView.a();
        imageDownloadView.setImageDrawable(null);
        super.c(drawable);
    }
}

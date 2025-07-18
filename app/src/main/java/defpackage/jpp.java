package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jpp extends dpa {
    final /* synthetic */ ImageFitDownloadView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpp(ImageFitDownloadView imageFitDownloadView, ImageView imageView) {
        super(imageView);
        this.c = imageFitDownloadView;
    }

    @Override // defpackage.dpb, defpackage.dov, defpackage.dpf
    public final void a(Drawable drawable) {
        ((zdv) ((zdv) ImageFitDownloadView.a.d()).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView$1", "onLoadFailed", 144, "ImageFitDownloadView.java")).u("ImageManager future returned failure.");
        jpn jpnVar = this.c.f;
        if (jpnVar != null) {
            jpnVar.a(new Exception("onLoadFailed"));
        }
        i(null);
        super.j(null);
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dpb, defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        int intrinsicHeight;
        int intrinsicHeight2;
        Drawable drawable = (Drawable) obj;
        int intrinsicHeight3 = drawable.getIntrinsicHeight();
        ImageFitDownloadView imageFitDownloadView = this.c;
        if (intrinsicHeight3 <= 0 || drawable.getIntrinsicWidth() <= 0) {
            ((zdv) ((zdv) ImageFitDownloadView.a.d()).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView", "onDownloadSuccess", 163, "ImageFitDownloadView.java")).u("Invalid drawable dimensions");
            jpn jpnVar = imageFitDownloadView.f;
            if (jpnVar != null) {
                jpnVar.a(new IllegalArgumentException("Invalid drawable dimensions"));
            }
        } else {
            ViewGroup.LayoutParams layoutParams = imageFitDownloadView.getLayoutParams();
            int i = imageFitDownloadView.b;
            if (i == -2 && imageFitDownloadView.c == -2) {
                intrinsicHeight2 = drawable.getIntrinsicWidth();
                intrinsicHeight = drawable.getIntrinsicHeight();
            } else if (i == -2) {
                intrinsicHeight2 = (int) ((imageFitDownloadView.c / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                intrinsicHeight = imageFitDownloadView.c;
            } else {
                double intrinsicWidth = drawable.getIntrinsicWidth();
                intrinsicHeight = (int) ((i / intrinsicWidth) * drawable.getIntrinsicHeight());
                intrinsicHeight2 = imageFitDownloadView.b;
            }
            layoutParams.width = intrinsicHeight2 + imageFitDownloadView.getPaddingStart() + imageFitDownloadView.getPaddingEnd();
            layoutParams.height = intrinsicHeight + imageFitDownloadView.getPaddingTop() + imageFitDownloadView.getPaddingBottom();
            imageFitDownloadView.setLayoutParams(layoutParams);
            imageFitDownloadView.setImageDrawable(drawable);
            jpn jpnVar2 = imageFitDownloadView.f;
            if (jpnVar2 != null) {
                jpnVar2.b();
            }
        }
        super.b(drawable, dpmVar);
    }
}

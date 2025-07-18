package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qpo implements uha {
    final /* synthetic */ ImageView a;
    final /* synthetic */ String b;

    public qpo(ImageView imageView, String str) {
        this.a = imageView;
        this.b = str;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        ((tvk) ((tvk) ((tvk) qpp.a.g()).i(th)).j("com/google/android/libraries/notifications/platform/media/impl/basic/BasicMediaManager$1", "onFailure", 266, "BasicMediaManager.java")).v("Failed to load media %s", this.b);
        this.a.setVisibility(8);
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            this.a.setVisibility(8);
            return;
        }
        ImageView imageView = this.a;
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
    }
}

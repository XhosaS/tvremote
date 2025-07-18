package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnw implements jpn {
    final /* synthetic */ hny a;

    public hnw(hny hnyVar) {
        this.a = hnyVar;
    }

    @Override // defpackage.jpn
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) hny.a.c()).p(th)).q("com/google/android/apps/tvsearch/results/searchentity/EntityForegroundImageHolder$2", "onDownloadFailure", (char) 328, "EntityForegroundImageHolder.java")).u("ImageManager future returned failure.");
        this.a.c();
    }

    @Override // defpackage.jpn
    public final void b() {
        hny hnyVar = this.a;
        ImageDownloadView imageDownloadView = hnyVar.e;
        Drawable drawable = imageDownloadView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            hnyVar.b((BitmapDrawable) drawable);
        }
        imageDownloadView.setVisibility(0);
        hnyVar.g = 2;
        hnyVar.c.l();
        hnyVar.g();
    }
}

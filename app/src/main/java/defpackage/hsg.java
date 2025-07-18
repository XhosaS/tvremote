package defpackage;

import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
class hsg implements jpn {
    final /* synthetic */ hsh a;

    public hsg(hsh hshVar) {
        this.a = hshVar;
    }

    @Override // defpackage.jpn
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) hsh.a.c()).p(th)).q("com/google/android/apps/tvsearch/results/searchslimentity/SlimEntityDetailViewHolder$6", "onDownloadFailure", (char) 839, "SlimEntityDetailViewHolder.java")).u("ImageManager future returned failure on loading Foreground Image.");
        hsh hshVar = this.a;
        ImageDownloadView imageDownloadView = hshVar.v;
        imageDownloadView.setImageResource(R.drawable.ic_search_default);
        imageDownloadView.setVisibility(0);
        hshVar.F = 3;
        hshVar.e(hshVar.b);
        hshVar.x.setVisibility(4);
    }

    @Override // defpackage.jpn
    public final void b() {
        hsh hshVar = this.a;
        hshVar.v.setVisibility(0);
        hshVar.F = 2;
        hshVar.d();
    }
}

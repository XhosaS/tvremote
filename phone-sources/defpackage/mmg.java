package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobile.usecase.downloads.DownloadItemView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.PreplayDownloadAnimationView;
import com.google.android.apps.play.movies.mobileux.screen.details.similarassets.AssetCardRowView;
import com.google.android.apps.play.movies.mobileux.screen.details.trailers.TrailersView;
import com.google.android.apps.play.movies.mobileux.screen.player.infocards.actors.filmography.ActorFilmographyView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmg implements idy {
    private final /* synthetic */ int a;

    public /* synthetic */ mmg(int i) {
        this.a = i;
    }

    @Override // defpackage.idy
    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((ieg) obj).m();
                break;
            case 2:
                View view = (View) obj;
                if (view instanceof DownloadItemView) {
                    DownloadItemView downloadItemView = (DownloadItemView) view;
                    PreplayDownloadAnimationView preplayDownloadAnimationView = downloadItemView.a;
                    if (preplayDownloadAnimationView != null) {
                        preplayDownloadAnimationView.b();
                    }
                    DownloadAnimationView downloadAnimationView = downloadItemView.b;
                    if (downloadAnimationView != null) {
                        downloadAnimationView.b();
                    }
                    TextView textView = downloadItemView.c;
                    if (textView != null) {
                        textView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 3:
                break;
            case 4:
                ((mwb) obj).a().h();
                break;
            case 5:
                AssetCardRowView assetCardRowView = (AssetCardRowView) ((View) obj);
                assetCardRowView.b.c(assetCardRowView.a);
                break;
            case 6:
                TrailersView trailersView = (TrailersView) ((View) obj);
                trailersView.b.c(trailersView.a);
                break;
            case 7:
                ActorFilmographyView actorFilmographyView = (ActorFilmographyView) ((View) obj);
                if (actorFilmographyView.d != null) {
                    Context context = actorFilmographyView.getContext();
                    hjr.c(context).i(actorFilmographyView.a);
                    break;
                }
                break;
            default:
                ((mwb) obj).a().h();
                break;
        }
    }
}

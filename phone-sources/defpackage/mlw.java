package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobileux.screen.details.episodes.EpisodesHeaderView;
import com.google.android.apps.play.movies.mobileux.screen.details.familylibrary.FamilyLibraryView;
import com.google.android.apps.play.movies.mobileux.screen.details.moreinfo.MoreInfoItemView;
import com.google.android.apps.play.movies.mobileux.screen.details.rentalexpiry.RentalExpiryView;
import com.google.android.apps.play.movies.mobileux.screen.details.synopsis.SynopsisView;
import com.google.android.apps.play.movies.mobileux.screen.details.title.TitleSectionView;
import com.google.android.apps.play.movies.mobileux.screen.details.trailers.TrailerItemView;
import com.google.android.apps.play.movies.mobileux.screen.details.trailers.TrailersView;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mlw implements icv {
    private final /* synthetic */ int a;

    public /* synthetic */ mlw(int i) {
        this.a = i;
    }

    @Override // defpackage.icv
    public final void a(Object obj, Object obj2) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                ((View) obj2).findViewById(R.id.play_header_spacer).setMinimumHeight(((Integer) obj).intValue());
                break;
            case 1:
                krd.c("SyncWatchNextTask failed ".concat(String.valueOf(String.valueOf((Throwable) obj))));
                break;
            case 2:
                ((TextView) ((View) obj2).findViewById(R.id.title)).setText((String) obj);
                break;
            case 3:
                ((EpisodesHeaderView) ((View) obj2)).a((mxy) obj);
                break;
            case 4:
                ((FamilyLibraryView) ((View) obj2)).a((myn) obj);
                break;
            case 5:
                ((MoreInfoItemView) ((View) obj2)).a((myw) obj);
                break;
            case 6:
                ((RentalExpiryView) ((View) obj2)).a((mze) obj);
                break;
            case 7:
                ((SynopsisView) ((View) obj2)).a((mzx) obj);
                break;
            case 8:
                ((TitleSectionView) ((View) obj2)).a((naf) obj);
                break;
            case 9:
                naj najVar = (naj) obj;
                ((TrailersView) ((View) obj2)).b(najVar);
                Iterator it = najVar.a.iterator();
                while (it.hasNext()) {
                    lio lioVar = ((nah) it.next()).d;
                    lioVar.b().d(lioVar.c());
                }
                break;
            case 10:
                ((TrailerItemView) ((View) obj2)).a((nah) obj);
                break;
            default:
                ((nbo) ((View) obj2)).a((nbk) obj);
                break;
        }
    }
}

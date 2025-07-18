package defpackage;

import com.google.android.apps.googletv.app.device.virtualremote.ui.QuickSettingTileService;
import com.google.android.apps.googletv.app.image.PosterSharingContentProvider;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.purchase.PrePurchaseBottomSheetFragment;
import com.google.android.apps.googletv.app.presentation.pages.qs.QSActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.RemoteWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhu implements xbx {
    private final mif a;
    private final /* synthetic */ int b;

    public mhu(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        switch (this.b) {
            case 0:
                ((PlayStoreBootstrapActivity) obj).getClass();
                return new mhe(this.a, 13);
            case 1:
                ((PinBroadcastReceiver) obj).getClass();
                return new mhe(this.a, 12);
            case 2:
                ((PlayerActivity) obj).getClass();
                return new mhe(this.a, 14);
            case 3:
                ((ldf) obj).getClass();
                return new mhe(this.a, 15);
            case 4:
                ((PosterSharingContentProvider) obj).getClass();
                return new mhe(this.a, 16);
            case 5:
                ((PrePurchaseBottomSheetFragment) obj).getClass();
                return new mhe(this.a, 17);
            case 6:
                ((kdx) obj).getClass();
                return new mgz(this.a, 5, (boolean[]) null);
            case 7:
                ((ProviderSelectionMenuFragment) obj).getClass();
                return new mhw(this.a);
            case 8:
                ((kea) obj).getClass();
                return new mhe(this.a, 18);
            case 9:
                ((QSActivity) obj).getClass();
                return new mhe(this.a, 19);
            case 10:
                ((QuickSettingTileService) obj).getClass();
                return new mhe(this.a, 20);
            case 11:
                ((TransferService.Receiver) obj).getClass();
                return new mhx(this.a, 1);
            case 12:
                ((RemoteWatchActivity) obj).getClass();
                return new mhz(this.a, 1, null);
            case 13:
                ((mrn) obj).getClass();
                return new mhx(this.a, 0);
            case 14:
                ((SearchQueryPageActivity) obj).getClass();
                return new mhx(this.a, 2);
            case 15:
                ((com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity) obj).getClass();
                return new mhx(this.a, 3);
            case 16:
                ((kfh) obj).getClass();
                return new mhx(this.a, 4);
            case 17:
                ((keg) obj).getClass();
                return new mgz(this.a, 6, (float[]) null);
            case 18:
                ((SearchResultsPageActivity) obj).getClass();
                return new mhx(this.a, 5);
            case 19:
                ((keh) obj).getClass();
                return new mgz(this.a, 7, (byte[][]) null);
            default:
                ((kfk) obj).getClass();
                return new mhx(this.a, 6);
        }
    }
}

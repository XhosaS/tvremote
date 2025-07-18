package defpackage;

import com.google.android.apps.googletv.app.device.impl.MediaDeviceControllerForegroundService;
import com.google.android.apps.googletv.app.player.offline.OfflineService;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;
import com.google.android.apps.play.movies.common.activity.LauncherActivity;
import com.google.android.apps.play.movies.common.service.pinning.NotificationsCallbackBroadcastReceiver;
import com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService;
import com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.NotificationSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.apps.play.movies.mobile.usecase.watch.MiniControllerFragment;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhd implements xbx {
    private final mif a;
    private final /* synthetic */ int b;

    public mhd(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        switch (this.b) {
            case 0:
                ((InlineLocalWatchFragment) obj).getClass();
                return new mgy(this.a, 17);
            case 1:
                ((WatchActivity.InitiallyLandscape) obj).getClass();
                return new mgy(this.a, 16);
            case 2:
                ((InternalSettingsActivity) obj).getClass();
                return new mgy(this.a, 18);
            case 3:
                ((LauncherActivity) obj).getClass();
                return new mgy(this.a, 19);
            case 4:
                ((mnt) obj).getClass();
                return new mgy(this.a, 20);
            case 5:
                ((mrg) obj).getClass();
                return new mhe(this.a, 1);
            case 6:
                ((ManageDownloadsActivity) obj).getClass();
                return new mhe(this.a, 0);
            case 7:
                ((ManageServicesActivity) obj).getClass();
                return new mhe(this.a, 2);
            case 8:
                ((kch) obj).getClass();
                return new mha(this.a, 2, (char[]) null);
            case 9:
                ((MediaDeviceControllerForegroundService) obj).getClass();
                return new mhe(this.a, 3);
            case 10:
                ((MiniControllerFragment) obj).getClass();
                return new mhe(this.a, 4);
            case 11:
                ((mmk) obj).getClass();
                return new mgz(this.a, 2, (char[]) null);
            case 12:
                ((mmp) obj).getClass();
                return new mgz(this.a, 3, (char[]) null);
            case 13:
                ((MyEpisodesActivity) obj).getClass();
                return new mhe(this.a, 5);
            case 14:
                ((kcw) obj).getClass();
                return new mgz(this.a, 4, (int[]) null);
            case 15:
                ((NotificationPreferencesActivity) obj).getClass();
                return new mhe(this.a, 6);
            case 16:
                ((NotificationSettingsActivity) obj).getClass();
                return new mhe(this.a, 7);
            case 17:
                ((NotificationTransportListenerService) obj).getClass();
                return new mhe(this.a, 8);
            case 18:
                ((NotificationsCallbackBroadcastReceiver) obj).getClass();
                return new mhe(this.a, 9);
            case 19:
                ((OfflineService) obj).getClass();
                return new mhe(this.a, 10);
            default:
                ((jbq) obj).getClass();
                return new mhe(this.a, 11);
        }
    }
}

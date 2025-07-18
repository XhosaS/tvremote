package defpackage;

import com.google.android.apps.googletv.app.device.virtualremote.contentprovider.VirtualRemoteCapableDeviceProvider;
import com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities.VirtualRemoteActivity;
import com.google.android.apps.googletv.app.presentation.widgets.toppicks.TopPicksWidgetReceiver;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;
import com.google.android.apps.play.movies.common.presenter.activity.TrailerLauncherActivity;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.common.store.sync.SyncService;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhy implements xbx {
    private final mif a;
    private final /* synthetic */ int b;

    public mhy(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        switch (this.b) {
            case 0:
                ((kfz) obj).getClass();
                return new mhx(this.a, 7);
            case 1:
                ((SettingsActivity) obj).getClass();
                return new mha(this.a, 3, (short[]) null);
            case 2:
                ((SherlogMenuButton) obj).getClass();
                return new mhx(this.a, 8);
            case 3:
                ((mmv) obj).getClass();
                return new mgz(this.a, 8, (char[]) null);
            case 4:
                ((StreamingWarningDialogActivity) obj).getClass();
                return new mhx(this.a, 9);
            case 5:
                ((SyncService) obj).getClass();
                return new mhx(this.a, 10);
            case 6:
                ((kan) obj).getClass();
                return new mhx(this.a, 11);
            case 7:
                ((kam) obj).getClass();
                return new mhx(this.a, 12);
            case 8:
                ((kap) obj).getClass();
                return new mhx(this.a, 13);
            case 9:
                ((klm) obj).getClass();
                return new mhx(this.a, 14);
            case 10:
                ((TopPicksWidgetReceiver) obj).getClass();
                return new mhx(this.a, 15);
            case 11:
                ((TrailerLauncherActivity) obj).getClass();
                return new mhx(this.a, 16);
            case 12:
                ((jcm) obj).getClass();
                return new mhx(this.a, 17);
            case 13:
                ((TransferService) obj).getClass();
                return new mhz(this.a, 0);
            case 14:
                ((jdd) obj).getClass();
                return new mia(this.a);
            case 15:
                ((mkg) obj).getClass();
                return new mhx(this.a, 18);
            case 16:
                ((mqj) obj).getClass();
                return new mhx(this.a, 19);
            case 17:
                ((VirtualRemoteActivity) obj).getClass();
                return new mhx(this.a, 20);
            case 18:
                ((VirtualRemoteCapableDeviceProvider) obj).getClass();
                return new mib(this.a, 1);
            case 19:
                ((WatchActionBootstrapActivity) obj).getClass();
                return new mib(this.a, 0);
            default:
                ((WatchActivity) obj).getClass();
                return new mib(this.a, 2);
        }
    }
}

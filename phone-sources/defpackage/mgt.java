package defpackage;

import com.google.android.apps.googletv.app.actions.ActionBroadcastReceiver;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFullscreenFragment;
import com.google.android.apps.googletv.app.notifications.ChimeBroadcastReceiver;
import com.google.android.apps.googletv.app.notifications.ChimeNotificationLauncherActivity;
import com.google.android.apps.googletv.app.presentation.pages.aioverview.AiOverviewActivity;
import com.google.android.apps.googletv.app.presentation.pages.contentrestrictions.ContentRestrictionsActivity;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.apps.play.movies.common.presenter.activity.AuxiliaryActivity;
import com.google.android.apps.play.movies.common.service.bitmap.BitmapContentProvider;
import com.google.android.apps.play.movies.common.service.indexing.AppIndexingUpdateReceiver;
import com.google.android.apps.play.movies.common.service.pinning.ApiContentProvider;
import com.google.android.apps.play.movies.mobile.usecase.settings.ChimeNotificationSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgt implements xbx {
    private final mif a;
    private final /* synthetic */ int b;

    public mgt(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        switch (this.b) {
            case 0:
                ((ldc) obj).getClass();
                return new mgu(this.a, 0);
            case 1:
                ((ActionBroadcastReceiver) obj).getClass();
                return new mgu(this.a, 1);
            case 2:
                ((AiOverviewActivity) obj).getClass();
                return new mgu(this.a, 2);
            case 3:
                ((jxa) obj).getClass();
                return new mgu(this.a, 3);
            case 4:
                ((ApiActivity) obj).getClass();
                return new mha(this.a, 1, (byte[]) null);
            case 5:
                ((ApiContentProvider) obj).getClass();
                return new mgu(this.a, 4);
            case 6:
                ((AppIndexingUpdateReceiver) obj).getClass();
                return new mgu(this.a, 5);
            case 7:
                ((jaa) obj).getClass();
                return new mgu(this.a, 6);
            case 8:
                ((AuxiliaryActivity) obj).getClass();
                return new mgu(this.a, 7);
            case 9:
                ((BitmapContentProvider) obj).getClass();
                return new mgu(this.a, 8);
            case 10:
                ((BootstrapWatchActivity) obj).getClass();
                return new mgu(this.a, 9);
            case 11:
                ((ChimeBroadcastReceiver) obj).getClass();
                return new mgu(this.a, 10);
            case 12:
                ((ChimeNotificationLauncherActivity) obj).getClass();
                return new mgu(this.a, 11);
            case 13:
                ((ChimeNotificationSettingsActivity) obj).getClass();
                return new mgu(this.a, 12);
            case 14:
                ((CompanionBarFragment) obj).getClass();
                return new mgu(this.a, 13);
            case 15:
                ((CompanionBarFullscreenFragment) obj).getClass();
                return new mgu(this.a, 14);
            case 16:
                ((jzz) obj).getClass();
                return new mgu(this.a, 15);
            case 17:
                ((jzy) obj).getClass();
                return new mgu(this.a, 16);
            case 18:
                ((jzq) obj).getClass();
                return new mgu(this.a, 17);
            case 19:
                ((jxv) obj).getClass();
                return new mgu(this.a, 18);
            default:
                ((ContentRestrictionsActivity) obj).getClass();
                return new mgu(this.a, 19);
        }
    }
}

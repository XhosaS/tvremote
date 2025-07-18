package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.entitymenu.EntityMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.entitypurchase.EntityPurchasePageActivity;
import com.google.android.apps.googletv.app.presentation.pages.genericcomponent.GenericComponentPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.genericstreamdialog.GenericStreamDialogFragment;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.googletv.app.presentation.pages.launcher.GtvLauncherActivity;
import com.google.android.apps.play.movies.common.activity.EpisodeStarterActivity;
import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import com.google.android.apps.play.movies.mobile.service.restart.GtvExperienceInitializer;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgx implements xbx {
    private final mif a;
    private final /* synthetic */ int b;

    public mgx(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        switch (this.b) {
            case 0:
                ((DeviceNotificationActivity) obj).getClass();
                return new mgy(this.a, 1);
            case 1:
                ((DetailsActivity) obj).getClass();
                return new mgu(this.a, 20);
            case 2:
                ((jbk) obj).getClass();
                return new mgy(this.a, 0);
            case 3:
                ((mra) obj).getClass();
                return new mgy(this.a, 2);
            case 4:
                ((EntityMenuFragment) obj).getClass();
                return new mgy(this.a, 3);
            case 5:
                ((jzd) obj).getClass();
                return new mgz(this.a, 1, (byte[]) null);
            case 6:
                ((EntityPageActivity) obj).getClass();
                return new mgy(this.a, 4);
            case 7:
                ((jyw) obj).getClass();
                return new mgz(this.a, 0);
            case 8:
                ((EntityPurchasePageActivity) obj).getClass();
                return new mha(this.a, 0);
            case 9:
                ((EpisodeStarterActivity) obj).getClass();
                return new mgy(this.a, 5);
            case 10:
                ((jzk) obj).getClass();
                return new mgy(this.a, 6);
            case 11:
                ((jzl) obj).getClass();
                return new mgy(this.a, 7);
            case 12:
                ((GenericComponentPageActivity) obj).getClass();
                return new mgy(this.a, 8);
            case 13:
                ((jzn) obj).getClass();
                return new mgy(this.a, 9);
            case 14:
                ((GenericStreamDialogFragment) obj).getClass();
                return new mgy(this.a, 10);
            case 15:
                ((jzp) obj).getClass();
                return new mgy(this.a, 11);
            case 16:
                ((mns) obj).getClass();
                return new mgy(this.a, 12);
            case 17:
                ((GtvExperienceInitializer) obj).getClass();
                return new mgy(this.a, 13);
            case 18:
                ((GtvHomePageActivity) obj).getClass();
                return new mhc(this.a);
            case 19:
                ((GtvLauncherActivity) obj).getClass();
                return new mgy(this.a, 14);
            default:
                ((HomeLauncherActivity) obj).getClass();
                return new mgy(this.a, 15);
        }
    }
}

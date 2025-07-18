package defpackage;

import com.google.android.apps.googletv.app.device.impl.MediaDeviceControllerForegroundService;
import com.google.android.apps.googletv.app.device.virtualremote.ui.QuickSettingTileService;
import com.google.android.apps.googletv.app.image.PosterSharingContentProvider;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.player.offline.OfflineService;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;
import com.google.android.apps.googletv.app.presentation.pages.purchase.PrePurchaseBottomSheetFragment;
import com.google.android.apps.googletv.app.presentation.pages.qs.QSActivity;
import com.google.android.apps.play.movies.common.service.pinning.NotificationsCallbackBroadcastReceiver;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import com.google.android.apps.play.movies.common.service.playstore.PlayStoreBootstrapActivity;
import com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService;
import com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.NotificationSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.MiniControllerFragment;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhe implements xby {
    private final mif a;
    private final /* synthetic */ int b;

    public mhe(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        switch (this.b) {
            case 0:
                mif mifVar = this.a;
                ManageDownloadsActivity manageDownloadsActivity = (ManageDownloadsActivity) obj;
                manageDownloadsActivity.R = mifVar.F();
                manageDownloadsActivity.a = (lfn) mifVar.bG.b();
                manageDownloadsActivity.b = mifVar.getAccountRepository();
                manageDownloadsActivity.h = (nqq) mifVar.th.b();
                manageDownloadsActivity.c = mifVar.getRepositories();
                manageDownloadsActivity.d = (iea) mifVar.os.b();
                manageDownloadsActivity.e = (mem) mifVar.bQ.b();
                manageDownloadsActivity.j = (mta) mifVar.uD.b();
                manageDownloadsActivity.f = (lie) mifVar.bR.b();
                manageDownloadsActivity.i = new mbk(mifVar.bs, mifVar.bw, mifVar.Dr, mifVar.Ds, (char[]) null);
                manageDownloadsActivity.g = (lfn) mifVar.bG.b();
                break;
            case 1:
                mif mifVar2 = this.a;
                mrg mrgVar = (mrg) obj;
                mrgVar.androidInjector = mifVar2.F();
                mrgVar.a = (lfn) mifVar2.bG.b();
                mrgVar.b = (ldv) mifVar2.bs.b();
                mrgVar.c = (ieh) mifVar2.vO.b();
                mrgVar.d = (lit) mifVar2.Dk.b();
                mrgVar.e = (lkt) mifVar2.Dh.b();
                mrgVar.f = new lnu((lfn) mifVar2.bG.b(), (lny) mifVar2.CO.b());
                mrgVar.g = (san) mifVar2.dG.b();
                mrgVar.l = new moz((yfo) mifVar2.bG, (yfo) mifVar2.bw, (yfo) mifVar2.ci, (yfo) mifVar2.bm, (yfo) mifVar2.Dl, (yfo) mifVar2.Cy, (yfo) mifVar2.bE, (yfo) mifVar2.bF, (byte[]) null);
                mrgVar.m = new ntp((yfo) mifVar2.bG);
                mrgVar.h = new mru(mifVar2.bF, mifVar2.Di, mifVar2.Dj);
                mrgVar.o = new lhr(mifVar2.zT, mifVar2.CC, mifVar2.Dm, mifVar2.bR, mifVar2.bs, mifVar2.cu, mifVar2.dG, (char[]) null);
                mrgVar.n = new paq(mifVar2.bm, mifVar2.bQ, mifVar2.rY, mifVar2.os);
                mrgVar.k = (isn) mifVar2.fR.b();
                mrgVar.i = mifVar2.k();
                break;
            case 2:
                mif mifVar3 = this.a;
                ManageServicesActivity manageServicesActivity = (ManageServicesActivity) obj;
                manageServicesActivity.R = mifVar3.F();
                manageServicesActivity.a = (lfn) mifVar3.bG.b();
                manageServicesActivity.b = (pke) mifVar3.tg.b();
                manageServicesActivity.c = (pkg) mifVar3.tf.b();
                manageServicesActivity.d = mifVar3.getAccountRepository();
                manageServicesActivity.e = (ldv) mifVar3.bs.b();
                manageServicesActivity.g = (nqq) mifVar3.th.b();
                manageServicesActivity.f = mifVar3.i();
                break;
            case 3:
                mif mifVar4 = this.a;
                MediaDeviceControllerForegroundService mediaDeviceControllerForegroundService = (MediaDeviceControllerForegroundService) obj;
                mediaDeviceControllerForegroundService.a = (itk) mifVar4.gh.b();
                kqf kqfVar = mifVar4.a;
                mediaDeviceControllerForegroundService.b = new xnc(rgq.c(kqfVar));
                mediaDeviceControllerForegroundService.c = rgq.c(kqfVar);
                break;
            case 4:
                ((MiniControllerFragment) obj).androidInjector = this.a.F();
                break;
            case 5:
                mif mifVar5 = this.a;
                MyEpisodesActivity myEpisodesActivity = (MyEpisodesActivity) obj;
                myEpisodesActivity.R = mifVar5.F();
                myEpisodesActivity.n = (lfn) mifVar5.bG.b();
                myEpisodesActivity.o = (lie) mifVar5.bR.b();
                myEpisodesActivity.p = (jaf) mifVar5.tj.b();
                myEpisodesActivity.q = mifVar5.s();
                myEpisodesActivity.u = (jan) mifVar5.gw.b();
                myEpisodesActivity.r = (itk) mifVar5.gl.b();
                myEpisodesActivity.v = (gag) mifVar5.gm.b();
                myEpisodesActivity.s = mifVar5.G();
                myEpisodesActivity.t = mifVar5.i();
                myEpisodesActivity.a = mifVar5.getAccountRepository();
                myEpisodesActivity.b = jvy.a(mifVar5.a);
                myEpisodesActivity.m = (kwy) mifVar5.nR.b();
                myEpisodesActivity.c = mifVar5.m();
                myEpisodesActivity.d = (kmo) mifVar5.tL.b();
                myEpisodesActivity.w = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar5.l(), (mjb) mifVar5.wD.b(), (gag) mifVar5.gm.b(), (kmo) mifVar5.tL.b());
                myEpisodesActivity.E = (mta) mifVar5.uD.b();
                myEpisodesActivity.x = mifVar5.p();
                myEpisodesActivity.y = (iof) mifVar5.pU.b();
                myEpisodesActivity.z = (ino) mifVar5.oZ.b();
                break;
            case 6:
                mif mifVar6 = this.a;
                NotificationPreferencesActivity notificationPreferencesActivity = (NotificationPreferencesActivity) obj;
                notificationPreferencesActivity.R = mifVar6.F();
                notificationPreferencesActivity.n = (lfn) mifVar6.bG.b();
                notificationPreferencesActivity.o = (lie) mifVar6.bR.b();
                notificationPreferencesActivity.p = (jaf) mifVar6.tj.b();
                notificationPreferencesActivity.q = mifVar6.s();
                notificationPreferencesActivity.u = (jan) mifVar6.gw.b();
                notificationPreferencesActivity.r = (itk) mifVar6.gl.b();
                notificationPreferencesActivity.v = (gag) mifVar6.gm.b();
                notificationPreferencesActivity.s = mifVar6.G();
                notificationPreferencesActivity.t = mifVar6.i();
                notificationPreferencesActivity.a = (kcz) mifVar6.FA.b();
                notificationPreferencesActivity.d = new kdh(kjj.a);
                notificationPreferencesActivity.b = (iom) mifVar6.Dy.b();
                notificationPreferencesActivity.c = (isi) mifVar6.fB.b();
                break;
            case 7:
                mif mifVar7 = this.a;
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) obj;
                notificationSettingsActivity.R = mifVar7.F();
                notificationSettingsActivity.a = (lfn) mifVar7.bG.b();
                notificationSettingsActivity.t = (lfn) mifVar7.bG.b();
                notificationSettingsActivity.b = (lie) mifVar7.bR.b();
                notificationSettingsActivity.f = (lkt) mifVar7.Dx.b();
                notificationSettingsActivity.c = mifVar7.getAccountRepository();
                break;
            case 8:
                ((NotificationTransportListenerService) obj).a = (mkc) this.a.BT.b();
                break;
            case 9:
                mif mifVar8 = this.a;
                NotificationsCallbackBroadcastReceiver notificationsCallbackBroadcastReceiver = (NotificationsCallbackBroadcastReceiver) obj;
                notificationsCallbackBroadcastReceiver.a = (ExecutorService) mifVar8.bE.b();
                notificationsCallbackBroadcastReceiver.b = (ljg) mifVar8.zO.b();
                notificationsCallbackBroadcastReceiver.c = kfm.c();
                break;
            case 10:
                mif mifVar9 = this.a;
                OfflineService offlineService = (OfflineService) obj;
                offlineService.i = (euc) mifVar9.oH.b();
                offlineService.j = (jdl) mifVar9.DB.b();
                break;
            case 11:
                mif mifVar10 = this.a;
                jbq jbqVar = (jbq) obj;
                jbqVar.a = (ovs) mifVar10.Fq.b();
                jbqVar.b = (ovq) mifVar10.wj.b();
                break;
            case 12:
                mif mifVar11 = this.a;
                PinBroadcastReceiver pinBroadcastReceiver = (PinBroadcastReceiver) obj;
                pinBroadcastReceiver.d = (isy) mifVar11.dN.b();
                pinBroadcastReceiver.a = (lie) mifVar11.bR.b();
                pinBroadcastReceiver.b = (lgr) mifVar11.cZ.b();
                pinBroadcastReceiver.e = new hfx((gpz) mifVar11.cO.b(), (byte[]) null);
                pinBroadcastReceiver.c = (ExecutorService) mifVar11.bE.b();
                break;
            case 13:
                mif mifVar12 = this.a;
                PlayStoreBootstrapActivity playStoreBootstrapActivity = (PlayStoreBootstrapActivity) obj;
                playStoreBootstrapActivity.a = (lie) mifVar12.bR.b();
                playStoreBootstrapActivity.b = (mem) mifVar12.bQ.b();
                playStoreBootstrapActivity.c = (mab) mifVar12.ev.b();
                playStoreBootstrapActivity.d = jvy.a(mifVar12.a);
                playStoreBootstrapActivity.e = (idr) mifVar12.ct.b();
                playStoreBootstrapActivity.f = (izo) mifVar12.gS.b();
                playStoreBootstrapActivity.h = (kmh) mifVar12.op.b();
                pji pjiVar = (pji) mifVar12.nG.b();
                playStoreBootstrapActivity.i = new ntp(pjiVar);
                playStoreBootstrapActivity.g = mifVar12.F();
                break;
            case 14:
                mif mifVar13 = this.a;
                PlayerActivity playerActivity = (PlayerActivity) obj;
                playerActivity.R = mifVar13.F();
                playerActivity.m = (lfz) mifVar13.cv.b();
                playerActivity.k = (lxp) mifVar13.dv.b();
                playerActivity.a = (ino) mifVar13.oZ.b();
                playerActivity.b = mifVar13.k();
                playerActivity.c = (itk) mifVar13.gl.b();
                playerActivity.n = (gag) mifVar13.gm.b();
                playerActivity.l = (jan) mifVar13.gw.b();
                playerActivity.d = mifVar13.p();
                playerActivity.e = (lie) mifVar13.bR.b();
                playerActivity.f = mifVar13.getAccountRepository();
                playerActivity.g = (ldv) mifVar13.bs.b();
                playerActivity.h = (mem) mifVar13.bQ.b();
                playerActivity.i = (jaf) mifVar13.tj.b();
                playerActivity.o = (kuw) mifVar13.Fo.b();
                break;
            case 15:
                mif mifVar14 = this.a;
                ldf ldfVar = (ldf) obj;
                ldfVar.b = mifVar14.F();
                ldfVar.a = (ldv) mifVar14.bs.b();
                break;
            case 16:
                ((PosterSharingContentProvider) obj).b = (iyz) this.a.gr.b();
                break;
            case 17:
                mif mifVar15 = this.a;
                PrePurchaseBottomSheetFragment prePurchaseBottomSheetFragment = (PrePurchaseBottomSheetFragment) obj;
                prePurchaseBottomSheetFragment.childFragmentInjector = mifVar15.F();
                prePurchaseBottomSheetFragment.streamPagePresenter = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar15.l(), (mjb) mifVar15.wD.b(), (gag) mifVar15.gm.b(), (kmo) mifVar15.tL.b());
                prePurchaseBottomSheetFragment.bc25FlagsManager = mifVar15.i();
                prePurchaseBottomSheetFragment.dynamicColorViewModel = (kja) mifVar15.ua.b();
                break;
            case 18:
                mif mifVar16 = this.a;
                kea keaVar = (kea) obj;
                keaVar.childFragmentInjector = mifVar16.F();
                keaVar.f = new kdh(ked.a);
                keaVar.a = (jaf) mifVar16.tj.b();
                keaVar.b = mif.aj();
                keaVar.c = (pkg) mifVar16.tf.b();
                keaVar.d = (pke) mifVar16.tg.b();
                break;
            case 19:
                mif mifVar17 = this.a;
                QSActivity qSActivity = (QSActivity) obj;
                qSActivity.R = mifVar17.F();
                qSActivity.n = (lfn) mifVar17.bG.b();
                qSActivity.o = (lie) mifVar17.bR.b();
                qSActivity.p = (jaf) mifVar17.tj.b();
                qSActivity.q = mifVar17.s();
                qSActivity.u = (jan) mifVar17.gw.b();
                qSActivity.r = (itk) mifVar17.gl.b();
                qSActivity.v = (gag) mifVar17.gm.b();
                qSActivity.s = mifVar17.G();
                qSActivity.t = mifVar17.i();
                qSActivity.a = new xlk(rgq.c(mifVar17.a));
                break;
            default:
                mif mifVar18 = this.a;
                QuickSettingTileService quickSettingTileService = (QuickSettingTileService) obj;
                quickSettingTileService.a = (lie) mifVar18.bR.b();
                quickSettingTileService.b = (itk) mifVar18.gl.b();
                break;
        }
    }
}

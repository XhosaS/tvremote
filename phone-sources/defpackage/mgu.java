package defpackage;

import com.google.android.apps.googletv.app.actions.ActionBroadcastReceiver;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFullscreenFragment;
import com.google.android.apps.googletv.app.notifications.ChimeBroadcastReceiver;
import com.google.android.apps.googletv.app.notifications.ChimeNotificationLauncherActivity;
import com.google.android.apps.googletv.app.presentation.pages.aioverview.AiOverviewActivity;
import com.google.android.apps.googletv.app.presentation.pages.contentrestrictions.ContentRestrictionsActivity;
import com.google.android.apps.play.movies.common.presenter.activity.AuxiliaryActivity;
import com.google.android.apps.play.movies.common.service.bitmap.BitmapContentProvider;
import com.google.android.apps.play.movies.common.service.indexing.AppIndexingUpdateReceiver;
import com.google.android.apps.play.movies.common.service.pinning.ApiContentProvider;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.ChimeNotificationSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgu implements xby {
    private final mif a;
    private final /* synthetic */ int b;

    public mgu(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        switch (this.b) {
            case 0:
                mif mifVar = this.a;
                ldc ldcVar = (ldc) obj;
                ldcVar.b = mifVar.F();
                ldcVar.a = (lfn) mifVar.bG.b();
                break;
            case 1:
                mif mifVar2 = this.a;
                ActionBroadcastReceiver actionBroadcastReceiver = (ActionBroadcastReceiver) obj;
                actionBroadcastReceiver.b = (irc) mifVar2.gn.b();
                actionBroadcastReceiver.a = xcl.a(mifVar2.zt);
                actionBroadcastReceiver.c = (gag) mifVar2.gm.b();
                break;
            case 2:
                mif mifVar3 = this.a;
                AiOverviewActivity aiOverviewActivity = (AiOverviewActivity) obj;
                aiOverviewActivity.R = mifVar3.F();
                aiOverviewActivity.n = (lfn) mifVar3.bG.b();
                aiOverviewActivity.o = (lie) mifVar3.bR.b();
                aiOverviewActivity.p = (jaf) mifVar3.tj.b();
                aiOverviewActivity.q = mifVar3.s();
                aiOverviewActivity.u = (jan) mifVar3.gw.b();
                aiOverviewActivity.r = (itk) mifVar3.gl.b();
                aiOverviewActivity.v = (gag) mifVar3.gm.b();
                aiOverviewActivity.s = mifVar3.G();
                aiOverviewActivity.t = mifVar3.i();
                aiOverviewActivity.b = (kdj) mifVar3.DH.b();
                aiOverviewActivity.a = new kuw((lfn) mifVar3.bG.b(), mifVar3.i());
                break;
            case 3:
                mif mifVar4 = this.a;
                jxa jxaVar = (jxa) obj;
                jxaVar.d = (irc) mifVar4.gn.b();
                jxaVar.c = new isy((isw) mifVar4.fM.b(), mifVar4.getAccountRepository(), mifVar4.ag());
                break;
            case 4:
                mif mifVar5 = this.a;
                ApiContentProvider apiContentProvider = (ApiContentProvider) obj;
                apiContentProvider.a = (lfn) mifVar5.bG.b();
                apiContentProvider.b = (lie) mifVar5.bR.b();
                apiContentProvider.c = (lyz) mifVar5.bS.b();
                break;
            case 5:
                mif mifVar6 = this.a;
                ((AppIndexingUpdateReceiver) obj).a = new kuw((gpz) mifVar6.cO.b(), (lfn) mifVar6.bG.b(), (byte[]) null);
                break;
            case 6:
                mif mifVar7 = this.a;
                jaa jaaVar = (jaa) obj;
                jaaVar.b = (kuw) mifVar7.nL.b();
                jaaVar.a = mifVar7.getAccountRepository();
                break;
            case 7:
                mif mifVar8 = this.a;
                AuxiliaryActivity auxiliaryActivity = (AuxiliaryActivity) obj;
                auxiliaryActivity.a = mifVar8.getAccountRepository();
                auxiliaryActivity.b = mifVar8.F();
                auxiliaryActivity.c = (ldv) mifVar8.bs.b();
                break;
            case 8:
                mif mifVar9 = this.a;
                BitmapContentProvider bitmapContentProvider = (BitmapContentProvider) obj;
                bitmapContentProvider.a = (ExecutorService) mifVar9.Cj.b();
                bitmapContentProvider.b = mifVar9.f();
                luq luqVar = (luq) mifVar9.ek.b();
                kqf kqfVar = mifVar9.a;
                kqfVar.n();
                luqVar.getClass();
                bitmapContentProvider.c = luqVar;
                luq luqVar2 = (luq) mifVar9.em.b();
                kqfVar.r();
                luqVar2.getClass();
                bitmapContentProvider.d = luqVar2;
                luq luqVar3 = (luq) mifVar9.en.b();
                kqfVar.q();
                luqVar3.getClass();
                bitmapContentProvider.e = luqVar3;
                luq luqVar4 = (luq) mifVar9.el.b();
                kqfVar.p();
                luqVar4.getClass();
                bitmapContentProvider.f = luqVar4;
                break;
            case 9:
                mif mifVar10 = this.a;
                BootstrapWatchActivity bootstrapWatchActivity = (BootstrapWatchActivity) obj;
                bootstrapWatchActivity.a = mifVar10.F();
                bootstrapWatchActivity.b = mifVar10.R();
                bootstrapWatchActivity.c = mifVar10.W();
                bootstrapWatchActivity.d = (ino) mifVar10.oZ.b();
                bootstrapWatchActivity.e = true;
                bootstrapWatchActivity.f = kqv.c();
                bootstrapWatchActivity.g = (ldv) mifVar10.bs.b();
                bootstrapWatchActivity.h = new mjo();
                bootstrapWatchActivity.i = (mjl) mifVar10.vT.b();
                bootstrapWatchActivity.j = (iea) mifVar10.pS.b();
                bootstrapWatchActivity.k = (mab) mifVar10.ev.b();
                bootstrapWatchActivity.l = mifVar10.getRepositories();
                bootstrapWatchActivity.r = mifVar10.ai();
                bootstrapWatchActivity.m = (lfn) mifVar10.bG.b();
                bootstrapWatchActivity.n = (ExecutorService) mifVar10.bE.b();
                bootstrapWatchActivity.s = (lyz) mifVar10.bS.b();
                bootstrapWatchActivity.o = (idy) mifVar10.CD.b();
                bootstrapWatchActivity.p = mifVar10.H();
                break;
            case 10:
                mif mifVar11 = this.a;
                ChimeBroadcastReceiver chimeBroadcastReceiver = (ChimeBroadcastReceiver) obj;
                chimeBroadcastReceiver.h = (irc) mifVar11.pi.b();
                chimeBroadcastReceiver.f = (ihq) mifVar11.nY.b();
                chimeBroadcastReceiver.a = mifVar11.getAccountRepository();
                chimeBroadcastReceiver.g = (usc) mifVar11.za.b();
                chimeBroadcastReceiver.b = (lie) mifVar11.bR.b();
                chimeBroadcastReceiver.c = jbr.t();
                chimeBroadcastReceiver.d = new jaq(rgq.c(mifVar11.a));
                chimeBroadcastReceiver.e = (izo) mifVar11.gS.b();
                break;
            case 11:
                mif mifVar12 = this.a;
                ChimeNotificationLauncherActivity chimeNotificationLauncherActivity = (ChimeNotificationLauncherActivity) obj;
                chimeNotificationLauncherActivity.R = mifVar12.F();
                chimeNotificationLauncherActivity.a = xcl.a(mifVar12.zt);
                break;
            case 12:
                mif mifVar13 = this.a;
                ChimeNotificationSettingsActivity chimeNotificationSettingsActivity = (ChimeNotificationSettingsActivity) obj;
                chimeNotificationSettingsActivity.R = mifVar13.F();
                chimeNotificationSettingsActivity.a = (lfn) mifVar13.bG.b();
                chimeNotificationSettingsActivity.t = (lfn) mifVar13.bG.b();
                chimeNotificationSettingsActivity.b = (lie) mifVar13.bR.b();
                chimeNotificationSettingsActivity.e = (iom) mifVar13.Dy.b();
                chimeNotificationSettingsActivity.f = (kuw) mifVar13.Dz.b();
                chimeNotificationSettingsActivity.c = mifVar13.getAccountRepository();
                chimeNotificationSettingsActivity.d = (mem) mifVar13.bQ.b();
                break;
            case 13:
                mif mifVar14 = this.a;
                CompanionBarFragment companionBarFragment = (CompanionBarFragment) obj;
                companionBarFragment.androidInjector = mifVar14.F();
                companionBarFragment.a = (ivd) mifVar14.DP.b();
                companionBarFragment.j = (gag) mifVar14.gm.b();
                companionBarFragment.b = mifVar14.i();
                companionBarFragment.i = new kuw((lfn) mifVar14.bG.b(), mifVar14.i());
                companionBarFragment.c = new kiq(rgq.c(mifVar14.a), (itk) mifVar14.gl.b(), (gag) mifVar14.gm.b());
                companionBarFragment.h = (jan) mifVar14.gw.b();
                break;
            case 14:
                mif mifVar15 = this.a;
                CompanionBarFullscreenFragment companionBarFullscreenFragment = (CompanionBarFullscreenFragment) obj;
                companionBarFullscreenFragment.androidInjector = mifVar15.F();
                companionBarFullscreenFragment.a = (itk) mifVar15.gl.b();
                companionBarFullscreenFragment.b = (ivd) mifVar15.DP.b();
                companionBarFullscreenFragment.c = (iof) mifVar15.pU.b();
                break;
            case 15:
                mif mifVar16 = this.a;
                jzz jzzVar = (jzz) obj;
                jzzVar.androidInjector = mifVar16.F();
                jzzVar.d = (jzs) mifVar16.ok.b();
                jzzVar.a = (pke) mifVar16.tg.b();
                jzzVar.b = (pkg) mifVar16.tf.b();
                jzzVar.c = mifVar16.G();
                jzzVar.e = (jwq) mifVar16.tQ.b();
                break;
            case 16:
                ((jzy) obj).b = (jzs) this.a.ok.b();
                break;
            case 17:
                mif mifVar17 = this.a;
                jzq jzqVar = (jzq) obj;
                jzqVar.androidInjector = mifVar17.F();
                jzqVar.g = (kdj) mifVar17.DH.b();
                jzqVar.f = new kuw((lfn) mifVar17.bG.b(), mifVar17.i());
                jzqVar.a = new ixm(ImmutableMap.of(wkw.TVM_ENTITY_WATCHLIST, mifVar17.FC, wkw.TVM_ENTITY_SHARE, mifVar17.FE, wkw.HOT_AND_NEW_CARD, mifVar17.FF, wkw.GENERIC_STREAM_PAGE, mifVar17.FK));
                jzqVar.b = mifVar17.G();
                jzqVar.c = mifVar17.i();
                jzqVar.e = (jwq) mifVar17.tQ.b();
                break;
            case 18:
                jxv jxvVar = (jxv) obj;
                jxvVar.childFragmentInjector = this.a.F();
                jxvVar.d = new hfw(jxy.a);
                break;
            case 19:
                mif mifVar18 = this.a;
                ContentRestrictionsActivity contentRestrictionsActivity = (ContentRestrictionsActivity) obj;
                contentRestrictionsActivity.R = mifVar18.F();
                contentRestrictionsActivity.n = (lfn) mifVar18.bG.b();
                contentRestrictionsActivity.o = (lie) mifVar18.bR.b();
                contentRestrictionsActivity.p = (jaf) mifVar18.tj.b();
                contentRestrictionsActivity.q = mifVar18.s();
                contentRestrictionsActivity.u = (jan) mifVar18.gw.b();
                contentRestrictionsActivity.r = (itk) mifVar18.gl.b();
                contentRestrictionsActivity.v = (gag) mifVar18.gm.b();
                contentRestrictionsActivity.s = mifVar18.G();
                contentRestrictionsActivity.t = mifVar18.i();
                contentRestrictionsActivity.c = (mdw) mifVar18.ol.b();
                contentRestrictionsActivity.b = new kuw((lfn) mifVar18.bG.b(), mifVar18.i());
                break;
            default:
                mif mifVar19 = this.a;
                DetailsActivity detailsActivity = (DetailsActivity) obj;
                detailsActivity.R = mifVar19.F();
                detailsActivity.a = (lfn) mifVar19.bG.b();
                detailsActivity.f = (lfn) mifVar19.bG.b();
                detailsActivity.g = mifVar19.getRepositories();
                detailsActivity.h = (lie) mifVar19.bR.b();
                detailsActivity.B = (nqq) mifVar19.th.b();
                detailsActivity.z = mifVar19.ai();
                detailsActivity.i = (iea) mifVar19.pS.b();
                detailsActivity.j = (iea) mifVar19.os.b();
                detailsActivity.C = (mta) mifVar19.uD.b();
                detailsActivity.k = (mab) mifVar19.ev.b();
                detailsActivity.A = (lfz) mifVar19.cv.b();
                detailsActivity.l = (mjl) mifVar19.vT.b();
                detailsActivity.m = mifVar19.getAccountRepository();
                lfn lfnVar = (lfn) mifVar19.bG.b();
                xbw xbwVarA = xcl.a(mifVar19.CA);
                mih mihVar = mifVar19.b;
                idy idyVarB = mihVar.b(lfnVar, xbwVarA);
                idyVarB.getClass();
                detailsActivity.n = idyVarB;
                kqf kqfVar2 = mifVar19.a;
                idf idfVarD = mihVar.d(rgq.c(kqfVar2), (lfn) mifVar19.bG.b(), mifVar19.ai(), (kuw) mifVar19.dS.b(), mifVar19.getAccountRepository(), (lyz) mifVar19.bS.b(), mifVar19.o(), new lrc((Object) new lro((moz) mifVar19.cm.b(), mifVar19.au()), (lql) mifVar19.rJ.b(), (Object) new hfx((idf) mifVar19.CB.b()), 3));
                idfVarD.getClass();
                detailsActivity.o = idfVarD;
                detailsActivity.p = jvy.a(kqfVar2);
                detailsActivity.q = new mac(mifVar19.getAccountRepository(), (mab) mifVar19.ev.b());
                detailsActivity.r = new mjo();
                detailsActivity.s = (pkg) mifVar19.tf.b();
                detailsActivity.t = (ldv) mifVar19.bs.b();
                detailsActivity.u = mifVar19.O();
                detailsActivity.v = (itk) mifVar19.gl.b();
                detailsActivity.D = (gag) mifVar19.gm.b();
                detailsActivity.w = mifVar19.s();
                detailsActivity.x = (jaf) mifVar19.tj.b();
                detailsActivity.y = mifVar19.i();
                break;
        }
    }
}

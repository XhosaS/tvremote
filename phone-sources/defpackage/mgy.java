package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.entitymenu.EntityMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.genericcomponent.GenericComponentPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.genericstreamdialog.GenericStreamDialogFragment;
import com.google.android.apps.googletv.app.presentation.pages.launcher.GtvLauncherActivity;
import com.google.android.apps.play.movies.common.activity.EpisodeStarterActivity;
import com.google.android.apps.play.movies.common.activity.LauncherActivity;
import com.google.android.apps.play.movies.mobile.presenter.activity.HomeLauncherActivity;
import com.google.android.apps.play.movies.mobile.service.restart.GtvExperienceInitializer;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.InlineLocalWatchFragment;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgy implements xby {
    private final mif a;
    private final /* synthetic */ int b;

    public mgy(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        switch (this.b) {
            case 0:
                mif mifVar = this.a;
                jbk jbkVar = (jbk) obj;
                jbkVar.androidInjector = mifVar.F();
                jbkVar.a = (jaf) mifVar.tj.b();
                break;
            case 1:
                mif mifVar2 = this.a;
                DeviceNotificationActivity deviceNotificationActivity = (DeviceNotificationActivity) obj;
                deviceNotificationActivity.R = mifVar2.F();
                deviceNotificationActivity.n = (lfn) mifVar2.bG.b();
                deviceNotificationActivity.o = (lie) mifVar2.bR.b();
                deviceNotificationActivity.p = (jaf) mifVar2.tj.b();
                deviceNotificationActivity.q = mifVar2.s();
                deviceNotificationActivity.u = (jan) mifVar2.gw.b();
                deviceNotificationActivity.r = (itk) mifVar2.gl.b();
                deviceNotificationActivity.v = (gag) mifVar2.gm.b();
                deviceNotificationActivity.s = mifVar2.G();
                deviceNotificationActivity.t = mifVar2.i();
                break;
            case 2:
                mif mifVar3 = this.a;
                mra mraVar = (mra) obj;
                mraVar.androidInjector = mifVar3.F();
                mraVar.a = (mem) mifVar3.bQ.b();
                mraVar.b = (lie) mifVar3.bR.b();
                mraVar.c = (ldv) mifVar3.bs.b();
                mraVar.d = mifVar3.getAccountRepository();
                mraVar.e = (lfn) mifVar3.bG.b();
                mraVar.f = mifVar3.p();
                mraVar.g = (jaf) mifVar3.tj.b();
                break;
            case 3:
                mif mifVar4 = this.a;
                EntityMenuFragment entityMenuFragment = (EntityMenuFragment) obj;
                entityMenuFragment.childFragmentInjector = mifVar4.F();
                entityMenuFragment.streamPagePresenter = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar4.l(), (mjb) mifVar4.wD.b(), (gag) mifVar4.gm.b(), (kmo) mifVar4.tL.b());
                entityMenuFragment.watchActionStore = (iof) mifVar4.pU.b();
                entityMenuFragment.veLogger = (jaf) mifVar4.tj.b();
                entityMenuFragment.dialogVe = mif.aj();
                entityMenuFragment.visualElements = (pkg) mifVar4.tf.b();
                entityMenuFragment.viewVisualElements = (pke) mifVar4.tg.b();
                break;
            case 4:
                mif mifVar5 = this.a;
                EntityPageActivity entityPageActivity = (EntityPageActivity) obj;
                entityPageActivity.R = mifVar5.F();
                entityPageActivity.n = (lfn) mifVar5.bG.b();
                entityPageActivity.o = (lie) mifVar5.bR.b();
                entityPageActivity.p = (jaf) mifVar5.tj.b();
                entityPageActivity.q = mifVar5.s();
                entityPageActivity.u = (jan) mifVar5.gw.b();
                entityPageActivity.r = (itk) mifVar5.gl.b();
                entityPageActivity.v = (gag) mifVar5.gm.b();
                entityPageActivity.s = mifVar5.G();
                entityPageActivity.t = mifVar5.i();
                entityPageActivity.a = mifVar5.getAccountRepository();
                kqf kqfVar = mifVar5.a;
                entityPageActivity.b = jvy.a(kqfVar);
                entityPageActivity.m = (kwy) mifVar5.nR.b();
                entityPageActivity.c = mifVar5.m();
                entityPageActivity.d = (kmo) mifVar5.tL.b();
                entityPageActivity.w = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar5.l(), (mjb) mifVar5.wD.b(), (gag) mifVar5.gm.b(), (kmo) mifVar5.tL.b());
                entityPageActivity.x = (iof) mifVar5.pU.b();
                entityPageActivity.I = (mta) mifVar5.uD.b();
                entityPageActivity.y = mifVar5.p();
                entityPageActivity.z = mifVar5.P();
                entityPageActivity.A = (ldv) mifVar5.bs.b();
                entityPageActivity.B = new jlw(new dhq(mifVar5.vM, (byte[]) null, (char[]) null, (byte[]) null), (jaf) mifVar5.tj.b(), (mjl) mifVar5.vT.b(), (jan) mifVar5.gw.b(), (itk) mifVar5.gl.b(), (gag) mifVar5.gm.b(), new xld(rgq.c(kqfVar)), mifVar5.R(), (ovq) mifVar5.wj.b(), mifVar5.G(), (lfn) mifVar5.bG.b(), mifVar5.getAccountRepository(), mifVar5.i(), (kja) mifVar5.ua.b(), (iyz) mifVar5.gr.b(), mifVar5.ag());
                entityPageActivity.C = new xjg(rgq.c(kqfVar));
                entityPageActivity.D = (kja) mifVar5.ua.b();
                break;
            case 5:
                mif mifVar6 = this.a;
                EpisodeStarterActivity episodeStarterActivity = (EpisodeStarterActivity) obj;
                episodeStarterActivity.a = (Executor) mifVar6.bF.b();
                episodeStarterActivity.b = (idf) mifVar6.Ci.b();
                episodeStarterActivity.e = mifVar6.ai();
                episodeStarterActivity.g = mifVar6.as();
                episodeStarterActivity.c = (ldv) mifVar6.bs.b();
                episodeStarterActivity.f = (lfx) mifVar6.bv.b();
                episodeStarterActivity.d = mifVar6.F();
                break;
            case 6:
                mif mifVar7 = this.a;
                jzk jzkVar = (jzk) obj;
                jzkVar.childFragmentInjector = mifVar7.F();
                jzkVar.c = (isi) mifVar7.fB.b();
                break;
            case 7:
                mif mifVar8 = this.a;
                jzl jzlVar = (jzl) obj;
                jzlVar.childFragmentInjector = mifVar8.F();
                jzlVar.c = (isi) mifVar8.fB.b();
                break;
            case 8:
                mif mifVar9 = this.a;
                GenericComponentPageActivity genericComponentPageActivity = (GenericComponentPageActivity) obj;
                genericComponentPageActivity.R = mifVar9.F();
                genericComponentPageActivity.n = (lfn) mifVar9.bG.b();
                genericComponentPageActivity.o = (lie) mifVar9.bR.b();
                genericComponentPageActivity.p = (jaf) mifVar9.tj.b();
                genericComponentPageActivity.q = mifVar9.s();
                genericComponentPageActivity.u = (jan) mifVar9.gw.b();
                genericComponentPageActivity.r = (itk) mifVar9.gl.b();
                genericComponentPageActivity.v = (gag) mifVar9.gm.b();
                genericComponentPageActivity.s = mifVar9.G();
                genericComponentPageActivity.t = mifVar9.i();
                genericComponentPageActivity.a = mifVar9.getAccountRepository();
                genericComponentPageActivity.b = jvy.a(mifVar9.a);
                genericComponentPageActivity.m = (kwy) mifVar9.nR.b();
                genericComponentPageActivity.c = mifVar9.m();
                genericComponentPageActivity.d = (kmo) mifVar9.tL.b();
                genericComponentPageActivity.C = (jzs) mifVar9.ok.b();
                genericComponentPageActivity.w = mifVar9.p();
                break;
            case 9:
                ((jzn) obj).c = (jzs) this.a.ok.b();
                break;
            case 10:
                mif mifVar10 = this.a;
                GenericStreamDialogFragment genericStreamDialogFragment = (GenericStreamDialogFragment) obj;
                genericStreamDialogFragment.injector = mifVar10.F();
                genericStreamDialogFragment.streamPagePresenter = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar10.l(), (mjb) mifVar10.wD.b(), (gag) mifVar10.gm.b(), (kmo) mifVar10.tL.b());
                genericStreamDialogFragment.veLogger = (jaf) mifVar10.tj.b();
                genericStreamDialogFragment.dialogVisualElement = mif.aj();
                break;
            case 11:
                ((jzp) obj).c = new kuw((yfo) this.a.pt, (yfo) iyf.a, (char[]) null);
                break;
            case 12:
                mif mifVar11 = this.a;
                mns mnsVar = (mns) obj;
                mnsVar.androidInjector = mifVar11.F();
                mnsVar.a = new moa(new ntp((Object) mnz.a));
                mnsVar.b = (nqq) mifVar11.th.b();
                break;
            case 13:
                mif mifVar12 = this.a;
                GtvExperienceInitializer gtvExperienceInitializer = (GtvExperienceInitializer) obj;
                gtvExperienceInitializer.a = mifVar12.getAccountRepository();
                gtvExperienceInitializer.b = mifVar12.n();
                gtvExperienceInitializer.c = (SharedPreferences) mifVar12.bm.b();
                gtvExperienceInitializer.h = mifVar12.ai();
                gtvExperienceInitializer.d = mifVar12.o();
                gtvExperienceInitializer.i = new kwy((lyz) mifVar12.bS.b(), (byte[]) null);
                gtvExperienceInitializer.e = (lfn) mifVar12.bG.b();
                gtvExperienceInitializer.f = (Executor) mifVar12.eL.b();
                gtvExperienceInitializer.g = mifVar12.X();
                break;
            case 14:
                mif mifVar13 = this.a;
                GtvLauncherActivity gtvLauncherActivity = (GtvLauncherActivity) obj;
                gtvLauncherActivity.R = mifVar13.F();
                gtvLauncherActivity.a = xcl.a(mifVar13.zt);
                gtvLauncherActivity.g = (irc) mifVar13.gn.b();
                gtvLauncherActivity.f = (irc) mifVar13.ob.b();
                gtvLauncherActivity.b = (lie) mifVar13.bR.b();
                gtvLauncherActivity.c = (lfn) mifVar13.bG.b();
                gtvLauncherActivity.d = mifVar13.L();
                gtvLauncherActivity.e = mifVar13.K();
                gtvLauncherActivity.h = (gag) mifVar13.gm.b();
                break;
            case 15:
                mif mifVar14 = this.a;
                HomeLauncherActivity homeLauncherActivity = (HomeLauncherActivity) obj;
                homeLauncherActivity.m = mifVar14.F();
                homeLauncherActivity.i = (nqq) mifVar14.th.b();
                homeLauncherActivity.a = (lfn) mifVar14.bG.b();
                homeLauncherActivity.b = (SharedPreferences) mifVar14.bm.b();
                kqf kqfVar2 = mifVar14.a;
                homeLauncherActivity.j = new lkt(rgq.c(kqfVar2), kfm.a(kqfVar2), jvy.a(kqfVar2), kqu.c(kqfVar2), (lie) mifVar14.bR.b(), mifVar14.Ch);
                homeLauncherActivity.k = new isy((qsa) mifVar14.BG.b(), mifVar14.getAccountRepository(), new xic(rgq.c(kqfVar2)));
                new rbi(xcl.a(mifVar14.it), xcl.a(mifVar14.iv));
                qjq qjqVar = (qjq) mifVar14.il.b();
                qqo qqoVar = new qqo((qjy) mifVar14.mn.b(), mifVar14.ae(), qle.c(xcl.a(mifVar14.iw)), rgq.c(kqfVar2), new qps(), trk.a, mifVar14.jj);
                mifVar14.ae();
                homeLauncherActivity.l = new kuw(new cb(qjqVar, qqoVar), jbr.t());
                homeLauncherActivity.c = new jaq(rgq.c(kqfVar2));
                homeLauncherActivity.d = mifVar14.J();
                homeLauncherActivity.e = mifVar14.c();
                homeLauncherActivity.h = (iop) mifVar14.Dp.b();
                homeLauncherActivity.f = new mig(0);
                homeLauncherActivity.g = mifVar14.Q();
                break;
            case 16:
                mif mifVar15 = this.a;
                WatchActivity.InitiallyLandscape initiallyLandscape = (WatchActivity.InitiallyLandscape) obj;
                initiallyLandscape.R = mifVar15.F();
                initiallyLandscape.a = (lfn) mifVar15.bG.b();
                initiallyLandscape.i = mifVar15.getAccountRepository();
                initiallyLandscape.j = (ldv) mifVar15.bs.b();
                initiallyLandscape.k = (mcw) mifVar15.eU.b();
                initiallyLandscape.l = (lfn) mifVar15.bG.b();
                initiallyLandscape.m = (lie) mifVar15.bR.b();
                initiallyLandscape.n = (idb) mifVar15.fX.b();
                initiallyLandscape.o = (mjl) mifVar15.vT.b();
                initiallyLandscape.p = new mjo();
                initiallyLandscape.H = (nqq) mifVar15.th.b();
                initiallyLandscape.q = mifVar15.H();
                initiallyLandscape.r = mifVar15.O();
                initiallyLandscape.s = mifVar15.W();
                initiallyLandscape.t = (ino) mifVar15.oZ.b();
                initiallyLandscape.u = (pkg) mifVar15.tf.b();
                initiallyLandscape.v = mifVar15.p();
                initiallyLandscape.w = (itk) mifVar15.gl.b();
                initiallyLandscape.I = (gag) mifVar15.gm.b();
                initiallyLandscape.x = (mem) mifVar15.bQ.b();
                initiallyLandscape.F = mifVar15.F();
                initiallyLandscape.b = mifVar15.F();
                break;
            case 17:
                mif mifVar16 = this.a;
                InlineLocalWatchFragment inlineLocalWatchFragment = (InlineLocalWatchFragment) obj;
                inlineLocalWatchFragment.androidInjector = mifVar16.F();
                inlineLocalWatchFragment.accountManagerWrapper = (ldv) mifVar16.bs.b();
                inlineLocalWatchFragment.directorFactory = (lkt) mifVar16.Dh.b();
                inlineLocalWatchFragment.preparationLogger = new lnu((lfn) mifVar16.bG.b(), (lny) mifVar16.CO.b());
                inlineLocalWatchFragment.playUlexLogger = (san) mifVar16.dG.b();
                inlineLocalWatchFragment.mediaRouteProviderCompat = new mjo();
                inlineLocalWatchFragment.mediaRouteManager = (mjl) mifVar16.vT.b();
                inlineLocalWatchFragment.networkStatus = (mem) mifVar16.bQ.b();
                inlineLocalWatchFragment.eventLogger = (lie) mifVar16.bR.b();
                inlineLocalWatchFragment.accountSupplier = mifVar16.getAccountRepository();
                inlineLocalWatchFragment.storyboardHelperFactory = new mru(mifVar16.bF, mifVar16.Di, mifVar16.Dj);
                inlineLocalWatchFragment.config = (lfn) mifVar16.bG.b();
                inlineLocalWatchFragment.gmsHelpUtil = mifVar16.p();
                break;
            case 18:
                mif mifVar17 = this.a;
                InternalSettingsActivity internalSettingsActivity = (InternalSettingsActivity) obj;
                internalSettingsActivity.R = mifVar17.F();
                internalSettingsActivity.a = (lfn) mifVar17.bG.b();
                internalSettingsActivity.t = (lfn) mifVar17.bG.b();
                internalSettingsActivity.j = (lyz) mifVar17.bS.b();
                internalSettingsActivity.b = (ExecutorService) mifVar17.bE.b();
                internalSettingsActivity.l = mifVar17.as();
                internalSettingsActivity.c = (leu) mifVar17.fg.b();
                internalSettingsActivity.d = (lgr) mifVar17.cZ.b();
                internalSettingsActivity.e = mifVar17.o();
                internalSettingsActivity.f = (lht) mifVar17.dw.b();
                internalSettingsActivity.k = (ihq) mifVar17.nY.b();
                internalSettingsActivity.i = mifVar17.F();
                break;
            case 19:
                mif mifVar18 = this.a;
                LauncherActivity launcherActivity = (LauncherActivity) obj;
                launcherActivity.m = mifVar18.F();
                launcherActivity.a = (lfn) mifVar18.bG.b();
                launcherActivity.b = (lie) mifVar18.bR.b();
                launcherActivity.c = (ldv) mifVar18.bs.b();
                launcherActivity.d = mifVar18.getAccountRepository();
                kqf kqfVar3 = mifVar18.a;
                launcherActivity.e = jvy.a(kqfVar3);
                launcherActivity.f = mifVar18.c();
                launcherActivity.i = mifVar18.ai();
                launcherActivity.j = new lkt(rgq.c(kqfVar3), kfm.a(kqfVar3), jvy.a(kqfVar3), kqu.c(kqfVar3), (lie) mifVar18.bR.b(), mifVar18.Ch);
                launcherActivity.g = mifVar18.L();
                launcherActivity.h = new xmm(rgq.c(kqfVar3));
                break;
            default:
                mif mifVar19 = this.a;
                mnt mntVar = (mnt) obj;
                mntVar.a = mifVar19.F();
                mntVar.c = (irc) mifVar19.gn.b();
                break;
        }
    }
}

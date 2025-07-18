package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities.VirtualRemoteActivity;
import com.google.android.apps.googletv.app.presentation.widgets.toppicks.TopPicksWidgetReceiver;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;
import com.google.android.apps.play.movies.common.presenter.activity.TrailerLauncherActivity;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import com.google.android.apps.play.movies.common.store.sync.SyncService;
import com.google.android.apps.play.movies.mobile.usecase.watch.StreamingWarningDialogActivity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhx implements xby {
    private final mif a;
    private final /* synthetic */ int b;

    public mhx(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        switch (this.b) {
            case 0:
                mif mifVar = this.a;
                mrn mrnVar = (mrn) obj;
                mrnVar.androidInjector = mifVar.F();
                mrnVar.d = (lfn) mifVar.bG.b();
                mrnVar.e = (Executor) mifVar.bF.b();
                mrnVar.f = (ldv) mifVar.bs.b();
                mrnVar.g = (mjl) mifVar.vT.b();
                mrnVar.r = (lsc) mifVar.Cw.b();
                mrnVar.h = (mab) mifVar.ev.b();
                mrnVar.i = mifVar.q();
                mrnVar.j = new lnu((lfn) mifVar.bG.b(), (lny) mifVar.CO.b());
                mrnVar.s = kfm.c();
                mrnVar.k = (san) mifVar.dG.b();
                mrnVar.v = new paq(mifVar.bj, mifVar.bm, mifVar.bR, mifVar.CE, null, null);
                mrnVar.u = new moz((yfo) mifVar.bG, (yfo) mifVar.bw, (yfo) mifVar.ci, (yfo) mifVar.bm, (yfo) mifVar.Dl, (yfo) mifVar.Cy, (yfo) mifVar.bE, (yfo) mifVar.bF, (byte[]) null);
                mrnVar.l = new mru(mifVar.bF, mifVar.Di, mifVar.Dj);
                mrnVar.w = new lkt((lqs) mifVar.CH.b(), (lfz) mifVar.cv.b(), mifVar.e(), (Executor) mifVar.bF.b(), mifVar.as(), (mem) mifVar.bQ.b());
                mrnVar.m = new mta(mifVar.bG, mifVar.bF, mifVar.zT, mifVar.CC, mifVar.Dm, mifVar.bR, mifVar.bs, mifVar.Cx, mifVar.cu, mifVar.dG);
                mrnVar.n = (SharedPreferences) mifVar.bm.b();
                mrnVar.o = (mkc) mifVar.BT.b();
                break;
            case 1:
                ((TransferService.Receiver) obj).a = (lgr) this.a.cZ.b();
                break;
            case 2:
                mif mifVar2 = this.a;
                SearchQueryPageActivity searchQueryPageActivity = (SearchQueryPageActivity) obj;
                searchQueryPageActivity.R = mifVar2.F();
                searchQueryPageActivity.n = (lfn) mifVar2.bG.b();
                searchQueryPageActivity.o = (lie) mifVar2.bR.b();
                searchQueryPageActivity.p = (jaf) mifVar2.tj.b();
                searchQueryPageActivity.q = mifVar2.s();
                searchQueryPageActivity.u = (jan) mifVar2.gw.b();
                searchQueryPageActivity.r = (itk) mifVar2.gl.b();
                searchQueryPageActivity.v = (gag) mifVar2.gm.b();
                searchQueryPageActivity.s = mifVar2.G();
                searchQueryPageActivity.t = mifVar2.i();
                searchQueryPageActivity.b = new kuw((lfn) mifVar2.bG.b(), mifVar2.i());
                searchQueryPageActivity.c = (irc) mifVar2.gn.b();
                break;
            case 3:
                mif mifVar3 = this.a;
                com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity searchQueryPageActivity2 = (com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity) obj;
                searchQueryPageActivity2.R = mifVar3.F();
                searchQueryPageActivity2.n = (lfn) mifVar3.bG.b();
                searchQueryPageActivity2.o = (lie) mifVar3.bR.b();
                searchQueryPageActivity2.p = (jaf) mifVar3.tj.b();
                searchQueryPageActivity2.q = mifVar3.s();
                searchQueryPageActivity2.u = (jan) mifVar3.gw.b();
                searchQueryPageActivity2.r = (itk) mifVar3.gl.b();
                searchQueryPageActivity2.v = (gag) mifVar3.gm.b();
                searchQueryPageActivity2.s = mifVar3.G();
                searchQueryPageActivity2.t = mifVar3.i();
                searchQueryPageActivity2.a = new jti(new hfw(jtm.a), (jzs) mifVar3.ok.b(), mifVar3.l());
                searchQueryPageActivity2.e = (mta) mifVar3.Fj.b();
                searchQueryPageActivity2.b = mifVar3.getAccountRepository();
                searchQueryPageActivity2.c = (ldv) mifVar3.bs.b();
                searchQueryPageActivity2.d = (idy) mifVar3.Dr.b();
                break;
            case 4:
                mif mifVar4 = this.a;
                kfh kfhVar = (kfh) obj;
                kfhVar.a = mifVar4.i();
                kfhVar.k = new isy(mifVar4.Fj, mifVar4.bw, mifVar4.fG, mifVar4.gi, (byte[]) null);
                break;
            case 5:
                mif mifVar5 = this.a;
                SearchResultsPageActivity searchResultsPageActivity = (SearchResultsPageActivity) obj;
                searchResultsPageActivity.R = mifVar5.F();
                searchResultsPageActivity.n = (lfn) mifVar5.bG.b();
                searchResultsPageActivity.o = (lie) mifVar5.bR.b();
                searchResultsPageActivity.p = (jaf) mifVar5.tj.b();
                searchResultsPageActivity.q = mifVar5.s();
                searchResultsPageActivity.u = (jan) mifVar5.gw.b();
                searchResultsPageActivity.r = (itk) mifVar5.gl.b();
                searchResultsPageActivity.v = (gag) mifVar5.gm.b();
                searchResultsPageActivity.s = mifVar5.G();
                searchResultsPageActivity.t = mifVar5.i();
                searchResultsPageActivity.a = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar5.l(), (mjb) mifVar5.wD.b(), (gag) mifVar5.gm.b(), (kmo) mifVar5.tL.b());
                searchResultsPageActivity.b = mifVar5.m();
                searchResultsPageActivity.c = (kmo) mifVar5.tL.b();
                searchResultsPageActivity.f = (mta) mifVar5.Fj.b();
                break;
            case 6:
                mif mifVar6 = this.a;
                kfk kfkVar = (kfk) obj;
                kfkVar.a = mifVar6.F();
                kfkVar.c = new kfw();
                kfkVar.d = new kdh(kfl.a);
                rgq.c(mifVar6.a);
                kfkVar.b = new kfn(new kdh(kfq.a), new kfs(new kdh(kfv.a)));
                break;
            case 7:
                mif mifVar7 = this.a;
                kfz kfzVar = (kfz) obj;
                kfzVar.a = new xlx(rgq.c(mifVar7.a));
                kfzVar.b = mifVar7.F();
                kfzVar.c = (ldv) mifVar7.bs.b();
                kfzVar.k = (she) mifVar7.Fn.b();
                kfzVar.d = (lfn) mifVar7.bG.b();
                kfzVar.l = (jzs) mifVar7.ok.b();
                kfzVar.e = mif.aj();
                kfzVar.f = (pkg) mifVar7.tf.b();
                kfzVar.g = (pke) mifVar7.tg.b();
                break;
            case 8:
                mif mifVar8 = this.a;
                SherlogMenuButton sherlogMenuButton = (SherlogMenuButton) obj;
                sherlogMenuButton.a = mifVar8.F();
                sherlogMenuButton.b = (kmo) mifVar8.tL.b();
                sherlogMenuButton.c = mifVar8.p();
                break;
            case 9:
                mif mifVar9 = this.a;
                StreamingWarningDialogActivity streamingWarningDialogActivity = (StreamingWarningDialogActivity) obj;
                streamingWarningDialogActivity.a = mifVar9.F();
                streamingWarningDialogActivity.b = (mem) mifVar9.bQ.b();
                streamingWarningDialogActivity.c = (SharedPreferences) mifVar9.bm.b();
                break;
            case 10:
                mif mifVar10 = this.a;
                SyncService syncService = (SyncService) obj;
                syncService.b = (ldv) mifVar10.bs.b();
                syncService.c = (mab) mifVar10.ev.b();
                syncService.d = (mcw) mifVar10.eU.b();
                syncService.e = (SharedPreferences) mifVar10.bm.b();
                syncService.f = new ehq(6);
                syncService.g = (lie) mifVar10.bR.b();
                break;
            case 11:
                mif mifVar11 = this.a;
                kan kanVar = (kan) obj;
                kanVar.androidInjector = mifVar11.F();
                kanVar.b = (jzs) mifVar11.ok.b();
                kanVar.a = (jaf) mifVar11.tj.b();
                break;
            case 12:
                ((kam) obj).c = (jzs) this.a.ok.b();
                break;
            case 13:
                mif mifVar12 = this.a;
                kap kapVar = (kap) obj;
                kapVar.androidInjector = mifVar12.F();
                kapVar.g = (jzs) mifVar12.ok.b();
                kapVar.c = (jaf) mifVar12.tj.b();
                kapVar.d = mifVar12.M();
                kapVar.e = mifVar12.G();
                kapVar.h = (jwq) mifVar12.tQ.b();
                kapVar.f = mifVar12.i();
                break;
            case 14:
                mif mifVar13 = this.a;
                klm klmVar = (klm) obj;
                klmVar.i = (iyz) mifVar13.gr.b();
                klmVar.j = (kgu) mifVar13.FO.b();
                klmVar.k = (mdw) mifVar13.zB.b();
                break;
            case 15:
                mif mifVar14 = this.a;
                TopPicksWidgetReceiver topPicksWidgetReceiver = (TopPicksWidgetReceiver) obj;
                topPicksWidgetReceiver.c = xcl.a(mifVar14.zt);
                topPicksWidgetReceiver.d = (lie) mifVar14.bR.b();
                topPicksWidgetReceiver.f = (isy) mifVar14.zA.b();
                topPicksWidgetReceiver.e = mifVar14.P();
                break;
            case 16:
                mif mifVar15 = this.a;
                TrailerLauncherActivity trailerLauncherActivity = (TrailerLauncherActivity) obj;
                trailerLauncherActivity.m = mifVar15.F();
                trailerLauncherActivity.a = (ldv) mifVar15.bs.b();
                kqf kqfVar = mifVar15.a;
                trailerLauncherActivity.b = new lkt(rgq.c(kqfVar), kfm.a(kqfVar), jvy.a(kqfVar), kqu.c(kqfVar), (lie) mifVar15.bR.b(), mifVar15.Ch);
                break;
            case 17:
                mif mifVar16 = this.a;
                jcm jcmVar = (jcm) obj;
                jcmVar.androidInjector = mifVar16.F();
                jcmVar.b = (lfn) mifVar16.bG.b();
                jcmVar.c = mifVar16.getAccountRepository();
                jcmVar.d = (mem) mifVar16.bQ.b();
                jcmVar.e = (Executor) mifVar16.bF.b();
                jcmVar.x = (lsc) mifVar16.Cw.b();
                jcmVar.f = mifVar16.g();
                jcmVar.g = mifVar16.d();
                jcmVar.h = (ldv) mifVar16.bs.b();
                jcmVar.i = mifVar16.R();
                jcmVar.z = (jwq) mifVar16.tQ.b();
                jcmVar.A = (kgu) mifVar16.Fr.b();
                jcmVar.B = (kw) mifVar16.Fs.b();
                jcmVar.j = (jcc) mifVar16.Ft.b();
                jcmVar.D = (kuw) mifVar16.nL.b();
                jcmVar.y = (isi) mifVar16.fB.b();
                jcmVar.k = (jbo) mifVar16.Fv.b();
                break;
            case 18:
                ((mkg) obj).c = this.a.F();
                break;
            case 19:
                mif mifVar17 = this.a;
                mqj mqjVar = (mqj) obj;
                mqjVar.R = mifVar17.F();
                mqjVar.a = (lfn) mifVar17.bG.b();
                mqjVar.t = (lfn) mifVar17.bG.b();
                break;
            default:
                mif mifVar18 = this.a;
                VirtualRemoteActivity virtualRemoteActivity = (VirtualRemoteActivity) obj;
                virtualRemoteActivity.R = mifVar18.F();
                virtualRemoteActivity.n = (lfn) mifVar18.bG.b();
                virtualRemoteActivity.o = (lie) mifVar18.bR.b();
                virtualRemoteActivity.p = (jaf) mifVar18.tj.b();
                virtualRemoteActivity.q = mifVar18.s();
                virtualRemoteActivity.u = (jan) mifVar18.gw.b();
                virtualRemoteActivity.r = (itk) mifVar18.gl.b();
                virtualRemoteActivity.v = (gag) mifVar18.gm.b();
                virtualRemoteActivity.s = mifVar18.G();
                virtualRemoteActivity.t = mifVar18.i();
                virtualRemoteActivity.b = new kuw((lfn) mifVar18.bG.b(), mifVar18.i());
                virtualRemoteActivity.a = new kiq(rgq.c(mifVar18.a), (itk) mifVar18.gl.b(), (gag) mifVar18.gm.b());
                break;
        }
    }
}

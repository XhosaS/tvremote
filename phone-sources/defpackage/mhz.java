package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.play.movies.common.service.pinning.TransferService;
import com.google.android.apps.play.movies.mobile.usecase.watch.RemoteWatchActivity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mhz implements xby {
    final xcq a;
    final xcq b;
    final xcq c;
    final xcq d;
    final xcq e;
    private final mif f;
    private final /* synthetic */ int g;

    public mhz(mif mifVar, int i, byte[] bArr) {
        this.g = i;
        this.f = mifVar;
        xcq xcqVar = mifVar.bF;
        mrv mrvVar = new mrv(xcqVar, mifVar.Di, mifVar.Dj);
        this.a = mrvVar;
        xcq xcqVar2 = mifVar.bs;
        this.e = new lsd(mrvVar, xcqVar2, xcqVar, mifVar.Cw, 16, (float[][]) null);
        xcq xcqVar3 = mifVar.bG;
        mtb mtbVar = new mtb(xcqVar3, xcqVar, mifVar.zT, mifVar.CC, mifVar.Dm, mifVar.bR, xcqVar2, mifVar.Cx, mifVar.cu, mifVar.dG);
        this.c = mtbVar;
        xcq xcqVar4 = mifVar.bw;
        xcq xcqVar5 = mifVar.ci;
        xcq xcqVar6 = mifVar.bm;
        lwe lweVar = new lwe(xcqVar3, xcqVar4, xcqVar5, xcqVar6, mifVar.Dl, mifVar.Cy, mifVar.bE, xcqVar);
        this.d = lweVar;
        this.b = new lsd((xcq) mtbVar, (xcq) lweVar, xcqVar3, xcqVar6, 15, (short[][][]) null);
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        if (this.g == 0) {
            xcq xcqVar = this.a;
            xcq xcqVar2 = this.e;
            mif mifVar = this.f;
            TransferService transferService = (TransferService) obj;
            transferService.j = new mta(mifVar.bj, mifVar.bQ, mifVar.Ck, mifVar.bS, mifVar.bG, mifVar.bm, xcqVar, mifVar.fb, mifVar.cZ, xcqVar2, null, null);
            lfn lfnVar = (lfn) mifVar.bG.b();
            Executor executor = (Executor) mifVar.bF.b();
            mem memVar = (mem) mifVar.bQ.b();
            SharedPreferences sharedPreferences = (SharedPreferences) mifVar.bm.b();
            kqf kqfVar = mifVar.a;
            transferService.d = new ljn(lfnVar, executor, memVar, sharedPreferences, rgq.c(kqfVar), mifVar.V());
            transferService.e = (SharedPreferences) mifVar.bm.b();
            transferService.f = kqm.a(kqfVar);
            transferService.i = (ljg) mifVar.zO.b();
            transferService.g = rgq.c(kqfVar);
            transferService.h = (lfn) mifVar.bG.b();
            return;
        }
        mif mifVar2 = this.f;
        RemoteWatchActivity remoteWatchActivity = (RemoteWatchActivity) obj;
        remoteWatchActivity.R = mifVar2.F();
        remoteWatchActivity.a = (lfn) mifVar2.bG.b();
        new lhr(mifVar2.bS, mifVar2.bE, mifVar2.bF, mifVar2.BQ, mifVar2.dz, mifVar2.ct, mifVar2.ev);
        remoteWatchActivity.p = new mjo();
        remoteWatchActivity.b = (mjl) mifVar2.vT.b();
        remoteWatchActivity.c = new mjo();
        remoteWatchActivity.d = new msr((ldv) mifVar2.bs.b(), (lfz) mifVar2.cv.b(), mifVar2.q(), (Executor) mifVar2.bF.b(), (Executor) mifVar2.eL.b(), (lfn) mifVar2.bG.b(), (SharedPreferences) mifVar2.bm.b(), new xhx(rgq.c(mifVar2.a)), mifVar2.e());
        remoteWatchActivity.e = mifVar2.F();
        remoteWatchActivity.f = mifVar2.e();
        remoteWatchActivity.g = (SharedPreferences) mifVar2.bm.b();
        remoteWatchActivity.h = (Executor) mifVar2.bF.b();
        remoteWatchActivity.i = mifVar2.p();
        remoteWatchActivity.j = (san) mifVar2.dG.b();
        remoteWatchActivity.k = (lie) mifVar2.bR.b();
        remoteWatchActivity.o = kfm.c();
        remoteWatchActivity.l = (ldv) mifVar2.bs.b();
    }

    public mhz(mif mifVar, int i) {
        this.g = i;
        this.f = mifVar;
        xcq xcqVar = mifVar.bG;
        this.a = new jai(xcqVar, mifVar.bF, mifVar.bQ, mifVar.bm, mifVar.bj, mifVar.bP, 8, (float[]) null);
        lsm lsmVar = new lsm(xcqVar, mifVar.bR, mifVar.Cl, 4, (int[]) null);
        this.b = lsmVar;
        xcq xcqVarA = xct.a(mifVar.ee);
        this.c = xcqVarA;
        xcq xcqVar2 = mifVar.Cw;
        xcq xcqVar3 = mifVar.ci;
        xcq xcqVar4 = mifVar.bG;
        xcq xcqVar5 = mifVar.Cy;
        xcq xcqVar6 = mifVar.Cz;
        xcq xcqVar7 = mifVar.bS;
        lgl lglVar = new lgl(xcqVar2, xcqVar3, xcqVar4, xcqVar5, xcqVar6, xcqVar7, mifVar.bm, mifVar.ou, mifVar.cG, mifVar.cK, mifVar.bF, mifVar.oV, 3, (short[]) null);
        this.d = lglVar;
        this.e = new lgl(mifVar.bJ, lsmVar, mifVar.bs, mifVar.bR, xcqVar7, mifVar.ev, xcqVarA, mifVar.Co, mifVar.Cp, mifVar.dN, mifVar.Cr, lglVar, 4, (int[]) null);
    }
}

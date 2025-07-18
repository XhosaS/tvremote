package defpackage;

import com.google.android.apps.googletv.app.device.virtualremote.contentprovider.VirtualRemoteCapableDeviceProvider;
import com.google.android.apps.googletv.app.presentation.pages.webview.WebViewActivity;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mib implements xby {
    private final mif a;
    private final /* synthetic */ int b;

    public mib(mif mifVar, int i) {
        this.b = i;
        this.a = mifVar;
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            mif mifVar = this.a;
            WatchActionBootstrapActivity watchActionBootstrapActivity = (WatchActionBootstrapActivity) obj;
            watchActionBootstrapActivity.g = (ltw) mifVar.dz.b();
            watchActionBootstrapActivity.j = (kuw) mifVar.fm.b();
            watchActionBootstrapActivity.a = (lfn) mifVar.bG.b();
            watchActionBootstrapActivity.h = mifVar.ai();
            watchActionBootstrapActivity.i = (lyz) mifVar.bS.b();
            watchActionBootstrapActivity.b = (lie) mifVar.bR.b();
            watchActionBootstrapActivity.c = (ExecutorService) mifVar.bE.b();
            watchActionBootstrapActivity.d = (Executor) mifVar.bF.b();
            watchActionBootstrapActivity.e = (idr) mifVar.ct.b();
            watchActionBootstrapActivity.f = mifVar.F();
            return;
        }
        if (i == 1) {
            ((VirtualRemoteCapableDeviceProvider) obj).a = (itk) this.a.gl.b();
            return;
        }
        if (i != 2) {
            mif mifVar2 = this.a;
            WebViewActivity webViewActivity = (WebViewActivity) obj;
            webViewActivity.R = mifVar2.F();
            webViewActivity.a = (lfn) mifVar2.bG.b();
            webViewActivity.b = (kwy) mifVar2.nR.b();
            return;
        }
        mif mifVar3 = this.a;
        WatchActivity watchActivity = (WatchActivity) obj;
        watchActivity.R = mifVar3.F();
        watchActivity.a = (lfn) mifVar3.bG.b();
        watchActivity.i = mifVar3.getAccountRepository();
        watchActivity.j = (ldv) mifVar3.bs.b();
        watchActivity.k = (mcw) mifVar3.eU.b();
        watchActivity.l = (lfn) mifVar3.bG.b();
        watchActivity.m = (lie) mifVar3.bR.b();
        watchActivity.n = (idb) mifVar3.fX.b();
        watchActivity.o = (mjl) mifVar3.vT.b();
        watchActivity.p = new mjo();
        watchActivity.H = (nqq) mifVar3.th.b();
        watchActivity.q = mifVar3.H();
        watchActivity.r = mifVar3.O();
        watchActivity.s = mifVar3.W();
        watchActivity.t = (ino) mifVar3.oZ.b();
        watchActivity.u = (pkg) mifVar3.tf.b();
        watchActivity.v = mifVar3.p();
        watchActivity.w = (itk) mifVar3.gl.b();
        watchActivity.I = (gag) mifVar3.gm.b();
        watchActivity.x = (mem) mifVar3.bQ.b();
        watchActivity.F = mifVar3.F();
    }
}

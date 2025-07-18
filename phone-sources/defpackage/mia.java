package defpackage;

import android.content.SharedPreferences;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mia implements xby {
    final xcq a;
    private final mif b;

    public mia(mif mifVar) {
        this.b = mifVar;
        this.a = new jbw(mifVar.sS, 12);
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        jdd jddVar = (jdd) obj;
        mif mifVar = this.b;
        jddVar.androidInjector = mifVar.F();
        jddVar.c = (lfn) mifVar.bG.b();
        jddVar.d = mifVar.getAccountRepository();
        jddVar.e = (ldv) mifVar.bs.b();
        jddVar.f = mifVar.q();
        jddVar.af = (lzw) mifVar.ed.b();
        jddVar.al = (lqs) mifVar.CH.b();
        jddVar.g = mifVar.e();
        jddVar.h = (ExecutorService) mifVar.bE.b();
        jddVar.i = (Executor) mifVar.bF.b();
        jddVar.ag = (lsc) mifVar.Cw.b();
        jddVar.ah = new jdr((lfn) mifVar.bG.b(), mifVar.ag(), (euc) mifVar.oH.b(), (ouy) mifVar.oS.b(), (oum) mifVar.oE.b(), mifVar.bU, Optional.of((ouc) mifVar.oT.b()), (nuh) mifVar.oV.b(), (lhr) mifVar.ov.b(), new jec((ouy) mifVar.oS.b(), mifVar.bU, (nuh) mifVar.oV.b(), (lhr) mifVar.ov.b(), (String) mifVar.bJ.b(), (lfn) mifVar.bG.b()), (kuw) mifVar.oF.b(), (isf) mifVar.pd.b(), (ikf) mifVar.pe.b(), (iyz) mifVar.gr.b(), mifVar.getAccountRepository());
        jddVar.j = (String) mifVar.bJ.b();
        jddVar.k = new xlb(rgq.c(mifVar.a));
        jddVar.l = mifVar.R();
        jddVar.m = (ino) mifVar.oZ.b();
        jddVar.aq = (irc) mifVar.Fx.b();
        jddVar.ai = (ltw) mifVar.dz.b();
        jddVar.aj = (isi) mifVar.fB.b();
        jddVar.n = mifVar.getItagInfoStore();
        jddVar.o = (ljj) mifVar.ou.b();
        jddVar.am = (lhr) mifVar.ov.b();
        jddVar.aw = (kuw) mifVar.oF.b();
        jddVar.ak = (jan) mifVar.gw.b();
        jddVar.p = mifVar.g();
        jddVar.q = mifVar.d();
        jddVar.r = (mem) mifVar.bQ.b();
        jddVar.ar = (kw) mifVar.Fs.b();
        jddVar.av = new cvw((Object) this.a);
        jddVar.ap = (kgu) mifVar.Fr.b();
        jddVar.s = (SharedPreferences) mifVar.bm.b();
        jddVar.t = (iea) mifVar.os.b();
        jddVar.ao = (jwq) mifVar.tQ.b();
        jddVar.u = (jcn) mifVar.Fy.b();
        jddVar.ax = (kuw) mifVar.nL.b();
        jddVar.Z = (jbo) mifVar.Fv.b();
    }
}

package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgz implements xby {
    final xcq a;
    private final mif b;
    private final /* synthetic */ int c;

    public mgz(mif mifVar, int i) {
        this.c = i;
        this.b = mifVar;
        this.a = new ins(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, mifVar.bw, 7, (byte[][]) null);
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        switch (this.c) {
            case 0:
                jyw jywVar = (jyw) obj;
                jywVar.j = new kuw(this.a, iyf.a);
                mif mifVar = this.b;
                jywVar.a = mifVar.j();
                jywVar.b = (ino) mifVar.oZ.b();
                jywVar.c = rgq.c(mifVar.a);
                break;
            case 1:
                ((jzd) obj).b = new kuw(this.a, iyf.a);
                break;
            case 2:
                mif mifVar2 = this.b;
                mmk mmkVar = (mmk) obj;
                mmkVar.androidInjector = mifVar2.F();
                mmkVar.h = (lfn) mifVar2.bG.b();
                mmkVar.i = (lie) mifVar2.bR.b();
                mmkVar.O = (nqq) mifVar2.th.b();
                mmkVar.j = mifVar2.getAccountRepository();
                mmkVar.k = mifVar2.getRepositories();
                mmkVar.l = (iea) mifVar2.pS.b();
                mmkVar.m = (iea) mifVar2.os.b();
                mmkVar.Q = (mta) mifVar2.uD.b();
                mmkVar.G = mifVar2.ai();
                mmkVar.n = (iea) mifVar2.CC.b();
                mmkVar.H = mifVar2.ah();
                mmkVar.o = (SharedPreferences) mifVar2.bm.b();
                mmkVar.p = (mjl) mifVar2.vT.b();
                mmkVar.I = (jan) mifVar2.gw.b();
                mmkVar.q = (itk) mifVar2.gl.b();
                mmkVar.R = (gag) mifVar2.gm.b();
                mmkVar.r = (ExecutorService) mifVar2.bE.b();
                mmkVar.s = (Executor) mifVar2.bF.b();
                mmkVar.M = (lfz) mifVar2.cv.b();
                mmkVar.J = (lyz) mifVar2.bS.b();
                mmkVar.K = (lxp) mifVar2.dv.b();
                mmkVar.L = (lxm) mifVar2.ea.b();
                mmkVar.t = (mem) mifVar2.bQ.b();
                mmkVar.N = new lqs((iea) mifVar2.pS.b(), (lxp) mifVar2.dv.b(), 9);
                mmkVar.u = (mcd) mifVar2.rR.b();
                mmkVar.v = (mcy) mifVar2.zT.b();
                kqf kqfVar = mifVar2.a;
                mmkVar.w = jvy.a(kqfVar);
                mmkVar.S = new gag(mifVar2.cv, mifVar2.ci, mifVar2.bw, this.a, mifVar2.tG, (short[]) null);
                mmkVar.P = mifVar2.an();
                mmkVar.T = new gag(mifVar2.getAccountRepository(), mifVar2.ak(), mifVar2.al(), (Executor) mifVar2.bF.b(), (ids) mifVar2.ry.b());
                mmkVar.x = mifVar2.I();
                mmkVar.y = mifVar2.T();
                mmkVar.z = mifVar2.S();
                mmkVar.A = mifVar2.H();
                mmkVar.B = mifVar2.N();
                mmkVar.C = new xmk(rgq.c(kqfVar));
                mmkVar.D = mifVar2.U();
                mmkVar.E = (pkg) mifVar2.tf.b();
                mmkVar.F = mifVar2.s();
                break;
            case 3:
                mif mifVar3 = this.b;
                mmp mmpVar = (mmp) obj;
                mmpVar.androidInjector = mifVar3.F();
                mmpVar.c = (lfn) mifVar3.bG.b();
                mmpVar.d = (lie) mifVar3.bR.b();
                mmpVar.e = mifVar3.getAccountRepository();
                mmpVar.f = mifVar3.getRepositories();
                mmpVar.g = (iea) mifVar3.pS.b();
                mmpVar.h = (iea) mifVar3.os.b();
                mmpVar.B = (mta) mifVar3.uD.b();
                mmpVar.v = mifVar3.ai();
                mmpVar.i = (iea) mifVar3.CC.b();
                mmpVar.w = mifVar3.ah();
                mmpVar.j = (SharedPreferences) mifVar3.bm.b();
                mmpVar.k = (ExecutorService) mifVar3.bE.b();
                mmpVar.l = (Executor) mifVar3.bF.b();
                mmpVar.z = (lfz) mifVar3.cv.b();
                mmpVar.x = (lyz) mifVar3.bS.b();
                mmpVar.y = (lxp) mifVar3.dv.b();
                mmpVar.m = (mcd) mifVar3.rR.b();
                mmpVar.n = (mcy) mifVar3.zT.b();
                mmpVar.C = new gag(mifVar3.cv, mifVar3.ci, mifVar3.bw, this.a, mifVar3.tG, (short[]) null);
                mmpVar.A = mifVar3.an();
                mmpVar.o = mifVar3.I();
                mmpVar.p = mifVar3.T();
                mmpVar.q = mifVar3.S();
                mmpVar.r = mifVar3.N();
                mmpVar.s = mifVar3.U();
                mmpVar.t = (pkg) mifVar3.tf.b();
                mmpVar.u = mifVar3.s();
                break;
            case 4:
                kcw kcwVar = (kcw) obj;
                kcwVar.f = new kuw(this.a, iyf.a);
                kcwVar.b = this.b.j();
                break;
            case 5:
                ((kdx) obj).e = new kuw(this.a, iyf.a);
                break;
            case 6:
                ((keg) obj).d = new kuw(this.a, iyf.a);
                break;
            case 7:
                ((keh) obj).e = new kuw(this.a, iyf.a);
                break;
            default:
                mif mifVar4 = this.b;
                mmv mmvVar = (mmv) obj;
                mmvVar.androidInjector = mifVar4.F();
                mmvVar.c = (lfn) mifVar4.bG.b();
                mmvVar.d = (lie) mifVar4.bR.b();
                mmvVar.e = mifVar4.getAccountRepository();
                mmvVar.f = mifVar4.getRepositories();
                mmvVar.g = (iea) mifVar4.pS.b();
                mmvVar.h = (iea) mifVar4.os.b();
                mmvVar.H = (mta) mifVar4.uD.b();
                mmvVar.i = mifVar4.getRepositories();
                mmvVar.A = mifVar4.ai();
                mmvVar.j = (iea) mifVar4.CC.b();
                mmvVar.B = mifVar4.ah();
                mmvVar.k = (SharedPreferences) mifVar4.bm.b();
                mmvVar.C = (jan) mifVar4.gw.b();
                mmvVar.l = (itk) mifVar4.gl.b();
                mmvVar.I = (gag) mifVar4.gm.b();
                mmvVar.m = (ExecutorService) mifVar4.bE.b();
                mmvVar.n = (Executor) mifVar4.bF.b();
                mmvVar.G = (lfz) mifVar4.cv.b();
                mmvVar.D = (lyz) mifVar4.bS.b();
                mmvVar.E = (lxp) mifVar4.dv.b();
                mmvVar.F = (lxm) mifVar4.ea.b();
                mmvVar.o = (mem) mifVar4.bQ.b();
                mmvVar.p = (mcd) mifVar4.rR.b();
                mmvVar.q = (mcy) mifVar4.zT.b();
                kqf kqfVar2 = mifVar4.a;
                mmvVar.r = jvy.a(kqfVar2);
                mmvVar.J = new gag(mifVar4.cv, mifVar4.ci, mifVar4.bw, this.a, mifVar4.tG, (short[]) null);
                mmvVar.K = new gag(mifVar4.getAccountRepository(), mifVar4.ak(), mifVar4.al(), (Executor) mifVar4.bF.b(), (ids) mifVar4.ry.b());
                mmvVar.s = (pkg) mifVar4.tf.b();
                mmvVar.t = mifVar4.I();
                mmvVar.u = mifVar4.T();
                mmvVar.v = new xkd(rgq.c(kqfVar2));
                mmvVar.w = mifVar4.H();
                mmvVar.x = mifVar4.N();
                mmvVar.y = mifVar4.U();
                mmvVar.z = mifVar4.s();
                break;
        }
    }

    public mgz(mif mifVar, int i, byte[] bArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new itl(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, 6, (char[]) null);
    }

    public mgz(mif mifVar, int i, char[] cArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new lzx(mifVar.bj, mifVar.bG, 7, null);
    }

    public mgz(mif mifVar, int i, float[] fArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new jai(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, mifVar.Fj, mifVar.bw, 5, (boolean[]) null);
    }

    public mgz(mif mifVar, int i, int[] iArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new ins(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, mifVar.oZ, 9, (int[]) null);
    }

    public mgz(mif mifVar, int i, boolean[] zArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new itl(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, 10, (char[]) null);
    }

    public mgz(mif mifVar, int i, byte[][] bArr) {
        this.c = i;
        this.b = mifVar;
        this.a = new itl(mifVar.ok, mifVar.pi, mifVar.ps, mifVar.pd, 11, (char[]) null);
    }
}

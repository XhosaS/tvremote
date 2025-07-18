package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vfi {
    private static volatile xsq a;

    private vfi() {
    }

    public static void A(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vix vixVar = (vix) vtwVar.b;
        vix vixVar2 = vix.a;
        vixVar.b |= 8;
        vixVar.f = str;
    }

    public static void B(long j, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vix vixVar = (vix) vtwVar.b;
        vix vixVar2 = vix.a;
        vixVar.b |= 16;
        vixVar.g = j;
    }

    public static void C(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vix vixVar = (vix) vtwVar.b;
        vix vixVar2 = vix.a;
        vixVar.b |= 1;
        vixVar.c = str;
    }

    public static /* synthetic */ upq D(vtw vtwVar) {
        vtwVar.getClass();
        return new upq(vtwVar, (byte[]) null);
    }

    public static /* synthetic */ upq E(vtw vtwVar) {
        vtwVar.getClass();
        return new upq(vtwVar, (byte[]) null);
    }

    public static int F(int i) {
        if (i != 1) {
            return i != 2 ? 4 : 3;
        }
        return 2;
    }

    public static int G(int i) {
        if (i == 0) {
            return 7;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return i != 13 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int H(int i) {
        if (i != 6) {
            return i != 7 ? 9 : 8;
        }
        return 7;
    }

    public static int I(int i) {
        return i != 1 ? 3 : 2;
    }

    public static /* synthetic */ vmo J(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vmo) vucVarO;
    }

    public static /* synthetic */ void K(vll vllVar, vtw vtwVar) {
        vllVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vmn vmnVar = (vmn) vtwVar.b;
        vuk vukVar = vmn.a;
        vuj vujVar = vmnVar.c;
        if (!vujVar.c()) {
            vmnVar.c = vuc.q(vujVar);
        }
        vmnVar.c.g(vllVar.d);
    }

    public static /* synthetic */ void L(vtw vtwVar) {
        new vul(((vmn) vtwVar.b).c, vmn.a);
    }

    public static String M(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ ulp N(vtw vtwVar) {
        vtwVar.getClass();
        return new ulp(vtwVar, (byte[]) null);
    }

    public static xsq a() {
        xsq xsqVarA;
        xsq xsqVar = a;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (vfi.class) {
            xsqVarA = a;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.manifest.ManifestService", "GetStreamInfoForDash");
                xsnVarA.b();
                vff vffVar = vff.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(vffVar);
                xsnVarA.c = new yep(vfg.a);
                xsqVarA = xsnVarA.a();
                a = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
            default:
                return 0;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
        }
    }

    public static /* synthetic */ vhx c(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vhx) vucVarO;
    }

    public static void d(vhw vhwVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhx vhxVar = (vhx) vtwVar.b;
        vhx vhxVar2 = vhx.a;
        vhxVar.f = vhwVar;
        vhxVar.b |= 2;
    }

    public static void e(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhx vhxVar = (vhx) vtwVar.b;
        vhx vhxVar2 = vhx.a;
        vhxVar.b |= 1;
        vhxVar.e = str;
    }

    public static void f(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhx vhxVar = (vhx) vtwVar.b;
        vhx vhxVar2 = vhx.a;
        vhxVar.c = 4;
        vhxVar.d = str;
    }

    public static /* synthetic */ vhw g(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vhw) vucVarO;
    }

    public static void h(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 256;
        vhwVar.k = i;
    }

    public static void i(vhu vhuVar, vtw vtwVar) {
        vhuVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.o = vhuVar.d;
        vhwVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public static void j(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 8;
        vhwVar.f = str;
    }

    public static void k(String str, vtw vtwVar) {
        str.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 16;
        vhwVar.g = str;
    }

    public static void l(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        vhwVar.p = str;
    }

    public static void m(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 512;
        vhwVar.l = str;
    }

    public static void n(float f, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 1;
        vhwVar.c = f;
    }

    public static void o(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 64;
        vhwVar.i = str;
    }

    public static void p(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 128;
        vhwVar.j = str;
    }

    public static void q(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 32;
        vhwVar.h = str;
    }

    public static void r(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.b |= 4;
        vhwVar.e = str;
    }

    public static /* synthetic */ void s(Iterable iterable, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vun vunVar = vhwVar.m;
        if (!vunVar.c()) {
            vhwVar.m = vuc.s(vunVar);
        }
        vsf.h(iterable, vhwVar.m);
    }

    public static /* synthetic */ void t(Iterable iterable, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vun vunVar = vhwVar.n;
        if (!vunVar.c()) {
            vhwVar.n = vuc.s(vunVar);
        }
        vsf.h(iterable, vhwVar.n);
    }

    public static void u(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.r = i - 1;
        vhwVar.b |= 32768;
    }

    public static void x(vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vhw vhwVar = (vhw) vtwVar.b;
        vhw vhwVar2 = vhw.a;
        vhwVar.d = 3;
        vhwVar.b |= 2;
    }

    public static /* synthetic */ vix y(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vix) vucVarO;
    }

    public static void z(long j, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vix vixVar = (vix) vtwVar.b;
        vix vixVar2 = vix.a;
        vixVar.b |= 4;
        vixVar.e = j;
    }

    public vfi(byte[] bArr) {
    }
}

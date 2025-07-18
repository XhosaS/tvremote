package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vef {
    public static volatile xsq a;
    public static volatile xsq b;
    public static volatile xsq c;
    public static volatile xsq d;

    private vef() {
    }

    public static final /* synthetic */ vke A(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vke) vucVarO;
    }

    public static final void B(vkc vkcVar, vtw vtwVar) {
        vkcVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vke vkeVar = (vke) vtwVar.b;
        vke vkeVar2 = vke.a;
        vkeVar.f = vkcVar.d;
        vkeVar.b |= 8;
    }

    public static final void C(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vke vkeVar = (vke) vtwVar.b;
        vke vkeVar2 = vke.a;
        vkeVar.b |= 1;
        vkeVar.c = str;
    }

    public static final void D(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vke vkeVar = (vke) vtwVar.b;
        vke vkeVar2 = vke.a;
        vkeVar.b |= 2;
        vkeVar.d = str;
    }

    public static final void E(vkd vkdVar, vtw vtwVar) {
        vkdVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vke vkeVar = (vke) vtwVar.b;
        vke vkeVar2 = vke.a;
        vkeVar.e = vkdVar.h;
        vkeVar.b |= 4;
    }

    public static final /* synthetic */ vkg F(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vkg) vucVarO;
    }

    public static final void G(vkf vkfVar, vtw vtwVar) {
        vkfVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkg vkgVar = (vkg) vtwVar.b;
        vkg vkgVar2 = vkg.a;
        vkgVar.d = vkfVar.d;
        vkgVar.b |= 2;
    }

    public static final void H(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkg vkgVar = (vkg) vtwVar.b;
        vkg vkgVar2 = vkg.a;
        vkgVar.b |= 1;
        vkgVar.c = str;
    }

    public static final /* synthetic */ vjy I(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vjy) vucVarO;
    }

    public static final void J(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjy vjyVar = (vjy) vtwVar.b;
        vjy vjyVar2 = vjy.a;
        vjyVar.b |= 2;
        vjyVar.d = str;
    }

    public static final void K(long j, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjy vjyVar = (vjy) vtwVar.b;
        vjy vjyVar2 = vjy.a;
        vjyVar.b |= 1;
        vjyVar.c = j;
    }

    public static final /* synthetic */ vjz L(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vjz) vucVarO;
    }

    public static final void M(vjy vjyVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjz vjzVar = (vjz) vtwVar.b;
        vjz vjzVar2 = vjz.a;
        vjzVar.c = vjyVar;
        vjzVar.b |= 1;
    }

    public static final void N(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjq vjqVar = (vjq) vtwVar.b;
        vjq vjqVar2 = vjq.a;
        vjqVar.b |= 64;
        vjqVar.j = str;
    }

    public static final /* synthetic */ ulp O(vtw vtwVar) {
        vtwVar.getClass();
        return new ulp(vtwVar, (byte[]) null);
    }

    public static final /* synthetic */ ulp P(vtw vtwVar) {
        vtwVar.getClass();
        return new ulp(vtwVar, (byte[]) null);
    }

    public static int a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int b(int i) {
        if (i != 2) {
            return i != 3 ? 5 : 4;
        }
        return 3;
    }

    public static int c(int i) {
        if (i == 0) {
            return 18;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            default:
                return 0;
        }
    }

    public static int d(int i) {
        return i != 2 ? 4 : 3;
    }

    public static int e(int i) {
        return i != 2 ? 4 : 3;
    }

    public static int f(int i) {
        switch (i) {
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
            default:
                return 10;
        }
    }

    public static int g(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static final /* synthetic */ vkh h(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (vkh) vucVarO;
    }

    public static final void i(vka vkaVar, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.t = vkaVar.g;
        vkhVar.b |= 32768;
    }

    public static final void j(int i, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 256;
        vkhVar.k = i;
    }

    public static final void k(vkb vkbVar, vtw vtwVar) {
        vkbVar.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.p = vkbVar.d;
        vkhVar.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
    }

    public static final void l(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 8;
        vkhVar.f = str;
    }

    public static final void m(String str, vtw vtwVar) {
        str.getClass();
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 16;
        vkhVar.g = str;
    }

    public static final void n(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        vkhVar.q = str;
    }

    public static final void o(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 512;
        vkhVar.l = str;
    }

    public static final void p(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 1024;
        vkhVar.m = str;
    }

    public static final void q(float f, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 1;
        vkhVar.c = f;
    }

    public static final void r(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 64;
        vkhVar.i = str;
    }

    public static final void s(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 128;
        vkhVar.j = str;
    }

    public static final void t(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 32;
        vkhVar.h = str;
    }

    public static final /* synthetic */ void u(Iterable iterable, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vun vunVar = vkhVar.n;
        if (!vunVar.c()) {
            vkhVar.n = vuc.s(vunVar);
        }
        vsf.h(iterable, vkhVar.n);
    }

    public static final /* synthetic */ void v(Iterable iterable, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vun vunVar = vkhVar.o;
        if (!vunVar.c()) {
            vkhVar.o = vuc.s(vunVar);
        }
        vsf.h(iterable, vkhVar.o);
    }

    public static final void y(vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.d = 3;
        vkhVar.b |= 2;
    }

    public static final void z(vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkh vkhVar = (vkh) vtwVar.b;
        vkh vkhVar2 = vkh.a;
        vkhVar.b |= 4;
        vkhVar.e = "770518479";
    }
}

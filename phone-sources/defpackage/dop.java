package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dop {
    public final doo a;
    public int b;
    public int c = 0;
    private int d;

    public dop(doo dooVar) {
        byte[] bArr = dpk.b;
        this.a = dooVar;
        dooVar.g = this;
    }

    public static /* synthetic */ void J(dop dopVar, List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpg) {
            dpg dpgVar = (dpg) list;
            int iB = dri.b(dopVar.b);
            if (iB == 2) {
                doo dooVar = dopVar.a;
                don donVar = (don) dooVar;
                int iL = donVar.l();
                M(iL);
                int iD = dooVar.d() + iL;
                do {
                    dpgVar.f(donVar.f());
                } while (dooVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new dpl();
            }
            do {
                doo dooVar2 = dopVar.a;
                dpgVar.f(((don) dooVar2).f());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == dopVar.b);
        } else {
            int iB2 = dri.b(dopVar.b);
            if (iB2 == 2) {
                doo dooVar3 = dopVar.a;
                don donVar2 = (don) dooVar3;
                int iL2 = donVar2.l();
                M(iL2);
                int iD2 = dooVar3.d() + iL2;
                do {
                    list.add(Integer.valueOf(donVar2.f()));
                } while (dooVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new dpl();
            }
            do {
                doo dooVar4 = dopVar.a;
                list.add(Integer.valueOf(((don) dooVar4).f()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == dopVar.b);
            iH2 = iH;
        }
        dopVar.c = iH2;
    }

    public static /* synthetic */ void K(dop dopVar, List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpr) {
            dpr dprVar = (dpr) list;
            int iB = dri.b(dopVar.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = dopVar.a;
                don donVar = (don) dooVar;
                int iL = donVar.l();
                N(iL);
                int iD = dooVar.d() + iL;
                do {
                    dprVar.f(donVar.p());
                } while (dooVar.d() < iD);
                return;
            }
            do {
                doo dooVar2 = dopVar.a;
                dprVar.f(((don) dooVar2).p());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == dopVar.b);
        } else {
            int iB2 = dri.b(dopVar.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = dopVar.a;
                don donVar2 = (don) dooVar3;
                int iL2 = donVar2.l();
                N(iL2);
                int iD2 = dooVar3.d() + iL2;
                do {
                    list.add(Long.valueOf(donVar2.p()));
                } while (dooVar3.d() < iD2);
                return;
            }
            do {
                doo dooVar4 = dopVar.a;
                list.add(Long.valueOf(((don) dooVar4).p()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == dopVar.b);
            iH2 = iH;
        }
        dopVar.c = iH2;
    }

    private final void L(int i) throws dpm {
        if (this.a.d() != i) {
            throw new dpm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void M(int i) throws dpm {
        if ((i & 3) != 0) {
            throw new dpm("Failed to parse the message.");
        }
    }

    private static final void N(int i) throws dpm {
        if ((i & 7) != 0) {
            throw new dpm("Failed to parse the message.");
        }
    }

    public final void A(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpr) {
            dpr dprVar = (dpr) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                don donVar = (don) dooVar;
                int iD = dooVar.d() + donVar.l();
                do {
                    dprVar.f(donVar.q());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dprVar.f(((don) dooVar2).q());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                don donVar2 = (don) dooVar3;
                int iD2 = dooVar3.d() + donVar2.l();
                do {
                    list.add(Long.valueOf(donVar2.q()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Long.valueOf(((don) dooVar4).q()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void B(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpg) {
            dpg dpgVar = (dpg) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                int iD = dooVar.d() + ((don) dooVar).l();
                do {
                    dpgVar.f(dooVar.g());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dpgVar.f(dooVar2.g());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                int iD2 = dooVar3.d() + ((don) dooVar3).l();
                do {
                    list.add(Integer.valueOf(dooVar3.g()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Integer.valueOf(dooVar4.g()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void C(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpr) {
            dpr dprVar = (dpr) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                int iD = dooVar.d() + ((don) dooVar).l();
                do {
                    dprVar.f(dooVar.i());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dprVar.f(dooVar2.i());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                int iD2 = dooVar3.d() + ((don) dooVar3).l();
                do {
                    list.add(Long.valueOf(dooVar3.i()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Long.valueOf(dooVar4.i()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void D(List list, boolean z) throws dpm {
        int iH;
        int iH2;
        if (dri.b(this.b) != 2) {
            throw new dpl();
        }
        if ((list instanceof dpp) && !z) {
            dpp dppVar = (dpp) list;
            do {
                o();
                dppVar.a();
                doo dooVar = this.a;
                if (dooVar.m()) {
                    return;
                } else {
                    iH2 = dooVar.h();
                }
            } while (iH2 == this.b);
        } else {
            do {
                list.add(z ? q() : p());
                doo dooVar2 = this.a;
                if (dooVar2.m()) {
                    return;
                } else {
                    iH = dooVar2.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void E(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpg) {
            dpg dpgVar = (dpg) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                don donVar = (don) dooVar;
                int iD = dooVar.d() + donVar.l();
                do {
                    dpgVar.f(donVar.l());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dpgVar.f(((don) dooVar2).l());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                don donVar2 = (don) dooVar3;
                int iD2 = dooVar3.d() + donVar2.l();
                do {
                    list.add(Integer.valueOf(donVar2.l()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Integer.valueOf(((don) dooVar4).l()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void F(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpr) {
            dpr dprVar = (dpr) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                don donVar = (don) dooVar;
                int iD = dooVar.d() + donVar.l();
                do {
                    dprVar.f(donVar.q());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dprVar.f(((don) dooVar2).q());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                don donVar2 = (don) dooVar3;
                int iD2 = dooVar3.d() + donVar2.l();
                do {
                    list.add(Long.valueOf(donVar2.q()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Long.valueOf(((don) dooVar4).q()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void G(int i) throws dpl {
        if (dri.b(this.b) != i) {
            throw new dpl();
        }
    }

    public final boolean H() throws dpl {
        G(0);
        return this.a.n();
    }

    public final boolean I() {
        int i;
        doo dooVar = this.a;
        if (dooVar.m() || (i = this.b) == this.d) {
            return false;
        }
        return dooVar.o(i);
    }

    public final double a() throws dpl {
        G(1);
        return this.a.b();
    }

    public final float b() throws dpl {
        G(5);
        return this.a.c();
    }

    public final int c() {
        int iH = this.c;
        if (iH != 0) {
            this.b = iH;
            this.c = 0;
        } else {
            iH = this.a.h();
            this.b = iH;
        }
        return (iH == 0 || iH == this.d) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : dri.a(iH);
    }

    public final int d() throws dpl {
        G(0);
        return ((don) this.a).l();
    }

    public final int e() throws dpl {
        G(5);
        return ((don) this.a).f();
    }

    public final int f() throws dpl {
        G(0);
        return ((don) this.a).l();
    }

    public final int g() throws dpl {
        G(5);
        return ((don) this.a).f();
    }

    public final int h() throws dpl {
        G(0);
        return this.a.g();
    }

    public final int i() throws dpl {
        G(0);
        return ((don) this.a).l();
    }

    public final long j() throws dpl {
        G(1);
        return ((don) this.a).p();
    }

    public final long k() throws dpl {
        G(0);
        return ((don) this.a).q();
    }

    public final long l() throws dpl {
        G(1);
        return ((don) this.a).p();
    }

    public final long m() throws dpl {
        G(0);
        return this.a.i();
    }

    public final long n() throws dpl {
        G(0);
        return ((don) this.a).q();
    }

    public final dol o() throws dpm {
        G(2);
        don donVar = (don) this.a;
        int iL = donVar.l();
        int i = donVar.b;
        int i2 = donVar.c;
        if (iL <= i - i2 && iL > 0) {
            dol dolVarH = dol.h(donVar.a, i2, iL);
            donVar.c += iL;
            return dolVarH;
        }
        if (iL == 0) {
            return dol.b;
        }
        if (iL < 0) {
            throw new dpm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrV = donVar.v(iL);
        if (bArrV != null) {
            return dol.h(bArrV, 0, bArrV.length);
        }
        int i3 = donVar.c;
        int i4 = donVar.b;
        int i5 = i4 - i3;
        donVar.d += i4;
        donVar.c = 0;
        donVar.b = 0;
        List<byte[]> listS = donVar.s(iL - i5);
        byte[] bArr = new byte[iL];
        System.arraycopy(donVar.a, i3, bArr, 0, i5);
        for (byte[] bArr2 : listS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        dol dolVar = dol.b;
        return new doj(bArr);
    }

    public final String p() throws dpm {
        G(2);
        don donVar = (don) this.a;
        int iL = donVar.l();
        if (iL > 0) {
            int i = donVar.b;
            int i2 = donVar.c;
            if (iL <= i - i2) {
                String str = new String(donVar.a, i2, iL, dpk.a);
                donVar.c += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw new dpm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iL > donVar.b) {
            return new String(donVar.w(iL), dpk.a);
        }
        donVar.t(iL);
        String str2 = new String(donVar.a, donVar.c, iL, dpk.a);
        donVar.c += iL;
        return str2;
    }

    public final String q() throws dpm {
        byte[] bArrW;
        G(2);
        don donVar = (don) this.a;
        int iL = donVar.l();
        int i = donVar.c;
        int i2 = donVar.b;
        if (iL <= i2 - i && iL > 0) {
            bArrW = donVar.a;
            donVar.c = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw new dpm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iL <= i2) {
                donVar.t(iL);
                bArrW = donVar.a;
                donVar.c = iL;
            } else {
                bArrW = donVar.w(iL);
            }
        }
        return drf.a.b(bArrW, i, iL);
    }

    public final void r(Object obj, dqk dqkVar, dox doxVar) throws dpl {
        G(3);
        s(obj, dqkVar, doxVar);
    }

    public final void s(Object obj, dqk dqkVar, dox doxVar) {
        int i = this.d;
        this.d = dri.c(dri.a(this.b), 4);
        try {
            dqkVar.h(obj, this, doxVar);
            if (this.b == this.d) {
            } else {
                throw new dpm("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    public final void t(Object obj, dqk dqkVar, dox doxVar) throws dpm {
        G(2);
        u(obj, dqkVar, doxVar);
    }

    public final void u(Object obj, dqk dqkVar, dox doxVar) throws dpm {
        doo dooVar = this.a;
        int iL = ((don) dooVar).l();
        if (dooVar.e >= dooVar.f) {
            throw new dpm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = dooVar.e(iL);
        dooVar.e++;
        dqkVar.h(obj, this, doxVar);
        dooVar.j(0);
        dooVar.e--;
        dooVar.k(iE);
    }

    public final void v(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dod) {
            dod dodVar = (dod) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                int iD = dooVar.d() + ((don) dooVar).l();
                do {
                    dodVar.e(dooVar.n());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dodVar.e(dooVar2.n());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                int iD2 = dooVar3.d() + ((don) dooVar3).l();
                do {
                    list.add(Boolean.valueOf(dooVar3.n()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Boolean.valueOf(dooVar4.n()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void w(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dou) {
            dou douVar = (dou) list;
            int iB = dri.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                int iL = ((don) dooVar).l();
                N(iL);
                int iD = dooVar.d() + iL;
                do {
                    douVar.f(dooVar.b());
                } while (dooVar.d() < iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                douVar.f(dooVar2.b());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                int iL2 = ((don) dooVar3).l();
                N(iL2);
                int iD2 = dooVar3.d() + iL2;
                do {
                    list.add(Double.valueOf(dooVar3.b()));
                } while (dooVar3.d() < iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Double.valueOf(dooVar4.b()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void x(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpg) {
            dpg dpgVar = (dpg) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                don donVar = (don) dooVar;
                int iD = dooVar.d() + donVar.l();
                do {
                    dpgVar.f(donVar.l());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dpgVar.f(((don) dooVar2).l());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                don donVar2 = (don) dooVar3;
                int iD2 = dooVar3.d() + donVar2.l();
                do {
                    list.add(Integer.valueOf(donVar2.l()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Integer.valueOf(((don) dooVar4).l()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void y(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpb) {
            dpb dpbVar = (dpb) list;
            int iB = dri.b(this.b);
            if (iB == 2) {
                doo dooVar = this.a;
                int iL = ((don) dooVar).l();
                M(iL);
                int iD = dooVar.d() + iL;
                do {
                    dpbVar.f(dooVar.c());
                } while (dooVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new dpl();
            }
            do {
                doo dooVar2 = this.a;
                dpbVar.f(dooVar2.c());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 == 2) {
                doo dooVar3 = this.a;
                int iL2 = ((don) dooVar3).l();
                M(iL2);
                int iD2 = dooVar3.d() + iL2;
                do {
                    list.add(Float.valueOf(dooVar3.c()));
                } while (dooVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new dpl();
            }
            do {
                doo dooVar4 = this.a;
                list.add(Float.valueOf(dooVar4.c()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }

    public final void z(List list) throws dpm {
        int iH;
        int iH2;
        if (list instanceof dpg) {
            dpg dpgVar = (dpg) list;
            int iB = dri.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new dpl();
                }
                doo dooVar = this.a;
                don donVar = (don) dooVar;
                int iD = dooVar.d() + donVar.l();
                do {
                    dpgVar.f(donVar.l());
                } while (dooVar.d() < iD);
                L(iD);
                return;
            }
            do {
                doo dooVar2 = this.a;
                dpgVar.f(((don) dooVar2).l());
                if (dooVar2.m()) {
                    return;
                } else {
                    iH2 = dooVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dri.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new dpl();
                }
                doo dooVar3 = this.a;
                don donVar2 = (don) dooVar3;
                int iD2 = dooVar3.d() + donVar2.l();
                do {
                    list.add(Integer.valueOf(donVar2.l()));
                } while (dooVar3.d() < iD2);
                L(iD2);
                return;
            }
            do {
                doo dooVar4 = this.a;
                list.add(Integer.valueOf(((don) dooVar4).l()));
                if (dooVar4.m()) {
                    return;
                } else {
                    iH = dooVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.c = iH2;
    }
}

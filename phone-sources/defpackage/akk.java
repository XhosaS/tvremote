package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akk {
    public final akb a;
    public final ahx b;
    public final ajc c;
    public long d;
    public final String e;
    public int f;
    public final dhd g;
    private final cgz h;
    private final boolean i;
    private final float j;

    public akk(akb akbVar, cgz cgzVar, boolean z, float f, dhd dhdVar) {
        this.a = akbVar;
        this.h = cgzVar;
        this.i = z;
        this.j = f;
        this.g = dhdVar;
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            ahx ahxVarE = akbVar.e();
            this.b = ahxVarE;
            this.c = akbVar.f();
            bcm.z(bitVarT, bitVarU, yjvVarI);
            this.d = ahxVarE.d;
            this.e = ahxVarE.c.toString();
        } catch (Throwable th) {
            bcm.z(bitVarT, bitVarU, yjvVarI);
            throw th;
        }
    }

    private final int x(int i) {
        return ykn.k(i, this.e.length() - 1);
    }

    private final int y(cgz cgzVar, int i) {
        int iA = chb.a(this.d);
        dhd dhdVar = this.g;
        if (Float.isNaN(dhdVar.a)) {
            dhdVar.a = cgzVar.m(iA).b;
        }
        int iG = cgzVar.g(iA) + i;
        if (iG < 0) {
            return 0;
        }
        if (iG >= cgzVar.e()) {
            return this.e.length();
        }
        float fA = cgzVar.a(iG) - 1.0f;
        float f = dhdVar.a;
        if ((a() && f >= cgzVar.c(iG)) || (!a() && f <= cgzVar.b(iG))) {
            return cgzVar.f(iG, true);
        }
        return cgzVar.j((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L));
    }

    private final int z(int i) {
        int iA = chb.a(this.b.d);
        cgz cgzVar = this.h;
        if (cgzVar != null) {
            float f = this.j;
            if (!Float.isNaN(f)) {
                bmy bmyVarH = cgzVar.m(iA).h(0.0f, f * i);
                float f2 = bmyVarH.c;
                float fA = cgzVar.a(cgzVar.h(f2));
                return Math.abs(f2 - fA) > Math.abs(bmyVarH.e - fA) ? cgzVar.j(bmyVarH.f()) : cgzVar.j(bmyVarH.b());
            }
        }
        return iA;
    }

    public final boolean a() {
        cgz cgzVar = this.h;
        return cgzVar == null || cgzVar.s(chb.a(this.d)) == 1;
    }

    public final void b() {
        if (this.e.length() > 0) {
            long j = this.b.d;
            if (chb.g(j)) {
                akb.n(this.a, "", ccf.N(chb.e(j), chb.a(this.d)), !this.i, 4);
            } else {
                this.a.h();
            }
            this.d = this.a.e().d;
            this.f = 1;
        }
    }

    public final void c() {
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            long jD = hw.D(cgzVar != null ? y(cgzVar, 1) : str.length(), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void d() {
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(z(1), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void e() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(hq.q(str, chb.a(this.d)), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void f() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            int iS = hq.s(str, chb.c(this.d));
            if (iS == chb.c(this.d) && iS != str.length()) {
                iS = hq.s(str, iS + 1);
            }
            long jD = hw.D(iS, iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void g() {
        int length;
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            if (cgzVar != null) {
                int iA2 = chb.a(this.d);
                while (true) {
                    ahx ahxVar = this.b;
                    if (iA2 < ahxVar.a()) {
                        long jK = cgzVar.k(x(iA2));
                        if (chb.a(jK) > iA2) {
                            length = chb.a(jK);
                            break;
                        }
                        iA2++;
                    } else {
                        length = ahxVar.a();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jD = hw.D(length, iA, this.a);
            int iA3 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA3 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA3, iA3);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void h() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(hq.r(str, chb.a(this.d)), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void i() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            int iT = hq.t(str, chb.d(this.d));
            if (iT == chb.d(this.d) && iT != 0) {
                iT = hq.t(str, iT - 1);
            }
            long jD = hw.D(iT, iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void j() {
        this.g.a();
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            int iE = 0;
            if (cgzVar != null) {
                int iA2 = chb.a(this.d);
                while (true) {
                    if (iA2 > 0) {
                        long jK = cgzVar.k(x(iA2));
                        if (chb.e(jK) < iA2) {
                            iE = chb.e(jK);
                            break;
                        }
                        iA2--;
                    } else {
                        break;
                    }
                }
            }
            long jD = hw.D(iE, iA, this.a);
            int iA3 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA3 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA3, iA3);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void k() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(str.length(), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void l() {
        this.g.a();
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(0, iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void m() {
        this.g.a();
        String str = this.e;
        if (str.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            long jD = hw.D(cgzVar != null ? cgzVar.f(cgzVar.g(chb.c(this.d)), true) : str.length(), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void n() {
        this.g.a();
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            long jD = hw.D(cgzVar != null ? cgzVar.i(cgzVar.g(chb.d(this.d))) : 0, iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void o() {
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            cgz cgzVar = this.h;
            long jD = hw.D(cgzVar != null ? y(cgzVar, -1) : 0, iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void p() {
        if (this.e.length() > 0) {
            int iA = chb.a(this.d);
            long jD = hw.D(z(-1), iA, this.a);
            int iA2 = akd.a(jD);
            int iD = akd.d(jD);
            if (iA2 != iA || !chb.g(this.d)) {
                this.d = ccf.N(iA2, iA2);
            }
            if (iD != 0) {
                this.f = iD;
            }
        }
    }

    public final void q() {
        if (this.e.length() > 0) {
            this.d = ccf.N(chb.e(this.b.d), chb.a(this.d));
        }
    }

    public final void r() {
        if (a()) {
            h();
        } else {
            e();
        }
    }

    public final void s() {
        if (a()) {
            j();
        } else {
            g();
        }
    }

    public final void t() {
        if (a()) {
            e();
        } else {
            h();
        }
    }

    public final void u() {
        if (a()) {
            g();
        } else {
            j();
        }
    }

    public final void v() {
        if (a()) {
            n();
        } else {
            m();
        }
    }

    public final void w() {
        if (a()) {
            m();
        } else {
            n();
        }
    }
}

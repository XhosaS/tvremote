package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dyq implements eao {
    public final eax a = new eax();

    protected dyq() {
    }

    private final int ap() {
        int iBh = bh();
        if (iBh == 1) {
            return 0;
        }
        return iBh;
    }

    private final void aq() {
        v(-1, -9223372036854775807L, false);
    }

    private final void ar() {
        v(bd(), -9223372036854775807L, true);
    }

    private final void as(long j) {
        long jD = D() + j;
        long jE = E();
        if (jE != -9223372036854775807L) {
            jD = Math.min(jD, jE);
        }
        w(Math.max(jD, 0L));
    }

    @Override // defpackage.eao
    public final int a() {
        long jA = A();
        long jE = E();
        if (jA == -9223372036854775807L || jE == -9223372036854775807L) {
            return 0;
        }
        if (jE == 0) {
            return 100;
        }
        String str = edt.a;
        long jAt = sfy.at(jA, 100L);
        return edt.d(sfy.W((jAt == Long.MAX_VALUE || jAt == Long.MIN_VALUE) ? jA / (jE / 100) : jAt / jE), 0, 100);
    }

    public final int b() {
        eay eayVarN = N();
        if (eayVarN.q()) {
            return -1;
        }
        return eayVarN.i(bd(), ap(), am());
    }

    public final int c() {
        eay eayVarN = N();
        if (eayVarN.q()) {
            return -1;
        }
        return eayVarN.j(bd(), ap(), am());
    }

    @Override // defpackage.eao
    public final long d() {
        eay eayVarN = N();
        if (eayVarN.q()) {
            return -9223372036854775807L;
        }
        return eayVarN.p(bd(), this.a).c();
    }

    @Override // defpackage.eao
    public final void e() {
        ab(false);
    }

    @Override // defpackage.eao
    public final void f() {
        ab(true);
    }

    @Override // defpackage.eao
    public final void g() {
        as(-G());
    }

    @Override // defpackage.eao
    public final void h() {
        as(H());
    }

    @Override // defpackage.eao
    public final void i(long j) {
        w(j);
    }

    @Override // defpackage.eao
    public final void j() {
        x(bd());
    }

    @Override // defpackage.eao
    public final void k() {
        if (N().q() || an()) {
            aq();
            return;
        }
        if (o()) {
            y();
        } else if (s() && r()) {
            x(bd());
        } else {
            aq();
        }
    }

    @Override // defpackage.eao
    public final void l() {
        throw null;
    }

    @Override // defpackage.eao
    public final void m() {
        if (N().q() || an()) {
            aq();
            return;
        }
        boolean zP = p();
        if (s() && !t()) {
            if (zP) {
                z();
                return;
            } else {
                aq();
                return;
            }
        }
        if (!zP || D() > F()) {
            w(0L);
        } else {
            z();
        }
    }

    @Override // defpackage.eao
    public final void n() {
        throw null;
    }

    @Override // defpackage.eao
    public final boolean o() {
        return b() != -1;
    }

    @Override // defpackage.eao
    public final boolean p() {
        return c() != -1;
    }

    @Override // defpackage.eao
    public final boolean q(int i) {
        return M().d(i);
    }

    @Override // defpackage.eao
    public final boolean r() {
        eay eayVarN = N();
        return !eayVarN.q() && eayVarN.p(bd(), this.a).w;
    }

    @Override // defpackage.eao
    public final boolean s() {
        eay eayVarN = N();
        return !eayVarN.q() && eayVarN.p(bd(), this.a).d();
    }

    @Override // defpackage.eao
    public final boolean t() {
        eay eayVarN = N();
        return !eayVarN.q() && eayVarN.p(bd(), this.a).v;
    }

    @Override // defpackage.eao
    public final boolean u() {
        return bf() == 3 && al() && bg() == 0;
    }

    public abstract void v(int i, long j, boolean z);

    public final void w(long j) {
        v(bd(), j, false);
    }

    public final void x(int i) {
        v(i, -9223372036854775807L, false);
    }

    public final void y() {
        int iB = b();
        if (iB == -1) {
            aq();
        } else if (iB == bd()) {
            ar();
        } else {
            x(iB);
        }
    }

    public final void z() {
        int iC = c();
        if (iC == -1) {
            aq();
        } else if (iC == bd()) {
            ar();
        } else {
            x(iC);
        }
    }
}

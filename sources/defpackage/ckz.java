package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckz {
    public final cky a;
    public int b;
    public int c = 0;
    private int d;

    private ckz(cky ckyVar) {
        byte[] bArr = cmf.b;
        this.a = ckyVar;
        ckyVar.d = this;
    }

    private final void Q(Object obj, cno cnoVar, cli cliVar) {
        int i = this.d;
        this.d = coi.c(coi.a(this.b), 4);
        try {
            cnoVar.l(obj, this, cliVar);
            if (this.b == this.d) {
            } else {
                throw new cmh("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, cno cnoVar, cli cliVar) throws cmh {
        cky ckyVar = this.a;
        int iN = ckyVar.n();
        ckyVar.M();
        int iE = ckyVar.e(iN);
        ckyVar.a++;
        cnoVar.l(obj, this, cliVar);
        ckyVar.z(0);
        ckyVar.a--;
        ckyVar.A(iE);
    }

    private final void S(int i) throws cmh {
        if (this.a.d() != i) {
            throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void T(int i) throws cmh {
        if ((i & 3) != 0) {
            throw new cmh("Failed to parse the message.");
        }
    }

    private static final void U(int i) throws cmh {
        if ((i & 7) != 0) {
            throw new cmh("Failed to parse the message.");
        }
    }

    public static ckz p(cky ckyVar) {
        ckz ckzVar = ckyVar.d;
        return ckzVar != null ? ckzVar : new ckz(ckyVar);
    }

    public final void A(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cluVar.g(ckyVar.f());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.f());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Integer.valueOf(ckyVar3.f()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.f()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB == 2) {
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                T(iN);
                int iD = ckyVar.d() + iN;
                do {
                    cluVar.g(ckyVar.g());
                } while (ckyVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.g());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 == 2) {
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                T(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(ckyVar3.g()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.g()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cmp) {
            cmp cmpVar = (cmp) list;
            int iB = coi.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                U(iN);
                int iD = ckyVar.d() + iN;
                do {
                    cmpVar.f(ckyVar.o());
                } while (ckyVar.d() < iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cmpVar.f(ckyVar2.o());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                U(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(ckyVar3.o()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Long.valueOf(ckyVar4.o()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clm) {
            clm clmVar = (clm) list;
            int iB = coi.b(this.b);
            if (iB == 2) {
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                T(iN);
                int iD = ckyVar.d() + iN;
                do {
                    clmVar.f(ckyVar.c());
                } while (ckyVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar2 = this.a;
                clmVar.f(ckyVar2.c());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 == 2) {
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                T(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(ckyVar3.c()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Float.valueOf(ckyVar4.c()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cluVar.g(ckyVar.h());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.h());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Integer.valueOf(ckyVar3.h()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.h()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cmp) {
            cmp cmpVar = (cmp) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cmpVar.f(ckyVar.p());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cmpVar.f(ckyVar2.p());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Long.valueOf(ckyVar3.p()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Long.valueOf(ckyVar4.p()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB == 2) {
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                T(iN);
                int iD = ckyVar.d() + iN;
                do {
                    cluVar.g(ckyVar.k());
                } while (ckyVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.k());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 == 2) {
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                T(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(ckyVar3.k()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new cmg();
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.k()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cmp) {
            cmp cmpVar = (cmp) list;
            int iB = coi.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                U(iN);
                int iD = ckyVar.d() + iN;
                do {
                    cmpVar.f(ckyVar.t());
                } while (ckyVar.d() < iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cmpVar.f(ckyVar2.t());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                U(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(ckyVar3.t()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Long.valueOf(ckyVar4.t()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cluVar.g(ckyVar.l());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.l());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Integer.valueOf(ckyVar3.l()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.l()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void J(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cmp) {
            cmp cmpVar = (cmp) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cmpVar.f(ckyVar.u());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cmpVar.f(ckyVar2.u());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Long.valueOf(ckyVar3.u()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Long.valueOf(ckyVar4.u()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list, boolean z) throws cmg {
        int iM;
        int iM2;
        if (coi.b(this.b) != 2) {
            throw new cmg();
        }
        if ((list instanceof cmn) && !z) {
            cmn cmnVar = (cmn) list;
            do {
                o();
                cmnVar.b();
                cky ckyVar = this.a;
                if (ckyVar.C()) {
                    return;
                } else {
                    iM2 = ckyVar.m();
                }
            } while (iM2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                cky ckyVar2 = this.a;
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM = ckyVar2.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof clu) {
            clu cluVar = (clu) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cluVar.g(ckyVar.n());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cluVar.g(ckyVar2.n());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Integer.valueOf(ckyVar3.n()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Integer.valueOf(ckyVar4.n()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void M(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cmp) {
            cmp cmpVar = (cmp) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    cmpVar.f(ckyVar.v());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cmpVar.f(ckyVar2.v());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Long.valueOf(ckyVar3.v()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Long.valueOf(ckyVar4.v()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void N(int i) throws cmg {
        if (coi.b(this.b) != i) {
            throw new cmg();
        }
    }

    public final boolean O() throws cmg {
        N(0);
        return this.a.D();
    }

    public final boolean P() {
        int i;
        cky ckyVar = this.a;
        if (ckyVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return ckyVar.E(i);
    }

    public final double a() throws cmg {
        N(1);
        return this.a.b();
    }

    public final float b() throws cmg {
        N(5);
        return this.a.c();
    }

    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.b = iM;
            this.c = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        if (iM == 0 || iM == this.d) {
            return Integer.MAX_VALUE;
        }
        return coi.a(iM);
    }

    public final int d() throws cmg {
        N(0);
        return this.a.f();
    }

    public final int e() throws cmg {
        N(5);
        return this.a.g();
    }

    public final int f() throws cmg {
        N(0);
        return this.a.h();
    }

    public final int g() throws cmg {
        N(5);
        return this.a.k();
    }

    public final int h() throws cmg {
        N(0);
        return this.a.l();
    }

    public final int i() throws cmg {
        N(0);
        return this.a.n();
    }

    public final long j() throws cmg {
        N(1);
        return this.a.o();
    }

    public final long k() throws cmg {
        N(0);
        return this.a.p();
    }

    public final long l() throws cmg {
        N(1);
        return this.a.t();
    }

    public final long m() throws cmg {
        N(0);
        return this.a.u();
    }

    public final long n() throws cmg {
        N(0);
        return this.a.v();
    }

    public final ckv o() throws cmg {
        N(2);
        return this.a.w();
    }

    public final Object q(cog cogVar, Class cls, cli cliVar) {
        cog cogVar2 = cog.DOUBLE;
        switch (cogVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(O());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return t(cls, cliVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object r(cno cnoVar, cli cliVar) {
        Object objE = cnoVar.e();
        Q(objE, cnoVar, cliVar);
        cnoVar.g(objE);
        return objE;
    }

    public final Object s(cno cnoVar, cli cliVar) throws cmh {
        Object objE = cnoVar.e();
        R(objE, cnoVar, cliVar);
        cnoVar.g(objE);
        return objE;
    }

    public final Object t(Class cls, cli cliVar) {
        N(2);
        return s(cni.a.a(cls), cliVar);
    }

    public final String u() throws cmg {
        N(2);
        return this.a.x();
    }

    public final String v() throws cmg {
        N(2);
        return this.a.y();
    }

    public final void w(Object obj, cno cnoVar, cli cliVar) throws cmg {
        N(3);
        Q(obj, cnoVar, cliVar);
    }

    public final void x(Object obj, cno cnoVar, cli cliVar) throws cmh {
        N(2);
        R(obj, cnoVar, cliVar);
    }

    public final void y(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof ckm) {
            ckm ckmVar = (ckm) list;
            int iB = coi.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iD = ckyVar.d() + ckyVar.n();
                do {
                    ckmVar.e(ckyVar.D());
                } while (ckyVar.d() < iD);
                S(iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                ckmVar.e(ckyVar2.D());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iD2 = ckyVar3.d() + ckyVar3.n();
                do {
                    list.add(Boolean.valueOf(ckyVar3.D()));
                } while (ckyVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Boolean.valueOf(ckyVar4.D()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(List list) throws cmh {
        int iM;
        int iM2;
        if (list instanceof cle) {
            cle cleVar = (cle) list;
            int iB = coi.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new cmg();
                }
                cky ckyVar = this.a;
                int iN = ckyVar.n();
                U(iN);
                int iD = ckyVar.d() + iN;
                do {
                    cleVar.f(ckyVar.b());
                } while (ckyVar.d() < iD);
                return;
            }
            do {
                cky ckyVar2 = this.a;
                cleVar.f(ckyVar2.b());
                if (ckyVar2.C()) {
                    return;
                } else {
                    iM2 = ckyVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = coi.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new cmg();
                }
                cky ckyVar3 = this.a;
                int iN2 = ckyVar3.n();
                U(iN2);
                int iD2 = ckyVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(ckyVar3.b()));
                } while (ckyVar3.d() < iD2);
                return;
            }
            do {
                cky ckyVar4 = this.a;
                list.add(Double.valueOf(ckyVar4.b()));
                if (ckyVar4.C()) {
                    return;
                } else {
                    iM = ckyVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}

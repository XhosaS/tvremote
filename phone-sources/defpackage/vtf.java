package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtf {
    public final vte a;
    public int b;
    public int c = 0;
    private int d;

    private vtf(vte vteVar) {
        Charset charset = vuo.a;
        this.a = vteVar;
        vteVar.f = this;
    }

    private final void Q(Object obj, vvy vvyVar, vtp vtpVar) {
        int i = this.d;
        this.d = vwq.c(vwq.a(this.b), 4);
        try {
            vvyVar.l(obj, this, vtpVar);
            if (this.b == this.d) {
            } else {
                throw new vuq("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, vvy vvyVar, vtp vtpVar) throws vuq {
        vte vteVar = this.a;
        int iN = vteVar.n();
        vteVar.P();
        int iE = vteVar.e(iN);
        vteVar.b++;
        vvyVar.l(obj, this, vtpVar);
        vteVar.z(0);
        vteVar.b--;
        vteVar.A(iE);
    }

    private final void S(int i) throws vuq {
        if (this.a.d() != i) {
            throw new vuq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void T(int i) throws vuq {
        if ((i & 3) != 0) {
            throw new vuq("Failed to parse the message.");
        }
    }

    private static final void U(int i) throws vuq {
        if ((i & 7) != 0) {
            throw new vuq("Failed to parse the message.");
        }
    }

    public static vtf p(vte vteVar) {
        vtf vtfVar = vteVar.f;
        return vtfVar != null ? vtfVar : new vtf(vteVar);
    }

    public final void A(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vudVar.g(vteVar.f());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.f());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Integer.valueOf(vteVar3.f()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.f()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB == 2) {
                vte vteVar = this.a;
                int iN = vteVar.n();
                T(iN);
                int iD = vteVar.d() + iN;
                do {
                    vudVar.g(vteVar.g());
                } while (vteVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new vup();
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.g());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 == 2) {
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                T(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(vteVar3.g()));
                } while (vteVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new vup();
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.g()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vuz) {
            vuz vuzVar = (vuz) list;
            int iB = vwq.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iN = vteVar.n();
                U(iN);
                int iD = vteVar.d() + iN;
                do {
                    vuzVar.g(vteVar.o());
                } while (vteVar.d() < iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vuzVar.g(vteVar2.o());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                U(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(vteVar3.o()));
                } while (vteVar3.d() < iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Long.valueOf(vteVar4.o()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vtt) {
            vtt vttVar = (vtt) list;
            int iB = vwq.b(this.b);
            if (iB == 2) {
                vte vteVar = this.a;
                int iN = vteVar.n();
                T(iN);
                int iD = vteVar.d() + iN;
                do {
                    vttVar.f(vteVar.c());
                } while (vteVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new vup();
            }
            do {
                vte vteVar2 = this.a;
                vttVar.f(vteVar2.c());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 == 2) {
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                T(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(vteVar3.c()));
                } while (vteVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new vup();
            }
            do {
                vte vteVar4 = this.a;
                list.add(Float.valueOf(vteVar4.c()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vudVar.g(vteVar.h());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.h());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Integer.valueOf(vteVar3.h()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.h()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vuz) {
            vuz vuzVar = (vuz) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vuzVar.g(vteVar.p());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vuzVar.g(vteVar2.p());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Long.valueOf(vteVar3.p()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Long.valueOf(vteVar4.p()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB == 2) {
                vte vteVar = this.a;
                int iN = vteVar.n();
                T(iN);
                int iD = vteVar.d() + iN;
                do {
                    vudVar.g(vteVar.k());
                } while (vteVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new vup();
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.k());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 == 2) {
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                T(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(vteVar3.k()));
                } while (vteVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new vup();
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.k()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vuz) {
            vuz vuzVar = (vuz) list;
            int iB = vwq.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iN = vteVar.n();
                U(iN);
                int iD = vteVar.d() + iN;
                do {
                    vuzVar.g(vteVar.t());
                } while (vteVar.d() < iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vuzVar.g(vteVar2.t());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                U(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(vteVar3.t()));
                } while (vteVar3.d() < iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Long.valueOf(vteVar4.t()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vudVar.g(vteVar.l());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.l());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Integer.valueOf(vteVar3.l()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.l()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void J(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vuz) {
            vuz vuzVar = (vuz) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vuzVar.g(vteVar.u());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vuzVar.g(vteVar2.u());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Long.valueOf(vteVar3.u()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Long.valueOf(vteVar4.u()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list, boolean z) throws vup {
        int iM;
        int iM2;
        if (vwq.b(this.b) != 2) {
            throw new vup();
        }
        if ((list instanceof vux) && !z) {
            vux vuxVar = (vux) list;
            do {
                o();
                vuxVar.b();
                vte vteVar = this.a;
                if (vteVar.C()) {
                    return;
                } else {
                    iM2 = vteVar.m();
                }
            } while (iM2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                vte vteVar2 = this.a;
                if (vteVar2.C()) {
                    return;
                } else {
                    iM = vteVar2.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vud) {
            vud vudVar = (vud) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vudVar.g(vteVar.n());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vudVar.g(vteVar2.n());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Integer.valueOf(vteVar3.n()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Integer.valueOf(vteVar4.n()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void M(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vuz) {
            vuz vuzVar = (vuz) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vuzVar.g(vteVar.v());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vuzVar.g(vteVar2.v());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Long.valueOf(vteVar3.v()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Long.valueOf(vteVar4.v()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void N(int i) throws vup {
        if (vwq.b(this.b) != i) {
            throw new vup();
        }
    }

    public final boolean O() throws vup {
        N(0);
        return this.a.D();
    }

    public final boolean P() {
        int i;
        vte vteVar = this.a;
        if (vteVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return vteVar.E(i);
    }

    public final double a() throws vup {
        N(1);
        return this.a.b();
    }

    public final float b() throws vup {
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
        return (iM == 0 || iM == this.d) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : vwq.a(iM);
    }

    public final int d() throws vup {
        N(0);
        return this.a.f();
    }

    public final int e() throws vup {
        N(5);
        return this.a.g();
    }

    public final int f() throws vup {
        N(0);
        return this.a.h();
    }

    public final int g() throws vup {
        N(5);
        return this.a.k();
    }

    public final int h() throws vup {
        N(0);
        return this.a.l();
    }

    public final int i() throws vup {
        N(0);
        return this.a.n();
    }

    public final long j() throws vup {
        N(1);
        return this.a.o();
    }

    public final long k() throws vup {
        N(0);
        return this.a.p();
    }

    public final long l() throws vup {
        N(1);
        return this.a.t();
    }

    public final long m() throws vup {
        N(0);
        return this.a.u();
    }

    public final long n() throws vup {
        N(0);
        return this.a.v();
    }

    public final vsz o() throws vup {
        N(2);
        return this.a.w();
    }

    public final Object q(vwo vwoVar, Class cls, vtp vtpVar) {
        vwo vwoVar2 = vwo.DOUBLE;
        switch (vwoVar) {
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
                return t(cls, vtpVar);
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

    public final Object r(vvy vvyVar, vtp vtpVar) {
        Object objE = vvyVar.e();
        Q(objE, vvyVar, vtpVar);
        vvyVar.g(objE);
        return objE;
    }

    public final Object s(vvy vvyVar, vtp vtpVar) throws vuq {
        Object objE = vvyVar.e();
        R(objE, vvyVar, vtpVar);
        vvyVar.g(objE);
        return objE;
    }

    public final Object t(Class cls, vtp vtpVar) {
        N(2);
        return s(vvs.a.a(cls), vtpVar);
    }

    public final String u() throws vup {
        N(2);
        return this.a.x();
    }

    public final String v() throws vup {
        N(2);
        return this.a.y();
    }

    public final void w(Object obj, vvy vvyVar, vtp vtpVar) throws vup {
        N(3);
        Q(obj, vvyVar, vtpVar);
    }

    public final void x(Object obj, vvy vvyVar, vtp vtpVar) throws vuq {
        N(2);
        R(obj, vvyVar, vtpVar);
    }

    public final void y(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vsp) {
            vsp vspVar = (vsp) list;
            int iB = vwq.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iD = vteVar.d() + vteVar.n();
                do {
                    vspVar.e(vteVar.D());
                } while (vteVar.d() < iD);
                S(iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vspVar.e(vteVar2.D());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iD2 = vteVar3.d() + vteVar3.n();
                do {
                    list.add(Boolean.valueOf(vteVar3.D()));
                } while (vteVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Boolean.valueOf(vteVar4.D()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(List list) throws vuq {
        int iM;
        int iM2;
        if (list instanceof vtk) {
            vtk vtkVar = (vtk) list;
            int iB = vwq.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new vup();
                }
                vte vteVar = this.a;
                int iN = vteVar.n();
                U(iN);
                int iD = vteVar.d() + iN;
                do {
                    vtkVar.f(vteVar.b());
                } while (vteVar.d() < iD);
                return;
            }
            do {
                vte vteVar2 = this.a;
                vtkVar.f(vteVar2.b());
                if (vteVar2.C()) {
                    return;
                } else {
                    iM2 = vteVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = vwq.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new vup();
                }
                vte vteVar3 = this.a;
                int iN2 = vteVar3.n();
                U(iN2);
                int iD2 = vteVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(vteVar3.b()));
                } while (vteVar3.d() < iD2);
                return;
            }
            do {
                vte vteVar4 = this.a;
                list.add(Double.valueOf(vteVar4.b()));
                if (vteVar4.C()) {
                    return;
                } else {
                    iM = vteVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}

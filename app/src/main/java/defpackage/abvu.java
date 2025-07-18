package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.nio.charset.Charset;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvu implements abzd {
    public final abvt a;
    public int b;
    public int c = 0;
    private int d;

    private abvu(abvt abvtVar) {
        Charset charset = abxt.a;
        this.a = abvtVar;
        abvtVar.f = this;
    }

    private final void Q(Object obj, abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.d;
        this.d = ((this.b >>> 3) << 3) | 4;
        try {
            abzjVar.i(obj, this, extensionRegistryLite);
            if (this.b == this.d) {
            } else {
                throw new abxv("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        abvt abvtVar = this.a;
        int iN = abvtVar.n();
        abvtVar.M();
        int iE = abvtVar.e(iN);
        abvtVar.b++;
        abzjVar.i(obj, this, extensionRegistryLite);
        abvtVar.z(0);
        abvtVar.b--;
        abvtVar.A(iE);
    }

    private final void S(int i) throws abxv {
        if (this.a.d() != i) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void T(int i) throws abxv {
        if ((i & 3) != 0) {
            throw new abxv("Failed to parse the message.");
        }
    }

    private final void U(int i) throws abxv {
        if ((i & 7) != 0) {
            throw new abxv("Failed to parse the message.");
        }
    }

    public static abvu p(abvt abvtVar) {
        abvu abvuVar = abvtVar.f;
        return abvuVar != null ? abvuVar : new abvu(abvtVar);
    }

    @Override // defpackage.abzd
    public final void A(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abxeVar.h(abvtVar.f());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.f());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Integer.valueOf(abvtVar3.f()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.f()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void B(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i == 2) {
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                T(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abxeVar.h(abvtVar.g());
                } while (abvtVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.g());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                T(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(abvtVar3.g()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.g()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void C(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abyf) {
            abyf abyfVar = (abyf) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                U(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abyfVar.f(abvtVar.o());
                } while (abvtVar.d() < iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abyfVar.f(abvtVar2.o());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                U(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(abvtVar3.o()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Long.valueOf(abvtVar4.o()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void D(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abwt) {
            abwt abwtVar = (abwt) list;
            int i = this.b & 7;
            if (i == 2) {
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                T(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abwtVar.g(abvtVar.c());
                } while (abvtVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar2 = this.a;
                abwtVar.g(abvtVar2.c());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                T(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(abvtVar3.c()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Float.valueOf(abvtVar4.c()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void E(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abxeVar.h(abvtVar.h());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.h());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Integer.valueOf(abvtVar3.h()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.h()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void F(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abyf) {
            abyf abyfVar = (abyf) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abyfVar.f(abvtVar.p());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abyfVar.f(abvtVar2.p());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Long.valueOf(abvtVar3.p()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Long.valueOf(abvtVar4.p()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void G(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i == 2) {
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                T(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abxeVar.h(abvtVar.k());
                } while (abvtVar.d() < iD);
                return;
            }
            if (i != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.k());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 == 2) {
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                T(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(abvtVar3.k()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            if (i2 != 5) {
                throw new abxu();
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.k()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void H(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abyf) {
            abyf abyfVar = (abyf) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                U(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abyfVar.f(abvtVar.t());
                } while (abvtVar.d() < iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abyfVar.f(abvtVar2.t());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                U(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(abvtVar3.t()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Long.valueOf(abvtVar4.t()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void I(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abxeVar.h(abvtVar.l());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.l());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Integer.valueOf(abvtVar3.l()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.l()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void J(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abyf) {
            abyf abyfVar = (abyf) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abyfVar.f(abvtVar.u());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abyfVar.f(abvtVar2.u());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Long.valueOf(abvtVar3.u()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Long.valueOf(abvtVar4.u()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list, boolean z) throws abxu {
        int iM;
        int iM2;
        if ((this.b & 7) != 2) {
            throw new abxu();
        }
        if ((list instanceof abyc) && !z) {
            abyc abycVar = (abyc) list;
            do {
                o();
                abycVar.b();
                abvt abvtVar = this.a;
                if (abvtVar.C()) {
                    return;
                } else {
                    iM2 = abvtVar.m();
                }
            } while (iM2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                abvt abvtVar2 = this.a;
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM = abvtVar2.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void L(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abxe) {
            abxe abxeVar = (abxe) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abxeVar.h(abvtVar.n());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abxeVar.h(abvtVar2.n());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Integer.valueOf(abvtVar3.n()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Integer.valueOf(abvtVar4.n()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void M(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abyf) {
            abyf abyfVar = (abyf) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abyfVar.f(abvtVar.v());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abyfVar.f(abvtVar2.v());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Long.valueOf(abvtVar3.v()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Long.valueOf(abvtVar4.v()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void N(int i) throws abxu {
        if ((this.b & 7) != i) {
            throw new abxu();
        }
    }

    @Override // defpackage.abzd
    public final boolean O() throws abxu {
        N(0);
        return this.a.D();
    }

    @Override // defpackage.abzd
    public final boolean P() {
        int i;
        abvt abvtVar = this.a;
        if (abvtVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return abvtVar.E(i);
    }

    @Override // defpackage.abzd
    public final double a() throws abxu {
        N(1);
        return this.a.b();
    }

    @Override // defpackage.abzd
    public final float b() throws abxu {
        N(5);
        return this.a.c();
    }

    @Override // defpackage.abzd
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
        return iM >>> 3;
    }

    @Override // defpackage.abzd
    public final int d() throws abxu {
        N(0);
        return this.a.f();
    }

    @Override // defpackage.abzd
    public final int e() throws abxu {
        N(5);
        return this.a.g();
    }

    @Override // defpackage.abzd
    public final int f() throws abxu {
        N(0);
        return this.a.h();
    }

    @Override // defpackage.abzd
    public final int g() throws abxu {
        N(5);
        return this.a.k();
    }

    @Override // defpackage.abzd
    public final int h() throws abxu {
        N(0);
        return this.a.l();
    }

    @Override // defpackage.abzd
    public final int i() throws abxu {
        N(0);
        return this.a.n();
    }

    @Override // defpackage.abzd
    public final long j() throws abxu {
        N(1);
        return this.a.o();
    }

    @Override // defpackage.abzd
    public final long k() throws abxu {
        N(0);
        return this.a.p();
    }

    @Override // defpackage.abzd
    public final long l() throws abxu {
        N(1);
        return this.a.t();
    }

    @Override // defpackage.abzd
    public final long m() throws abxu {
        N(0);
        return this.a.u();
    }

    @Override // defpackage.abzd
    public final long n() throws abxu {
        N(0);
        return this.a.v();
    }

    @Override // defpackage.abzd
    public final abvo o() throws abxu {
        N(2);
        return this.a.w();
    }

    public final Object q(acap acapVar, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        acap acapVar2 = acap.DOUBLE;
        switch (acapVar.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(k());
            case 3:
                return Long.valueOf(n());
            case 4:
                return Integer.valueOf(f());
            case 5:
                return Long.valueOf(j());
            case 6:
                return Integer.valueOf(e());
            case 7:
                return Boolean.valueOf(O());
            case 8:
                return v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return t(cls, extensionRegistryLite);
            case 11:
                return o();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Integer.valueOf(i());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Integer.valueOf(d());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(g());
            case 15:
                return Long.valueOf(l());
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(m());
        }
    }

    public final Object r(abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) {
        Object objE = abzjVar.e();
        Q(objE, abzjVar, extensionRegistryLite);
        abzjVar.g(objE);
        return objE;
    }

    public final Object s(abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        Object objE = abzjVar.e();
        R(objE, abzjVar, extensionRegistryLite);
        abzjVar.g(objE);
        return objE;
    }

    @Override // defpackage.abzd
    public final Object t(Class cls, ExtensionRegistryLite extensionRegistryLite) throws abxu {
        N(2);
        return s(abza.a.a(cls), extensionRegistryLite);
    }

    @Override // defpackage.abzd
    public final String u() throws abxu {
        N(2);
        return this.a.x();
    }

    @Override // defpackage.abzd
    public final String v() throws abxu {
        N(2);
        return this.a.y();
    }

    @Override // defpackage.abzd
    public final void w(Object obj, abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) throws abxu {
        N(3);
        Q(obj, abzjVar, extensionRegistryLite);
    }

    @Override // defpackage.abzd
    public final void x(Object obj, abzj abzjVar, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        N(2);
        R(obj, abzjVar, extensionRegistryLite);
    }

    @Override // defpackage.abzd
    public final void y(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abve) {
            abve abveVar = (abve) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iD = abvtVar.d() + abvtVar.n();
                do {
                    abveVar.e(abvtVar.D());
                } while (abvtVar.d() < iD);
                S(iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abveVar.e(abvtVar2.D());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iD2 = abvtVar3.d() + abvtVar3.n();
                do {
                    list.add(Boolean.valueOf(abvtVar3.D()));
                } while (abvtVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Boolean.valueOf(abvtVar4.D()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.abzd
    public final void z(List list) throws abxv {
        int iM;
        int iM2;
        if (list instanceof abwd) {
            abwd abwdVar = (abwd) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new abxu();
                }
                abvt abvtVar = this.a;
                int iN = abvtVar.n();
                U(iN);
                int iD = abvtVar.d() + iN;
                do {
                    abwdVar.f(abvtVar.b());
                } while (abvtVar.d() < iD);
                return;
            }
            do {
                abvt abvtVar2 = this.a;
                abwdVar.f(abvtVar2.b());
                if (abvtVar2.C()) {
                    return;
                } else {
                    iM2 = abvtVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int i2 = this.b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new abxu();
                }
                abvt abvtVar3 = this.a;
                int iN2 = abvtVar3.n();
                U(iN2);
                int iD2 = abvtVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(abvtVar3.b()));
                } while (abvtVar3.d() < iD2);
                return;
            }
            do {
                abvt abvtVar4 = this.a;
                list.add(Double.valueOf(abvtVar4.b()));
                if (abvtVar4.C()) {
                    return;
                } else {
                    iM = abvtVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}

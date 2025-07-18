package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class som {
    public int a;
    public int b;
    public final Object c;
    private int d;

    public som(View view) {
        this.c = view;
    }

    public static /* synthetic */ void N(som somVar, List list) throws der {
        int iH;
        int iH2;
        if (list instanceof del) {
            del delVar = (del) list;
            int iB = dgn.b(somVar.b);
            if (iB == 2) {
                Object obj = somVar.c;
                ddu dduVar = (ddu) obj;
                int iL = dduVar.l();
                R(iL);
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    delVar.f(dduVar.f());
                } while (ddvVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new deq();
            }
            do {
                Object obj2 = somVar.c;
                delVar.f(((ddu) obj2).f());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == somVar.b);
        } else {
            int iB2 = dgn.b(somVar.b);
            if (iB2 == 2) {
                Object obj3 = somVar.c;
                ddu dduVar2 = (ddu) obj3;
                int iL2 = dduVar2.l();
                R(iL2);
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Integer.valueOf(dduVar2.f()));
                } while (ddvVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new deq();
            }
            do {
                Object obj4 = somVar.c;
                list.add(Integer.valueOf(((ddu) obj4).f()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == somVar.b);
            iH2 = iH;
        }
        somVar.a = iH2;
    }

    public static /* synthetic */ void O(som somVar, List list) throws der {
        int iH;
        int iH2;
        if (list instanceof dex) {
            dex dexVar = (dex) list;
            int iB = dgn.b(somVar.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = somVar.c;
                ddu dduVar = (ddu) obj;
                int iL = dduVar.l();
                S(iL);
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    dexVar.f(dduVar.p());
                } while (ddvVar.d() < iD);
                return;
            }
            do {
                Object obj2 = somVar.c;
                dexVar.f(((ddu) obj2).p());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == somVar.b);
        } else {
            int iB2 = dgn.b(somVar.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = somVar.c;
                ddu dduVar2 = (ddu) obj3;
                int iL2 = dduVar2.l();
                S(iL2);
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Long.valueOf(dduVar2.p()));
                } while (ddvVar3.d() < iD2);
                return;
            }
            do {
                Object obj4 = somVar.c;
                list.add(Long.valueOf(((ddu) obj4).p()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == somVar.b);
            iH2 = iH;
        }
        somVar.a = iH2;
    }

    private final void P(Object obj, dfs dfsVar, ded dedVar) throws der {
        Object obj2 = this.c;
        int iL = ((ddu) obj2).l();
        ddv ddvVar = (ddv) obj2;
        if (ddvVar.e >= ddvVar.f) {
            throw new der("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = ddvVar.e(iL);
        ddvVar.e++;
        dfsVar.h(obj, this, dedVar);
        ddvVar.j(0);
        ddvVar.e--;
        ddvVar.k(iE);
    }

    private final void Q(int i) throws der {
        if (((ddv) this.c).d() != i) {
            throw new der("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void R(int i) throws der {
        if ((i & 3) != 0) {
            throw new der("Failed to parse the message.");
        }
    }

    private static final void S(int i) throws der {
        if ((i & 7) != 0) {
            throw new der("Failed to parse the message.");
        }
    }

    public final void A(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof dea) {
            dea deaVar = (dea) list;
            int iB = dgn.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                int iL = ((ddu) obj).l();
                S(iL);
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    deaVar.f(ddvVar.b());
                } while (ddvVar.d() < iD);
                return;
            }
            do {
                ddv ddvVar2 = (ddv) this.c;
                deaVar.f(ddvVar2.b());
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj2 = this.c;
                int iL2 = ((ddu) obj2).l();
                S(iL2);
                ddv ddvVar3 = (ddv) obj2;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Double.valueOf(ddvVar3.b()));
                } while (ddvVar3.d() < iD2);
                return;
            }
            do {
                ddv ddvVar4 = (ddv) this.c;
                list.add(Double.valueOf(ddvVar4.b()));
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void B(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof del) {
            del delVar = (del) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                ddu dduVar = (ddu) obj;
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + dduVar.l();
                do {
                    delVar.f(dduVar.l());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                delVar.f(((ddu) obj2).l());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = this.c;
                ddu dduVar2 = (ddu) obj3;
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + dduVar2.l();
                do {
                    list.add(Integer.valueOf(dduVar2.l()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((ddu) obj4).l()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void C(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof deh) {
            deh dehVar = (deh) list;
            int iB = dgn.b(this.b);
            if (iB == 2) {
                Object obj = this.c;
                int iL = ((ddu) obj).l();
                R(iL);
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    dehVar.f(ddvVar.c());
                } while (ddvVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new deq();
            }
            do {
                ddv ddvVar2 = (ddv) this.c;
                dehVar.f(ddvVar2.c());
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 == 2) {
                Object obj2 = this.c;
                int iL2 = ((ddu) obj2).l();
                R(iL2);
                ddv ddvVar3 = (ddv) obj2;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Float.valueOf(ddvVar3.c()));
                } while (ddvVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new deq();
            }
            do {
                ddv ddvVar4 = (ddv) this.c;
                list.add(Float.valueOf(ddvVar4.c()));
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void D(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof del) {
            del delVar = (del) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                ddu dduVar = (ddu) obj;
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + dduVar.l();
                do {
                    delVar.f(dduVar.l());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                delVar.f(((ddu) obj2).l());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = this.c;
                ddu dduVar2 = (ddu) obj3;
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + dduVar2.l();
                do {
                    list.add(Integer.valueOf(dduVar2.l()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((ddu) obj4).l()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void E(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof dex) {
            dex dexVar = (dex) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                ddu dduVar = (ddu) obj;
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + dduVar.l();
                do {
                    dexVar.f(dduVar.q());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                dexVar.f(((ddu) obj2).q());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = this.c;
                ddu dduVar2 = (ddu) obj3;
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + dduVar2.l();
                do {
                    list.add(Long.valueOf(dduVar2.q()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Long.valueOf(((ddu) obj4).q()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void F(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof del) {
            del delVar = (del) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                int iL = ((ddu) obj).l();
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    delVar.f(ddvVar.g());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                ddv ddvVar2 = (ddv) this.c;
                delVar.f(ddvVar2.g());
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj2 = this.c;
                int iL2 = ((ddu) obj2).l();
                ddv ddvVar3 = (ddv) obj2;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Integer.valueOf(ddvVar3.g()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                ddv ddvVar4 = (ddv) this.c;
                list.add(Integer.valueOf(ddvVar4.g()));
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void G(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof dex) {
            dex dexVar = (dex) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                int iL = ((ddu) obj).l();
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    dexVar.f(ddvVar.i());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                ddv ddvVar2 = (ddv) this.c;
                dexVar.f(ddvVar2.i());
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj2 = this.c;
                int iL2 = ((ddu) obj2).l();
                ddv ddvVar3 = (ddv) obj2;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Long.valueOf(ddvVar3.i()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                ddv ddvVar4 = (ddv) this.c;
                list.add(Long.valueOf(ddvVar4.i()));
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void H(List list, boolean z) throws der {
        int iH;
        int iH2;
        if (dgn.b(this.b) != 2) {
            throw new deq();
        }
        if ((list instanceof dev) && !z) {
            dev devVar = (dev) list;
            do {
                r();
                devVar.b();
                ddv ddvVar = (ddv) this.c;
                if (ddvVar.m()) {
                    return;
                } else {
                    iH2 = ddvVar.h();
                }
            } while (iH2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                ddv ddvVar2 = (ddv) this.c;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH = ddvVar2.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void I(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof del) {
            del delVar = (del) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                ddu dduVar = (ddu) obj;
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + dduVar.l();
                do {
                    delVar.f(dduVar.l());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                delVar.f(((ddu) obj2).l());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = this.c;
                ddu dduVar2 = (ddu) obj3;
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + dduVar2.l();
                do {
                    list.add(Integer.valueOf(dduVar2.l()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Integer.valueOf(((ddu) obj4).l()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void J(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof dex) {
            dex dexVar = (dex) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                ddu dduVar = (ddu) obj;
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + dduVar.l();
                do {
                    dexVar.f(dduVar.q());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                Object obj2 = this.c;
                dexVar.f(((ddu) obj2).q());
                ddv ddvVar2 = (ddv) obj2;
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj3 = this.c;
                ddu dduVar2 = (ddu) obj3;
                ddv ddvVar3 = (ddv) obj3;
                int iD2 = ddvVar3.d() + dduVar2.l();
                do {
                    list.add(Long.valueOf(dduVar2.q()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                Object obj4 = this.c;
                list.add(Long.valueOf(((ddu) obj4).q()));
                ddv ddvVar4 = (ddv) obj4;
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public final void K(int i) throws deq {
        if (dgn.b(this.b) != i) {
            throw new deq();
        }
    }

    public final boolean L() throws deq {
        K(0);
        return ((ddv) this.c).n();
    }

    public final boolean M() {
        int i;
        ddv ddvVar = (ddv) this.c;
        if (ddvVar.m() || (i = this.b) == this.d) {
            return false;
        }
        return ddvVar.o(i);
    }

    public final void a() {
        View view = (View) this.c;
        int top = this.b - (view.getTop() - this.a);
        int[] iArr = cww.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(-(view.getLeft() - this.d));
    }

    public final void b() {
        View view = (View) this.c;
        this.a = view.getTop();
        this.d = view.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }

    public final double d() throws deq {
        K(1);
        return ((ddv) this.c).b();
    }

    public final float e() throws deq {
        K(5);
        return ((ddv) this.c).c();
    }

    public final int f() {
        int iH = this.a;
        if (iH != 0) {
            this.b = iH;
            this.a = 0;
        } else {
            iH = ((ddv) this.c).h();
            this.b = iH;
        }
        return (iH == 0 || iH == this.d) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : dgn.a(iH);
    }

    public final int g() throws deq {
        K(0);
        return ((ddu) this.c).l();
    }

    public final int h() throws deq {
        K(5);
        return ((ddu) this.c).f();
    }

    public final int i() throws deq {
        K(0);
        return ((ddu) this.c).l();
    }

    public final int j() throws deq {
        K(5);
        return ((ddu) this.c).f();
    }

    public final int k() throws deq {
        K(0);
        return ((ddv) this.c).g();
    }

    public final int l() throws deq {
        K(0);
        return ((ddu) this.c).l();
    }

    public final long m() throws deq {
        K(1);
        return ((ddu) this.c).p();
    }

    public final long n() throws deq {
        K(0);
        return ((ddu) this.c).q();
    }

    public final long o() throws deq {
        K(1);
        return ((ddu) this.c).p();
    }

    public final long p() throws deq {
        K(0);
        return ((ddv) this.c).i();
    }

    public final long q() throws deq {
        K(0);
        return ((ddu) this.c).q();
    }

    public final dds r() throws der {
        K(2);
        ddu dduVar = (ddu) this.c;
        int iL = dduVar.l();
        int i = dduVar.b;
        int i2 = dduVar.c;
        if (iL <= i - i2 && iL > 0) {
            dds ddsVarJ = dds.j(dduVar.a, i2, iL);
            dduVar.c += iL;
            return ddsVarJ;
        }
        if (iL == 0) {
            return dds.b;
        }
        if (iL < 0) {
            throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrV = dduVar.v(iL);
        if (bArrV != null) {
            return dds.i(bArrV);
        }
        int i3 = dduVar.c;
        int i4 = dduVar.b;
        int i5 = i4 - i3;
        dduVar.d += i4;
        dduVar.c = 0;
        dduVar.b = 0;
        List<byte[]> listS = dduVar.s(iL - i5);
        byte[] bArr = new byte[iL];
        System.arraycopy(dduVar.a, i3, bArr, 0, i5);
        for (byte[] bArr2 : listS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        dds ddsVar = dds.b;
        return new ddq(bArr);
    }

    public final Object s(dgl dglVar, Class cls, ded dedVar) throws deq {
        dgl dglVar2 = dgl.DOUBLE;
        switch (dglVar.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(n());
            case 3:
                return Long.valueOf(q());
            case 4:
                return Integer.valueOf(i());
            case 5:
                return Long.valueOf(m());
            case 6:
                return Integer.valueOf(h());
            case 7:
                return Boolean.valueOf(L());
            case 8:
                return v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                K(2);
                return t(dfp.a.a(cls), dedVar);
            case 11:
                return r();
            case 12:
                return Integer.valueOf(l());
            case 13:
                return Integer.valueOf(g());
            case 14:
                return Integer.valueOf(j());
            case 15:
                return Long.valueOf(o());
            case 16:
                return Integer.valueOf(k());
            case 17:
                return Long.valueOf(p());
        }
    }

    public final Object t(dfs dfsVar, ded dedVar) throws der {
        Object objC = dfsVar.c();
        P(objC, dfsVar, dedVar);
        dfsVar.d(objC);
        return objC;
    }

    public final String u() throws der {
        K(2);
        ddu dduVar = (ddu) this.c;
        int iL = dduVar.l();
        if (iL > 0) {
            int i = dduVar.b;
            int i2 = dduVar.c;
            if (iL <= i - i2) {
                String str = new String(dduVar.a, i2, iL, dep.a);
                dduVar.c += iL;
                return str;
            }
        }
        if (iL == 0) {
            return "";
        }
        if (iL < 0) {
            throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iL > dduVar.b) {
            return new String(dduVar.w(iL), dep.a);
        }
        dduVar.t(iL);
        String str2 = new String(dduVar.a, dduVar.c, iL, dep.a);
        dduVar.c += iL;
        return str2;
    }

    public final String v() throws der {
        byte[] bArrW;
        K(2);
        ddu dduVar = (ddu) this.c;
        int iL = dduVar.l();
        int i = dduVar.c;
        int i2 = dduVar.b;
        if (iL <= i2 - i && iL > 0) {
            bArrW = dduVar.a;
            dduVar.c = i + iL;
        } else {
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw new der("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iL <= i2) {
                dduVar.t(iL);
                bArrW = dduVar.a;
                dduVar.c = iL;
            } else {
                bArrW = dduVar.w(iL);
            }
        }
        return dgk.a.b(bArrW, i, iL);
    }

    public final void w(Object obj, dfs dfsVar, ded dedVar) throws deq {
        K(3);
        x(obj, dfsVar, dedVar);
    }

    public final void x(Object obj, dfs dfsVar, ded dedVar) {
        int i = this.d;
        this.d = dgn.c(dgn.a(this.b), 4);
        try {
            dfsVar.h(obj, this, dedVar);
            if (this.b == this.d) {
            } else {
                throw new der("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    public final void y(Object obj, dfs dfsVar, ded dedVar) throws der {
        K(2);
        P(obj, dfsVar, dedVar);
    }

    public final void z(List list) throws der {
        int iH;
        int iH2;
        if (list instanceof ddl) {
            ddl ddlVar = (ddl) list;
            int iB = dgn.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new deq();
                }
                Object obj = this.c;
                int iL = ((ddu) obj).l();
                ddv ddvVar = (ddv) obj;
                int iD = ddvVar.d() + iL;
                do {
                    ddlVar.e(ddvVar.n());
                } while (ddvVar.d() < iD);
                Q(iD);
                return;
            }
            do {
                ddv ddvVar2 = (ddv) this.c;
                ddlVar.e(ddvVar2.n());
                if (ddvVar2.m()) {
                    return;
                } else {
                    iH2 = ddvVar2.h();
                }
            } while (iH2 == this.b);
        } else {
            int iB2 = dgn.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new deq();
                }
                Object obj2 = this.c;
                int iL2 = ((ddu) obj2).l();
                ddv ddvVar3 = (ddv) obj2;
                int iD2 = ddvVar3.d() + iL2;
                do {
                    list.add(Boolean.valueOf(ddvVar3.n()));
                } while (ddvVar3.d() < iD2);
                Q(iD2);
                return;
            }
            do {
                ddv ddvVar4 = (ddv) this.c;
                list.add(Boolean.valueOf(ddvVar4.n()));
                if (ddvVar4.m()) {
                    return;
                } else {
                    iH = ddvVar4.h();
                }
            } while (iH == this.b);
            iH2 = iH;
        }
        this.a = iH2;
    }

    public som(ddv ddvVar) {
        this.a = 0;
        Charset charset = dep.a;
        this.c = ddvVar;
        ddvVar.g = this;
    }
}

package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aacs extends aact {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient aabm A;
    private transient aabm B;
    private transient aabm C;
    private transient aabm D;
    private transient aabm E;
    private transient aabm F;
    private transient aabm G;
    private transient aabm I;
    private transient aabm J;
    private transient aabm K;
    private transient int L;
    public final aabk a;
    public final Object b;
    private transient aabm bT;
    public transient aabu c;
    public transient aabu d;
    public transient aabu e;
    public transient aabu f;
    public transient aabu g;
    public transient aabu h;
    public transient aabm i;
    public transient aabm j;
    public transient aabm k;
    public transient aabm l;
    public transient aabm m;
    public transient aabm n;
    private transient aabu o;
    private transient aabu p;
    private transient aabu q;
    private transient aabu r;
    private transient aabu s;
    private transient aabu t;
    private transient aabm u;
    private transient aabm v;
    private transient aabm w;
    private transient aabm x;
    private transient aabm y;
    private transient aabm z;

    protected aacs(aabk aabkVar, Object obj) {
        this.a = aabkVar;
        this.b = obj;
        P();
    }

    private final void P() {
        aacr aacrVar = new aacr();
        aabk aabkVar = this.a;
        if (aabkVar != null) {
            aabu aabuVarF = aabkVar.F();
            if (aacr.b(aabuVarF)) {
                aacrVar.a = aabuVarF;
            }
            aabu aabuVarI = aabkVar.I();
            if (aacr.b(aabuVarI)) {
                aacrVar.b = aabuVarI;
            }
            aabu aabuVarG = aabkVar.G();
            if (aacr.b(aabuVarG)) {
                aacrVar.c = aabuVarG;
            }
            aabu aabuVarE = aabkVar.E();
            if (aacr.b(aabuVarE)) {
                aacrVar.d = aabuVarE;
            }
            aabu aabuVarD = aabkVar.D();
            if (aacr.b(aabuVarD)) {
                aacrVar.e = aabuVarD;
            }
            aabu aabuVarB = aabkVar.B();
            if (aacr.b(aabuVarB)) {
                aacrVar.f = aabuVarB;
            }
            aabu aabuVarJ = aabkVar.J();
            if (aacr.b(aabuVarJ)) {
                aacrVar.g = aabuVarJ;
            }
            aabu aabuVarK = aabkVar.K();
            if (aacr.b(aabuVarK)) {
                aacrVar.h = aabuVarK;
            }
            aabu aabuVarH = aabkVar.H();
            if (aacr.b(aabuVarH)) {
                aacrVar.i = aabuVarH;
            }
            aabu aabuVarL = aabkVar.L();
            if (aacr.b(aabuVarL)) {
                aacrVar.j = aabuVarL;
            }
            aabu aabuVarA = aabkVar.A();
            if (aacr.b(aabuVarA)) {
                aacrVar.k = aabuVarA;
            }
            aabu aabuVarC = aabkVar.C();
            if (aacr.b(aabuVarC)) {
                aacrVar.l = aabuVarC;
            }
            aabm aabmVarN = aabkVar.n();
            if (aacr.a(aabmVarN)) {
                aacrVar.m = aabmVarN;
            }
            aabm aabmVarM = aabkVar.m();
            if (aacr.a(aabmVarM)) {
                aacrVar.n = aabmVarM;
            }
            aabm aabmVarS = aabkVar.s();
            if (aacr.a(aabmVarS)) {
                aacrVar.o = aabmVarS;
            }
            aabm aabmVarR = aabkVar.r();
            if (aacr.a(aabmVarR)) {
                aacrVar.p = aabmVarR;
            }
            aabm aabmVarP = aabkVar.p();
            if (aacr.a(aabmVarP)) {
                aacrVar.q = aabmVarP;
            }
            aabm aabmVarO = aabkVar.o();
            if (aacr.a(aabmVarO)) {
                aacrVar.r = aabmVarO;
            }
            aabm aabmVarK = aabkVar.k();
            if (aacr.a(aabmVarK)) {
                aacrVar.s = aabmVarK;
            }
            aabm aabmVarD = aabkVar.d();
            if (aacr.a(aabmVarD)) {
                aacrVar.t = aabmVarD;
            }
            aabm aabmVarL = aabkVar.l();
            if (aacr.a(aabmVarL)) {
                aacrVar.u = aabmVarL;
            }
            aabm aabmVarE = aabkVar.e();
            if (aacr.a(aabmVarE)) {
                aacrVar.v = aabmVarE;
            }
            aabm aabmVarJ = aabkVar.j();
            if (aacr.a(aabmVarJ)) {
                aacrVar.w = aabmVarJ;
            }
            aabm aabmVarG = aabkVar.g();
            if (aacr.a(aabmVarG)) {
                aacrVar.x = aabmVarG;
            }
            aabm aabmVarF = aabkVar.f();
            if (aacr.a(aabmVarF)) {
                aacrVar.y = aabmVarF;
            }
            aabm aabmVarH = aabkVar.h();
            if (aacr.a(aabmVarH)) {
                aacrVar.z = aabmVarH;
            }
            aabm aabmVarT = aabkVar.t();
            if (aacr.a(aabmVarT)) {
                aacrVar.A = aabmVarT;
            }
            aabm aabmVarU = aabkVar.u();
            if (aacr.a(aabmVarU)) {
                aacrVar.B = aabmVarU;
            }
            aabm aabmVarV = aabkVar.v();
            if (aacr.a(aabmVarV)) {
                aacrVar.C = aabmVarV;
            }
            aabm aabmVarQ = aabkVar.q();
            if (aacr.a(aabmVarQ)) {
                aacrVar.D = aabmVarQ;
            }
            aabm aabmVarW = aabkVar.w();
            if (aacr.a(aabmVarW)) {
                aacrVar.E = aabmVarW;
            }
            aabm aabmVarY = aabkVar.y();
            if (aacr.a(aabmVarY)) {
                aacrVar.F = aabmVarY;
            }
            aabm aabmVarX = aabkVar.x();
            if (aacr.a(aabmVarX)) {
                aacrVar.G = aabmVarX;
            }
            aabm aabmVarC = aabkVar.c();
            if (aacr.a(aabmVarC)) {
                aacrVar.H = aabmVarC;
            }
            aabm aabmVarI = aabkVar.i();
            if (aacr.a(aabmVarI)) {
                aacrVar.I = aabmVarI;
            }
        }
        O(aacrVar);
        aabu aabuVarF2 = aacrVar.a;
        if (aabuVarF2 == null) {
            aabuVarF2 = super.F();
        }
        this.o = aabuVarF2;
        aabu aabuVarI2 = aacrVar.b;
        if (aabuVarI2 == null) {
            aabuVarI2 = super.I();
        }
        this.p = aabuVarI2;
        aabu aabuVarG2 = aacrVar.c;
        if (aabuVarG2 == null) {
            aabuVarG2 = super.G();
        }
        this.q = aabuVarG2;
        aabu aabuVarE2 = aacrVar.d;
        if (aabuVarE2 == null) {
            aabuVarE2 = super.E();
        }
        this.r = aabuVarE2;
        aabu aabuVarD2 = aacrVar.e;
        if (aabuVarD2 == null) {
            aabuVarD2 = super.D();
        }
        this.s = aabuVarD2;
        aabu aabuVarB2 = aacrVar.f;
        if (aabuVarB2 == null) {
            aabuVarB2 = super.B();
        }
        this.c = aabuVarB2;
        aabu aabuVarJ2 = aacrVar.g;
        if (aabuVarJ2 == null) {
            aabuVarJ2 = super.J();
        }
        this.d = aabuVarJ2;
        aabu aabuVarK2 = aacrVar.h;
        if (aabuVarK2 == null) {
            aabuVarK2 = super.K();
        }
        this.e = aabuVarK2;
        aabu aabuVarH2 = aacrVar.i;
        if (aabuVarH2 == null) {
            aabuVarH2 = super.H();
        }
        this.f = aabuVarH2;
        aabu aabuVarL2 = aacrVar.j;
        if (aabuVarL2 == null) {
            aabuVarL2 = super.L();
        }
        this.g = aabuVarL2;
        aabu aabuVarA2 = aacrVar.k;
        if (aabuVarA2 == null) {
            aabuVarA2 = super.A();
        }
        this.t = aabuVarA2;
        aabu aabuVarC2 = aacrVar.l;
        if (aabuVarC2 == null) {
            aabuVarC2 = super.C();
        }
        this.h = aabuVarC2;
        aabm aabmVarN2 = aacrVar.m;
        if (aabmVarN2 == null) {
            aabmVarN2 = super.n();
        }
        this.u = aabmVarN2;
        aabm aabmVarM2 = aacrVar.n;
        if (aabmVarM2 == null) {
            aabmVarM2 = super.m();
        }
        this.i = aabmVarM2;
        aabm aabmVarS2 = aacrVar.o;
        if (aabmVarS2 == null) {
            aabmVarS2 = super.s();
        }
        this.v = aabmVarS2;
        aabm aabmVarR2 = aacrVar.p;
        if (aabmVarR2 == null) {
            aabmVarR2 = super.r();
        }
        this.w = aabmVarR2;
        aabm aabmVarP2 = aacrVar.q;
        if (aabmVarP2 == null) {
            aabmVarP2 = super.p();
        }
        this.x = aabmVarP2;
        aabm aabmVarO2 = aacrVar.r;
        if (aabmVarO2 == null) {
            aabmVarO2 = super.o();
        }
        this.y = aabmVarO2;
        aabm aabmVarK2 = aacrVar.s;
        if (aabmVarK2 == null) {
            aabmVarK2 = super.k();
        }
        this.z = aabmVarK2;
        aabm aabmVarD2 = aacrVar.t;
        if (aabmVarD2 == null) {
            aabmVarD2 = super.d();
        }
        this.A = aabmVarD2;
        aabm aabmVarL2 = aacrVar.u;
        if (aabmVarL2 == null) {
            aabmVarL2 = super.l();
        }
        this.B = aabmVarL2;
        aabm aabmVarE2 = aacrVar.v;
        if (aabmVarE2 == null) {
            aabmVarE2 = super.e();
        }
        this.C = aabmVarE2;
        aabm aabmVarJ2 = aacrVar.w;
        if (aabmVarJ2 == null) {
            aabmVarJ2 = super.j();
        }
        this.D = aabmVarJ2;
        aabm aabmVarG2 = aacrVar.x;
        if (aabmVarG2 == null) {
            aabmVarG2 = super.g();
        }
        this.j = aabmVarG2;
        aabm aabmVarF2 = aacrVar.y;
        if (aabmVarF2 == null) {
            aabmVarF2 = super.f();
        }
        this.k = aabmVarF2;
        aabm aabmVarH2 = aacrVar.z;
        if (aabmVarH2 == null) {
            aabmVarH2 = super.h();
        }
        this.E = aabmVarH2;
        aabm aabmVarT2 = aacrVar.A;
        if (aabmVarT2 == null) {
            aabmVarT2 = super.t();
        }
        this.l = aabmVarT2;
        aabm aabmVarU2 = aacrVar.B;
        if (aabmVarU2 == null) {
            aabmVarU2 = super.u();
        }
        this.F = aabmVarU2;
        aabm aabmVarV2 = aacrVar.C;
        if (aabmVarV2 == null) {
            aabmVarV2 = super.v();
        }
        this.G = aabmVarV2;
        aabm aabmVarQ2 = aacrVar.D;
        if (aabmVarQ2 == null) {
            aabmVarQ2 = super.q();
        }
        this.m = aabmVarQ2;
        aabm aabmVarW2 = aacrVar.E;
        if (aabmVarW2 == null) {
            aabmVarW2 = super.w();
        }
        this.n = aabmVarW2;
        aabm aabmVarY2 = aacrVar.F;
        if (aabmVarY2 == null) {
            aabmVarY2 = super.y();
        }
        this.bT = aabmVarY2;
        aabm aabmVarX2 = aacrVar.G;
        if (aabmVarX2 == null) {
            aabmVarX2 = super.x();
        }
        this.I = aabmVarX2;
        aabm aabmVarC2 = aacrVar.H;
        if (aabmVarC2 == null) {
            aabmVarC2 = super.c();
        }
        this.J = aabmVarC2;
        aabm aabmVarI2 = aacrVar.I;
        if (aabmVarI2 == null) {
            aabmVarI2 = super.i();
        }
        this.K = aabmVarI2;
        int i = 0;
        if (aabkVar != null) {
            int i2 = (this.z == aabkVar.k() && this.x == aabkVar.p() && this.v == aabkVar.s() && this.u == aabkVar.n()) ? 1 : 0;
            int i3 = this.i == aabkVar.m() ? 2 : 0;
            if (this.n == aabkVar.w() && this.m == aabkVar.q() && this.k == aabkVar.f()) {
                i = 4;
            }
            i |= i2 | i3;
        }
        this.L = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        P();
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu A() {
        return this.t;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu B() {
        return this.c;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu C() {
        return this.h;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu D() {
        return this.s;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu E() {
        return this.r;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu F() {
        return this.o;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu G() {
        return this.q;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu H() {
        return this.f;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu I() {
        return this.p;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu J() {
        return this.d;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu K() {
        return this.e;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabu L() {
        return this.g;
    }

    @Override // defpackage.aact, defpackage.aabk
    public long M(int i, int i2, int i3) {
        aabk aabkVar = this.a;
        return (aabkVar == null || (this.L & 6) != 6) ? super.M(i, i2, i3) : aabkVar.M(i, i2, i3);
    }

    protected abstract void O(aacr aacrVar);

    @Override // defpackage.aact, defpackage.aabk
    public final aabm c() {
        return this.J;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm d() {
        return this.A;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm e() {
        return this.C;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm f() {
        return this.k;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm g() {
        return this.j;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm h() {
        return this.E;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm i() {
        return this.K;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm j() {
        return this.D;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm k() {
        return this.z;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm l() {
        return this.B;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm m() {
        return this.i;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm n() {
        return this.u;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm o() {
        return this.y;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm p() {
        return this.x;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm q() {
        return this.m;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm r() {
        return this.w;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm s() {
        return this.v;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm t() {
        return this.l;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm u() {
        return this.F;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm v() {
        return this.G;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm w() {
        return this.n;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm x() {
        return this.I;
    }

    @Override // defpackage.aact, defpackage.aabk
    public final aabm y() {
        return this.bT;
    }

    @Override // defpackage.aabk
    public aabs z() {
        aabk aabkVar = this.a;
        if (aabkVar != null) {
            return aabkVar.z();
        }
        return null;
    }
}

package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahar extends ahci implements ahap, agtr, ahet {
    public final agsw a;
    public final agte b;
    public final agzw c;
    public final agzy d;
    private final agzy f;

    public ahar(agsw agswVar, int i) {
        super(i);
        this.a = agswVar;
        boolean z = ahbx.a;
        this.b = agswVar.fr();
        agzz agzzVar = agzz.a;
        this.c = new agzw(536870911, agzzVar);
        this.d = new agzy(ahac.a, agzzVar);
        this.f = new agzy(null, agzzVar);
    }

    private final ahcn I() {
        ahdl ahdlVar = (ahdl) this.b.get(ahdl.c);
        if (ahdlVar == null) {
            return null;
        }
        ahcn ahcnVarB = ahdp.b(ahdlVar, true, new ahav(this));
        this.f.d(null, ahcnVarB);
        return ahcnVarB;
    }

    private final void J(Object obj, Object obj2) {
        throw new IllegalStateException(a.d(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private final Object K(ahed ahedVar, Object obj, int i, agvc agvcVar) {
        agvc agvcVar2;
        if (obj instanceof ahbc) {
            boolean z = ahbx.a;
            return obj;
        }
        if (ahcj.b(i)) {
            if (agvcVar != null) {
                agvcVar2 = agvcVar;
            } else if (ahedVar instanceof ahao) {
                agvcVar2 = null;
            }
            return new ahbb(obj, ahedVar instanceof ahao ? (ahao) ahedVar : null, agvcVar2, null, 16);
        }
        return obj;
    }

    private final void L(ahmd ahmdVar) {
        int i = this.c.c & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            ahmdVar.i(i);
        } catch (Throwable th) {
            agte agteVar = this.b;
            toString();
            ahbo.b(agteVar, new ahbd("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    @Override // defpackage.ahet
    public final void A(ahmd ahmdVar, int i) {
        agzw agzwVar;
        int i2;
        do {
            agzwVar = this.c;
            i2 = agzwVar.c;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!agzwVar.a(i2, ((i2 >> 29) << 29) + i));
        B(ahmdVar);
    }

    public final void B(Object obj) {
        boolean z = ahbx.a;
        while (true) {
            agzy agzyVar = this.d;
            Object obj2 = agzyVar.a;
            if (obj2 instanceof ahac) {
                if (agzyVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof ahao) || (obj2 instanceof ahmd)) {
                J(obj, obj2);
            } else {
                if (obj2 instanceof ahbc) {
                    ahbc ahbcVar = (ahbc) obj2;
                    if (!ahbcVar.c.c()) {
                        J(obj, obj2);
                    }
                    if (obj2 instanceof ahau) {
                        Throwable th = ahbcVar != null ? ahbcVar.b : null;
                        if (obj instanceof ahao) {
                            u((ahao) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            L((ahmd) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof ahbb) {
                    ahbb ahbbVar = (ahbb) obj2;
                    if (ahbbVar.b != null) {
                        J(obj, obj2);
                    }
                    if (obj instanceof ahmd) {
                        return;
                    }
                    obj.getClass();
                    ahao ahaoVar = (ahao) obj;
                    if (ahbbVar.a()) {
                        u(ahaoVar, ahbbVar.e);
                        return;
                    } else if (agzyVar.d(obj2, ahbb.b(ahbbVar, ahaoVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof ahmd) {
                        return;
                    }
                    obj.getClass();
                    if (agzyVar.d(obj2, new ahbb(obj2, (ahao) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final void C() {
        agsw agswVar = this.a;
        Throwable th = null;
        ahld ahldVar = agswVar instanceof ahld ? (ahld) agswVar : null;
        if (ahldVar != null) {
            while (true) {
                agzy agzyVar = ahldVar.f;
                Object obj = agzyVar.a;
                ahmg ahmgVar = ahle.b;
                if (obj == ahmgVar) {
                    if (agzyVar.d(ahmgVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!agzyVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            w();
            k(th);
        }
    }

    public final void D(Object obj, int i, agvc agvcVar) {
        agzy agzyVar;
        Object obj2;
        do {
            agzyVar = this.d;
            obj2 = agzyVar.a;
            if (!(obj2 instanceof ahed)) {
                if (obj2 instanceof ahau) {
                    ahau ahauVar = (ahau) obj2;
                    if (ahauVar.a.c()) {
                        if (agvcVar != null) {
                            v(agvcVar, ahauVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!agzyVar.d(obj2, K((ahed) obj2, obj, i, agvcVar)));
        x();
        y(i);
    }

    public final boolean E() {
        return this.e == 2 && ((ahld) this.a).f.a != null;
    }

    @Override // defpackage.ahci
    public final void F(Throwable th) {
        while (true) {
            agzy agzyVar = this.d;
            Object obj = agzyVar.a;
            if (obj instanceof ahed) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof ahbc) {
                return;
            }
            if (obj instanceof ahbb) {
                ahbb ahbbVar = (ahbb) obj;
                if (ahbbVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (agzyVar.d(obj, ahbb.b(ahbbVar, null, th, 15))) {
                    ahao ahaoVar = ahbbVar.b;
                    if (ahaoVar != null) {
                        u(ahaoVar, th);
                    }
                    agvc agvcVar = ahbbVar.c;
                    if (agvcVar != null) {
                        v(agvcVar, th, ahbbVar.a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (agzyVar.d(obj, new ahbb(obj, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    public final ahmg G(Object obj, agvc agvcVar) {
        agzy agzyVar;
        Object obj2;
        do {
            agzyVar = this.d;
            obj2 = agzyVar.a;
            if (!(obj2 instanceof ahed)) {
                return null;
            }
        } while (!agzyVar.d(obj2, K((ahed) obj2, obj, this.e, agvcVar)));
        x();
        return ahas.a;
    }

    @Override // defpackage.ahap
    public final void a(agux aguxVar) {
        B(new ahan(aguxVar));
    }

    @Override // defpackage.ahap
    public final void b(ahbm ahbmVar, Object obj) {
        agsw agswVar = this.a;
        ahld ahldVar = agswVar instanceof ahld ? (ahld) agswVar : null;
        D(obj, (ahldVar != null ? ahldVar.a : null) == ahbmVar ? 4 : this.e, null);
    }

    @Override // defpackage.ahap
    public final boolean c() {
        return this.d.a instanceof ahed;
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        Throwable thA = agpk.a(obj);
        if (thA != null) {
            if (ahbx.b) {
                thA = ahmf.a(thA, this);
            }
            obj = new ahbc(thA, false);
        }
        D(obj, this.e, null);
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return this.b;
    }

    @Override // defpackage.agtr
    public final agtr ft() {
        agsw agswVar = this.a;
        if (agswVar instanceof agtr) {
            return (agtr) agswVar;
        }
        return null;
    }

    @Override // defpackage.ahap
    public final boolean g() {
        return !(this.d.a instanceof ahed);
    }

    @Override // defpackage.ahap
    public final void i(Object obj) {
        throw null;
    }

    @Override // defpackage.ahap
    public final Object j(Object obj, agvc agvcVar) {
        return G(obj, agvcVar);
    }

    @Override // defpackage.ahap
    public final void k(Throwable th) {
        agzy agzyVar;
        Object obj;
        boolean z;
        do {
            agzyVar = this.d;
            obj = agzyVar.a;
            if (!(obj instanceof ahed)) {
                return;
            }
            z = true;
            if (!(obj instanceof ahao) && !(obj instanceof ahmd)) {
                z = false;
            }
        } while (!agzyVar.d(obj, new ahau(this, th, z)));
        ahed ahedVar = (ahed) obj;
        if (ahedVar instanceof ahao) {
            u((ahao) obj, th);
        } else if (ahedVar instanceof ahmd) {
            L((ahmd) obj);
        }
        x();
        y(this.e);
    }

    @Override // defpackage.ahap
    public final void l() {
        boolean z = ahbx.a;
        y(this.e);
    }

    public final Object m() {
        agzw agzwVar;
        int i;
        ahdl ahdlVar;
        boolean zE = E();
        do {
            agzwVar = this.c;
            i = agzwVar.c;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zE) {
                    C();
                }
                Object obj = this.d.a;
                if (obj instanceof ahbc) {
                    Throwable th = ((ahbc) obj).b;
                    if (ahbx.b) {
                        throw ahmf.a(th, this);
                    }
                    throw th;
                }
                if (!ahcj.b(this.e) || (ahdlVar = (ahdl) this.b.get(ahdl.c)) == null || ahdlVar.t()) {
                    return n(obj);
                }
                CancellationException cancellationExceptionO = ahdlVar.o();
                F(cancellationExceptionO);
                if (ahbx.b) {
                    throw ahmf.a(cancellationExceptionO, this);
                }
                throw cancellationExceptionO;
            }
        } while (!agzwVar.a(i, (536870911 & i) + 536870912));
        if (t() == null) {
            I();
        }
        if (zE) {
            C();
        }
        return agtg.a;
    }

    @Override // defpackage.ahci
    public final Object n(Object obj) {
        return obj instanceof ahbb ? ((ahbb) obj).a : obj;
    }

    @Override // defpackage.ahci
    public final Object o() {
        return this.d.a;
    }

    protected String p() {
        return "CancellableContinuation";
    }

    public Throwable q(ahdl ahdlVar) {
        return ahdlVar.o();
    }

    @Override // defpackage.ahci
    public final Throwable r(Object obj) {
        Throwable thR = super.r(obj);
        if (thR == null) {
            return null;
        }
        agsw agswVar = this.a;
        return (ahbx.b && (agswVar instanceof agtr)) ? ahmf.a(thR, (agtr) agswVar) : thR;
    }

    @Override // defpackage.ahci
    public final agsw s() {
        return this.a;
    }

    public final ahcn t() {
        return (ahcn) this.f.a;
    }

    public final String toString() {
        String strA = ahby.a(this.a);
        Object obj = this.d.a;
        String str = obj instanceof ahed ? "Active" : obj instanceof ahau ? "Cancelled" : "Completed";
        return p() + "(" + strA + "){" + str + "}@" + Integer.toHexString(System.identityHashCode(this));
    }

    public final void u(ahao ahaoVar, Throwable th) {
        try {
            ahaoVar.b(th);
        } catch (Throwable th2) {
            agte agteVar = this.b;
            toString();
            ahbo.b(agteVar, new ahbd("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void v(agvc agvcVar, Throwable th, Object obj) {
        try {
            agvcVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            agte agteVar = this.b;
            toString();
            ahbo.b(agteVar, new ahbd("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void w() {
        ahcn ahcnVarT = t();
        if (ahcnVarT == null) {
            return;
        }
        ahcnVarT.fn();
        this.f.c(ahec.a);
    }

    public final void x() {
        if (E()) {
            return;
        }
        w();
    }

    public final void y(int i) {
        agzw agzwVar;
        int i2;
        do {
            agzwVar = this.c;
            i2 = agzwVar.c;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = ahbx.a;
                agsw agswVarS = s();
                boolean z2 = i == 4;
                if (z2 || !(agswVarS instanceof ahld) || ahcj.b(i) != ahcj.b(this.e)) {
                    ahcj.a(this, agswVarS, z2);
                    return;
                }
                ahld ahldVar = (ahld) agswVarS;
                ahbm ahbmVar = ahldVar.a;
                agte agteVarFr = ahldVar.fr();
                if (ahle.c(ahbmVar, agteVarFr)) {
                    ahle.b(ahbmVar, agteVarFr, this);
                    return;
                }
                ahcr ahcrVarA = ahel.a.a();
                if (ahcrVarA.o()) {
                    ahcrVarA.m(this);
                    return;
                }
                ahcrVarA.n(true);
                try {
                    ahcj.a(this, s(), true);
                    do {
                    } while (ahcrVarA.q());
                    return;
                } catch (Throwable th) {
                    try {
                        H(th);
                        return;
                    } finally {
                        ahcrVarA.l(true);
                    }
                }
            }
        } while (!agzwVar.a(i2, (536870911 & i2) + 1073741824));
    }

    public final void z() {
        ahcn ahcnVarI = I();
        if (ahcnVarI != null && g()) {
            ahcnVarI.fn();
            this.f.c(ahec.a);
        }
    }

    @Override // defpackage.agtr
    public final void fu() {
    }
}

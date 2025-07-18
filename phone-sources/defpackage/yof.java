package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yof extends ypi implements yoe, yiw, yri {
    public final yih a;
    public final yil b;
    public final yns c;
    public final ynu d;
    private final ynu f;

    public yof(yih yihVar, int i) {
        super(i);
        this.a = yihVar;
        boolean z = yoy.a;
        this.b = yihVar.getContext();
        ynv ynvVar = ynv.a;
        this.c = new yns(536870911, ynvVar);
        this.d = new ynu(ynx.a, ynvVar);
        this.f = new ynu(null, ynvVar);
    }

    private final ypm F() {
        yqe yqeVar = (yqe) this.b.get(yqe.c);
        if (yqeVar == null) {
            return null;
        }
        ypm ypmVarE = yoz.E(yqeVar, new yoi(this));
        this.f.d(null, ypmVarE);
        return ypmVarE;
    }

    private final void G(int i) {
        yns ynsVar;
        int i2;
        do {
            ynsVar = this.c;
            i2 = ynsVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = yoy.a;
                yih yihVarP = p();
                boolean z2 = i == 4;
                if (z2 || !(yihVarP instanceof ywu) || ylh.al(i) != ylh.al(this.e)) {
                    ylh.ak(this, yihVarP, z2);
                    return;
                }
                ywu ywuVar = (ywu) yihVarP;
                yot yotVar = ywuVar.a;
                yil context = ywuVar.getContext();
                if (ywv.c(yotVar, context)) {
                    ywv.b(yotVar, context, this);
                    return;
                }
                ThreadLocal threadLocal = yra.a;
                ypp yppVarA = yra.a();
                if (yppVarA.p()) {
                    yppVarA.n(this);
                    return;
                }
                yppVarA.o(true);
                try {
                    ylh.ak(this, p(), true);
                    do {
                    } while (yppVarA.r());
                    return;
                } catch (Throwable th) {
                    try {
                        E(th);
                        return;
                    } finally {
                        yppVarA.m(true);
                    }
                }
            }
        } while (!ynsVar.d(i2, (536870911 & i2) + 1073741824));
    }

    private static final void H(Object obj, Object obj2) {
        throw new IllegalStateException(a.ck(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object I(yqt yqtVar, Object obj, int i, yka ykaVar) {
        yka ykaVar2;
        if (obj instanceof yon) {
            boolean z = yoy.a;
            return obj;
        }
        if (ylh.al(i)) {
            if (ykaVar != null) {
                ykaVar2 = ykaVar;
            } else if (yqtVar instanceof yod) {
                ykaVar2 = null;
            }
            return new yom(obj, yqtVar instanceof yod ? (yod) yqtVar : null, ykaVar2, null, 16);
        }
        return obj;
    }

    private final void J(ywp ywpVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            ywpVar.l(i);
        } catch (Throwable th) {
            yil yilVar = this.b;
            toString();
            yks.k(yilVar, new yoo("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    @Override // defpackage.yri
    public final void A(ywp ywpVar, int i) {
        yns ynsVar;
        int i2;
        do {
            ynsVar = this.c;
            i2 = ynsVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!ynsVar.d(i2, ((i2 >> 29) << 29) + i));
        w(ywpVar);
    }

    @Override // defpackage.ypi
    public final void B(Throwable th) {
        while (true) {
            ynu ynuVar = this.d;
            Object obj = ynuVar.a;
            if (obj instanceof yqt) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof yon) {
                return;
            }
            if (obj instanceof yom) {
                yom yomVar = (yom) obj;
                if (yomVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (ynuVar.d(obj, yom.b(yomVar, null, th, 15))) {
                    yod yodVar = yomVar.b;
                    if (yodVar != null) {
                        r(yodVar, th);
                    }
                    yka ykaVar = yomVar.c;
                    if (ykaVar != null) {
                        s(ykaVar, th, yomVar.a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (ynuVar.d(obj, new yom(obj, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    public final yxo D(Object obj, yka ykaVar) {
        ynu ynuVar;
        Object obj2;
        do {
            ynuVar = this.d;
            obj2 = ynuVar.a;
            if (!(obj2 instanceof yqt)) {
                return null;
            }
        } while (!ynuVar.d(obj2, I((yqt) obj2, obj, this.e, ykaVar)));
        u();
        return yog.a;
    }

    @Override // defpackage.yoe
    public final void a(Object obj) {
        boolean z = yoy.a;
        G(this.e);
    }

    @Override // defpackage.yoe
    public final void b(yjv yjvVar) {
        w(new yoc(yjvVar, 0));
    }

    @Override // defpackage.yoe
    public final void c(Object obj, yka ykaVar) {
        y(obj, this.e, ykaVar);
    }

    @Override // defpackage.yoe
    public final void d(yot yotVar, Object obj) {
        yih yihVar = this.a;
        ywu ywuVar = yihVar instanceof ywu ? (ywu) yihVar : null;
        y(obj, (ywuVar != null ? ywuVar.a : null) == yotVar ? 4 : this.e, null);
    }

    @Override // defpackage.yoe
    public final boolean e(Throwable th) {
        ynu ynuVar;
        Object obj;
        do {
            ynuVar = this.d;
            obj = ynuVar.a;
            if (!(obj instanceof yqt)) {
                return false;
            }
        } while (!ynuVar.d(obj, new yoh(this, th, (obj instanceof yod) || (obj instanceof ywp))));
        yqt yqtVar = (yqt) obj;
        if (yqtVar instanceof yod) {
            r((yod) obj, th);
        } else if (yqtVar instanceof ywp) {
            J((ywp) obj);
        }
        u();
        G(this.e);
        return true;
    }

    @Override // defpackage.yoe
    public final boolean f() {
        return j() instanceof yqt;
    }

    @Override // defpackage.yoe
    public final boolean g() {
        return !(j() instanceof yqt);
    }

    @Override // defpackage.yiw
    public final yiw getCallerFrame() {
        yih yihVar = this.a;
        if (yihVar instanceof yiw) {
            return (yiw) yihVar;
        }
        return null;
    }

    @Override // defpackage.yih
    public final yil getContext() {
        return this.b;
    }

    @Override // defpackage.yiw
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.yoe
    public final Object h(Object obj, yka ykaVar) {
        return D(obj, ykaVar);
    }

    public final Object i() {
        yns ynsVar;
        int i;
        yqe yqeVar;
        boolean z = z();
        do {
            ynsVar = this.c;
            i = ynsVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (z) {
                    x();
                }
                Object objJ = j();
                if (objJ instanceof yon) {
                    Throwable th = ((yon) objJ).b;
                    if (yoy.b) {
                        throw yxn.a(th, this);
                    }
                    throw th;
                }
                if (!ylh.al(this.e) || (yqeVar = (yqe) this.b.get(yqe.c)) == null || yqeVar.u()) {
                    return k(objJ);
                }
                CancellationException cancellationExceptionQ = yqeVar.q();
                B(cancellationExceptionQ);
                if (yoy.b) {
                    throw yxn.a(cancellationExceptionQ, this);
                }
                throw cancellationExceptionQ;
            }
        } while (!ynsVar.d(i, (536870911 & i) + 536870912));
        if (q() == null) {
            F();
        }
        if (z) {
            x();
        }
        return yio.a;
    }

    public final Object j() {
        return this.d.a;
    }

    @Override // defpackage.ypi
    public final Object k(Object obj) {
        return obj instanceof yom ? ((yom) obj).a : obj;
    }

    @Override // defpackage.ypi
    public final Object l() {
        return j();
    }

    protected String m() {
        return "CancellableContinuation";
    }

    public Throwable n(yqe yqeVar) {
        return yqeVar.q();
    }

    @Override // defpackage.ypi
    public final Throwable o(Object obj) {
        Throwable thO = super.o(obj);
        if (thO == null) {
            return null;
        }
        yih yihVar = this.a;
        return (yoy.b && (yihVar instanceof yiw)) ? yxn.a(thO, (yiw) yihVar) : thO;
    }

    @Override // defpackage.ypi
    public final yih p() {
        return this.a;
    }

    public final ypm q() {
        return (ypm) this.f.a;
    }

    public final void r(yod yodVar, Throwable th) {
        try {
            yodVar.b(th);
        } catch (Throwable th2) {
            yil yilVar = this.b;
            toString();
            yks.k(yilVar, new yoo("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        Throwable thA = yfy.a(obj);
        if (thA != null) {
            if (yoy.b) {
                thA = yxn.a(thA, this);
            }
            obj = new yon(thA);
        }
        y(obj, this.e, null);
    }

    public final void s(yka ykaVar, Throwable th, Object obj) {
        try {
            ykaVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            yil yilVar = this.b;
            toString();
            yks.k(yilVar, new yoo("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void t() {
        ypm ypmVarQ = q();
        if (ypmVarQ == null) {
            return;
        }
        ypmVarQ.eD();
        this.f.c(yqs.a);
    }

    public final String toString() {
        String strC = yoz.c(this.a);
        Object objJ = j();
        String str = objJ instanceof yqt ? "Active" : objJ instanceof yoh ? "Cancelled" : "Completed";
        return m() + "(" + strC + "){" + str + "}@" + yoz.b(this);
    }

    public final void u() {
        if (z()) {
            return;
        }
        t();
    }

    public final void v() {
        ypm ypmVarF = F();
        if (ypmVarF != null && g()) {
            ypmVarF.eD();
            this.f.c(yqs.a);
        }
    }

    public final void w(Object obj) {
        boolean z = yoy.a;
        while (true) {
            ynu ynuVar = this.d;
            Object obj2 = ynuVar.a;
            if (obj2 instanceof ynx) {
                if (ynuVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof yod) || (obj2 instanceof ywp)) {
                H(obj, obj2);
            } else {
                if (obj2 instanceof yon) {
                    yon yonVar = (yon) obj2;
                    if (!yonVar.a()) {
                        H(obj, obj2);
                    }
                    if (obj2 instanceof yoh) {
                        Throwable th = yonVar != null ? yonVar.b : null;
                        if (obj instanceof yod) {
                            r((yod) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            J((ywp) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof yom) {
                    yom yomVar = (yom) obj2;
                    if (yomVar.b != null) {
                        H(obj, obj2);
                    }
                    if (obj instanceof ywp) {
                        return;
                    }
                    obj.getClass();
                    yod yodVar = (yod) obj;
                    if (yomVar.a()) {
                        r(yodVar, yomVar.e);
                        return;
                    } else if (ynuVar.d(obj2, yom.b(yomVar, yodVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof ywp) {
                        return;
                    }
                    obj.getClass();
                    if (ynuVar.d(obj2, new yom(obj2, (yod) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final void x() {
        yih yihVar = this.a;
        Throwable th = null;
        ywu ywuVar = yihVar instanceof ywu ? (ywu) yihVar : null;
        if (ywuVar != null) {
            while (true) {
                ynu ynuVar = ywuVar.f;
                Object obj = ynuVar.a;
                yxo yxoVar = ywv.b;
                if (obj == yxoVar) {
                    if (ynuVar.d(yxoVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!ynuVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            t();
            e(th);
        }
    }

    public final void y(Object obj, int i, yka ykaVar) {
        ynu ynuVar;
        Object obj2;
        do {
            ynuVar = this.d;
            obj2 = ynuVar.a;
            if (!(obj2 instanceof yqt)) {
                if (obj2 instanceof yoh) {
                    yoh yohVar = (yoh) obj2;
                    if (yohVar.a.b()) {
                        if (ykaVar != null) {
                            s(ykaVar, yohVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!ynuVar.d(obj2, I((yqt) obj2, obj, i, ykaVar)));
        u();
        G(i);
    }

    public final boolean z() {
        return this.e == 2 && ((ywu) this.a).f.a != null;
    }
}

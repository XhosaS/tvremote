package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqe implements dqk {
    private final dqa a;
    private final dqt b;
    private final boolean c;

    public dqe(dqt dqtVar, dqa dqaVar) {
        this.b = dqtVar;
        this.c = dqaVar instanceof dpd;
        this.a = dqaVar;
    }

    @Override // defpackage.dqk
    public final int a(Object obj) {
        dqu dquVarF = dqt.f(obj);
        int iU = dquVarF.e;
        if (iU == -1) {
            iU = 0;
            for (int i = 0; i < dquVarF.b; i++) {
                int iA = dri.a(dquVarF.c[i]);
                dol dolVar = (dol) dquVarF.d[i];
                int iT = dot.T(1);
                iU += iT + iT + dot.U(2, iA) + dot.D(3, dolVar);
            }
            dquVarF.e = iU;
        }
        if (!this.c) {
            return iU;
        }
        doz dozVarI = cws.i(obj);
        dqq dqqVar = dozVarI.b;
        int iA2 = dqqVar.a();
        int iA3 = 0;
        for (int i2 = 0; i2 < iA2; i2++) {
            iA3 += dozVarI.a(dqqVar.e(i2));
        }
        Iterator it = dqqVar.b().iterator();
        while (it.hasNext()) {
            iA3 += dozVarI.a((Map.Entry) it.next());
        }
        return iU + iA3;
    }

    @Override // defpackage.dqk
    public final int b(Object obj) {
        int iHashCode = dqt.f(obj).hashCode();
        return this.c ? (iHashCode * 53) + cws.i(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.dqk
    public final Object c() {
        dqa dqaVar = this.a;
        return dqaVar instanceof dpf ? ((dpf) dqaVar).k() : ((dpc) dqaVar.m()).d();
    }

    @Override // defpackage.dqk
    public final void d(Object obj) {
        this.b.e(obj);
        cws.k(obj);
    }

    @Override // defpackage.dqk
    public final void e(Object obj, Object obj2) {
        dql.n(obj, obj2);
        if (this.c) {
            dql.m(obj, obj2);
        }
    }

    @Override // defpackage.dqk
    public final boolean f(Object obj, Object obj2) {
        if (!dqt.f(obj).equals(dqt.f(obj2))) {
            return false;
        }
        if (this.c) {
            return cws.i(obj).equals(cws.i(obj2));
        }
        return true;
    }

    @Override // defpackage.dqk
    public final boolean g(Object obj) {
        return cws.i(obj).f();
    }

    @Override // defpackage.dqk
    public final void h(Object obj, dop dopVar, dox doxVar) {
        boolean zI;
        dqt dqtVar = this.b;
        Object objB = dqtVar.b(obj);
        cws.j(obj);
        while (dopVar.c() != Integer.MAX_VALUE) {
            try {
                int i = dopVar.b;
                int i2 = 0;
                if (i != dri.a) {
                    if (dri.b(i) != 2) {
                        zI = dopVar.I();
                    } else {
                        if (cws.h(doxVar, this.a, dri.a(i)) != null) {
                            throw null;
                        }
                        zI = dqtVar.a(objB, dopVar, 0);
                    }
                    if (!zI) {
                        break;
                    }
                } else {
                    Object objH = null;
                    dol dolVarO = null;
                    while (dopVar.c() != Integer.MAX_VALUE) {
                        int i3 = dopVar.b;
                        if (i3 == dri.c) {
                            i2 = dopVar.i();
                            objH = cws.h(doxVar, this.a, i2);
                        } else if (i3 == dri.d) {
                            if (objH != null) {
                                throw null;
                            }
                            dolVarO = dopVar.o();
                        } else if (!dopVar.I()) {
                            break;
                        }
                    }
                    if (dopVar.b != dri.b) {
                        throw new dpm("Protocol message end-group tag did not match expected tag.");
                    }
                    if (dolVarO == null) {
                        continue;
                    } else {
                        if (objH != null) {
                            throw null;
                        }
                        dqtVar.c(objB, i2, dolVarO);
                    }
                }
            } finally {
                dqt.g(obj, (dqu) objB);
            }
        }
    }

    @Override // defpackage.dqk
    public final void i(Object obj, dhq dhqVar) {
        Iterator itB = cws.i(obj).b();
        if (itB.hasNext()) {
            throw null;
        }
        dqu dquVarF = dqt.f(obj);
        for (int i = 0; i < dquVarF.b; i++) {
            int iA = dri.a(dquVarF.c[i]);
            Object obj2 = dquVarF.d[i];
            if (obj2 instanceof dol) {
                ((dot) dhqVar.a).u(iA, (dol) obj2);
            } else {
                ((dot) dhqVar.a).t(iA, (dqa) obj2);
            }
        }
    }
}

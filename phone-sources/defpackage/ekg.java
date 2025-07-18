package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekg {
    public final ekc a;
    public final int b;
    public final ekc c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public ekg(ekc ekcVar, ekc ekcVar2, int i) {
        this.a = ekcVar;
        this.b = i;
        this.c = ekcVar2;
    }

    public static boolean o(ekc ekcVar) {
        return ekcVar.dj() != 0;
    }

    public static dze[] q(ezf ezfVar) {
        int iT = ezfVar != null ? ezfVar.t() : 0;
        dze[] dzeVarArr = new dze[iT];
        for (int i = 0; i < iT; i++) {
            ezfVar.getClass();
            dzeVarArr[i] = ezfVar.f(i);
        }
        return dzeVarArr;
    }

    public static final void r(ekc ekcVar) {
        if (ekcVar.dj() == 2) {
            ekcVar.N();
        }
    }

    public static final void s(ekc ekcVar, long j) {
        ekcVar.I();
        if (ekcVar instanceof eyg) {
            eyg eygVar = (eyg) ekcVar;
            a.ab(eygVar.d);
            eygVar.f = j;
        }
    }

    public final int a() {
        ekc ekcVar = this.c;
        boolean zO = o(this.a);
        int i = 0;
        if (ekcVar != null && o(ekcVar)) {
            i = 1;
        }
        return (zO ? 1 : 0) + i;
    }

    public final int b() {
        return this.a.dk();
    }

    public final ekc c(ejk ejkVar) {
        if (ejkVar != null) {
            int i = this.b;
            ewx[] ewxVarArr = ejkVar.c;
            if (ewxVarArr[i] != null) {
                ekc ekcVar = this.a;
                ewx ewxVarN = ekcVar.n();
                ewx ewxVar = ewxVarArr[i];
                if (ewxVarN == ewxVar) {
                    return ekcVar;
                }
                ekc ekcVar2 = this.c;
                if (ekcVar2 != null && ekcVar2.n() == ewxVar) {
                    return ekcVar2;
                }
            }
        }
        return null;
    }

    public final void d(ekc ekcVar, eib eibVar) {
        a.ab(this.a == ekcVar || this.c == ekcVar);
        if (o(ekcVar)) {
            if (ekcVar == eibVar.c) {
                eibVar.d = null;
                eibVar.c = null;
                eibVar.e = true;
            }
            r(ekcVar);
            ekcVar.p();
        }
    }

    public final void e(ekc ekcVar, ewx ewxVar, eib eibVar, long j, boolean z) {
        if (o(ekcVar)) {
            if (ewxVar != ekcVar.n()) {
                d(ekcVar, eibVar);
            } else if (z) {
                ekcVar.H(j);
            }
        }
    }

    public final void f(boolean z) {
        if (z) {
            if (this.e) {
                this.a.G();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            ekc ekcVar = this.c;
            ekcVar.getClass();
            ekcVar.G();
            this.f = false;
        }
    }

    public final void g() {
        if (!o(this.a)) {
            f(true);
        }
        ekc ekcVar = this.c;
        if (ekcVar == null || o(ekcVar)) {
            return;
        }
        f(false);
    }

    public final void h() {
        ekc ekcVar = this.a;
        if (ekcVar.dj() == 1 && this.d != 4) {
            ekcVar.M();
            return;
        }
        ekc ekcVar2 = this.c;
        if (ekcVar2 == null || ekcVar2.dj() != 1 || this.d == 3) {
            return;
        }
        ekcVar2.M();
    }

    public final void i(boolean z) {
        if (z) {
            ekc ekcVar = this.c;
            ekcVar.getClass();
            ekcVar.s(17, this.a);
        } else {
            ekc ekcVar2 = this.a;
            ekc ekcVar3 = this.c;
            ekcVar3.getClass();
            ekcVar2.s(17, ekcVar3);
        }
    }

    public final boolean j(ejk ejkVar, ekc ekcVar) {
        if (ekcVar == null) {
            return true;
        }
        ewx[] ewxVarArr = ejkVar.c;
        int i = this.b;
        ewx ewxVar = ewxVarArr[i];
        if (ekcVar.n() != null) {
            if (ekcVar.n() == ewxVar) {
                if (ewxVar != null && !ekcVar.O()) {
                    boolean z = ejkVar.g.g;
                }
            }
            ejk ejkVar2 = ejkVar.i;
            return ejkVar2 != null && ejkVar2.c[i] == ekcVar.n();
        }
        return true;
    }

    public final boolean k() {
        return l() || p();
    }

    public final boolean l() {
        int i = this.d;
        return i == 2 || i == 4;
    }

    public final boolean m(ejk ejkVar) {
        return c(ejkVar) != null;
    }

    public final boolean n() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return o(this.a);
        }
        ekc ekcVar = this.c;
        ekcVar.getClass();
        return o(ekcVar);
    }

    public final boolean p() {
        return this.d == 3;
    }

    public final int t(ekc ekcVar, ejk ejkVar, sro sroVar, eib eibVar) {
        if (ekcVar != null && o(ekcVar)) {
            ekc ekcVar2 = this.a;
            boolean z = ekcVar != ekcVar2;
            if ((ekcVar != ekcVar2 || !l()) && (ekcVar != this.c || !p())) {
                ewx ewxVarN = ekcVar.n();
                ewx[] ewxVarArr = ejkVar.c;
                int i = this.b;
                ewx ewxVar = ewxVarArr[i];
                boolean zC = sroVar.c(i);
                if (zC && ewxVarN == ewxVar) {
                    return 1;
                }
                if (!ekcVar.P()) {
                    dze[] dzeVarArrQ = q(((ezf[]) sroVar.e)[i]);
                    ewx ewxVar2 = ewxVarArr[i];
                    ewxVar2.getClass();
                    ekcVar.F(dzeVarArrQ, ewxVar2, ejkVar.c(), ejkVar.k, ejkVar.g.a);
                    return 3;
                }
                if (!ekcVar.cH()) {
                    return 0;
                }
                d(ekcVar, eibVar);
                if (!zC || k()) {
                    f(!z);
                }
                return 1;
            }
        }
        return 1;
    }
}

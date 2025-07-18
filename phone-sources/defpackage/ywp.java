package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ywp implements yqt {
    public final ynu a;
    public final long b;
    private final ynu c;
    private final yns d;

    public ywp(long j, ywp ywpVar, int i) {
        ynv ynvVar = ynv.a;
        this.a = new ynu(null, ynvVar);
        this.c = new ynu(ywpVar, ynvVar);
        this.b = j;
        this.d = new yns(i << 16, ynvVar);
    }

    public abstract int a();

    public abstract void l(int i);

    public final Object m() {
        return this.a.a;
    }

    public final ywp n() {
        Object objM = m();
        if (objM == ywo.a) {
            return null;
        }
        return (ywp) objM;
    }

    public final ywp o() {
        return (ywp) this.c.a;
    }

    public final void p() {
        this.c.b(null);
    }

    public final void q() {
        Object obj;
        ywp ywpVarN;
        boolean z = yoy.a;
        if (r()) {
            return;
        }
        while (true) {
            ywp ywpVarO = o();
            while (ywpVarO != null && ywpVarO.u()) {
                ywpVarO = (ywp) ywpVarO.c.a;
            }
            ywp ywpVarN2 = n();
            ywpVarN2.getClass();
            while (ywpVarN2.u() && (ywpVarN = ywpVarN2.n()) != null) {
                ywpVarN2 = ywpVarN;
            }
            ynu ynuVar = ywpVarN2.c;
            do {
                obj = ynuVar.a;
            } while (!ynuVar.d(obj, ((ywp) obj) == null ? null : ywpVarO));
            if (ywpVarO != null) {
                ywpVarO.a.c(ywpVarN2);
            }
            if (!ywpVarN2.u() || ywpVarN2.r()) {
                if (ywpVarO == null || !ywpVarO.u()) {
                    return;
                }
            }
        }
    }

    public final boolean r() {
        return n() == null;
    }

    public final void s() {
        if (this.d.c() == a()) {
            q();
        }
    }

    public final boolean t() {
        return yns.a.addAndGet(this.d, -65536) == a() && !r();
    }

    public final boolean u() {
        return this.d.b == a() && !r();
    }

    public final boolean v() {
        yns ynsVar;
        int i;
        do {
            ynsVar = this.d;
            i = ynsVar.b;
            if (i == a() && !r()) {
                return false;
            }
        } while (!ynsVar.d(i, 65536 + i));
        return true;
    }
}

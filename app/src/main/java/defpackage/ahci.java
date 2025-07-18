package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahci extends ahnc {
    public int e;

    public ahci(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void H(Throwable th) {
        ahbo.b(s().fr(), new ahbw(a.c(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object o();

    public Throwable r(Object obj) {
        ahbc ahbcVar = obj instanceof ahbc ? (ahbc) obj : null;
        if (ahbcVar != null) {
            return ahbcVar.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [agsw, agtr] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = ahbx.a;
        try {
            ahld ahldVar = (ahld) s();
            ?? r1 = ahldVar.b;
            Object obj = ahldVar.d;
            agte agteVarFr = r1.fr();
            Object objB = ahmn.b(agteVarFr, obj);
            ahdl ahdlVar = null;
            aher aherVarC = objB != ahmn.a ? ahbj.c(r1, agteVarFr, objB) : null;
            try {
                agte agteVarFr2 = r1.fr();
                Object objO = o();
                Throwable thR = r(objO);
                if (thR == null && ahcj.b(this.e)) {
                    ahdlVar = (ahdl) agteVarFr2.get(ahdl.c);
                }
                if (ahdlVar != null && !ahdlVar.t()) {
                    Throwable thO = ahdlVar.o();
                    F(thO);
                    if (ahbx.b) {
                        thO = ahmf.a(thO, r1);
                    }
                    r1.e(agpl.a(thO));
                } else if (thR != null) {
                    r1.e(agpl.a(thR));
                } else {
                    r1.e(n(objO));
                }
                if (aherVarC != null && !aherVarC.R()) {
                    return;
                }
                ahmn.c(agteVarFr, objB);
            } catch (Throwable th) {
                if (aherVarC == null || aherVarC.R()) {
                    ahmn.c(agteVarFr, objB);
                }
                throw th;
            }
        } catch (ahcg e) {
            ahbo.b(s().fr(), e.a);
        } catch (Throwable th2) {
            H(th2);
        }
    }

    public abstract agsw s();

    public void F(Throwable th) {
    }

    public Object n(Object obj) {
        return obj;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aher extends ahmc {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public aher(agte agteVar, agsw agswVar) {
        ahes ahesVar = ahes.a;
        super(agteVar.get(ahesVar) == null ? agteVar.plus(ahesVar) : agteVar, agswVar);
        this.b = new ThreadLocal();
        if (agswVar.fr().get(agsy.b) instanceof ahbm) {
            return;
        }
        Object objB = ahmn.b(agteVar, null);
        ahmn.c(agteVar, objB);
        Q(agteVar, objB);
    }

    private final void S() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.b;
            agpi agpiVar = (agpi) threadLocal.get();
            if (agpiVar != null) {
                ahmn.c((agte) agpiVar.a, agpiVar.b);
            }
            threadLocal.remove();
        }
    }

    @Override // defpackage.ahmc
    public final void P() {
        S();
    }

    public final void Q(agte agteVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new agpi(agteVar, obj));
    }

    public final boolean R() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.ahmc, defpackage.ahab
    protected final void fw(Object obj) {
        S();
        agsw agswVar = this.e;
        Object objA = ahbe.a(obj, agswVar);
        agte agteVarFr = agswVar.fr();
        Object objB = ahmn.b(agteVarFr, null);
        aher aherVarC = objB != ahmn.a ? ahbj.c(agswVar, agteVarFr, objB) : null;
        try {
            agswVar.e(objA);
            if (aherVarC == null || aherVarC.R()) {
                ahmn.c(agteVarFr, objB);
            }
        } catch (Throwable th) {
            if (aherVarC == null || aherVarC.R()) {
                ahmn.c(agteVarFr, objB);
            }
            throw th;
        }
    }
}

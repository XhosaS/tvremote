package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class smt extends ufb implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final uoo b;

    public smt(uoo uooVar) {
        this.b = uooVar;
    }

    @Override // defpackage.ufb
    public final String dw() {
        return "query=[" + ((String) this.b.c) + "]";
    }

    protected abstract void f(uoo uooVar);

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            uoo uooVar = this.b;
            tql tqlVarQ = szg.q(a.cr((String) uooVar.c, "Query: "));
            try {
                f(uooVar);
                tqlVarQ.close();
            } finally {
            }
        } catch (Throwable th) {
            e(th);
        }
    }
}

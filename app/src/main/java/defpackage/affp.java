package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class affp {
    static final Logger c = Logger.getLogger(affp.class.getName());
    public static final affp d = new affp();
    final affi e;
    public final afje f;
    public final int g;

    private affp() {
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static affp k() {
        affp affpVarA = affn.a.a();
        return affpVarA == null ? d : affpVarA;
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public affp a() {
        affp affpVarB = affn.a.b(this);
        return affpVarB == null ? d : affpVarB;
    }

    public afft b() {
        affi affiVar = this.e;
        if (affiVar == null) {
            return null;
        }
        return affiVar.a;
    }

    public Throwable c() {
        affi affiVar = this.e;
        if (affiVar == null) {
            return null;
        }
        return affiVar.c();
    }

    public void d(affj affjVar, Executor executor) {
        l(executor, "executor");
        affi affiVar = this.e;
        if (affiVar == null) {
            return;
        }
        affiVar.e(new affl(executor, affjVar, this));
    }

    public void f(affp affpVar) {
        l(affpVar, "toAttach");
        affn.a.c(this, affpVar);
    }

    public void g(affj affjVar) {
        affi affiVar = this.e;
        if (affiVar == null) {
            return;
        }
        affiVar.h(affjVar, this);
    }

    public boolean i() {
        affi affiVar = this.e;
        if (affiVar == null) {
            return false;
        }
        return affiVar.i();
    }

    public affp(affp affpVar, afje afjeVar) {
        this.e = affpVar instanceof affi ? (affi) affpVar : affpVar.e;
        this.f = afjeVar;
        int i = affpVar.g + 1;
        this.g = i;
        e(i);
    }

    public affp(afje afjeVar, int i) {
        this.e = null;
        this.f = afjeVar;
        this.g = i;
        e(i);
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krz {
    public ids[] a;
    public Executor b;
    private final Object c;
    private idw d;
    private ieh e;
    private idf f;

    public krz(Object obj) {
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [iec, ied, iee] */
    public final iea a() {
        Object objA = this.c;
        if (objA == null) {
            a.ah(this.b == null, "Initial value must be provided when executor is specified");
            a.ah(this.d == null, "Initial value must be provided when precondition is specified");
            a.ah(this.e != null, "Supplier must be provided when initial value is not specified");
            objA = this.e.a();
        }
        ?? C = ieb.c(objA);
        ieb iebVar = (ieb) C;
        iebVar.k(this.a);
        iebVar.q();
        idw idwVar = this.d;
        if (idwVar != null) {
            C.p(idwVar);
            iebVar.l();
        }
        if (this.b != null) {
            iebVar.o(new kro(4));
            iebVar.i(this.b);
        }
        idf idfVar = this.f;
        if (idfVar != null) {
            iebVar.n(idfVar);
            return C.a();
        }
        ieh iehVar = this.e;
        if (iehVar == null) {
            throw new IllegalStateException("Must specify either supplier or function before calling build()");
        }
        iebVar.h(iehVar);
        iebVar.g();
        return C.a();
    }

    public final void b(idf idfVar) {
        a.ah(this.f == null, "Function is already specified");
        a.ah(this.e == null, "Supplier is already specified");
        a.ah(true, "Runnable is already specified");
        this.f = idfVar;
    }

    public final void c(idw idwVar) {
        a.ah(this.d == null, "Precondition is already specified");
        this.d = idwVar;
    }

    public final void d(ieh iehVar) {
        a.ah(this.e == null, "Supplier is already specified");
        a.ah(this.f == null, "Function is already specified");
        a.ah(true, "Runnable is already specified");
        this.e = iehVar;
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epo {
    final ere a;
    public final epp b;
    public final epp c;
    public final eps d;

    public epo() {
        ere ereVar = new ere();
        this.a = ereVar;
        epp eppVar = new epp(null, ereVar);
        this.c = eppVar;
        this.b = eppVar.a();
        eps epsVar = new eps();
        this.d = epsVar;
        eppVar.f("require", new eqd(epsVar));
        epsVar.a("internal.platform", new Callable() { // from class: epn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new eqf();
            }
        });
        eppVar.f("runtime.counter", new eqo(Double.valueOf(0.0d)));
    }

    public final eqw a(epp eppVar, lme... lmeVarArr) {
        eqw eqwVarA = eqw.f;
        for (lme lmeVar : lmeVarArr) {
            eqwVarA = epr.a(lmeVar);
            epq.l(this.c);
            if ((eqwVarA instanceof eqx) || (eqwVarA instanceof eqv)) {
                eqwVarA = this.a.a(eppVar, eqwVarA);
            }
        }
        return eqwVarA;
    }
}

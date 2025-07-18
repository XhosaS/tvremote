package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epl {
    public final epo a;
    public epp b;
    public final eqi c;
    public final eqg d;

    public epl() {
        epo epoVar = new epo();
        this.a = epoVar;
        this.b = epoVar.b.a();
        this.c = new eqi();
        this.d = new eqg();
        epoVar.d.a("internal.registerCallback", new Callable() { // from class: epj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new eqc(this.a.d);
            }
        });
        epoVar.d.a("internal.eventLogger", new Callable() { // from class: epk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ept(this.a.c);
            }
        });
    }

    public final boolean a() {
        return !this.c.c.isEmpty();
    }

    public final boolean b() {
        eqi eqiVar = this.c;
        return !eqiVar.b.equals(eqiVar.a);
    }
}

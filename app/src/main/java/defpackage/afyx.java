package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afyx implements afzl {
    public final affi a;
    private final Executor b;
    private final Executor c;
    private final afzk d;
    private afzl e;

    public afyx(Executor executor, Executor executor2, afzk afzkVar, affi affiVar) {
        this.b = executor;
        this.c = executor2;
        this.d = afzkVar;
        this.a = affiVar;
    }

    public final afzl a() {
        afzl afzlVar = this.e;
        if (afzlVar != null) {
            return afzlVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.afzl
    public final void b(Status status) {
        int i = agfd.a;
        if (!status.e()) {
            Throwable afgwVar = status.o;
            if (afgwVar == null) {
                Status statusWithDescription = Status.b.withDescription("RPC cancelled");
                afid afidVar = afgv.a;
                afgwVar = new afgw(statusWithDescription);
            }
            this.c.execute(new afys(this.a, afgwVar));
        }
        this.b.execute(new afyt(this));
    }

    @Override // defpackage.afzl
    public final void c() {
        int i = agfd.a;
        this.b.execute(new afyu(this));
    }

    @Override // defpackage.afzz
    public final void d(afzy afzyVar) {
        int i = agfd.a;
        this.b.execute(new afyv(this, afzyVar));
    }

    @Override // defpackage.afzz
    public final void e() {
        int i = agfd.a;
        this.b.execute(new afyw(this));
    }

    public final void f(Throwable th) {
        this.d.b(Status.c.withDescription("Application error processing RPC").c(th), new afih());
    }

    final void g(afzl afzlVar) {
        afzlVar.getClass();
        yqw.M(this.e == null, "Listener already set");
        this.e = afzlVar;
    }
}

package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agem extends agej {
    private final agei a;
    private Object b;
    private boolean c = false;

    public agem(agei ageiVar) {
        this.a = ageiVar;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        if (!status.e()) {
            this.a.q(new afjx(status, afihVar));
            return;
        }
        if (!this.c) {
            this.a.q(new afjx(Status.k.withDescription("No value received for unary call"), afihVar));
        }
        this.a.p(this.b);
    }

    @Override // defpackage.afep
    public final void c(Object obj) {
        if (this.c) {
            throw new afjx(Status.k.withDescription("More than one value received for unary call"), null);
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.agej
    public final void e() {
        this.a.a.d(2);
    }

    @Override // defpackage.afep
    public final void b(afih afihVar) {
    }
}

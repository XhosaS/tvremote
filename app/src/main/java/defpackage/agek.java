package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agek extends agej {
    private final ager a;
    private final ageh b;
    private boolean c;

    public agek(ager agerVar, ageh agehVar) {
        this.a = agerVar;
        this.b = agehVar;
        if (agerVar instanceof ageo) {
            ((ageo) agerVar).a(agehVar);
        }
        agehVar.a = true;
    }

    @Override // defpackage.afep
    public final void a(Status status, afih afihVar) {
        if (status.e()) {
            this.a.e();
        } else {
            this.a.f(new afjx(status, afihVar));
        }
    }

    @Override // defpackage.afep
    public final void c(Object obj) {
        if (this.c && !this.b.c) {
            throw new afjx(Status.k.withDescription("More than one responses received for unary or client-streaming call"), null);
        }
        this.c = true;
        this.a.g(obj);
        ageh agehVar = this.b;
        if (agehVar.c) {
            agehVar.a();
        }
    }

    @Override // defpackage.afep
    public final void d() {
        Runnable runnable = this.b.d;
        if (runnable != null) {
            ((mcn) runnable).a.d();
        }
    }

    @Override // defpackage.agej
    public final void e() {
        this.b.a();
    }

    @Override // defpackage.afep
    public final void b(afih afihVar) {
    }
}

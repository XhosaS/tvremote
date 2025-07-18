package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afoc implements afog {
    public final afep a;
    public Status b;
    final /* synthetic */ afod c;

    public afoc(afod afodVar, afep afepVar) {
        this.c = afodVar;
        this.a = afepVar;
    }

    @Override // defpackage.afog
    public final void a(Status status, afof afofVar, afih afihVar) {
        int i = agfd.a;
        afod afodVar = this.c;
        afft afftVarF = afodVar.f();
        if (status.getCode() == Status.Code.CANCELLED && afftVarF != null && afftVarF.f()) {
            status = afodVar.f.b();
            afihVar = new afih();
        }
        afodVar.c.execute(new afoa(this, status, afihVar));
    }

    public final void b(Status status) {
        this.b = status;
        this.c.h.n(status);
    }

    @Override // defpackage.afog
    public final void c(afih afihVar) {
        int i = agfd.a;
        this.c.c.execute(new afny(this, afihVar));
    }

    @Override // defpackage.afzz
    public final void d(afzy afzyVar) {
        int i = agfd.a;
        this.c.c.execute(new afnz(this, afzyVar));
    }

    @Override // defpackage.afzz
    public final void e() {
        afod afodVar = this.c;
        afik afikVar = afodVar.b.a;
        if (afikVar == afik.UNARY || afikVar == afik.SERVER_STREAMING) {
            return;
        }
        int i = agfd.a;
        afodVar.c.execute(new afob(this));
    }
}

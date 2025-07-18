package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftq extends afgb {
    public final affp a;
    private final afgo b;
    private final afen c;
    private final Executor d;
    private final afil e;
    private afem f;
    private afeq g;

    public aftq(afgo afgoVar, afen afenVar, Executor executor, afil afilVar, afem afemVar) {
        this.b = afgoVar;
        this.c = afenVar;
        this.e = afilVar;
        Executor executor2 = afemVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        afek afekVarA = afem.a(afemVar);
        afekVarA.b = executor;
        this.f = new afem(afekVarA);
        this.a = affp.k();
    }

    @Override // defpackage.afgb, defpackage.afeq
    public final void a(afep afepVar, afih afihVar) {
        afil afilVar = this.e;
        new afwj(afilVar, afihVar, this.f, afun.f);
        afgn afgnVarA = this.b.a();
        Status status = afgnVarA.a;
        if (!status.e()) {
            this.d.execute(new aftp(this, afepVar, afrq.b(status)));
            this.g = afun.g;
        } else {
            afuy afuyVarB = ((afva) afgnVarA.b).b(afilVar);
            if (afuyVarB != null) {
                this.f = this.f.f(afuy.a, afuyVarB);
            }
            afeq afeqVarA = this.c.a(afilVar, this.f);
            this.g = afeqVarA;
            afeqVarA.a(afepVar, afihVar);
        }
    }

    @Override // defpackage.afiz, defpackage.afeq
    public final void b(String str, Throwable th) {
        afeq afeqVar = this.g;
        if (afeqVar != null) {
            afeqVar.b(str, th);
        }
    }

    @Override // defpackage.afgb, defpackage.afiz
    protected final afeq f() {
        return this.g;
    }
}

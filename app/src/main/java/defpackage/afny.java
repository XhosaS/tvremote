package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afny extends afow {
    final /* synthetic */ afih a;
    final /* synthetic */ afoc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afny(afoc afocVar, afih afihVar) {
        super(afocVar.c.e);
        this.a = afihVar;
        this.b = afocVar;
    }

    @Override // defpackage.afow
    public final void a() {
        int i = agfd.a;
        afoc afocVar = this.b;
        if (afocVar.b != null) {
            return;
        }
        try {
            afocVar.a.b(this.a);
        } catch (Throwable th) {
            this.b.b(Status.b.c(th).withDescription("Failed to read headers"));
        }
    }
}

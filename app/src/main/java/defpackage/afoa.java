package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afoa extends afow {
    final /* synthetic */ Status a;
    final /* synthetic */ afih b;
    final /* synthetic */ afoc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afoa(afoc afocVar, Status status, afih afihVar) {
        super(afocVar.c.e);
        this.a = status;
        this.b = afihVar;
        this.c = afocVar;
    }

    @Override // defpackage.afow
    public final void a() {
        int i = agfd.a;
        afoc afocVar = this.c;
        afod afodVar = afocVar.c;
        afodVar.f.c();
        Status status = this.a;
        afih afihVar = this.b;
        Status status2 = afocVar.b;
        if (status2 != null) {
            afihVar = new afih();
            status = status2;
        }
        try {
            afodVar.g(afocVar.a, status, afihVar);
        } finally {
            this.c.c.d.a(status.e());
        }
    }
}

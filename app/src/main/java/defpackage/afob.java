package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afob extends afow {
    final /* synthetic */ afoc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afob(afoc afocVar) {
        super(afocVar.c.e);
        this.a = afocVar;
    }

    @Override // defpackage.afow
    public final void a() {
        int i = agfd.a;
        afoc afocVar = this.a;
        if (afocVar.b != null) {
            return;
        }
        try {
            afocVar.a.d();
        } catch (Throwable th) {
            this.a.b(Status.b.c(th).withDescription("Failed to call onReady."));
        }
    }
}

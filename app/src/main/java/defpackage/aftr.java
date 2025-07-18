package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aftr implements afvb {
    final /* synthetic */ afun a;

    public aftr(afun afunVar) {
        this.a = afunVar;
    }

    @Override // defpackage.afvb
    public final void a(boolean z) {
        afun afunVar = this.a;
        afunVar.U.c(afunVar.A, z);
        if (z) {
            afunVar.h();
        }
    }

    @Override // defpackage.afvb
    public final void c(Status status) {
        throw null;
    }

    @Override // defpackage.afvb
    public final void d() {
        throw null;
    }

    @Override // defpackage.afvb
    public final void e() {
        throw null;
    }

    @Override // defpackage.afvb
    public final void b() {
    }
}

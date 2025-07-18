package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsl extends afrd {
    final /* synthetic */ afog a;
    final /* synthetic */ afsm b;

    public afsl(afsm afsmVar, afog afogVar) {
        this.a = afogVar;
        this.b = afsmVar;
    }

    @Override // defpackage.afrd, defpackage.afog
    public final void a(Status status, afof afofVar, afih afihVar) {
        this.b.b.a.a(status.e());
        b().a(status, afofVar, afihVar);
    }

    @Override // defpackage.afrd
    protected final afog b() {
        return this.a;
    }
}

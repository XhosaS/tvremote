package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afph extends afow {
    final afep a;
    final Status b;

    public afph(afpn afpnVar, afep afepVar, Status status) {
        super(afpnVar.a);
        this.a = afepVar;
        this.b = status;
    }

    @Override // defpackage.afow
    public final void a() {
        this.a.a(this.b, new afih());
    }
}

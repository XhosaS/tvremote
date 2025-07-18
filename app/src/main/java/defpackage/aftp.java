package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aftp extends afow {
    final /* synthetic */ afep a;
    final /* synthetic */ Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftp(aftq aftqVar, afep afepVar, Status status) {
        super(aftqVar.a);
        this.a = afepVar;
        this.b = status;
    }

    @Override // defpackage.afow
    public final void a() {
        this.a.a(this.b, new afih());
    }
}

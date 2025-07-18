package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afnw extends afow {
    final /* synthetic */ afep a;
    final /* synthetic */ String b;
    final /* synthetic */ afod c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnw(afod afodVar, afep afepVar, String str) {
        super(afodVar.e);
        this.a = afepVar;
        this.b = str;
        this.c = afodVar;
    }

    @Override // defpackage.afow
    public final void a() {
        this.c.g(this.a, Status.k.withDescription(String.format("Unable to find compressor by name %s", this.b)), new afih());
    }
}

package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afuz extends afgo {
    final afva b;

    public afuz(afva afvaVar) {
        this.b = afvaVar;
    }

    @Override // defpackage.afgo
    public final afgn a() {
        yqw.M(true, "config is not set");
        return new afgn(Status.OK, this.b);
    }
}

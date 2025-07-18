package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trh extends trr {
    /* JADX WARN: Illegal instructions before constructor call */
    public trh(Status.Code code) {
        tra traVarB = trb.b();
        ((trc) traVarB).a = 6;
        traVarB.b(code.value());
        super(traVarB.a());
    }
}

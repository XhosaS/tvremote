package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavw {
    public final Status a;
    public final afih b;

    public aavw(Status status, afih afihVar) {
        yqw.M(!status.e(), "Error status must not be OK");
        this.a = status;
        this.b = afihVar;
    }
}

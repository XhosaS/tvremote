package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afjx extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    public final afih b;

    public afjx(Status status, afih afihVar) {
        super(Status.d(status), status.o);
        this.a = status;
        this.b = afihVar;
    }
}

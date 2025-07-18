package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affq {
    public static Status a(affp affpVar) {
        affpVar.getClass();
        if (!affpVar.i()) {
            return null;
        }
        Throwable thC = affpVar.c();
        if (thC == null) {
            return Status.b.withDescription("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return Status.e.withDescription(thC.getMessage()).c(thC);
        }
        Status statusB = Status.b(thC);
        return (Status.Code.UNKNOWN.equals(statusB.getCode()) && statusB.o == thC) ? Status.b.withDescription("Context cancelled").c(thC) : statusB.c(thC);
    }
}

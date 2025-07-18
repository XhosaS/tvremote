package io.grpc;

import defpackage.afih;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final Status a;
    public final afih b;

    public StatusException(Status status, afih afihVar) {
        super(Status.d(status), status.o);
        this.a = status;
        this.b = afihVar;
    }
}

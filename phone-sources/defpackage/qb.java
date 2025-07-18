package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qb extends CancellationException {
    public qb() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(qc.a);
        return this;
    }
}

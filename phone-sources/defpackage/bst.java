package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bst extends CancellationException {
    public bst(long j) {
        super(a.cp(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(btn.a);
        return this;
    }
}

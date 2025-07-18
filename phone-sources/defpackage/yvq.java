package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvq extends CancellationException {
    public yvq() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (yoy.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

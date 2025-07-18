package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvh extends CancellationException {
    public final transient Object a;

    public yvh(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
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

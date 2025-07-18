package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azb extends CancellationException {
    public azb() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(azc.a);
        return this;
    }
}

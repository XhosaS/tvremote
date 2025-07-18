package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bhv extends CancellationException {
    public bhv(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(bhw.a);
        return this;
    }
}

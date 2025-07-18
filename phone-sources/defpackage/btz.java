package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class btz extends CancellationException {
    public btz(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(bua.a);
        return this;
    }

    public /* synthetic */ btz() {
        super(null);
    }
}

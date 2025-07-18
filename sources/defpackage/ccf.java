package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccf extends Exception {
    public ccf(Throwable th, ccu ccuVar, StackTraceElement[] stackTraceElementArr) {
        super(ccuVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

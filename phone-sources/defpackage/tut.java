package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tut extends Exception {
    public tut(Throwable th, tvj tvjVar, StackTraceElement[] stackTraceElementArr) {
        super(tvjVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

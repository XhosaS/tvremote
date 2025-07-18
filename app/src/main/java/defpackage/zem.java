package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zem extends Exception {
    public zem(Throwable th, zfc zfcVar, StackTraceElement[] stackTraceElementArr) {
        super(zfcVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

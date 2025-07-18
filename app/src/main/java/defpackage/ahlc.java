package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlc extends RuntimeException {
    private final transient agte a;

    public ahlc(agte agteVar) {
        this.a = agteVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}

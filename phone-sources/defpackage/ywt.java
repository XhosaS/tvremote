package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywt extends RuntimeException {
    private final transient yil a;

    public ywt(yil yilVar) {
        this.a = yilVar;
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

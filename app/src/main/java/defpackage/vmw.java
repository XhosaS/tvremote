package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmw extends RuntimeException {
    public vmw(Throwable th, Exception exc) {
        super("Non-serializable exception with type = " + th.getClass().getName() + ", message = " + th.getMessage());
        setStackTrace(th.getStackTrace());
        addSuppressed(exc);
    }
}

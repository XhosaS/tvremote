package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjb extends Throwable {
    public hjb() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}

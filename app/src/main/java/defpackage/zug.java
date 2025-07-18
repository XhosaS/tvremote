package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zug extends Throwable {
    public zug() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

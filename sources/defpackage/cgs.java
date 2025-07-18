package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class cgs extends Throwable {
    public cgs() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

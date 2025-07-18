package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gil extends RuntimeException {
    public gil() {
        super("Context cannot be null");
    }

    public gil(Throwable th) {
        super(th);
    }
}

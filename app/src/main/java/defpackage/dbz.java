package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbz extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public dbz(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwf extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public vwf() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final vuq a() {
        return new vuq(getMessage());
    }
}

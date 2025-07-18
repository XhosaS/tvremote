package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfy extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public dfy() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final der a() {
        return new der(getMessage());
    }
}

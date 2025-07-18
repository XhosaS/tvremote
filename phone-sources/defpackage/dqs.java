package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqs extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public dqs() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final dpm a() {
        return new dpm(getMessage());
    }
}

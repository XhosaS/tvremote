package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abzz extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public abzz() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final abxv a() {
        return new abxv(getMessage());
    }
}

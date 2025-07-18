package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anp extends Exception {
    public anp() {
    }

    public anp(String str) {
        super(str);
    }

    public anp(Throwable th) {
        super("ContentProvider query failed", th);
    }
}

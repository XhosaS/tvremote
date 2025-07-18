package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccb extends cce {
    private final Throwable a;

    public ccb(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}

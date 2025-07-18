package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatt extends Exception {
    public aatt() {
        super("Failed to get a Native provider. Rejecting JavaCronetEngine fallback.");
    }

    public aatt(Throwable th) {
        super("Failed to get a Native provider", th);
    }
}

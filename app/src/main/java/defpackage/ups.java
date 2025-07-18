package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ups extends Exception {
    public ups(Throwable th) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuc extends RuntimeException {
    public vuc() {
        super("Worker is not an account worker, or lost its tag!");
    }

    public vuc(Throwable th) {
        super("Account was no longer valid when task executed.", th);
    }
}

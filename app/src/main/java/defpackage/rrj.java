package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rrj implements Runnable {
    private final Consumer a;
    private final rqv b;

    public rrj(Consumer consumer, rqv rqvVar) {
        this.a = consumer;
        this.b = rqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}

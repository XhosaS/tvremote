package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qhv implements uha {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Consumer b;

    public qhv(Consumer consumer, Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
        Consumer consumer = this.b;
        if (consumer != null) {
            consumer.accept(th);
        }
    }

    @Override // defpackage.uha
    public final void b(Object obj) {
        Consumer consumer = this.a;
        if (consumer != null) {
            consumer.accept(obj);
        }
    }
}

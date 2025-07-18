package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnl {
    final Executor a;
    final hvd b;

    public hnl(hvd hvdVar, Executor executor) {
        this.b = hvdVar;
        this.a = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hnl) {
            return this.b.equals(((hnl) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

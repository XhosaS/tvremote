package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahcm implements ahcn {
    private final Future a;

    public ahcm(Future future) {
        this.a = future;
    }

    @Override // defpackage.ahcn
    public final void fn() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}

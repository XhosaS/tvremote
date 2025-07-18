package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ypl implements ypm {
    private final Future a;

    public ypl(Future future) {
        this.a = future;
    }

    @Override // defpackage.ypm
    public final void eD() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}

package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aham implements ahao {
    private final Future a;

    public aham(Future future) {
        this.a = future;
    }

    @Override // defpackage.ahao
    public final void b(Throwable th) {
        this.a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.a + "]";
    }
}

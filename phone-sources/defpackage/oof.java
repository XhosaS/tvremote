package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oof implements onv, onu, onr {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.onr
    public final void c() {
        this.a.countDown();
    }

    @Override // defpackage.onu
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.onv
    public final void e(Object obj) {
        this.a.countDown();
    }
}

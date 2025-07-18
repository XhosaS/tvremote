package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lvp implements lva, lux, lur {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.lur
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.lux
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.lva
    public final void d(Object obj) {
        this.a.countDown();
    }
}

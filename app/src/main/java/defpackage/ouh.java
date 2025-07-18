package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouh {
    public static final zdy a = zdy.h("com/google/android/libraries/home/auth/AuthRecoveryWaiterImpl");
    public CountDownLatch b;

    public final void a() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}

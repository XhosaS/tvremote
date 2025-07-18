package defpackage;

import android.os.HandlerThread;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdq extends HandlerThread {
    final /* synthetic */ Semaphore a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdq(String str, Semaphore semaphore) {
        super(str, 10);
        this.a = semaphore;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.a.release();
    }
}

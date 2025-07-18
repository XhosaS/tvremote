package defpackage;

import android.os.SystemClock;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehw implements Runnable {
    final /* synthetic */ Deque a;
    final /* synthetic */ boolean b;

    public ehw(Deque deque, boolean z) {
        this.a = deque;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (true) {
            Deque deque = this.a;
            if (deque.isEmpty()) {
                return;
            } else {
                ((efg) deque.pollFirst()).b(this.b, jUptimeMillis);
            }
        }
    }
}

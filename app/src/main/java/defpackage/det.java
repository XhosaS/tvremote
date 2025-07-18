package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class det {
    public final Map a = new HashMap();
    public final des b = new des();

    final void a(String str) {
        der derVar;
        synchronized (this) {
            Map map = this.a;
            derVar = (der) map.get(str);
            dqk.d(derVar, "Argument must not be null");
            int i = derVar.b;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
            int i2 = i - 1;
            derVar.b = i2;
            if (i2 == 0) {
                der derVar2 = (der) map.remove(str);
                if (!derVar2.equals(derVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + derVar.toString() + ", but actually removed: " + String.valueOf(derVar2) + ", safeKey: " + str);
                }
                Queue queue = this.b.a;
                synchronized (queue) {
                    if (queue.size() < 10) {
                        queue.offer(derVar2);
                    }
                }
            }
        }
        derVar.a.unlock();
    }
}

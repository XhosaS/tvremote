package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ddy {
    private final Queue a;

    public ddy() {
        char[] cArr = dqm.a;
        this.a = new ArrayDeque(20);
    }

    public abstract dek a();

    final dek b() {
        dek dekVar = (dek) this.a.poll();
        return dekVar == null ? a() : dekVar;
    }

    public final void c(dek dekVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(dekVar);
        }
    }
}

package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hoc {
    private final Queue a;

    public hoc() {
        char[] cArr = hwp.a;
        this.a = new ArrayDeque(20);
    }

    public abstract hon a();

    final hon b() {
        hon honVar = (hon) this.a.poll();
        return honVar == null ? a() : honVar;
    }

    public final void c(hon honVar) {
        Queue queue = this.a;
        if (queue.size() < 20) {
            queue.offer(honVar);
        }
    }
}

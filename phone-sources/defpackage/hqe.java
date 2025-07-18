package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqe {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = hwp.a;
        a = new ArrayDeque(0);
    }

    private hqe() {
    }

    public static hqe b(Object obj) {
        hqe hqeVar;
        Queue queue = a;
        synchronized (queue) {
            hqeVar = (hqe) queue.poll();
        }
        if (hqeVar == null) {
            hqeVar = new hqe();
        }
        hqeVar.d = obj;
        hqeVar.c = 0;
        hqeVar.b = 0;
        return hqeVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hqe) {
            hqe hqeVar = (hqe) obj;
            int i = hqeVar.c;
            int i2 = hqeVar.b;
            if (this.d.equals(hqeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

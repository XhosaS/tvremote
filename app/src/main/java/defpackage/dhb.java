package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhb {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = dqm.a;
        a = new ArrayDeque(0);
    }

    private dhb() {
    }

    public static dhb b(Object obj) {
        dhb dhbVar;
        Queue queue = a;
        synchronized (queue) {
            dhbVar = (dhb) queue.poll();
        }
        if (dhbVar == null) {
            dhbVar = new dhb();
        }
        dhbVar.d = obj;
        dhbVar.c = 0;
        dhbVar.b = 0;
        return dhbVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dhb) {
            dhb dhbVar = (dhb) obj;
            int i = dhbVar.c;
            int i2 = dhbVar.b;
            if (this.d.equals(dhbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}

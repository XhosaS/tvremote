package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
class lvh {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(lvg lvgVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(lvgVar);
        }
    }

    public final void b(lvf lvfVar) {
        lvg lvgVar;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        lvgVar = (lvg) this.b.poll();
                        if (lvgVar == null) {
                            this.c = false;
                            return;
                        }
                    }
                    lvgVar.a(lvfVar);
                }
            }
        }
    }
}

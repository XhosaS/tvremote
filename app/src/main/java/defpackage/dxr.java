package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxr implements emk {
    private final emk d;
    public final Deque a = new ArrayDeque();
    public int c = 1;
    public long b = 0;
    private final dxq e = new dxq(this);

    public dxr(emk emkVar) {
        this.d = emkVar;
    }

    @Override // defpackage.emk
    public final void a(Runnable runnable) {
        Deque deque = this.a;
        if (deque.isEmpty()) {
            return;
        }
        synchronized (deque) {
            deque.remove(runnable);
        }
    }

    @Override // defpackage.emk
    public final void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        Deque deque = this.a;
        synchronized (deque) {
            int i = this.c;
            if (i != 4 && i != 3) {
                long j = this.b;
                dxp dxpVar = new dxp(runnable);
                deque.add(dxpVar);
                this.c = 2;
                try {
                    this.d.c(this.e);
                    if (this.c == 2) {
                        synchronized (this.a) {
                            if (this.b == j && this.c == 2) {
                                this.c = 3;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    Deque deque2 = this.a;
                    synchronized (deque2) {
                        int i2 = this.c;
                        boolean z = false;
                        if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(dxpVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            deque.add(runnable);
        }
    }

    public final String toString() {
        emk emkVar = this.d;
        return "SequentialLithoHandler@" + System.identityHashCode(this) + "{" + emkVar.toString() + "}";
    }

    @Override // defpackage.emk
    public final void b() {
    }
}

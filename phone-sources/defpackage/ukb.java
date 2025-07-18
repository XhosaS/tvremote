package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukb implements Executor, ont {
    public final nwq a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public ukb(nwq nwqVar) {
        this.a = nwqVar;
        this.d = new ogh(nwqVar.A);
    }

    @Override // defpackage.ont
    public final void a(onz onzVar) {
        uka ukaVar;
        Queue queue = this.b;
        synchronized (queue) {
            if (this.c == 2) {
                ukaVar = (uka) queue.peek();
                a.ab(ukaVar != null);
            } else {
                ukaVar = null;
            }
            this.c = 0;
        }
        if (ukaVar != null) {
            ukaVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}

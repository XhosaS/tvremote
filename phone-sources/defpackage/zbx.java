package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbx {
    private ExecutorService c;
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    private final void g(Deque deque, Object obj) {
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new zcq(String.valueOf(zcr.e).concat(" Dispatcher"), false));
        }
        executorService = this.c;
        executorService.getClass();
        return executorService;
    }

    public final synchronized void b(zdc zdcVar) {
        this.d.add(zdcVar);
    }

    public final void c(zcz zczVar) {
        zczVar.a.decrementAndGet();
        g(this.b, zczVar);
    }

    public final void d(zdc zdcVar) {
        g(this.d, zdcVar);
    }

    public final void e() {
        byte[] bArr = zcr.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                zcz zczVar = (zcz) it.next();
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque.size() >= 64) {
                    break;
                }
                if (zczVar.a.get() < 5) {
                    it.remove();
                    zczVar.a.incrementAndGet();
                    zczVar.getClass();
                    arrayList.add(zczVar);
                    arrayDeque.add(zczVar);
                }
            }
            f();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zcz) arrayList.get(i)).b(a());
        }
    }

    public final synchronized void f() {
        this.b.size();
        this.d.size();
    }
}

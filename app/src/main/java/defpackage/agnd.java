package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnd extends AtomicReferenceArray implements Runnable, Callable, aggi {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable e;

    public agnd(Runnable runnable, aghb aghbVar) {
        super(3);
        this.e = runnable;
        lazySet(0, aghbVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == d) {
                return;
            }
            if (obj == b) {
                future.cancel(false);
                return;
            } else if (obj == c) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = d;
            if (obj6 == obj || obj6 == (obj4 = b) || obj6 == (obj5 = c)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = a) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((aghb) obj2).b(this);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.e.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != a) {
                    ((aghb) obj4).b(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != b) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, d));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != a && compareAndSet(0, obj4, d) && obj4 != null) {
            ((aghb) obj4).b(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != b || obj5 == c) {
                return;
            }
        } while (!compareAndSet(1, obj5, d));
    }
}

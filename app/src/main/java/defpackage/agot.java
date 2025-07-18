package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agot extends agou {
    static final agos[] a = new agos[0];
    static final agos[] b = new agos[0];
    public final AtomicReference c;
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference h;
    long i;

    public agot() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(a);
        this.c = new AtomicReference();
        this.h = new AtomicReference();
    }

    @Override // defpackage.agfs
    public final void a() {
        if (agor.a(this.h, null, agnx.a)) {
            agob agobVar = agob.a;
            for (agos agosVar : s(agobVar)) {
                agosVar.a(agobVar, this.i);
            }
        }
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        aghn.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        r(obj);
        for (agos agosVar : (agos[]) this.d.get()) {
            agosVar.a(obj, this.i);
        }
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        if (this.h.get() != null) {
            aggiVar.dispose();
        }
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        aghn.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!agor.a(this.h, null, th)) {
            agoh.e(th);
            return;
        }
        agoa agoaVar = new agoa(th);
        for (agos agosVar : s(agoaVar)) {
            agosVar.a(agoaVar, this.i);
        }
    }

    @Override // defpackage.agfo
    protected final void n(agfs agfsVar) {
        AtomicReference atomicReference;
        agos[] agosVarArr;
        agos[] agosVarArr2;
        int i;
        Object obj;
        agos agosVar = new agos(agfsVar, this);
        agfsVar.d(agosVar);
        do {
            atomicReference = this.d;
            agosVarArr = (agos[]) atomicReference.get();
            if (agosVarArr == b) {
                Throwable th = (Throwable) this.h.get();
                if (th == agnx.a) {
                    agfsVar.a();
                    return;
                } else {
                    agfsVar.fe(th);
                    return;
                }
            }
            int length = agosVarArr.length;
            agosVarArr2 = new agos[length + 1];
            System.arraycopy(agosVarArr, 0, agosVarArr2, 0, length);
            agosVarArr2[length] = agosVar;
        } while (!agor.a(atomicReference, agosVarArr, agosVarArr2));
        if (agosVar.g) {
            q(agosVar);
            return;
        }
        if (agosVar.g) {
            return;
        }
        synchronized (agosVar) {
            if (agosVar.g) {
                return;
            }
            if (agosVar.c) {
                return;
            }
            agot agotVar = agosVar.b;
            Lock lock = agotVar.f;
            lock.lock();
            agosVar.h = agotVar.i;
            Object obj2 = agotVar.c.get();
            lock.unlock();
            agosVar.d = obj2 != null;
            agosVar.c = true;
            if (obj2 == null || agosVar.b(obj2)) {
                return;
            }
            while (!agosVar.g) {
                synchronized (agosVar) {
                    if (agosVar.e == null) {
                        agosVar.d = false;
                        return;
                    }
                    agosVar.e = null;
                }
                for (Object[] objArr = r7.a; objArr != null; objArr = objArr[4]) {
                    for (0; i < 4 && (obj = objArr[i]) != null; i + 1) {
                        i = agosVar.b(obj) ? 0 : i + 1;
                    }
                }
            }
        }
    }

    final void q(agos agosVar) {
        AtomicReference atomicReference;
        agos[] agosVarArr;
        agos[] agosVarArr2;
        do {
            atomicReference = this.d;
            agosVarArr = (agos[]) atomicReference.get();
            int length = agosVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (agosVarArr[i] == agosVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                agosVarArr2 = a;
            } else {
                agos[] agosVarArr3 = new agos[length - 1];
                System.arraycopy(agosVarArr, 0, agosVarArr3, 0, i);
                System.arraycopy(agosVarArr, i + 1, agosVarArr3, i, (length - i) - 1);
                agosVarArr2 = agosVarArr3;
            }
        } while (!agor.a(atomicReference, agosVarArr, agosVarArr2));
    }

    final void r(Object obj) {
        Lock lock = this.g;
        lock.lock();
        this.i++;
        this.c.lazySet(obj);
        lock.unlock();
    }

    final agos[] s(Object obj) {
        AtomicReference atomicReference = this.d;
        agos[] agosVarArr = b;
        agos[] agosVarArr2 = (agos[]) atomicReference.getAndSet(agosVarArr);
        if (agosVarArr2 != agosVarArr) {
            r(obj);
        }
        return agosVarArr2;
    }

    public agot(Object obj) {
        this();
        AtomicReference atomicReference = this.c;
        aghn.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ytm extends ReentrantLock {
    final yug a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final ysc n;

    public ytm(yug yugVar, int i, long j, ysc yscVar) {
        this.a = yugVar;
        this.g = j;
        this.n = yscVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!yugVar.i()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = yugVar.p() ? new ReferenceQueue() : null;
        this.i = yugVar.q() ? new ReferenceQueue() : null;
        this.j = yugVar.o() ? new ConcurrentLinkedQueue() : yug.c;
        this.l = yugVar.l() ? new yue() : yug.c;
        this.m = yugVar.o() ? new yst() : yug.c;
    }

    final yuh a(yuh yuhVar, yuh yuhVar2) {
        Object objJ = yuhVar.j();
        if (objJ == null) {
            return null;
        }
        ytv ytvVarD = yuhVar.d();
        Object obj = ytvVarD.get();
        if (obj == null && ytvVarD.f()) {
            return null;
        }
        yuh yuhVarA = this.a.q.a(this, yuhVar, yuhVar2, objJ);
        yuhVarA.p(ytvVarD.b(this.i, obj, yuhVarA));
        return yuhVarA;
    }

    final yuh b(Object obj, int i) {
        for (yuh yuhVarE = (yuh) this.f.get((r0.length() - 1) & i); yuhVarE != null; yuhVarE = yuhVarE.e()) {
            if (yuhVarE.a() == i) {
                Object objJ = yuhVarE.j();
                if (objJ == null) {
                    t();
                } else if (this.a.h.c(obj, objJ)) {
                    return yuhVarE;
                }
            }
        }
        return null;
    }

    final yuh c(Object obj, int i, long j) {
        yuh yuhVarB = b(obj, i);
        if (yuhVarB == null) {
            return null;
        }
        if (!this.a.m(yuhVarB, j)) {
            return yuhVarB;
        }
        u(j);
        return null;
    }

    final yuh d(Object obj, int i, yuh yuhVar) {
        return this.a.q.b(this, obj, i, yuhVar);
    }

    final yuh e(yuh yuhVar, yuh yuhVar2) {
        int i = this.b;
        yuh yuhVarE = yuhVar2.e();
        while (yuhVar != yuhVar2) {
            yuh yuhVarA = a(yuhVar, yuhVarE);
            if (yuhVarA != null) {
                yuhVarE = yuhVarA;
            } else {
                q(yuhVar);
                i--;
            }
            yuhVar = yuhVar.e();
        }
        this.b = i;
        return yuhVarE;
    }

    final Object f(yuh yuhVar, long j) {
        if (yuhVar.j() == null) {
            t();
            return null;
        }
        Object obj = yuhVar.d().get();
        if (obj == null) {
            t();
            return null;
        }
        if (!this.a.m(yuhVar, j)) {
            return obj;
        }
        u(j);
        return null;
    }

    final Object g(Object obj, int i, Object obj2, boolean z) {
        Object obj3;
        int i2;
        lock();
        try {
            yug yugVar = this.a;
            long jA = yugVar.p.a();
            r(jA);
            if (this.b + 1 > this.e) {
                l();
            }
            AtomicReferenceArray atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            yuh yuhVar = (yuh) atomicReferenceArray.get(length);
            yuh yuhVarE = yuhVar;
            while (true) {
                obj3 = null;
                if (yuhVarE == null) {
                    this.d++;
                    yuh yuhVarD = d(obj, i, yuhVar);
                    y(yuhVarD, obj2, jA);
                    atomicReferenceArray.set(length, yuhVarD);
                    this.b++;
                    k(yuhVarD);
                    break;
                }
                Object objJ = yuhVarE.j();
                if (yuhVarE.a() == i && objJ != null && yugVar.h.c(obj, objJ)) {
                    ytv ytvVarD = yuhVarE.d();
                    Object obj4 = ytvVarD.get();
                    if (obj4 == null) {
                        this.d++;
                        if (ytvVarD.f()) {
                            w(obj, null, ytvVarD.a(), yui.COLLECTED);
                            y(yuhVarE, obj2, jA);
                            i2 = this.b;
                        } else {
                            y(yuhVarE, obj2, jA);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        k(yuhVarE);
                    } else {
                        if (z) {
                            o(yuhVarE, jA);
                        } else {
                            this.d++;
                            w(obj, obj4, ytvVarD.a(), yui.REPLACED);
                            y(yuhVarE, obj2, jA);
                            k(yuhVarE);
                        }
                        obj3 = obj4;
                    }
                } else {
                    yuhVarE = yuhVarE.e();
                }
            }
            return obj3;
        } finally {
            unlock();
            s();
        }
    }

    final Object h(yuh yuhVar, Object obj, ytv ytvVar) {
        if (!ytvVar.g()) {
            throw new AssertionError();
        }
        yqw.R(!Thread.holdsLock(yuhVar), "Recursive load of: %s", obj);
        Object objD = ytvVar.d();
        if (objD == null) {
            throw new ysj(a.t(obj, "CacheLoader returned null for key ", "."));
        }
        p(yuhVar, this.a.p.a());
        return objD;
    }

    final void i() {
        while (true) {
            yuh yuhVar = (yuh) this.j.poll();
            if (yuhVar == null) {
                return;
            }
            Queue queue = this.m;
            if (queue.contains(yuhVar)) {
                queue.add(yuhVar);
            }
        }
    }

    final void j() {
        yug yugVar = this.a;
        int i = 0;
        if (yugVar.p()) {
            int i2 = 0;
            do {
                Object objPoll = this.h.poll();
                if (objPoll == null) {
                    break;
                }
                yuh yuhVar = (yuh) objPoll;
                int iA = yuhVar.a();
                ytm ytmVarC = yugVar.c(iA);
                ytmVarC.lock();
                try {
                    int i3 = ytmVarC.b;
                    AtomicReferenceArray atomicReferenceArray = ytmVarC.f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    yuh yuhVar2 = (yuh) atomicReferenceArray.get(length);
                    yuh yuhVarE = yuhVar2;
                    while (true) {
                        if (yuhVarE == null) {
                            break;
                        }
                        if (yuhVarE == yuhVar) {
                            ytmVarC.d++;
                            yuh yuhVarX = ytmVarC.x(yuhVar2, yuhVarE, yuhVarE.j(), yuhVarE.d().get(), yuhVarE.d(), yui.COLLECTED);
                            int i4 = ytmVarC.b - 1;
                            atomicReferenceArray.set(length, yuhVarX);
                            ytmVarC.b = i4;
                            break;
                        }
                        yuhVarE = yuhVarE.e();
                    }
                    ytmVarC.unlock();
                    ytmVarC.s();
                    i2++;
                } catch (Throwable th) {
                    ytmVarC.unlock();
                    ytmVarC.s();
                    throw th;
                }
            } while (i2 != 16);
        }
        yug yugVar2 = this.a;
        if (yugVar2.q()) {
            do {
                Object objPoll2 = this.i.poll();
                if (objPoll2 == null) {
                    return;
                }
                ytv ytvVar = (ytv) objPoll2;
                yuh yuhVarC = ytvVar.c();
                int iA2 = yuhVarC.a();
                ytm ytmVarC2 = yugVar2.c(iA2);
                Object objJ = yuhVarC.j();
                ytmVarC2.lock();
                try {
                    int i5 = ytmVarC2.b;
                    AtomicReferenceArray atomicReferenceArray2 = ytmVarC2.f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    yuh yuhVarE2 = (yuh) atomicReferenceArray2.get(length2);
                    int i6 = iA2;
                    while (true) {
                        if (yuhVarE2 != null) {
                            int i7 = i6;
                            Object objJ2 = yuhVarE2.j();
                            if (yuhVarE2.a() != i7 || objJ2 == null || !ytmVarC2.a.h.c(objJ, objJ2)) {
                                yuhVarE2 = yuhVarE2.e();
                                i6 = i7;
                            } else if (yuhVarE2.d() == ytvVar) {
                                ytmVarC2.d++;
                                yuh yuhVarX2 = ytmVarC2.x(yuhVarE2, yuhVarE2, objJ2, ytvVar.get(), ytvVar, yui.COLLECTED);
                                int i8 = ytmVarC2.b - 1;
                                atomicReferenceArray2.set(length2, yuhVarX2);
                                ytmVarC2.b = i8;
                                ytmVarC2.unlock();
                                if (!ytmVarC2.isHeldByCurrentThread()) {
                                }
                            } else {
                                ytmVarC2.unlock();
                                if (!ytmVarC2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            ytmVarC2.unlock();
                            if (!ytmVarC2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    ytmVarC2.s();
                    i++;
                } catch (Throwable th2) {
                    ytmVarC2.unlock();
                    if (!ytmVarC2.isHeldByCurrentThread()) {
                        ytmVarC2.s();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    final void k(yuh yuhVar) {
        if (this.a.j()) {
            i();
            long jA = yuhVar.d().a();
            long j = this.g;
            if (jA > j && !v(yuhVar, yuhVar.a(), yui.SIZE)) {
                throw new AssertionError();
            }
            while (this.c > j) {
                for (yuh yuhVar2 : this.m) {
                    if (yuhVar2.d().a() > 0) {
                        if (!v(yuhVar2, yuhVar2.a(), yui.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void l() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            yuh yuhVarE = (yuh) atomicReferenceArray.get(i2);
            if (yuhVarE != null) {
                yuh yuhVarE2 = yuhVarE.e();
                int iA = yuhVarE.a() & length2;
                if (yuhVarE2 == null) {
                    atomicReferenceArray2.set(iA, yuhVarE);
                } else {
                    yuh yuhVar = yuhVarE;
                    while (yuhVarE2 != null) {
                        int iA2 = yuhVarE2.a() & length2;
                        int i3 = iA2 != iA ? iA2 : iA;
                        if (iA2 != iA) {
                            yuhVar = yuhVarE2;
                        }
                        yuhVarE2 = yuhVarE2.e();
                        iA = i3;
                    }
                    atomicReferenceArray2.set(iA, yuhVar);
                    while (yuhVarE != yuhVar) {
                        int iA3 = yuhVarE.a() & length2;
                        yuh yuhVarA = a(yuhVarE, (yuh) atomicReferenceArray2.get(iA3));
                        if (yuhVarA != null) {
                            atomicReferenceArray2.set(iA3, yuhVarA);
                        } else {
                            q(yuhVarE);
                            i--;
                        }
                        yuhVarE = yuhVarE.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    final void m(long j) {
        yuh yuhVar;
        yuh yuhVar2;
        i();
        do {
            yuhVar = (yuh) this.l.peek();
            if (yuhVar == null || !this.a.m(yuhVar, j)) {
                do {
                    yuhVar2 = (yuh) this.m.peek();
                    if (yuhVar2 == null || !this.a.m(yuhVar2, j)) {
                        return;
                    }
                } while (v(yuhVar2, yuhVar2.a(), yui.EXPIRED));
                throw new AssertionError();
            }
        } while (v(yuhVar, yuhVar.a(), yui.EXPIRED));
        throw new AssertionError();
    }

    final void n() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            r(this.a.p.a());
            s();
        }
    }

    final void o(yuh yuhVar, long j) {
        if (this.a.k()) {
            yuhVar.k(j);
        }
        this.m.add(yuhVar);
    }

    final void p(yuh yuhVar, long j) {
        if (this.a.k()) {
            yuhVar.k(j);
        }
        this.j.add(yuhVar);
    }

    final void q(yuh yuhVar) {
        Object objJ = yuhVar.j();
        yuhVar.a();
        w(objJ, yuhVar.d().get(), yuhVar.d().a(), yui.COLLECTED);
        this.l.remove(yuhVar);
        this.m.remove(yuhVar);
    }

    final void r(long j) {
        if (tryLock()) {
            try {
                j();
                m(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void s() {
        if (isHeldByCurrentThread()) {
            return;
        }
        yug yugVar = this.a;
        while (((yuj) yugVar.o.poll()) != null) {
            try {
                ysf ysfVar = yugVar.w;
            } catch (Throwable th) {
                yug.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void t() {
        if (tryLock()) {
            try {
                j();
            } finally {
                unlock();
            }
        }
    }

    final void u(long j) {
        if (tryLock()) {
            try {
                m(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean v(yuh yuhVar, int i, yui yuiVar) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        yuh yuhVar2 = (yuh) atomicReferenceArray.get(length);
        for (yuh yuhVarE = yuhVar2; yuhVarE != null; yuhVarE = yuhVarE.e()) {
            if (yuhVarE == yuhVar) {
                this.d++;
                yuh yuhVarX = x(yuhVar2, yuhVarE, yuhVarE.j(), yuhVarE.d().get(), yuhVarE.d(), yuiVar);
                int i2 = this.b - 1;
                atomicReferenceArray.set(length, yuhVarX);
                this.b = i2;
                return true;
            }
        }
        return false;
    }

    final void w(Object obj, Object obj2, int i, yui yuiVar) {
        this.c -= i;
        int iOrdinal = yuiVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw null;
        }
        Queue queue = this.a.o;
        if (queue != yug.c) {
            queue.offer(new yuj(obj, obj2, yuiVar));
        }
    }

    final yuh x(yuh yuhVar, yuh yuhVar2, Object obj, Object obj2, ytv ytvVar, yui yuiVar) {
        w(obj, obj2, ytvVar.a(), yuiVar);
        this.l.remove(yuhVar2);
        this.m.remove(yuhVar2);
        if (!ytvVar.g()) {
            return e(yuhVar, yuhVar2);
        }
        ytvVar.e(null);
        return yuhVar;
    }

    final void y(yuh yuhVar, Object obj, long j) {
        ytv ytsVar;
        ytv ytvVarD = yuhVar.d();
        yug yugVar = this.a;
        ysg ysgVar = yugVar.v;
        yqw.M(true, "Weights must be non-negative");
        int iOrdinal = yugVar.k.ordinal();
        if (iOrdinal == 0) {
            ytsVar = new yts(obj);
        } else if (iOrdinal == 1) {
            ytsVar = new ytn(this.i, obj, yuhVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            ytsVar = new yua(this.i, obj, yuhVar);
        }
        yuhVar.p(ytsVar);
        i();
        this.c++;
        if (yugVar.k()) {
            yuhVar.k(j);
        }
        if (yugVar.n()) {
            yuhVar.q(j);
        }
        this.m.add(yuhVar);
        this.l.add(yuhVar);
        ytvVarD.e(obj);
    }
}

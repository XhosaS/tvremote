package defpackage;

import android.util.Log;
import java.util.LinkedHashSet;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jzj {
    public final String a;
    public final Object b;
    wx c;
    public int d;
    final /* synthetic */ jzu e;

    protected jzj(jzu jzuVar, jzj jzjVar) {
        this(jzuVar, jzjVar.a);
        synchronized (jzjVar.b) {
            this.d = jzjVar.d;
            wx wxVar = this.c;
            this.c = jzjVar.c;
            jzjVar.c = wxVar;
            jzjVar.d = 0;
        }
    }

    public final void a(final long j, jzo jzoVar) {
        yqi yqiVar = new yqi() { // from class: jzi
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                jzo jzoVar2 = (jzo) obj;
                long j2 = j;
                jzj jzjVar = this.a;
                synchronized (jzjVar.b) {
                    wr wrVar = (wr) jzjVar.c.get(jzoVar2);
                    if (wrVar == null) {
                        wrVar = new wr(10);
                        jzjVar.c.put(jzoVar2, wrVar);
                    }
                    int i = jzjVar.d;
                    if (i < 1024) {
                        jzjVar.d = i + 1;
                        long[] jArr = (long[]) wrVar.e(j2);
                        if (jArr == null) {
                            wrVar.i(j2, new long[]{1});
                        } else {
                            jArr[0] = jArr[0] + 1;
                        }
                        return false;
                    }
                    if (i == 1024 && Log.isLoggable("Counters", 3)) {
                        Log.d("Counters", "exceeded sample count in " + jzjVar.a);
                    }
                    return false;
                }
            }
        };
        if (jzu.b.equals(jzoVar)) {
            jzoVar = this.e.k;
        }
        jzu jzuVar = this.e;
        ReentrantReadWriteLock reentrantReadWriteLock = jzuVar.d;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            LinkedHashSet linkedHashSet = jzuVar.l;
            if (!linkedHashSet.contains(jzoVar)) {
                lock.unlock();
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                lock.lock();
                try {
                    linkedHashSet.add(jzoVar);
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            ((Boolean) yqiVar.apply(jzoVar)).booleanValue();
            Future future = this.e.h;
            lock.unlock();
            jzu jzuVar2 = this.e;
            if (jzuVar2.f <= 0 || future != null) {
                return;
            }
            jzuVar2.c();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                wx wxVar = this.c;
                if (i < wxVar.d) {
                    wr wrVar = (wr) wxVar.h(i);
                    sb.append(this.c.e(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < wrVar.c(); i2++) {
                        sb.append(wrVar.d(i2));
                        sb.append(" = ");
                        sb.append(((long[]) wrVar.g(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected jzj(jzu jzuVar, String str) {
        this.e = jzuVar;
        this.b = new Object();
        this.c = new wx(0);
        Object[] objArr = {str};
        if (!jzuVar.j.containsKey(str)) {
            this.a = str;
            return;
        }
        throw new IllegalStateException(String.format("counter/histogram already exists: %s", objArr));
    }
}

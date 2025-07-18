package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rby implements Closeable {
    static final rby a = new rby("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    String b;
    final long c;
    long d;
    final long e;
    public volatile List f;
    final int g;
    final int h;

    public rby(String str, long j, long j2, long j3, int i) {
        this.b = str;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.h = i;
        if (i == 1) {
            this.f = DesugarCollections.synchronizedList(new ArrayList());
        } else {
            this.f = Collections.EMPTY_LIST;
        }
    }

    public final long a() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        return j - this.c;
    }

    final void b(List list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    final boolean c() {
        return this.h == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = rco.a;
        if (equals(a)) {
            return;
        }
        if (this.d < 0) {
            this.d = SystemClock.elapsedRealtime();
        }
        AtomicReference atomicReference = rco.c;
        rch rchVar = (rch) atomicReference.get();
        if (rchVar != null) {
            if (this != ((rby) rchVar.a().poll())) {
                ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 189, "Tracer.java")).u("Incorrect Span passed. Ignore...");
                return;
            }
            if (a() >= rco.a) {
                AtomicInteger atomicInteger = rchVar.a;
                if (atomicInteger.incrementAndGet() >= rco.b) {
                    ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 198, "Tracer.java")).v("Dropping trace as max buffer size is hit. Size: %d", atomicInteger.get());
                    atomicReference.set(null);
                    return;
                }
                rby rbyVar = (rby) rchVar.a().peek();
                if (rbyVar == null) {
                    ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "linkToParent", 108, "TraceData.java")).x("null Parent for Span: %s", this.b);
                    return;
                }
                if (rbyVar.f == Collections.EMPTY_LIST) {
                    rbyVar.f = new ArrayList();
                }
                if (rbyVar.f != null) {
                    rbyVar.f.add(this);
                }
            }
        }
    }

    public rby(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1L, j, i);
    }
}

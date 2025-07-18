package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rux extends ThreadLocal {
    final /* synthetic */ ruy a;

    public rux(ruy ruyVar) {
        this.a = ruyVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        long id = Thread.currentThread().getId();
        rus rusVar = new rus(Looper.myLooper() == Looper.getMainLooper() ? "UI Thread" : "Thread: ".concat(String.valueOf(Thread.currentThread().getName())), id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        ((tug) ((tug) rnb.a.b()).j("com/google/android/libraries/performance/primes/metrics/trace/TraceData$1", "initialValue", 62, "TraceData.java")).y("Instantiate thread-data, thread:%d name:%s", id, rusVar.b);
        arrayDeque.push(rusVar);
        ruy ruyVar = this.a;
        ruyVar.a.incrementAndGet();
        ruyVar.c.put(rusVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}

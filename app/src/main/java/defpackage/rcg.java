package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rcg extends ThreadLocal {
    final /* synthetic */ rch a;

    public rcg(rch rchVar) {
        this.a = rchVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        rby rbyVar = new rby(Looper.myLooper() == Looper.getMainLooper() ? "UI Thread" : "Thread: ".concat(String.valueOf(Thread.currentThread().getName())), Thread.currentThread().getId(), 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(rbyVar);
        rch rchVar = this.a;
        rchVar.a.incrementAndGet();
        rchVar.c.put(rbyVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}

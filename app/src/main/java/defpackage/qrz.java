package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qrz extends ThreadLocal {
    final /* synthetic */ qsa a;

    public qrz(qsa qsaVar) {
        this.a = qsaVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        qsb qsbVar = new qsb();
        WeakHashMap weakHashMap = this.a.b;
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, qsbVar);
        }
        return qsbVar;
    }
}

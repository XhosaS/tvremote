package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asb extends ThreadLocal {
    final /* synthetic */ awy a;

    public asb(awy awyVar) {
        this.a = awyVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        asd asdVar = new asd();
        Thread threadCurrentThread = Thread.currentThread();
        Object obj = this.a.a;
        synchronized (obj) {
            ((WeakHashMap) obj).put(threadCurrentThread, asdVar);
        }
        return asdVar;
    }
}

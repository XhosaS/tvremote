package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqf extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        sjl.g();
        yau yauVar = new yau();
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = tqg.a;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, yauVar);
        }
        return yauVar;
    }
}

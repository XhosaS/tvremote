package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwu extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        bej.c();
        bxj bxjVar = new bxj();
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = bwv.a;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, bxjVar);
        }
        return bxjVar;
    }
}

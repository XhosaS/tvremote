package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wul extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        wwl wwlVar = new wwl(uea.d(Thread.currentThread()));
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = wum.b;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, wwlVar);
        }
        return wwlVar;
    }
}

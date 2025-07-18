package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfi implements ThreadFactory {
    final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public dfi(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        dfg dfgVar = new dfg(new dfh(this, runnable));
        dfgVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return dfgVar;
    }
}

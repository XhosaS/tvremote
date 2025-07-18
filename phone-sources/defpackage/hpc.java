package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpc implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public hpc(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        hpb hpbVar = new hpb(new gvj(this, runnable, 5));
        hpbVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return hpbVar;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zez extends zew {
    public static final zel a = new zex();
    public static final ThreadLocal b = new zey();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.zew
    public final void a() {
        this.e.decrementAndGet();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccs extends ccp {
    public static final cce a = new ccq();
    public static final ThreadLocal b = new ccr();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.ccp
    public final void a() {
        this.e.decrementAndGet();
    }
}

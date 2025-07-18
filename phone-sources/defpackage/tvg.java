package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tvg extends tvd {
    public static final tus a = new tve();
    public static final ThreadLocal b = new tvf();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.tvd
    public final void a() {
        this.e.decrementAndGet();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tue extends tvd {
    public static final tus a = new tuc();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.tvd
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}

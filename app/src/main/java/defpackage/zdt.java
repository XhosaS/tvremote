package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdt extends zew {
    public static final zel a = new zdr();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.zew
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}

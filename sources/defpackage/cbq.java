package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbq extends ccp {
    public static final cce a = new cbo();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.ccp
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}

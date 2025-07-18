package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnf implements afte {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.afte
    public final void a() {
        this.a.getAndAdd(1L);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xur implements xxy {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.xxy
    public final void a() {
        this.a.getAndAdd(1L);
    }
}

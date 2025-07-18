package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnm extends agfx {
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.agfx
    public final agfw a() {
        return new agnl();
    }

    @Override // defpackage.agfx
    public final aggi b(Runnable runnable) {
        agoh.d(runnable).run();
        return aghe.INSTANCE;
    }

    @Override // defpackage.agfx
    public final aggi c(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j);
            agoh.d(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            agoh.e(e);
        }
        return aghe.INSTANCE;
    }
}

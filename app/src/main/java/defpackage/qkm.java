package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkm extends qkl {
    private final qko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkm(Context context, ScheduledExecutorService scheduledExecutorService) {
        super(context, scheduledExecutorService);
        context.getClass();
        scheduledExecutorService.getClass();
        this.b = new qko(scheduledExecutorService);
    }

    @Override // defpackage.qku
    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }
}

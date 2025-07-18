package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uhi extends ufb {
    public static uhi v(uhp uhpVar) {
        return uhpVar instanceof uhi ? (uhi) uhpVar : new ugv(uhpVar);
    }

    public final uhi w(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (uhi) sfy.I(this, j, timeUnit, scheduledExecutorService);
    }
}

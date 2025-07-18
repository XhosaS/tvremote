package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgs implements qgq {
    public static final tvn a = tvn.n("GnpSdk");
    private static final AtomicInteger e = new AtomicInteger();
    final Context b;
    final uhs c;
    final ScheduledExecutorService d;

    public qgs(Context context, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.b = context;
        this.c = sfy.v(executorService);
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.qgq
    public final void a(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // defpackage.qgq
    public final void b(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, qdo qdoVar) {
        int iIncrementAndGet = e.incrementAndGet();
        qgp qgpVar = new qgp(pendingResult, z, iIncrementAndGet);
        if (!qdoVar.e()) {
            new Handler(Looper.getMainLooper()).postDelayed(new pqi(qgpVar, 9), qdoVar.a());
        }
        Context context = this.b;
        try {
            this.c.execute(new ejq(iIncrementAndGet, ((PowerManager) context.getSystemService("power")).newWakeLock(1, "ChimeExecutorApi::".concat(String.valueOf(context.getPackageName()))), qdoVar, runnable, qgpVar, 4));
        } catch (RuntimeException e2) {
            ((tvk) ((tvk) ((tvk) a.g()).i(e2)).j("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", (char) 143, "GnpExecutorApiImpl.java")).s("Failed to execute in broadcast.");
        }
    }

    @Override // defpackage.qgq
    public final void c(Runnable runnable) {
        tvn tvnVar = GnpExecutorApiService.a;
        sjl.e(new qto(runnable, this.b, 1));
    }

    @Override // defpackage.qgq
    public final void d(Runnable runnable, qdo qdoVar) {
        if (qdoVar.e()) {
            a(runnable);
            return;
        }
        uhs uhsVar = this.c;
        sfy.K(sfy.I(uhsVar.submit(runnable), qdoVar.a(), TimeUnit.MILLISECONDS, this.d), new qgr(), uhsVar);
    }
}

package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rma implements rmj {
    private static boolean a;
    private final yrp b;
    private final int c = Math.max(5, 10);

    public rma(yrp yrpVar) {
        this.b = yrpVar;
    }

    public final /* synthetic */ void a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        boolean z = runningAppProcessInfo.importance >= 400;
        Boolean.valueOf(z).getClass();
        if (z) {
            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    @Override // defpackage.rmj
    public final void b() {
        synchronized (rma.class) {
            if (!a) {
                rly rlyVar = new rly(this);
                long j = this.c;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                zyh zyhVar = (zyh) this.b.eV();
                rlr.a(zyhVar.schedule(new rlz(rlyVar, zyhVar, j, timeUnit), j, timeUnit));
                a = true;
            }
        }
    }
}

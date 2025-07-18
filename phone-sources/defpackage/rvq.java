package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvq {
    public volatile rvu a = rvt.a;
    public volatile boolean b = true;
    public volatile rvl c;
    private final shy d;

    public rvq(Context context, Executor executor, rvt rvtVar, xbw xbwVar, boolean z, tst tstVar, yfo yfoVar, shy shyVar) {
        this.d = shyVar;
        this.c = shyVar.b(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        b(new rvo(this, context, xbwVar, executor, rvtVar, tstVar.g() ? null : yfoVar, 0), executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(xbw xbwVar) {
        try {
            rpf rpfVar = (rpf) xbwVar.b();
            this.b = rpfVar.b();
            this.c = this.d.b(rpfVar.a());
        } catch (Throwable th) {
            ((tug) ((tug) ((tug) rnb.a.g()).i(th)).j("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'k', "Sampler.java")).s("Couldn't get config");
            this.b = false;
        }
    }
}

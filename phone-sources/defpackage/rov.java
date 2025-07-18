package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rov extends ron implements rox {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final roq c;
    private rmp d;

    public rov(roq roqVar) {
        this.c = roqVar;
    }

    @Override // defpackage.rox
    public final void a(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.rox
    public final void c(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.rox
    public final void d(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (rpd.d(applicationContext, rpd.a(applicationContext, "Primes.onActivityStarted"))) {
            l(rmp.b(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((tug) ((tug) rnb.a.g()).j("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 58, "ProcessImportanceForegroundSignalAdapter.java")).s("Activity started with background importance");
        }
    }

    @Override // defpackage.rox
    public final void e(Activity activity) {
        rmp rmpVarB = rmp.b(activity.getClass());
        this.d = rmpVarB;
        Context applicationContext = activity.getApplicationContext();
        if (rpd.d(applicationContext, rpd.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(rmpVarB);
    }

    @Override // defpackage.rox
    public final void f(int i) {
        rmp rmpVar;
        if (i >= 20 && (rmpVar = this.d) != null) {
            k(rmpVar);
        }
        this.d = null;
    }

    @Override // defpackage.ron
    public final void g(rmp rmpVar) {
        this.c.g(rmpVar);
    }

    @Override // defpackage.rox
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.ron
    public final void j(rmp rmpVar) {
        this.c.j(rmpVar);
    }

    @Override // defpackage.rox
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.rox
    public final /* synthetic */ void b(Activity activity) {
    }
}

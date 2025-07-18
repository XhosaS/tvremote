package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qsu extends qsl implements qsw {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final qsn c;
    private qpi d;

    public qsu(qsn qsnVar) {
        this.c = qsnVar;
    }

    @Override // defpackage.qsw
    public final void a(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qsw
    public final void c(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.qsw
    public final void d(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (qth.d(applicationContext, qth.a(applicationContext, "Primes.onActivityStarted"))) {
            l(qpi.c(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((zdv) ((zdv) qps.a.d()).q("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 58, "ProcessImportanceForegroundSignalAdapter.java")).u("Activity started with background importance");
        }
    }

    @Override // defpackage.qsw
    public final void e(Activity activity) {
        qpi qpiVarC = qpi.c(activity.getClass());
        this.d = qpiVarC;
        Context applicationContext = activity.getApplicationContext();
        if (qth.d(applicationContext, qth.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(qpiVarC);
    }

    @Override // defpackage.qsw
    public final void f(int i) {
        qpi qpiVar;
        if (i >= 20 && (qpiVar = this.d) != null) {
            k(qpiVar);
        }
        this.d = null;
    }

    @Override // defpackage.qsl
    public final void g(qpi qpiVar) {
        this.c.g(qpiVar);
    }

    @Override // defpackage.qsw
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.qsl
    public final void j(qpi qpiVar) {
        this.c.j(qpiVar);
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qsw
    public final /* synthetic */ void b(Activity activity) {
    }
}

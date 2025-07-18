package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ass extends asj implements asu {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final asm c;
    private aqe d;

    public ass(asm asmVar) {
        this.c = asmVar;
    }

    @Override // defpackage.asu
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.asu
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.asu
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.asu
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (atb.d(applicationContext, atb.a(applicationContext, "Primes.onActivityStarted"))) {
            l(aqe.a(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((cbs) aqn.a.g().j("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 58, "ProcessImportanceForegroundSignalAdapter.java")).p("Activity started with background importance");
        }
    }

    @Override // defpackage.asu
    public final void g(Activity activity) {
        aqe aqeVarA = aqe.a(activity.getClass());
        this.d = aqeVarA;
        Context applicationContext = activity.getApplicationContext();
        if (atb.d(applicationContext, atb.a(applicationContext, "Primes.onActivityStopped"))) {
            return;
        }
        k(aqeVarA);
    }

    @Override // defpackage.asu
    public final void h(int i) {
        aqe aqeVar;
        if (i >= 20 && (aqeVar = this.d) != null) {
            k(aqeVar);
        }
        this.d = null;
    }

    @Override // defpackage.asj
    public final void i(aqe aqeVar) {
        this.c.i(aqeVar);
    }

    @Override // defpackage.asj
    public final void j(aqe aqeVar) {
        this.c.j(aqeVar);
    }

    @Override // defpackage.asu
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.asu
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}

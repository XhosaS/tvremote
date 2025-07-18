package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ral implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ rap a;
    private final AtomicReference c;

    public ral(rap rapVar, View view) {
        this.a = rapVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler handlerA = uea.a();
                final rap rapVar = this.a;
                handlerA.postAtFrontOfQueue(new Runnable() { // from class: rai
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ral.b;
                        uea.c();
                        raq raqVar = rapVar.b;
                        if (raqVar.h != null) {
                            return;
                        }
                        raqVar.h = qvf.c();
                    }
                });
                uea.a().post(new Runnable() { // from class: raj
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ral.b;
                        uea.c();
                        rap rapVar2 = rapVar;
                        raq raqVar = rapVar2.b;
                        if (raqVar.i != null) {
                            return;
                        }
                        raqVar.i = qvf.c();
                        long j = ((quj) raqVar.i).a;
                        if (Build.VERSION.SDK_INT >= 29) {
                            Trace.setCounter("Primes-ttfdd-end-and-length-ms", j - Process.getStartElapsedRealtime());
                            Trace.setCounter("Primes-ttfdd-end-and-length-ms", 0L);
                        }
                        rapVar2.a.unregisterActivityLifecycleCallbacks(rapVar2);
                    }
                });
                uea.a().post(new Runnable() { // from class: rak
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.getViewTreeObserver().removeOnDrawListener(this.a);
                    }
                });
            } catch (RuntimeException e) {
                Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
            }
        }
    }
}

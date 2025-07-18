package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rao implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ rap a;
    private final AtomicReference b;

    public rao(rap rapVar, View view) {
        this.a = rapVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler handlerA = uea.a();
            final rap rapVar = this.a;
            handlerA.postAtFrontOfQueue(new Runnable() { // from class: ram
                @Override // java.lang.Runnable
                public final void run() {
                    uea.c();
                    raq raqVar = rapVar.b;
                    if (raqVar.k != null) {
                        return;
                    }
                    raqVar.k = qvf.c();
                }
            });
            uea.a().post(new Runnable() { // from class: ran
                @Override // java.lang.Runnable
                public final void run() {
                    uea.c();
                    raq raqVar = rapVar.b;
                    if (raqVar.j != null) {
                        return;
                    }
                    raqVar.j = qvf.c();
                }
            });
            return true;
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
            return true;
        }
    }
}

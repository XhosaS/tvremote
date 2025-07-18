package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tp implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable a;
    final /* synthetic */ tt b;
    private final long c = SystemClock.uptimeMillis() + 10000;
    private boolean d;

    public tp(tt ttVar) {
        this.b = ttVar;
    }

    public final void a(View view) {
        if (this.d) {
            return;
        }
        this.d = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
        View decorView = this.b.getWindow().getDecorView();
        decorView.getClass();
        if (!this.d) {
            decorView.postOnAnimation(new Runnable() { // from class: to
                @Override // java.lang.Runnable
                public final void run() {
                    tp tpVar = this.a;
                    Runnable runnable2 = tpVar.a;
                    if (runnable2 != null) {
                        runnable2.run();
                        tpVar.a = null;
                    }
                }
            });
        } else if (agvy.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.a;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.c) {
                this.d = false;
                this.b.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.a = null;
        uc ucVarDb = this.b.db();
        synchronized (ucVarDb.a) {
            z = ucVarDb.b;
        }
        if (z) {
            this.d = false;
            this.b.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

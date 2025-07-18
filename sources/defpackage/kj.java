package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kj implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable a;
    final /* synthetic */ kk b;
    private final long c = SystemClock.uptimeMillis() + 10000;
    private boolean d;

    public kj(kk kkVar) {
        this.b = kkVar;
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
            decorView.postOnAnimation(new ki(this, 0));
        } else if (dnx.aB(Looper.myLooper(), Looper.getMainLooper())) {
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
        bao baoVarL = this.b.l();
        synchronized (baoVarL.c) {
            z = baoVarL.b;
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

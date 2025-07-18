package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class om implements Runnable {
    private final /* synthetic */ int a;

    public om(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        if (i != 4) {
            if (i == 6) {
                System.exit(0);
                return;
            } else {
                if (i == 7) {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
                return;
            }
        }
        try {
            Thread.sleep(Math.max(0L, 600000L));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            synchronized (aog.class) {
                Thread thread = aog.b;
                if (thread != null && thread.isAlive()) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Not restarting process", e);
                    return;
                }
            }
        }
        aog.b();
    }
}

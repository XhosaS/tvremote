package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaaq {
    final aabe a;
    final Executor b;
    final Executor c;
    final /* synthetic */ aaas d;

    public aaaq(aaas aaasVar, UrlRequest.Callback callback, Executor executor) {
        this.d = aaasVar;
        this.a = new aabe(callback);
        if (aaasVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new ia(executor, 5);
            this.c = executor;
        }
    }

    public final void a(aaat aaatVar, String str) {
        try {
            b(new xxl(this.d, aaatVar, 18, (char[]) null), str);
        } catch (RejectedExecutionException e) {
            this.d.b(new zzr("Exception posting task to executor", e));
        }
    }

    final void b(Runnable runnable, String str) {
        new zyg("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str), 0);
        try {
            this.b.execute(new aaan(str, runnable, 2));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.d.d(new aaal(this, 3), "maybeReportMetrics");
    }

    final void d() {
        a(new aaag(this, 5), "onResponseStarted");
    }
}

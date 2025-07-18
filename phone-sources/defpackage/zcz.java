package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcz implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ zdc b;
    private final hau c;

    public zcz(zdc zdcVar, hau hauVar) {
        this.b = zdcVar;
        this.c = hauVar;
    }

    public final String a() {
        return this.b.b.a.c;
    }

    public final void b(ExecutorService executorService) {
        byte[] bArr = zcr.a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                zdc zdcVar = this.b;
                zdcVar.a(interruptedIOException);
                this.c.b(zdcVar, interruptedIOException);
                this.b.a.c.c(this);
            }
        } catch (Throwable th) {
            this.b.a.c.c(this);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zbx zbxVar;
        zdc zdcVar = this.b;
        String strConcat = "OkHttp ".concat(zdcVar.b());
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            zdcVar.e.e();
            boolean z = false;
            try {
                try {
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.c.a.resumeWith(zdcVar.d());
                    zbxVar = zdcVar.a.c;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        zfo zfoVar = zfo.b;
                        String str = true != zdcVar.l ? "" : "canceled ";
                        zfoVar.k(a.cr(str + "call to " + zdcVar.b(), "Callback failure for "), 4, e);
                    } else {
                        this.c.b(zdcVar, e);
                    }
                    zbxVar = zdcVar.a.c;
                    zbxVar.c(this);
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    zdcVar.g();
                    if (!z) {
                        IOException iOException = new IOException(a.cm(th, "canceled due to "));
                        ybn.h(iOException, th);
                        this.c.b(zdcVar, iOException);
                    }
                    throw th;
                }
                zbxVar.c(this);
            } catch (Throwable th3) {
                zdcVar.a.c.c(this);
                throw th3;
            }
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}

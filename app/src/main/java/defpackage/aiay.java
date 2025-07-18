package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aiay extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final Executor b;
    public final aict c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    private final Executor h;

    public aiay(Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.h = new aiax(this, executor);
        this.b = executor2;
        this.c = new aict(uploadDataProvider);
    }

    private final void j(final Runnable runnable, final String str) {
        new ahya("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: aiav
                @Override // java.lang.Runnable
                public final void run() {
                    new ahya("JavaUploadDataSinkBase#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
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
            });
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

    protected abstract int a(ByteBuffer byteBuffer);

    protected abstract Runnable b(aicg aicgVar);

    protected abstract Runnable c(aicg aicgVar);

    public final void d(final aicg aicgVar, final String str) {
        try {
            new ahya(a.j(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "));
            try {
                this.h.execute(new Runnable() { // from class: aias
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ahya("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str + " running callback");
                        try {
                            this.a.c(aicgVar).run();
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
                });
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    protected abstract void e();

    protected abstract void f();

    protected abstract void g(Throwable th);

    public final void h() {
        d(new aicg() { // from class: aiat
            @Override // defpackage.aicg
            public final void a() {
                final aiay aiayVar = this.a;
                aiayVar.c.a.read(aiayVar, aiayVar.d);
                aiayVar.b.execute(new Runnable() { // from class: aiaq
                    @Override // java.lang.Runnable
                    public final void run() {
                        aiayVar.g++;
                    }
                });
            }
        }, "readFromProvider");
    }

    public final void i() {
        j(b(new aicg() { // from class: aiau
            @Override // defpackage.aicg
            public final void a() {
                aiay aiayVar = this.a;
                aiayVar.f();
                aiayVar.a.set(0);
                aiayVar.h();
            }
        }), "startRead");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(final boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            j(b(new aicg() { // from class: aiaw
                @Override // defpackage.aicg
                public final void a() {
                    aiay aiayVar = this.a;
                    long j = aiayVar.e;
                    if (j != -1 && j - aiayVar.f < aiayVar.d.remaining()) {
                        aiayVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(aiayVar.f + aiayVar.d.remaining()), Long.valueOf(aiayVar.e))));
                        return;
                    }
                    boolean z2 = z;
                    if (aiayVar.d.remaining() == 0 && !z2) {
                        aiayVar.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                        return;
                    }
                    long jA = aiayVar.f + aiayVar.a(aiayVar.d);
                    aiayVar.f = jA;
                    long j2 = aiayVar.e;
                    if (jA >= j2) {
                        if (j2 == -1) {
                            if (z2) {
                                j2 = -1;
                            }
                        }
                        if (j2 == -1) {
                            aiayVar.e();
                            return;
                        } else if (j2 == jA) {
                            aiayVar.e();
                            return;
                        } else {
                            aiayVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(aiayVar.f), Long.valueOf(aiayVar.e))));
                            return;
                        }
                    }
                    aiayVar.a.set(0);
                    aiayVar.h();
                }
            }), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            i();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}

package defpackage;

import android.os.Trace;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaai extends UploadDataSink {
    public final Executor b;
    public final aabd c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    public final /* synthetic */ aaas k;
    private final Executor l;
    public final AtomicInteger a = new AtomicInteger(3);
    private final AtomicBoolean m = new AtomicBoolean(false);

    public aaai(aaas aaasVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, aabd aabdVar) {
        this.k = aaasVar;
        this.l = new max(this, executor, 3);
        this.b = executor2;
        this.c = new aabd(aabdVar);
        this.h = httpURLConnection;
    }

    private final void h(Runnable runnable, String str) {
        new zyg("JavaUploadDataSinkBase#executeOnExecutor ".concat(str), 0);
        try {
            this.b.execute(new xxl(str, runnable, 14, (short[]) null));
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

    public final void a(aaat aaatVar, String str) {
        try {
            new zyg(a.cr(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "), 0);
            try {
                this.l.execute(new rvp(this, str, aaatVar, 20));
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    public final void b() {
        a(new aaag(this, 1), "readFromProvider");
    }

    public final void c() {
        h(d(new aaag(this, 0)), "startRead");
    }

    protected final Runnable d(aaat aaatVar) {
        return new xxl(this.k, aaatVar, 16, (char[]) null);
    }

    public final void e() {
        if (this.i == null || !this.m.compareAndSet(false, true)) {
            return;
        }
        this.i.close();
    }

    protected final void f() {
        e();
        this.k.g();
    }

    public final void g(Throwable th) {
        this.k.c(th);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            h(d(new aaah(this, z, 0)), "onReadSucceeded");
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
            c();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}

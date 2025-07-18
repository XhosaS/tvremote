package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvx implements Runnable, wwt {
    public wwq a;
    private wwq b;
    private final boolean c = uea.d(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public wvx(wwq wwqVar, boolean z) {
        this.f = false;
        this.a = wwqVar;
        this.b = wwqVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        this.a.p(this.c && !this.e && uea.d(Thread.currentThread()));
        this.a = null;
    }

    public final void a(zyd zydVar) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.t();
        zydVar.d(this, zwk.a);
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wwq wwqVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (wwqVar != null) {
                wwqVar.close();
            }
            if (this.f) {
                wum.g(wum.c(), wvs.a);
            }
        } catch (Throwable th) {
            if (wwqVar != null) {
                try {
                    wwqVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && this.e) {
            b();
        } else {
            uea.a().post(new Runnable() { // from class: wvw
                @Override // java.lang.Runnable
                public final void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            });
        }
    }
}

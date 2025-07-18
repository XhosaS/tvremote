package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tql implements Runnable, tqu {
    private tqt a;
    private final boolean b = sjl.h(Thread.currentThread());
    private boolean c;
    private boolean d;
    private boolean e;

    public tql(tqt tqtVar, boolean z) {
        this.e = false;
        this.a = tqtVar;
        this.e = z;
    }

    private final void b() {
        this.c = true;
        if (!this.b || this.d) {
            return;
        }
        sjl.g();
    }

    public final void a(uhp uhpVar) {
        if (this.c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.d = true;
        uhpVar.c(this, ugk.a);
    }

    @Override // defpackage.tqu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tqt tqtVar = this.a;
        try {
            this.a = null;
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (tqtVar != null) {
                tqtVar.close();
            }
            if (this.e) {
                tqg.e(tqg.d(), tqk.a);
            }
        } catch (Throwable th) {
            if (tqtVar != null) {
                try {
                    tqtVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c || !this.d) {
            sjl.e(new ehq(18));
        } else {
            b();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxb implements Runnable, bxl {
    private bxk a;
    private final boolean b = bej.d(Thread.currentThread());
    private boolean c;
    private boolean d;
    private boolean e;

    public bxb(bxk bxkVar, boolean z) {
        this.e = false;
        this.a = bxkVar;
        this.e = z;
    }

    private final void b() {
        this.c = true;
        if (!this.b || this.d) {
            return;
        }
        bej.c();
    }

    public final void a(cja cjaVar) {
        if (this.c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.d = true;
        cjaVar.m(this, chz.a);
    }

    @Override // defpackage.bxl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bxk bxkVar = this.a;
        try {
            this.a = null;
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (bxkVar != null) {
                bxkVar.close();
            }
            if (this.e) {
                bwv.c(bwv.a(), bxa.a);
            }
        } catch (Throwable th) {
            if (bxkVar != null) {
                try {
                    bxkVar.close();
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
            bej.b(new om(7));
        } else {
            b();
        }
    }
}

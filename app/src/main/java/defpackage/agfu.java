package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agfu implements Runnable, aggi {
    final Runnable a;
    final agfw b;
    volatile boolean c;

    public agfu(Runnable runnable, agfw agfwVar) {
        this.a = runnable;
        this.b = agfwVar;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            aggq.a(th);
            this.b.dispose();
            throw agnx.a(th);
        }
    }
}

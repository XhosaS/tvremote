package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agft implements Runnable, aggi {
    final Runnable a;
    final agfw b;
    Thread c;

    public agft(Runnable runnable, agfw agfwVar) {
        this.a = runnable;
        this.b = agfwVar;
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            agfw agfwVar = this.b;
            if (agfwVar instanceof agmy) {
                agmy agmyVar = (agmy) agfwVar;
                if (agmyVar.c) {
                    return;
                }
                agmyVar.c = true;
                agmyVar.b.shutdown();
                return;
            }
        }
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            dispose();
            this.c = null;
        }
    }
}

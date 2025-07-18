package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyc implements Runnable {
    final /* synthetic */ wwt a;
    final /* synthetic */ Runnable b;

    public wyc(wwt wwtVar, Runnable runnable) {
        this.a = wwtVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [wwq, wwt] */
    @Override // java.lang.Runnable
    public final void run() {
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

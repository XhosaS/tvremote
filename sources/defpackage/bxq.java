package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxq implements Runnable {
    final /* synthetic */ cum a;
    final /* synthetic */ bxk b;
    final /* synthetic */ Runnable c;

    public bxq(cum cumVar, bxk bxkVar, Runnable runnable) {
        this.a = cumVar;
        this.b = bxkVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((bxs) this.a.a) != null) {
            throw null;
        }
        bxk bxkVar = this.b;
        Runnable runnable = this.c;
        bxk bxkVarC = bwv.c(bwv.a(), bxkVar);
        try {
            runnable.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.c + "]";
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wym implements Runnable {
    final /* synthetic */ agwh a;
    final /* synthetic */ wwq b;
    final /* synthetic */ Runnable c;

    public wym(agwh agwhVar, wwq wwqVar, Runnable runnable) {
        this.a = agwhVar;
        this.b = wwqVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((wzs) this.a.a) != null) {
            throw null;
        }
        wwq wwqVar = this.b;
        Runnable runnable = this.c;
        wwq wwqVarG = wum.g(wum.c(), wwqVar);
        try {
            runnable.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.c + "]";
    }
}

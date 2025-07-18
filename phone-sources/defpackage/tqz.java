package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqz implements Runnable {
    final /* synthetic */ tqu a;
    final /* synthetic */ Runnable b;

    public tqz(tqu tquVar, Runnable runnable) {
        this.a = tquVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [tqt, tqu] */
    @Override // java.lang.Runnable
    public final void run() {
        tqt tqtVarE = tqg.e(tqg.d(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

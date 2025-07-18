package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyg implements Runnable {
    final /* synthetic */ wwq a;
    final /* synthetic */ Runnable b;

    public wyg(wwq wwqVar, Runnable runnable) {
        this.a = wwqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wwl wwlVarC = wum.c();
        wwq wwqVar = wwlVarC.d;
        wwlVarC.d = this.a;
        try {
            this.b.run();
        } finally {
        }
    }
}

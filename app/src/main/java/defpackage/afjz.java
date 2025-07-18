package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afjz implements Runnable {
    final /* synthetic */ afka a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ afkc c;

    public afjz(afkc afkcVar, afka afkaVar, Runnable runnable) {
        this.a = afkaVar;
        this.b = runnable;
        this.c = afkcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afkc afkcVar = this.c;
        afkcVar.c(this.a);
        afkcVar.b();
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}

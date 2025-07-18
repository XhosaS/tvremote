package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ahc b;

    public ahb(ahc ahcVar, int i) {
        this.a = i;
        this.b = ahcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k(this.a);
    }
}

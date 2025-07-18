package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kgn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ kgq b;

    public kgn(kgq kgqVar, int i) {
        this.a = i;
        this.b = kgqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k(this.a);
    }
}

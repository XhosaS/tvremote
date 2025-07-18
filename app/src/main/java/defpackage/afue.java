package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afue implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ afug b;

    public afue(afug afugVar, Runnable runnable) {
        this.a = runnable;
        this.b = afugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        afug afugVar = this.b;
        afuf afufVar = new afuf(afugVar);
        afkc afkcVar = afugVar.f.c.m;
        afkcVar.c(afufVar);
        afkcVar.b();
    }
}

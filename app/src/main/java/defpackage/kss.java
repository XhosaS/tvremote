package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class kss implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ kst b;

    public kss(kst kstVar, long j) {
        this.a = j;
        this.b = kstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a);
    }
}

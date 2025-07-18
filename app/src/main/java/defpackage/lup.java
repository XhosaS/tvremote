package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lup implements Runnable {
    final /* synthetic */ luq a;

    public lup(luq luqVar) {
        this.a = luqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        luq luqVar = this.a;
        synchronized (luqVar.a) {
            luqVar.b.b();
        }
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bcs implements Runnable {
    final /* synthetic */ bcw a;

    public bcs(bcw bcwVar) {
        this.a = bcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        bcw bcwVar = this.a;
        synchronized (bcwVar.b) {
            obj = bcwVar.g;
            bcwVar.g = bcw.a;
        }
        this.a.g(obj);
    }
}

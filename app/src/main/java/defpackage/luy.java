package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class luy implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ luz b;

    public luy(luz luzVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = luzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        luz luzVar = this.b;
        synchronized (luzVar.a) {
            luzVar.b.d(this.a.e());
        }
    }
}

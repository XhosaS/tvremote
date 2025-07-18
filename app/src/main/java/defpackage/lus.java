package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lus implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ lut b;

    public lus(lut lutVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = lutVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lut lutVar = this.b;
        synchronized (lutVar.a) {
            lutVar.b.a(this.a);
        }
    }
}

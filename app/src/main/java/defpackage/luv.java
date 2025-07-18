package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class luv implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ luw b;

    public luv(luw luwVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = luwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        luw luwVar = this.b;
        synchronized (luwVar.a) {
            lux luxVar = luwVar.b;
            Exception excD = this.a.d();
            kkk.k(excD);
            luxVar.c(excD);
        }
    }
}

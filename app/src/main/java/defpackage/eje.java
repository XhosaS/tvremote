package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eje implements Runnable {
    final /* synthetic */ ejf a;

    public eje(ejf ejfVar) {
        this.a = ejfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ejt ejtVar = this.a.b;
        if (ejtVar == null || !ejtVar.a) {
            return;
        }
        ejtVar.j(false, false);
    }
}

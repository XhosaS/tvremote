package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class arf implements Runnable {
    final /* synthetic */ aqx a;
    final /* synthetic */ ari b;

    public arf(ari ariVar, aqx aqxVar) {
        this.b = ariVar;
        this.a = aqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ari ariVar = this.b;
        ariVar.e = this.a;
        ariVar.a();
    }
}

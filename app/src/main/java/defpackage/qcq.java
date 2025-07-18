package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qcq implements zxe {
    final /* synthetic */ zqi a;
    final /* synthetic */ long b;
    final /* synthetic */ qcr c;
    final /* synthetic */ int d;

    public qcq(qcr qcrVar, int i, zqi zqiVar, long j) {
        this.d = i;
        this.a = zqiVar;
        this.b = j;
        this.c = qcrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        qce.g(th, "%s: failure when sampling log!", "MddEventLogger");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        yqt yqtVar = (yqt) obj;
        if (yqtVar.g()) {
            this.c.q(this.d, this.a, this.b, (zrv) yqtVar.c());
        }
    }
}

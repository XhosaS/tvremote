package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scp implements duv {
    final /* synthetic */ scq a;

    public scp(scq scqVar) {
        this.a = scqVar;
    }

    @Override // defpackage.duv
    public final void k() {
        long j;
        scq scqVar = this.a;
        synchronized (scqVar) {
            j = scqVar.e;
        }
        if (j != 0) {
            this.a.g();
        }
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }
}

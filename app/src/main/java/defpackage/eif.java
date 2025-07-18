package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class eif implements dsm {
    final /* synthetic */ efn a;
    final /* synthetic */ eiz b;

    public eif(eiz eizVar, efn efnVar) {
        this.a = efnVar;
        this.b = eizVar;
    }

    @Override // defpackage.dsm
    public final void a(int i, int i2, boolean z) {
        efn efnVar = this.a;
        if (efnVar.a() == i2) {
            return;
        }
        efnVar.k(i2);
        eiz eizVar = this.b;
        int iT = eizVar.t();
        if (iT == -1 || efnVar.a() != iT) {
            synchronized (eizVar) {
                eizVar.O(i);
                eizVar.N();
            }
        }
    }
}

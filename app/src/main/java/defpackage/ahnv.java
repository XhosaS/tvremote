package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnv implements luu {
    final /* synthetic */ ahap a;

    public ahnv(ahap ahapVar) {
        this.a = ahapVar;
    }

    @Override // defpackage.luu
    public final void a(lvf lvfVar) {
        Exception excD = lvfVar.d();
        if (excD != null) {
            this.a.e(agpl.a(excD));
        } else if (((lvn) lvfVar).a) {
            this.a.k(null);
        } else {
            this.a.e(lvfVar.e());
        }
    }
}

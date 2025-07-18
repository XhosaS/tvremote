package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pkm implements yjk {
    final /* synthetic */ pju a;
    final /* synthetic */ pju b;
    final /* synthetic */ yjz c;
    final /* synthetic */ int d;

    public pkm(pju pjuVar, pju pjuVar2, yjz yjzVar, int i) {
        this.a = pjuVar;
        this.b = pjuVar2;
        this.c = yjzVar;
        this.d = i;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        pju pjuVar = this.a;
        if (pjuVar == null) {
            this.b.c.i();
        } else {
            pju pjuVar2 = this.b;
            if (yks.e(pjuVar2.c.d(), pjuVar)) {
                pjuVar.c.j(pjuVar2);
            } else {
                this.c.a(Integer.valueOf(this.d), "CVE is already removed from parent");
            }
        }
        return ygi.a;
    }
}
